package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import we.b1;
import we.k0;
import we.z;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public class d extends b1 {

    /* renamed from: a  reason: collision with root package name */
    private a f33577a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33578b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33579c;

    /* renamed from: d  reason: collision with root package name */
    private final long f33580d;

    /* renamed from: e  reason: collision with root package name */
    private final String f33581e;

    public d(int i10, int i11, long j10, String str) {
        qe.k.g(str, "schedulerName");
        this.f33578b = i10;
        this.f33579c = i11;
        this.f33580d = j10;
        this.f33581e = str;
        this.f33577a = q0();
    }

    private final a q0() {
        return new a(this.f33578b, this.f33579c, this.f33580d, this.f33581e);
    }

    @Override // we.z
    public void g0(ie.g gVar, Runnable runnable) {
        qe.k.g(gVar, "context");
        qe.k.g(runnable, "block");
        try {
            a.s0(this.f33577a, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            k0.f38620g.g0(gVar, runnable);
        }
    }

    public final z m0(int i10) {
        if (i10 > 0) {
            return new f(this, i10, l.PROBABLY_BLOCKING);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i10).toString());
    }

    public final void r0(Runnable runnable, j jVar, boolean z10) {
        qe.k.g(runnable, "block");
        qe.k.g(jVar, "context");
        try {
            this.f33577a.r0(runnable, jVar, z10);
        } catch (RejectedExecutionException unused) {
            k0.f38620g.Z0(this.f33577a.m0(runnable, jVar));
        }
    }

    public /* synthetic */ d(int i10, int i11, String str, int i12, qe.g gVar) {
        this((i12 & 1) != 0 ? m.f33598c : i10, (i12 & 2) != 0 ? m.f33599d : i11, (i12 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, int i11, String str) {
        this(i10, i11, m.f33600e, str);
        qe.k.g(str, "schedulerName");
    }
}
