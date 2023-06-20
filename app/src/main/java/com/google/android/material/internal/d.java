package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.k0;
import ha.l;

/* compiled from: ForegroundLinearLayout.java */
/* loaded from: classes3.dex */
public class d extends k0 {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f22485p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f22486q;

    /* renamed from: r  reason: collision with root package name */
    private final Rect f22487r;

    /* renamed from: s  reason: collision with root package name */
    private int f22488s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f22489t;

    /* renamed from: u  reason: collision with root package name */
    boolean f22490u;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f22485p;
        if (drawable != null) {
            if (this.f22490u) {
                this.f22490u = false;
                Rect rect = this.f22486q;
                Rect rect2 = this.f22487r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f22489t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f22488s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f22485p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f22485p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f22485p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f22485p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f22488s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f22485p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22490u = z10 | this.f22490u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f22490u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f22485p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f22485p);
            }
            this.f22485p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f22488s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f22488s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f22488s = i10;
            if (i10 == 119 && this.f22485p != null) {
                this.f22485p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f22485p;
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22486q = new Rect();
        this.f22487r = new Rect();
        this.f22488s = 119;
        this.f22489t = true;
        this.f22490u = false;
        TypedArray k10 = g.k(context, attributeSet, l.G0, i10, 0, new int[0]);
        this.f22488s = k10.getInt(l.I0, this.f22488s);
        Drawable drawable = k10.getDrawable(l.H0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f22489t = k10.getBoolean(l.J0, true);
        k10.recycle();
    }
}
