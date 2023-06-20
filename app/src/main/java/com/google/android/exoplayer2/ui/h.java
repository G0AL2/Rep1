package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import ea.n0;

/* compiled from: SubtitlePainter.java */
/* loaded from: classes2.dex */
final class h {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a  reason: collision with root package name */
    private final float f21759a;

    /* renamed from: b  reason: collision with root package name */
    private final float f21760b;

    /* renamed from: c  reason: collision with root package name */
    private final float f21761c;

    /* renamed from: d  reason: collision with root package name */
    private final float f21762d;

    /* renamed from: e  reason: collision with root package name */
    private final float f21763e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f21764f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f21765g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f21766h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f21767i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f21768j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f21769k;

    /* renamed from: l  reason: collision with root package name */
    private float f21770l;

    /* renamed from: m  reason: collision with root package name */
    private int f21771m;

    /* renamed from: n  reason: collision with root package name */
    private int f21772n;

    /* renamed from: o  reason: collision with root package name */
    private float f21773o;

    /* renamed from: p  reason: collision with root package name */
    private int f21774p;

    /* renamed from: q  reason: collision with root package name */
    private float f21775q;

    /* renamed from: r  reason: collision with root package name */
    private float f21776r;

    /* renamed from: s  reason: collision with root package name */
    private int f21777s;

    /* renamed from: t  reason: collision with root package name */
    private int f21778t;

    /* renamed from: u  reason: collision with root package name */
    private int f21779u;

    /* renamed from: v  reason: collision with root package name */
    private int f21780v;

    /* renamed from: w  reason: collision with root package name */
    private int f21781w;

    /* renamed from: x  reason: collision with root package name */
    private float f21782x;

    /* renamed from: y  reason: collision with root package name */
    private float f21783y;

    /* renamed from: z  reason: collision with root package name */
    private float f21784z;

    public h(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f21763e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21762d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f21759a = round;
        this.f21760b = round;
        this.f21761c = round;
        TextPaint textPaint = new TextPaint();
        this.f21764f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f21765g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f21766h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f21769k, (Rect) null, this.J, this.f21766h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        ea.a.e(this.J);
        ea.a.e(this.f21769k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f21779u) > 0) {
            this.f21765g.setColor(this.f21779u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f21765g);
        }
        int i10 = this.f21781w;
        if (i10 == 1) {
            this.f21764f.setStrokeJoin(Paint.Join.ROUND);
            this.f21764f.setStrokeWidth(this.f21759a);
            this.f21764f.setColor(this.f21780v);
            this.f21764f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f21764f;
            float f10 = this.f21760b;
            float f11 = this.f21761c;
            textPaint.setShadowLayer(f10, f11, f11, this.f21780v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z10 = i10 == 3;
            int i11 = z10 ? -1 : this.f21780v;
            int i12 = z10 ? this.f21780v : -1;
            float f12 = this.f21760b / 2.0f;
            this.f21764f.setColor(this.f21777s);
            this.f21764f.setStyle(Paint.Style.FILL);
            float f13 = -f12;
            this.f21764f.setShadowLayer(this.f21760b, f13, f13, i11);
            staticLayout2.draw(canvas);
            this.f21764f.setShadowLayer(this.f21760b, f12, f12, i12);
        }
        this.f21764f.setColor(this.f21777s);
        this.f21764f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f21764f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f21769k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f21773o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f21770l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f21775q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f21776r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L32
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L44
        L32:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L44:
            int r3 = r7.f21774p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L4d
            float r3 = (float) r1
        L4b:
            float r2 = r2 - r3
            goto L53
        L4d:
            if (r3 != r5) goto L53
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L4b
        L53:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f21772n
            if (r3 != r6) goto L5e
            float r3 = (float) r0
        L5c:
            float r4 = r4 - r3
            goto L64
        L5e:
            if (r3 != r5) goto L64
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L5c
        L64:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.h.g():void");
    }

    public void b(r9.b bVar, ca.b bVar2, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10 = bVar.f36486d == null;
        int i14 = -16777216;
        if (z10) {
            if (TextUtils.isEmpty(bVar.f36483a)) {
                return;
            }
            i14 = bVar.f36494l ? bVar.f36495m : bVar2.f5337c;
        }
        if (a(this.f21767i, bVar.f36483a) && n0.c(this.f21768j, bVar.f36484b) && this.f21769k == bVar.f36486d && this.f21770l == bVar.f36487e && this.f21771m == bVar.f36488f && n0.c(Integer.valueOf(this.f21772n), Integer.valueOf(bVar.f36489g)) && this.f21773o == bVar.f36490h && n0.c(Integer.valueOf(this.f21774p), Integer.valueOf(bVar.f36491i)) && this.f21775q == bVar.f36492j && this.f21776r == bVar.f36493k && this.f21777s == bVar2.f5335a && this.f21778t == bVar2.f5336b && this.f21779u == i14 && this.f21781w == bVar2.f5338d && this.f21780v == bVar2.f5339e && n0.c(this.f21764f.getTypeface(), bVar2.f5340f) && this.f21782x == f10 && this.f21783y == f11 && this.f21784z == f12 && this.A == i10 && this.B == i11 && this.C == i12 && this.D == i13) {
            d(canvas, z10);
            return;
        }
        this.f21767i = bVar.f36483a;
        this.f21768j = bVar.f36484b;
        this.f21769k = bVar.f36486d;
        this.f21770l = bVar.f36487e;
        this.f21771m = bVar.f36488f;
        this.f21772n = bVar.f36489g;
        this.f21773o = bVar.f36490h;
        this.f21774p = bVar.f36491i;
        this.f21775q = bVar.f36492j;
        this.f21776r = bVar.f36493k;
        this.f21777s = bVar2.f5335a;
        this.f21778t = bVar2.f5336b;
        this.f21779u = i14;
        this.f21781w = bVar2.f5338d;
        this.f21780v = bVar2.f5339e;
        this.f21764f.setTypeface(bVar2.f5340f);
        this.f21782x = f10;
        this.f21783y = f11;
        this.f21784z = f12;
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = i13;
        if (z10) {
            ea.a.e(this.f21767i);
            g();
        } else {
            ea.a.e(this.f21769k);
            f();
        }
        d(canvas, z10);
    }
}
