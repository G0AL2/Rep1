package com.amazon.admob_adapter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.BuildConfig;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DTBCacheData;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;
import m2.b;
import m2.c;

/* loaded from: classes.dex */
public class APSAdMobCustomInterstitialEvent implements CustomEventInterstitial, DTBAdInterstitialListener {

    /* renamed from: c  reason: collision with root package name */
    private static final String f5922c = "APSAdMobCustomInterstitialEvent";

    /* renamed from: d  reason: collision with root package name */
    private static InterstitialAd f5923d;

    /* renamed from: a  reason: collision with root package name */
    private CustomEventInterstitialListener f5924a;

    /* renamed from: b  reason: collision with root package name */
    private DTBAdInterstitial f5925b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DTBAdCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DTBCacheData f5926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CustomEventInterstitialListener f5927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f5928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5929d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f5930e;

        a(DTBCacheData dTBCacheData, CustomEventInterstitialListener customEventInterstitialListener, Context context, String str, String str2) {
            this.f5926a = dTBCacheData;
            this.f5927b = customEventInterstitialListener;
            this.f5928c = context;
            this.f5929d = str;
            this.f5930e = str2;
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onFailure(AdError adError) {
            String str = APSAdMobCustomInterstitialEvent.f5922c;
            Log.e(str, "Failed to load the ad in APSAdMobCustomInterstitialEvent class; " + adError.getMessage());
            this.f5926a.setBidRequestFailed(true);
            this.f5927b.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom interstitial ad in requestInterstitialAd in APSAdMobCustomInterstitialEvent class", BuildConfig.APPLICATION_ID));
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onSuccess(DTBAdResponse dTBAdResponse) {
            Log.i(APSAdMobCustomInterstitialEvent.f5922c, " Load the ad successfully in APSAdMobCustomInterstitialEvent class");
            this.f5926a.addResponse(dTBAdResponse);
            APSAdMobCustomInterstitialEvent.this.d(this.f5928c, this.f5927b, this.f5929d, dTBAdResponse.getRenderingBundle(), this.f5930e);
        }
    }

    private void c(Context context, CustomEventInterstitialListener customEventInterstitialListener, Bundle bundle, String str) {
        String string = bundle.getString(DtbConstants.ADMOB_SLOTUUID_KEY);
        String string2 = bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY);
        if (DtbCommonUtils.isNullOrEmpty(bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY))) {
            Log.e(f5922c, "Fail to load custom interstitial ad in requestInterstitialAd in APSAdMobCustomInterstitialEvent class because no request id ");
            customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestInterstitialAd in APSAdMobCustomInterstitialEvent class because previous bid requests failure", BuildConfig.APPLICATION_ID));
        } else if (!DtbCommonUtils.isNullOrEmpty(string)) {
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            dTBAdRequest.setSizes(new DTBAdSize.DTBInterstitialAdSize(string));
            DTBCacheData dTBCacheData = new DTBCacheData(string2, dTBAdRequest);
            AdRegistration.addAdMobCache(string2, dTBCacheData);
            dTBAdRequest.loadAd(new a(dTBCacheData, customEventInterstitialListener, context, str, string2));
        } else {
            Log.e(f5922c, "Fail to execute loadInterstitialAd method because not have sufficient info in APSAdMobCustomInterstitialEvent class");
            customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom interstitial ad in requestInterstitialAd in APSAdMobCustomInterstitialEvent class", BuildConfig.APPLICATION_ID));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, Bundle bundle, String str2) {
        if (DTBAdUtil.validateSinglePriceAdMobCustomEvent(str, bundle)) {
            this.f5924a = customEventInterstitialListener;
            DTBAdInterstitial dTBAdInterstitial = new DTBAdInterstitial(context, this);
            this.f5925b = dTBAdInterstitial;
            dTBAdInterstitial.fetchAd(bundle);
            AdRegistration.removeAdMobCache(str2);
            return;
        }
        customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom interstitial ad in requestInterstitialAd method in APSAdMobCustomInterstitialEvent class", BuildConfig.APPLICATION_ID));
    }

    @Deprecated
    public static void setAdMobInterstitial(InterstitialAd interstitialAd) {
        f5923d = interstitialAd;
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(View view) {
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdClicked();
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onAdClicked method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onAdClicked method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(View view) {
        FullScreenContentCallback fullScreenContentCallback;
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdClosed();
                return;
            }
            InterstitialAd interstitialAd = f5923d;
            if (interstitialAd == null || (fullScreenContentCallback = interstitialAd.getFullScreenContentCallback()) == null) {
                return;
            }
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onAdClosed method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onAdClosed method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(View view) {
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Custom interstitial ad failed to load", BuildConfig.APPLICATION_ID));
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onAdFailed method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onAdFailed method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    @Deprecated
    public void onAdLeftApplication(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(View view) {
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdLoaded();
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onAdLoaded method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onAdLoaded method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(View view) {
        FullScreenContentCallback fullScreenContentCallback;
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdOpened();
                return;
            }
            InterstitialAd interstitialAd = f5923d;
            if (interstitialAd == null || (fullScreenContentCallback = interstitialAd.getFullScreenContentCallback()) == null) {
                return;
            }
            fullScreenContentCallback.onAdShowedFullScreenContent();
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onAdOpen method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onAdOpen method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
        try {
            CustomEventInterstitialListener customEventInterstitialListener = this.f5924a;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onAdClosed();
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute onDestroy method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute onDestroy method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onImpressionFired(View view) {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(Context context, CustomEventInterstitialListener customEventInterstitialListener, String str, MediationAdRequest mediationAdRequest, Bundle bundle) {
        try {
            if (bundle.containsKey(DtbConstants.APS_ADAPTER_VERSION) && bundle.getString(DtbConstants.APS_ADAPTER_VERSION, BuildConfig.VERSION_NAME).equals(DtbConstants.APS_ADAPTER_VERSION_2)) {
                String string = bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY);
                DTBCacheData adMobCache = AdRegistration.getAdMobCache(string);
                if (adMobCache != null) {
                    if (adMobCache.isBidRequestFailed()) {
                        Log.e(f5922c, "Fail to load custom interstitial ad in requestInterstitialAd in APSAdMobCustomInterstitialSingleEvent class because previous bid requests failure");
                        customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestInterstitialAd in APSAdMobCustomInterstitialSingleEvent class because previous bid requests failure", BuildConfig.APPLICATION_ID));
                        return;
                    }
                    DTBAdResponse adResponse = adMobCache.getAdResponse();
                    if (adResponse != null) {
                        d(context, customEventInterstitialListener, str, adResponse.getRenderingBundle(), string);
                        return;
                    }
                }
                c(context, customEventInterstitialListener, bundle, str);
            } else if (DTBAdUtil.validateAdMobCustomEvent(str, bundle)) {
                this.f5924a = customEventInterstitialListener;
                DTBAdInterstitial dTBAdInterstitial = new DTBAdInterstitial(context, this);
                this.f5925b = dTBAdInterstitial;
                dTBAdInterstitial.fetchAd(bundle);
            } else {
                customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom interstitial ad in requestInterstitialAd method", BuildConfig.APPLICATION_ID));
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute requestInterstitialAd method during runtime in APSAdMobCustomInterstitialEvent class", e10);
            l2.a.i(b.FATAL, c.EXCEPTION, "Fail to execute requestInterstitialAd method during runtime in APSAdMobCustomInterstitialEvent class", e10);
            customEventInterstitialListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom interstitial ad in requestInterstitialAd method", BuildConfig.APPLICATION_ID));
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        try {
            DTBAdInterstitial dTBAdInterstitial = this.f5925b;
            if (dTBAdInterstitial != null) {
                dTBAdInterstitial.show();
            }
        } catch (RuntimeException e10) {
            Log.e(f5922c, "Fail to execute showInterstitial method", e10);
            l2.a.i(b.ERROR, c.EXCEPTION, "Fail to execute showInterstitial method during runtime in APSAdMobCustomInterstitialEvent class", e10);
        }
    }
}
