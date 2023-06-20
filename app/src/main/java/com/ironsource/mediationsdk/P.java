package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class P<Listener extends AdapterAdInteractionListener> extends BaseAdInteractionAdapter<P<Listener>, Listener> implements AdapterDebugInterface, AdapterAPSDataInterface, AdapterBaseInterface, AdapterBidderInterface, AdapterConsentInterface, AdapterMetaDataInterface, AdapterSettingsInterface, InterstitialSmashListener, RewardedVideoSmashListener {

    /* renamed from: a  reason: collision with root package name */
    IronSource.AD_UNIT f26469a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractAdapter f26470b;

    /* renamed from: c  reason: collision with root package name */
    private com.ironsource.mediationsdk.adunit.b.d f26471c;

    /* renamed from: d  reason: collision with root package name */
    private NetworkInitializationListener f26472d;

    /* renamed from: e  reason: collision with root package name */
    private AdapterAdListener f26473e;

    public P(AbstractAdapter abstractAdapter, NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        super(ad_unit, networkSettings);
        this.f26470b = abstractAdapter;
        this.f26469a = ad_unit;
        this.f26471c = new com.ironsource.mediationsdk.adunit.b.d(ad_unit, d.b.PROVIDER, null);
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f26470b.addInterstitialListener(this);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f26470b.addRewardedVideoListener(this);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(a("ad unit not supported - " + this.f26469a));
        }
    }

    private String a(String str) {
        String ad_unit = this.f26469a.toString();
        if (TextUtils.isEmpty(str)) {
            return ad_unit;
        }
        return ad_unit + " - " + str;
    }

    private boolean a(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f26469a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return ironSourceError.getErrorCode() == 1158;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return ironSourceError.getErrorCode() == 1058;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error(a("ad unit not supported - " + this.f26469a));
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getAdapterVersion() {
        try {
            return this.f26470b.getVersion();
        } catch (Exception e10) {
            String str = "Exception while calling adapter.getVersion() from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.f26471c.f26841e.m(str);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface
    public final Map<String, Object> getBiddingData(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            IronSource.AD_UNIT ad_unit = this.f26469a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f26470b.getInterstitialBiddingData(jSONObject);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f26470b.getRewardedVideoBiddingData(jSONObject);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f26469a));
            return null;
        } catch (Throwable th) {
            String str = "getBiddingData exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
            if (dVar != null) {
                dVar.f26841e.n(str);
                return null;
            }
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public final LoadWhileShowSupportState getLoadWhileShowSupportedState(NetworkSettings networkSettings) {
        try {
            return this.f26469a == IronSource.AD_UNIT.REWARDED_VIDEO ? this.f26470b.getLoadWhileShowSupportState(networkSettings.getRewardedVideoSettings()) : LoadWhileShowSupportState.NONE;
        } catch (Exception e10) {
            IronLog.INTERNAL.error(a("Exception while calling adapter.getLoadWhileShowSupportedState from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage()));
            return LoadWhileShowSupportState.NONE;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* bridge */ /* synthetic */ AdapterBaseInterface getNetworkAdapter() {
        return this;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final String getNetworkSDKVersion() {
        try {
            return this.f26470b.getCoreSDKVersion();
        } catch (Exception e10) {
            String str = "Exception while calling adapter.getCoreSDKVersion() from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            this.f26471c.f26841e.m(str);
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public final void init(AdData adData, Context context, NetworkInitializationListener networkInitializationListener) {
        this.f26472d = networkInitializationListener;
        String string = adData.getString(DataKeys.USER_ID);
        try {
            String str = J.a().f26340l;
            if (!TextUtils.isEmpty(str)) {
                this.f26470b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                this.f26470b.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
            }
        } catch (Throwable th) {
            String str2 = "setCustomParams exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str2));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
            if (dVar != null) {
                dVar.f26841e.n(str2);
            }
        }
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f26469a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f26470b.initInterstitialForBidding("", string, a10, this);
                } else {
                    this.f26470b.initInterstitial("", string, a10, this);
                }
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f26470b.initRewardedVideoWithCallback("", string, a10, this);
            } else {
                IronLog.INTERNAL.error("ad unit not supported - " + this.f26469a);
            }
        } catch (Throwable th2) {
            String str3 = "init failed - " + th2.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str3));
            com.ironsource.mediationsdk.adunit.b.d dVar2 = this.f26471c;
            if (dVar2 != null) {
                dVar2.f26841e.n(str3);
            }
            IronSource.AD_UNIT ad_unit2 = this.f26469a;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, str3));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, str3));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final boolean isAdAvailable(AdData adData) {
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f26469a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                return this.f26470b.isInterstitialReady(a10);
            }
            if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                return this.f26470b.isRewardedVideoAvailable(a10);
            }
            IronLog.INTERNAL.error(a("ad unit not supported - " + this.f26469a));
            return false;
        } catch (Throwable th) {
            String str = "isAdAvailable exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
            if (dVar != null) {
                dVar.f26841e.n(str);
                return false;
            }
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final /* synthetic */ void loadAd(AdData adData, Activity activity, Object obj) {
        this.f26473e = (AdapterAdInteractionListener) obj;
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f26469a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                Integer num = adData.getInt("instanceType");
                if (num == null || num.intValue() != 1) {
                    this.f26470b.loadInterstitialForBidding(a10, this, adData.getServerData());
                } else {
                    this.f26470b.loadInterstitial(a10, this);
                }
            } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
                IronLog.INTERNAL.error(a("ad unit not supported - " + this.f26469a));
            } else {
                Integer num2 = adData.getInt("instanceType");
                if (num2 == null || num2.intValue() != 1) {
                    this.f26470b.loadRewardedVideoForBidding(a10, this, adData.getServerData());
                } else {
                    this.f26470b.fetchRewardedVideoForAutomaticLoad(a10, this);
                }
            }
        } catch (Throwable th) {
            String str = "loadAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
            if (dVar != null) {
                dVar.f26841e.n(str);
            }
            IronSource.AD_UNIT ad_unit2 = this.f26469a;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, str));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadFailed(a(ironSourceError) ? AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f26472d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.f26472d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdClicked();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdEnded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdRewardListener) {
            ((AdapterAdRewardListener) adapterAdListener).onAdRewarded();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdShowFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdStarted();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener instanceof AdapterAdInteractionListener) {
            ((AdapterAdInteractionListener) adapterAdListener).onAdVisible();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("available = " + z10));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            if (z10) {
                adapterAdListener.onAdLoadSuccess();
            } else {
                adapterAdListener.onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, "");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        NetworkInitializationListener networkInitializationListener = this.f26472d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        NetworkInitializationListener networkInitializationListener = this.f26472d;
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        AdapterErrorType adapterErrorType;
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(a("error = " + ironSourceError));
        if (this.f26473e != null) {
            if (a(ironSourceError)) {
                adapterErrorType = AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL;
            } else {
                IronSource.AD_UNIT ad_unit = this.f26469a;
                boolean z10 = false;
                if (ad_unit != IronSource.AD_UNIT.INTERSTITIAL) {
                    if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.error(a("ad unit not supported - " + this.f26469a));
                    } else if (ironSourceError.getErrorCode() == 1057) {
                        z10 = true;
                    }
                }
                adapterErrorType = z10 ? AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED : AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL;
            }
            this.f26473e.onAdLoadFailed(adapterErrorType, ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose(a(""));
        AdapterAdListener adapterAdListener = this.f26473e;
        if (adapterAdListener != null) {
            adapterAdListener.onAdLoadSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter
    public final void releaseMemory() {
        AbstractAdapter abstractAdapter = this.f26470b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.releaseMemory(this.f26469a, new JSONObject());
                this.f26470b = null;
            } catch (Exception e10) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f26471c.f26841e.m(str);
            }
        }
        this.f26472d = null;
        this.f26473e = null;
        com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
        if (dVar != null) {
            dVar.a();
            this.f26471c = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public final void setAPSData(IronSource.AD_UNIT ad_unit, JSONObject jSONObject) {
        AbstractAdapter abstractAdapter = this.f26470b;
        if (abstractAdapter == null || !(abstractAdapter instanceof SetAPSInterface)) {
            return;
        }
        ((SetAPSInterface) abstractAdapter).setAPSData(ad_unit, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public final void setAdapterDebug(boolean z10) {
        AbstractAdapter abstractAdapter = this.f26470b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setAdapterDebug(Boolean.valueOf(z10));
            } catch (Exception e10) {
                String str = "Exception while calling adapter.setAdapterDebug(adapterDebug) from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f26471c.f26841e.m(str);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public final void setConsent(boolean z10) {
        AbstractAdapter abstractAdapter = this.f26470b;
        if (abstractAdapter != null) {
            try {
                abstractAdapter.setConsent(z10);
            } catch (Exception e10) {
                String str = "Exception while calling adapter.setConsent(consent) from " + this.f26470b.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(a(str));
                this.f26471c.f26841e.m(str);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public final void setMetaData(String str, List<String> list) {
        AbstractAdapter abstractAdapter = this.f26470b;
        if (abstractAdapter != null) {
            abstractAdapter.setMetaData(str, list);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter
    public final void showAd(AdData adData, Listener listener) {
        this.f26473e = listener;
        JSONObject a10 = com.ironsource.mediationsdk.c.b.a(adData.getConfiguration());
        try {
            IronSource.AD_UNIT ad_unit = this.f26469a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                this.f26470b.showInterstitial(a10, this);
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                this.f26470b.showRewardedVideo(a10, this);
            } else {
                IronLog.INTERNAL.error(a("ad unit not supported - " + this.f26469a));
            }
        } catch (Throwable th) {
            String str = "showAd exception - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            com.ironsource.mediationsdk.adunit.b.d dVar = this.f26471c;
            if (dVar != null) {
                dVar.f26841e.n(str);
            }
            IronSource.AD_UNIT ad_unit2 = this.f26469a;
            if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, str));
            } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, str));
            }
        }
    }
}
