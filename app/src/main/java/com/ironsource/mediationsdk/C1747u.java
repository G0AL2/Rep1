package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.C1732f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1747u implements com.ironsource.mediationsdk.sdk.d {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, C1748v> f27399a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.c f27400b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1747u(List<NetworkSettings> list, com.ironsource.mediationsdk.model.h hVar, String str, String str2) {
        this.f27400b = hVar.f27246i;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a10 != null) {
                    this.f27399a.put(networkSettings.getSubProviderId(), new C1748v(str, str2, networkSettings, this, hVar.f27242e, a10));
                }
            } else {
                a("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, C1748v c1748v, Object[][] objArr) {
        Map<String, Object> c10 = c1748v.c();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    c10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(c10)));
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
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_INSTANCE_NOT_FOUND, new JSONObject(hashMap)));
    }

    private static void a(C1748v c1748v, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + c1748v.d() + " : " + str, 0);
    }

    private static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyIsManager " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i10, C1748v c1748v) {
        a(i10, c1748v, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, C1748v c1748v) {
        a(c1748v, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        a((int) IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c1748v, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        C.a().b(c1748v.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(IronSourceError ironSourceError, C1748v c1748v, long j10) {
        a(c1748v, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            a((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, c1748v, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1748v, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        C.a().a(c1748v.f(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(C1748v c1748v) {
        a(c1748v, "onInterstitialAdOpened");
        a((int) IronSourceConstants.IS_INSTANCE_OPENED, c1748v, (Object[][]) null);
        final C a10 = C.a();
        final String f10 = c1748v.f();
        if (a10.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.3
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26216a.onInterstitialAdOpened(f10);
                    C c10 = a10;
                    C.a(c10, "onInterstitialAdOpened() instanceId=" + f10);
                }
            });
        }
        if (c1748v.i()) {
            for (String str : c1748v.f27553g) {
                C1732f.a();
                String a11 = C1732f.a(str, c1748v.d(), c1748v.e(), c1748v.f27554h, "", "", "", "");
                C1732f.a();
                C1732f.a("onInterstitialAdOpened", c1748v.d(), a11);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void a(C1748v c1748v, long j10) {
        a(c1748v, "onInterstitialAdReady");
        a(2003, c1748v, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        final C a10 = C.a();
        final String f10 = c1748v.f();
        if (a10.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.1
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26216a.onInterstitialAdReady(f10);
                    C c10 = a10;
                    C.a(c10, "onInterstitialAdReady() instanceId=" + f10);
                }
            });
        }
    }

    public final void a(String str, String str2, boolean z10) {
        IronSourceError buildLoadFailedError;
        try {
            if (!this.f27399a.containsKey(str)) {
                a((int) IronSourceConstants.IS_INSTANCE_NOT_FOUND, str);
                C.a().a(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                return;
            }
            C1748v c1748v = this.f27399a.get(str);
            if (!z10) {
                if (!c1748v.i()) {
                    a(2002, c1748v, (Object[][]) null);
                    c1748v.a("", "", null, null);
                    return;
                }
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                a(buildLoadFailedError2.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1748v, (Object[][]) null);
                C.a().a(str, buildLoadFailedError2);
                return;
            }
            if (c1748v.i()) {
                C1732f.a();
                JSONObject a10 = C1732f.a(str2);
                C1732f.a();
                C1732f.a a11 = C1732f.a(a10);
                C1732f.a();
                com.ironsource.mediationsdk.server.b a12 = C1732f.a(c1748v.d(), a11.f27038b);
                if (a12 != null) {
                    c1748v.a(a12.b());
                    c1748v.b(a11.f27037a);
                    c1748v.a(a11.f27040d);
                    a(2002, c1748v, (Object[][]) null);
                    c1748v.a(a12.b(), a11.f27037a, a11.f27040d, a12.d());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1748v, (Object[][]) null);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                a(buildLoadFailedError.getErrorMessage());
                a((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1748v, (Object[][]) null);
            }
            C.a().a(str, buildLoadFailedError);
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            a(buildLoadFailedError3.getErrorMessage());
            C.a().a(str, buildLoadFailedError3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void b(C1748v c1748v) {
        a(c1748v, "onInterstitialAdClosed");
        a((int) IronSourceConstants.IS_INSTANCE_CLOSED, c1748v, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}});
        com.ironsource.mediationsdk.utils.o.a().a(2);
        final C a10 = C.a();
        final String f10 = c1748v.f();
        if (a10.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.4
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26216a.onInterstitialAdClosed(f10);
                    C c10 = a10;
                    C.a(c10, "onInterstitialAdClosed() instanceId=" + f10);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void c(C1748v c1748v) {
        a(c1748v, "onInterstitialAdClicked");
        a(2006, c1748v, (Object[][]) null);
        final C a10 = C.a();
        final String f10 = c1748v.f();
        if (a10.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.6
                @Override // java.lang.Runnable
                public final void run() {
                    a10.f26216a.onInterstitialAdClicked(f10);
                    C c10 = a10;
                    C.a(c10, "onInterstitialAdClicked() instanceId=" + f10);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.d
    public final void d(C1748v c1748v) {
        a((int) IronSourceConstants.IS_INSTANCE_VISIBLE, c1748v, (Object[][]) null);
        a(c1748v, "onInterstitialAdVisible");
    }
}
