package j8;

import android.os.Bundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j8.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: Format.java */
/* loaded from: classes2.dex */
public final class p1 implements g {
    private static final p1 G = new b().E();
    public static final g.a<p1> H = new g.a() { // from class: j8.o1
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return p1.a(bundle);
        }
    };
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    private int F;

    /* renamed from: a */
    public final String f32698a;

    /* renamed from: b */
    public final String f32699b;

    /* renamed from: c */
    public final String f32700c;

    /* renamed from: d */
    public final int f32701d;

    /* renamed from: e */
    public final int f32702e;

    /* renamed from: f */
    public final int f32703f;

    /* renamed from: g */
    public final int f32704g;

    /* renamed from: h */
    public final int f32705h;

    /* renamed from: i */
    public final String f32706i;

    /* renamed from: j */
    public final Metadata f32707j;

    /* renamed from: k */
    public final String f32708k;

    /* renamed from: l */
    public final String f32709l;

    /* renamed from: m */
    public final int f32710m;

    /* renamed from: n */
    public final List<byte[]> f32711n;

    /* renamed from: o */
    public final DrmInitData f32712o;

    /* renamed from: p */
    public final long f32713p;

    /* renamed from: q */
    public final int f32714q;

    /* renamed from: r */
    public final int f32715r;

    /* renamed from: s */
    public final float f32716s;

    /* renamed from: t */
    public final int f32717t;

    /* renamed from: u */
    public final float f32718u;

    /* renamed from: v */
    public final byte[] f32719v;

    /* renamed from: w */
    public final int f32720w;

    /* renamed from: x */
    public final fa.b f32721x;

    /* renamed from: y */
    public final int f32722y;

    /* renamed from: z */
    public final int f32723z;

    /* compiled from: Format.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* renamed from: a */
        private String f32724a;

        /* renamed from: b */
        private String f32725b;

        /* renamed from: c */
        private String f32726c;

        /* renamed from: d */
        private int f32727d;

        /* renamed from: e */
        private int f32728e;

        /* renamed from: f */
        private int f32729f;

        /* renamed from: g */
        private int f32730g;

        /* renamed from: h */
        private String f32731h;

        /* renamed from: i */
        private Metadata f32732i;

        /* renamed from: j */
        private String f32733j;

        /* renamed from: k */
        private String f32734k;

        /* renamed from: l */
        private int f32735l;

        /* renamed from: m */
        private List<byte[]> f32736m;

        /* renamed from: n */
        private DrmInitData f32737n;

        /* renamed from: o */
        private long f32738o;

        /* renamed from: p */
        private int f32739p;

        /* renamed from: q */
        private int f32740q;

        /* renamed from: r */
        private float f32741r;

        /* renamed from: s */
        private int f32742s;

        /* renamed from: t */
        private float f32743t;

        /* renamed from: u */
        private byte[] f32744u;

        /* renamed from: v */
        private int f32745v;

        /* renamed from: w */
        private fa.b f32746w;

        /* renamed from: x */
        private int f32747x;

        /* renamed from: y */
        private int f32748y;

        /* renamed from: z */
        private int f32749z;

        public p1 E() {
            return new p1(this);
        }

        public b F(int i10) {
            this.C = i10;
            return this;
        }

        public b G(int i10) {
            this.f32729f = i10;
            return this;
        }

        public b H(int i10) {
            this.f32747x = i10;
            return this;
        }

        public b I(String str) {
            this.f32731h = str;
            return this;
        }

        public b J(fa.b bVar) {
            this.f32746w = bVar;
            return this;
        }

        public b K(String str) {
            this.f32733j = str;
            return this;
        }

        public b L(int i10) {
            this.D = i10;
            return this;
        }

        public b M(DrmInitData drmInitData) {
            this.f32737n = drmInitData;
            return this;
        }

        public b N(int i10) {
            this.A = i10;
            return this;
        }

        public b O(int i10) {
            this.B = i10;
            return this;
        }

        public b P(float f10) {
            this.f32741r = f10;
            return this;
        }

        public b Q(int i10) {
            this.f32740q = i10;
            return this;
        }

        public b R(int i10) {
            this.f32724a = Integer.toString(i10);
            return this;
        }

        public b S(String str) {
            this.f32724a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f32736m = list;
            return this;
        }

        public b U(String str) {
            this.f32725b = str;
            return this;
        }

        public b V(String str) {
            this.f32726c = str;
            return this;
        }

        public b W(int i10) {
            this.f32735l = i10;
            return this;
        }

        public b X(Metadata metadata) {
            this.f32732i = metadata;
            return this;
        }

        public b Y(int i10) {
            this.f32749z = i10;
            return this;
        }

        public b Z(int i10) {
            this.f32730g = i10;
            return this;
        }

        public b a0(float f10) {
            this.f32743t = f10;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f32744u = bArr;
            return this;
        }

        public b c0(int i10) {
            this.f32728e = i10;
            return this;
        }

        public b d0(int i10) {
            this.f32742s = i10;
            return this;
        }

        public b e0(String str) {
            this.f32734k = str;
            return this;
        }

        public b f0(int i10) {
            this.f32748y = i10;
            return this;
        }

        public b g0(int i10) {
            this.f32727d = i10;
            return this;
        }

        public b h0(int i10) {
            this.f32745v = i10;
            return this;
        }

        public b i0(long j10) {
            this.f32738o = j10;
            return this;
        }

        public b j0(int i10) {
            this.f32739p = i10;
            return this;
        }

        public b() {
            this.f32729f = -1;
            this.f32730g = -1;
            this.f32735l = -1;
            this.f32738o = Long.MAX_VALUE;
            this.f32739p = -1;
            this.f32740q = -1;
            this.f32741r = -1.0f;
            this.f32743t = 1.0f;
            this.f32745v = -1;
            this.f32747x = -1;
            this.f32748y = -1;
            this.f32749z = -1;
            this.C = -1;
            this.D = 0;
        }

        private b(p1 p1Var) {
            this.f32724a = p1Var.f32698a;
            this.f32725b = p1Var.f32699b;
            this.f32726c = p1Var.f32700c;
            this.f32727d = p1Var.f32701d;
            this.f32728e = p1Var.f32702e;
            this.f32729f = p1Var.f32703f;
            this.f32730g = p1Var.f32704g;
            this.f32731h = p1Var.f32706i;
            this.f32732i = p1Var.f32707j;
            this.f32733j = p1Var.f32708k;
            this.f32734k = p1Var.f32709l;
            this.f32735l = p1Var.f32710m;
            this.f32736m = p1Var.f32711n;
            this.f32737n = p1Var.f32712o;
            this.f32738o = p1Var.f32713p;
            this.f32739p = p1Var.f32714q;
            this.f32740q = p1Var.f32715r;
            this.f32741r = p1Var.f32716s;
            this.f32742s = p1Var.f32717t;
            this.f32743t = p1Var.f32718u;
            this.f32744u = p1Var.f32719v;
            this.f32745v = p1Var.f32720w;
            this.f32746w = p1Var.f32721x;
            this.f32747x = p1Var.f32722y;
            this.f32748y = p1Var.f32723z;
            this.f32749z = p1Var.A;
            this.A = p1Var.B;
            this.B = p1Var.C;
            this.C = p1Var.D;
            this.D = p1Var.E;
        }
    }

    public static /* synthetic */ p1 a(Bundle bundle) {
        return e(bundle);
    }

    private static <T> T d(T t10, T t11) {
        return t10 != null ? t10 : t11;
    }

    public static p1 e(Bundle bundle) {
        b bVar = new b();
        ea.b.a(bundle);
        int i10 = 0;
        String string = bundle.getString(h(0));
        p1 p1Var = G;
        bVar.S((String) d(string, p1Var.f32698a)).U((String) d(bundle.getString(h(1)), p1Var.f32699b)).V((String) d(bundle.getString(h(2)), p1Var.f32700c)).g0(bundle.getInt(h(3), p1Var.f32701d)).c0(bundle.getInt(h(4), p1Var.f32702e)).G(bundle.getInt(h(5), p1Var.f32703f)).Z(bundle.getInt(h(6), p1Var.f32704g)).I((String) d(bundle.getString(h(7)), p1Var.f32706i)).X((Metadata) d((Metadata) bundle.getParcelable(h(8)), p1Var.f32707j)).K((String) d(bundle.getString(h(9)), p1Var.f32708k)).e0((String) d(bundle.getString(h(10)), p1Var.f32709l)).W(bundle.getInt(h(11), p1Var.f32710m));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(i(i10));
            if (byteArray == null) {
                b M = bVar.T(arrayList).M((DrmInitData) bundle.getParcelable(h(13)));
                String h10 = h(14);
                p1 p1Var2 = G;
                M.i0(bundle.getLong(h10, p1Var2.f32713p)).j0(bundle.getInt(h(15), p1Var2.f32714q)).Q(bundle.getInt(h(16), p1Var2.f32715r)).P(bundle.getFloat(h(17), p1Var2.f32716s)).d0(bundle.getInt(h(18), p1Var2.f32717t)).a0(bundle.getFloat(h(19), p1Var2.f32718u)).b0(bundle.getByteArray(h(20))).h0(bundle.getInt(h(21), p1Var2.f32720w)).J((fa.b) ea.b.d(fa.b.f30201f, bundle.getBundle(h(22)))).H(bundle.getInt(h(23), p1Var2.f32722y)).f0(bundle.getInt(h(24), p1Var2.f32723z)).Y(bundle.getInt(h(25), p1Var2.A)).N(bundle.getInt(h(26), p1Var2.B)).O(bundle.getInt(h(27), p1Var2.C)).F(bundle.getInt(h(28), p1Var2.D)).L(bundle.getInt(h(29), p1Var2.E));
                return bVar.E();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }

    private static String h(int i10) {
        return Integer.toString(i10, 36);
    }

    private static String i(int i10) {
        String h10 = h(12);
        String num = Integer.toString(i10, 36);
        StringBuilder sb2 = new StringBuilder(String.valueOf(h10).length() + 1 + String.valueOf(num).length());
        sb2.append(h10);
        sb2.append("_");
        sb2.append(num);
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public p1 c(int i10) {
        return b().L(i10).E();
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || p1.class != obj.getClass()) {
            return false;
        }
        p1 p1Var = (p1) obj;
        int i11 = this.F;
        return (i11 == 0 || (i10 = p1Var.F) == 0 || i11 == i10) && this.f32701d == p1Var.f32701d && this.f32702e == p1Var.f32702e && this.f32703f == p1Var.f32703f && this.f32704g == p1Var.f32704g && this.f32710m == p1Var.f32710m && this.f32713p == p1Var.f32713p && this.f32714q == p1Var.f32714q && this.f32715r == p1Var.f32715r && this.f32717t == p1Var.f32717t && this.f32720w == p1Var.f32720w && this.f32722y == p1Var.f32722y && this.f32723z == p1Var.f32723z && this.A == p1Var.A && this.B == p1Var.B && this.C == p1Var.C && this.D == p1Var.D && this.E == p1Var.E && Float.compare(this.f32716s, p1Var.f32716s) == 0 && Float.compare(this.f32718u, p1Var.f32718u) == 0 && ea.n0.c(this.f32698a, p1Var.f32698a) && ea.n0.c(this.f32699b, p1Var.f32699b) && ea.n0.c(this.f32706i, p1Var.f32706i) && ea.n0.c(this.f32708k, p1Var.f32708k) && ea.n0.c(this.f32709l, p1Var.f32709l) && ea.n0.c(this.f32700c, p1Var.f32700c) && Arrays.equals(this.f32719v, p1Var.f32719v) && ea.n0.c(this.f32707j, p1Var.f32707j) && ea.n0.c(this.f32721x, p1Var.f32721x) && ea.n0.c(this.f32712o, p1Var.f32712o) && g(p1Var);
    }

    public int f() {
        int i10;
        int i11 = this.f32714q;
        if (i11 == -1 || (i10 = this.f32715r) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean g(p1 p1Var) {
        if (this.f32711n.size() != p1Var.f32711n.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f32711n.size(); i10++) {
            if (!Arrays.equals(this.f32711n.get(i10), p1Var.f32711n.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.F == 0) {
            String str = this.f32698a;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f32699b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f32700c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f32701d) * 31) + this.f32702e) * 31) + this.f32703f) * 31) + this.f32704g) * 31;
            String str4 = this.f32706i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f32707j;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f32708k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f32709l;
            this.F = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f32710m) * 31) + ((int) this.f32713p)) * 31) + this.f32714q) * 31) + this.f32715r) * 31) + Float.floatToIntBits(this.f32716s)) * 31) + this.f32717t) * 31) + Float.floatToIntBits(this.f32718u)) * 31) + this.f32720w) * 31) + this.f32722y) * 31) + this.f32723z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E;
        }
        return this.F;
    }

    public p1 j(p1 p1Var) {
        String str;
        Metadata e10;
        if (this == p1Var) {
            return this;
        }
        int l10 = ea.v.l(this.f32709l);
        String str2 = p1Var.f32698a;
        String str3 = p1Var.f32699b;
        if (str3 == null) {
            str3 = this.f32699b;
        }
        String str4 = this.f32700c;
        if ((l10 == 3 || l10 == 1) && (str = p1Var.f32700c) != null) {
            str4 = str;
        }
        int i10 = this.f32703f;
        if (i10 == -1) {
            i10 = p1Var.f32703f;
        }
        int i11 = this.f32704g;
        if (i11 == -1) {
            i11 = p1Var.f32704g;
        }
        String str5 = this.f32706i;
        if (str5 == null) {
            String L = ea.n0.L(p1Var.f32706i, l10);
            if (ea.n0.T0(L).length == 1) {
                str5 = L;
            }
        }
        Metadata metadata = this.f32707j;
        if (metadata == null) {
            e10 = p1Var.f32707j;
        } else {
            e10 = metadata.e(p1Var.f32707j);
        }
        float f10 = this.f32716s;
        if (f10 == -1.0f && l10 == 2) {
            f10 = p1Var.f32716s;
        }
        int i12 = this.f32701d | p1Var.f32701d;
        return b().S(str2).U(str3).V(str4).g0(i12).c0(this.f32702e | p1Var.f32702e).G(i10).Z(i11).I(str5).X(e10).M(DrmInitData.g(p1Var.f32712o, this.f32712o)).P(f10).E();
    }

    public String toString() {
        String str = this.f32698a;
        String str2 = this.f32699b;
        String str3 = this.f32708k;
        String str4 = this.f32709l;
        String str5 = this.f32706i;
        int i10 = this.f32705h;
        String str6 = this.f32700c;
        int i11 = this.f32714q;
        int i12 = this.f32715r;
        float f10 = this.f32716s;
        int i13 = this.f32722y;
        int i14 = this.f32723z;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }

    private p1(b bVar) {
        this.f32698a = bVar.f32724a;
        this.f32699b = bVar.f32725b;
        this.f32700c = ea.n0.E0(bVar.f32726c);
        this.f32701d = bVar.f32727d;
        this.f32702e = bVar.f32728e;
        int i10 = bVar.f32729f;
        this.f32703f = i10;
        int i11 = bVar.f32730g;
        this.f32704g = i11;
        this.f32705h = i11 != -1 ? i11 : i10;
        this.f32706i = bVar.f32731h;
        this.f32707j = bVar.f32732i;
        this.f32708k = bVar.f32733j;
        this.f32709l = bVar.f32734k;
        this.f32710m = bVar.f32735l;
        this.f32711n = bVar.f32736m == null ? Collections.emptyList() : bVar.f32736m;
        DrmInitData drmInitData = bVar.f32737n;
        this.f32712o = drmInitData;
        this.f32713p = bVar.f32738o;
        this.f32714q = bVar.f32739p;
        this.f32715r = bVar.f32740q;
        this.f32716s = bVar.f32741r;
        this.f32717t = bVar.f32742s == -1 ? 0 : bVar.f32742s;
        this.f32718u = bVar.f32743t == -1.0f ? 1.0f : bVar.f32743t;
        this.f32719v = bVar.f32744u;
        this.f32720w = bVar.f32745v;
        this.f32721x = bVar.f32746w;
        this.f32722y = bVar.f32747x;
        this.f32723z = bVar.f32748y;
        this.A = bVar.f32749z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B != -1 ? bVar.B : 0;
        this.D = bVar.C;
        if (bVar.D != 0 || drmInitData == null) {
            this.E = bVar.D;
        } else {
            this.E = 1;
        }
    }
}
