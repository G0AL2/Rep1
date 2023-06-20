package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.c.a;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.i.d;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.r;
import com.bytedance.sdk.openadsdk.core.u;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.bytedance.sdk.openadsdk.utils.h;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class TTAdSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    /* renamed from: b  reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f10616b;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f10615a = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static final TTAdManager f10617c = new u();
    public static final long INIT_TIME = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private static long f10618d = 0;

    /* loaded from: classes.dex */
    public interface InitCallback {
        void fail(int i10, String str);

        void success();
    }

    public static void addInitCallback(InitCallback initCallback) {
        if (initCallback == null) {
            return;
        }
        List<InitCallback> list = k.f12491d;
        synchronized (list) {
            if (isInitSuccess()) {
                initCallback.success();
            } else if (k.e() == 2) {
                initCallback.fail(INIT_LOCAL_FAIL_CODE, "Pangle Sdk initialization has failed before addPAGInitCallback");
            } else {
                list.add(initCallback);
            }
        }
    }

    private static void c(final Context context, TTAdConfig tTAdConfig) {
        c();
        k.f12488a = tTAdConfig.isAsyncInit();
        TTAdManager tTAdManager = f10617c;
        tTAdManager.setAppId(tTAdConfig.getAppId()).setCoppa(tTAdConfig.getCoppa()).setGdpr(tTAdConfig.getGDPR()).setCcpa(tTAdConfig.getCcpa()).setName(tTAdConfig.getAppName()).setIconId(tTAdConfig.getAppIconId()).setPaid(tTAdConfig.isPaid()).setKeywords(tTAdConfig.getKeywords()).setData(tTAdConfig.getData()).setTitleBarTheme(tTAdConfig.getTitleBarTheme()).setAllowShowNotifiFromSDK(tTAdConfig.isAllowShowNotify()).isUseTextureView(tTAdConfig.isUseTextureView()).setNeedClearTaskReset(tTAdConfig.getNeedClearTaskReset()).debugLog(tTAdConfig.getDebugLog());
        try {
            if (tTAdConfig.isDebug()) {
                l.b();
                tTAdManager.openDebugMode();
                h.a();
                c.b();
            }
        } catch (Throwable unused) {
        }
        f.f12349a = d.b(context);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.3
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (f.f12350b.equals(str)) {
                    e.a(new g("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            String b10 = d.b(context);
                            if ((TextUtils.isEmpty(b10) && !TextUtils.isEmpty(f.f12349a)) || !b10.equals(f.f12349a)) {
                                d.a(m.h()).a(true);
                                f.f12349a = b10;
                            }
                        }
                    });
                }
            }
        };
        f10616b = onSharedPreferenceChangeListener;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private static void d(Context context, TTAdConfig tTAdConfig) {
        if (!TextUtils.isEmpty(tTAdConfig.getPackageName())) {
            t.a(tTAdConfig.getPackageName());
        }
        m.a(context);
        if (!tTAdConfig.isSupportMultiProcess()) {
            b.b();
        }
        k.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, TTAdConfig tTAdConfig) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            e.b(-1);
            com.bytedance.sdk.openadsdk.multipro.d.a(context);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) e.a();
            a.a(context).a(threadPoolExecutor);
            k.f12489b.set(true);
            if (tTAdConfig.isSupportMultiProcess()) {
                b.a();
            }
            try {
                com.bytedance.sdk.component.adexpress.a.a.a.a().a(com.bytedance.sdk.openadsdk.d.a.a());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            updateAdConfig(tTAdConfig);
            c(context, tTAdConfig);
            k.a();
            i3.b.b(context, null, threadPoolExecutor, k.c());
            i3.b.d(tTAdConfig.isSupportMultiProcess());
            i3.b.c(com.bytedance.sdk.openadsdk.i.d.a().b().e());
            if (Build.VERSION.SDK_INT < 23) {
                u2.a.a(context);
            }
            if (m.h().C()) {
                r.a();
            }
            NetworkTools.c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(final Context context, final TTAdConfig tTAdConfig) {
        e.a(new g("init sync") { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.4
            @Override // java.lang.Runnable
            public void run() {
                f h10 = m.h();
                if (!h10.E()) {
                    synchronized (h10) {
                        if (!h10.E()) {
                            h10.a();
                            h10.a(Boolean.FALSE);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.utils.e.f();
                k.a(context);
                e.a(true);
                e.a(new com.bytedance.sdk.openadsdk.h.b.a());
                if (Build.VERSION.SDK_INT != 29 || !com.bytedance.sdk.openadsdk.utils.m.r()) {
                    com.bytedance.sdk.openadsdk.utils.e.a(context);
                }
                com.bytedance.sdk.openadsdk.utils.e.f(context);
                com.bytedance.sdk.openadsdk.utils.e.j(context);
                com.bytedance.sdk.openadsdk.utils.e.k(context);
            }
        }, 10, 5);
        k.c().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.5
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdConfig.this.isSupportMultiProcess()) {
                    if (com.bytedance.sdk.component.utils.r.a(context)) {
                        d.a(m.h()).a(true);
                        l.c("TTAdSdk", "Load setting in main process");
                    }
                } else {
                    d.a(m.h()).a(true);
                }
                m.c().a();
                m.e().a();
                m.d().a();
            }
        });
        d();
    }

    public static TTAdManager getAdManager() {
        com.bytedance.sdk.openadsdk.utils.u.m("getAdManager");
        return f10617c;
    }

    public static int getCCPA() {
        com.bytedance.sdk.openadsdk.utils.u.m("getCCPA");
        return com.bytedance.sdk.openadsdk.core.h.d().v();
    }

    public static int getCoppa() {
        com.bytedance.sdk.openadsdk.utils.u.m("getCoppa");
        return f10617c.getCoppa();
    }

    public static int getGdpr() {
        com.bytedance.sdk.openadsdk.utils.u.m("getGdpr");
        return f10617c.getGdpr();
    }

    public static void init(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        f10618d = SystemClock.elapsedRealtime();
        if (initCallback != null) {
            List<InitCallback> list = k.f12491d;
            if (!list.contains(initCallback)) {
                list.add(initCallback);
            }
        }
        k.a(3);
        if (isInitSuccess()) {
            e();
        } else if (context == null && initCallback != null) {
            b((int) INIT_LOCAL_FAIL_CODE, "Context is null, please check. ");
        } else if (tTAdConfig == null && initCallback != null) {
            b((int) INIT_LOCAL_FAIL_CODE, "TTAdConfig is null, please check.");
        } else {
            d(context, tTAdConfig);
            try {
                com.bytedance.sdk.openadsdk.core.h.a(initCallback);
                try {
                    t.a(m.a(), "tt_ad_logo_txt");
                    if (isInitSuccess()) {
                        if (initCallback != null) {
                            e();
                        }
                    } else if (!tTAdConfig.isSupportMultiProcess()) {
                        b(context, tTAdConfig, initCallback);
                    } else {
                        com.bytedance.sdk.openadsdk.multipro.aidl.a.a(new com.bytedance.sdk.openadsdk.multipro.aidl.b() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.1
                            @Override // com.bytedance.sdk.openadsdk.multipro.aidl.b
                            public void a() {
                                TTAdSdk.b(context, tTAdConfig, initCallback);
                            }
                        });
                        com.bytedance.sdk.openadsdk.multipro.aidl.a.a(context).a();
                    }
                } catch (Throwable unused) {
                    if (initCallback != null) {
                        b((int) INIT_LOCAL_FAIL_CODE, "resources not found, if you use aab please call TTAdConfig.setPackageName");
                    }
                }
            } catch (Throwable unused2) {
                if (initCallback != null) {
                    b((int) INIT_LOCAL_FAIL_CODE, "Internal Error, setting exception. ");
                }
            }
        }
    }

    public static boolean isInitSuccess() {
        return k.e() == 1;
    }

    public static void setCCPA(int i10) {
        com.bytedance.sdk.openadsdk.utils.u.m("setCCPA");
        if (i10 == getCCPA()) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.h.d().f(i10);
        d.a(m.h()).a(true);
    }

    public static void setCoppa(int i10) {
        com.bytedance.sdk.openadsdk.utils.u.m("setCoppa");
        if (i10 == getCoppa()) {
            return;
        }
        f10617c.setCoppa(i10);
        d.a(m.h()).a(true);
    }

    public static void setGdpr(int i10) {
        com.bytedance.sdk.openadsdk.utils.u.m("setGdpr");
        if (i10 == getGdpr()) {
            return;
        }
        f10617c.setGdpr(i10);
        d.a(m.h()).a(true);
    }

    public static void updateAdConfig(TTAdConfig tTAdConfig) {
        if (tTAdConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(tTAdConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.h.d().d(tTAdConfig.getData());
        }
        if (TextUtils.isEmpty(tTAdConfig.getKeywords())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.h.d().c(tTAdConfig.getKeywords());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, final TTAdConfig tTAdConfig, final InitCallback initCallback) {
        k.c().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.2
            @Override // java.lang.Runnable
            public void run() {
                boolean z10;
                try {
                } catch (Throwable th) {
                    th.printStackTrace();
                    if (InitCallback.this != null) {
                        TTAdSdk.b((int) TTAdSdk.INIT_LOCAL_FAIL_CODE, th.getMessage());
                    }
                    z10 = false;
                }
                if (TTAdSdk.isInitSuccess()) {
                    if (InitCallback.this != null) {
                        TTAdSdk.e();
                        return;
                    }
                    return;
                }
                TTAdSdk.e(context, tTAdConfig);
                TTAdSdk.f(context, tTAdConfig);
                if (InitCallback.this != null) {
                    TTAdSdk.e();
                }
                z10 = true;
                TTAdSdk.b(context, SystemClock.elapsedRealtime() - TTAdSdk.f10618d, z10, tTAdConfig);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Context context, final long j10, final boolean z10, final TTAdConfig tTAdConfig) {
        e.a(new g("initMustBeCall") { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.7
            @Override // java.lang.Runnable
            public void run() {
                ApmHelper.initApm(context, tTAdConfig);
                if (m.h().F()) {
                    try {
                        boolean e10 = com.bytedance.sdk.openadsdk.core.h.d().e();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", j10);
                        jSONObject.put("is_async", true);
                        jSONObject.put("is_multi_process", tTAdConfig.isSupportMultiProcess());
                        jSONObject.put("is_debug", tTAdConfig.isDebug());
                        jSONObject.put("is_use_texture_view", tTAdConfig.isUseTextureView());
                        jSONObject.put("is_activate_init", e10);
                        jSONObject.put("minSdkVersion", com.bytedance.sdk.openadsdk.utils.u.o(context));
                        jSONObject.put("targetSdkVersion", com.bytedance.sdk.openadsdk.utils.u.n(context));
                        jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                        jSONObject.put("is_success", z10);
                        com.bytedance.sdk.openadsdk.core.h.d().b(false);
                        com.bytedance.sdk.openadsdk.h.b.a().a("pangle_sdk_init", jSONObject);
                        l.a("TTAdSdk", "pangle_sdk_init = ", jSONObject);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, String str) {
        List<InitCallback> list = k.f12491d;
        synchronized (list) {
            k.a(2);
            for (InitCallback initCallback : list) {
                try {
                    initCallback.fail(i10, str);
                } catch (Throwable unused) {
                }
            }
            k.f12491d.clear();
        }
    }

    private static void d() {
        e.b(new g("Disk Event") { // from class: com.bytedance.sdk.openadsdk.TTAdSdk.6
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.h.b.b();
            }
        }, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        List<InitCallback> list = k.f12491d;
        synchronized (list) {
            k.a(1);
            for (InitCallback initCallback : list) {
                try {
                    initCallback.success();
                } catch (Throwable unused) {
                }
            }
            k.f12491d.clear();
        }
    }

    private static void c() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context a10 = m.a();
                if (a10 == null || (shortcutManager = (ShortcutManager) a10.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.h.d().a(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }
}
