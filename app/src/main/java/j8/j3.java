package j8;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import j8.g;
import j8.j3;
import j8.x1;
import j9.c;

/* compiled from: Timeline.java */
/* loaded from: classes2.dex */
public abstract class j3 implements g {

    /* renamed from: a */
    public static final j3 f32506a = new a();

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    class a extends j3 {
        a() {
        }

        @Override // j8.j3
        public int b(Object obj) {
            return -1;
        }

        @Override // j8.j3
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j8.j3
        public int i() {
            return 0;
        }

        @Override // j8.j3
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j8.j3
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j8.j3
        public int p() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    public static final class b implements g {

        /* renamed from: h */
        public static final g.a<b> f32507h = new g.a() { // from class: j8.k3
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return j3.b.a(bundle);
            }
        };

        /* renamed from: a */
        public Object f32508a;

        /* renamed from: b */
        public Object f32509b;

        /* renamed from: c */
        public int f32510c;

        /* renamed from: d */
        public long f32511d;

        /* renamed from: e */
        public long f32512e;

        /* renamed from: f */
        public boolean f32513f;

        /* renamed from: g */
        private j9.c f32514g = j9.c.f32908g;

        public static /* synthetic */ b a(Bundle bundle) {
            return b(bundle);
        }

        public static b b(Bundle bundle) {
            j9.c cVar;
            int i10 = bundle.getInt(t(0), 0);
            long j10 = bundle.getLong(t(1), -9223372036854775807L);
            long j11 = bundle.getLong(t(2), 0L);
            boolean z10 = bundle.getBoolean(t(3));
            Bundle bundle2 = bundle.getBundle(t(4));
            if (bundle2 != null) {
                cVar = j9.c.f32910i.a(bundle2);
            } else {
                cVar = j9.c.f32908g;
            }
            j9.c cVar2 = cVar;
            b bVar = new b();
            bVar.v(null, null, i10, j10, j11, cVar2, z10);
            return bVar;
        }

        private static String t(int i10) {
            return Integer.toString(i10, 36);
        }

        public int c(int i10) {
            return this.f32514g.c(i10).f32919b;
        }

        public long d(int i10, int i11) {
            c.a c10 = this.f32514g.c(i10);
            if (c10.f32919b != -1) {
                return c10.f32922e[i11];
            }
            return -9223372036854775807L;
        }

        public int e() {
            return this.f32514g.f32912b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return ea.n0.c(this.f32508a, bVar.f32508a) && ea.n0.c(this.f32509b, bVar.f32509b) && this.f32510c == bVar.f32510c && this.f32511d == bVar.f32511d && this.f32512e == bVar.f32512e && this.f32513f == bVar.f32513f && ea.n0.c(this.f32514g, bVar.f32514g);
        }

        public int f(long j10) {
            return this.f32514g.d(j10, this.f32511d);
        }

        public int g(long j10) {
            return this.f32514g.e(j10, this.f32511d);
        }

        public long h(int i10) {
            return this.f32514g.c(i10).f32918a;
        }

        public int hashCode() {
            Object obj = this.f32508a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f32509b;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j10 = this.f32511d;
            long j11 = this.f32512e;
            return ((((((((((hashCode + hashCode2) * 31) + this.f32510c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f32513f ? 1 : 0)) * 31) + this.f32514g.hashCode();
        }

        public long i() {
            return this.f32514g.f32913c;
        }

        public int j(int i10, int i11) {
            c.a c10 = this.f32514g.c(i10);
            if (c10.f32919b != -1) {
                return c10.f32921d[i11];
            }
            return 0;
        }

        public long k(int i10) {
            return this.f32514g.c(i10).f32923f;
        }

        public long l() {
            return this.f32511d;
        }

        public int m(int i10) {
            return this.f32514g.c(i10).e();
        }

        public int n(int i10, int i11) {
            return this.f32514g.c(i10).f(i11);
        }

        public long o() {
            return ea.n0.Z0(this.f32512e);
        }

        public long p() {
            return this.f32512e;
        }

        public int q() {
            return this.f32514g.f32915e;
        }

        public boolean r(int i10) {
            return !this.f32514g.c(i10).g();
        }

        public boolean s(int i10) {
            return this.f32514g.c(i10).f32924g;
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11) {
            return v(obj, obj2, i10, j10, j11, j9.c.f32908g, false);
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11, j9.c cVar, boolean z10) {
            this.f32508a = obj;
            this.f32509b = obj2;
            this.f32510c = i10;
            this.f32511d = j10;
            this.f32512e = j11;
            this.f32514g = cVar;
            this.f32513f = z10;
            return this;
        }
    }

    /* compiled from: Timeline.java */
    /* loaded from: classes2.dex */
    public static final class c implements g {

        /* renamed from: r */
        public static final Object f32515r = new Object();

        /* renamed from: s */
        private static final Object f32516s = new Object();

        /* renamed from: t */
        private static final x1 f32517t = new x1.c().c("com.google.android.exoplayer2.Timeline").f(Uri.EMPTY).a();

        /* renamed from: u */
        public static final g.a<c> f32518u = new g.a() { // from class: j8.l3
            @Override // j8.g.a
            public final g a(Bundle bundle) {
                return j3.c.a(bundle);
            }
        };
        @Deprecated

        /* renamed from: b */
        public Object f32520b;

        /* renamed from: d */
        public Object f32522d;

        /* renamed from: e */
        public long f32523e;

        /* renamed from: f */
        public long f32524f;

        /* renamed from: g */
        public long f32525g;

        /* renamed from: h */
        public boolean f32526h;

        /* renamed from: i */
        public boolean f32527i;
        @Deprecated

        /* renamed from: j */
        public boolean f32528j;

        /* renamed from: k */
        public x1.g f32529k;

        /* renamed from: l */
        public boolean f32530l;

        /* renamed from: m */
        public long f32531m;

        /* renamed from: n */
        public long f32532n;

        /* renamed from: o */
        public int f32533o;

        /* renamed from: p */
        public int f32534p;

        /* renamed from: q */
        public long f32535q;

        /* renamed from: a */
        public Object f32519a = f32515r;

        /* renamed from: c */
        public x1 f32521c = f32517t;

        public static /* synthetic */ c a(Bundle bundle) {
            return b(bundle);
        }

        public static c b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(h(1));
            x1 a10 = bundle2 != null ? x1.f32818f.a(bundle2) : null;
            long j10 = bundle.getLong(h(2), -9223372036854775807L);
            long j11 = bundle.getLong(h(3), -9223372036854775807L);
            long j12 = bundle.getLong(h(4), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(h(5), false);
            boolean z11 = bundle.getBoolean(h(6), false);
            Bundle bundle3 = bundle.getBundle(h(7));
            x1.g a11 = bundle3 != null ? x1.g.f32865g.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(h(8), false);
            long j13 = bundle.getLong(h(9), 0L);
            long j14 = bundle.getLong(h(10), -9223372036854775807L);
            int i10 = bundle.getInt(h(11), 0);
            int i11 = bundle.getInt(h(12), 0);
            long j15 = bundle.getLong(h(13), 0L);
            c cVar = new c();
            cVar.i(f32516s, a10, null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            cVar.f32530l = z12;
            return cVar;
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return ea.n0.c0(this.f32525g);
        }

        public long d() {
            return ea.n0.Z0(this.f32531m);
        }

        public long e() {
            return this.f32531m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return ea.n0.c(this.f32519a, cVar.f32519a) && ea.n0.c(this.f32521c, cVar.f32521c) && ea.n0.c(this.f32522d, cVar.f32522d) && ea.n0.c(this.f32529k, cVar.f32529k) && this.f32523e == cVar.f32523e && this.f32524f == cVar.f32524f && this.f32525g == cVar.f32525g && this.f32526h == cVar.f32526h && this.f32527i == cVar.f32527i && this.f32530l == cVar.f32530l && this.f32531m == cVar.f32531m && this.f32532n == cVar.f32532n && this.f32533o == cVar.f32533o && this.f32534p == cVar.f32534p && this.f32535q == cVar.f32535q;
        }

        public long f() {
            return ea.n0.Z0(this.f32532n);
        }

        public boolean g() {
            ea.a.f(this.f32528j == (this.f32529k != null));
            return this.f32529k != null;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f32519a.hashCode()) * 31) + this.f32521c.hashCode()) * 31;
            Object obj = this.f32522d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            x1.g gVar = this.f32529k;
            int hashCode3 = gVar != null ? gVar.hashCode() : 0;
            long j10 = this.f32523e;
            long j11 = this.f32524f;
            long j12 = this.f32525g;
            long j13 = this.f32531m;
            long j14 = this.f32532n;
            long j15 = this.f32535q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f32526h ? 1 : 0)) * 31) + (this.f32527i ? 1 : 0)) * 31) + (this.f32530l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f32533o) * 31) + this.f32534p) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public c i(Object obj, x1 x1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, x1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            x1.h hVar;
            this.f32519a = obj;
            this.f32521c = x1Var != null ? x1Var : f32517t;
            this.f32520b = (x1Var == null || (hVar = x1Var.f32820b) == null) ? null : hVar.f32883h;
            this.f32522d = obj2;
            this.f32523e = j10;
            this.f32524f = j11;
            this.f32525g = j12;
            this.f32526h = z10;
            this.f32527i = z11;
            this.f32528j = gVar != null;
            this.f32529k = gVar;
            this.f32531m = j13;
            this.f32532n = j14;
            this.f32533o = i10;
            this.f32534p = i11;
            this.f32535q = j15;
            this.f32530l = false;
            return this;
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f32510c;
        if (n(i12, cVar).f32534p == i10) {
            int e10 = e(i12, i11, z10);
            if (e10 == -1) {
                return -1;
            }
            return n(e10, cVar).f32533o;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j3) {
            j3 j3Var = (j3) obj;
            if (j3Var.p() == p() && j3Var.i() == i()) {
                c cVar = new c();
                b bVar = new b();
                c cVar2 = new c();
                b bVar2 = new b();
                for (int i10 = 0; i10 < p(); i10++) {
                    if (!n(i10, cVar).equals(j3Var.n(i10, cVar2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < i(); i11++) {
                    if (!g(i11, bVar, true).equals(j3Var.g(i11, bVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (p10 * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) ea.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        ea.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f32533o;
        f(i11, bVar);
        while (i11 < cVar.f32534p && bVar.f32512e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f32512e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long j12 = j10 - bVar.f32512e;
        long j13 = bVar.f32511d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(ea.a.e(bVar.f32509b), Long.valueOf(Math.max(0L, j12)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        return d(i10, bVar, cVar, i11, z10) == -1;
    }
}
