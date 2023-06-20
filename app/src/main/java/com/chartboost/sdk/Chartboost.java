package com.chartboost.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.Custom;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.Privacy.model.GDPR;
import com.chartboost.sdk.f;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.e2;
import com.chartboost.sdk.impl.f;
import com.chartboost.sdk.impl.k0;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.v2;
import com.chartboost.sdk.impl.z1;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class Chartboost {

    @Deprecated
    /* loaded from: classes.dex */
    public enum CBFramework {
        CBFrameworkUnity("Unity"),
        CBFrameworkCorona("Corona"),
        CBFrameworkAir("AIR"),
        CBFrameworkGameSalad("GameSalad"),
        CBFrameworkCordova("Cordova"),
        CBFrameworkCocoonJS("CocoonJS"),
        CBFrameworkCocos2dx("Cocos2dx"),
        CBFrameworkPrime31Unreal("Prime31Unreal"),
        CBFrameworkWeeby("Weeby"),
        CBFrameworkOther("Other");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f13634a;

        CBFramework(String str) {
            this.f13634a = str;
        }

        @Deprecated
        public static CBFramework fromString(String str) {
            CBFramework cBFramework = CBFrameworkUnity;
            if (str.equals(cBFramework.toString())) {
                return cBFramework;
            }
            CBFramework cBFramework2 = CBFrameworkCorona;
            if (str.equals(cBFramework2.toString())) {
                return cBFramework2;
            }
            CBFramework cBFramework3 = CBFrameworkAir;
            if (str.equals(cBFramework3.toString())) {
                return cBFramework3;
            }
            CBFramework cBFramework4 = CBFrameworkGameSalad;
            if (str.equals(cBFramework4.toString())) {
                return cBFramework4;
            }
            CBFramework cBFramework5 = CBFrameworkCordova;
            if (str.equals(cBFramework5.toString())) {
                return cBFramework5;
            }
            CBFramework cBFramework6 = CBFrameworkCocoonJS;
            if (str.equals(cBFramework6.toString())) {
                return cBFramework6;
            }
            CBFramework cBFramework7 = CBFrameworkCocos2dx;
            if (str.equals(cBFramework7.toString())) {
                return cBFramework7;
            }
            CBFramework cBFramework8 = CBFrameworkPrime31Unreal;
            if (str.equals(cBFramework8.toString())) {
                return cBFramework8;
            }
            CBFramework cBFramework9 = CBFrameworkWeeby;
            if (str.equals(cBFramework9.toString())) {
                return cBFramework9;
            }
            CBFramework cBFramework10 = CBFrameworkOther;
            str.equals(cBFramework10.toString());
            return cBFramework10;
        }

        @Deprecated
        public boolean doesWrapperUseCustomBackgroundingBehavior() {
            return this == CBFrameworkAir;
        }

        @Deprecated
        public boolean doesWrapperUseCustomShouldDisplayBehavior() {
            return this == CBFrameworkAir || this == CBFrameworkCocos2dx;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13634a;
        }
    }

    /* loaded from: classes.dex */
    public enum CBMediation {
        CBMediationAdMarvel("AdMarvel"),
        CBMediationAdMob("AdMob"),
        CBMediationFuse("Fuse"),
        CBMediationFyber("Fyber"),
        CBMediationHeyZap("HeyZap"),
        CBMediationMoPub(IronSource.DataSource_MOPUB),
        CBMediationironSource("ironSource"),
        CBMediationHyprMX("HyprMX"),
        CBMediationAerServ("AerServ"),
        CBMediationHelium("Helium"),
        CBMediationFairbid("Fairbid"),
        CBMediationMAX("MAX"),
        CBMediationOther("Other");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f13636a;

        CBMediation(String str) {
            this.f13636a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13636a;
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public enum CBPIDataUseConsent {
        UNKNOWN(-1, "Unknown"),
        NO_BEHAVIORAL(0, "Non behavioral"),
        YES_BEHAVIORAL(1, "Behavioral");
        

        /* renamed from: c  reason: collision with root package name */
        private static Map<Integer, CBPIDataUseConsent> f13637c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private static List<CharSequence> f13638d = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        protected int f13640a;

        /* renamed from: b  reason: collision with root package name */
        protected String f13641b;

        static {
            CBPIDataUseConsent[] values;
            for (CBPIDataUseConsent cBPIDataUseConsent : values()) {
                f13637c.put(Integer.valueOf(cBPIDataUseConsent.f13640a), cBPIDataUseConsent);
                f13638d.add(cBPIDataUseConsent.f13641b);
            }
        }

        @Deprecated
        CBPIDataUseConsent(int i10, String str) {
            this.f13640a = i10;
            this.f13641b = str;
        }

        @Deprecated
        public static CharSequence[] getAsCharsArray() {
            return (CharSequence[]) f13638d.toArray(new CharSequence[0]);
        }

        @Deprecated
        public static CBPIDataUseConsent getConsentByName(String str) {
            CBPIDataUseConsent cBPIDataUseConsent = NO_BEHAVIORAL;
            if (cBPIDataUseConsent.f13641b.equals(str)) {
                return cBPIDataUseConsent;
            }
            CBPIDataUseConsent cBPIDataUseConsent2 = YES_BEHAVIORAL;
            return cBPIDataUseConsent2.f13641b.equals(str) ? cBPIDataUseConsent2 : UNKNOWN;
        }

        @Deprecated
        public int getValue() {
            return this.f13640a;
        }

        @Deprecated
        public static CBPIDataUseConsent valueOf(int i10) {
            CBPIDataUseConsent cBPIDataUseConsent = f13637c.get(Integer.valueOf(i10));
            return cBPIDataUseConsent == null ? UNKNOWN : cBPIDataUseConsent;
        }
    }

    private Chartboost() {
    }

    public static void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        if (context != null && ((dataUseConsent instanceof GDPR) || (dataUseConsent instanceof CCPA) || (dataUseConsent instanceof COPPA) || (dataUseConsent instanceof Custom))) {
            f.a(context, dataUseConsent);
            return;
        }
        try {
            m1.d(new com.chartboost.sdk.Tracking.b("consent_subclassing_error", dataUseConsent.getClass().getName(), "", ""));
        } catch (Exception unused) {
        }
        CBLogging.e("Chartboost", "Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.");
    }

    public static void cacheInterstitial(String str) {
        v2.a("Chartboost.cacheInterstitial", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.b("Chartboost", "Interstitial not supported for this Android version");
            com.chartboost.sdk.impl.a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            if (l.b().a(str)) {
                CBLogging.b("Chartboost", "cacheInterstitial location cannot be empty");
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13863t;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INVALID_LOCATION, null, false, ""));
                return;
            }
            com.chartboost.sdk.Model.e i10 = a10.i();
            if (i10.f13720k && i10.f13721l) {
                com.chartboost.sdk.impl.f fVar = a10.f13862s;
                Objects.requireNonNull(fVar);
                a10.f13860q.execute(new f.b(3, str, null, null, null));
                return;
            }
            Handler j10 = a10.j();
            com.chartboost.sdk.impl.c f10 = a10.f();
            Objects.requireNonNull(f10);
            j10.post(new c.a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, null, false, ""));
        }
    }

    @Deprecated
    public static void cacheMoreApps(String str) {
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            f.b bVar = new f.b(5);
            bVar.f13872b = str;
            a10.f13869z.postDelayed(bVar, k0.f14111b);
        }
    }

    public static void cacheRewardedVideo(String str) {
        v2.a("Chartboost.cacheRewardedVideo", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.b("Chartboost", "Rewarded video not supported for this Android version");
            com.chartboost.sdk.impl.a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            if (l.b().a(str)) {
                CBLogging.b("Chartboost", "cacheRewardedVideo location cannot be empty");
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13867x;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INVALID_LOCATION, null, false, ""));
                return;
            }
            com.chartboost.sdk.Model.e i10 = a10.i();
            if (i10.f13720k && i10.f13724o) {
                com.chartboost.sdk.impl.f fVar = a10.f13866w;
                Objects.requireNonNull(fVar);
                a10.f13860q.execute(new f.b(3, str, null, null, null));
                return;
            }
            Handler j10 = a10.j();
            com.chartboost.sdk.impl.c h10 = a10.h();
            Objects.requireNonNull(h10);
            j10.post(new c.a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, null, false, ""));
        }
    }

    public static DataUseConsent clearDataUseConsent(Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            return f.b(context, str);
        }
        CBLogging.e("Chartboost", "Attempt to removeDataUseConsent. Context and privacyStandard cannot be null.");
        return null;
    }

    @Deprecated
    public static void closeImpression() {
    }

    @Deprecated
    private static void forwardTouchEventsAIR(boolean z10) {
    }

    @Deprecated
    public static boolean getAutoCacheAds() {
        return g.f13889n;
    }

    @Deprecated
    public static String getCustomId() {
        return !a.a() ? "" : g.f13877b;
    }

    public static DataUseConsent getDataUseConsent(Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            return f.a(context, str);
        }
        CBLogging.e("Chartboost", "Attempt to getDataUseConsent. Context and privacyStandard cannot be null.");
        return null;
    }

    public static com.chartboost.sdk.impl.a getDelegate() {
        return g.f13879d;
    }

    public static CBLogging.Level getLoggingLevel() {
        a.a();
        return CBLogging.f13645a;
    }

    @Deprecated
    public static CBPIDataUseConsent getPIDataUseConsent() {
        return e2.f13964a;
    }

    public static String getSDKVersion() {
        return "8.4.3";
    }

    public static boolean hasInterstitial(String str) {
        v2.a("Chartboost.hasInterstitial", str);
        f a10 = f.a();
        return (a10 == null || !a.c() || a10.f13862s.f(str) == null) ? false : true;
    }

    @Deprecated
    public static boolean hasMoreApps(String str) {
        return false;
    }

    public static boolean hasRewardedVideo(String str) {
        v2.a("Chartboost.hasRewardedVideo", str);
        f a10 = f.a();
        return (a10 == null || !a.c() || a10.f13866w.f(str) == null) ? false : true;
    }

    @Deprecated
    public static boolean isAnyViewVisible() {
        v2.a("Chartboost.isAnyViewVisible");
        f a10 = f.a();
        return a10 != null && a10.A.g();
    }

    public static boolean isSdkStarted() {
        f a10 = f.a();
        if (a10 == null) {
            return false;
        }
        return a10.l();
    }

    @Deprecated
    public static boolean isWebViewEnabled() {
        f a10 = f.a();
        return a10 == null || a10.f13868y.get().f13720k;
    }

    @Deprecated
    public static boolean onBackPressed() {
        v2.a("Chartboost.onBackPressed");
        f a10 = f.a();
        if (a10 == null) {
            return false;
        }
        return a10.A.h();
    }

    @TargetApi(28)
    @Deprecated
    public static void setActivityAttrs(Activity activity) {
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        if (!g.f13883h) {
            if ((window.getAttributes().flags & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0) {
                CBLogging.e("Chartboost", "Attempting to show Status and Navigation bars on a fullscreen activity. Please change your Chartboost activity theme to: \"@android:style/Theme.Translucent\"` in your Manifest file");
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
        window.getDecorView().setSystemUiVisibility(5894);
    }

    @Deprecated
    public static void setAutoCacheAds(boolean z10) {
        v2.a("Chartboost.setAutoCacheAds", z10);
        f a10 = f.a();
        if (a10 != null) {
            f.b bVar = new f.b(1);
            bVar.f13873c = z10;
            f.e(bVar);
        }
    }

    @Deprecated
    public static void setChartboostWrapperVersion(String str) {
        v2.a("Chartboost.setChartboostWrapperVersion", str);
        e eVar = new e(5);
        eVar.f13836d = str;
        f.e(eVar);
    }

    @Deprecated
    public static void setCustomId(String str) {
        v2.a("Chartboost.setCustomId", str);
        e eVar = new e(6);
        eVar.f13838f = str;
        f.e(eVar);
    }

    public static void setDelegate(ChartboostDelegate chartboostDelegate) {
        v2.a("Chartboost.setDelegate", chartboostDelegate);
        e eVar = new e(8);
        eVar.f13840h = chartboostDelegate;
        f.e(eVar);
    }

    @Deprecated
    public static void setFramework(CBFramework cBFramework, String str) {
        v2.a("Chartboost.setFramework");
        e eVar = new e(4);
        eVar.f13835c = cBFramework;
        eVar.f13836d = str;
        f.e(eVar);
    }

    @Deprecated
    public static void setFrameworkVersion(String str) {
        v2.a("Chartboost.setFrameworkVersion", str);
        e eVar = new e(5);
        eVar.f13836d = str;
        f.e(eVar);
    }

    public static void setLoggingLevel(CBLogging.Level level) {
        v2.a("Chartboost.setLoggingLevel", level.toString());
        e eVar = new e(7);
        eVar.f13839g = level;
        f.e(eVar);
    }

    @Deprecated
    public static void setMediation(CBMediation cBMediation, String str) {
        v2.a("Chartboost.setMediation.deprecated");
        setMediation(cBMediation, str, null);
    }

    @Deprecated
    public static void setPIDataUseConsent(Context context, CBPIDataUseConsent cBPIDataUseConsent) {
        if (cBPIDataUseConsent == CBPIDataUseConsent.UNKNOWN) {
            clearDataUseConsent(context, "gdpr");
        } else {
            addDataUseConsent(context, new GDPR(GDPR.GDPR_CONSENT.fromValue(String.valueOf(cBPIDataUseConsent.f13640a))));
        }
    }

    @Deprecated
    public static void setShouldDisplayLoadingViewForMoreApps(boolean z10) {
    }

    @Deprecated
    public static void setShouldHideSystemUI(Boolean bool) {
        v2.a("Chartboost.setHideSystemUI", bool);
        g.f13883h = bool.booleanValue();
    }

    @Deprecated
    public static void setShouldPrefetchVideoContent(boolean z10) {
        v2.a("Chartboost.setShouldPrefetchVideoContent", z10);
        f a10 = f.a();
        if (a10 == null || !a.c()) {
            return;
        }
        f.b bVar = new f.b(2);
        bVar.f13874d = z10;
        f.e(bVar);
    }

    @Deprecated
    public static void setShouldRequestInterstitialsInFirstSession(boolean z10) {
        v2.a("Chartboost.setShouldRequestInterstitialsInFirstSession", z10);
        if (a.a()) {
            e eVar = new e(1);
            eVar.f13834b = z10;
            f.e(eVar);
        }
    }

    public static void showInterstitial(String str) {
        v2.a("Chartboost.showInterstitial", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.b("Chartboost", "Interstitial not supported for this Android version");
            com.chartboost.sdk.impl.a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            if (l.b().a(str)) {
                CBLogging.b("Chartboost", "showInterstitial location cannot be empty");
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13863t;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INVALID_LOCATION, null, true, ""));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a10.f13868y.get();
            if (eVar.f13720k && eVar.f13721l) {
                com.chartboost.sdk.impl.f fVar = a10.f13862s;
                Objects.requireNonNull(fVar);
                a10.f13860q.execute(new f.b(4, str, null, null, null));
                return;
            }
            Handler handler2 = a10.f13869z;
            com.chartboost.sdk.impl.c cVar2 = a10.f13863t;
            Objects.requireNonNull(cVar2);
            handler2.post(new c.a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, null, true, ""));
        }
    }

    @Deprecated
    private static void showInterstitialAIR(String str, boolean z10) {
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            com.chartboost.sdk.Model.e eVar = a10.f13868y.get();
            if (eVar.f13720k && eVar.f13721l) {
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13863t;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INTERNAL, null, true, ""));
                return;
            }
            g.f13879d.didFailToLoadInterstitial(str, CBError.CBImpressionError.END_POINT_DISABLED);
        }
    }

    @Deprecated
    public static void showMoreApps(String str) {
        cacheMoreApps(str);
    }

    @Deprecated
    private static void showMoreAppsAIR(String str, boolean z10) {
        cacheMoreApps(str);
    }

    public static void showRewardedVideo(String str) {
        v2.a("Chartboost.showRewardedVideo", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.b("Chartboost", "Rewarded video not supported for this Android version");
            com.chartboost.sdk.impl.a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            if (l.b().a(str)) {
                CBLogging.b("Chartboost", "showRewardedVideo location cannot be empty");
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13867x;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INVALID_LOCATION, null, true, ""));
                return;
            }
            com.chartboost.sdk.Model.e eVar = a10.f13868y.get();
            if (eVar.f13720k && eVar.f13724o) {
                com.chartboost.sdk.impl.f fVar = a10.f13866w;
                Objects.requireNonNull(fVar);
                a10.f13860q.execute(new f.b(4, str, null, null, null));
                return;
            }
            Handler handler2 = a10.f13869z;
            com.chartboost.sdk.impl.c cVar2 = a10.f13867x;
            Objects.requireNonNull(cVar2);
            handler2.post(new c.a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, null, true, ""));
        }
    }

    @Deprecated
    private static void showRewardedVideoAIR(String str, boolean z10) {
        f a10 = f.a();
        if (a10 != null && a.c() && f.k()) {
            com.chartboost.sdk.Model.e eVar = a10.f13868y.get();
            if (eVar.f13720k && eVar.f13724o) {
                Handler handler = a10.f13869z;
                com.chartboost.sdk.impl.c cVar = a10.f13863t;
                Objects.requireNonNull(cVar);
                handler.post(new c.a(4, str, CBError.CBImpressionError.INTERNAL, null, true, ""));
                return;
            }
            com.chartboost.sdk.impl.a aVar = g.f13879d;
            if (aVar != null) {
                aVar.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.END_POINT_DISABLED);
            }
        }
    }

    @Deprecated
    public static void startWithAppId(Activity activity, String str, String str2) {
        if (activity == null) {
            CBLogging.b("Chartboost", "Can't start SDK with null activity");
        } else {
            startWithAppId(activity.getApplicationContext(), str, str2);
        }
    }

    public static void setMediation(CBMediation cBMediation, String str, String str2) {
        v2.a("Chartboost.setMediation");
        e eVar = new e(3);
        eVar.f13836d = str;
        eVar.f13837e = new MediationModel(cBMediation.toString() + " " + str, str, str2);
        f.e(eVar);
    }

    public static void startWithAppId(Context context, String str, String str2) {
        g.f13876a = "\u200b!SDK-VERSION-STRING!:\u200bcom.chartboost.sdk:android-sdk:8.4.3";
        v2.a("Chartboost.startWithAppId", context);
        e eVar = new e(0);
        eVar.f13841i = context;
        eVar.f13842j = str;
        eVar.f13843k = str2;
        f.e(eVar);
    }

    public static void cacheInterstitial(String str, String str2) {
        v2.a("Chartboost.cacheHeliumInterstitial", str);
        z1.a(str, str2, 0);
    }

    public static void cacheRewardedVideo(String str, String str2) {
        v2.a("Chartboost.cacheHeliumRewardedVideo", str);
        z1.a(str, str2, 1);
    }
}
