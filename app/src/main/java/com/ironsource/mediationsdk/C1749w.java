package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.C1732f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.w  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1749w implements com.ironsource.mediationsdk.sdk.e {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, C1750x> f27541a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f27542b;

    /* renamed from: c  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.c f27543c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1749w(List<NetworkSettings> list, com.ironsource.mediationsdk.model.o oVar, String str, String str2) {
        this.f27542b = str;
        this.f27543c = oVar.f27291l;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a10 != null) {
                    this.f27541a.put(networkSettings.getSubProviderId(), new C1750x(str, str2, networkSettings, this, oVar.f27284e, a10));
                }
            } else {
                a("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, C1750x c1750x, Object[][] objArr) {
        Map<String, Object> c10 = c1750x.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(c10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(1500, new JSONObject(hashMap)));
    }

    private static void a(C1750x c1750x, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRvManager " + c1750x.d() + " : " + str, 0);
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyRvManager " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10, C1750x c1750x) {
        a(i10, c1750x, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void a(IronSourceError ironSourceError, C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdShowFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_SHOW_FAILED, c1750x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        ab.a().b(c1750x.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void a(IronSourceError ironSourceError, C1750x c1750x, long j10) {
        a(c1750x, "onRewardedVideoAdLoadFailed error=" + ironSourceError);
        a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c1750x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        if (ironSourceError.getErrorCode() == 1058) {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, c1750x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, c1750x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        ab.a().a(c1750x.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void a(C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdOpened");
        a(1005, c1750x, (Object[][]) null);
        final ab a10 = ab.a();
        final String f10 = c1750x.f();
        if (a10.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.3
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26742a.onRewardedVideoAdOpened(f10);
                    ab abVar = a10;
                    ab.a(abVar, "onRewardedVideoAdOpened() instanceId=" + f10);
                }
            });
        }
        if (c1750x.i()) {
            for (String str : c1750x.f27553g) {
                C1732f.a();
                String a11 = C1732f.a(str, c1750x.d(), c1750x.e(), c1750x.f27554h, "", "", "", "");
                C1732f.a();
                C1732f.a("onRewardedVideoAdOpened", c1750x.d(), a11);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void a(C1750x c1750x, long j10) {
        a(c1750x, "onRewardedVideoLoadSuccess");
        a(1002, c1750x, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        final ab a10 = ab.a();
        final String f10 = c1750x.f();
        if (a10.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.1
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26742a.onRewardedVideoAdLoadSuccess(f10);
                    ab abVar = a10;
                    ab.a(abVar, "onRewardedVideoAdLoadSuccess() instanceId=" + f10);
                }
            });
        }
    }

    public final void a(String str, String str2, boolean z10) {
        IronSourceError buildLoadFailedError;
        ab a10;
        try {
            if (!this.f27541a.containsKey(str)) {
                a(1500, str);
                ab.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            C1750x c1750x = this.f27541a.get(str);
            if (!z10) {
                if (!c1750x.i()) {
                    a(1001, c1750x, (Object[][]) null);
                    c1750x.a("", "", null, null);
                    return;
                }
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in non IAB flow must be called by non bidder instances");
                a(buildLoadFailedError2.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c1750x, (Object[][]) null);
                ab.a().a(str, buildLoadFailedError2);
                return;
            }
            if (c1750x.i()) {
                C1732f.a();
                JSONObject a11 = C1732f.a(str2);
                C1732f.a();
                C1732f.a a12 = C1732f.a(a11);
                C1732f.a();
                com.ironsource.mediationsdk.server.b a13 = C1732f.a(c1750x.d(), a12.f27038b);
                if (a13 != null) {
                    c1750x.a(a13.b());
                    c1750x.b(a12.f27037a);
                    c1750x.a(a12.f27040d);
                    a(1001, c1750x, (Object[][]) null);
                    c1750x.a(a13.b(), a12.f27037a, a12.f27040d, a13.d());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c1750x, (Object[][]) null);
                a10 = ab.a();
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm in IAB flow must be called by bidder instances");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, c1750x, (Object[][]) null);
                a10 = ab.a();
            }
            a10.a(str, buildLoadFailedError);
        } catch (Exception e10) {
            a("loadRewardedVideoWithAdm exception " + e10.getMessage());
            ab.a().a(str, ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm exception"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void b(C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdClosed");
        a((int) IronSourceConstants.RV_INSTANCE_CLOSED, c1750x, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(1))}});
        com.ironsource.mediationsdk.utils.o.a().a(1);
        final ab a10 = ab.a();
        final String f10 = c1750x.f();
        if (a10.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.4
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26742a.onRewardedVideoAdClosed(f10);
                    ab abVar = a10;
                    ab.a(abVar, "onRewardedVideoAdClosed() instanceId=" + f10);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void c(C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdClicked");
        a(1006, c1750x, (Object[][]) null);
        final ab a10 = ab.a();
        final String f10 = c1750x.f();
        if (a10.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.6
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26742a.onRewardedVideoAdClicked(f10);
                    ab abVar = a10;
                    ab.a(abVar, "onRewardedVideoAdClicked() instanceId=" + f10);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void d(C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdVisible");
        a((int) IronSourceConstants.RV_INSTANCE_VISIBLE, c1750x, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.e
    public final void e(C1750x c1750x) {
        a(c1750x, "onRewardedVideoAdRewarded");
        Map<String, Object> c10 = c1750x.c();
        if (!TextUtils.isEmpty(J.a().f26341m)) {
            c10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, J.a().f26341m);
        }
        if (J.a().f26342n != null) {
            for (String str : J.a().f26342n.keySet()) {
                c10.put("custom_" + str, J.a().f26342n.get(str));
            }
        }
        Placement a10 = J.a().f26337i.f27494c.f27233a.a();
        if (a10 != null) {
            c10.put("placement", a10.getPlacementName());
            c10.put(IronSourceConstants.EVENTS_REWARD_NAME, a10.getRewardName());
            c10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a10.getRewardAmount()));
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "defaultPlacement is null", 3);
        }
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(c10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), c1750x.d()));
        com.ironsource.mediationsdk.a.h.d().b(cVar);
        final ab a11 = ab.a();
        final String f10 = c1750x.f();
        if (a11.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.7
                @Override // java.lang.Runnable
                public final void run() {
                    a11.f26742a.onRewardedVideoAdRewarded(f10);
                    ab abVar = a11;
                    ab.a(abVar, "onRewardedVideoAdRewarded() instanceId=" + f10);
                }
            });
        }
    }
}
