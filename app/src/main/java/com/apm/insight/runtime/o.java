package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6639a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6640b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6641c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f6642d = false;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6643e = false;

    /* renamed from: f  reason: collision with root package name */
    private static c f6644f = new c();

    /* renamed from: g  reason: collision with root package name */
    private static volatile boolean f6645g = false;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f6646h = false;

    public static c a() {
        return f6644f;
    }

    public static void a(long j10) {
        NativeImpl.a(j10);
    }

    public static synchronized void a(Application application, Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        synchronized (o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (f6639a) {
                return;
            }
            f6639a = true;
            if (context == null || application == null) {
                throw new IllegalArgumentException("context or Application must be not null.");
            }
            com.apm.insight.h.a(application, context);
            if (z10 || z11) {
                com.apm.insight.g.a a10 = com.apm.insight.g.a.a();
                if (z11) {
                    a10.a(new com.apm.insight.i.b(context));
                }
                if (z10) {
                    a10.b(new com.apm.insight.g.d(context));
                }
                f6640b = true;
            }
            NativeImpl.a();
            if (z12) {
                boolean a11 = NativeImpl.a(context);
                f6642d = a11;
                if (!a11) {
                    f6643e = true;
                }
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                f6645g = true;
                NativeImpl.h();
            }
            c(z13);
            com.apm.insight.l.q.a((Object) ("Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms."));
        }
    }

    public static synchronized void a(Context context, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        Application application;
        synchronized (o.class) {
            if (com.apm.insight.h.h() != null) {
                application = com.apm.insight.h.h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                application = (Application) context.getApplicationContext();
                if (application == null) {
                    throw new IllegalArgumentException("初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).");
                }
                if (application.getBaseContext() != null) {
                    context = application.getBaseContext();
                }
            }
            a(application, context, z10, z11, z12, z13, j10);
        }
    }

    public static void a(ICrashCallback iCrashCallback, CrashType crashType) {
        a().a(iCrashCallback, crashType);
    }

    public static void a(IOOMCallback iOOMCallback) {
        a().a(iOOMCallback);
    }

    public static void a(IOOMCallback iOOMCallback, CrashType crashType) {
        a().b(iOOMCallback);
    }

    public static void a(com.apm.insight.d dVar) {
        com.apm.insight.h.i().setEncryptImpl(dVar);
    }

    public static void a(com.apm.insight.k.h hVar) {
        com.apm.insight.k.e.a(hVar);
    }

    public static void a(j jVar) {
        k.a(jVar);
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str);
    }

    public static void a(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return;
        }
        com.apm.insight.a.a.a().a(str, bVar, cVar);
    }

    public static void a(final String str, final com.apm.insight.e eVar) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.apm.insight.l.a.b(com.apm.insight.h.g())) {
                    com.apm.insight.b.d.a(str, eVar);
                }
            }
        });
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, com.apm.insight.f fVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, fVar);
    }

    public static void a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, com.apm.insight.f fVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.apm.insight.d.a.a(str, map, map2, map3, fVar);
    }

    @Deprecated
    public static void a(Throwable th) {
        if (com.apm.insight.h.i().isReportErrorEnable()) {
            com.apm.insight.g.a.a(th);
        }
    }

    public static void b(long j10) {
        NativeImpl.b(j10);
    }

    public static void b(ICrashCallback iCrashCallback, CrashType crashType) {
        a().b(iCrashCallback, crashType);
    }

    @Deprecated
    public static void b(String str) {
        if (com.apm.insight.h.i().isReportErrorEnable()) {
            com.apm.insight.g.a.c(str);
        }
    }

    public static boolean b() {
        return f6640b;
    }

    public static void c(long j10) {
        NativeImpl.c(j10);
    }

    public static void c(String str) {
        NativeImpl.b(str);
    }

    private static void c(final boolean z10) {
        p.b().a(new Runnable() { // from class: com.apm.insight.runtime.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (!o.f6645g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.apm.insight.runtime.o.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            boolean unused = o.f6645g = true;
                            NativeImpl.h();
                        }
                    });
                }
                o.d(z10);
            }
        }, 0L);
    }

    public static boolean c() {
        return f6641c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(1:3)(9:(1:22)|5|(1:7)|8|9|10|(1:15)|17|18)|4|5|(0)|8|9|10|(2:13|15)|17|18) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.h.g()
            com.apm.insight.runtime.a.f.a()
            com.apm.insight.runtime.m.a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.j.a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.b()
            com.apm.insight.j.a()
            com.apm.insight.nativecrash.NativeImpl.c()
            boolean r2 = com.apm.insight.runtime.o.f6643e
            if (r2 == 0) goto L27
            com.apm.insight.c r1 = com.apm.insight.b.a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L23:
            r1.a(r2)
            goto L30
        L27:
            if (r1 >= 0) goto L30
            com.apm.insight.c r1 = com.apm.insight.b.a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L23
        L30:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.j.a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.e.a.a()
            r1.a(r0)
            com.apm.insight.j.a()
            com.apm.insight.b.a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.j.a(r1)
            com.apm.insight.k.i.a(r0)
            com.apm.insight.j.a()
            if (r3 == 0) goto L60
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.j.a(r1)
            com.apm.insight.b.g r1 = com.apm.insight.b.g.a(r0)
            r1.c()
            com.apm.insight.j.a()
            com.apm.insight.runtime.o.f6641c = r3
        L60:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.j.a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.k.g.a()
            r3.b()
            com.apm.insight.j.a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.j.a(r3)
            com.apm.insight.j.a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.j.a(r3)
            com.apm.insight.j.a()
            com.apm.insight.nativecrash.NativeImpl.f()
            com.apm.insight.i.a()
            java.lang.String r3 = "fastbot"
            java.io.File r3 = r0.getExternalFilesDir(r3)     // Catch: java.lang.Throwable -> La9
            android.content.Context r0 = com.apm.insight.h.g()     // Catch: java.lang.Throwable -> La9
            boolean r0 = com.apm.insight.l.a.b(r0)     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La9
            if (r3 == 0) goto La9
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> La9
            if (r0 == 0) goto La9
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> La9
            com.apm.insight.runtime.o$3 r0 = new com.apm.insight.runtime.o$3     // Catch: java.lang.Throwable -> La9
            r0.<init>()     // Catch: java.lang.Throwable -> La9
            com.apm.insight.b.d.a(r3, r0)     // Catch: java.lang.Throwable -> La9
        La9:
            com.apm.insight.k.k.d()
            com.apm.insight.nativecrash.NativeImpl.j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.r.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.o.d(boolean):void");
    }

    public static boolean d() {
        return f6642d;
    }

    public static boolean e() {
        return f6639a;
    }

    public static void f() {
        if (!f6639a || f6640b) {
            return;
        }
        Context g10 = com.apm.insight.h.g();
        com.apm.insight.g.a a10 = com.apm.insight.g.a.a();
        a10.a(new com.apm.insight.i.b(g10));
        a10.b(new com.apm.insight.g.d(g10));
    }

    public static void g() {
        if (f6639a) {
            com.apm.insight.b.g.a(com.apm.insight.h.g()).c();
            f6641c = true;
        }
    }

    public static boolean h() {
        if (f6639a && !f6642d) {
            boolean a10 = NativeImpl.a(com.apm.insight.h.g());
            f6642d = a10;
            if (!a10) {
                f6643e = true;
            }
        }
        return f6642d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
        if (f6639a) {
            com.apm.insight.b.g.a(com.apm.insight.h.g()).d();
            f6641c = false;
        }
    }

    public static boolean k() {
        return com.apm.insight.g.a.b() || NativeImpl.d();
    }

    public static boolean l() {
        return com.apm.insight.g.a.c() || NativeImpl.d();
    }

    public static boolean m() {
        return com.apm.insight.g.a.b();
    }

    public static boolean n() {
        return f6646h;
    }

    public static void o() {
        f6646h = true;
    }
}
