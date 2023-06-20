package we;

import we.i1;

/* compiled from: JobSupport.kt */
/* loaded from: classes3.dex */
public abstract class o1<J extends i1> extends v implements t0, d1 {

    /* renamed from: d  reason: collision with root package name */
    public final J f38630d;

    public o1(J j10) {
        qe.k.g(j10, "job");
        this.f38630d = j10;
    }

    @Override // we.d1
    public boolean a() {
        return true;
    }

    @Override // we.d1
    public t1 d() {
        return null;
    }

    @Override // we.t0
    public void f() {
        J j10 = this.f38630d;
        if (j10 == null) {
            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        }
        ((p1) j10).a0(this);
    }
}
