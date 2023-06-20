package we;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
public final class p0<T> extends kotlinx.coroutines.internal.r<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38636e = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_decision");
    private volatile int _decision;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(ie.g gVar, ie.d<? super T> dVar) {
        super(gVar, dVar);
        qe.k.g(gVar, "context");
        qe.k.g(dVar, "uCont");
        this._decision = 0;
    }

    private final boolean u0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f38636e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean v0() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f38636e.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.r, we.p1
    public void k(Object obj, int i10) {
        if (u0()) {
            return;
        }
        super.k(obj, i10);
    }

    @Override // kotlinx.coroutines.internal.r, we.a
    public int n0() {
        return 1;
    }

    public final Object t0() {
        Object c10;
        if (v0()) {
            c10 = je.d.c();
            return c10;
        }
        Object e10 = q1.e(G());
        if (e10 instanceof r) {
            throw ((r) e10).f38650a;
        }
        return e10;
    }
}
