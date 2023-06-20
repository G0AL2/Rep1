package com.bytedance.sdk.component.f;

import com.bytedance.sdk.component.f.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TTExecutor.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static c f10430b;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f10433e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f10434f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f10435g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile ScheduledExecutorService f10436h;

    /* renamed from: a  reason: collision with root package name */
    public static final int f10429a = Runtime.getRuntime().availableProcessors();

    /* renamed from: c  reason: collision with root package name */
    public static int f10431c = 120;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f10432d = true;

    public static ExecutorService a() {
        return a(10);
    }

    public static ExecutorService b() {
        if (f10434f == null) {
            synchronized (e.class) {
                if (f10434f == null) {
                    f10434f = new a.C0160a().a("log").b(10).a(2).a(40L).a(TimeUnit.SECONDS).a(new PriorityBlockingQueue()).a(f()).a();
                    f10434f.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10434f;
    }

    public static void c(g gVar, int i10) {
        if (f10435g == null) {
            c();
        }
        if (gVar == null || f10435g == null) {
            return;
        }
        gVar.a(i10);
        f10435g.execute(gVar);
    }

    public static ScheduledExecutorService d() {
        if (f10436h == null) {
            synchronized (e.class) {
                if (f10436h == null) {
                    f10436h = Executors.newSingleThreadScheduledExecutor(new h(5, "scheduled"));
                }
            }
        }
        return f10436h;
    }

    public static boolean e() {
        return f10432d;
    }

    public static RejectedExecutionHandler f() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.f.e.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static c g() {
        return f10430b;
    }

    public static ExecutorService a(int i10) {
        if (f10433e == null) {
            synchronized (e.class) {
                if (f10433e == null) {
                    f10433e = new a.C0160a().a("io").a(4).b(i10).a(40L).a(TimeUnit.SECONDS).a(new PriorityBlockingQueue(f10429a)).a(f()).a();
                    f10433e.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10433e;
    }

    public static ExecutorService c() {
        if (f10435g == null) {
            synchronized (e.class) {
                if (f10435g == null) {
                    f10435g = new a.C0160a().a("aidl").b(10).a(2).a(30L).a(TimeUnit.SECONDS).a(new PriorityBlockingQueue()).a(f()).a();
                    f10435g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f10435g;
    }

    public static void b(g gVar) {
        if (f10434f == null) {
            b();
        }
        if (f10434f != null) {
            f10434f.execute(gVar);
        }
    }

    public static void a(g gVar) {
        if (f10433e == null) {
            a();
        }
        if (f10433e != null) {
            f10433e.execute(gVar);
        }
    }

    public static void b(g gVar, int i10) {
        if (f10434f == null) {
            b();
        }
        if (gVar == null || f10434f == null) {
            return;
        }
        gVar.a(i10);
        f10434f.execute(gVar);
    }

    public static void a(g gVar, int i10) {
        if (f10433e == null) {
            a();
        }
        if (gVar == null || f10433e == null) {
            return;
        }
        gVar.a(i10);
        f10433e.execute(gVar);
    }

    public static void b(int i10) {
        f10431c = i10;
    }

    public static void a(g gVar, int i10, int i11) {
        if (f10433e == null) {
            a(i11);
        }
        if (gVar == null || f10433e == null) {
            return;
        }
        gVar.a(i10);
        f10433e.execute(gVar);
    }

    public static void a(boolean z10) {
        f10432d = z10;
    }

    public static void a(c cVar) {
        f10430b = cVar;
    }
}
