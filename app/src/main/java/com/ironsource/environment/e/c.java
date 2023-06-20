package com.ironsource.environment.e;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.modules.appstate.AppStateModule;
import qe.k;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f26160a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f26161b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final b f26162c;

    static {
        b bVar = new b(AppStateModule.APP_STATE_BACKGROUND);
        bVar.start();
        bVar.a();
        f26162c = bVar;
    }

    private c() {
    }

    public static void a(Runnable runnable, long j10) {
        k.f(runnable, "action");
        f26161b.postDelayed(runnable, j10);
    }

    public static void b(Runnable runnable) {
        k.f(runnable, "action");
        f26161b.removeCallbacks(runnable);
    }

    public static void b(Runnable runnable, long j10) {
        k.f(runnable, "action");
        f26162c.a(runnable, j10);
    }

    public final void a(Runnable runnable) {
        a(runnable, 0L);
    }

    public final void c(Runnable runnable) {
        b(runnable, 0L);
    }
}
