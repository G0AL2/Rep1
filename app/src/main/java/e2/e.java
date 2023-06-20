package e2;

import c2.j;
import c2.k;
import c2.l;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<d2.c> f29513a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.h f29514b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29515c;

    /* renamed from: d  reason: collision with root package name */
    private final long f29516d;

    /* renamed from: e  reason: collision with root package name */
    private final a f29517e;

    /* renamed from: f  reason: collision with root package name */
    private final long f29518f;

    /* renamed from: g  reason: collision with root package name */
    private final String f29519g;

    /* renamed from: h  reason: collision with root package name */
    private final List<d2.h> f29520h;

    /* renamed from: i  reason: collision with root package name */
    private final l f29521i;

    /* renamed from: j  reason: collision with root package name */
    private final int f29522j;

    /* renamed from: k  reason: collision with root package name */
    private final int f29523k;

    /* renamed from: l  reason: collision with root package name */
    private final int f29524l;

    /* renamed from: m  reason: collision with root package name */
    private final float f29525m;

    /* renamed from: n  reason: collision with root package name */
    private final float f29526n;

    /* renamed from: o  reason: collision with root package name */
    private final int f29527o;

    /* renamed from: p  reason: collision with root package name */
    private final int f29528p;

    /* renamed from: q  reason: collision with root package name */
    private final j f29529q;

    /* renamed from: r  reason: collision with root package name */
    private final k f29530r;

    /* renamed from: s  reason: collision with root package name */
    private final c2.b f29531s;

    /* renamed from: t  reason: collision with root package name */
    private final List<j2.a<Float>> f29532t;

    /* renamed from: u  reason: collision with root package name */
    private final b f29533u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f29534v;

    /* renamed from: w  reason: collision with root package name */
    private final d2.a f29535w;

    /* renamed from: x  reason: collision with root package name */
    private final g2.j f29536x;

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<d2.c> list, com.airbnb.lottie.h hVar, String str, long j10, a aVar, long j11, String str2, List<d2.h> list2, l lVar, int i10, int i11, int i12, float f10, float f11, int i13, int i14, j jVar, k kVar, List<j2.a<Float>> list3, b bVar, c2.b bVar2, boolean z10, d2.a aVar2, g2.j jVar2) {
        this.f29513a = list;
        this.f29514b = hVar;
        this.f29515c = str;
        this.f29516d = j10;
        this.f29517e = aVar;
        this.f29518f = j11;
        this.f29519g = str2;
        this.f29520h = list2;
        this.f29521i = lVar;
        this.f29522j = i10;
        this.f29523k = i11;
        this.f29524l = i12;
        this.f29525m = f10;
        this.f29526n = f11;
        this.f29527o = i13;
        this.f29528p = i14;
        this.f29529q = jVar;
        this.f29530r = kVar;
        this.f29532t = list3;
        this.f29533u = bVar;
        this.f29531s = bVar2;
        this.f29534v = z10;
        this.f29535w = aVar2;
        this.f29536x = jVar2;
    }

    public d2.a a() {
        return this.f29535w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.airbnb.lottie.h b() {
        return this.f29514b;
    }

    public g2.j c() {
        return this.f29536x;
    }

    public long d() {
        return this.f29516d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<j2.a<Float>> e() {
        return this.f29532t;
    }

    public a f() {
        return this.f29517e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<d2.h> g() {
        return this.f29520h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h() {
        return this.f29533u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.f29515c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f29518f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f29528p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f29527o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return this.f29519g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<d2.c> n() {
        return this.f29513a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f29524l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f29523k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f29522j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.f29526n / this.f29514b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j s() {
        return this.f29529q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k t() {
        return this.f29530r;
    }

    public String toString() {
        return y("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2.b u() {
        return this.f29531s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v() {
        return this.f29525m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l w() {
        return this.f29521i;
    }

    public boolean x() {
        return this.f29534v;
    }

    public String y(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i());
        sb2.append("\n");
        e t10 = this.f29514b.t(j());
        if (t10 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t10.i());
            e t11 = this.f29514b.t(t10.j());
            while (t11 != null) {
                sb2.append("->");
                sb2.append(t11.i());
                t11 = this.f29514b.t(t11.j());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!g().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(g().size());
            sb2.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.f29513a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (d2.c cVar : this.f29513a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
