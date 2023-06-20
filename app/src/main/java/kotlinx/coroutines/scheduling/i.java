package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public abstract class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public long f33590a;

    /* renamed from: b  reason: collision with root package name */
    public j f33591b;

    public i(long j10, j jVar) {
        qe.k.g(jVar, "taskContext");
        this.f33590a = j10;
        this.f33591b = jVar;
    }

    public final l a() {
        return this.f33591b.Z();
    }

    public i() {
        this(0L, h.f33589b);
    }
}
