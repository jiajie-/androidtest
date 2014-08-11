package com.example.androidtest;

import com.example.effects.BaseEffects;
import com.example.effects.FadeIn;
import com.example.effects.Fall;
import com.example.effects.FlipH;
import com.example.effects.FlipV;
import com.example.effects.NewsPaper;
import com.example.effects.RotateLeft;
import com.example.effects.Shake;
import com.example.effects.SideFall;
import com.example.effects.RotateBottom;
import com.example.effects.SlideBottom;
import com.example.effects.SlideLeft;
import com.example.effects.SlideRight;
import com.example.effects.SlideTop;
import com.example.effects.Slit;

/**
 * Created by lee on 2014/7/30.
 */
public enum  Effectstype {

    Fadein(FadeIn.class),
    Slideleft(SlideLeft.class),
    Slidetop(SlideTop.class),
    SlideBottom(SlideBottom.class),
    Slideright(SlideRight.class),
    Fall(Fall.class),
    Newspager(NewsPaper.class),
    Fliph(FlipH.class),
    Flipv(FlipV.class),
    RotateBottom(RotateBottom.class),
    RotateLeft(RotateLeft.class),
    Slit(Slit.class),
    Shake(Shake.class),
    Sidefill(SideFall.class);
    private Class effectsClazz;

    private Effectstype(Class mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        try {
            return (BaseEffects) effectsClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
