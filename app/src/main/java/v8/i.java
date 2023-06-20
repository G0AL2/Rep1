package v8;

import ea.a0;
import ea.n0;
import ea.r;
import l8.e0;
import p8.x;
import p8.y;

/* compiled from: XingSeeker.java */
/* loaded from: classes2.dex */
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f38005a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38006b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38007c;

    /* renamed from: d  reason: collision with root package name */
    private final long f38008d;

    /* renamed from: e  reason: collision with root package name */
    private final long f38009e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f38010f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static i a(long j10, long j11, e0.a aVar, a0 a0Var) {
        int H;
        int i10 = aVar.f33810g;
        int i11 = aVar.f33807d;
        int n10 = a0Var.n();
        if ((n10 & 1) != 1 || (H = a0Var.H()) == 0) {
            return null;
        }
        long O0 = n0.O0(H, i10 * 1000000, i11);
        if ((n10 & 6) != 6) {
            return new i(j11, aVar.f33806c, O0);
        }
        long F = a0Var.F();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = a0Var.D();
        }
        if (j10 != -1) {
            long j12 = j11 + F;
            if (j10 != j12) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j10);
                sb2.append(", ");
                sb2.append(j12);
                r.h("XingSeeker", sb2.toString());
            }
        }
        return new i(j11, aVar.f33806c, O0, F, jArr);
    }

    private long c(int i10) {
        return (this.f38007c * i10) / 100;
    }

    @Override // v8.g
    public long b(long j10) {
        long j11 = j10 - this.f38005a;
        if (!f() || j11 <= this.f38006b) {
            return 0L;
        }
        long[] jArr = (long[]) ea.a.h(this.f38010f);
        double d10 = (j11 * 256.0d) / this.f38008d;
        int i10 = n0.i(jArr, (long) d10, true, true);
        long c10 = c(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long c11 = c(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return c10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (c11 - c10));
    }

    @Override // p8.x
    public x.a d(long j10) {
        long[] jArr;
        if (!f()) {
            return new x.a(new y(0L, this.f38005a + this.f38006b));
        }
        long r10 = n0.r(j10, 0L, this.f38007c);
        double d10 = (r10 * 100.0d) / this.f38007c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) ea.a.h(this.f38010f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
            }
        }
        return new x.a(new y(r10, this.f38005a + n0.r(Math.round((d11 / 256.0d) * this.f38008d), this.f38006b, this.f38008d - 1)));
    }

    @Override // v8.g
    public long e() {
        return this.f38009e;
    }

    @Override // p8.x
    public boolean f() {
        return this.f38010f != null;
    }

    @Override // p8.x
    public long i() {
        return this.f38007c;
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f38005a = j10;
        this.f38006b = i10;
        this.f38007c = j11;
        this.f38010f = jArr;
        this.f38008d = j12;
        this.f38009e = j12 != -1 ? j10 + j12 : -1L;
    }
}
