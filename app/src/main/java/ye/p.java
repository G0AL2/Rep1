package ye;

import com.google.android.gms.common.api.Api;
import df.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    private Runnable f39737c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f39738d;

    /* renamed from: a  reason: collision with root package name */
    private int f39735a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f39736b = 5;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<e.a> f39739e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<e.a> f39740f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<df.e> f39741g = new ArrayDeque<>();

    private final e.a e(String str) {
        Iterator<e.a> it = this.f39740f.iterator();
        while (it.hasNext()) {
            e.a next = it.next();
            if (qe.k.a(next.d(), str)) {
                return next;
            }
        }
        Iterator<e.a> it2 = this.f39739e.iterator();
        while (it2.hasNext()) {
            e.a next2 = it2.next();
            if (qe.k.a(next2.d(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void f(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f39737c;
                ee.u uVar = ee.u.f29813a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (i() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean i() {
        int i10;
        boolean z10;
        if (ze.c.f40525g && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            qe.k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f39739e.iterator();
            qe.k.e(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a next = it.next();
                if (this.f39740f.size() >= this.f39735a) {
                    break;
                } else if (next.c().get() < this.f39736b) {
                    it.remove();
                    next.c().incrementAndGet();
                    qe.k.e(next, "asyncCall");
                    arrayList.add(next);
                    this.f39740f.add(next);
                }
            }
            z10 = l() > 0;
            ee.u uVar = ee.u.f29813a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((e.a) arrayList.get(i10)).a(d());
        }
        return z10;
    }

    public final synchronized void a() {
        Iterator<e.a> it = this.f39739e.iterator();
        while (it.hasNext()) {
            it.next().b().cancel();
        }
        Iterator<e.a> it2 = this.f39740f.iterator();
        while (it2.hasNext()) {
            it2.next().b().cancel();
        }
        Iterator<df.e> it3 = this.f39741g.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void b(e.a aVar) {
        e.a e10;
        qe.k.f(aVar, "call");
        synchronized (this) {
            this.f39739e.add(aVar);
            if (!aVar.b().o() && (e10 = e(aVar.d())) != null) {
                aVar.e(e10);
            }
            ee.u uVar = ee.u.f29813a;
        }
        i();
    }

    public final synchronized void c(df.e eVar) {
        qe.k.f(eVar, "call");
        this.f39741g.add(eVar);
    }

    public final synchronized ExecutorService d() {
        ExecutorService executorService;
        if (this.f39738d == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            this.f39738d = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, ze.c.K(ze.c.f40526h + " Dispatcher", false));
        }
        executorService = this.f39738d;
        qe.k.c(executorService);
        return executorService;
    }

    public final void g(e.a aVar) {
        qe.k.f(aVar, "call");
        aVar.c().decrementAndGet();
        f(this.f39740f, aVar);
    }

    public final void h(df.e eVar) {
        qe.k.f(eVar, "call");
        f(this.f39741g, eVar);
    }

    public final synchronized List<e> j() {
        int p10;
        List<e> unmodifiableList;
        ArrayDeque<e.a> arrayDeque = this.f39739e;
        p10 = fe.q.p(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(p10);
        for (e.a aVar : arrayDeque) {
            arrayList.add(aVar.b());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        qe.k.e(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized List<e> k() {
        int p10;
        List E;
        List<e> unmodifiableList;
        ArrayDeque<df.e> arrayDeque = this.f39741g;
        ArrayDeque<e.a> arrayDeque2 = this.f39740f;
        p10 = fe.q.p(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(p10);
        for (e.a aVar : arrayDeque2) {
            arrayList.add(aVar.b());
        }
        E = fe.x.E(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(E);
        qe.k.e(unmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int l() {
        return this.f39740f.size() + this.f39741g.size();
    }
}
