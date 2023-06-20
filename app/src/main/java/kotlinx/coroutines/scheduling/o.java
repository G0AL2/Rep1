package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33602b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f33603c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f33604d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex");

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<i> f33605a = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;
    volatile int consumerIndex = 0;

    private final void d(e eVar, i iVar) {
        if (!eVar.a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    private final void g(e eVar) {
        int b10;
        i iVar;
        b10 = se.f.b(e() / 2, 1);
        for (int i10 = 0; i10 < b10; i10++) {
            while (true) {
                int i11 = this.consumerIndex;
                iVar = null;
                if (i11 - this.producerIndex == 0) {
                    break;
                }
                int i12 = i11 & 127;
                if (((i) this.f33605a.get(i12)) != null && f33604d.compareAndSet(this, i11, i11 + 1)) {
                    iVar = (i) this.f33605a.getAndSet(i12, null);
                    break;
                }
            }
            if (iVar == null) {
                return;
            }
            d(eVar, iVar);
        }
    }

    private final boolean j(i iVar) {
        if (e() == 127) {
            return false;
        }
        int i10 = this.producerIndex & 127;
        if (this.f33605a.get(i10) != null) {
            return false;
        }
        this.f33605a.lazySet(i10, iVar);
        f33603c.incrementAndGet(this);
        return true;
    }

    private final boolean l(long j10, o oVar, e eVar) {
        i iVar = (i) oVar.lastScheduledTask;
        if (iVar == null || j10 - iVar.f33590a < m.f33596a || !f33602b.compareAndSet(oVar, iVar, null)) {
            return false;
        }
        b(iVar, eVar);
        return true;
    }

    public final boolean b(i iVar, e eVar) {
        qe.k.g(iVar, "task");
        qe.k.g(eVar, "globalQueue");
        i iVar2 = (i) f33602b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return c(iVar2, eVar);
        }
        return true;
    }

    public final boolean c(i iVar, e eVar) {
        qe.k.g(iVar, "task");
        qe.k.g(eVar, "globalQueue");
        boolean z10 = true;
        while (!j(iVar)) {
            g(eVar);
            z10 = false;
        }
        return z10;
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final void f(e eVar) {
        i iVar;
        qe.k.g(eVar, "globalQueue");
        i iVar2 = (i) f33602b.getAndSet(this, null);
        if (iVar2 != null) {
            d(eVar, iVar2);
        }
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                iVar = null;
            } else {
                int i11 = i10 & 127;
                if (((i) this.f33605a.get(i11)) != null && f33604d.compareAndSet(this, i10, i10 + 1)) {
                    iVar = (i) this.f33605a.getAndSet(i11, null);
                }
            }
            if (iVar == null) {
                return;
            }
            d(eVar, iVar);
        }
    }

    public final i h() {
        i iVar = (i) f33602b.getAndSet(this, null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (((i) this.f33605a.get(i11)) != null && f33604d.compareAndSet(this, i10, i10 + 1)) {
                return (i) this.f33605a.getAndSet(i11, null);
            }
        }
    }

    public final int i() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final boolean k(o oVar, e eVar) {
        int b10;
        i iVar;
        qe.k.g(oVar, "victim");
        qe.k.g(eVar, "globalQueue");
        long a10 = m.f33601f.a();
        int e10 = oVar.e();
        if (e10 == 0) {
            return l(a10, oVar, eVar);
        }
        b10 = se.f.b(e10 / 2, 1);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < b10) {
            while (true) {
                int i11 = oVar.consumerIndex;
                iVar = null;
                if (i11 - oVar.producerIndex != 0) {
                    int i12 = i11 & 127;
                    i iVar2 = (i) oVar.f33605a.get(i12);
                    if (iVar2 != null) {
                        if (!(a10 - iVar2.f33590a >= m.f33596a || oVar.e() > m.f33597b)) {
                            break;
                        } else if (f33604d.compareAndSet(oVar, i11, i11 + 1)) {
                            iVar = (i) oVar.f33605a.getAndSet(i12, null);
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if (iVar == null) {
                break;
            }
            b(iVar, eVar);
            i10++;
            z10 = true;
        }
        return z10;
    }
}
