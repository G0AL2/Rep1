package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseAnimation.java */
/* loaded from: classes.dex */
public abstract class d implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c {

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.b.a f9508b;

    /* renamed from: c  reason: collision with root package name */
    public View f9509c;

    /* renamed from: d  reason: collision with root package name */
    private Set<ScheduledFuture<?>> f9510d = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public List<ObjectAnimator> f9507a = a();

    /* compiled from: BaseAnimation.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ObjectAnimator f9515a;

        /* renamed from: b  reason: collision with root package name */
        ScheduledFuture<?> f9516b;

        a(ObjectAnimator objectAnimator) {
            this.f9515a = objectAnimator;
        }

        public void a(ScheduledFuture<?> scheduledFuture) {
            this.f9516b = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT < 19 || com.bytedance.sdk.component.adexpress.a.a.a.a().c() == null) {
                return;
            }
            com.bytedance.sdk.component.adexpress.a.a.a.a().c().c().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d.a.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f9515a.resume();
                }
            });
            if (this.f9516b != null) {
                d.this.f9510d.remove(this.f9516b);
            }
        }
    }

    public d(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        this.f9509c = view;
        this.f9508b = aVar;
    }

    abstract List<ObjectAnimator> a();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c
    public void b() {
        List<ObjectAnimator> list = this.f9507a;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        for (ScheduledFuture<?> scheduledFuture : this.f9510d) {
            scheduledFuture.cancel(true);
        }
    }

    public void c() {
        if ("translate".equals(this.f9508b.h()) || "fade".equals(this.f9508b.h())) {
            this.f9509c.setVisibility(4);
        }
        List<ObjectAnimator> list = this.f9507a;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f9508b.p() > 0.0d && Build.VERSION.SDK_INT >= 19) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        a aVar = new a(objectAnimator);
                        ScheduledFuture<?> schedule = com.bytedance.sdk.component.f.e.d().schedule(aVar, (long) (d.this.f9508b.p() * 1000.0d), TimeUnit.MILLISECONDS);
                        aVar.a(schedule);
                        d.this.f9510d.add(schedule);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectAnimator a(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f9508b.m() * 1000.0d));
        if (this.f9508b.n() > 0) {
            objectAnimator.setRepeatCount(this.f9508b.n() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f9508b.o())) {
            if (!"reverse".equals(this.f9508b.o()) && !"alternate".equals(this.f9508b.o())) {
                objectAnimator.setRepeatMode(1);
            } else {
                objectAnimator.setRepeatMode(2);
            }
        }
        if ("ease-in-out".equals(this.f9508b.l())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f9508b.o())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f9508b.o())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    d.this.f9509c.setVisibility(0);
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
