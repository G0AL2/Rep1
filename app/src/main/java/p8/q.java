package p8;

import ea.n0;
import p8.r;
import p8.x;

/* compiled from: FlacSeekTableSeekMap.java */
/* loaded from: classes2.dex */
public final class q implements x {

    /* renamed from: a  reason: collision with root package name */
    private final r f35676a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35677b;

    public q(r rVar, long j10) {
        this.f35676a = rVar;
        this.f35677b = j10;
    }

    private y a(long j10, long j11) {
        return new y((j10 * 1000000) / this.f35676a.f35682e, this.f35677b + j11);
    }

    @Override // p8.x
    public x.a d(long j10) {
        ea.a.h(this.f35676a.f35688k);
        r rVar = this.f35676a;
        r.a aVar = rVar.f35688k;
        long[] jArr = aVar.f35690a;
        long[] jArr2 = aVar.f35691b;
        int i10 = n0.i(jArr, rVar.i(j10), true, false);
        y a10 = a(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a10.f35707a != j10 && i10 != jArr.length - 1) {
            int i11 = i10 + 1;
            return new x.a(a10, a(jArr[i11], jArr2[i11]));
        }
        return new x.a(a10);
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.x
    public long i() {
        return this.f35676a.f();
    }
}
