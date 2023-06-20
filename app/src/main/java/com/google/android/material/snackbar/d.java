package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.z;
import com.google.android.material.internal.g;
import ha.l;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes3.dex */
public class d extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static final View.OnTouchListener f22516f = new a();

    /* renamed from: a  reason: collision with root package name */
    private c f22517a;

    /* renamed from: b  reason: collision with root package name */
    private b f22518b;

    /* renamed from: c  reason: collision with root package name */
    private int f22519c;

    /* renamed from: d  reason: collision with root package name */
    private final float f22520d;

    /* renamed from: e  reason: collision with root package name */
    private final float f22521e;

    /* compiled from: BaseTransientBottomBar.java */
    /* loaded from: classes3.dex */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, AttributeSet attributeSet) {
        super(g.f(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.Z1);
        int i10 = l.f31290e2;
        if (obtainStyledAttributes.hasValue(i10)) {
            z.y0(this, obtainStyledAttributes.getDimensionPixelSize(i10, 0));
        }
        this.f22519c = obtainStyledAttributes.getInt(l.f31280c2, 0);
        this.f22520d = obtainStyledAttributes.getFloat(l.f31285d2, 1.0f);
        this.f22521e = obtainStyledAttributes.getFloat(l.f31275b2, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f22516f);
        setFocusable(true);
    }

    float getActionTextColorAlpha() {
        return this.f22521e;
    }

    int getAnimationMode() {
        return this.f22519c;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f22520d;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f22518b;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        z.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f22518b;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        c cVar = this.f22517a;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    void setAnimationMode(int i10) {
        this.f22519c = i10;
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.f22518b = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f22516f);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(c cVar) {
        this.f22517a = cVar;
    }
}
