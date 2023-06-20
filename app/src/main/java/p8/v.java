package p8;

import ea.n0;
import p8.x;

/* compiled from: IndexSeekMap.java */
/* loaded from: classes2.dex */
public final class v implements x {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f35697a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f35698b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35699c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f35700d;

    public v(long[] jArr, long[] jArr2, long j10) {
        ea.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f35700d = z10;
        if (z10 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f35697a = jArr3;
            long[] jArr4 = new long[i10];
            this.f35698b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f35697a = jArr;
            this.f35698b = jArr2;
        }
        this.f35699c = j10;
    }

    @Override // p8.x
    public x.a d(long j10) {
        if (!this.f35700d) {
            return new x.a(y.f35706c);
        }
        int i10 = n0.i(this.f35698b, j10, true, true);
        y yVar = new y(this.f35698b[i10], this.f35697a[i10]);
        if (yVar.f35707a != j10 && i10 != this.f35698b.length - 1) {
            int i11 = i10 + 1;
            return new x.a(yVar, new y(this.f35698b[i11], this.f35697a[i11]));
        }
        return new x.a(yVar);
    }

    @Override // p8.x
    public boolean f() {
        return this.f35700d;
    }

    @Override // p8.x
    public long i() {
        return this.f35699c;
    }
}
