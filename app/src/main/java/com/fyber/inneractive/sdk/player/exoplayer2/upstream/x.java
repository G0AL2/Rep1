package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.jh;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f19524a;

    /* renamed from: b  reason: collision with root package name */
    public b<? extends c> f19525b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f19526c;

    /* loaded from: classes2.dex */
    public interface a<T extends c> {
        int a(T t10, long j10, long j11, IOException iOException);

        void a(T t10, long j10, long j11);

        void a(T t10, long j10, long j11, boolean z10);
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a();

        void b();

        void load() throws IOException, InterruptedException;
    }

    /* loaded from: classes2.dex */
    public static final class d extends IOException {
        public d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public x(String str) {
        this.f19524a = com.fyber.inneractive.sdk.player.exoplayer2.util.u.c(str);
    }

    public <T extends c> long a(T t10, a<T> aVar, int i10) {
        Looper myLooper = Looper.myLooper();
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t10, aVar, i10, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public boolean b() {
        return this.f19525b != null;
    }

    public void c() throws IOException {
        IOException iOException = this.f19526c;
        if (iOException == null) {
            b<? extends c> bVar = this.f19525b;
            if (bVar != null) {
                int i10 = bVar.f19529c;
                IOException iOException2 = bVar.f19531e;
                if (iOException2 != null && bVar.f19532f > i10) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public void d() {
        b<? extends c> bVar = this.f19525b;
        if (bVar != null) {
            bVar.a(true);
        }
        this.f19524a.shutdown();
    }

    public void a() {
        this.f19525b.a(false);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public final class b<T extends c> extends Handler implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final T f19527a;

        /* renamed from: b  reason: collision with root package name */
        public final a<T> f19528b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19529c;

        /* renamed from: d  reason: collision with root package name */
        public final long f19530d;

        /* renamed from: e  reason: collision with root package name */
        public IOException f19531e;

        /* renamed from: f  reason: collision with root package name */
        public int f19532f;

        /* renamed from: g  reason: collision with root package name */
        public volatile Thread f19533g;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f19534h;

        public b(Looper looper, T t10, a<T> aVar, int i10, long j10) {
            super(looper);
            this.f19527a = t10;
            this.f19528b = aVar;
            this.f19529c = i10;
            this.f19530d = j10;
        }

        public void a(long j10) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(x.this.f19525b == null);
            x xVar = x.this;
            xVar.f19525b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.f19531e = null;
            xVar.f19524a.execute(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f19534h) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f19531e = null;
                x xVar = x.this;
                xVar.f19524a.execute(xVar.f19525b);
            } else if (i10 != 4) {
                x.this.f19525b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f19530d;
                if (this.f19527a.a()) {
                    this.f19528b.a((a<T>) this.f19527a, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    this.f19528b.a((a<T>) this.f19527a, elapsedRealtime, j10, false);
                } else if (i11 == 2) {
                    this.f19528b.a(this.f19527a, elapsedRealtime, j10);
                } else if (i11 != 3) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f19531e = iOException;
                    int a10 = this.f19528b.a((a<T>) this.f19527a, elapsedRealtime, j10, iOException);
                    if (a10 == 3) {
                        x.this.f19526c = this.f19531e;
                    } else if (a10 != 2) {
                        int i12 = a10 == 1 ? 1 : this.f19532f + 1;
                        this.f19532f = i12;
                        a(Math.min((i12 - 1) * 1000, (int) jh.DEFAULT_BITMAP_TIMEOUT));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f19533g = Thread.currentThread();
                if (!this.f19527a.a()) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s.a("load:" + this.f19527a.getClass().getSimpleName());
                    try {
                        this.f19527a.load();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s.a();
                    } catch (Throwable th) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.s.a();
                        throw th;
                    }
                }
                if (this.f19534h) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f19534h) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (OutOfMemoryError e11) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e11);
                if (this.f19534h) {
                    return;
                }
                obtainMessage(3, new d(e11)).sendToTarget();
            } catch (Error e12) {
                Log.e("LoadTask", "Unexpected error loading stream", e12);
                if (!this.f19534h) {
                    obtainMessage(4, e12).sendToTarget();
                }
                throw e12;
            } catch (InterruptedException unused) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f19527a.a());
                if (this.f19534h) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e13) {
                Log.e("LoadTask", "Unexpected exception loading stream", e13);
                if (this.f19534h) {
                    return;
                }
                obtainMessage(3, new d(e13)).sendToTarget();
            }
        }

        public void a(boolean z10) {
            this.f19534h = z10;
            this.f19531e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f19527a.b();
                if (this.f19533g != null) {
                    this.f19533g.interrupt();
                }
            }
            if (z10) {
                x.this.f19525b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f19528b.a((a<T>) this.f19527a, elapsedRealtime, elapsedRealtime - this.f19530d, true);
            }
        }
    }
}
