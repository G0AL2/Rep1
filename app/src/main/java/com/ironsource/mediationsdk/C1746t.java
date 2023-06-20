package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.C1751y;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1746t extends C1751y implements BannerSmashListener {

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.sdk.c f27393i;

    /* renamed from: j  reason: collision with root package name */
    private long f27394j;

    /* renamed from: k  reason: collision with root package name */
    private String f27395k;

    /* renamed from: l  reason: collision with root package name */
    private String f27396l;

    /* renamed from: m  reason: collision with root package name */
    private JSONObject f27397m;

    public C1746t(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.c cVar, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f27393i = cVar;
        this.f27550d = i10;
        this.f27395k = str;
        this.f27396l = str2;
        this.f27397m = networkSettings.getBannerSettings();
        this.f27547a.initBannerForBidding(str, str2, this.f27549c, this);
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (this.f27547a == null) {
            ironLog.error("destroyBanner() mAdapter == null");
            return;
        }
        C1751y.a aVar = C1751y.a.LOADED;
        C1751y.a aVar2 = C1751y.a.NOT_LOADED;
        if (!a(aVar, aVar2) && !a(C1751y.a.LOAD_IN_PROGRESS, aVar2)) {
            ironLog.error("cannot destroy banner not loaded");
            return;
        }
        h();
        this.f27547a.destroyBanner(this.f27548b.f27214a.getBannerSettings());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.ironsource.mediationsdk.logger.IronSourceError, long] */
    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2, JSONObject jSONObject, List<String> list) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("loadBanner state=" + g());
        C1751y.a aVar = C1751y.a.NOT_LOADED;
        C1751y.a[] aVarArr = {aVar, C1751y.a.LOADED};
        C1751y.a aVar2 = C1751y.a.LOAD_IN_PROGRESS;
        C1751y.a a10 = a(aVarArr, aVar2);
        if (iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed()) {
            ironLog.error("loadBanner - bannerLayout is null or destroyed");
            this.f27393i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, iSDemandOnlyBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false, new Date().getTime() - this.f27394j);
        } else if (str == null) {
            ironLog.error("loadBanner - serverData is null");
            this.f27393i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "serverData==null"), this, false, new Date().getTime() - this.f27394j);
        } else if (this.f27547a == null) {
            ironLog.error("loadBanner - mAdapter is null");
            this.f27393i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "adapter==null"), this, false, new Date().getTime() - this.f27394j);
        } else if (a10 != aVar) {
            if (a10 == aVar2) {
                new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_ALREADY_IN_PROGRESS, "load already in progress");
            } else {
                new IronSourceError(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW, "load while show");
            }
            ?? time = new Date().getTime();
            this.f27393i.a(time, this, false, time - this.f27394j);
        } else {
            this.f27394j = new Date().getTime();
            ironLog.verbose("start timer");
            a(new TimerTask() { // from class: com.ironsource.mediationsdk.t.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("load timed out state=" + C1746t.this.g());
                    if (C1746t.this.a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.NOT_LOADED)) {
                        C1746t.this.f27393i.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "load timed out"), C1746t.this, false, new Date().getTime() - C1746t.this.f27394j);
                    }
                }
            });
            this.f27551e = str2;
            this.f27552f = jSONObject;
            this.f27553g = list;
            this.f27547a.initBannerForBidding(this.f27395k, this.f27396l, this.f27397m, this);
            this.f27547a.loadBannerBiddingForDemandOnly(iSDemandOnlyBannerLayout, this.f27397m, this, str);
        }
    }

    public final String b() {
        return this.f27548b.f27214a.isMultipleInstances() ? this.f27548b.f27214a.getProviderTypeForReflection() : this.f27548b.f27214a.getProviderName();
    }

    @Override // com.ironsource.mediationsdk.C1751y
    public final Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f27547a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f27547a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f27548b.f27214a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f27548b.f27214a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", 2);
            if (!TextUtils.isEmpty(this.f27551e)) {
                hashMap.put("auctionId", this.f27551e);
            }
            JSONObject jSONObject = this.f27552f;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f27552f);
            }
            if (!TextUtils.isEmpty(this.f27554h)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f27554h);
            }
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + d() + ")", e10);
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
        if (cVar != null) {
            cVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
        C1751y.a aVar = C1751y.a.LOAD_IN_PROGRESS;
        C1751y.a aVar2 = C1751y.a.NOT_LOADED;
        if (a(aVar, aVar2)) {
            h();
            boolean z10 = ironSourceError.getErrorCode() == 606;
            if (this.f27393i != null) {
                this.f27393i.a(ironSourceError, this, z10, new Date().getTime() - this.f27394j);
            }
            a(aVar2);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("");
        if (a(C1751y.a.LOAD_IN_PROGRESS, C1751y.a.LOADED)) {
            com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
            if (cVar != null) {
                cVar.a(this, view, layoutParams);
            }
            h();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.c cVar = this.f27393i;
        if (cVar != null) {
            cVar.e(this);
            this.f27393i.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("");
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose("");
    }
}
