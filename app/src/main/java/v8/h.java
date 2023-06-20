package v8;

import ea.a0;
import ea.n0;
import ea.r;
import l8.e0;
import p8.x;
import p8.y;

/* compiled from: VbriSeeker.java */
/* loaded from: classes2.dex */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f38001a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f38002b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38003c;

    /* renamed from: d  reason: collision with root package name */
    private final long f38004d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f38001a = jArr;
        this.f38002b = jArr2;
        this.f38003c = j10;
        this.f38004d = j11;
    }

    public static h a(long j10, long j11, e0.a aVar, a0 a0Var) {
        int D;
        a0Var.Q(10);
        int n10 = a0Var.n();
        if (n10 <= 0) {
            return null;
        }
        int i10 = aVar.f33807d;
        long O0 = n0.O0(n10, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int J = a0Var.J();
        int J2 = a0Var.J();
        int J3 = a0Var.J();
        a0Var.Q(2);
        long j12 = j11 + aVar.f33806c;
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        int i11 = 0;
        long j13 = j11;
        while (i11 < J) {
            int i12 = J2;
            long j14 = j12;
            jArr[i11] = (i11 * O0) / J;
            jArr2[i11] = Math.max(j13, j14);
            if (J3 == 1) {
                D = a0Var.D();
            } else if (J3 == 2) {
                D = a0Var.J();
            } else if (J3 == 3) {
                D = a0Var.G();
            } else if (J3 != 4) {
                return null;
            } else {
                D = a0Var.H();
            }
            j13 += D * i12;
            i11++;
            j12 = j14;
            J2 = i12;
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sb2 = new StringBuilder(67);
            sb2.append("VBRI data size mismatch: ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j13);
            r.h("VbriSeeker", sb2.toString());
        }
        return new h(jArr, jArr2, O0, j13);
    }

    @Override // v8.g
    public long b(long j10) {
        return this.f38001a[n0.i(this.f38002b, j10, true, true)];
    }

    @Override // p8.x
    public x.a d(long j10) {
        int i10 = n0.i(this.f38001a, j10, true, true);
        y yVar = new y(this.f38001a[i10], this.f38002b[i10]);
        if (yVar.f35707a < j10 && i10 != this.f38001a.length - 1) {
            int i11 = i10 + 1;
            return new x.a(yVar, new y(this.f38001a[i11], this.f38002b[i11]));
        }
        return new x.a(yVar);
    }

    @Override // v8.g
    public long e() {
        return this.f38004d;
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.x
    public long i() {
        return this.f38003c;
    }
}
