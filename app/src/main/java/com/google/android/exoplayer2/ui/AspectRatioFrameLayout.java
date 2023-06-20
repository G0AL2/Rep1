package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ca.n;

/* loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final c f21614a;

    /* renamed from: b  reason: collision with root package name */
    private b f21615b;

    /* renamed from: c  reason: collision with root package name */
    private float f21616c;

    /* renamed from: d  reason: collision with root package name */
    private int f21617d;

    /* loaded from: classes2.dex */
    public interface b {
        void a(float f10, float f11, boolean z10);
    }

    /* loaded from: classes2.dex */
    private final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private float f21618a;

        /* renamed from: b  reason: collision with root package name */
        private float f21619b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f21620c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f21621d;

        private c() {
        }

        public void a(float f10, float f11, boolean z10) {
            this.f21618a = f10;
            this.f21619b = f11;
            this.f21620c = z10;
            if (this.f21621d) {
                return;
            }
            this.f21621d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21621d = false;
            if (AspectRatioFrameLayout.this.f21615b == null) {
                return;
            }
            AspectRatioFrameLayout.this.f21615b.a(this.f21618a, this.f21619b, this.f21620c);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21617d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f5403a, 0, 0);
            try {
                this.f21617d = obtainStyledAttributes.getInt(n.f5404b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f21614a = new c();
    }

    public int getResizeMode() {
        return this.f21617d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f21616c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f21616c / f14) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            this.f21614a.a(this.f21616c, f14, false);
            return;
        }
        int i12 = this.f21617d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f21616c;
                } else if (i12 == 4) {
                    if (f15 > 0.0f) {
                        f10 = this.f21616c;
                    } else {
                        f11 = this.f21616c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f21616c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f21616c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f21616c;
            measuredWidth = (int) (f13 * f10);
        }
        this.f21614a.a(this.f21616c, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f21616c != f10) {
            this.f21616c = f10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f21615b = bVar;
    }

    public void setResizeMode(int i10) {
        if (this.f21617d != i10) {
            this.f21617d = i10;
            requestLayout();
        }
    }
}
