package com.ironsource.mediationsdk.a;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes3.dex */
public final class i extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private static i f26730b;

    /* renamed from: a  reason: collision with root package name */
    private a f26731a;

    /* loaded from: classes3.dex */
    class a extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        Handler f26732a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }
    }

    private i() {
        a aVar = new a(i.class.getSimpleName());
        this.f26731a = aVar;
        aVar.start();
        a aVar2 = this.f26731a;
        aVar2.f26732a = new Handler(aVar2.getLooper());
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f26730b == null) {
                f26730b = new i();
            }
            iVar = f26730b;
        }
        return iVar;
    }

    public final synchronized void a(Runnable runnable) {
        a aVar = this.f26731a;
        if (aVar == null) {
            return;
        }
        Handler handler = aVar.f26732a;
        if (handler != null) {
            handler.post(runnable);
        }
    }
}
