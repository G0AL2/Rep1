package ua;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import ha.l;
import y.h;

/* compiled from: TextAppearance.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final float f37682a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f37683b;

    /* renamed from: c  reason: collision with root package name */
    public final int f37684c;

    /* renamed from: d  reason: collision with root package name */
    public final int f37685d;

    /* renamed from: e  reason: collision with root package name */
    public final String f37686e;

    /* renamed from: f  reason: collision with root package name */
    public final ColorStateList f37687f;

    /* renamed from: g  reason: collision with root package name */
    public final float f37688g;

    /* renamed from: h  reason: collision with root package name */
    public final float f37689h;

    /* renamed from: i  reason: collision with root package name */
    public final float f37690i;

    /* renamed from: j  reason: collision with root package name */
    private final int f37691j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37692k = false;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f37693l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f37694a;

        a(f fVar) {
            this.f37694a = fVar;
        }

        @Override // y.h.d
        public void d(int i10) {
            d.this.f37692k = true;
            this.f37694a.a(i10);
        }

        @Override // y.h.d
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f37693l = Typeface.create(typeface, dVar.f37684c);
            d.this.f37692k = true;
            this.f37694a.b(d.this.f37693l, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* loaded from: classes3.dex */
    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextPaint f37696a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f37697b;

        b(TextPaint textPaint, f fVar) {
            this.f37696a = textPaint;
            this.f37697b = fVar;
        }

        @Override // ua.f
        public void a(int i10) {
            this.f37697b.a(i10);
        }

        @Override // ua.f
        public void b(Typeface typeface, boolean z10) {
            d.this.k(this.f37696a, typeface);
            this.f37697b.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.G2);
        this.f37682a = obtainStyledAttributes.getDimension(l.H2, 0.0f);
        this.f37683b = c.a(context, obtainStyledAttributes, l.K2);
        c.a(context, obtainStyledAttributes, l.L2);
        c.a(context, obtainStyledAttributes, l.M2);
        this.f37684c = obtainStyledAttributes.getInt(l.J2, 0);
        this.f37685d = obtainStyledAttributes.getInt(l.I2, 1);
        int e10 = c.e(obtainStyledAttributes, l.S2, l.R2);
        this.f37691j = obtainStyledAttributes.getResourceId(e10, 0);
        this.f37686e = obtainStyledAttributes.getString(e10);
        obtainStyledAttributes.getBoolean(l.T2, false);
        this.f37687f = c.a(context, obtainStyledAttributes, l.N2);
        this.f37688g = obtainStyledAttributes.getFloat(l.O2, 0.0f);
        this.f37689h = obtainStyledAttributes.getFloat(l.P2, 0.0f);
        this.f37690i = obtainStyledAttributes.getFloat(l.Q2, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.f37693l == null && (str = this.f37686e) != null) {
            this.f37693l = Typeface.create(str, this.f37684c);
        }
        if (this.f37693l == null) {
            int i10 = this.f37685d;
            if (i10 == 1) {
                this.f37693l = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f37693l = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f37693l = Typeface.DEFAULT;
            } else {
                this.f37693l = Typeface.MONOSPACE;
            }
            this.f37693l = Typeface.create(this.f37693l, this.f37684c);
        }
    }

    public Typeface e() {
        d();
        return this.f37693l;
    }

    public Typeface f(Context context) {
        if (this.f37692k) {
            return this.f37693l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = h.g(context, this.f37691j);
                this.f37693l = g10;
                if (g10 != null) {
                    this.f37693l = Typeface.create(g10, this.f37684c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f37686e, e10);
            }
        }
        d();
        this.f37692k = true;
        return this.f37693l;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f37691j;
        if (i10 == 0) {
            this.f37692k = true;
        }
        if (this.f37692k) {
            fVar.b(this.f37693l, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f37692k = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f37686e, e10);
            this.f37692k = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f37683b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f37690i;
        float f11 = this.f37688g;
        float f12 = this.f37689h;
        ColorStateList colorStateList2 = this.f37687f;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f37684c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f37682a);
    }
}
