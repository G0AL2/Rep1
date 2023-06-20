package we;

import java.util.concurrent.CancellationException;

/* compiled from: NonCancellable.kt */
/* loaded from: classes3.dex */
public final class u1 extends ie.a implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final u1 f38661a = new u1();

    private u1() {
        super(i1.f38615f0);
    }

    @Override // we.i1
    public boolean a() {
        return true;
    }

    @Override // we.i1
    public t0 d(boolean z10, boolean z11, pe.l<? super Throwable, ee.u> lVar) {
        qe.k.g(lVar, "handler");
        return v1.f38663a;
    }

    @Override // we.i1
    public m d0(o oVar) {
        qe.k.g(oVar, "child");
        return v1.f38663a;
    }

    @Override // we.i1
    public CancellationException l() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // we.i1
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // we.i1
    public void z(CancellationException cancellationException) {
    }
}
