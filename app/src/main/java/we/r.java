package we;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletedExceptionally.kt */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38649b = AtomicIntegerFieldUpdater.newUpdater(r.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f38650a;

    public r(Throwable th, boolean z10) {
        qe.k.g(th, "cause");
        this.f38650a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f38649b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return j0.a(this) + '[' + this.f38650a + ']';
    }

    public /* synthetic */ r(Throwable th, boolean z10, int i10, qe.g gVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
