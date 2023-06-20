package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ha.f;
import ia.h;
import ia.i;
import ia.j;
import java.util.ArrayList;
import java.util.List;
import la.d;

/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f22738c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f22739d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f22740e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f22741f;

    /* renamed from: g  reason: collision with root package name */
    private float f22742g;

    /* renamed from: h  reason: collision with root package name */
    private float f22743h;

    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f22744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f22745b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f22746c;

        a(FabTransformationBehavior fabTransformationBehavior, boolean z10, View view, View view2) {
            this.f22744a = z10;
            this.f22745b = view;
            this.f22746c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f22744a) {
                return;
            }
            this.f22745b.setVisibility(4);
            this.f22746c.setAlpha(1.0f);
            this.f22746c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f22744a) {
                this.f22745b.setVisibility(0);
                this.f22746c.setAlpha(0.0f);
                this.f22746c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f22747a;

        b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f22747a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f22747a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ la.d f22748a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f22749b;

        c(FabTransformationBehavior fabTransformationBehavior, la.d dVar, Drawable drawable) {
            this.f22748a = dVar;
            this.f22749b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f22748a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f22748a.setCircularRevealOverlayDrawable(this.f22749b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ la.d f22750a;

        d(FabTransformationBehavior fabTransformationBehavior, la.d dVar) {
            this.f22750a = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f22750a.getRevealInfo();
            revealInfo.f34033c = Float.MAX_VALUE;
            this.f22750a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f22751a;

        /* renamed from: b  reason: collision with root package name */
        public j f22752b;
    }

    public FabTransformationBehavior() {
        this.f22738c = new Rect();
        this.f22739d = new RectF();
        this.f22740e = new RectF();
        this.f22741f = new int[2];
    }

    private ViewGroup K(View view) {
        View findViewById = view.findViewById(f.f31209p);
        if (findViewById != null) {
            return f0(findViewById);
        }
        if (!(view instanceof ya.b) && !(view instanceof ya.a)) {
            return f0(view);
        }
        return f0(((ViewGroup) view).getChildAt(0));
    }

    private void L(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float S = S(eVar, iVar, f10, f12);
        float S2 = S(eVar, iVar2, f11, f13);
        Rect rect = this.f22738c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f22739d;
        rectF2.set(rect);
        RectF rectF3 = this.f22740e;
        T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f22742g, this.f22743h);
    }

    private Pair<i, i> N(float f10, float f11, boolean z10, e eVar) {
        i e10;
        i e11;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            e10 = eVar.f22751a.e("translationXLinear");
            e11 = eVar.f22751a.e("translationYLinear");
        } else if ((z10 && f11 < 0.0f) || (!z10 && i10 > 0)) {
            e10 = eVar.f22751a.e("translationXCurveUpwards");
            e11 = eVar.f22751a.e("translationYCurveUpwards");
        } else {
            e10 = eVar.f22751a.e("translationXCurveDownwards");
            e11 = eVar.f22751a.e("translationYCurveDownwards");
        }
        return new Pair<>(e10, e11);
    }

    private float O(View view, View view2, j jVar) {
        RectF rectF = this.f22739d;
        RectF rectF2 = this.f22740e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float P(View view, View view2, j jVar) {
        RectF rectF = this.f22739d;
        RectF rectF2 = this.f22740e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float Q(View view, View view2, j jVar) {
        float centerX;
        float centerX2;
        float f10;
        RectF rectF = this.f22739d;
        RectF rectF2 = this.f22740e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f31889a & 7;
        if (i10 == 1) {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        } else if (i10 == 3) {
            centerX = rectF2.left;
            centerX2 = rectF.left;
        } else if (i10 == 5) {
            centerX = rectF2.right;
            centerX2 = rectF.right;
        } else {
            f10 = 0.0f;
            return f10 + jVar.f31890b;
        }
        f10 = centerX - centerX2;
        return f10 + jVar.f31890b;
    }

    private float R(View view, View view2, j jVar) {
        float centerY;
        float centerY2;
        float f10;
        RectF rectF = this.f22739d;
        RectF rectF2 = this.f22740e;
        M(view, rectF);
        T(view2, rectF2);
        int i10 = jVar.f31889a & 112;
        if (i10 == 16) {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        } else if (i10 == 48) {
            centerY = rectF2.top;
            centerY2 = rectF.top;
        } else if (i10 == 80) {
            centerY = rectF2.bottom;
            centerY2 = rectF.bottom;
        } else {
            f10 = 0.0f;
            return f10 + jVar.f31891c;
        }
        f10 = centerY - centerY2;
        return f10 + jVar.f31891c;
    }

    private float S(e eVar, i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i e10 = eVar.f22751a.e("expansion");
        return ia.a.a(f10, f11, iVar.e().getInterpolation(((float) (((e10.c() + e10.d()) + 17) - c10)) / ((float) d10)));
    }

    private void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f22741f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void U(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator ofFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof la.d) && la.c.f34026a == 0) || (K = K(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    ia.d.f31875a.set(K, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(K, ia.d.f31875a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(K, ia.d.f31875a, 0.0f);
            }
            eVar.f22751a.e("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    private void V(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (view2 instanceof la.d) {
            la.d dVar = (la.d) view2;
            int d02 = d0(view);
            int i10 = 16777215 & d02;
            if (z10) {
                if (!z11) {
                    dVar.setCircularRevealScrimColor(d02);
                }
                ofInt = ObjectAnimator.ofInt(dVar, d.C0443d.f34030a, i10);
            } else {
                ofInt = ObjectAnimator.ofInt(dVar, d.C0443d.f34030a, d02);
            }
            ofInt.setEvaluator(ia.c.b());
            eVar.f22751a.e("color").a(ofInt);
            list.add(ofInt);
        }
    }

    private void W(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float Q = Q(view, view2, eVar.f22752b);
        float R = R(view, view2, eVar.f22752b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            Q = this.f22742g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            R = this.f22743h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    private void X(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float w10 = z.w(view2) - z.w(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-w10);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -w10);
        }
        eVar.f22751a.e("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof la.d) {
            la.d dVar = (la.d) view2;
            float O = O(view, view2, eVar.f22752b);
            float P = P(view, view2, eVar.f22752b);
            ((FloatingActionButton) view).i(this.f22738c);
            float width = this.f22738c.width() / 2.0f;
            i e10 = eVar.f22751a.e("expansion");
            if (z10) {
                if (!z11) {
                    dVar.setRevealInfo(new d.e(O, P, width));
                }
                if (z11) {
                    width = dVar.getRevealInfo().f34033c;
                }
                animator = la.a.a(dVar, O, P, sa.a.b(O, P, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(this, dVar));
                b0(view2, e10.c(), (int) O, (int) P, width, list);
            } else {
                float f12 = dVar.getRevealInfo().f34033c;
                Animator a10 = la.a.a(dVar, O, P, width);
                int i10 = (int) O;
                int i11 = (int) P;
                b0(view2, e10.c(), i10, i11, f12, list);
                a0(view2, e10.c(), e10.d(), eVar.f22751a.f(), i10, i11, width, list);
                animator = a10;
            }
            e10.a(animator);
            list.add(animator);
            list2.add(la.a.b(dVar));
        }
    }

    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof la.d) && (view instanceof ImageView)) {
            la.d dVar = (la.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, ia.e.f31876b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, ia.e.f31876b, 255);
            }
            ofInt.addUpdateListener(new b(this, view2));
            eVar.f22751a.e("iconFade").a(ofInt);
            list.add(ofInt);
            list2.add(new c(this, dVar, drawable));
        }
    }

    private void a0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j13 = j10 + j11;
            if (j13 < j12) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
                createCircularReveal.setStartDelay(j13);
                createCircularReveal.setDuration(j12 - j13);
                list.add(createCircularReveal);
            }
        }
    }

    private void b0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j10 <= 0) {
            return;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
        createCircularReveal.setStartDelay(0L);
        createCircularReveal.setDuration(j10);
        list.add(createCircularReveal);
    }

    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float Q = Q(view, view2, eVar.f22752b);
        float R = R(view, view2, eVar.f22752b);
        Pair<i, i> N = N(Q, R, z10, eVar);
        i iVar = (i) N.first;
        i iVar2 = (i) N.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    private int d0(View view) {
        ColorStateList s10 = z.s(view);
        if (s10 != null) {
            return s10.getColorForState(view.getDrawableState(), s10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        e e02 = e0(view2.getContext(), z10);
        if (z10) {
            this.f22742g = view.getTranslationX();
            this.f22743h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z10, z11, e02, arrayList, arrayList2);
        }
        RectF rectF = this.f22739d;
        c0(view, view2, z10, z11, e02, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        W(view, view2, z10, e02, arrayList);
        Z(view, view2, z10, z11, e02, arrayList, arrayList2);
        Y(view, view2, z10, z11, e02, width, height, arrayList, arrayList2);
        V(view, view2, z10, z11, e02, arrayList, arrayList2);
        U(view, view2, z10, z11, e02, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        ia.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    protected abstract e e0(Context context, boolean z10);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f2457h == 0) {
            fVar.f2457h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22738c = new Rect();
        this.f22739d = new RectF();
        this.f22740e = new RectF();
        this.f22741f = new int[2];
    }
}
