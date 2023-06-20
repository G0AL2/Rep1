package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final AppLovinExceptionHandler f7955a = new AppLovinExceptionHandler();

    /* renamed from: b  reason: collision with root package name */
    private final Set<m> f7956b = new HashSet(2);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7957c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7958d;

    public static AppLovinExceptionHandler shared() {
        return f7955a;
    }

    public void addSdk(m mVar) {
        this.f7956b.add(mVar);
    }

    public void enable() {
        if (this.f7957c.compareAndSet(false, true)) {
            this.f7958d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        for (m mVar : this.f7956b) {
            if (v.a()) {
                mVar.A().b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) mVar.w()).trackEventSynchronously("paused");
            ((EventServiceImpl) mVar.w()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7958d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
