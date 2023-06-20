package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.z;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTCustomShadowBackground.java */
/* loaded from: classes.dex */
public class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private int f13131a;

    /* renamed from: b  reason: collision with root package name */
    private int f13132b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f13133c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f13134d;

    /* renamed from: e  reason: collision with root package name */
    private LinearGradient f13135e;

    /* renamed from: f  reason: collision with root package name */
    private int f13136f;

    /* renamed from: g  reason: collision with root package name */
    private int f13137g;

    /* renamed from: h  reason: collision with root package name */
    private int f13138h;

    /* renamed from: i  reason: collision with root package name */
    private int f13139i;

    /* renamed from: j  reason: collision with root package name */
    private RectF f13140j;

    /* renamed from: k  reason: collision with root package name */
    private Paint f13141k;

    /* compiled from: TTCustomShadowBackground.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        private int[] f13144c;

        /* renamed from: d  reason: collision with root package name */
        private float[] f13145d;

        /* renamed from: e  reason: collision with root package name */
        private LinearGradient f13146e;

        /* renamed from: h  reason: collision with root package name */
        private int f13149h;

        /* renamed from: i  reason: collision with root package name */
        private int f13150i;

        /* renamed from: a  reason: collision with root package name */
        private int f13142a = t.k(m.a(), "tt_ssxinmian8");

        /* renamed from: b  reason: collision with root package name */
        private int f13143b = t.k(m.a(), "tt_ssxinxian3");

        /* renamed from: f  reason: collision with root package name */
        private int f13147f = 10;

        /* renamed from: g  reason: collision with root package name */
        private int f13148g = 16;

        public a() {
            this.f13149h = 0;
            this.f13150i = 0;
            this.f13149h = 0;
            this.f13150i = 0;
        }

        public a a(int i10) {
            this.f13142a = i10;
            return this;
        }

        public a b(int i10) {
            this.f13143b = i10;
            return this;
        }

        public a c(int i10) {
            this.f13147f = i10;
            return this;
        }

        public a d(int i10) {
            this.f13149h = i10;
            return this;
        }

        public a e(int i10) {
            this.f13150i = i10;
            return this;
        }

        public a a(int[] iArr) {
            this.f13144c = iArr;
            return this;
        }

        public c a() {
            return new c(this.f13142a, this.f13144c, this.f13145d, this.f13143b, this.f13146e, this.f13147f, this.f13148g, this.f13149h, this.f13150i);
        }
    }

    public c(int i10, int[] iArr, float[] fArr, int i11, LinearGradient linearGradient, int i12, int i13, int i14, int i15) {
        this.f13131a = i10;
        this.f13133c = iArr;
        this.f13134d = fArr;
        this.f13132b = i11;
        this.f13135e = linearGradient;
        this.f13136f = i12;
        this.f13137g = i13;
        this.f13138h = i14;
        this.f13139i = i15;
    }

    private void a() {
        int[] iArr;
        Paint paint = new Paint();
        this.f13141k = paint;
        boolean z10 = true;
        paint.setAntiAlias(true);
        this.f13141k.setShadowLayer(this.f13137g, this.f13138h, this.f13139i, this.f13132b);
        if (this.f13140j != null && (iArr = this.f13133c) != null && iArr.length > 1) {
            float[] fArr = this.f13134d;
            z10 = (fArr == null || fArr.length <= 0 || fArr.length != iArr.length) ? false : false;
            Paint paint2 = this.f13141k;
            LinearGradient linearGradient = this.f13135e;
            if (linearGradient == null) {
                RectF rectF = this.f13140j;
                linearGradient = new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.f13133c, z10 ? this.f13134d : null, Shader.TileMode.CLAMP);
            }
            paint2.setShader(linearGradient);
            return;
        }
        this.f13141k.setColor(this.f13131a);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f13140j == null) {
            Rect bounds = getBounds();
            int i10 = bounds.left;
            int i11 = this.f13137g;
            int i12 = this.f13138h;
            int i13 = this.f13139i;
            this.f13140j = new RectF((i10 + i11) - i12, (bounds.top + i11) - i13, (bounds.right - i11) - i12, (bounds.bottom - i11) - i13);
        }
        if (this.f13141k == null) {
            a();
        }
        RectF rectF = this.f13140j;
        int i14 = this.f13136f;
        canvas.drawRoundRect(rectF, i14, i14, this.f13141k);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Paint paint = this.f13141k;
        if (paint != null) {
            paint.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f13141k;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public static void a(View view, a aVar) {
        if (view == null || aVar == null) {
            return;
        }
        view.setLayerType(1, null);
        z.u0(view, aVar.a());
    }
}
