package y9;

import android.text.Layout;

/* compiled from: TtmlStyle.java */
/* loaded from: classes2.dex */
final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f39336a;

    /* renamed from: b  reason: collision with root package name */
    private int f39337b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39338c;

    /* renamed from: d  reason: collision with root package name */
    private int f39339d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39340e;

    /* renamed from: k  reason: collision with root package name */
    private float f39346k;

    /* renamed from: l  reason: collision with root package name */
    private String f39347l;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f39350o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f39351p;

    /* renamed from: r  reason: collision with root package name */
    private b f39353r;

    /* renamed from: f  reason: collision with root package name */
    private int f39341f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f39342g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f39343h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f39344i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f39345j = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f39348m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f39349n = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f39352q = -1;

    /* renamed from: s  reason: collision with root package name */
    private float f39354s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f39338c && gVar.f39338c) {
                w(gVar.f39337b);
            }
            if (this.f39343h == -1) {
                this.f39343h = gVar.f39343h;
            }
            if (this.f39344i == -1) {
                this.f39344i = gVar.f39344i;
            }
            if (this.f39336a == null && (str = gVar.f39336a) != null) {
                this.f39336a = str;
            }
            if (this.f39341f == -1) {
                this.f39341f = gVar.f39341f;
            }
            if (this.f39342g == -1) {
                this.f39342g = gVar.f39342g;
            }
            if (this.f39349n == -1) {
                this.f39349n = gVar.f39349n;
            }
            if (this.f39350o == null && (alignment2 = gVar.f39350o) != null) {
                this.f39350o = alignment2;
            }
            if (this.f39351p == null && (alignment = gVar.f39351p) != null) {
                this.f39351p = alignment;
            }
            if (this.f39352q == -1) {
                this.f39352q = gVar.f39352q;
            }
            if (this.f39345j == -1) {
                this.f39345j = gVar.f39345j;
                this.f39346k = gVar.f39346k;
            }
            if (this.f39353r == null) {
                this.f39353r = gVar.f39353r;
            }
            if (this.f39354s == Float.MAX_VALUE) {
                this.f39354s = gVar.f39354s;
            }
            if (z10 && !this.f39340e && gVar.f39340e) {
                u(gVar.f39339d);
            }
            if (z10 && this.f39348m == -1 && (i10 = gVar.f39348m) != -1) {
                this.f39348m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f39347l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f39344i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f39341f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f39351p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f39349n = i10;
        return this;
    }

    public g F(int i10) {
        this.f39348m = i10;
        return this;
    }

    public g G(float f10) {
        this.f39354s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f39350o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f39352q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f39353r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f39342g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f39340e) {
            return this.f39339d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f39338c) {
            return this.f39337b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f39336a;
    }

    public float e() {
        return this.f39346k;
    }

    public int f() {
        return this.f39345j;
    }

    public String g() {
        return this.f39347l;
    }

    public Layout.Alignment h() {
        return this.f39351p;
    }

    public int i() {
        return this.f39349n;
    }

    public int j() {
        return this.f39348m;
    }

    public float k() {
        return this.f39354s;
    }

    public int l() {
        int i10 = this.f39343h;
        if (i10 == -1 && this.f39344i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f39344i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.f39350o;
    }

    public boolean n() {
        return this.f39352q == 1;
    }

    public b o() {
        return this.f39353r;
    }

    public boolean p() {
        return this.f39340e;
    }

    public boolean q() {
        return this.f39338c;
    }

    public boolean s() {
        return this.f39341f == 1;
    }

    public boolean t() {
        return this.f39342g == 1;
    }

    public g u(int i10) {
        this.f39339d = i10;
        this.f39340e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f39343h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f39337b = i10;
        this.f39338c = true;
        return this;
    }

    public g x(String str) {
        this.f39336a = str;
        return this;
    }

    public g y(float f10) {
        this.f39346k = f10;
        return this;
    }

    public g z(int i10) {
        this.f39345j = i10;
        return this;
    }
}
