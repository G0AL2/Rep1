package w8;

import ea.n0;

/* compiled from: TrackSampleTable.java */
/* loaded from: classes2.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f38480a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38481b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f38482c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f38483d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38484e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f38485f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f38486g;

    /* renamed from: h  reason: collision with root package name */
    public final long f38487h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        ea.a.a(iArr.length == jArr2.length);
        ea.a.a(jArr.length == jArr2.length);
        ea.a.a(iArr2.length == jArr2.length);
        this.f38480a = oVar;
        this.f38482c = jArr;
        this.f38483d = iArr;
        this.f38484e = i10;
        this.f38485f = jArr2;
        this.f38486g = iArr2;
        this.f38487h = j10;
        this.f38481b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = n0.i(this.f38485f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f38486g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = n0.e(this.f38485f, j10, true, false); e10 < this.f38485f.length; e10++) {
            if ((this.f38486g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
