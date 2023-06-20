package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f2662a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f2663b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f2664c = null;

    /* renamed from: d  reason: collision with root package name */
    int f2665d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0 f2666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2667b;

        a(e0 e0Var, f0 f0Var, View view) {
            this.f2666a = f0Var;
            this.f2667b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2666a.a(this.f2667b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2666a.b(this.f2667b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2666a.c(this.f2667b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f2668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2669b;

        b(e0 e0Var, h0 h0Var, View view) {
            this.f2668a = h0Var;
            this.f2669b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2668a.a(this.f2669b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    static class c implements f0 {

        /* renamed from: a  reason: collision with root package name */
        e0 f2670a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2671b;

        c(e0 e0Var) {
            this.f2670a = e0Var;
        }

        @Override // androidx.core.view.f0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            f0 f0Var = tag instanceof f0 ? (f0) tag : null;
            if (f0Var != null) {
                f0Var.a(view);
            }
        }

        @Override // androidx.core.view.f0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i10 = this.f2670a.f2665d;
            if (i10 > -1) {
                view.setLayerType(i10, null);
                this.f2670a.f2665d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f2671b) {
                e0 e0Var = this.f2670a;
                Runnable runnable = e0Var.f2664c;
                if (runnable != null) {
                    e0Var.f2664c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                f0 f0Var = tag instanceof f0 ? (f0) tag : null;
                if (f0Var != null) {
                    f0Var.b(view);
                }
                this.f2671b = true;
            }
        }

        @Override // androidx.core.view.f0
        public void c(View view) {
            this.f2671b = false;
            if (this.f2670a.f2665d > -1) {
                view.setLayerType(2, null);
            }
            e0 e0Var = this.f2670a;
            Runnable runnable = e0Var.f2663b;
            if (runnable != null) {
                e0Var.f2663b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            f0 f0Var = tag instanceof f0 ? (f0) tag : null;
            if (f0Var != null) {
                f0Var.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(View view) {
        this.f2662a = new WeakReference<>(view);
    }

    private void g(View view, f0 f0Var) {
        if (f0Var != null) {
            view.animate().setListener(new a(this, f0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public e0 a(float f10) {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f2662a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public e0 d(long j10) {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public e0 e(Interpolator interpolator) {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public e0 f(f0 f0Var) {
        View view = this.f2662a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, f0Var);
            } else {
                view.setTag(2113929216, f0Var);
                g(view, new c(this));
            }
        }
        return this;
    }

    public e0 h(long j10) {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public e0 i(h0 h0Var) {
        View view = this.f2662a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(h0Var != null ? new b(this, h0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public e0 k(float f10) {
        View view = this.f2662a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
