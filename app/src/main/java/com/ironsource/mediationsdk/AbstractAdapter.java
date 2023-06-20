package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AbstractAdapter implements com.ironsource.mediationsdk.sdk.h, com.ironsource.mediationsdk.sdk.l {
    private static Boolean mAdapterDebug;
    protected BannerSmashListener mActiveBannerSmash;
    protected InterstitialSmashListener mActiveInterstitialSmash;
    protected RewardedVideoSmashListener mActiveRewardedVideoSmash;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mProviderName;
    protected LoadWhileShowSupportState mLWSSupportState = LoadWhileShowSupportState.NONE;
    private IronSourceLoggerManager mLoggerManager = IronSourceLoggerManager.getLogger();
    protected CopyOnWriteArrayList<RewardedVideoSmashListener> mAllRewardedVideoSmashes = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<InterstitialSmashListener> mAllInterstitialSmashes = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<BannerSmashListener> mAllBannerSmashes = new CopyOnWriteArrayList<>();
    protected ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementToListenerMap = new ConcurrentHashMap<>();

    public AbstractAdapter(String str) {
        this.mProviderName = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addBannerListener(BannerSmashListener bannerSmashListener) {
    }

    public void addInterstitialListener(InterstitialSmashListener interstitialSmashListener) {
        this.mAllInterstitialSmashes.add(interstitialSmashListener);
    }

    public void addRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.add(rewardedVideoSmashListener);
    }

    public void destroyBanner(JSONObject jSONObject) {
    }

    public void earlyInit(String str, String str2, JSONObject jSONObject) {
    }

    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject) {
        return null;
    }

    public abstract String getCoreSDKVersion();

    protected String getDynamicUserId() {
        return J.a().f26341m;
    }

    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject) {
        return null;
    }

    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return this.mLWSSupportState;
    }

    public JSONObject getPlayerBiddingData() {
        return null;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject) {
        return null;
    }

    public abstract String getVersion();

    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
    }

    public void initRewardedVideo(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        initAndLoadRewardedVideo(str, str2, jSONObject, rewardedVideoSmashListener);
    }

    public void initRewardedVideoForBidding(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        initRewardedVideoWithCallback(str, str2, jSONObject, rewardedVideoSmashListener);
    }

    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        if (rewardedVideoSmashListener != null) {
            rewardedVideoSmashListener.onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "method not implemented"));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isAdaptersDebugEnabled() {
        Boolean bool = mAdapterDebug;
        return bool != null && bool.booleanValue();
    }

    public void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    public void loadBannerBiddingForDemandOnly(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
    }

    public void loadBannerForBidding(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str) {
    }

    public void loadInterstitialForBidding(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
    }

    public void loadRewardedVideoForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
    }

    public void loadRewardedVideoForDemandOnly(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
    }

    public void loadRewardedVideoForDemandOnlyForBidding(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void postOnUIThread(Runnable runnable) {
        com.ironsource.environment.e.c.f26160a.a(runnable);
    }

    public void releaseMemory(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
    }

    public void reloadBanner(IronSourceBannerLayout ironSourceBannerLayout, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
    }

    protected void removeBannerListener(BannerSmashListener bannerSmashListener) {
    }

    public void removeInterstitialListener(InterstitialSmashListener interstitialSmashListener) {
        this.mAllInterstitialSmashes.remove(interstitialSmashListener);
    }

    public void removeRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.remove(rewardedVideoSmashListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdapterDebug(Boolean bool) {
        mAdapterDebug = bool;
    }

    public void setAge(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setConsent(boolean z10) {
    }

    public void setGender(String str) {
    }

    public void setLogListener(LogListener logListener) {
    }

    public void setMediationSegment(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMediationState(AbstractC1728b.a aVar, String str) {
    }

    protected void setMetaData(String str, String str2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMetaData(String str, List<String> list) {
        for (String str2 : list) {
            setMetaData(str, str2);
        }
    }

    public void setPluginData(String str, String str2) {
        this.mPluginType = str;
        this.mPluginFrameworkVersion = str2;
    }

    public boolean shouldBindBannerViewOnReload() {
        return false;
    }

    public void updateRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener) {
        this.mAllRewardedVideoSmashes.clear();
        this.mAllRewardedVideoSmashes.add(rewardedVideoSmashListener);
    }
}
