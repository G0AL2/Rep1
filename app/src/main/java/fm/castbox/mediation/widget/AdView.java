package fm.castbox.mediation.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import fm.castbox.mediation.R;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.helper.AdResponseOperator;
import fm.castbox.mediation.helper.Scheduler;
import fm.castbox.mediation.helper.UBCReportor;
import fm.castbox.mediation.http.AdRequestListener;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkBid;
import fm.castbox.mediation.model.ad.waterfall.admob.AdMobWaterfall;
import java.util.List;

/* loaded from: classes3.dex */
public class AdView extends AdBaseView implements AdRequestListener {
    private static final long AD_REQUEST_INTERVAL_SECS = 10;
    private static final String TAG = AdView.class.getSimpleName();
    private AdListener adListener;
    private final com.google.android.gms.ads.AdListener adMobAdListener;
    private com.google.android.gms.ads.AdView adMobAdView;
    private Handler adShowerHandler;
    private final com.facebook.ads.AdListener audienceNetworkAdListener;
    private com.facebook.ads.AdView fbAdView;
    private Activity hostingActivity;
    private AdResponseOperator operator;
    private Scheduler scheduler;

    /* loaded from: classes3.dex */
    public interface AdListener {
        void onAdClicked();

        void onAdImpression(float f10);

        void onAdLoaded();

        void onError(AdError adError);

        void onInventoryReady();
    }

    /* loaded from: classes3.dex */
    private static final class AdType {
        public static final String BANNER = "banner";
        public static final String BANNER_H250 = "banner_h250";
        public static final String BANNER_H50 = "banner_h50";
        public static final String BANNER_H90 = "banner_h90";
        public static final String FULL_BANNER = "full_banner";
        public static final String LARGE_BANNER = "large_banner";
        public static final String LEADERBOARD = "leaderboard";
        public static final String MEDIUM_RECTANGLE = "medium_rectangle";
        public static final String SMART_BANNER = "smart_banner";

        private AdType() {
        }
    }

    public AdView(Context context) {
        super(context);
        this.adMobAdListener = new com.google.android.gms.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(AdView.TAG, "AdMob: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                super.onAdClosed();
                Log.i(AdView.TAG, "AdMob: onAdClosed");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str = AdView.TAG;
                Log.i(str, "AdMob: onAdFailedToLoad - " + loadAdError.getMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", loadAdError.getMessage()), "ad.admob"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(AdView.TAG, "AdMob: onAdImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdImpression(AdView.this.operator.getActiveEntity() != null ? AdView.this.operator.getActiveEntity().getEcpm() : 0.0f);
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i(AdView.TAG, "AdMob: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
                Log.i(AdView.TAG, "AdMob: onAdOpened");
            }
        };
        this.audienceNetworkAdListener = new com.facebook.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.7
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str = AdView.TAG;
                Log.i(str, "AudienceNetwork: onError - " + adError.getErrorMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", adError.getErrorMessage()), "ad.audience.network"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onLoggingImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
            }
        };
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doShowAd(final Activity activity) {
        final AdSize translateAdMobAdSize;
        final String str;
        final com.facebook.ads.AdSize adSize;
        final String str2;
        final String str3;
        this.hostingActivity = activity;
        if (activity == null) {
            return;
        }
        if (this.operator.isEmpty()) {
            Log.e(TAG, "no valid entity to operate on");
            return;
        }
        AdResponseOperator.CompoundEntity pop = this.operator.pop();
        if (pop == null) {
            Log.e(TAG, "no valid entity to operate on during popping");
            return;
        }
        if (pop.isBid()) {
            AudienceNetworkBid convertAudienceNetworkBid = pop.getBid().convertAudienceNetworkBid();
            String placementId = convertAudienceNetworkBid.getPlacementId();
            String payload = convertAudienceNetworkBid.getPayload();
            adSize = translateAudienceNetworkAdSize(convertAudienceNetworkBid.getAdFormat());
            str2 = placementId;
            translateAdMobAdSize = null;
            str = null;
            str3 = payload;
        } else if (pop.isWaterfall()) {
            AdMobWaterfall convertToAdMobWaterfall = pop.getWaterfall().convertToAdMobWaterfall();
            String adUnitId = convertToAdMobWaterfall.getAdUnitId();
            translateAdMobAdSize = translateAdMobAdSize(convertToAdMobWaterfall.getAdFormat());
            str = adUnitId;
            adSize = null;
            str2 = null;
            str3 = null;
        } else {
            Log.e(TAG, "this arm should never reach");
            return;
        }
        this.hostingActivity.runOnUiThread(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.5
            @Override // java.lang.Runnable
            public void run() {
                AdView.this.populateNetworkWidgets(activity, adSize, str2, translateAdMobAdSize, str);
                if (AdView.this.adMobAdView != null) {
                    AdView.this.adMobAdView.loadAd(new AdRequest.Builder().build());
                    return;
                }
                AdView.this.fbAdView.loadAd(AdView.this.fbAdView.buildLoadAdConfig().withAdListener(AdView.this.audienceNetworkAdListener).withBid(str3).build());
            }
        });
        if (!this.scheduler.isScheduling()) {
            this.scheduler.start();
        }
    }

    private void init() {
        registerListener(this);
        this.adShowerHandler = new Handler(Looper.getMainLooper());
        this.operator = new AdResponseOperator();
        this.scheduler = new Scheduler(10000L, new Scheduler.Listener() { // from class: fm.castbox.mediation.widget.AdView.1
            @Override // fm.castbox.mediation.helper.Scheduler.Listener
            public void onSchedule() {
                Log.i(AdView.TAG, String.format("start to send out ad request at %d seconds intervals", Long.valueOf((long) AdView.AD_REQUEST_INTERVAL_SECS)));
                AdView.this.adShowerHandler.removeCallbacksAndMessages(null);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AdView.super.fireAdRequest();
                        if (AdView.this.operator != null) {
                            AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_REFRESH);
                        }
                    }
                });
            }
        });
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AdView, i10, 0);
        this.inventoryId = obtainStyledAttributes.getString(R.styleable.AdView_inventoryId);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateNetworkWidgets(final Context context, final com.facebook.ads.AdSize adSize, final String str, final AdSize adSize2, final String str2) {
        this.hostingActivity.runOnUiThread(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdView.this.adMobAdView != null) {
                    AdView adView = AdView.this;
                    adView.removeView(adView.adMobAdView);
                    AdView.this.adMobAdView.destroy();
                    AdView.this.adMobAdView = null;
                }
                if (AdView.this.fbAdView != null) {
                    AdView adView2 = AdView.this;
                    adView2.removeView(adView2.fbAdView);
                    AdView.this.fbAdView.destroy();
                    AdView.this.fbAdView = null;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
                if (str2 != null) {
                    AdView.this.adMobAdView = new com.google.android.gms.ads.AdView(context);
                    AdView.this.adMobAdView.setAdSize(adSize2);
                    AdView.this.adMobAdView.setAdUnitId(str2);
                    AdView.this.adMobAdView.setAdListener(AdView.this.adMobAdListener);
                    AdView adView3 = AdView.this;
                    adView3.addView(adView3.adMobAdView, layoutParams);
                    AdView.this.adMobAdView.setVisibility(0);
                } else if (str == null) {
                    Log.w(AdView.TAG, "no ad view should be present");
                } else {
                    AdView.this.fbAdView = new com.facebook.ads.AdView(context, str, adSize);
                    AdView adView4 = AdView.this;
                    adView4.addView(adView4.fbAdView, layoutParams);
                    AdView.this.fbAdView.setVisibility(0);
                }
            }
        });
    }

    private AdSize translateAdMobAdSize(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1706072195:
                if (str.equals(AdType.LEADERBOARD)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1497158948:
                if (str.equals(AdType.FULL_BANNER)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1396342996:
                if (str.equals(AdType.BANNER)) {
                    c10 = 2;
                    break;
                }
                break;
            case -793214366:
                if (str.equals(AdType.SMART_BANNER)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1622419749:
                if (str.equals(AdType.MEDIUM_RECTANGLE)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1675802800:
                if (str.equals(AdType.LARGE_BANNER)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return AdSize.LEADERBOARD;
            case 1:
                return AdSize.FULL_BANNER;
            case 2:
                return AdSize.BANNER;
            case 3:
                return AdSize.SMART_BANNER;
            case 4:
                return AdSize.MEDIUM_RECTANGLE;
            case 5:
                return AdSize.LARGE_BANNER;
            default:
                Log.e(TAG, String.format("unsupported ad size type %d by adMob", str));
                return AdSize.BANNER;
        }
    }

    private com.facebook.ads.AdSize translateAudienceNetworkAdSize(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1907237352:
                if (str.equals(AdType.BANNER_H250)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1031355024:
                if (str.equals(AdType.BANNER_H50)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1031354900:
                if (str.equals(AdType.BANNER_H90)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return com.facebook.ads.AdSize.RECTANGLE_HEIGHT_250;
            case 1:
                return com.facebook.ads.AdSize.BANNER_HEIGHT_50;
            case 2:
                return com.facebook.ads.AdSize.BANNER_HEIGHT_90;
            default:
                Log.e(TAG, String.format("unsupported ad size type %d by audience network", str));
                return com.facebook.ads.AdSize.BANNER_HEIGHT_50;
        }
    }

    @Override // fm.castbox.mediation.widget.AdBaseView
    public void destroy() {
        Log.i(TAG, "destroy");
        com.google.android.gms.ads.AdView adView = this.adMobAdView;
        if (adView != null) {
            ViewGroup viewGroup = (ViewGroup) adView.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            this.adMobAdView.destroy();
        }
        com.facebook.ads.AdView adView2 = this.fbAdView;
        if (adView2 != null) {
            adView2.destroy();
        }
        Scheduler scheduler = this.scheduler;
        if (scheduler != null) {
            scheduler.destroy();
        }
        Handler handler = this.adShowerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.adMobAdView = null;
        this.fbAdView = null;
        this.scheduler = null;
        this.adShowerHandler = null;
        super.destroy();
    }

    public void loadAd() {
        this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.3
            @Override // java.lang.Runnable
            public void run() {
                AdView.this.adShowerHandler.removeCallbacksAndMessages(null);
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_REQUEST);
                }
                AdView.super.fireAdRequest();
            }
        });
    }

    @Override // fm.castbox.mediation.http.AdRequestListener
    public void onFailure(AdError adError) {
        AdListener adListener = this.adListener;
        if (adListener != null) {
            adListener.onError(adError);
        }
    }

    @Override // fm.castbox.mediation.http.AdRequestListener
    public void onResponse(String str, List<Bid> list, List<Waterfall> list2) {
        synchronized (this) {
            this.operator.clear();
            this.operator.setContent(str, list, list2);
        }
        AdListener adListener = this.adListener;
        if (adListener != null && (list != null || list2 != null)) {
            adListener.onInventoryReady();
        }
        Scheduler scheduler = this.scheduler;
        if (scheduler == null || !scheduler.isScheduling()) {
            return;
        }
        this.adShowerHandler.removeCallbacksAndMessages(null);
        Activity activity = this.hostingActivity;
        if (activity != null) {
            showAd(activity);
        } else {
            Log.e(TAG, "hosting activity is disappear");
        }
    }

    @Override // fm.castbox.mediation.widget.AdBaseView
    public void pause() {
        super.pause();
        Log.i(TAG, "paused");
        com.google.android.gms.ads.AdView adView = this.adMobAdView;
        if (adView != null) {
            adView.pause();
        }
        Scheduler scheduler = this.scheduler;
        if (scheduler != null) {
            scheduler.pause();
        }
        Handler handler = this.adShowerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // fm.castbox.mediation.widget.AdBaseView
    public void resume() {
        super.resume();
        Log.i(TAG, "resume");
        com.google.android.gms.ads.AdView adView = this.adMobAdView;
        if (adView != null) {
            adView.resume();
        }
        Scheduler scheduler = this.scheduler;
        if (scheduler != null) {
            scheduler.resume();
        }
    }

    public void setAdListener(AdListener adListener) {
        this.adListener = adListener;
    }

    public void showAd(final Activity activity) {
        this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.4
            @Override // java.lang.Runnable
            public void run() {
                AdView.this.adShowerHandler.removeCallbacksAndMessages(null);
                AdView.this.doShowAd(activity);
            }
        });
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.adMobAdListener = new com.google.android.gms.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(AdView.TAG, "AdMob: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                super.onAdClosed();
                Log.i(AdView.TAG, "AdMob: onAdClosed");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str = AdView.TAG;
                Log.i(str, "AdMob: onAdFailedToLoad - " + loadAdError.getMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", loadAdError.getMessage()), "ad.admob"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(AdView.TAG, "AdMob: onAdImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdImpression(AdView.this.operator.getActiveEntity() != null ? AdView.this.operator.getActiveEntity().getEcpm() : 0.0f);
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i(AdView.TAG, "AdMob: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
                Log.i(AdView.TAG, "AdMob: onAdOpened");
            }
        };
        this.audienceNetworkAdListener = new com.facebook.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.7
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str = AdView.TAG;
                Log.i(str, "AudienceNetwork: onError - " + adError.getErrorMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", adError.getErrorMessage()), "ad.audience.network"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onLoggingImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
            }
        };
        initAttrs(context, attributeSet, 0);
        init();
    }

    public AdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.adMobAdListener = new com.google.android.gms.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(AdView.TAG, "AdMob: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                super.onAdClosed();
                Log.i(AdView.TAG, "AdMob: onAdClosed");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str = AdView.TAG;
                Log.i(str, "AdMob: onAdFailedToLoad - " + loadAdError.getMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", loadAdError.getMessage()), "ad.admob"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(AdView.TAG, "AdMob: onAdImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdImpression(AdView.this.operator.getActiveEntity() != null ? AdView.this.operator.getActiveEntity().getEcpm() : 0.0f);
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i(AdView.TAG, "AdMob: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
                Log.i(AdView.TAG, "AdMob: onAdOpened");
            }
        };
        this.audienceNetworkAdListener = new com.facebook.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.7
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str = AdView.TAG;
                Log.i(str, "AudienceNetwork: onError - " + adError.getErrorMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", adError.getErrorMessage()), "ad.audience.network"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onLoggingImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
            }
        };
        initAttrs(context, attributeSet, i10);
        init();
    }

    public AdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.adMobAdListener = new com.google.android.gms.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(AdView.TAG, "AdMob: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                super.onAdClosed();
                Log.i(AdView.TAG, "AdMob: onAdClosed");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str = AdView.TAG;
                Log.i(str, "AdMob: onAdFailedToLoad - " + loadAdError.getMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", loadAdError.getMessage()), "ad.admob"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(AdView.TAG, "AdMob: onAdImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdImpression(AdView.this.operator.getActiveEntity() != null ? AdView.this.operator.getActiveEntity().getEcpm() : 0.0f);
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i(AdView.TAG, "AdMob: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
                Log.i(AdView.TAG, "AdMob: onAdOpened");
            }
        };
        this.audienceNetworkAdListener = new com.facebook.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.7
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str = AdView.TAG;
                Log.i(str, "AudienceNetwork: onError - " + adError.getErrorMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", adError.getErrorMessage()), "ad.audience.network"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onLoggingImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
            }
        };
        initAttrs(context, attributeSet, i10);
        init();
    }

    public AdView(Context context, String str) {
        super(context);
        this.adMobAdListener = new com.google.android.gms.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.6
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                super.onAdClicked();
                Log.i(AdView.TAG, "AdMob: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                super.onAdClosed();
                Log.i(AdView.TAG, "AdMob: onAdClosed");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                String str2 = AdView.TAG;
                Log.i(str2, "AdMob: onAdFailedToLoad - " + loadAdError.getMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", loadAdError.getMessage()), "ad.admob"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.i(AdView.TAG, "AdMob: onAdImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdImpression(AdView.this.operator.getActiveEntity() != null ? AdView.this.operator.getActiveEntity().getEcpm() : 0.0f);
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.i(AdView.TAG, "AdMob: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
                Log.i(AdView.TAG, "AdMob: onAdOpened");
            }
        };
        this.audienceNetworkAdListener = new com.facebook.ads.AdListener() { // from class: fm.castbox.mediation.widget.AdView.7
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdClicked");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_CLICKED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onAdLoaded");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_LOADED);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onAdLoaded();
                }
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad2, com.facebook.ads.AdError adError) {
                String str2 = AdView.TAG;
                Log.i(str2, "AudienceNetwork: onError - " + adError.getErrorMessage());
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_NO_FILL);
                }
                if (AdView.this.adListener != null) {
                    AdView.this.adListener.onError(new AdError(17, String.format("failed to load ad of AdMob due to %s", adError.getErrorMessage()), "ad.audience.network"));
                }
                AdResponseOperator adResponseOperator = AdView.this.operator;
                AdView adView = AdView.this;
                adResponseOperator.reportDisplayResult(adView.requestId, adView.inventoryId, false);
                AdView.this.adShowerHandler.post(new Runnable() { // from class: fm.castbox.mediation.widget.AdView.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AdView.this.hostingActivity != null) {
                            AdView adView2 = AdView.this;
                            adView2.showAd(adView2.hostingActivity);
                        }
                    }
                });
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad2) {
                if (ad2.isAdInvalidated()) {
                    return;
                }
                Log.i(AdView.TAG, "AudienceNetwork: onLoggingImpression");
                if (AdView.this.operator != null) {
                    AdView.this.operator.UBC(UBCReportor.UBCCategory.UBC_AD_IMPRESSION);
                }
            }
        };
        this.inventoryId = str;
        init();
    }
}
