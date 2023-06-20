package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.u;
import e0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3129a;

        a(Fragment fragment) {
            this.f3129a = fragment;
        }

        @Override // e0.b.a
        public void onCancel() {
            if (this.f3129a.getAnimatingAway() != null) {
                View animatingAway = this.f3129a.getAnimatingAway();
                this.f3129a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f3129a.setAnimator(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3131b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u.g f3132c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e0.b f3133d;

        /* compiled from: FragmentAnim.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f3131b.getAnimatingAway() != null) {
                    b.this.f3131b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f3132c.a(bVar.f3131b, bVar.f3133d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, u.g gVar, e0.b bVar) {
            this.f3130a = viewGroup;
            this.f3131b = fragment;
            this.f3132c = gVar;
            this.f3133d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3130a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f3137c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u.g f3138d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e0.b f3139e;

        c(ViewGroup viewGroup, View view, Fragment fragment, u.g gVar, e0.b bVar) {
            this.f3135a = viewGroup;
            this.f3136b = view;
            this.f3137c = fragment;
            this.f3138d = gVar;
            this.f3139e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3135a.endViewTransition(this.f3136b);
            Animator animator2 = this.f3137c.getAnimator();
            this.f3137c.setAnimator(null);
            if (animator2 == null || this.f3135a.indexOfChild(this.f3136b) >= 0) {
                return;
            }
            this.f3138d.a(this.f3137c, this.f3139e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, d dVar, u.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        e0.b bVar = new e0.b();
        bVar.d(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.f3140a != null) {
            RunnableC0060e runnableC0060e = new RunnableC0060e(dVar.f3140a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            runnableC0060e.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.mView.startAnimation(runnableC0060e);
            return;
        }
        Animator animator = dVar.f3141b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z10) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i10 = q0.b.f35763c;
            if (viewGroup.getTag(i10) != null) {
                fragment.mContainer.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, b10);
            if (onCreateAnimation != null) {
                return new d(onCreateAnimation);
            }
            Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, b10);
            if (onCreateAnimator != null) {
                return new d(onCreateAnimator);
            }
            if (b10 == 0 && nextTransition != 0) {
                b10 = d(nextTransition, z10);
            }
            if (b10 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z12 = true;
                    } catch (Resources.NotFoundException e10) {
                        throw e10;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z12) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e11) {
                        if (!equals) {
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                            if (loadAnimation2 != null) {
                                return new d(loadAnimation2);
                            }
                        } else {
                            throw e11;
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    private static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? q0.a.f35759e : q0.a.f35760f;
        } else if (i10 == 4099) {
            return z10 ? q0.a.f35757c : q0.a.f35758d;
        } else if (i10 != 8194) {
            return -1;
        } else {
            return z10 ? q0.a.f35755a : q0.a.f35756b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3140a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3141b;

        d(Animation animation) {
            this.f3140a = animation;
            this.f3141b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f3140a = null;
            this.f3141b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0060e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f3142a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3143b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3144c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3145d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3146e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RunnableC0060e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3146e = true;
            this.f3142a = viewGroup;
            this.f3143b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f3146e = true;
            if (this.f3144c) {
                return !this.f3145d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f3144c = true;
                androidx.core.view.v.a(this.f3142a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f3144c && this.f3146e) {
                this.f3146e = false;
                this.f3142a.post(this);
                return;
            }
            this.f3142a.endViewTransition(this.f3143b);
            this.f3145d = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3146e = true;
            if (this.f3144c) {
                return !this.f3145d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f3144c = true;
                androidx.core.view.v.a(this.f3142a, this);
            }
            return true;
        }
    }
}
