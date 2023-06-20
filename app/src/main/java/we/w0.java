package we;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public abstract class w0 extends z {

    /* renamed from: a  reason: collision with root package name */
    private long f38664a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f38665b;

    /* renamed from: c  reason: collision with root package name */
    private kotlinx.coroutines.internal.a<r0<?>> f38666c;

    public static /* synthetic */ void C0(w0 w0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            w0Var.z0(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    private final long q0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final boolean E0() {
        return this.f38664a >= q0(true);
    }

    public final boolean H0() {
        kotlinx.coroutines.internal.a<r0<?>> aVar = this.f38666c;
        if (aVar != null) {
            return aVar.c();
        }
        return true;
    }

    public final boolean K0() {
        r0<?> d10;
        kotlinx.coroutines.internal.a<r0<?>> aVar = this.f38666c;
        if (aVar == null || (d10 = aVar.d()) == null) {
            return false;
        }
        d10.run();
        return true;
    }

    public final void m0(boolean z10) {
        long q02 = this.f38664a - q0(z10);
        this.f38664a = q02;
        if (q02 > 0) {
            return;
        }
        if (i0.a()) {
            if (!(this.f38664a == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f38665b) {
            shutdown();
        }
    }

    public final void r0(r0<?> r0Var) {
        qe.k.g(r0Var, "task");
        kotlinx.coroutines.internal.a<r0<?>> aVar = this.f38666c;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f38666c = aVar;
        }
        aVar.a(r0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long s0() {
        kotlinx.coroutines.internal.a<r0<?>> aVar = this.f38666c;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    protected void shutdown() {
    }

    public final void z0(boolean z10) {
        this.f38664a += q0(z10);
        if (z10) {
            return;
        }
        this.f38665b = true;
    }
}
