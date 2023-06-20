package com.ironsource.environment.e;

import android.os.Handler;
import android.os.Looper;
import qe.k;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26152a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f26153b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final b f26154c;

    /* renamed from: d  reason: collision with root package name */
    private static final b f26155d;

    static {
        b bVar = new b("isadplayer-background");
        bVar.start();
        bVar.a();
        f26154c = bVar;
        b bVar2 = new b("isadplayer-publisher-callbacks");
        bVar2.start();
        bVar2.a();
        f26155d = bVar2;
    }

    private a() {
    }

    public static Looper a() {
        return f26154c.getLooper();
    }

    public final void a(Runnable runnable) {
        k.f(runnable, "action");
        f26153b.postDelayed(runnable, 0L);
    }

    public final void b(Runnable runnable) {
        k.f(runnable, "action");
        f26154c.a(runnable, 0L);
    }

    public final void c(Runnable runnable) {
        k.f(runnable, "action");
        f26155d.a(runnable, 0L);
    }
}
