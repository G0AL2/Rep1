package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.Utils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8396b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f8397c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8398d;

    /* renamed from: e  reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f8399e;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8402h;

    /* renamed from: a  reason: collision with root package name */
    private final String f8395a = "TaskManager";

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f8400f = new ArrayList(5);

    /* renamed from: g  reason: collision with root package name */
    private final Object f8401g = new Object();

    /* loaded from: classes.dex */
    public enum a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements ThreadFactory {

        /* renamed from: b  reason: collision with root package name */
        private final String f8425b;

        b(String str) {
            this.f8425b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f8425b + ":" + Utils.shortenKey(o.this.f8396b.z()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    if (com.applovin.impl.sdk.v.a()) {
                        o.this.f8397c.b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.sdk.m f8427a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8428b;

        /* renamed from: c  reason: collision with root package name */
        private final com.applovin.impl.sdk.v f8429c;

        /* renamed from: d  reason: collision with root package name */
        private final com.applovin.impl.sdk.e.a f8430d;

        /* renamed from: e  reason: collision with root package name */
        private final a f8431e;

        c(com.applovin.impl.sdk.m mVar, com.applovin.impl.sdk.e.a aVar, a aVar2) {
            this.f8427a = mVar;
            this.f8429c = mVar.A();
            this.f8428b = aVar.e();
            this.f8430d = aVar;
            this.f8431e = aVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.g.a()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.m r1 = r6.f8427a     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L35
                com.applovin.impl.sdk.e.a r1 = r6.f8430d     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L16
                goto L35
            L16:
                boolean r1 = com.applovin.impl.sdk.v.a()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L25
                com.applovin.impl.sdk.v r1 = r6.f8429c     // Catch: java.lang.Throwable -> L4a
                java.lang.String r2 = r6.f8428b     // Catch: java.lang.Throwable -> L4a
                java.lang.String r3 = "Task re-scheduled..."
                r1.c(r2, r3)     // Catch: java.lang.Throwable -> L4a
            L25:
                com.applovin.impl.sdk.m r1 = r6.f8427a     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o r1 = r1.S()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.a r2 = r6.f8430d     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o$a r3 = r6.f8431e     // Catch: java.lang.Throwable -> L4a
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.a(r2, r3, r4)     // Catch: java.lang.Throwable -> L4a
                goto L3a
            L35:
                com.applovin.impl.sdk.e.a r1 = r6.f8430d     // Catch: java.lang.Throwable -> L4a
                r1.run()     // Catch: java.lang.Throwable -> L4a
            L3a:
                boolean r1 = com.applovin.impl.sdk.v.a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.v r1 = r6.f8429c
                java.lang.String r2 = r6.f8428b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L69
            L4a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.v.a()     // Catch: java.lang.Throwable -> L82
                if (r2 == 0) goto L5a
                com.applovin.impl.sdk.v r2 = r6.f8429c     // Catch: java.lang.Throwable -> L82
                java.lang.String r3 = r6.f8428b     // Catch: java.lang.Throwable -> L82
                java.lang.String r4 = "Task failed execution"
                r2.b(r3, r4, r1)     // Catch: java.lang.Throwable -> L82
            L5a:
                boolean r1 = com.applovin.impl.sdk.v.a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.v r1 = r6.f8429c
                java.lang.String r2 = r6.f8428b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L69:
                com.applovin.impl.sdk.e.o$a r4 = r6.f8431e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f8430d
                java.lang.String r0 = r0.e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.c(r2, r0)
            L81:
                return
            L82:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.v.a()
                if (r2 == 0) goto Laa
                com.applovin.impl.sdk.v r2 = r6.f8429c
                java.lang.String r3 = r6.f8428b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f8431e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f8430d
                java.lang.String r0 = r0.e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.c(r3, r0)
            Laa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.o.c.run():void");
        }
    }

    public o(com.applovin.impl.sdk.m mVar) {
        this.f8396b = mVar;
        this.f8397c = mVar.A();
        this.f8398d = a("auxiliary_operations", ((Integer) mVar.a(com.applovin.impl.sdk.c.b.f8208cd)).intValue());
        this.f8399e = a("shared_thread_pool", ((Integer) mVar.a(com.applovin.impl.sdk.c.b.am)).intValue());
    }

    private ScheduledThreadPoolExecutor a(String str, int i10) {
        return new ScheduledThreadPoolExecutor(i10, new b(str));
    }

    private void a(final Runnable runnable, long j10, boolean z10) {
        if (j10 <= 0) {
            this.f8399e.submit(runnable);
        } else if (z10) {
            com.applovin.impl.sdk.utils.e.a(j10, this.f8396b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    o.this.f8399e.execute(runnable);
                }
            });
        } else {
            this.f8399e.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        }
    }

    private boolean a(c cVar) {
        if (cVar.f8430d.g()) {
            return false;
        }
        synchronized (this.f8401g) {
            if (this.f8402h) {
                return false;
            }
            this.f8400f.add(cVar);
            return true;
        }
    }

    public void a(com.applovin.impl.sdk.e.a aVar) {
        if (aVar == null) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f8397c.e("TaskManager", "Attempted to execute null task immediately");
                return;
            }
            return;
        }
        try {
            aVar.run();
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f8397c.b(aVar.e(), "Task failed execution", th);
            }
        }
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2) {
        a(aVar, aVar2, 0L);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j10) {
        a(aVar, aVar2, j10, false);
    }

    public void a(com.applovin.impl.sdk.e.a aVar, a aVar2, long j10, boolean z10) {
        if (aVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("Invalid delay (millis) specified: " + j10);
        } else if (!a(new c(this.f8396b, aVar, aVar2))) {
            a(aVar, j10, z10);
        } else if (com.applovin.impl.sdk.v.a()) {
            this.f8397c.c(aVar.e(), "Task execution delayed until after init");
        }
    }

    public void a(Runnable runnable) {
        this.f8398d.submit(runnable);
    }

    public boolean a() {
        return this.f8402h;
    }

    public Executor b() {
        return this.f8399e;
    }

    public void c() {
        synchronized (this.f8401g) {
            this.f8402h = false;
        }
    }

    public void d() {
        synchronized (this.f8401g) {
            this.f8402h = true;
            for (c cVar : this.f8400f) {
                a(cVar.f8430d, cVar.f8431e);
            }
            this.f8400f.clear();
        }
    }
}
