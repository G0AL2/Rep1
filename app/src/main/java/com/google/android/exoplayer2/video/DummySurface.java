package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import ea.i;
import ea.m;
import ea.r;

/* loaded from: classes2.dex */
public final class DummySurface extends Surface {

    /* renamed from: d  reason: collision with root package name */
    private static int f21795d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f21796e;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21797a;

    /* renamed from: b  reason: collision with root package name */
    private final b f21798b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21799c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private i f21800a;

        /* renamed from: b  reason: collision with root package name */
        private Handler f21801b;

        /* renamed from: c  reason: collision with root package name */
        private Error f21802c;

        /* renamed from: d  reason: collision with root package name */
        private RuntimeException f21803d;

        /* renamed from: e  reason: collision with root package name */
        private DummySurface f21804e;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i10) {
            ea.a.e(this.f21800a);
            this.f21800a.h(i10);
            this.f21804e = new DummySurface(this, this.f21800a.g(), i10 != 0);
        }

        private void d() {
            ea.a.e(this.f21800a);
            this.f21800a.i();
        }

        public DummySurface a(int i10) {
            boolean z10;
            start();
            this.f21801b = new Handler(getLooper(), this);
            this.f21800a = new i(this.f21801b);
            synchronized (this) {
                z10 = false;
                this.f21801b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f21804e == null && this.f21803d == null && this.f21802c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f21803d;
            if (runtimeException == null) {
                Error error = this.f21802c;
                if (error == null) {
                    return (DummySurface) ea.a.e(this.f21804e);
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            ea.a.e(this.f21801b);
            this.f21801b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    r.d("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f21802c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    r.d("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f21803d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    private static int c(Context context) {
        if (m.m(context)) {
            return m.n() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean e(Context context) {
        boolean z10;
        synchronized (DummySurface.class) {
            if (!f21796e) {
                f21795d = c(context);
                f21796e = true;
            }
            z10 = f21795d != 0;
        }
        return z10;
    }

    public static DummySurface f(Context context, boolean z10) {
        ea.a.f(!z10 || e(context));
        return new b().a(z10 ? f21795d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f21798b) {
            if (!this.f21799c) {
                this.f21798b.c();
                this.f21799c = true;
            }
        }
    }

    private DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f21798b = bVar;
        this.f21797a = z10;
    }
}
