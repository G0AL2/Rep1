package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
class z extends u {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f1756d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1757e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f1758f;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f1759g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1760h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1761i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(SeekBar seekBar) {
        super(seekBar);
        this.f1758f = null;
        this.f1759g = null;
        this.f1760h = false;
        this.f1761i = false;
        this.f1756d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1757e;
        if (drawable != null) {
            if (this.f1760h || this.f1761i) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1757e = r10;
                if (this.f1760h) {
                    androidx.core.graphics.drawable.a.o(r10, this.f1758f);
                }
                if (this.f1761i) {
                    androidx.core.graphics.drawable.a.p(this.f1757e, this.f1759g);
                }
                if (this.f1757e.isStateful()) {
                    this.f1757e.setState(this.f1756d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.u
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1756d.getContext();
        int[] iArr = d.j.Q;
        z0 v10 = z0.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1756d;
        androidx.core.view.z.o0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(d.j.R);
        if (h10 != null) {
            this.f1756d.setThumb(h10);
        }
        j(v10.g(d.j.S));
        int i11 = d.j.U;
        if (v10.s(i11)) {
            this.f1759g = g0.e(v10.k(i11, -1), this.f1759g);
            this.f1761i = true;
        }
        int i12 = d.j.T;
        if (v10.s(i12)) {
            this.f1758f = v10.c(i12);
            this.f1760h = true;
        }
        v10.w();
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        if (this.f1757e != null) {
            int max = this.f1756d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1757e.getIntrinsicWidth();
                int intrinsicHeight = this.f1757e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1757e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1756d.getWidth() - this.f1756d.getPaddingLeft()) - this.f1756d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1756d.getPaddingLeft(), this.f1756d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1757e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f1757e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1756d.getDrawableState())) {
            this.f1756d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f1757e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1757e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1757e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1756d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.z.C(this.f1756d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1756d.getDrawableState());
            }
            f();
        }
        this.f1756d.invalidate();
    }
}
