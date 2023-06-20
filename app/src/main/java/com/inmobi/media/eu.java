package com.inmobi.media;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.inmobi.media.cc;
import com.inmobi.media.ez;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: AnimationManager.java */
/* loaded from: classes3.dex */
public class eu {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25291b = "eu";

    /* renamed from: a  reason: collision with root package name */
    public List<a> f25292a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f25293c = false;

    /* compiled from: AnimationManager.java */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Animator f25300a;

        /* renamed from: b  reason: collision with root package name */
        long f25301b;

        /* renamed from: c  reason: collision with root package name */
        boolean f25302c;

        a(Animator animator) {
            this.f25300a = animator;
        }
    }

    private static void b(Animator animator, bt btVar) {
        animator.setDuration(0L);
        animator.setStartDelay(0L);
        cc g10 = btVar.f24811c.g();
        if (g10 != null) {
            cc.a aVar = g10.f24895a;
            cc.a aVar2 = g10.f24896b;
            if (aVar2 != null) {
                animator.setDuration(aVar2.a() * 1000);
            }
            if (aVar != null) {
                animator.setStartDelay(aVar.a() * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a> a(final View view, bt btVar) {
        float c10;
        float c11;
        float c12;
        float c13;
        LinkedList linkedList = new LinkedList();
        try {
            if (fl.c(btVar.f24811c.f24836c.x) != fl.c(btVar.f24811c.f24837d.x)) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat((int) c10, (int) c11);
                final ez.a aVar = (ez.a) view.getLayoutParams();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.inmobi.media.eu.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar.f25322a = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar);
                        view.requestLayout();
                    }
                });
                linkedList.add(a(ofFloat, btVar));
            }
            if (fl.c(btVar.f24811c.f24836c.y) != fl.c(btVar.f24811c.f24837d.y)) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat((int) c12, (int) c13);
                final ez.a aVar2 = (ez.a) view.getLayoutParams();
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.inmobi.media.eu.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar2.f25323b = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar2);
                        view.requestLayout();
                    }
                });
                linkedList.add(a(ofFloat2, btVar));
            }
            float c14 = fl.c(btVar.f24811c.f24834a.x);
            float c15 = fl.c(btVar.f24811c.f24835b.x);
            if (c14 != c15) {
                linkedList.add(a(a(view, "scaleX", c14, c15), btVar));
            }
            float c16 = fl.c(btVar.f24811c.f24834a.y);
            float c17 = fl.c(btVar.f24811c.f24835b.y);
            if (c16 != c17) {
                linkedList.add(a(a(view, "scaleY", c16, c17), btVar));
            }
        } catch (Exception unused) {
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    public final void b() {
        if (this.f25293c) {
            this.f25293c = false;
            for (a aVar : this.f25292a) {
                ValueAnimator valueAnimator = (ValueAnimator) aVar.f25300a;
                aVar.f25301b = valueAnimator.getCurrentPlayTime();
                if (valueAnimator.getAnimatedFraction() == 1.0d) {
                    aVar.f25302c = true;
                }
                valueAnimator.cancel();
            }
        }
    }

    private a a(Animator animator, bt btVar) {
        b(animator, btVar);
        return new a(animator);
    }

    private static Animator a(View view, String str, float f10, float f11) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return ObjectAnimator.ofFloat(view, str, f11 / f10);
    }

    public final void a() {
        if (this.f25293c) {
            return;
        }
        this.f25293c = true;
        a(this.f25292a);
    }

    public final void a(List<a> list) {
        if (list == null) {
            return;
        }
        for (a aVar : list) {
            if (!aVar.f25302c) {
                ValueAnimator valueAnimator = (ValueAnimator) aVar.f25300a;
                valueAnimator.setCurrentPlayTime(aVar.f25301b);
                valueAnimator.start();
            }
            if (!this.f25292a.contains(aVar)) {
                this.f25292a.add(aVar);
            }
        }
    }
}
