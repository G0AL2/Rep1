package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import xa.k;

/* compiled from: CutoutDrawable.java */
/* loaded from: classes3.dex */
class c extends xa.g {

    /* renamed from: w  reason: collision with root package name */
    private final Paint f22669w;

    /* renamed from: x  reason: collision with root package name */
    private final RectF f22670x;

    /* renamed from: y  reason: collision with root package name */
    private int f22671y;

    c() {
        this(null);
    }

    private void h0(Canvas canvas) {
        if (o0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f22671y);
    }

    private void i0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (o0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        k0(canvas);
    }

    private void k0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f22671y = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.f22671y = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    private void n0() {
        this.f22669w.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f22669w.setColor(-1);
        this.f22669w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean o0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // xa.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        i0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f22670x, this.f22669w);
        h0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g0() {
        return !this.f22670x.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0() {
        l0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void l0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f22670x;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0(RectF rectF) {
        l0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.f22669w = new Paint(1);
        n0();
        this.f22670x = new RectF();
    }
}
