package cf;

import qe.g;
import qe.k;

/* compiled from: Task.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private d f5502a;

    /* renamed from: b  reason: collision with root package name */
    private long f5503b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5504c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5505d;

    public a(String str, boolean z10) {
        k.f(str, "name");
        this.f5504c = str;
        this.f5505d = z10;
        this.f5503b = -1L;
    }

    public final boolean a() {
        return this.f5505d;
    }

    public final String b() {
        return this.f5504c;
    }

    public final long c() {
        return this.f5503b;
    }

    public final d d() {
        return this.f5502a;
    }

    public final void e(d dVar) {
        k.f(dVar, "queue");
        d dVar2 = this.f5502a;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 == null) {
            this.f5502a = dVar;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long f();

    public final void g(long j10) {
        this.f5503b = j10;
    }

    public String toString() {
        return this.f5504c;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
