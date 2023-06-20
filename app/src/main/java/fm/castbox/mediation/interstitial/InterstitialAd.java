package fm.castbox.mediation.interstitial;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import com.facebook.ads.Ad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.helper.AdResponseOperator;
import fm.castbox.mediation.helper.UBCReportor;
import fm.castbox.mediation.http.AdRequestListener;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkBid;
import fm.castbox.mediation.model.ad.waterfall.admob.AdMobWaterfall;
import java.util.List;

/* loaded from: classes3.dex */
public class InterstitialAd extends BaseInterstitialAd implements AdRequestListener {
    private static final String TAG = "InterstitialAd";
    private final InterstitialAdLoadCallback adMobAdLoadCallback;
    private final FullScreenContentCallback adMobFullScreenContentCallback;
    private com.google.android.gms.ads.interstitial.InterstitialAd adMobInterstitialAd;
    private Handler adShowerHandler;
    private com.facebook.ads.InterstitialAd anInterstitialAd;
    private final com.facebook.ads.InterstitialAdListener anInterstitialAdListener;
    private InterstitialAdListener listener;
    private AdResponseOperator operator;

    /* loaded from: classes3.dex */
    public interface InterstitialAdListener {
        void onAdClicked();

        void onAdDismissed();

        void onAdImpression(float f10);

        void onAdLoaded();

        void onError(AdError adError);

        void onEventualFailure(AdError adError);
    }

    public InterstitialAd(Activity activity, String str) {
        super(activity, str);
        this.adMobAdLoadCallback = new InterstitialAdLoadCallback() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.2
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str2 = InterstitialAd.TAG;
                Log.i(str2, "AdMob: onAdFailedToLoad with " + loadAdError);
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onError(new AdError(16, loadAdError.getMessage(), "ad.load.admob", null));
                }
                InterstitialAd.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.w(InterstitialAd.TAG, "failed to load google admob interstitial ad, to try next one");
                        if (!InterstitialAd.this.doCacheAd()) {
                            Log.i(InterstitialAd.TAG, "next ad payload will be loaded soon");
                        } else {
                            Log.i(InterstitialAd.TAG, "ad payload is exhausted, say sorry to app.");
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
                super.onAdLoaded((AnonymousClass2) interstitialAd);
                Log.i(InterstitialAd.TAG, "AdMob: onAdLoaded");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                InterstitialAd.this.adMobInterstitialAd = interstitialAd;
                InterstitialAd.this.adMobInterstitialAd.setFullScreenContentCallback(InterstitialAd.this.adMobFullScreenContentCallback);
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdLoaded();
                }
            }
        };
        this.adMobFullScreenContentCallback = new FullScreenContentCallback() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.3
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(InterstitialAd.TAG, "AdMob: onAdClicked");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                super.onAdDismissedFullScreenContent();
                Log.i(InterstitialAd.TAG, "AdMob: onAdDismissedFullScreenContent");
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdDismissed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(com.google.android.gms.ads.AdError adError) {
                super.onAdFailedToShowFullScreenContent(adError);
                Log.i(InterstitialAd.TAG, "AdMob: onAdFailedToShowFullScreenContent");
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onError(new AdError(19, adError.getMessage(), "ad.show.admob", null));
                }
                AdResponseOperator adResponseOperator = InterstitialAd.this.operator;
                InterstitialAd interstitialAd = InterstitialAd.this;
                adResponseOperator.reportDisplayResult(interstitialAd.requestId, interstitialAd.inventoryId, false);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(InterstitialAd.TAG, "AdMob: onAdImpression");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (InterstitialAd.this.listener != null) {
                    float ecpm = InterstitialAd.this.operator.getActiveEntity() != null ? InterstitialAd.this.operator.getActiveEntity().getEcpm() : 0.0f;
                    AdResponseOperator adResponseOperator = InterstitialAd.this.operator;
                    InterstitialAd interstitialAd = InterstitialAd.this;
                    adResponseOperator.reportDisplayResult(interstitialAd.requestId, interstitialAd.inventoryId, true);
                    InterstitialAd.this.listener.onAdImpression(ecpm);
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                super.onAdShowedFullScreenContent();
                Log.i(InterstitialAd.TAG, "AdMob: onAdShowedFullScreenContent");
            }
        };
        this.anInterstitialAdListener = new com.facebook.ads.InterstitialAdListener() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.4
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                Log.i(InterstitialAd.TAG, "AudienceNetwork: onAdClicked");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                Log.i(InterstitialAd.TAG, "AudienceNetwork: onAdLoaded");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str2 = InterstitialAd.TAG;
                Log.i(str2, "AudienceNetwork: onError with " + adError);
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onError(new AdError(16, adError.getErrorMessage(), "ad.show.facebook", null));
                }
                AdResponseOperator adResponseOperator = InterstitialAd.this.operator;
                InterstitialAd interstitialAd = InterstitialAd.this;
                adResponseOperator.reportDisplayResult(interstitialAd.requestId, interstitialAd.inventoryId, false);
                InterstitialAd.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Log.w(InterstitialAd.TAG, "failed to load facebook audience network interstitial ad, to try next one");
                        if (!InterstitialAd.this.doCacheAd()) {
                            Log.i(InterstitialAd.TAG, "next ad payload will be loaded soon");
                        } else {
                            Log.i(InterstitialAd.TAG, "ad payload is exhausted, say sorry to app.");
                        }
                    }
                });
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad ad2) {
                Log.i(InterstitialAd.TAG, "AudienceNetwork: onInterstitialDismissed");
                if (InterstitialAd.this.listener != null) {
                    InterstitialAd.this.listener.onAdDismissed();
                }
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDisplayed(Ad ad2) {
                Log.i(InterstitialAd.TAG, "AudienceNetwork: onInterstitialDisplayed");
                if (InterstitialAd.this.operator != null) {
                    InterstitialAd.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (InterstitialAd.this.listener != null) {
                    float ecpm = InterstitialAd.this.operator.getActiveEntity() != null ? InterstitialAd.this.operator.getActiveEntity().getEcpm() : 0.0f;
                    AdResponseOperator adResponseOperator = InterstitialAd.this.operator;
                    InterstitialAd interstitialAd = InterstitialAd.this;
                    adResponseOperator.reportDisplayResult(interstitialAd.requestId, interstitialAd.inventoryId, true);
                    InterstitialAd.this.listener.onAdImpression(ecpm);
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                Log.i(InterstitialAd.TAG, "AudienceNetwork: onLoggingImpression");
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean doCacheAd() {
        if (this.operator.isEmpty()) {
            Log.e(TAG, "no valid entity to operate on");
            informEventualAdFailureIfNeeded();
            return true;
        } else if (this.hostingActivity == null) {
            Log.e(TAG, "host activity disappeared now, no need to show ad");
            return true;
        } else {
            AdResponseOperator.CompoundEntity pop = this.operator.pop();
            if (pop == null) {
                Log.e(TAG, "no valid entity to operate on during popping");
                informEventualAdFailureIfNeeded();
                return true;
            }
            eraseCurrentAdWidget();
            if (pop.isWaterfall()) {
                Log.i(TAG, "start to load google AdMob interstitial ad");
                AdMobWaterfall convertToAdMobWaterfall = pop.getWaterfall().convertToAdMobWaterfall();
                com.google.android.gms.ads.interstitial.InterstitialAd.load(this.hostingActivity, convertToAdMobWaterfall.getAdUnitId(), new AdRequest.Builder().build(), this.adMobAdLoadCallback);
                return false;
            } else if (pop.isBid()) {
                Log.i(TAG, "start to load facebook Audience Network interstitial ad");
                AudienceNetworkBid convertAudienceNetworkBid = pop.getBid().convertAudienceNetworkBid();
                com.facebook.ads.InterstitialAd interstitialAd = new com.facebook.ads.InterstitialAd(this.hostingActivity, convertAudienceNetworkBid.getPlacementId());
                this.anInterstitialAd = interstitialAd;
                interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(this.anInterstitialAdListener).withBid(convertAudienceNetworkBid.getPayload()).build());
                return false;
            } else {
                Log.e(TAG, "no bid or waterfall to cache, this arm should not be reached");
                informEventualAdFailureIfNeeded();
                return true;
            }
        }
    }

    private void eraseCurrentAdWidget() {
        com.facebook.ads.InterstitialAd interstitialAd = this.anInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.anInterstitialAd = null;
        this.adMobInterstitialAd = null;
    }

    private void informEventualAdFailureIfNeeded() {
        InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onEventualFailure(new AdError(20, "failed to load ad eventually", "ad.load"));
        }
    }

    private void init() {
        registerListener(this);
        this.adShowerHandler = new Handler(this.hostingActivity.getMainLooper());
        this.operator = new AdResponseOperator();
    }

    private void showANInterstitialAd() {
        com.facebook.ads.InterstitialAd interstitialAd = this.anInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }

    private void showAdMobInterstitialAd() {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.adMobInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this.hostingActivity);
        }
    }

    @Override // fm.castbox.mediation.interstitial.BaseInterstitialAd
    public void destroy() {
        super.destroy();
        com.facebook.ads.InterstitialAd interstitialAd = this.anInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.anInterstitialAd = null;
    }

    public void loadAd() {
        Log.i(TAG, "start to load ad metadata");
        AdResponseOperator adResponseOperator = this.operator;
        if (adResponseOperator != null) {
            adResponseOperator.UBC(UBCReportor.UBCCategory.UBC_AD_REQUEST);
        }
        fireAdRequest();
    }

    @Override // fm.castbox.mediation.http.AdRequestListener
    public void onFailure(AdError adError) {
        InterstitialAdListener interstitialAdListener = this.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onError(adError);
            informEventualAdFailureIfNeeded();
        }
    }

    @Override // fm.castbox.mediation.http.AdRequestListener
    public void onResponse(String str, List<Bid> list, List<Waterfall> list2) {
        this.operator.setContent(str, list, list2);
        if (list == null && list2 == null) {
            Log.e(TAG, "neither bids nor waterfalls received, the arm should not reach");
            if (this.listener != null) {
                informEventualAdFailureIfNeeded();
                return;
            }
            return;
        }
        this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.interstitial.InterstitialAd.1
            @Override // java.lang.Runnable
            public void run() {
                InterstitialAd.this.doCacheAd();
            }
        });
    }

    public void setListener(InterstitialAdListener interstitialAdListener) {
        this.listener = interstitialAdListener;
    }

    public void showAd() {
        showAdMobInterstitialAd();
        showANInterstitialAd();
    }
}
