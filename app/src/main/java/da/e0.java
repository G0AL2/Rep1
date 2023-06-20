package da;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.jh;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: Loader.java */
/* loaded from: classes2.dex */
public final class e0 implements f0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f29143d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f29144e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f29145f;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f29146a;

    /* renamed from: b  reason: collision with root package name */
    private d<? extends e> f29147b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f29148c;

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface b<T extends e> {
        void j(T t10, long j10, long j11, boolean z10);

        void m(T t10, long j10, long j11);

        c s(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f29149a;

        /* renamed from: b  reason: collision with root package name */
        private final long f29150b;

        public boolean c() {
            int i10 = this.f29149a;
            return i10 == 0 || i10 == 1;
        }

        private c(int i10, long j10) {
            this.f29149a = i10;
            this.f29150b = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Loader.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final int f29151a;

        /* renamed from: b  reason: collision with root package name */
        private final T f29152b;

        /* renamed from: c  reason: collision with root package name */
        private final long f29153c;

        /* renamed from: d  reason: collision with root package name */
        private b<T> f29154d;

        /* renamed from: e  reason: collision with root package name */
        private IOException f29155e;

        /* renamed from: f  reason: collision with root package name */
        private int f29156f;

        /* renamed from: g  reason: collision with root package name */
        private Thread f29157g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f29158h;

        /* renamed from: i  reason: collision with root package name */
        private volatile boolean f29159i;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f29152b = t10;
            this.f29154d = bVar;
            this.f29151a = i10;
            this.f29153c = j10;
        }

        private void b() {
            this.f29155e = null;
            e0.this.f29146a.execute((Runnable) ea.a.e(e0.this.f29147b));
        }

        private void c() {
            e0.this.f29147b = null;
        }

        private long d() {
            return Math.min((this.f29156f - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT);
        }

        public void a(boolean z10) {
            this.f29159i = z10;
            this.f29155e = null;
            if (hasMessages(0)) {
                this.f29158h = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f29158h = true;
                    this.f29152b.b();
                    Thread thread = this.f29157g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) ea.a.e(this.f29154d)).j(this.f29152b, elapsedRealtime, elapsedRealtime - this.f29153c, true);
                this.f29154d = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f29155e;
            if (iOException != null && this.f29156f > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            ea.a.f(e0.this.f29147b == null);
            e0.this.f29147b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long d10;
            if (this.f29159i) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
            } else if (i10 != 3) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f29153c;
                b bVar = (b) ea.a.e(this.f29154d);
                if (this.f29158h) {
                    bVar.j(this.f29152b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        bVar.m(this.f29152b, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        ea.r.d("LoadTask", "Unexpected exception handling load completed", e10);
                        e0.this.f29148c = new h(e10);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f29155e = iOException;
                    int i12 = this.f29156f + 1;
                    this.f29156f = i12;
                    c s10 = bVar.s(this.f29152b, elapsedRealtime, j10, iOException, i12);
                    if (s10.f29149a != 3) {
                        if (s10.f29149a != 2) {
                            if (s10.f29149a == 1) {
                                this.f29156f = 1;
                            }
                            if (s10.f29150b != -9223372036854775807L) {
                                d10 = s10.f29150b;
                            } else {
                                d10 = d();
                            }
                            f(d10);
                            return;
                        }
                        return;
                    }
                    e0.this.f29148c = this.f29155e;
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f29158h;
                    this.f29157g = Thread.currentThread();
                }
                if (z10) {
                    String simpleName = this.f29152b.getClass().getSimpleName();
                    ea.k0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f29152b.load();
                        ea.k0.c();
                    } catch (Throwable th) {
                        ea.k0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f29157g = null;
                    Thread.interrupted();
                }
                if (this.f29159i) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f29159i) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f29159i) {
                    return;
                }
                ea.r.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f29159i) {
                    return;
                }
                ea.r.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new h(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f29159i) {
                    ea.r.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface e {
        void b();

        void load() throws IOException;
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public interface f {
        void o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final f f29161a;

        public g(f fVar) {
            this.f29161a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29161a.o();
        }
    }

    /* compiled from: Loader.java */
    /* loaded from: classes2.dex */
    public static final class h extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: da.e0.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        h(true, -9223372036854775807L);
        f29144e = new c(2, -9223372036854775807L);
        f29145f = new c(3, -9223372036854775807L);
    }

    public e0(String str) {
        String valueOf = String.valueOf(str);
        this.f29146a = ea.n0.D0(valueOf.length() != 0 ? "ExoPlayer:Loader:".concat(valueOf) : new String("ExoPlayer:Loader:"));
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // da.f0
    public void a() throws IOException {
        k(RecyclerView.UNDEFINED_DURATION);
    }

    public void f() {
        ((d) ea.a.h(this.f29147b)).a(false);
    }

    public void g() {
        this.f29148c = null;
    }

    public boolean i() {
        return this.f29148c != null;
    }

    public boolean j() {
        return this.f29147b != null;
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f29148c;
        if (iOException == null) {
            d<? extends e> dVar = this.f29147b;
            if (dVar != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = dVar.f29151a;
                }
                dVar.e(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f29147b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f29146a.execute(new g(fVar));
        }
        this.f29146a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f29148c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) ea.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
