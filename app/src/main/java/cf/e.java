package cf;

import com.google.android.gms.common.api.Api;
import ee.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qe.g;
import qe.k;

/* compiled from: TaskRunner.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: i  reason: collision with root package name */
    private static final Logger f5514i;

    /* renamed from: a  reason: collision with root package name */
    private int f5516a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5517b;

    /* renamed from: c  reason: collision with root package name */
    private long f5518c;

    /* renamed from: d  reason: collision with root package name */
    private final List<cf.d> f5519d;

    /* renamed from: e  reason: collision with root package name */
    private final List<cf.d> f5520e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f5521f;

    /* renamed from: g  reason: collision with root package name */
    private final a f5522g;

    /* renamed from: j  reason: collision with root package name */
    public static final b f5515j = new b(null);

    /* renamed from: h  reason: collision with root package name */
    public static final e f5513h = new e(new c(ze.c.K(ze.c.f40526h + " TaskRunner", true)));

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final Logger a() {
            return e.f5514i;
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadPoolExecutor f5523a;

        public c(ThreadFactory threadFactory) {
            k.f(threadFactory, "threadFactory");
            this.f5523a = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // cf.e.a
        public void a(e eVar, long j10) throws InterruptedException {
            k.f(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        @Override // cf.e.a
        public void b(e eVar) {
            k.f(eVar, "taskRunner");
            eVar.notify();
        }

        @Override // cf.e.a
        public void execute(Runnable runnable) {
            k.f(runnable, "runnable");
            this.f5523a.execute(runnable);
        }

        @Override // cf.e.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: TaskRunner.kt */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cf.a d10;
            while (true) {
                synchronized (e.this) {
                    d10 = e.this.d();
                }
                if (d10 == null) {
                    return;
                }
                cf.d d11 = d10.d();
                k.c(d11);
                long j10 = -1;
                boolean isLoggable = e.f5515j.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = d11.h().g().nanoTime();
                    cf.b.c(d10, d11, "starting");
                }
                try {
                    e.this.j(d10);
                    u uVar = u.f29813a;
                    if (isLoggable) {
                        long nanoTime = d11.h().g().nanoTime() - j10;
                        cf.b.c(d10, d11, "finished run in " + cf.b.b(nanoTime));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long nanoTime2 = d11.h().g().nanoTime() - j10;
                        cf.b.c(d10, d11, "failed a run in " + cf.b.b(nanoTime2));
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f5514i = logger;
    }

    public e(a aVar) {
        k.f(aVar, "backend");
        this.f5522g = aVar;
        this.f5516a = 10000;
        this.f5519d = new ArrayList();
        this.f5520e = new ArrayList();
        this.f5521f = new d();
    }

    private final void c(cf.a aVar, long j10) {
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        cf.d d10 = aVar.d();
        k.c(d10);
        if (d10.c() == aVar) {
            boolean d11 = d10.d();
            d10.m(false);
            d10.l(null);
            this.f5519d.remove(d10);
            if (j10 != -1 && !d11 && !d10.g()) {
                d10.k(aVar, j10, true);
            }
            if (!d10.e().isEmpty()) {
                this.f5520e.add(d10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void e(cf.a aVar) {
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        aVar.g(-1L);
        cf.d d10 = aVar.d();
        k.c(d10);
        d10.e().remove(aVar);
        this.f5520e.remove(d10);
        d10.l(aVar);
        this.f5519d.add(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(cf.a aVar) {
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
        Thread currentThread2 = Thread.currentThread();
        k.e(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(aVar.b());
        try {
            long f10 = aVar.f();
            synchronized (this) {
                c(aVar, f10);
                u uVar = u.f29813a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                c(aVar, -1L);
                u uVar2 = u.f29813a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    public final cf.a d() {
        boolean z10;
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        while (!this.f5520e.isEmpty()) {
            long nanoTime = this.f5522g.nanoTime();
            long j10 = Long.MAX_VALUE;
            Iterator<cf.d> it = this.f5520e.iterator();
            cf.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                cf.a aVar2 = it.next().e().get(0);
                long max = Math.max(0L, aVar2.c() - nanoTime);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else if (aVar != null) {
                    z10 = true;
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f5517b && (!this.f5520e.isEmpty()))) {
                    this.f5522g.execute(this.f5521f);
                }
                return aVar;
            } else if (this.f5517b) {
                if (j10 < this.f5518c - nanoTime) {
                    this.f5522g.b(this);
                }
                return null;
            } else {
                this.f5517b = true;
                this.f5518c = nanoTime + j10;
                try {
                    try {
                        this.f5522g.a(this, j10);
                    } catch (InterruptedException unused) {
                        f();
                    }
                } finally {
                    this.f5517b = false;
                }
            }
        }
        return null;
    }

    public final void f() {
        for (int size = this.f5519d.size() - 1; size >= 0; size--) {
            this.f5519d.get(size).b();
        }
        for (int size2 = this.f5520e.size() - 1; size2 >= 0; size2--) {
            cf.d dVar = this.f5520e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f5520e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f5522g;
    }

    public final void h(cf.d dVar) {
        k.f(dVar, "taskQueue");
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (dVar.c() == null) {
            if (!dVar.e().isEmpty()) {
                ze.c.a(this.f5520e, dVar);
            } else {
                this.f5520e.remove(dVar);
            }
        }
        if (this.f5517b) {
            this.f5522g.b(this);
        } else {
            this.f5522g.execute(this.f5521f);
        }
    }

    public final cf.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f5516a;
            this.f5516a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new cf.d(this, sb2.toString());
    }
}
