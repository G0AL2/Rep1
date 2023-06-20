package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.inmobi.media.au;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a  reason: collision with root package name */
    private final m f7172a;

    /* renamed from: b  reason: collision with root package name */
    private final v f7173b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<JSONObject> f7174c = new AtomicReference<>();

    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0115a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.a f7196b;

        /* renamed from: c  reason: collision with root package name */
        private a.InterfaceC0115a f7197c;

        public a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0115a interfaceC0115a) {
            this.f7196b = aVar;
            this.f7197c = interfaceC0115a;
        }

        public void a(a.InterfaceC0115a interfaceC0115a) {
            this.f7197c = interfaceC0115a;
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.f7196b.r();
            this.f7196b.a(bundle);
            MediationServiceImpl.this.a(this.f7196b);
            j.a((MaxAdListener) this.f7197c, maxAd);
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            if (v.a()) {
                MediationServiceImpl.this.f7173b.b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f7196b, this.f7197c);
            this.f7196b.a(bundle);
            MediationServiceImpl.this.f7172a.ag().a(this.f7196b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f7172a.ae().a(maxAd);
                MediationServiceImpl.this.f7172a.ak().a(maxAd);
            }
            j.b(this.f7197c, maxAd);
        }

        public void c(final MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((com.applovin.impl.mediation.a.a) maxAd).a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f7172a.ag().a((com.applovin.impl.mediation.a.a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f7172a.ae().b(maxAd);
                        MediationServiceImpl.this.f7172a.ak().a();
                    }
                    j.c(a.this.f7197c, maxAd);
                }
            }, maxAd instanceof com.applovin.impl.mediation.a.c ? ((com.applovin.impl.mediation.a.c) maxAd).A() : 0L);
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((com.applovin.impl.mediation.a.a) maxAd).a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.a(this.f7196b, this.f7197c);
            j.d(this.f7197c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            j.h(this.f7197c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.b(this.f7196b, maxError, this.f7197c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof com.applovin.impl.mediation.a.c)) {
                ((com.applovin.impl.mediation.a.c) maxAd).F();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            j.g(this.f7197c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f7196b.r();
            MediationServiceImpl.this.a(this.f7196b, maxError, this.f7197c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            j.f(this.f7197c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            j.e(this.f7197c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            j.a(this.f7197c, maxAd, maxReward);
            MediationServiceImpl.this.f7172a.S().a(new com.applovin.impl.mediation.c.f((com.applovin.impl.mediation.a.c) maxAd, MediationServiceImpl.this.f7172a), o.a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(m mVar) {
        this.f7172a = mVar;
        this.f7173b = mVar.A();
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    private g a(com.applovin.impl.mediation.a.c cVar) {
        g g10 = cVar.g();
        if (g10 == null) {
            this.f7172a.ae().a(false);
            if (v.a()) {
                v vVar = this.f7173b;
                vVar.d("MediationService", "Failed to show " + cVar + ": adapter not found");
                v.i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
            }
            throw new IllegalStateException("Could not find adapter for provided ad");
        }
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        this.f7172a.ag().a(aVar, "DID_LOAD");
        if (aVar.d().endsWith("load")) {
            this.f7172a.ag().a(aVar);
        }
        long o10 = aVar.o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o10));
        a("load", hashMap, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0115a interfaceC0115a) {
        this.f7172a.ag().a(aVar, "DID_CLICKED");
        this.f7172a.ag().a(aVar, "DID_CLICK");
        if (aVar.d().endsWith(au.CLICK_BEACON)) {
            this.f7172a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0115a, (MaxAd) aVar);
        }
        a("mclick", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, aVar);
        destroyAd(aVar);
        j.a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar, a.InterfaceC0115a interfaceC0115a) {
        this.f7172a.ae().a(false);
        a(cVar, (MaxAdListener) interfaceC0115a);
        if (v.a()) {
            this.f7173b.b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, interfaceC0115a);
    }

    private void a(final com.applovin.impl.mediation.a.c cVar, final MaxAdListener maxAdListener) {
        final long longValue = ((Long) this.f7172a.a(com.applovin.impl.sdk.c.a.F)).longValue();
        if (longValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (cVar.s().get()) {
                    return;
                }
                String str = "Ad (" + cVar.M() + ") has not been displayed after " + longValue + "ms. Failing ad display...";
                if (v.a()) {
                    v.i("MediationService", str);
                }
                MediationServiceImpl.this.b(cVar, new MaxErrorImpl(-1, str), maxAdListener);
                MediationServiceImpl.this.f7172a.ae().b(cVar);
                MediationServiceImpl.this.f7172a.ak().a();
            }
        }, longValue);
    }

    private void a(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        long o10 = aVar.o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o10));
        a("mlerr", hashMap, maxError, aVar);
    }

    private void a(String str, com.applovin.impl.mediation.a.f fVar) {
        a(str, Collections.EMPTY_MAP, (MaxError) null, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.applovin.impl.mediation.a.h hVar, g gVar) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.i(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.h(), hashMap);
        a("serr", hashMap, new MaxErrorImpl(str), hVar);
    }

    private void a(String str, Map<String, String> map, com.applovin.impl.mediation.a.f fVar) {
        a(str, map, (MaxError) null, fVar);
    }

    private void a(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        hashMap.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.Z()));
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((com.applovin.impl.mediation.a.a) fVar).getCreativeId()));
        }
        this.f7172a.S().a(new com.applovin.impl.mediation.c.d(str, hashMap, maxError, fVar, this.f7172a), o.a.MEDIATION_POSTBACKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f7172a.ag().a(aVar, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, aVar);
        if (aVar.s().compareAndSet(false, true)) {
            j.a(maxAdListener, aVar, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f7172a.S().a(new com.applovin.impl.mediation.c.g(cVar, this.f7172a), o.a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final com.applovin.impl.mediation.a.h hVar, Context context, final g.a aVar) {
        String str;
        v vVar;
        StringBuilder sb2;
        String str2;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final g a10 = this.f7172a.C().a(hVar, true);
        if (a10 != null) {
            Activity an = context instanceof Activity ? (Activity) context : this.f7172a.an();
            MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(hVar, maxAdFormat);
            if (((Boolean) this.f7172a.a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
                this.f7172a.D().a(hVar, an);
            }
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str3) {
                    aVar.a(com.applovin.impl.mediation.a.g.a(hVar, a10, str3));
                    a10.j();
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str3) {
                    MediationServiceImpl.this.a(str3, hVar, a10);
                    aVar.a(com.applovin.impl.mediation.a.g.b(hVar, a10, str3));
                    a10.j();
                }
            };
            if (!hVar.a()) {
                if (v.a()) {
                    vVar = this.f7173b;
                    sb2 = new StringBuilder();
                    str2 = "Collecting signal for adapter: ";
                    sb2.append(str2);
                    sb2.append(a10.d());
                    vVar.b("MediationService", sb2.toString());
                }
                a10.a(a11, hVar, an, maxSignalCollectionListener);
                return;
            } else if (this.f7172a.D().a(hVar)) {
                if (v.a()) {
                    vVar = this.f7173b;
                    sb2 = new StringBuilder();
                    str2 = "Collecting signal for now-initialized adapter: ";
                    sb2.append(str2);
                    sb2.append(a10.d());
                    vVar.b("MediationService", sb2.toString());
                }
                a10.a(a11, hVar, an, maxSignalCollectionListener);
                return;
            } else {
                if (v.a()) {
                    v vVar2 = this.f7173b;
                    vVar2.e("MediationService", "Skip collecting signal for not-initialized adapter: " + a10.d());
                }
                str = "Adapter not initialized yet";
            }
        } else {
            str = "Could not load adapter";
        }
        aVar.a(com.applovin.impl.mediation.a.g.a(hVar, str));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof com.applovin.impl.mediation.a.a) {
            if (v.a()) {
                v vVar = this.f7173b;
                vVar.c("MediationService", "Destroying " + maxAd);
            }
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            g g10 = aVar.g();
            if (g10 != null) {
                g10.j();
                aVar.t();
            }
            this.f7172a.B().c(aVar.f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f7174c.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0115a interfaceC0115a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0115a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (v.a() && TextUtils.isEmpty(this.f7172a.t())) {
            v.i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
        }
        if (v.a() && !this.f7172a.d()) {
            v.h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f7172a.a();
        if (str.length() != 16 && !str.startsWith("test_mode") && !this.f7172a.z().startsWith("05TMD") && v.a()) {
            v.i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
        }
        if (!this.f7172a.a(maxAdFormat)) {
            this.f7172a.I().a(str, str2, maxAdFormat, map, map2, context, interfaceC0115a);
            return;
        }
        if (v.a()) {
            v.i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
        }
        j.a(interfaceC0115a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
    }

    public void loadThirdPartyMediatedAd(String str, com.applovin.impl.mediation.a.a aVar, Activity activity, a.InterfaceC0115a interfaceC0115a) {
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (v.a()) {
            this.f7173b.b("MediationService", "Loading " + aVar + "...");
        }
        this.f7172a.ag().a(aVar, "WILL_LOAD");
        g a10 = this.f7172a.C().a(aVar);
        if (a10 != null) {
            MaxAdapterParametersImpl a11 = MaxAdapterParametersImpl.a(aVar);
            if (((Boolean) this.f7172a.a(com.applovin.impl.sdk.c.a.S)).booleanValue()) {
                this.f7172a.D().a(aVar, activity);
            }
            com.applovin.impl.mediation.a.a a12 = aVar.a(a10);
            a10.a(str, a12);
            a12.p();
            a10.a(str, a11, a12, activity, new a(a12, interfaceC0115a));
            return;
        }
        String str2 = "Failed to load " + aVar + ": adapter not loaded";
        if (v.a()) {
            v.i("MediationService", str2);
        }
        a(aVar, new MaxErrorImpl(-5001, str2), interfaceC0115a);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c10 = this.f7172a.ae().c();
            if (c10 instanceof com.applovin.impl.mediation.a.a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (com.applovin.impl.mediation.a.a) c10);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, com.applovin.impl.mediation.a.a aVar) {
        a("mierr", Collections.EMPTY_MAP, maxError, aVar);
    }

    public void processAdLossPostback(com.applovin.impl.mediation.a.a aVar, Float f10) {
        String f11 = f10 != null ? f10.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f11);
        a("mloss", hashMap, aVar);
    }

    public void processAdapterInitializationPostback(com.applovin.impl.mediation.a.f fVar, long j10, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j10));
        a("minit", hashMap, new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0115a interfaceC0115a) {
        if (aVar.d().endsWith("cimp")) {
            this.f7172a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0115a, (MaxAd) aVar);
        }
        a("mcimp", aVar);
    }

    public void processRawAdImpressionPostback(com.applovin.impl.mediation.a.a aVar, a.InterfaceC0115a interfaceC0115a) {
        this.f7172a.ag().a(aVar, "WILL_DISPLAY");
        if (aVar.d().endsWith("mimp")) {
            this.f7172a.ag().a(aVar);
            j.a((MaxAdRevenueListener) interfaceC0115a, (MaxAd) aVar);
        }
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof com.applovin.impl.mediation.a.c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((com.applovin.impl.mediation.a.c) aVar).y()));
        }
        a("mimp", hashMap, aVar);
    }

    public void processViewabilityAdImpressionPostback(com.applovin.impl.mediation.a.e eVar, long j10, a.InterfaceC0115a interfaceC0115a) {
        if (eVar.d().endsWith("vimp")) {
            this.f7172a.ag().a(eVar);
            j.a((MaxAdRevenueListener) interfaceC0115a, (MaxAd) eVar);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j10));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.G()));
        a("mvimp", hashMap, eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f7174c.set(jSONObject);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final Activity activity, final a.InterfaceC0115a interfaceC0115a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f7172a.ae().a(true);
        final g a10 = a(cVar);
        long z10 = cVar.z();
        if (v.a()) {
            v vVar = this.f7173b;
            vVar.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z10 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.b(cVar);
                a10.a(cVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0115a);
            }
        }, z10);
    }

    public void showFullscreenAd(final com.applovin.impl.mediation.a.c cVar, final ViewGroup viewGroup, final i iVar, final Activity activity, final a.InterfaceC0115a interfaceC0115a) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f7172a.ae().a(true);
        final g a10 = a(cVar);
        long z10 = cVar.z();
        if (v.a()) {
            v vVar = this.f7173b;
            vVar.c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z10 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.b(cVar);
                a10.a(cVar, viewGroup, iVar, activity);
                MediationServiceImpl.this.a(cVar, interfaceC0115a);
            }
        }, z10);
    }
}
