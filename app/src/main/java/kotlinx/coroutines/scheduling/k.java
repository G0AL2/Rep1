package kotlinx.coroutines.scheduling;

import we.j0;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class k extends i {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f33592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Runnable runnable, long j10, j jVar) {
        super(j10, jVar);
        qe.k.g(runnable, "block");
        qe.k.g(jVar, "taskContext");
        this.f33592c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f33592c.run();
        } finally {
            this.f33591b.L();
        }
    }

    public String toString() {
        return "Task[" + j0.a(this.f33592c) + '@' + j0.b(this.f33592c) + ", " + this.f33590a + ", " + this.f33591b + ']';
    }
}
