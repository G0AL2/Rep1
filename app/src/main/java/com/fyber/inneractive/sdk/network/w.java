package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Comparator;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class w {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadFactory f17704f = new a();

    /* renamed from: a  reason: collision with root package name */
    public BlockingQueue<b0<?>> f17705a = new PriorityBlockingQueue(100, new c(null));

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f17706b = false;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f17707c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final ThreadPoolExecutor f17708d = new ThreadPoolExecutor(6, 6, 1000, TimeUnit.SECONDS, new LinkedBlockingQueue(100), f17704f);

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f17709e = new b();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f17710a = new AtomicInteger(100);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.f17710a.getAndIncrement())));
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:(8:18|(1:24)|25|26|27|28|29|30)|27|28|29|30) */
        /* JADX WARN: Can't wrap try/catch for region: R(8:11|12|(2:13|14)|(5:(8:18|(1:24)|25|26|27|28|29|30)|27|28|29|30)|44|(3:20|22|24)|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
            r3 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
            r5 = null;
            r1 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
            r3 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
            r2.a((com.fyber.inneractive.sdk.network.b0<?>) null, r3, false);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r8 = this;
                com.fyber.inneractive.sdk.network.w r0 = com.fyber.inneractive.sdk.network.w.this
                r0.getClass()
                r1 = 10
                android.os.Process.setThreadPriority(r1)
            La:
                boolean r1 = r0.f17706b
                if (r1 == 0) goto L88
                r1 = 0
                java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.b0<?>> r2 = r0.f17705a     // Catch: java.lang.InterruptedException -> L18
                java.lang.Object r2 = r2.take()     // Catch: java.lang.InterruptedException -> L18
                com.fyber.inneractive.sdk.network.b0 r2 = (com.fyber.inneractive.sdk.network.b0) r2     // Catch: java.lang.InterruptedException -> L18
                goto L25
            L18:
                boolean r2 = r0.f17706b
                if (r2 != 0) goto L24
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                r2.interrupt()
            L24:
                r2 = r1
            L25:
                if (r2 == 0) goto La
                boolean r3 = r2.e()
                if (r3 != 0) goto La
                com.fyber.inneractive.sdk.network.m0 r3 = com.fyber.inneractive.sdk.network.m0.RUNNING
                r2.a(r3)
                r3 = 1
                r4 = 0
                boolean r5 = r2.e()     // Catch: java.lang.Exception -> L45
                if (r5 != 0) goto L50
                java.lang.String r5 = r2.c()     // Catch: java.lang.Exception -> L45
                if (r5 == 0) goto L50
                com.fyber.inneractive.sdk.network.a r5 = r2.g()     // Catch: java.lang.Exception -> L45
                goto L51
            L45:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.String r7 = "failed fetching cache data"
                com.fyber.inneractive.sdk.util.IAlog.a(r7, r5, r6)
                r2.a(r1, r5, r3)
            L50:
                r5 = r1
            L51:
                if (r5 == 0) goto L62
                T r6 = r5.f17522b
                if (r6 == 0) goto L62
                boolean r6 = r2.e()
                if (r6 != 0) goto L62
                T r6 = r5.f17522b
                r2.a(r6, r1, r3)
            L62:
                com.fyber.inneractive.sdk.network.j r3 = r0.a(r2, r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
                com.fyber.inneractive.sdk.network.a0 r5 = r0.a(r2, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L74
                r0.a(r2, r3, r5)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> L80
                goto L79
            L6e:
                r3 = move-exception
                goto L76
            L70:
                r3 = move-exception
                r5 = r1
                r1 = r3
                goto L81
            L74:
                r3 = move-exception
                r5 = r1
            L76:
                r2.a(r1, r3, r4)     // Catch: java.lang.Throwable -> L80
            L79:
                r0.a(r2, r5)
                r0.b(r2)
                goto La
            L80:
                r1 = move-exception
            L81:
                r0.a(r2, r5)
                r0.b(r2)
                throw r1
            L88:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.b.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Comparator<b0> {
        public c() {
        }

        @Override // java.util.Comparator
        public int compare(b0 b0Var, b0 b0Var2) {
            return b0Var.f().ordinal() - b0Var2.f().ordinal();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public final <T> void a(b0<T> b0Var, a0 a0Var) {
        try {
            if (b0Var.e() || a0Var == null) {
                return;
            }
            b0Var.a((b0<T>) a0Var.f17523a, (Exception) null, false);
        } catch (Exception e10) {
            IAlog.a("failed notifying the listener request complete", e10, new Object[0]);
            b0Var.a((b0<T>) null, e10, false);
        }
    }

    public final void b(b0<?> b0Var) {
        try {
            b0Var.b();
        } catch (Exception unused) {
        }
        b0Var.a(m0.DONE);
    }

    public void c(b0<?> b0Var) {
        this.f17705a.offer(b0Var);
        b0Var.a(m0.QUEUED);
    }

    public final <T> void a(b0<T> b0Var, j jVar, a0 a0Var) {
        try {
            if (b0Var.e() || b0Var.c() == null || a0Var == null || jVar == null || jVar.f17569a != 200) {
                return;
            }
            b0Var.a(a0Var, b0Var.c(), jVar.f17573e);
        } catch (Exception e10) {
            IAlog.a("Failed cache network response data", e10, new Object[0]);
        }
    }

    public final <T> a0 a(b0<T> b0Var, j jVar) throws Exception {
        a0 a0Var = null;
        if (jVar != null) {
            try {
                if (!b0Var.e()) {
                    int i10 = jVar.f17569a;
                    if (i10 == 200) {
                        a0Var = b0Var.a(jVar.f17571c, jVar.f17572d, i10);
                    } else if (i10 == 304) {
                        b0Var.a((b0<T>) null, (Exception) new f(), false);
                    } else {
                        b0Var.a((b0<T>) null, (Exception) new n0(jVar.f17569a, jVar.f17570b), false);
                    }
                }
            } catch (Exception e10) {
                IAlog.a("failed parsing network request", e10, new Object[0]);
                throw e10;
            }
        }
        return a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.network.j a(com.fyber.inneractive.sdk.network.b0<?> r5, com.fyber.inneractive.sdk.network.a<?> r6) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.String r0 = "failed sending network request"
            r1 = 0
            boolean r2 = r5.e()     // Catch: java.lang.Exception -> L1a com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23
            if (r2 != 0) goto L18
            if (r6 == 0) goto Le
            java.lang.String r6 = r6.f17521a     // Catch: java.lang.Exception -> L1a com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23
            goto L10
        Le:
            java.lang.String r6 = ""
        L10:
            r4.a(r5)     // Catch: java.lang.Exception -> L1a com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23
            com.fyber.inneractive.sdk.network.j r5 = r5.a(r6)     // Catch: java.lang.Exception -> L1a com.fyber.inneractive.sdk.network.b -> L21 java.net.UnknownHostException -> L23
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
        L1a:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r5, r6)
            throw r5
        L21:
            r6 = move-exception
            goto L24
        L23:
            r6 = move-exception
        L24:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r6, r1)
            boolean r0 = r5.j()
            if (r0 == 0) goto L3e
            android.os.Handler r0 = r4.f17707c
            com.fyber.inneractive.sdk.network.x r1 = new com.fyber.inneractive.sdk.network.x
            r1.<init>(r4, r5)
            int r5 = r5.p()
            long r2 = (long) r5
            r0.postDelayed(r1, r2)
        L3e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(com.fyber.inneractive.sdk.network.b0, com.fyber.inneractive.sdk.network.a):com.fyber.inneractive.sdk.network.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.isConnectedOrConnecting() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.network.b0<?> r4) throws com.fyber.inneractive.sdk.network.b {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.config.global.s r4 = r4.h()
            if (r4 == 0) goto L50
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.g> r0 = com.fyber.inneractive.sdk.config.global.features.g.class
            com.fyber.inneractive.sdk.config.global.features.e r4 = r4.a(r0)
            com.fyber.inneractive.sdk.config.global.features.g r4 = (com.fyber.inneractive.sdk.config.global.features.g) r4
            if (r4 == 0) goto L50
            java.lang.String r0 = "should_use_is_network_connected"
            r1 = 0
            boolean r4 = r4.a(r0, r1)
            if (r4 == 0) goto L50
            r4 = 1
            android.app.Application r0 = com.fyber.inneractive.sdk.util.l.f20301a     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> L3d
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L2b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L3d
            goto L2c
        L2b:
            r0 = 0
        L2c:
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r2 = com.fyber.inneractive.sdk.util.l.b(r2)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L45
            if (r0 == 0) goto L45
            boolean r0 = r0.isConnectedOrConnecting()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L45
            goto L44
        L3d:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file."
            com.fyber.inneractive.sdk.util.IAlog.b(r1, r0)
        L44:
            r1 = 1
        L45:
            if (r1 == 0) goto L48
            goto L50
        L48:
            com.fyber.inneractive.sdk.network.b r4 = new com.fyber.inneractive.sdk.network.b
            java.lang.String r0 = "No network connection"
            r4.<init>(r0)
            throw r4
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(com.fyber.inneractive.sdk.network.b0):void");
    }
}
