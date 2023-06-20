package com.inmobi.media;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.ev;

/* compiled from: GifView.java */
/* loaded from: classes3.dex */
public class ex extends ImageView implements ev.a {

    /* renamed from: a  reason: collision with root package name */
    private ev f25310a;

    /* renamed from: b  reason: collision with root package name */
    private float f25311b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25312c;

    /* renamed from: d  reason: collision with root package name */
    private String f25313d;

    public ex(Context context) {
        this(context, (byte) 0);
    }

    private float[] a(Canvas canvas) {
        float min;
        float f10;
        float f11;
        float width = getWidth();
        float height = getHeight();
        float b10 = this.f25310a.b() * this.f25311b;
        float c10 = this.f25310a.c() * this.f25311b;
        String str = this.f25313d;
        str.hashCode();
        float f12 = 0.0f;
        if (str.equals("aspectFit")) {
            min = Math.min(height / c10, width / b10);
            float f13 = this.f25311b;
            f12 = ((width - (b10 * min)) / 2.0f) / (min * f13);
            f10 = ((height - (c10 * min)) / 2.0f) / (f13 * min);
            canvas.scale(min, min);
        } else if (!str.equals("aspectFill")) {
            f11 = height / c10;
            canvas.scale(width / b10, f11);
            f10 = 0.0f;
            return new float[]{f12, f10, f11};
        } else {
            min = Math.max(height / c10, width / b10);
            float f14 = this.f25311b;
            f12 = ((width - (b10 * min)) / 2.0f) / (min * f14);
            f10 = ((height - (c10 * min)) / 2.0f) / (f14 * min);
            canvas.scale(min, min);
        }
        f11 = min;
        return new float[]{f12, f10, f11};
    }

    private void b(Canvas canvas) {
        canvas.save();
        float f10 = this.f25311b;
        canvas.scale(f10, f10);
        float[] a10 = a(canvas);
        this.f25310a.a(canvas, a10[0], a10[1]);
        canvas.restore();
    }

    private int getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }
        return 240;
    }

    private float getScale() {
        float density = getContext().getResources().getDisplayMetrics().densityDpi / getDensity();
        this.f25311b = density;
        if (density < 0.1f) {
            this.f25311b = 0.1f;
        }
        if (this.f25311b > 5.0f) {
            this.f25311b = 5.0f;
        }
        return this.f25311b;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        ev evVar = this.f25310a;
        if (evVar != null) {
            if (evVar.d()) {
                this.f25310a.e();
                b(canvas);
                b();
                return;
            }
            b(canvas);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f25312c = getVisibility() == 0;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f25311b = getScale();
        Drawable drawable = getDrawable();
        int i12 = 0;
        if (drawable != null) {
            i12 = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i12 <= 0) {
                i12 = 1;
            }
            if (intrinsicHeight > 0) {
                r2 = intrinsicHeight;
            }
        } else {
            ev evVar = this.f25310a;
            if (evVar != null) {
                int b10 = evVar.b();
                int c10 = this.f25310a.c();
                if (b10 <= 0) {
                    b10 = 1;
                }
                r2 = c10 > 0 ? c10 : 1;
                i12 = b10;
            } else {
                r2 = 0;
            }
        }
        setMeasuredDimension(ImageView.resolveSize(Math.max(i12 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10), ImageView.resolveSize(Math.max(r2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11));
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i10) {
        super.onScreenStateChanged(i10);
        this.f25312c = i10 == 1;
        b();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        this.f25312c = i10 == 0;
        b();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f25312c = i10 == 0;
        b();
    }

    public void setContentMode(String str) {
        this.f25313d = str;
    }

    public void setGifImpl(ev evVar) {
        this.f25310a = evVar;
        if (evVar != null) {
            evVar.a(this);
            this.f25310a.a();
        }
        requestLayout();
    }

    public void setPaused(boolean z10) {
        this.f25310a.a(z10);
    }

    private ex(Context context, byte b10) {
        super(context, null);
        this.f25311b = 1.0f;
        this.f25312c = true;
        this.f25313d = "unspecified";
        setLayerType(1, null);
    }

    private void b() {
        if (this.f25312c) {
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                invalidate();
            }
        }
    }

    @Override // com.inmobi.media.ev.a
    public final void a() {
        invalidate();
    }
}
