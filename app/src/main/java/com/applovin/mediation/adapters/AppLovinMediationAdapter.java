package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinRewardedInterstitialAd;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxRewardedInterstitialAdapter, MaxSignalProvider {
    private AppLovinAdView mLoadedAdView;
    private AppLovinAd mLoadedInterstitialAd;
    private AppLovinAd mLoadedRewardedAd;
    private AppLovinAd mLoadedRewardedInterstitialAd;
    private AppLovinNativeAd mNativeAd;

    /* renamed from: com.applovin.mediation.adapters.AppLovinMediationAdapter$1  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements AppLovinAdLoadListener {
        final /* synthetic */ MaxAdFormat val$adFormat;
        final /* synthetic */ MaxAdViewAdapterListener val$listener;

        AnonymousClass1(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.val$adFormat = maxAdFormat;
            this.val$listener = maxAdViewAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad loaded");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinMediationAdapter.this.mLoadedAdView = new AppLovinAdView(AppLovinMediationAdapter.this.getWrappingSdk(), appLovinAd.getSize(), AppLovinMediationAdapter.this.getApplicationContext());
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.1
                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adDisplayed(AppLovinAd appLovinAd2) {
                            if (v.a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad shown");
                            }
                            AnonymousClass1.this.val$listener.onAdViewAdDisplayed();
                        }

                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adHidden(AppLovinAd appLovinAd2) {
                            if (v.a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad hidden");
                            }
                            AnonymousClass1.this.val$listener.onAdViewAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd2));
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdClickListener(new AppLovinAdClickListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.2
                        @Override // com.applovin.sdk.AppLovinAdClickListener
                        public void adClicked(AppLovinAd appLovinAd2) {
                            if (v.a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad clicked");
                            }
                            AnonymousClass1.this.val$listener.onAdViewAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd2));
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdViewEventListener(new AppLovinAdViewEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.3
                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adClosedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            if (v.a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad collapsed");
                            }
                            AnonymousClass1.this.val$listener.onAdViewAdCollapsed();
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adFailedToDisplay(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
                            AnonymousClass1.this.val$listener.onAdViewAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adLeftApplication(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adOpenedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            if (v.a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(AnonymousClass1.this.val$adFormat.getLabel() + " ad expanded");
                            }
                            AnonymousClass1.this.val$listener.onAdViewAdExpanded();
                        }
                    });
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    anonymousClass1.val$listener.onAdViewAdLoaded(AppLovinMediationAdapter.this.mLoadedAdView);
                    AppLovinMediationAdapter.this.mLoadedAdView.renderAd(appLovinAd);
                }
            });
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad failed to load with error code: " + i10);
            }
            this.val$listener.onAdViewAdLoadFailed(AppLovinMediationAdapter.toMaxError(i10));
        }
    }

    /* loaded from: classes.dex */
    private class InterstitialListenerWrapper implements g, AppLovinAdClickListener {
        final MaxInterstitialAdapterListener listener;

        InterstitialListenerWrapper(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad clicked");
            }
            this.listener.onInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad shown");
            }
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad hidden");
            }
            this.listener.onInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Interstitial ad failed to display with error: " + str);
            }
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }
    }

    /* loaded from: classes.dex */
    private class MaxAppLovinNativeAd extends MaxNativeAd {
        public MaxAppLovinNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) AppLovinMediationAdapter.this.mNativeAd;
            if (appLovinNativeAdImpl == null) {
                if (v.a()) {
                    AppLovinMediationAdapter.this.e("Failed to register native ad view for interaction. Native ad is null");
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
        }
    }

    /* loaded from: classes.dex */
    private abstract class RewardListenerWrapper implements AppLovinAdRewardListener {
        protected boolean hasGrantedReward;

        private RewardListenerWrapper() {
        }

        /* synthetic */ RewardListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("User is over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Reward verified");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Reward validation request failed with code: " + i10);
            }
        }
    }

    /* loaded from: classes.dex */
    private class RewardedAdListenerWrapper extends RewardListenerWrapper implements g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedAdapterListener listener;

        private RewardedAdListenerWrapper(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedAdapterListener;
        }

        /* synthetic */ RewardedAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, AnonymousClass1 anonymousClass1) {
            this(maxRewardedAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad clicked");
            }
            this.listener.onRewardedAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad shown");
            }
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (this.hasGrantedReward || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AppLovinMediationAdapter.this.getReward();
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Rewarded user with reward: " + reward);
                }
                this.listener.onUserRewarded(reward);
            }
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad hidden");
            }
            this.listener.onRewardedAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded ad failed to display with error: " + str);
            }
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad video started");
            }
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded ad video ended at " + d10 + "% and is fully watched: " + z10);
            }
            this.hasGrantedReward = z10;
            this.listener.onRewardedAdVideoCompleted();
        }
    }

    /* loaded from: classes.dex */
    private class RewardedInterstitialAdListenerWrapper extends RewardListenerWrapper implements g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedInterstitialAdapterListener listener;

        private RewardedInterstitialAdListenerWrapper(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedInterstitialAdapterListener;
        }

        /* synthetic */ RewardedInterstitialAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, AnonymousClass1 anonymousClass1) {
            this(maxRewardedInterstitialAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad clicked");
            }
            this.listener.onRewardedInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad shown");
            }
            this.listener.onRewardedInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (this.hasGrantedReward || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AppLovinMediationAdapter.this.getReward();
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Rewarded interstitial rewarded user with reward: " + reward);
                }
                this.listener.onUserRewarded(reward);
            }
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad hidden");
            }
            this.listener.onRewardedInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.ad.g
        public void onAdDisplayFailed(String str) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
            }
            this.listener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (v.a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad video started");
            }
            this.listener.onRewardedInterstitialAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            if (v.a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded interstitial ad video ended at " + d10 + "% and is fully watched: " + z10);
            }
            this.hasGrantedReward = z10;
            this.listener.onRewardedInterstitialAdVideoCompleted();
        }
    }

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle(Utils.KEY_AD_VALUES, ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final MaxAdapterListener maxAdapterListener) {
        StringBuilder sb2;
        AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.2
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad loaded");
                }
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    AppLovinMediationAdapter.this.mLoadedInterstitialAd = appLovinAd;
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoaded();
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    AppLovinMediationAdapter.this.mLoadedRewardedAd = appLovinAd;
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoaded();
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad loaded for fullscreen ad adapter");
                } else {
                    AppLovinMediationAdapter.this.mLoadedRewardedInterstitialAd = appLovinAd;
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoaded();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i10) {
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad failed to load with error code: " + i10);
                }
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i10));
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(i10));
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad failed to load for fullscreen ad adapter");
                } else {
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i10));
                }
            }
        };
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            if (v.a()) {
                log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdLoadListener);
        } else if (!StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            if (v.a()) {
                sb2 = new StringBuilder();
                sb2.append("Loading mediated ");
                sb2.append(maxAdFormat.getLabel());
                sb2.append(" ad...");
                log(sb2.toString());
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, appLovinAdLoadListener);
        } else {
            str = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            if (v.a()) {
                sb2 = new StringBuilder();
                sb2.append("Loading mediated ");
                sb2.append(maxAdFormat.getLabel());
                sb2.append(" ad: ");
                sb2.append(str);
                sb2.append("...");
                log(sb2.toString());
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, appLovinAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(int i10) {
        MaxAdapterError maxAdapterError = i10 == -1009 ? MaxAdapterError.NO_CONNECTION : i10 == 204 ? MaxAdapterError.NO_FILL : i10 == -1 ? MaxAdapterError.INTERNAL_ERROR : i10 >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), i10, "");
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (v.a()) {
            log("Collecting signal...");
        }
        maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(maxAdFormat, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            if (v.a()) {
                log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), anonymousClass1);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            if (v.a()) {
                log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, anonymousClass1);
        } else {
            AppLovinAdSize appLovinAdSize = null;
            if (maxAdFormat == MaxAdFormat.BANNER) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            } else if (maxAdFormat == MaxAdFormat.MREC) {
                appLovinAdSize = AppLovinAdSize.MREC;
            } else if (maxAdFormat == MaxAdFormat.LEADER) {
                appLovinAdSize = AppLovinAdSize.LEADER;
            }
            if (appLovinAdSize == null) {
                if (v.a()) {
                    log("Failed to load ad for format: " + maxAdFormat);
                }
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
                return;
            }
            if (v.a()) {
                log("Loading mediated " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, anonymousClass1);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, maxInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (v.a()) {
            d("Loading bidding native ad...");
        }
        getWrappingSdk().coreSdk.v().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinNativeAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3
            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoadFailed(int i10) {
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.d("Native ad failed to load with error code: " + i10);
                }
                maxNativeAdAdapterListener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(i10));
            }

            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.d("Native ad loaded: " + appLovinNativeAd);
                }
                if (!StringUtils.isValidString(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters())) || !TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
                    ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(new AppLovinNativeAdEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3.1
                        @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
                        public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd2) {
                            if (v.a()) {
                                AppLovinMediationAdapter.this.d("Native ad clicked");
                            }
                            maxNativeAdAdapterListener.onNativeAdClicked();
                        }
                    });
                    AppLovinMediationAdapter.this.mNativeAd = appLovinNativeAd;
                    maxNativeAdAdapterListener.onNativeAdLoaded(new MaxAppLovinNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setBody(appLovinNativeAd.getBody()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setMainImage(new MaxNativeAd.MaxNativeAdImage(((AppLovinNativeAdImpl) appLovinNativeAd).getMainImageUri())).setMediaView(appLovinNativeAd.getMediaView()).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio()).setOptionsView(appLovinNativeAd.getOptionsView())), null);
                    return;
                }
                if (v.a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter2.e("Native ad does not have required assets: " + appLovinNativeAd);
                }
                maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, maxRewardedAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, MaxAdFormat.REWARDED_INTERSTITIAL, maxRewardedInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.mLoadedInterstitialAd = null;
        this.mLoadedRewardedAd = null;
        this.mLoadedRewardedInterstitialAd = null;
        AppLovinAdView appLovinAdView = this.mLoadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.mLoadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.mNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.mNativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (v.a()) {
            log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (v.a()) {
            log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd, viewGroup, iVar);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (v.a()) {
            log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxRewardedAdViewAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (v.a()) {
            log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, viewGroup, iVar, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        if (v.a()) {
            log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        RewardedInterstitialAdListenerWrapper rewardedInterstitialAdListenerWrapper = new RewardedInterstitialAdListenerWrapper(this, maxRewardedInterstitialAdapterListener, null);
        if (this.mLoadedRewardedInterstitialAd.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdClickListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.show(this.mLoadedRewardedInterstitialAd, activity, rewardedInterstitialAdListenerWrapper);
            return;
        }
        if (v.a()) {
            log("Rewarded interstitial is regular interstitial");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        create.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
        create.setAdClickListener(rewardedInterstitialAdListenerWrapper);
        create.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
        create.showAndRender(this.mLoadedRewardedInterstitialAd);
    }
}
