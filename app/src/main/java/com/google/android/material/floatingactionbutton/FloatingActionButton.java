package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import androidx.core.view.z;
import androidx.core.widget.o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.i;
import com.google.android.material.stateful.ExtendableSavedState;
import h0.g;
import ha.l;
import ia.h;
import ia.k;
import java.util.List;
import xa.n;

@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes2.dex */
public class FloatingActionButton extends i implements x, o, ra.a, n {

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f22375b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f22376c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f22377d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f22378e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f22379f;

    /* renamed from: g  reason: collision with root package name */
    private int f22380g;

    /* renamed from: h  reason: collision with root package name */
    private int f22381h;

    /* renamed from: i  reason: collision with root package name */
    private int f22382i;

    /* renamed from: j  reason: collision with root package name */
    private int f22383j;

    /* renamed from: k  reason: collision with root package name */
    boolean f22384k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f22385l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f22386m;

    /* renamed from: n  reason: collision with root package name */
    private final q f22387n;

    /* renamed from: o  reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.a f22388o;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements a.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f22392a;

        a(b bVar) {
            this.f22392a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            this.f22392a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            this.f22392a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c implements wa.b {
        c() {
        }

        @Override // wa.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f22385l.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f22382i, i11 + FloatingActionButton.this.f22382i, i12 + FloatingActionButton.this.f22382i, i13 + FloatingActionButton.this.f22382i);
        }

        @Override // wa.b
        public void b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // wa.b
        public boolean c() {
            return FloatingActionButton.this.f22384k;
        }
    }

    /* loaded from: classes2.dex */
    class d<T extends FloatingActionButton> implements a.i {

        /* renamed from: a  reason: collision with root package name */
        private final k<T> f22395a;

        d(k<T> kVar) {
            this.f22395a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public void a() {
            this.f22395a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.i
        public void b() {
            this.f22395a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f22395a.equals(this.f22395a);
        }

        public int hashCode() {
            return this.f22395a.hashCode();
        }
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f22388o == null) {
            this.f22388o = h();
        }
        return this.f22388o;
    }

    private com.google.android.material.floatingactionbutton.a h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new com.google.android.material.floatingactionbutton.b(this, new c());
        }
        return new com.google.android.material.floatingactionbutton.a(this, new c());
    }

    private int k(int i10) {
        int i11 = this.f22381h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(ha.d.f31164d);
            }
            return resources.getDimensionPixelSize(ha.d.f31163c);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    private void p(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f22385l;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f22377d;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f22378e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.k.e(colorForState, mode));
    }

    private static int r(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i10;
        }
        return Math.min(i10, size);
    }

    private a.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // ra.a
    public boolean a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().C(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(k<? extends FloatingActionButton> kVar) {
        getImpl().f(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f22375b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f22376c;
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().j();
    }

    public int getCustomSize() {
        return this.f22381h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f22379f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f22379f;
    }

    public xa.k getShapeAppearanceModel() {
        return (xa.k) g.f(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f22380g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.f22380g);
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.o
    public ColorStateList getSupportImageTintList() {
        return this.f22377d;
    }

    @Override // androidx.core.widget.o
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f22378e;
    }

    public boolean getUseCompatPadding() {
        return this.f22384k;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (z.U(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            p(rect);
            return true;
        }
        return false;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().y();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    void m(b bVar, boolean z10) {
        getImpl().v(u(bVar), z10);
    }

    public boolean n() {
        return getImpl().w();
    }

    public boolean o() {
        return getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f22382i = (sizeDimension - this.f22383j) / 2;
        getImpl().b0();
        int min = Math.min(r(sizeDimension, i10), r(sizeDimension, i11));
        Rect rect = this.f22385l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.c());
        Bundle bundle = (Bundle) g.f(extendableSavedState.f22531c.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new ExtendableSavedState(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.f22386m) && !this.f22386m.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f22375b != colorStateList) {
            this.f22375b = colorStateList;
            getImpl().J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f22376c != mode) {
            this.f22376c = mode;
            getImpl().K(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().L(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().O(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().Q(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f22381h) {
                this.f22381h = i10;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().c0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().M(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().N(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.f22377d != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f22387n.i(i10);
        q();
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().G();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().S(z10);
    }

    @Override // xa.n
    public void setShapeAppearanceModel(xa.k kVar) {
        getImpl().T(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().U(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f22381h = 0;
        if (i10 != this.f22380g) {
            this.f22380g = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f22377d != colorStateList) {
            this.f22377d = colorStateList;
            q();
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f22378e != mode) {
            this.f22378e = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f22384k != z10) {
            this.f22384k = z10;
            getImpl().A();
        }
    }

    @Override // com.google.android.material.internal.i, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    void t(b bVar, boolean z10) {
        getImpl().Y(u(bVar), z10);
    }

    /* loaded from: classes2.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f22389a;

        /* renamed from: b  reason: collision with root package name */
        private b f22390b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f22391c;

        public BaseBehavior() {
            this.f22391c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f22385l;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                z.b0(floatingActionButton, i11);
            }
            if (i10 != 0) {
                z.a0(floatingActionButton, i10);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f22391c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                if (this.f22389a == null) {
                    this.f22389a = new Rect();
                }
                Rect rect = this.f22389a;
                com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m(this.f22390b, false);
                    return true;
                }
                floatingActionButton.t(this.f22390b, false);
                return true;
            }
            return false;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m(this.f22390b, false);
                    return true;
                }
                floatingActionButton.t(this.f22390b, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f22385l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (F(view)) {
                L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> r10 = coordinatorLayout.r(floatingActionButton);
            int size = r10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r10.get(i11);
                if (view instanceof AppBarLayout) {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f2457h == 0) {
                fVar.f2457h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.B0);
            this.f22391c = obtainStyledAttributes.getBoolean(l.C0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f22379f != colorStateList) {
            this.f22379f = colorStateList;
            getImpl().R(this.f22379f);
        }
    }
}
