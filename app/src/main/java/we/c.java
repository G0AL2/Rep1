package we;

/* compiled from: EventLoop.kt */
/* loaded from: classes3.dex */
public final class c extends x0 {

    /* renamed from: f  reason: collision with root package name */
    private final Thread f38590f;

    public c(Thread thread) {
        qe.k.g(thread, "thread");
        this.f38590f = thread;
    }

    @Override // we.y0
    protected Thread N0() {
        return this.f38590f;
    }
}
