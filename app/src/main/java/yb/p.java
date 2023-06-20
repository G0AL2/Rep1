package yb;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes3.dex */
class p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f39477a;

    /* renamed from: b  reason: collision with root package name */
    private final fc.e f39478b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f39479c;

    /* renamed from: d  reason: collision with root package name */
    private final vb.a f39480d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f39481e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* loaded from: classes3.dex */
    interface a {
        void a(fc.e eVar, Thread thread, Throwable th);
    }

    public p(a aVar, fc.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, vb.a aVar2) {
        this.f39477a = aVar;
        this.f39478b = eVar;
        this.f39479c = uncaughtExceptionHandler;
        this.f39480d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            vb.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            vb.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f39480d.b()) {
            vb.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f39481e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [vb.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [vb.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f39481e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f39477a.a(this.f39478b, thread, th);
                } else {
                    vb.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e10) {
                vb.f.f().e("An error occurred in the uncaught exception handler", e10);
            }
        } finally {
            vb.f.f().b(r02);
            this.f39479c.uncaughtException(thread, th);
            this.f39481e.set(false);
        }
    }
}
