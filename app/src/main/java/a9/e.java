package a9;

import ea.n0;
import p8.x;
import p8.y;

/* compiled from: WavSeekMap.java */
/* loaded from: classes2.dex */
final class e implements x {

    /* renamed from: a  reason: collision with root package name */
    private final c f155a;

    /* renamed from: b  reason: collision with root package name */
    private final int f156b;

    /* renamed from: c  reason: collision with root package name */
    private final long f157c;

    /* renamed from: d  reason: collision with root package name */
    private final long f158d;

    /* renamed from: e  reason: collision with root package name */
    private final long f159e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f155a = cVar;
        this.f156b = i10;
        this.f157c = j10;
        long j12 = (j11 - j10) / cVar.f150d;
        this.f158d = j12;
        this.f159e = a(j12);
    }

    private long a(long j10) {
        return n0.O0(j10 * this.f156b, 1000000L, this.f155a.f149c);
    }

    @Override // p8.x
    public x.a d(long j10) {
        long r10 = n0.r((this.f155a.f149c * j10) / (this.f156b * 1000000), 0L, this.f158d - 1);
        long j11 = this.f157c + (this.f155a.f150d * r10);
        long a10 = a(r10);
        y yVar = new y(a10, j11);
        if (a10 < j10 && r10 != this.f158d - 1) {
            long j12 = r10 + 1;
            return new x.a(yVar, new y(a(j12), this.f157c + (this.f155a.f150d * j12)));
        }
        return new x.a(yVar);
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.x
    public long i() {
        return this.f159e;
    }
}
