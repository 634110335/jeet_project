package com.example.jeet.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,2,0, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<Runnable>(3));
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        executorService1.execute(new TestThread());
        executorService1.execute(new Test02Thread());
    }
    public static class TestThread implements Runnable {
        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    i++;
                    Thread.sleep(7000);
                    System.out.println(Thread.currentThread().getName()+"22222");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Test02Thread implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName()+"333333");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
