package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    static final b<d, Runnable> f6673a = new b<d, Runnable>() { // from class: com.apm.insight.runtime.u.1
    };

    /* renamed from: b  reason: collision with root package name */
    static final b<Message, Runnable> f6674b = new b<Message, Runnable>() { // from class: com.apm.insight.runtime.u.2
    };

    /* renamed from: c  reason: collision with root package name */
    private final HandlerThread f6675c;

    /* renamed from: f  reason: collision with root package name */
    private volatile Handler f6678f;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<d> f6676d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    private final Queue<Message> f6677e = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Object f6679g = new Object();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        void a() {
            while (!u.this.f6676d.isEmpty()) {
                d dVar = (d) u.this.f6676d.poll();
                if (u.this.f6678f != null) {
                    try {
                        u.this.f6678f.sendMessageAtTime(dVar.f6684a, dVar.f6685b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        void b() {
            while (!u.this.f6677e.isEmpty()) {
                if (u.this.f6678f != null) {
                    try {
                        u.this.f6678f.sendMessageAtFrontOfQueue((Message) u.this.f6677e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }
    }

    /* loaded from: classes.dex */
    public interface b<A, B> {
    }

    /* loaded from: classes.dex */
    class c extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        volatile int f6681a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f6682b;

        c(String str) {
            super(str);
            this.f6681a = 0;
            this.f6682b = false;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (u.this.f6679g) {
                u.this.f6678f = new Handler();
            }
            u.this.f6678f.post(new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    try {
                        com.apm.insight.b.g.a(com.apm.insight.h.g()).a().c();
                        if (this.f6681a < 5) {
                            com.apm.insight.b.a().a("NPTH_CATCH", th);
                        } else if (!this.f6682b) {
                            this.f6682b = true;
                            com.apm.insight.b.a().a("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f6681a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        Message f6684a;

        /* renamed from: b  reason: collision with root package name */
        long f6685b;

        d(Message message, long j10) {
            this.f6684a = message;
            this.f6685b = j10;
        }
    }

    public u(String str) {
        this.f6675c = new c(str);
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f6678f, runnable);
    }

    public Handler a() {
        return this.f6678f;
    }

    public final boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    public void b() {
        this.f6675c.start();
    }

    public final boolean b(Message message, long j10) {
        if (this.f6678f == null) {
            synchronized (this.f6679g) {
                if (this.f6678f == null) {
                    this.f6676d.add(new d(message, j10));
                    return true;
                }
            }
        }
        try {
            return this.f6678f.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public HandlerThread c() {
        return this.f6675c;
    }
}
