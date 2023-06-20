package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.h.c.c;
import java.lang.reflect.Method;

/* compiled from: InternalContainer.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static int f12516a = 8;

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> f12517b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f12518c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f12519d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile n<com.bytedance.sdk.openadsdk.b.a> f12520e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.k.a f12521f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.h.c.a f12522g;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h  reason: collision with root package name */
    private static volatile Context f12523h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.core.i.f f12524i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalContainer.java */
    /* loaded from: classes.dex */
    public static class a {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        private static volatile Application f12526a;

        static {
            try {
                Object b10 = b();
                f12526a = (Application) b10.getClass().getMethod("getApplication", new Class[0]).invoke(b10, new Object[0]);
                com.bytedance.sdk.component.utils.l.e("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.c("MyApplication", "application get failed", th);
            }
        }

        public static Application a() {
            return f12526a;
        }

        private static Object b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }

    public static synchronized Context a() {
        Context context;
        synchronized (m.class) {
            if (f12523h == null) {
                a(null);
            }
            context = f12523h;
        }
        return context;
    }

    public static void b() {
        f12517b = null;
        f12521f = null;
        f12522g = null;
    }

    public static com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> c() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.c();
        }
        if (f12517b == null) {
            synchronized (m.class) {
                if (f12517b == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        f12517b = new com.bytedance.sdk.openadsdk.b.d();
                    } else {
                        f12517b = new com.bytedance.sdk.openadsdk.b.c<>(new com.bytedance.sdk.openadsdk.b.g(f12523h), f(), j(), b(f12523h));
                    }
                }
            }
        }
        return f12517b;
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> d() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.d();
        }
        if (f12519d == null) {
            synchronized (m.class) {
                if (f12519d == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        f12519d = new com.bytedance.sdk.openadsdk.b.r(false);
                    } else {
                        f12519d = a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
        }
        return f12519d;
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> e() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.d();
        }
        if (f12518c == null) {
            synchronized (m.class) {
                if (f12518c == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        f12518c = new com.bytedance.sdk.openadsdk.b.r(true);
                    } else {
                        f12518c = a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
        }
        return f12518c;
    }

    public static n<com.bytedance.sdk.openadsdk.b.a> f() {
        if (f12520e == null) {
            synchronized (m.class) {
                if (f12520e == null) {
                    f12520e = new o(f12523h);
                }
            }
        }
        return f12520e;
    }

    public static com.bytedance.sdk.openadsdk.k.a g() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.k.b.d();
        }
        if (f12521f == null) {
            synchronized (com.bytedance.sdk.openadsdk.k.a.class) {
                if (f12521f == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        f12521f = new com.bytedance.sdk.openadsdk.k.c();
                    } else {
                        f12521f = new com.bytedance.sdk.openadsdk.k.b(f12523h, new com.bytedance.sdk.openadsdk.k.h(f12523h));
                    }
                }
            }
        }
        return f12521f;
    }

    public static com.bytedance.sdk.openadsdk.core.i.f h() {
        if (f12524i == null) {
            synchronized (com.bytedance.sdk.openadsdk.core.i.f.class) {
                if (f12524i == null) {
                    f12524i = new com.bytedance.sdk.openadsdk.core.i.f();
                }
            }
        }
        return f12524i;
    }

    public static com.bytedance.sdk.openadsdk.h.c.a i() {
        if (!com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return com.bytedance.sdk.openadsdk.h.c.c.c();
        }
        if (f12522g == null) {
            synchronized (com.bytedance.sdk.openadsdk.h.c.c.class) {
                if (f12522g == null) {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        f12522g = new com.bytedance.sdk.openadsdk.h.c.d();
                    } else {
                        f12522g = new com.bytedance.sdk.openadsdk.h.c.c();
                    }
                }
            }
        }
        return f12522g;
    }

    private static h.c j() {
        return h.c.a();
    }

    public static synchronized void a(Context context) {
        synchronized (m.class) {
            if (f12523h == null) {
                if (a.a() != null) {
                    try {
                        f12523h = a.a();
                        if (f12523h != null) {
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (context != null) {
                    f12523h = context.getApplicationContext();
                    f12516a = ViewConfiguration.get(a()).getScaledTouchSlop();
                }
            }
        }
    }

    private static h.b b(final Context context) {
        return new h.b() { // from class: com.bytedance.sdk.openadsdk.core.m.1
            @Override // com.bytedance.sdk.openadsdk.b.h.b
            public boolean a() {
                Context context2 = context;
                if (context2 == null) {
                    context2 = m.a();
                }
                return com.bytedance.sdk.component.utils.o.a(context2);
            }
        };
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> a(String str, String str2, boolean z10) {
        h.c b10;
        com.bytedance.sdk.openadsdk.b.f qVar;
        if (z10) {
            qVar = new com.bytedance.sdk.openadsdk.b.s(f12523h);
            b10 = h.c.a();
        } else {
            b10 = h.c.b();
            qVar = new com.bytedance.sdk.openadsdk.b.q(f12523h);
        }
        h.b b11 = b(f12523h);
        return new com.bytedance.sdk.openadsdk.b.c<>(qVar, null, b10, b11, new com.bytedance.sdk.openadsdk.b.t(str, str2, qVar, null, b10, b11));
    }
}
