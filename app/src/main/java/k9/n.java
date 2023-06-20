package k9;

import j8.p1;

/* compiled from: MediaChunk.java */
/* loaded from: classes2.dex */
public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f33436j;

    public n(da.l lVar, da.p pVar, p1 p1Var, int i10, Object obj, long j10, long j11, long j12) {
        super(lVar, pVar, 1, p1Var, i10, obj, j10, j11);
        ea.a.e(p1Var);
        this.f33436j = j12;
    }

    public long f() {
        long j10 = this.f33436j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean g();
}
