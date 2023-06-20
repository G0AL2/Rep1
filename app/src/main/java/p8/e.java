package p8;

import p8.x;

/* compiled from: ConstantBitrateSeekMap.java */
/* loaded from: classes2.dex */
public class e implements x {

    /* renamed from: a  reason: collision with root package name */
    private final long f35641a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35642b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35643c;

    /* renamed from: d  reason: collision with root package name */
    private final long f35644d;

    /* renamed from: e  reason: collision with root package name */
    private final int f35645e;

    /* renamed from: f  reason: collision with root package name */
    private final long f35646f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35647g;

    public e(long j10, long j11, int i10, int i11, boolean z10) {
        this.f35641a = j10;
        this.f35642b = j11;
        this.f35643c = i11 == -1 ? 1 : i11;
        this.f35645e = i10;
        this.f35647g = z10;
        if (j10 == -1) {
            this.f35644d = -1L;
            this.f35646f = -9223372036854775807L;
            return;
        }
        this.f35644d = j10 - j11;
        this.f35646f = g(j10, j11, i10);
    }

    private long a(long j10) {
        int i10 = this.f35643c;
        long j11 = (((j10 * this.f35645e) / 8000000) / i10) * i10;
        long j12 = this.f35644d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f35642b + Math.max(j11, 0L);
    }

    private static long g(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public long c(long j10) {
        return g(j10, this.f35642b, this.f35645e);
    }

    @Override // p8.x
    public x.a d(long j10) {
        if (this.f35644d == -1 && !this.f35647g) {
            return new x.a(new y(0L, this.f35642b));
        }
        long a10 = a(j10);
        long c10 = c(a10);
        y yVar = new y(c10, a10);
        if (this.f35644d != -1 && c10 < j10) {
            int i10 = this.f35643c;
            if (i10 + a10 < this.f35641a) {
                long j11 = a10 + i10;
                return new x.a(yVar, new y(c(j11), j11));
            }
        }
        return new x.a(yVar);
    }

    @Override // p8.x
    public boolean f() {
        return this.f35644d != -1 || this.f35647g;
    }

    @Override // p8.x
    public long i() {
        return this.f35646f;
    }
}
