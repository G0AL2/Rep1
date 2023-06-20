package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.adapters.supersonicads.SupersonicConfig;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C1732f;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.sdk.g;
import com.ironsource.mediationsdk.sdk.k;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.o;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.b;
import com.ironsource.sdk.c;
import com.ironsource.sdk.c.a;
import com.ironsource.sdk.j.d;
import com.ironsource.sdk.j.e;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.a, k, e {
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "7.2.3.1";
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static String mediationSegment;
    private final String ADM_KEY;
    private final String CUSTOM_SEGMENT;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String IN_APP_BIDDING_KEY;
    private final String IN_APP_BIDDING_VALUE;
    private final String LWS_SUPPORT_STATE;
    private final String OW_CLIENT_SIDE_CALLBACKS;
    private final String OW_PLACEMENT_ID;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    a mBannerAdContainer;
    final ConcurrentHashMap<String, BannerSmashListener> mDemandSourceToBNSmash;
    ConcurrentHashMap<String, b> mDemandSourceToISAd;
    ConcurrentHashMap<String, InterstitialSmashListener> mDemandSourceToISSmash;
    ConcurrentHashMap<String, b> mDemandSourceToRvAd;
    ConcurrentHashMap<String, RewardedVideoSmashListener> mDemandSourceToRvSmash;
    private g mOfferwallListener;

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = "SDKPluginType";
        this.CUSTOM_SEGMENT = "custom_Segment";
        this.ADM_KEY = "adm";
        this.IN_APP_BIDDING_KEY = "inAppBidding";
        this.IN_APP_BIDDING_VALUE = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.OW_PLACEMENT_ID = "placementId";
        this.OW_CLIENT_SIDE_CALLBACKS = "useClientSideCallbacks";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mBannerAdContainer = null;
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToRvSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISSmash = new ConcurrentHashMap<>();
        this.mDemandSourceToBNSmash = new ConcurrentHashMap<>();
        mediationSegment = null;
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r8 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.sdk.a convertBannerSize(android.app.Activity r7, com.ironsource.mediationsdk.ISBannerSize r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.getDescription()
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -387072689: goto L3c;
                case 72205083: goto L31;
                case 79011241: goto L26;
                case 1951953708: goto L1b;
                case 1999208305: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L46
        L10:
            java.lang.String r1 = "CUSTOM"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L19
            goto L46
        L19:
            r2 = 4
            goto L46
        L1b:
            java.lang.String r1 = "BANNER"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L24
            goto L46
        L24:
            r2 = 3
            goto L46
        L26:
            java.lang.String r1 = "SMART"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2f
            goto L46
        L2f:
            r2 = 2
            goto L46
        L31:
            java.lang.String r1 = "LARGE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3a
            goto L46
        L3a:
            r2 = 1
            goto L46
        L3c:
            java.lang.String r1 = "RECTANGLE"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            r1 = 0
            r3 = 90
            r4 = 50
            r5 = 320(0x140, float:4.48E-43)
            switch(r2) {
                case 0: goto L6c;
                case 1: goto L70;
                case 2: goto L5f;
                case 3: goto L5c;
                case 4: goto L51;
                default: goto L50;
            }
        L50:
            return r1
        L51:
            int r8 = r8.getHeight()
            if (r8 == r4) goto L5a
            if (r8 == r3) goto L5a
            return r1
        L5a:
            r3 = r8
            goto L70
        L5c:
            r3 = 50
            goto L70
        L5f:
            boolean r8 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r7)
            if (r8 == 0) goto L69
            r1 = 728(0x2d8, float:1.02E-42)
            r5 = 728(0x2d8, float:1.02E-42)
        L69:
            if (r8 == 0) goto L5c
            goto L70
        L6c:
            r5 = 300(0x12c, float:4.2E-43)
            r3 = 250(0xfa, float:3.5E-43)
        L70:
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r5)
            int r7 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r7, r3)
            com.ironsource.sdk.a r1 = new com.ironsource.sdk.a
            r1.<init>(r8, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.app.Activity, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.sdk.a");
    }

    private b createBannerAdInstance(String str, com.ironsource.sdk.a aVar) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("creating banner ad instance for " + str);
        c cVar = new c(str, new IronSourceBannerListener(this, this.mDemandSourceToBNSmash.get(str), str));
        cVar.f27632d = getInitParams();
        cVar.f27630b = true;
        cVar.f27631c = aVar;
        return cVar.a();
    }

    private b getAdInstance(String str, boolean z10, boolean z11, boolean z12) {
        c cVar;
        b bVar = (z12 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).get(str);
        if (bVar == null) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("creating ad instance for " + str + " isDemandOnlyForRv=" + z10 + " isBidder=" + z11 + " isRewarded=" + z12);
            if (z12) {
                cVar = new c(str, new IronSourceRewardedVideoListener(this.mDemandSourceToRvSmash.get(str), str, z10));
                cVar.f27632d = getInitParams();
                cVar.f27629a = true;
            } else {
                cVar = new c(str, new IronSourceInterstitialListener(this.mDemandSourceToISSmash.get(str), str));
                cVar.f27632d = getInitParams();
            }
            if (z11) {
                cVar.f27630b = true;
            }
            bVar = cVar.a();
            (z12 ? this.mDemandSourceToRvAd : this.mDemandSourceToISAd).put(str, bVar);
        }
        return bVar;
    }

    private String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    private HashMap<String, String> getInitParams() {
        HashMap<String, String> hashMap = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            hashMap.put("SDKPluginType", pluginType);
        }
        if (!TextUtils.isEmpty(mediationSegment)) {
            hashMap.put("custom_Segment", mediationSegment);
        }
        if (!TextUtils.isEmpty(J.a().f26344p)) {
            hashMap.put("sessionid", J.a().f26344p);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getOfferwallExtraParams() {
        HashMap<String, String> initParams = getInitParams();
        initParams.put("useClientSideCallbacks", String.valueOf(SupersonicConfig.getConfigObj().getClientSideCallbacks()));
        Map<String, String> offerwallCustomParams = SupersonicConfig.getConfigObj().getOfferwallCustomParams();
        if (offerwallCustomParams != null && !offerwallCustomParams.isEmpty()) {
            initParams.putAll(offerwallCustomParams);
        }
        return initParams;
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToISSmash.put(str2, interstitialSmashListener);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        initSDK(str, jSONObject);
        this.mDemandSourceToRvSmash.put(str2, rewardedVideoSmashListener);
    }

    private void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String mediationUserId = IronSourceUtils.getMediationUserId();
            int optInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                optInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + optInt);
            SDKUtils.setDebugMode(optInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject optJSONObject = jSONObject.optJSONObject("controllerConfig");
            String jSONObject2 = optJSONObject != null ? optJSONObject.toString() : "";
            SDKUtils.setControllerConfig(jSONObject2);
            ironLog.verbose("IronSourceNetwork setting controller config to " + jSONObject2);
            HashMap<String, String> initParams = getInitParams();
            String str2 = J.a().f26338j;
            ironLog.verbose("with appKey=" + str2 + " userId=" + mediationUserId + " parameters " + initParams);
            IronSourceNetwork.setInitListener(new d() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.sdk.j.d
                public void onFail(com.ironsource.sdk.g.e eVar) {
                    IronLog ironLog2 = IronLog.ADAPTER_API;
                    ironLog2.verbose("OnNetworkSDKInitListener fail - code:" + eVar.f28188b + " message:" + eVar.f28187a);
                }

                @Override // com.ironsource.sdk.j.d
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                }
            });
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), str2, mediationUserId, initParams);
        }
    }

    private boolean isValidMetaData(String str, String str2) {
        if (str.equals("do_not_sell")) {
            return MetaDataUtils.isValidCCPAMetaData(str, str2);
        }
        return true;
    }

    private void loadAdInternal(String str, String str2, boolean z10, boolean z11, boolean z12) {
        HashMap hashMap = new HashMap();
        if (str2 != null) {
            C1732f.a();
            hashMap.put("adm", C1732f.c(str2));
            C1732f.a();
            hashMap.putAll(C1732f.b(str2));
        }
        b adInstance = getAdInstance(str, z10, z11, z12);
        printInstanceExtraParams(hashMap);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + adInstance.f27608c);
        IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), adInstance, hashMap);
    }

    private void loadBannerInternal(ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        try {
            com.ironsource.sdk.a convertBannerSize = convertBannerSize(ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSize);
            if (convertBannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            HashMap hashMap = new HashMap();
            if (str != null) {
                C1732f.a();
                hashMap.put("adm", C1732f.c(str));
                C1732f.a();
                hashMap.putAll(C1732f.b(str));
                printInstanceExtraParams(hashMap);
            }
            IronSourceNetwork.loadAd(ContextProvider.getInstance().getCurrentActiveActivity(), createBannerAdInstance(demandSourceName, convertBannerSize), hashMap);
        } catch (Exception e10) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + e10.getMessage()));
        }
    }

    private void printInstanceExtraParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        IronLog.ADAPTER_API.verbose("instance extra params:");
        for (String str : map.keySet()) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose(str + "=" + map.get(str));
        }
    }

    private void showAdInternal(b bVar, int i10) {
        int b10 = o.a().b(i10);
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, String.valueOf(b10));
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName=" + bVar.f27608c + " showParams=" + hashMap);
        IronSourceNetwork.showAd(bVar, hashMap);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void destroyBanner(JSONObject jSONObject) {
        com.ironsource.sdk.c.c cVar;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(demandSourceName + ": destroyBanner()");
        a aVar = this.mBannerAdContainer;
        if (aVar != null) {
            try {
                cVar = aVar.f27635a;
            } catch (Exception e10) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.verbose("destroyBanner failed: " + e10.getMessage());
            }
            if (cVar == null || cVar.f27645d == null) {
                throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
            }
            aVar.a();
            this.mBannerAdContainer = null;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (J.a().f26338j == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        IronSourceUtils.sendAutomationLog(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(J.a().f26338j, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void fetchRewardedVideoForAutomaticLoad(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName);
        try {
            loadAdInternal(demandSourceName, null, false, false, true);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            RewardedVideoSmashListener rewardedVideoSmashListener2 = this.mDemandSourceToRvSmash.get(demandSourceName);
            if (rewardedVideoSmashListener2 != null) {
                IronLog ironLog2 = IronLog.ADAPTER_API;
                ironLog2.error("exception " + e10.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    Map<String, Object> getBiddingData() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("");
        HashMap hashMap = new HashMap();
        String token = IronSourceNetwork.getToken(ContextProvider.getInstance().getApplicationContext());
        if (token != null) {
            hashMap.put(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, token);
        } else {
            ironLog.error("bidding token is null");
            hashMap.put(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, "");
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        LoadWhileShowSupportState loadWhileShowSupportState = this.mLWSSupportState;
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? loadWhileShowSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.sdk.k
    public void getOfferwallCredits() {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " getOfferwallCredits");
        try {
            IronSourceNetwork.getOfferWallCredits(this);
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public JSONObject getPlayerBiddingData() {
        JSONObject jSONObject;
        IronLog.ADAPTER_API.verbose("");
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject = IronSourceNetwork.getRawToken(ContextProvider.getInstance().getApplicationContext());
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("getRawToken exception: " + e10.getLocalizedMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        IronLog.ADAPTER_API.error("Player's bidding token is null");
        return jSONObject2;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "7.2.3.1";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        fetchRewardedVideoForAutomaticLoad(jSONObject, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        this.mDemandSourceToBNSmash.put(demandSourceName, bannerSmashListener);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.sdk.k
    public void initOfferwall(String str, String str2, JSONObject jSONObject) {
        initSDK(str, jSONObject);
        IronLog.ADAPTER_API.verbose(":initOfferwall");
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    IronSourceNetwork.initOfferWall(IronSourceAdapter.this.getOfferwallExtraParams(), IronSourceAdapter.this);
                } catch (Exception e10) {
                    IronLog ironLog = IronLog.ADAPTER_API;
                    ironLog.error(IronSourceAdapter.this.getProviderName() + ":initOfferwall " + e10);
                    g gVar = IronSourceAdapter.this.mOfferwallListener;
                    gVar.a(false, ErrorBuilder.buildInitFailedError("Adapter initialization failure - " + IronSourceAdapter.this.getProviderName() + " - " + e10.getMessage(), IronSourceConstants.OFFERWALL_AD_UNIT));
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(demandSourceName + ": demandSourceName=" + demandSourceName);
        initRewardedVideoInternal(str, jSONObject, rewardedVideoSmashListener, demandSourceName);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public boolean isInterstitialReady(JSONObject jSONObject) {
        b bVar = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    public boolean isOfferwallAvailable() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        b bVar = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return bVar != null && IronSourceNetwork.isAdAvailableForInstance(bVar);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerBiddingForDemandOnly(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
        if (ironSourceBannerLayout != null) {
            loadBannerInternal(ironSourceBannerLayout.getSize(), jSONObject, bannerSmashListener, str);
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void loadInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), null, false, false, false);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, false);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("for bidding exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdLoadFailed(new IronSourceError(1000, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, false, true, true);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), null, true, false, true);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            loadAdInternal(getDemandSourceName(jSONObject), str, true, true, true);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoLoadFailed(new IronSourceError(1002, e10.getMessage()));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onGetOWCreditsFailed(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onGetOfferwallCreditsFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public boolean onOWAdCredited(int i10, int i11, boolean z10) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        g gVar = this.mOfferwallListener;
        return gVar != null && gVar.onOfferwallAdCredited(i10, i11, z10);
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWShowFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.onOfferwallShowFailed(ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOWShowSuccess(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose("onOWShowSuccess(placementId:" + str + ")");
        g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallEventNotificationReceived(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallInitFail(String str) {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        if (this.mOfferwallListener != null) {
            this.mOfferwallListener.a(false, ErrorBuilder.buildGenericError(str));
        }
    }

    @Override // com.ironsource.sdk.j.e
    public void onOfferwallInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(getProviderName());
        g gVar = this.mOfferwallListener;
        if (gVar != null) {
            gVar.onOfferwallAvailable(true);
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.warning("unsupported method");
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setConsent(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(z10 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        sb2.append(")");
        ironLog.verbose(sb2.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consent", z10 ? "1" : "0");
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e10) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.k
    public void setInternalOfferwallListener(g gVar) {
        this.mOfferwallListener = gVar;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMediationSegment(String str) {
        mediationSegment = str;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void setMetaData(String str, String str2) {
        if (mDidInitSdk.get()) {
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("key=" + str + ", value=" + str2);
        if (!isValidMetaData(str, str2)) {
            ironLog.verbose("MetaData not valid");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
            IronSourceNetwork.updateMetadata(jSONObject);
        } catch (JSONException e10) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("error - " + e10);
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean shouldBindBannerViewOnReload() {
        return true;
    }

    @Override // com.ironsource.mediationsdk.sdk.h
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose(getDemandSourceName(jSONObject));
        try {
            showAdInternal(this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject)), 2);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.k
    public void showOfferwall(String str, JSONObject jSONObject) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(getProviderName() + " showOfferWall");
        try {
            HashMap<String, String> offerwallExtraParams = getOfferwallExtraParams();
            offerwallExtraParams.put("placementId", str);
            IronSourceNetwork.showOfferWall(ContextProvider.getInstance().getCurrentActiveActivity(), offerwallExtraParams);
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.ADAPTER_API;
            ironLog2.error("exception " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.l
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), 1);
        } catch (Exception e10) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e10.getMessage()));
        }
    }
}
