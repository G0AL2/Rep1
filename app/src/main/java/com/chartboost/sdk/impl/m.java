package com.chartboost.sdk.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.chartboost.sdk.Libraries.CBLogging;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f14175a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14176a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14177b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.chartboost.sdk.Model.c f14178c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f14179d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f14180e;

        a(View view, int i10, com.chartboost.sdk.Model.c cVar, Runnable runnable, boolean z10) {
            this.f14176a = view;
            this.f14177b = i10;
            this.f14178c = cVar;
            this.f14179d = runnable;
            this.f14180e = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f14176a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            m.this.a(this.f14177b, this.f14178c, this.f14179d, this.f14180e);
        }
    }

    public m(Handler handler) {
        this.f14175a = handler;
    }

    public static Integer a(int i10) {
        if (i10 < 1 || i10 > 9) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public void a(int i10, com.chartboost.sdk.Model.c cVar, Runnable runnable, com.chartboost.sdk.c cVar2) {
        a(i10, cVar, runnable, true, cVar2);
    }

    public void a(int i10, com.chartboost.sdk.Model.c cVar, Runnable runnable) {
        a(i10, cVar, runnable, false);
    }

    private void a(int i10, com.chartboost.sdk.Model.c cVar, Runnable runnable, boolean z10, com.chartboost.sdk.c cVar2) {
        f2 f2Var;
        if (i10 == 7) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (cVar != null && (f2Var = cVar.f13706w) != null) {
            View b10 = f2Var.b();
            if (b10 == null) {
                cVar2.e(cVar);
                CBLogging.a("AnimationManager", "Transition of impression canceled due to lack of view");
                return;
            }
            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new a(b10, i10, cVar, runnable, z10));
            }
        } else {
            CBLogging.a("AnimationManager", "Transition of impression canceled due to lack of container");
        }
    }

    void a(int i10, com.chartboost.sdk.Model.c cVar, Runnable runnable, boolean z10) {
        f2 f2Var;
        r1 r1Var;
        ScaleAnimation scaleAnimation;
        TranslateAnimation translateAnimation;
        float f10;
        r1 r1Var2;
        ScaleAnimation scaleAnimation2;
        TranslateAnimation translateAnimation2;
        AlphaAnimation alphaAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 1.0f));
        if (cVar != null && (f2Var = cVar.f13706w) != null) {
            View b10 = f2Var.b();
            if (b10 == null) {
                if (runnable != null) {
                    runnable.run();
                }
                CBLogging.a("AnimationManager", "Transition of impression canceled due to lack of view");
                return;
            }
            int i11 = cVar.f13684a;
            if (i11 == 2 || i11 == 1) {
                b10 = cVar.f13706w;
            }
            float width = b10.getWidth();
            float height = b10.getHeight();
            switch (i10) {
                case 1:
                    if (z10) {
                        r1Var = new r1(-60.0f, 0.0f, width / 2.0f, height / 2.0f, true);
                    } else {
                        r1Var = new r1(0.0f, 60.0f, width / 2.0f, height / 2.0f, true);
                    }
                    r1Var.setDuration(500L);
                    r1Var.setFillAfter(true);
                    animationSet.addAnimation(r1Var);
                    if (z10) {
                        scaleAnimation = new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f);
                    } else {
                        scaleAnimation = new ScaleAnimation(1.0f, 0.4f, 1.0f, 0.4f);
                    }
                    scaleAnimation.setDuration(500L);
                    scaleAnimation.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation);
                    if (z10) {
                        translateAnimation = new TranslateAnimation((-width) * 0.4f, 0.0f, height * 0.3f, 0.0f);
                    } else {
                        translateAnimation = new TranslateAnimation(0.0f, width, 0.0f, height * 0.3f);
                    }
                    translateAnimation.setDuration(500L);
                    translateAnimation.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation);
                    break;
                case 2:
                    if (z10) {
                        ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.6f, 1.1f, 0.6f, 1.1f, 1, 0.5f, 1, 0.5f);
                        float f11 = 0.6f * ((float) 500);
                        scaleAnimation3.setDuration(Math.round(f11));
                        scaleAnimation3.setStartOffset(0L);
                        scaleAnimation3.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation3);
                        ScaleAnimation scaleAnimation4 = new ScaleAnimation(1.0f, 0.81818175f, 1.0f, 0.81818175f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation4.setDuration(Math.round(0.19999999f * f10));
                        scaleAnimation4.setStartOffset(Math.round(f11));
                        scaleAnimation4.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation4);
                        ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 1.1111112f, 1.0f, 1.1111112f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation5.setDuration(Math.round(0.099999964f * f10));
                        scaleAnimation5.setStartOffset(Math.round(f10 * 0.8f));
                        scaleAnimation5.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation5);
                        break;
                    } else {
                        ScaleAnimation scaleAnimation6 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                        scaleAnimation6.setDuration(500L);
                        scaleAnimation6.setStartOffset(0L);
                        scaleAnimation6.setFillAfter(true);
                        animationSet.addAnimation(scaleAnimation6);
                        break;
                    }
                case 3:
                    if (z10) {
                        r1Var2 = new r1(-60.0f, 0.0f, width / 2.0f, height / 2.0f, false);
                    } else {
                        r1Var2 = new r1(0.0f, 60.0f, width / 2.0f, height / 2.0f, false);
                    }
                    r1 r1Var3 = r1Var2;
                    r1Var3.setDuration(500L);
                    r1Var3.setFillAfter(true);
                    animationSet.addAnimation(r1Var3);
                    if (z10) {
                        scaleAnimation2 = new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f);
                    } else {
                        scaleAnimation2 = new ScaleAnimation(1.0f, 0.4f, 1.0f, 0.4f);
                    }
                    scaleAnimation2.setDuration(500L);
                    scaleAnimation2.setFillAfter(true);
                    animationSet.addAnimation(scaleAnimation2);
                    if (z10) {
                        translateAnimation2 = new TranslateAnimation(width * 0.3f, 0.0f, (-height) * 0.4f, 0.0f);
                    } else {
                        translateAnimation2 = new TranslateAnimation(0.0f, width * 0.3f, 0.0f, height);
                    }
                    translateAnimation2.setDuration(500L);
                    translateAnimation2.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation2);
                    break;
                case 4:
                    TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, z10 ? -height : 0.0f, z10 ? 0.0f : -height);
                    translateAnimation3.setDuration(500L);
                    translateAnimation3.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation3);
                    break;
                case 5:
                    float f12 = z10 ? height : 0.0f;
                    if (z10) {
                        height = 0.0f;
                    }
                    TranslateAnimation translateAnimation4 = new TranslateAnimation(0.0f, 0.0f, f12, height);
                    translateAnimation4.setDuration(500L);
                    translateAnimation4.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation4);
                    break;
                case 6:
                    if (z10) {
                        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    } else {
                        alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    }
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setFillAfter(true);
                    animationSet = new AnimationSet(true);
                    animationSet.addAnimation(alphaAnimation);
                    break;
                case 8:
                    float f13 = z10 ? width : 0.0f;
                    if (z10) {
                        width = 0.0f;
                    }
                    TranslateAnimation translateAnimation5 = new TranslateAnimation(f13, width, 0.0f, 0.0f);
                    translateAnimation5.setDuration(500L);
                    translateAnimation5.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation5);
                    break;
                case 9:
                    TranslateAnimation translateAnimation6 = new TranslateAnimation(z10 ? -width : 0.0f, z10 ? 0.0f : -width, 0.0f, 0.0f);
                    translateAnimation6.setDuration(500L);
                    translateAnimation6.setFillAfter(true);
                    animationSet.addAnimation(translateAnimation6);
                    break;
            }
            if (i10 == 7) {
                if (runnable != null) {
                    runnable.run();
                }
                return;
            }
            if (runnable != null) {
                this.f14175a.postDelayed(runnable, 500L);
            }
            b10.startAnimation(animationSet);
            return;
        }
        CBLogging.a("AnimationManager", "Transition of impression canceled due to lack of container");
        if (runnable != null) {
            runnable.run();
        }
    }
}
