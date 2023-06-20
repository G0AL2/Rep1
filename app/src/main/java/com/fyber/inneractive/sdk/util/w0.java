package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final TimeUnit f20347a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20348b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f20349c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20350d;

    /* renamed from: e  reason: collision with root package name */
    public b f20351e;

    /* renamed from: f  reason: collision with root package name */
    public long f20352f;

    /* loaded from: classes2.dex */
    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<w0> f20353a;

        public a(w0 w0Var) {
            super(Looper.getMainLooper());
            this.f20353a = new WeakReference<>(w0Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            w0 w0Var = this.f20353a.get();
            if (w0Var == null || message.what != 1932593528 || w0Var.f20350d) {
                return;
            }
            w0Var.a(message.getWhen());
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(w0 w0Var);
    }

    public w0(TimeUnit timeUnit, long j10) {
        this.f20350d = false;
        this.f20352f = 0L;
        this.f20348b = j10;
        this.f20347a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public void a() {
        this.f20350d = true;
        Handler handler = this.f20349c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    public void b() {
        this.f20350d = false;
        a(SystemClock.uptimeMillis());
    }

    public void c() {
        a aVar = new a(this);
        this.f20349c = aVar;
        this.f20350d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    public final void a(long j10) {
        long uptimeMillis = this.f20352f + (SystemClock.uptimeMillis() - j10) + 50;
        this.f20352f = uptimeMillis;
        if (this.f20351e != null && uptimeMillis > this.f20347a.toMillis(this.f20348b)) {
            this.f20351e.a(this);
            return;
        }
        Handler handler = this.f20349c;
        if (handler == null || this.f20351e == null) {
            return;
        }
        handler.removeMessages(1932593528);
        this.f20349c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public w0(TimeUnit timeUnit, long j10, long j11) {
        this.f20350d = false;
        this.f20352f = 0L;
        this.f20348b = j10;
        this.f20347a = timeUnit;
        this.f20352f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }
}
