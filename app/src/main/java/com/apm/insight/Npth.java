package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.l.r;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            h.b().b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            h.b().a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        h.b().a(map);
    }

    public static void dumpHprof(String str) {
        o.c(str);
    }

    public static void enableALogCollector(String str, com.apm.insight.a.b bVar, com.apm.insight.a.c cVar) {
        o.a(str, bVar, cVar);
    }

    public static void enableThreadsBoost() {
        h.a(1);
    }

    public static ConfigManager getConfigManager() {
        return h.i();
    }

    public static boolean hasCrash() {
        return o.k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return o.l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return o.m();
    }

    public static synchronized void init(Application application, Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        synchronized (Npth.class) {
            if (sInit) {
                return;
            }
            sInit = true;
            o.a(application, context, true, true, true, true, j10);
            h.a(application, context, iCommonParams);
            Map<String, Object> a10 = h.a().a();
            int a11 = r.a(a10.get("update_version_code"), 0);
            int a12 = r.a(a10.get("aid"), 4444);
            MonitorCrash init = MonitorCrash.init(context, String.valueOf(a12), a11, String.valueOf(a10.get("app_version")));
            if (init != null) {
                init.config().setDeviceId(h.a().d()).setChannel(String.valueOf(a10.get("channel")));
            }
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z10, z10, z11, z12);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z10, z11, z12, z13, 0L);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z10, boolean z11, boolean z12, boolean z13, long j10) {
        Application application;
        Context context2 = context;
        synchronized (Npth.class) {
            if (h.h() != null) {
                application = h.h();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                application = (Application) context.getApplicationContext();
                if (application == null) {
                    throw new IllegalArgumentException("初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).");
                }
                if (application.getBaseContext() != null) {
                    context2 = application.getBaseContext();
                }
            }
            init(application, context2, iCommonParams, z10, z11, z12, z13, j10);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            h.a(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i10, String str) {
        synchronized (Npth.class) {
            h.a(true);
            h.b(i10, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static boolean isANREnable() {
        return o.c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return o.b();
    }

    public static boolean isNativeCrashEnable() {
        return o.d();
    }

    public static boolean isRunning() {
        return o.i();
    }

    public static boolean isStopUpload() {
        return o.n();
    }

    public static void openANRMonitor() {
        o.g();
    }

    public static void openJavaCrashMonitor() {
        o.f();
    }

    public static boolean openNativeCrashMonitor() {
        return o.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        o.a(iOOMCallback);
    }

    public static void registerSdk(int i10, String str) {
        h.a(i10, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            h.b().b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            h.b().a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        o.a(str);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, f fVar) {
        o.a(str, map, map2, fVar);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, f fVar) {
        o.a(str, map, map2, map3, fVar);
    }

    @Deprecated
    public static void reportError(String str) {
        o.b(str);
    }

    @Deprecated
    public static void reportError(Throwable th) {
        o.a(th);
    }

    public static void setAlogFlushAddr(long j10) {
        o.a(j10);
    }

    public static void setAlogFlushV2Addr(long j10) {
        o.b(j10);
    }

    public static void setAlogLogDirAddr(long j10) {
        o.c(j10);
    }

    public static void setAlogWriteAddr(long j10) {
    }

    public static void setAnrInfoFileObserver(String str, e eVar) {
        o.a(str, eVar);
    }

    public static void setApplication(Application application) {
        h.a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            h.b().a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            h.a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        h.b().a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void setEncryptImpl(d dVar) {
        o.a(dVar);
    }

    public static void setLogcatImpl(com.apm.insight.runtime.j jVar) {
        o.a(jVar);
    }

    public static void setRequestIntercept(com.apm.insight.k.h hVar) {
        o.a(hVar);
    }

    public static void stopAnr() {
        o.j();
    }

    public static void stopUpload() {
        o.o();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        o.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        o.a(iOOMCallback, crashType);
    }
}
