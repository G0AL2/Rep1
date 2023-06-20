package la;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import la.d;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: CircularRevealCompat.java */
    /* renamed from: la.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0442a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f34025a;

        C0442a(d dVar) {
            this.f34025a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f34025a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f34025a.a();
        }
    }

    public static Animator a(d dVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, (Property<d, V>) d.c.f34029a, (TypeEvaluator) d.b.f34027b, (Object[]) new d.e[]{new d.e(f10, f11, f12)});
        if (Build.VERSION.SDK_INT >= 21) {
            d.e revealInfo = dVar.getRevealInfo();
            if (revealInfo != null) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f10, (int) f11, revealInfo.f34033c, f12);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofObject, createCircularReveal);
                return animatorSet;
            }
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        return ofObject;
    }

    public static Animator.AnimatorListener b(d dVar) {
        return new C0442a(dVar);
    }
}
