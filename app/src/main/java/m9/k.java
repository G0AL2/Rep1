package m9;

import ea.n0;
import j8.p1;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* compiled from: SegmentBase.java */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    final i f34390a;

    /* renamed from: b  reason: collision with root package name */
    final long f34391b;

    /* renamed from: c  reason: collision with root package name */
    final long f34392c;

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f34393d;

        /* renamed from: e  reason: collision with root package name */
        final long f34394e;

        /* renamed from: f  reason: collision with root package name */
        final List<d> f34395f;

        /* renamed from: g  reason: collision with root package name */
        private final long f34396g;

        /* renamed from: h  reason: collision with root package name */
        private final long f34397h;

        /* renamed from: i  reason: collision with root package name */
        final long f34398i;

        public a(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(iVar, j10, j11);
            this.f34393d = j12;
            this.f34394e = j13;
            this.f34395f = list;
            this.f34398i = j14;
            this.f34396g = j15;
            this.f34397h = j16;
        }

        public long c(long j10, long j11) {
            long g10 = g(j10);
            return g10 != -1 ? g10 : (int) (i((j11 - this.f34397h) + this.f34398i, j10) - d(j10, j11));
        }

        public long d(long j10, long j11) {
            if (g(j10) == -1) {
                long j12 = this.f34396g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(e(), i((j11 - this.f34397h) - j12, j10));
                }
            }
            return e();
        }

        public long e() {
            return this.f34393d;
        }

        public long f(long j10, long j11) {
            if (this.f34395f != null) {
                return -9223372036854775807L;
            }
            long d10 = d(j10, j11) + c(j10, j11);
            return (j(d10) + h(d10, j10)) - this.f34398i;
        }

        public abstract long g(long j10);

        public final long h(long j10, long j11) {
            List<d> list = this.f34395f;
            if (list != null) {
                return (list.get((int) (j10 - this.f34393d)).f34404b * 1000000) / this.f34391b;
            }
            long g10 = g(j11);
            if (g10 != -1 && j10 == (e() + g10) - 1) {
                return j11 - j(j10);
            }
            return (this.f34394e * 1000000) / this.f34391b;
        }

        public long i(long j10, long j11) {
            long e10 = e();
            long g10 = g(j11);
            if (g10 == 0) {
                return e10;
            }
            if (this.f34395f == null) {
                long j12 = this.f34393d + (j10 / ((this.f34394e * 1000000) / this.f34391b));
                return j12 < e10 ? e10 : g10 == -1 ? j12 : Math.min(j12, (e10 + g10) - 1);
            }
            long j13 = (g10 + e10) - 1;
            long j14 = e10;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                int i10 = (j(j15) > j10 ? 1 : (j(j15) == j10 ? 0 : -1));
                if (i10 < 0) {
                    j14 = j15 + 1;
                } else if (i10 <= 0) {
                    return j15;
                } else {
                    j13 = j15 - 1;
                }
            }
            return j14 == e10 ? j14 : j13;
        }

        public final long j(long j10) {
            long j11;
            List<d> list = this.f34395f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f34393d)).f34403a - this.f34392c;
            } else {
                j11 = (j10 - this.f34393d) * this.f34394e;
            }
            return n0.O0(j11, 1000000L, this.f34391b);
        }

        public abstract i k(j jVar, long j10);

        public boolean l() {
            return this.f34395f != null;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: j  reason: collision with root package name */
        final List<i> f34399j;

        public b(i iVar, long j10, long j11, long j12, long j13, List<d> list, long j14, List<i> list2, long j15, long j16) {
            super(iVar, j10, j11, j12, j13, list, j14, j15, j16);
            this.f34399j = list2;
        }

        @Override // m9.k.a
        public long g(long j10) {
            return this.f34399j.size();
        }

        @Override // m9.k.a
        public i k(j jVar, long j10) {
            return this.f34399j.get((int) (j10 - this.f34393d));
        }

        @Override // m9.k.a
        public boolean l() {
            return true;
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: j  reason: collision with root package name */
        final n f34400j;

        /* renamed from: k  reason: collision with root package name */
        final n f34401k;

        /* renamed from: l  reason: collision with root package name */
        final long f34402l;

        public c(i iVar, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, n nVar, n nVar2, long j16, long j17) {
            super(iVar, j10, j11, j12, j14, list, j15, j16, j17);
            this.f34400j = nVar;
            this.f34401k = nVar2;
            this.f34402l = j13;
        }

        @Override // m9.k
        public i a(j jVar) {
            n nVar = this.f34400j;
            if (nVar != null) {
                p1 p1Var = jVar.f34379a;
                return new i(nVar.a(p1Var.f32698a, 0L, p1Var.f32705h, 0L), 0L, -1L);
            }
            return super.a(jVar);
        }

        @Override // m9.k.a
        public long g(long j10) {
            List<d> list = this.f34395f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f34402l;
            if (j11 != -1) {
                return (j11 - this.f34393d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return lb.a.a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f34391b)), BigInteger.valueOf(this.f34394e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // m9.k.a
        public i k(j jVar, long j10) {
            long j11;
            List<d> list = this.f34395f;
            if (list != null) {
                j11 = list.get((int) (j10 - this.f34393d)).f34403a;
            } else {
                j11 = (j10 - this.f34393d) * this.f34394e;
            }
            long j12 = j11;
            n nVar = this.f34401k;
            p1 p1Var = jVar.f34379a;
            return new i(nVar.a(p1Var.f32698a, j10, p1Var.f32705h, j12), 0L, -1L);
        }
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final long f34403a;

        /* renamed from: b  reason: collision with root package name */
        final long f34404b;

        public d(long j10, long j11) {
            this.f34403a = j10;
            this.f34404b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f34403a == dVar.f34403a && this.f34404b == dVar.f34404b;
        }

        public int hashCode() {
            return (((int) this.f34403a) * 31) + ((int) this.f34404b);
        }
    }

    public k(i iVar, long j10, long j11) {
        this.f34390a = iVar;
        this.f34391b = j10;
        this.f34392c = j11;
    }

    public i a(j jVar) {
        return this.f34390a;
    }

    public long b() {
        return n0.O0(this.f34392c, 1000000L, this.f34391b);
    }

    /* compiled from: SegmentBase.java */
    /* loaded from: classes2.dex */
    public static class e extends k {

        /* renamed from: d  reason: collision with root package name */
        final long f34405d;

        /* renamed from: e  reason: collision with root package name */
        final long f34406e;

        public e(i iVar, long j10, long j11, long j12, long j13) {
            super(iVar, j10, j11);
            this.f34405d = j12;
            this.f34406e = j13;
        }

        public i c() {
            long j10 = this.f34406e;
            if (j10 <= 0) {
                return null;
            }
            return new i(null, this.f34405d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
