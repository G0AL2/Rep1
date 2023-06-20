package cf;

import ee.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import qe.k;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private boolean f5507a;

    /* renamed from: b  reason: collision with root package name */
    private a f5508b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f5509c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5510d;

    /* renamed from: e  reason: collision with root package name */
    private final e f5511e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5512f;

    public d(e eVar, String str) {
        k.f(eVar, "taskRunner");
        k.f(str, "name");
        this.f5511e = eVar;
        this.f5512f = str;
        this.f5509c = new ArrayList();
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this.f5511e) {
            if (b()) {
                this.f5511e.h(this);
            }
            u uVar = u.f29813a;
        }
    }

    public final boolean b() {
        a aVar = this.f5508b;
        if (aVar != null) {
            k.c(aVar);
            if (aVar.a()) {
                this.f5510d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f5509c.size() - 1; size >= 0; size--) {
            if (this.f5509c.get(size).a()) {
                a aVar2 = this.f5509c.get(size);
                if (e.f5515j.a().isLoggable(Level.FINE)) {
                    b.a(aVar2, this, "canceled");
                }
                this.f5509c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final a c() {
        return this.f5508b;
    }

    public final boolean d() {
        return this.f5510d;
    }

    public final List<a> e() {
        return this.f5509c;
    }

    public final String f() {
        return this.f5512f;
    }

    public final boolean g() {
        return this.f5507a;
    }

    public final e h() {
        return this.f5511e;
    }

    public final void i(a aVar, long j10) {
        k.f(aVar, "task");
        synchronized (this.f5511e) {
            if (this.f5507a) {
                if (aVar.a()) {
                    if (e.f5515j.a().isLoggable(Level.FINE)) {
                        b.a(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (e.f5515j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (k(aVar, j10, false)) {
                this.f5511e.h(this);
            }
            u uVar = u.f29813a;
        }
    }

    public final boolean k(a aVar, long j10, boolean z10) {
        String str;
        k.f(aVar, "task");
        aVar.e(this);
        long nanoTime = this.f5511e.g().nanoTime();
        long j11 = nanoTime + j10;
        int indexOf = this.f5509c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.f5515j.a().isLoggable(Level.FINE)) {
                    b.a(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f5509c.remove(indexOf);
        }
        aVar.g(j11);
        if (e.f5515j.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + b.b(j11 - nanoTime);
            } else {
                str = "scheduled after " + b.b(j11 - nanoTime);
            }
            b.a(aVar, this, str);
        }
        Iterator<a> it = this.f5509c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().c() - nanoTime > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f5509c.size();
        }
        this.f5509c.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(a aVar) {
        this.f5508b = aVar;
    }

    public final void m(boolean z10) {
        this.f5510d = z10;
    }

    public final void n() {
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this.f5511e) {
            this.f5507a = true;
            if (b()) {
                this.f5511e.h(this);
            }
            u uVar = u.f29813a;
        }
    }

    public String toString() {
        return this.f5512f;
    }
}
