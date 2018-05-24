package com.example.lancer.mvp_news.View;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lancer on 2018/4/10.
 */

public class TextPathView extends View {
    //文字装载路径、文字绘画路径、画笔特效路径
    protected Path mFontPath = new Path(), mDst = new Path(), mPaintPath = new Path();
    //属性动画
    protected ValueAnimator mAnimator;
    //动画进度值
    protected float mAnimatorValue = 0;
    //绘画部分长度
    protected float mStop = 0;
    //是否展示画笔
    protected boolean showPainter = false, canShowPainter = false;
    //当前绘画位置
    protected float[] mCurPos = new float[2];
    public TextPathView(Context context) {
        super(context);
    }

    public TextPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
