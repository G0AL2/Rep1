package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import y.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f1383a;

    /* renamed from: b  reason: collision with root package name */
    private x0 f1384b;

    /* renamed from: c  reason: collision with root package name */
    private x0 f1385c;

    /* renamed from: d  reason: collision with root package name */
    private x0 f1386d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f1387e;

    /* renamed from: f  reason: collision with root package name */
    private x0 f1388f;

    /* renamed from: g  reason: collision with root package name */
    private x0 f1389g;

    /* renamed from: h  reason: collision with root package name */
    private x0 f1390h;

    /* renamed from: i  reason: collision with root package name */
    private final c0 f1391i;

    /* renamed from: j  reason: collision with root package name */
    private int f1392j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f1393k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Typeface f1394l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1395m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class a extends h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1397b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WeakReference f1398c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1396a = i10;
            this.f1397b = i11;
            this.f1398c = weakReference;
        }

        @Override // y.h.d
        public void d(int i10) {
        }

        @Override // y.h.d
        public void e(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1396a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1397b & 2) != 0);
            }
            b0.this.n(this.f1398c, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f1400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f1401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f1402c;

        b(b0 b0Var, TextView textView, Typeface typeface, int i10) {
            this.f1400a = textView;
            this.f1401b = typeface;
            this.f1402c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1400a.setTypeface(this.f1401b, this.f1402c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(TextView textView) {
        this.f1383a = textView;
        this.f1391i = new c0(textView);
    }

    private void B(int i10, float f10) {
        this.f1391i.y(i10, f10);
    }

    private void C(Context context, z0 z0Var) {
        String o10;
        this.f1392j = z0Var.k(d.j.P2, this.f1392j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = z0Var.k(d.j.U2, -1);
            this.f1393k = k10;
            if (k10 != -1) {
                this.f1392j = (this.f1392j & 2) | 0;
            }
        }
        int i11 = d.j.T2;
        if (!z0Var.s(i11) && !z0Var.s(d.j.V2)) {
            int i12 = d.j.O2;
            if (z0Var.s(i12)) {
                this.f1395m = false;
                int k11 = z0Var.k(i12, 1);
                if (k11 == 1) {
                    this.f1394l = Typeface.SANS_SERIF;
                    return;
                } else if (k11 == 2) {
                    this.f1394l = Typeface.SERIF;
                    return;
                } else if (k11 != 3) {
                    return;
                } else {
                    this.f1394l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1394l = null;
        int i13 = d.j.V2;
        if (z0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1393k;
        int i15 = this.f1392j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = z0Var.j(i11, this.f1392j, new a(i14, i15, new WeakReference(this.f1383a)));
                if (j10 != null) {
                    if (i10 >= 28 && this.f1393k != -1) {
                        this.f1394l = Typeface.create(Typeface.create(j10, 0), this.f1393k, (this.f1392j & 2) != 0);
                    } else {
                        this.f1394l = j10;
                    }
                }
                this.f1395m = this.f1394l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1394l != null || (o10 = z0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.f1393k != -1) {
            this.f1394l = Typeface.create(Typeface.create(o10, 0), this.f1393k, (this.f1392j & 2) != 0);
        } else {
            this.f1394l = Typeface.create(o10, this.f1392j);
        }
    }

    private void a(Drawable drawable, x0 x0Var) {
        if (drawable == null || x0Var == null) {
            return;
        }
        k.i(drawable, x0Var, this.f1383a.getDrawableState());
    }

    private static x0 d(Context context, k kVar, int i10) {
        ColorStateList f10 = kVar.f(context, i10);
        if (f10 != null) {
            x0 x0Var = new x0();
            x0Var.f1753d = true;
            x0Var.f1750a = f10;
            return x0Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1383a.getCompoundDrawablesRelative();
            TextView textView = this.f1383a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i10 >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1383a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f1383a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1383a.getCompoundDrawables();
            TextView textView3 = this.f1383a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void z() {
        x0 x0Var = this.f1390h;
        this.f1384b = x0Var;
        this.f1385c = x0Var;
        this.f1386d = x0Var;
        this.f1387e = x0Var;
        this.f1388f = x0Var;
        this.f1389g = x0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i10, float f10) {
        if (androidx.core.widget.b.f2806a0 || l()) {
            return;
        }
        B(i10, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f1384b != null || this.f1385c != null || this.f1386d != null || this.f1387e != null) {
            Drawable[] compoundDrawables = this.f1383a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1384b);
            a(compoundDrawables[1], this.f1385c);
            a(compoundDrawables[2], this.f1386d);
            a(compoundDrawables[3], this.f1387e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1388f == null && this.f1389g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1383a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1388f);
            a(compoundDrawablesRelative[2], this.f1389g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f1391i.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f1391i.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f1391i.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f1391i.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] h() {
        return this.f1391i.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f1391i.n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList j() {
        x0 x0Var = this.f1390h;
        if (x0Var != null) {
            return x0Var.f1750a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode k() {
        x0 x0Var = this.f1390h;
        if (x0Var != null) {
            return x0Var.f1751b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f1391i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1395m) {
            this.f1394l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.z.T(textView)) {
                    textView.post(new b(this, textView, typeface, this.f1392j));
                } else {
                    textView.setTypeface(typeface, this.f1392j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (androidx.core.widget.b.f2806a0) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Context context, int i10) {
        String o10;
        ColorStateList c10;
        ColorStateList c11;
        ColorStateList c12;
        z0 t10 = z0.t(context, i10, d.j.M2);
        int i11 = d.j.X2;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23) {
            int i13 = d.j.Q2;
            if (t10.s(i13) && (c12 = t10.c(i13)) != null) {
                this.f1383a.setTextColor(c12);
            }
            int i14 = d.j.S2;
            if (t10.s(i14) && (c11 = t10.c(i14)) != null) {
                this.f1383a.setLinkTextColor(c11);
            }
            int i15 = d.j.R2;
            if (t10.s(i15) && (c10 = t10.c(i15)) != null) {
                this.f1383a.setHintTextColor(c10);
            }
        }
        int i16 = d.j.N2;
        if (t10.s(i16) && t10.f(i16, -1) == 0) {
            this.f1383a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i17 = d.j.W2;
            if (t10.s(i17) && (o10 = t10.o(i17)) != null) {
                this.f1383a.setFontVariationSettings(o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1394l;
        if (typeface != null) {
            this.f1383a.setTypeface(typeface, this.f1392j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        k0.a.f(editorInfo, textView.getText());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f1383a.setAllCaps(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1391i.u(i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f1391i.v(iArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(int i10) {
        this.f1391i.w(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f1390h == null) {
            this.f1390h = new x0();
        }
        x0 x0Var = this.f1390h;
        x0Var.f1750a = colorStateList;
        x0Var.f1753d = colorStateList != null;
        z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f1390h == null) {
            this.f1390h = new x0();
        }
        x0 x0Var = this.f1390h;
        x0Var.f1751b = mode;
        x0Var.f1752c = mode != null;
        z();
    }
}
