package l9;

import m9.i;

/* compiled from: DashWrappingSegmentIndex.java */
/* loaded from: classes2.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p8.d f34023a;

    /* renamed from: b  reason: collision with root package name */
    private final long f34024b;

    public g(p8.d dVar, long j10) {
        this.f34023a = dVar;
        this.f34024b = j10;
    }

    @Override // l9.f
    public long b(long j10) {
        return this.f34023a.f35630e[(int) j10] - this.f34024b;
    }

    @Override // l9.f
    public long c(long j10, long j11) {
        return this.f34023a.f35629d[(int) j10];
    }

    @Override // l9.f
    public long d(long j10, long j11) {
        return 0L;
    }

    @Override // l9.f
    public long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l9.f
    public i f(long j10) {
        p8.d dVar = this.f34023a;
        int i10 = (int) j10;
        return new i(null, dVar.f35628c[i10], dVar.f35627b[i10]);
    }

    @Override // l9.f
    public long g(long j10, long j11) {
        return this.f34023a.a(j10 + this.f34024b);
    }

    @Override // l9.f
    public long h(long j10) {
        return this.f34023a.f35626a;
    }

    @Override // l9.f
    public boolean i() {
        return true;
    }

    @Override // l9.f
    public long j() {
        return 0L;
    }

    @Override // l9.f
    public long k(long j10, long j11) {
        return this.f34023a.f35626a;
    }
}
