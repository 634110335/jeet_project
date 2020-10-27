package com.example.jeet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TagLayout extends ViewGroup {
    private List<List<View>> mChildViews = new ArrayList<>();
    public TagLayout(Context context) {
        super(context);
    }

    public TagLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TagLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //for所有子View
        int childCount = getChildCount();
        //获取到自己的宽度
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = getPaddingTop() + getBottom();
        int lineWidth = getPaddingLeft();

        ArrayList<View> childViews = new ArrayList<>();
        mChildViews.add(childViews);
        for (int i = 0; i <childCount ; i++) {
            View childAt = getChildAt(i);
            //這個方法走完才有寬高
            measureChild(childAt,widthMeasureSpec,heightMeasureSpec);
            //根据子view计算和指定自己的宽高
            //什么时候需要换行,一行不够的情况下
            if (lineWidth + childAt.getMeasuredWidth() > width){
                //换行，累加高度
                height += childAt.getMeasuredHeight();
                lineWidth = 0;
                childViews = new ArrayList<>();
                mChildViews.add(childViews);
            }else {
                lineWidth += childAt.getMeasuredWidth();
                childViews.add(childAt);
            }
        }
        //设置自己的宽高
        setMeasuredDimension(width,height);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
            int childCount = getChildCount();
            int left,top = getPaddingTop(),right,bottom;
        for (List<View> childView : mChildViews) {
            left = getPaddingLeft();
            for (View view : childView) {
                right = left + view.getMeasuredWidth();
                bottom = top + view.getMeasuredHeight();
                view.layout(left,top,right,bottom);
                left += view.getMeasuredWidth();
            }
            top += childView.get(0).getMeasuredHeight();
        }
    }
}
