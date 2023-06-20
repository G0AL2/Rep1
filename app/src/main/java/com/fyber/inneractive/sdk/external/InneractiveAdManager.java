package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.h;
import com.fyber.inneractive.sdk.config.i;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.config.k;
import com.fyber.inneractive.sdk.config.m;
import com.fyber.inneractive.sdk.config.s;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a0;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.n0;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.t0;
import com.fyber.inneractive.sdk.util.u0;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.w0;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class InneractiveAdManager implements i.b {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";

    /* renamed from: c  reason: collision with root package name */
    public static IAConfigManager.OnConfigurationReadyAndValidListener f17138c;

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f17139a;

    /* renamed from: b  reason: collision with root package name */
    public String f17140b;

    /* loaded from: classes.dex */
    public enum GdprConsentSource {
        Internal,
        External
    }

    /* loaded from: classes.dex */
    public class a implements IAConfigManager.OnConfigurationReadyAndValidListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f17142a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OnFyberMarketplaceInitializedListener f17143b;

        public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
            this.f17142a = context;
            this.f17143b = onFyberMarketplaceInitializedListener;
        }

        @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
        public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z10, Exception exc) {
            OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
            if (this.f17142a.getApplicationContext() != null) {
                IAConfigManager.removeListener(this);
                InneractiveAdManager.f17138c = null;
                if (z10) {
                    InneractiveAdManager.a(this.f17143b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
                    return;
                }
                OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener = this.f17143b;
                if (exc instanceof InvalidAppIdException) {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
                } else {
                    fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
                }
                InneractiveAdManager.a(onFyberMarketplaceInitializedListener, fyberInitStatus, exc.getLocalizedMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static volatile InneractiveAdManager f17144a = new InneractiveAdManager();
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (b.f17144a.f17139a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        q.a aVar = new q.a(o.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (e) null, (JSONArray) null);
        if (!TextUtils.isEmpty(str)) {
            aVar.a("message", str);
        }
        aVar.a("init_status", fyberInitStatus.name());
        aVar.a((String) null);
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            IAlog.a("Clearing GDPR Consent String and status", new Object[0]);
            if (l.f20301a == null) {
                IAlog.e("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.b();
            dVar.f16923a = null;
            dVar.f16924b = null;
            SharedPreferences sharedPreferences = dVar.f16929g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
                return;
            }
            return;
        }
        IAlog.e("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.J.A.f20292a = null;
    }

    public static void clearLgpdConsentData() {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            IAlog.a("Clearing LGPD consent status", new Object[0]);
            if (l.f20301a == null) {
                IAlog.e("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.b();
            dVar.f16928f = null;
            SharedPreferences sharedPreferences = dVar.f16929g;
            if (sharedPreferences != null) {
                sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
                return;
            }
            return;
        }
        IAlog.e("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void clearUSPrivacyString() {
        d dVar = IAConfigManager.J.D;
        dVar.getClass();
        IAlog.a("Clearing CCPA Consent String", new Object[0]);
        if (l.f20301a == null) {
            IAlog.e("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        dVar.b();
        dVar.f16927e = null;
        SharedPreferences sharedPreferences = dVar.f16929g;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    public static void destroy() {
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (b.f17144a.f17139a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        b.f17144a.f17139a = null;
        IAConfigManager.removeListener(f17138c);
        f17138c = null;
        IAConfigManager iAConfigManager = IAConfigManager.J;
        iAConfigManager.A.f20292a = null;
        iAConfigManager.f16872h = false;
        z zVar = z.a.f20363a;
        IAlog.a("%sdestroy called", "Location Manager: ");
        Runnable runnable = zVar.f20359d;
        if (runnable != null) {
            n.f20310b.removeCallbacks(runnable);
        }
        zVar.a(zVar.f20360e);
        zVar.a(zVar.f20361f);
        zVar.f20360e = null;
        zVar.f20361f = null;
        zVar.f20356a = null;
        zVar.f20358c = null;
        f0 f0Var = f0.d.f20270a;
        f0Var.f20265b.clear();
        for (Context context : f0Var.f20264a.keySet()) {
            Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = f0Var.f20264a.get(context);
            if (pair != null && ((ViewTreeObserver) pair.first).isAlive()) {
                ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
            }
        }
        f0Var.f20264a.clear();
        b0 b0Var = b0.a.f20236a;
        synchronized (b0Var) {
            if (b0Var.f20234c != null) {
                IAlog.a("%sremoving screen state receiver and destroying singleton", IAlog.a(b0Var));
                b0Var.f20234c.unregisterReceiver(b0Var.f20235d);
                b0Var.f20234c = null;
                b0Var.f20235d = null;
                b0Var.f20232a.clear();
            }
        }
        b.a.f17184a.f17183a.clear();
        a.b.f17182a.f17181a.clear();
        c.b.f17186a.f17185a.clear();
        InneractiveAdSpotManager.destroy();
        ((HashMap) l.b.f20303a).clear();
        com.fyber.inneractive.sdk.bidder.a aVar = com.fyber.inneractive.sdk.bidder.a.f16741h;
        com.fyber.inneractive.sdk.bidder.e eVar = aVar.f16745d;
        if (eVar != null) {
            try {
                l.f20301a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
        aVar.f16745d = null;
    }

    public static String getAppId() {
        return IAConfigManager.J.f16867c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return b.f17144a.f17140b;
    }

    public static Boolean getGdprConsent() {
        return IAConfigManager.J.D.a();
    }

    public static GdprConsentSource getGdprStatusSource() {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            return dVar.f16925c;
        }
        IAlog.e("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    @Deprecated
    public static String getKeywords() {
        return IAConfigManager.J.f16875k;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.J.f16876l;
    }

    public static String getUserId() {
        return IAConfigManager.e();
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.J.f16874j;
    }

    public static String getVersion() {
        return "8.1.5";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        b.f17144a.f17140b = str;
    }

    public static void setGdprConsent(boolean z10) {
        setGdprConsent(z10, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            if (l.f20301a == null) {
                IAlog.e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f16924b = str;
            if (dVar.a("IAGdprConsentData", str)) {
                return;
            }
            IAlog.e("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            return;
        }
        IAlog.e("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.J.A.f20292a = onGlobalImpressionDataListener;
    }

    @Deprecated
    public static void setKeywords(String str) {
        IAConfigManager.J.f16875k = str;
    }

    public static void setLgpdConsent(boolean z10) {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            if (l.f20301a == null) {
                IAlog.e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f16928f = Boolean.valueOf(z10);
            if (dVar.a("IALgpdConsentStatus", z10)) {
                return;
            }
            IAlog.e("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        IAlog.e("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setLogLevel(int i10) {
        IAlog.f20222a = i10;
    }

    public static void setMediationName(String str) {
        IAConfigManager.J.f16877m = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.J.f16879o = str;
        }
    }

    public static void setMuteVideo(boolean z10) {
        IAConfigManager.J.f16876l = z10;
    }

    public static void setUSPrivacyString(String str) {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            if (l.f20301a == null) {
                IAlog.e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f16927e = str;
            if (dVar.a("IACCPAConsentData", str)) {
                return;
            }
            IAlog.e("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            return;
        }
        IAlog.e("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setUseLocation(boolean z10) {
        IAConfigManager.J.f16883s = z10;
    }

    public static void setUserId(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        if (l.f20301a == null) {
            IAlog.e("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        d dVar = iAConfigManager.D;
        dVar.getClass();
        if (l.f20301a != null) {
            dVar.b();
            if (TextUtils.isEmpty(str)) {
                dVar.f16926d = str;
                SharedPreferences sharedPreferences = dVar.f16929g;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 256) {
                str = str.substring(0, 256);
            }
            SharedPreferences sharedPreferences2 = dVar.f16929g;
            if (sharedPreferences2 != null) {
                dVar.f16926d = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.J.f16874j = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z10) {
        IAConfigManager.J.f16882r = z10;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z10));
        if (r.a() || z10) {
            return;
        }
        IAlog.e("************************************************************************************************************************", new Object[0]);
        IAlog.e("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.e("***  The traffic will be Secured  ", new Object[0]);
        IAlog.e("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return b.f17144a.f17139a != null;
    }

    public Context getAppContext() {
        return this.f17139a;
    }

    @Override // com.fyber.inneractive.sdk.config.i.b
    public void onGlobalConfigChanged(i iVar, h hVar) {
        if (hVar == null || !hVar.a(GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT, false)) {
            return;
        }
        n.f20310b.post(new com.fyber.inneractive.sdk.external.b(this));
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus;
        IAConfigManager iAConfigManager;
        String str2;
        String str3;
        int i10;
        if (context != null && str != null) {
            String str4 = IAConfigManager.J.f16867c;
            boolean z10 = (str4 == null || str4.equalsIgnoreCase(str)) ? false : true;
            if (b.f17144a.f17139a != null && !z10) {
                IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
                a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
                return;
            }
            ((CopyOnWriteArrayList) IAlog.f20224c).retainAll(Collections.singleton(IAlog.f20223b));
            int i11 = com.fyber.inneractive.sdk.config.e.f16935a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
            if (property != null) {
                for (String str5 : property.split(",")) {
                    try {
                        FMPLogger fMPLogger = (FMPLogger) Class.forName(str5).newInstance();
                        fMPLogger.initialize(context);
                        ((CopyOnWriteArrayList) IAlog.f20224c).add(fMPLogger);
                    } catch (Throwable unused) {
                    }
                }
            }
            l.f20301a = (Application) context.getApplicationContext();
            b0 b0Var = b0.a.f20236a;
            Context applicationContext = context.getApplicationContext();
            b0Var.getClass();
            IAlog.a("%sinit called", IAlog.a(b0Var));
            b0Var.f20234c = applicationContext;
            b0Var.f20235d = new a0(b0Var);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            b0Var.f20234c.registerReceiver(b0Var.f20235d, intentFilter);
            Intent intent = new Intent();
            intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
            intent.setPackage(l.f20301a.getPackageName());
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                List<BroadcastReceiver> asList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.dv.c());
                for (BroadcastReceiver broadcastReceiver : asList) {
                    try {
                        broadcastReceiver.onReceive(applicationContext2, intent);
                    } catch (Throwable unused2) {
                        IAlog.e("%sCould not trigger receiver for %s", IAlog.a((Class<?>) com.fyber.inneractive.sdk.b.class), broadcastReceiver);
                    }
                }
                if (b.a.f17184a.f17183a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                if (asList.size() == 0) {
                    IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
                    a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
                    return;
                }
                a aVar = new a(context, onFyberMarketplaceInitializedListener);
                f17138c = aVar;
                IAConfigManager.addListener(aVar);
                if (z10) {
                    IAConfigManager iAConfigManager2 = IAConfigManager.J;
                    iAConfigManager2.f16867c = str;
                    Map<String, x> map = iAConfigManager2.f16865a;
                    if (map != null) {
                        map.clear();
                    }
                    Map<String, y> map2 = iAConfigManager2.f16866b;
                    if (map2 != null) {
                        map2.clear();
                    }
                    iAConfigManager2.f16869e = null;
                    iAConfigManager2.f16868d = "";
                    IAConfigManager.a();
                } else {
                    Context applicationContext3 = context.getApplicationContext();
                    IAConfigManager iAConfigManager3 = IAConfigManager.J;
                    if (!iAConfigManager3.f16872h) {
                        u0 u0Var = new u0();
                        iAConfigManager3.f16889y = u0Var;
                        u0Var.f20337b = applicationContext3.getApplicationContext();
                        n.a(new t0(u0Var));
                        w wVar = iAConfigManager3.f16884t;
                        if (!wVar.f17706b) {
                            wVar.f17706b = true;
                            for (int i12 = 0; i12 < 6; i12++) {
                                wVar.f17708d.submit(wVar.f17709e);
                            }
                        }
                        n.a(new m(iAConfigManager3, iAConfigManager3, applicationContext3));
                        com.fyber.inneractive.sdk.web.r.f20447c.getClass();
                        iAConfigManager3.D = new d();
                        i iVar = new i(applicationContext3);
                        iAConfigManager3.f16886v = iVar;
                        iAConfigManager3.f16887w = new j(iVar);
                        iVar.b();
                        com.fyber.inneractive.sdk.network.c cVar = iAConfigManager3.G;
                        Application application = (Application) applicationContext3.getApplicationContext();
                        if (!cVar.f17531g) {
                            cVar.f17531g = true;
                            cVar.f17527c.start();
                            cVar.f17528d = new n0(cVar.f17527c.getLooper(), cVar);
                        }
                        application.registerActivityLifecycleCallbacks(new com.fyber.inneractive.sdk.network.d(cVar));
                        iAConfigManager3.f16886v.f16988c.add(new com.fyber.inneractive.sdk.config.l(iAConfigManager3));
                        iAConfigManager3.f16890z = new com.fyber.inneractive.sdk.config.global.a(new com.fyber.inneractive.sdk.config.global.r());
                        IAlog.a("Initializing config manager", new Object[0]);
                        IAlog.a("Config manager: lib name = %s", "Android");
                        IAlog.a("Config manager: app version = %s", "8.1.5");
                        z zVar = z.a.f20363a;
                        Context applicationContext4 = applicationContext3.getApplicationContext();
                        zVar.f20356a = applicationContext4;
                        if (applicationContext4 != null && IAConfigManager.J.f16883s) {
                            v vVar = new v(zVar);
                            zVar.f20358c = vVar;
                            com.fyber.inneractive.sdk.util.i.a(applicationContext4, vVar);
                        }
                        k kVar = k.b.f16995a;
                        if (kVar.f16993a == null) {
                            kVar.f16993a = applicationContext3;
                            new Thread(new s(applicationContext3, kVar)).start();
                        }
                        if (!str.matches("[0-9]+")) {
                            IAlog.b("************************************************************************************************************************", new Object[0]);
                            IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                            IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                            IAlog.b("************************************************************************************************************************", new Object[0]);
                        }
                        iAConfigManager3.f16870f = applicationContext3;
                        iAConfigManager3.f16867c = str;
                        iAConfigManager3.f16874j = new InneractiveUserConfig();
                        iAConfigManager3.f16872h = true;
                        d0 d0Var = iAConfigManager3.f16888x;
                        d0Var.getClass();
                        com.fyber.inneractive.sdk.config.b bVar = new com.fyber.inneractive.sdk.config.b(d0Var);
                        i iVar2 = IAConfigManager.J.f16886v;
                        if (!iVar2.f16989d) {
                            iVar2.f16988c.add(bVar);
                        }
                        w0 w0Var = new w0(TimeUnit.MINUTES, iAConfigManager.f16886v.f16987b.a("session_duration", 30, 1));
                        bVar.f16912c = w0Var;
                        w0Var.f20351e = bVar.f16915f;
                        d0Var.f16932c.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        com.fyber.inneractive.sdk.cache.session.d dVar = new com.fyber.inneractive.sdk.cache.session.d(25, null);
                        d0Var.f16930a = dVar;
                        n.a(new com.fyber.inneractive.sdk.cache.session.b(dVar));
                        iAConfigManager3.B = new com.fyber.inneractive.sdk.network.f0(new com.fyber.inneractive.sdk.config.n(iAConfigManager3), iAConfigManager3.f16870f, new com.fyber.inneractive.sdk.config.c());
                        n.a(new com.fyber.inneractive.sdk.config.o(iAConfigManager3));
                        try {
                            str2 = Locale.getDefault().getLanguage();
                            try {
                                IAlog.a("Available device language: %s", str2);
                            } catch (Exception unused3) {
                            }
                        } catch (Exception unused4) {
                            str2 = null;
                        }
                        iAConfigManager3.f16880p = str2;
                        iAConfigManager3.E.a();
                    }
                }
                b.f17144a.f17139a = context.getApplicationContext();
                SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
                String string = sharedPreferences.getString("FyberExceptionKey", "empty");
                String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
                String string3 = sharedPreferences.getString("FyberNameKey", "empty");
                String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
                IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
                if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
                    IAlog.a("Firing Event 999 for %s", string);
                    p pVar = p.IA_UNCAUGHT_EXCEPTION;
                    q.a aVar2 = new q.a(null);
                    aVar2.f17683c = pVar;
                    aVar2.f17681a = null;
                    aVar2.f17684d = null;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("exception_name", string3);
                        str3 = "FyberNameKey";
                        i10 = 2;
                    } catch (Exception unused5) {
                        str3 = "FyberNameKey";
                        i10 = 2;
                        IAlog.e("Got exception adding param to json object: %s, %s", "exception_name", string3);
                    }
                    try {
                        jSONObject.put("description", string2);
                    } catch (Exception unused6) {
                        Object[] objArr = new Object[i10];
                        objArr[0] = "description";
                        objArr[1] = string2;
                        IAlog.e("Got exception adding param to json object: %s, %s", objArr);
                    }
                    try {
                        jSONObject.put("stack_trace", string);
                    } catch (Exception unused7) {
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = "stack_trace";
                        objArr2[1] = string;
                        IAlog.e("Got exception adding param to json object: %s, %s", objArr2);
                    }
                    aVar2.f17686f.put(jSONObject);
                    aVar2.a(string4);
                    sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove(str3).apply();
                }
                Thread.setDefaultUncaughtExceptionHandler(new com.fyber.inneractive.sdk.external.a(sharedPreferences, Thread.getDefaultUncaughtExceptionHandler()));
                IAConfigManager iAConfigManager4 = IAConfigManager.J;
                iAConfigManager4.f16886v.f16988c.remove(b.f17144a);
                iAConfigManager4.f16886v.f16988c.add(b.f17144a);
                return;
            }
            throw new IllegalArgumentException("Context can't be null");
        }
        IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
        Object[] objArr3 = new Object[1];
        objArr3[0] = str == null ? "appid" : "context";
        String format = String.format("%s is null", objArr3);
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED;
        } else {
            fyberInitStatus = OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID;
        }
        a(onFyberMarketplaceInitializedListener, fyberInitStatus, format);
    }

    public static void setGdprConsent(boolean z10, GdprConsentSource gdprConsentSource) {
        d dVar = IAConfigManager.J.D;
        if (dVar != null) {
            if (l.f20301a == null) {
                IAlog.e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
                return;
            }
            dVar.f16923a = Boolean.valueOf(z10);
            if (!dVar.a("IAGDPRBool", z10)) {
                IAlog.e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            dVar.f16925c = gdprConsentSource;
            if (dVar.a("IAGdprSource", gdprConsentSource.name())) {
                return;
            }
            IAlog.e("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        IAlog.e("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.J;
            iAConfigManager.f16878n = inneractiveMediationName;
            iAConfigManager.f16877m = inneractiveMediationName.getKey();
        }
    }
}
