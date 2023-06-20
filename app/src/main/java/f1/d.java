package f1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public class d extends j0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f29964a;

        a(d dVar, View view) {
            this.f29964a = view;
        }

        @Override // f1.m.f
        public void d(m mVar) {
            c0.g(this.f29964a, 1.0f);
            c0.a(this.f29964a);
            mVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Fade.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f29965a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f29966b = false;

        b(View view) {
            this.f29965a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f29965a, 1.0f);
            if (this.f29966b) {
                this.f29965a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.z.Q(this.f29965a) && this.f29965a.getLayerType() == 0) {
                this.f29966b = true;
                this.f29965a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        j0(i10);
    }

    private Animator k0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f29963b, f11);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    private static float l0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f30062a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // f1.j0
    public Animator f0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float l02 = l0(sVar, 0.0f);
        return k0(view, l02 != 1.0f ? l02 : 0.0f, 1.0f);
    }

    @Override // f1.j0
    public Animator h0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return k0(view, l0(sVar, 1.0f), 0.0f);
    }

    @Override // f1.j0, f1.m
    public void j(s sVar) {
        super.j(sVar);
        sVar.f30062a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f30063b)));
    }
}
