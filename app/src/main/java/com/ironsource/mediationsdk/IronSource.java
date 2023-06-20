package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1741o;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.O;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import fm.castbox.mediation.widget.AdView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    /* loaded from: classes3.dex */
    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(AdView.AdType.BANNER);
        

        /* renamed from: a  reason: collision with root package name */
        private String f26298a;

        AD_UNIT(String str) {
            this.f26298a = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f26298a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        J a10 = J.a();
        if (com.ironsource.mediationsdk.c.a.a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.mediationsdk.utils.k.a().a(impressionDataListener);
            B b10 = a10.f26354z;
            if (b10 != null) {
                b10.a(impressionDataListener);
            }
            U u10 = a10.A;
            if (u10 != null) {
                u10.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
            if (gVar != null) {
                gVar.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a10.D;
            if (hVar != null) {
                hVar.a(impressionDataListener);
            }
            R r10 = a10.B;
            if (r10 != null) {
                r10.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        J.a().f26342n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            a10.f26334f.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a10.f26334f.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(final IronSourceBannerLayout ironSourceBannerLayout) {
        final R r10;
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!a10.K || (r10 = a10.B) == null) {
                C1739m c1739m = a10.f26333e;
                if (c1739m != null) {
                    c1739m.a(ironSourceBannerLayout);
                    return;
                }
                return;
            }
            IronLog.INTERNAL.verbose("");
            C1741o.b bVar = new C1741o.b() { // from class: com.ironsource.mediationsdk.R.2
                @Override // com.ironsource.mediationsdk.C1741o.b
                public final void a() {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("destroying banner");
                    R.this.f26484e.d();
                    R r11 = R.this;
                    T t10 = r11.f26487h;
                    R.this.a(IronSourceConstants.BN_DESTROY, (Object[][]) null, t10 != null ? t10.m() : r11.f26488i);
                    R r12 = R.this;
                    if (r12.f26487h != null) {
                        ironLog.verbose("mActiveSmash = " + r12.f26487h.p());
                        r12.f26487h.a();
                        r12.f26487h = null;
                    }
                    ironSourceBannerLayout.b();
                    R r13 = R.this;
                    r13.f26485f = null;
                    r13.f26486g = null;
                    r13.a(R.a.READY_TO_LOAD);
                }

                @Override // com.ironsource.mediationsdk.C1741o.b
                public final void a(String str) {
                    IronLog ironLog = IronLog.API;
                    ironLog.error("destroy banner failed - errorMessage = " + str);
                }
            };
            if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                bVar.a();
                return;
            }
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            bVar.a(String.format("can't destroy banner - %s", objArr));
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            C1745s c1745s = a10.N;
            if (c1745s != null) {
                c1745s.a(iSDemandOnlyBannerLayout);
            }
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        J.a();
        return J.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String n10;
        synchronized (IronSource.class) {
            n10 = J.a().n();
        }
        return n10;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b10;
        synchronized (IronSource.class) {
            b10 = J.a().b(context);
        }
        return b10;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return J.a().k(str);
    }

    public static void getOfferwallCredits() {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            com.ironsource.mediationsdk.sdk.k kVar = a10.f26332d.f26474a;
            if (kVar != null) {
                kVar.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return J.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        J.a().a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        J.a().a(activity, str, false, null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        J.a().a(activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        J.a().a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return J.a().n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return J.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return J.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return J.a().m(str);
    }

    public static boolean isInterstitialReady() {
        return J.a().h();
    }

    public static boolean isOfferwallAvailable() {
        return J.a().l();
    }

    public static boolean isRewardedVideoAvailable() {
        return J.a().c();
    }

    public static boolean isRewardedVideoPlacementCapped(String str) {
        int i10;
        J a10 = J.a();
        int o10 = a10.o(str);
        boolean z10 = o10 != 0 && ((i10 = J.AnonymousClass1.f26356b[o10 - 1]) == 1 || i10 == 2 || i10 == 3);
        if (z10) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(a10.f26349u, a10.E, a10.L);
            if (str != null) {
                J.a(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            J.a((int) IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
        return z10;
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        J.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        J.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        J.a().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        J.a().d(activity, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        J.a().d(null, str, null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        J.a().c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        J.a().c(null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        J.a().b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        J.a().b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        J.a().a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        J.a().a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (a10.f26350v) {
                a10.f26334f.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C1744r.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a10.f26352x) {
                a10.f26334f.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                C1744r.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                O.a b10 = O.a().b();
                if (b10 == O.a.INIT_FAILED) {
                    a10.f26334f.log(ironSourceTag, "init() had failed", 3);
                    C1744r.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b10 == O.a.INIT_IN_PROGRESS) {
                    if (!O.a().c()) {
                        a10.J = true;
                        return;
                    }
                    a10.f26334f.log(ironSourceTag, "init() had failed", 3);
                    C1744r.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a10.j()) {
                    a10.f26334f.log(ironSourceTag, "No interstitial configurations found", 3);
                    C1744r.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a10.H) {
                    a10.f26331c.c();
                } else {
                    if (a10.I) {
                        com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
                        if (gVar != null) {
                            gVar.d();
                            return;
                        }
                    } else {
                        U u10 = a10.A;
                        if (u10 != null) {
                            u10.e();
                            return;
                        }
                    }
                    a10.J = true;
                }
            }
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C1744r.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (a10.f26349u) {
                a10.f26334f.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C1744r.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a10.F) {
                a10.f26334f.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a10.f26351w) {
                a10.f26334f.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                C1744r.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                O.a b10 = O.a().b();
                if (b10 == O.a.INIT_FAILED) {
                    a10.f26334f.log(ironSourceTag, "init() had failed", 3);
                    C1744r.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b10 == O.a.INIT_IN_PROGRESS) {
                    if (!O.a().c()) {
                        a10.G = true;
                        return;
                    }
                    a10.f26334f.log(ironSourceTag, "init() had failed", 3);
                    C1744r.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (!a10.e()) {
                    a10.f26334f.log(ironSourceTag, "No rewarded video configurations found", 3);
                    C1744r.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    com.ironsource.mediationsdk.adunit.c.h hVar = a10.D;
                    if (hVar == null) {
                        a10.G = true;
                    } else {
                        hVar.d();
                    }
                }
            }
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C1744r.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        J a10 = J.a();
        try {
            a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        J a10 = J.a();
        try {
            a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        J a10 = J.a();
        if (com.ironsource.mediationsdk.c.a.a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.mediationsdk.utils.k.a().b(impressionDataListener);
            B b10 = a10.f26354z;
            if (b10 != null) {
                b10.b(impressionDataListener);
            }
            U u10 = a10.A;
            if (u10 != null) {
                u10.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
            if (gVar != null) {
                gVar.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a10.D;
            if (hVar != null) {
                hVar.b(impressionDataListener);
            }
            R r10 = a10.B;
            if (r10 != null) {
                r10.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a10.f26335g.f27336b = null;
        D.a().a((InterstitialListener) null);
        D.a().a((LevelPlayInterstitialListener) null);
    }

    public static void removeOfferwallListener() {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a10.f26335g.f27337c = null;
    }

    public static void removeRewardedVideoListener() {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a10.f26335g.f27335a = null;
        ac.a().f26760a = null;
        ac.a().f26761b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        J a10 = J.a();
        if (com.ironsource.mediationsdk.c.a.a(jSONObject, "setAdRevenueData - impressionData is null") && com.ironsource.mediationsdk.c.a.a(str, "setAdRevenueData - dataSource is null")) {
            a10.O.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z10) {
        J.a();
        J.a(z10);
    }

    public static void setConsent(boolean z10) {
        J.a().b(z10);
    }

    public static boolean setDynamicUserId(String str) {
        return J.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        J.a();
        J.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        J.a();
        J.a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        J a10 = J.a();
        IronLog.API.info("removing all impression data listeners");
        com.ironsource.mediationsdk.utils.k.a().c();
        B b10 = a10.f26354z;
        if (b10 != null) {
            b10.b();
        }
        U u10 = a10.A;
        if (u10 != null) {
            u10.b();
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
        if (gVar != null) {
            gVar.g();
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = a10.D;
        if (hVar != null) {
            hVar.g();
        }
        R r10 = a10.B;
        if (r10 != null) {
            r10.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a10.f26335g.f27336b = interstitialListener;
        D.a().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        J.a();
        J.a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        J.a();
        J.a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        J.a().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        J a10 = J.a();
        if (logListener == null) {
            a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a10.f26336h.f27158c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        J.a().a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        J a10 = J.a();
        try {
            IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, a10.f26323a + ":setMediationSegment(segment:" + str + ")", 1);
            com.ironsource.d.a aVar = new com.ironsource.d.a();
            J.a(str, aVar);
            if (aVar.a()) {
                a10.f26340l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, aVar.b().toString(), 2);
            }
        } catch (Exception e10) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, a10.f26323a + ":setMediationSegment(segment:" + str + ")", e10);
        }
    }

    public static void setMediationType(String str) {
        J.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        J.a().a(str, arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        J.a().a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        J.a();
        J.a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a10.f26335g.f27337c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        J a10 = J.a();
        a10.f26334f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a10.f26335g.f27335a = rewardedVideoListener;
        ac.a().f26760a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        J a10 = J.a();
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                a10.f26334f.log(IronSourceLogger.IronSourceTag.API, a10.f26323a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                a10.f26342n = new HashMap(map);
            } catch (Exception e10) {
                IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a10.f26323a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e10);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        J a10 = J.a();
        a10.f26347s = ironSourceSegment;
        com.ironsource.mediationsdk.adunit.c.h hVar = a10.D;
        if (hVar != null) {
            hVar.a(ironSourceSegment);
        }
        B b10 = a10.f26354z;
        if (b10 != null) {
            b10.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
        if (gVar != null) {
            gVar.a(ironSourceSegment);
        }
        U u10 = a10.A;
        if (u10 != null) {
            u10.a(ironSourceSegment);
        }
        R r10 = a10.B;
        if (r10 != null) {
            r10.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.a.d.d().f26695v = a10.f26347s;
        com.ironsource.mediationsdk.a.h d10 = com.ironsource.mediationsdk.a.h.d();
        IronSourceSegment ironSourceSegment2 = a10.f26347s;
        d10.f26695v = ironSourceSegment2;
        com.ironsource.mediationsdk.a.g.f26727w.f26695v = ironSourceSegment2;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        J a10 = J.a();
        com.ironsource.mediationsdk.sdk.j jVar = a10.f26335g;
        if (jVar != null) {
            jVar.f27338d = segmentListener;
            O.a().f26440p = a10.f26335g;
        }
    }

    public static void setUserId(String str) {
        J.a().a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z10) {
        J a10 = J.a();
        a10.f26345q = context;
        a10.f26346r = Boolean.valueOf(z10);
        if (!a10.H) {
            G g10 = a10.f26331c;
            if (g10 != null) {
                g10.a(context, z10);
            }
        } else if (a10.I) {
            com.ironsource.mediationsdk.adunit.c.g gVar = a10.C;
            if (gVar != null) {
                gVar.b(z10);
            }
        } else {
            U u10 = a10.A;
            if (u10 != null) {
                u10.a(z10);
            }
        }
        if (a10.E) {
            B b10 = a10.f26354z;
            if (b10 != null) {
                b10.a(context, z10);
                return;
            }
            return;
        }
        ad adVar = a10.f26330b;
        if (adVar != null) {
            adVar.a(context, z10);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a10.f26350v) {
                a10.f26334f.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            C1747u c1747u = a10.M;
            if (c1747u == null) {
                a10.f26334f.log(ironSourceTag, "Interstitial video was not initiated", 3);
                C.a().b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else if (c1747u.f27399a.containsKey(str)) {
                C1748v c1748v = c1747u.f27399a.get(str);
                c1747u.a(IronSourceConstants.IS_INSTANCE_SHOW, c1748v);
                c1748v.a();
            } else {
                C1747u.a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                C.a().b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
            }
        } catch (Exception e10) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e10);
            C.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        J.a().f(str);
    }

    public static void showInterstitial() {
        J a10 = J.a();
        IronSourceLoggerManager ironSourceLoggerManager = a10.f26334f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (a10.f26350v) {
                a10.f26334f.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                D.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!a10.i()) {
                D.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                InterstitialPlacement g10 = a10.g();
                if (g10 != null) {
                    a10.h(g10.getPlacementName());
                } else {
                    D.a().a(new IronSourceError(IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e10) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e10);
            D.a().a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e10.getMessage()), (AdInfo) null);
        }
    }

    public static void showInterstitial(String str) {
        J.a().h(str);
    }

    public static void showOfferwall() {
        J a10 = J.a();
        try {
            a10.f26334f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a10.k()) {
                a10.f26335g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.j a11 = a10.f26337i.f27494c.f27235c.a();
            if (a11 != null) {
                a10.j(a11.f27253b);
            }
        } catch (Exception e10) {
            a10.f26334f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e10);
            a10.f26335g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        J.a().j(str);
    }

    public static void showRewardedVideo() {
        J a10 = J.a();
        if (!a10.d()) {
            ac.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            a10.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b10 = a10.b();
        if (b10 != null) {
            a10.e(b10.getPlacementName());
            return;
        }
        a10.f26334f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        ac.a().a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    public static void showRewardedVideo(String str) {
        J.a().e(str);
    }
}
