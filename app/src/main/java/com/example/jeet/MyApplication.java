package com.example.jeet;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import java.lang.reflect.Field;

public class MyApplication extends Application {
    private Context mContext;
    //标准值
    private static final String DIME_CLASS = "com.android.internal.R$dimen";
    //实际值（机器）
    private static  float dispalyMetricsWidth;
    private static  float dispalyMetricsHeight;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        init();
    }

    private void init() {
        //窗口管理器
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        //可以得到机器的宽和高
        DisplayMetrics displayMetrics = new DisplayMetrics();
           /* windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            //需要得到状态栏的高度
            int systemBarHeight  = getSystemBarHeight(this);
            SPUtils.put(this,"bar",systemBarHeight);
            if (displayMetrics.widthPixels > displayMetrics.heightPixels){
                //就是一个横屏
                dispalyMetricsWidth = (float) displayMetrics.heightPixels;
                dispalyMetricsHeight = (float)displayMetrics.widthPixels - systemBarHeight;
            }else {
                //就是一个竖屏
                dispalyMetricsWidth = (float) displayMetrics.widthPixels;
                dispalyMetricsHeight = (float)displayMetrics.heightPixels - systemBarHeight;

            }*/
            if ((float)SPUtils.get(mContext, "width", 0.0f) == 0.0f || (float) SPUtils.get(mContext,"height",0.0f) == 0.0f){
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                //需要得到状态栏的高度
                int systemBarHeight  = getSystemBarHeight(this);
                SPUtils.put(this,"bar",systemBarHeight);
                if (displayMetrics.widthPixels > displayMetrics.heightPixels){
                    //就是一个横屏
                    dispalyMetricsWidth = (float) displayMetrics.heightPixels;
                    dispalyMetricsHeight = (float)displayMetrics.widthPixels - systemBarHeight;
                }else {
                    //就是一个竖屏
                    dispalyMetricsWidth = (float) displayMetrics.widthPixels;
                    dispalyMetricsHeight = (float)displayMetrics.heightPixels - systemBarHeight;

                }
                SPUtils.put(this,"width",dispalyMetricsWidth);
                SPUtils.put(this,"height",dispalyMetricsHeight);
            } else {
            System.out.println("dddd");
        }

    }
    private int getSystemBarHeight(Context context) {
        return getValue(context,DIME_CLASS,"status_bar_height",48);
    }

    private int getValue(Context context, String dimeClass, String system_bar_height, int i) {
        try{
            Class<?> aClass = Class.forName(dimeClass);
            Object object = aClass.newInstance();
            Field field = aClass.getField(system_bar_height);
            int id = Integer.parseInt(field.get(object).toString());
            return context.getResources().getDimensionPixelOffset(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }
}
