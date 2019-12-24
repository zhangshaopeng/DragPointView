package com.shaopeng.app.tools;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;

import com.shaopeng.app.demo.R;


/**
 * p>@Describe:气泡消失动画
 * p>@Company:
 * p>@Author:Zhangshaopeng
 * p>@github:https://github.com/zhangshaopeng
 * p>@Data:2019/12/24.
 */
public class DragPointAnimType {
    /**
     * 爆炸消失
     *
     * @param context
     * @param exitDuration  离开时间的时长  300
     * @param enterDuration 进入时间的时长  100
     * @param duration      时间间隔        100
     * @return
     */
    public static AnimationDrawable getAnimExplode(Context context, int exitDuration, int enterDuration, int duration) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(context.getResources().getDrawable(R.mipmap.explode1), duration);
        animationDrawable.addFrame(context.getResources().getDrawable(R.mipmap.explode2), duration);
        animationDrawable.addFrame(context.getResources().getDrawable(R.mipmap.explode3), duration);
        animationDrawable.addFrame(context.getResources().getDrawable(R.mipmap.explode4), duration);
        animationDrawable.addFrame(context.getResources().getDrawable(R.mipmap.explode5), duration);
        animationDrawable.setOneShot(true);
        animationDrawable.setExitFadeDuration(exitDuration);
        animationDrawable.setEnterFadeDuration(enterDuration);
        return animationDrawable;
    }

    /**
     * 变小消失
     *
     * @param duration
     * @return
     */
    public static AnimatorSet getAnimScale(int duration) {
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(null, "scaleX", 1.f, 0.f);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(null, "scaleY", 1.f, 0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(objectAnimator1, objectAnimator2);
        return animatorSet;
    }

    /**
     * 渐没消失
     *
     * @param duration
     * @return
     */
    public static ObjectAnimator getAnimAlpha(int duration) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(null, "alpha", 1.f, 0.f);
        objectAnimator.setDuration(2000L);
        return objectAnimator;
    }
}
