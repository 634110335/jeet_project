package com.example.jeet;

import android.content.Context;
import android.util.Log;

import java.lang.reflect.Field;

public class UIUtils {
    private Context mContext;
    private static UIUtils instance;
    //需要反射得到状态栏的高度
    private static final String DIME_CLASS = "com.android.internal.R$dimen";

    //标准值
    private static final float STANDRO_WIDTH = 1080F;
    private static final float STANDRO_HIGHT = 1920F;

    //实际值（机器）
    private static  float dispalyMetricsWidth;
    private static  float dispalyMetricsHeight;

    public static UIUtils getInstance(Context context){
        if (instance == null){
            synchronized (UIUtils.class){
                if (instance == null){
                    instance = new UIUtils(context);
                }

            }
        }
        return instance;
    }
    private UIUtils(Context context){
        this.mContext = context;
      /*  //窗口管理器
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //可以得到机器的宽和高
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (dispalyMetricsWidth == 0.0f || dispalyMetricsHeight == 0.0f){
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            //需要得到状态栏的高度
           int systemBarHeight  = getSystemBarHeight(mContext);

           if (displayMetrics.widthPixels > displayMetrics.heightPixels){
               //就是一个横屏
               dispalyMetricsWidth = (float) displayMetrics.heightPixels;
               dispalyMetricsHeight = (float)displayMetrics.widthPixels - systemBarHeight;
           }else {
               //就是一个竖屏
               dispalyMetricsWidth = (float) displayMetrics.widthPixels;
               dispalyMetricsHeight = (float)displayMetrics.heightPixels - systemBarHeight;

           }
        }*/
    }

    private int getSystemBarHeight(Context context) {
        return getValue(context,DIME_CLASS,"status_bar_height",48);
    }

    private int getValue(Context context, String dimeClass, String system_bar_height, int i) {
        try{
            Class<?> aClass = Class.forName(dimeClass);
            Object object = aClass.newInstance();
            Field field = aClass.getField(system_bar_height);
            int id = 0;
            id = Integer.parseInt(field.get(object).toString());
            return context.getResources().getDimensionPixelOffset(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return i;
    }

    //缩放比
    public float getHorAValue(){
        float width = (float)SPUtils.get(mContext, "width", 0.0f) / STANDRO_WIDTH;
        Log.i("ss",width+"");
        return width;
    }

    public float getVarValue(){
        return (float) SPUtils.get(mContext,"height",0.0f) / (STANDRO_HIGHT - (int)SPUtils.get(mContext,"bar",0));
    }
}
