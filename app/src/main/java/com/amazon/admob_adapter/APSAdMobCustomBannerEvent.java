package com.amazon.admob_adapter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.BuildConfig;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdUtil;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBCacheData;
import com.amazon.device.ads.DTBExpectedSizeProvider;
import com.amazon.device.ads.DTBLoadException;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.customevent.CustomEventBanner;
import com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener;
import m2.c;

/* loaded from: classes.dex */
public class APSAdMobCustomBannerEvent implements CustomEventBanner, DTBAdBannerListener, DTBExpectedSizeProvider {

    /* renamed from: e  reason: collision with root package name */
    private static final String f5903e = "APSAdMobCustomBannerEvent";

    /* renamed from: a  reason: collision with root package name */
    private CustomEventBannerListener f5904a;

    /* renamed from: b  reason: collision with root package name */
    private AdSize f5905b;

    /* renamed from: c  reason: collision with root package name */
    private int f5906c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f5907d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DTBAdCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DTBCacheData f5908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CustomEventBannerListener f5909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f5910c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AdSize f5911d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f5912e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f5913f;

        a(DTBCacheData dTBCacheData, CustomEventBannerListener customEventBannerListener, Context context, AdSize adSize, String str, String str2) {
            this.f5908a = dTBCacheData;
            this.f5909b = customEventBannerListener;
            this.f5910c = context;
            this.f5911d = adSize;
            this.f5912e = str;
            this.f5913f = str2;
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onFailure(AdError adError) {
            String str = APSAdMobCustomBannerEvent.f5903e;
            Log.e(str, "Failed to load the smart ad in APSAdMobCustomBannerEvent class; " + adError.getMessage());
            this.f5908a.setBidRequestFailed(true);
            this.f5909b.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class", BuildConfig.APPLICATION_ID));
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onSuccess(DTBAdResponse dTBAdResponse) {
            Log.i(APSAdMobCustomBannerEvent.f5903e, " Load the smart ad successfully in APSAdMobCustomBannerEvent class");
            this.f5908a.addResponse(dTBAdResponse);
            APSAdMobCustomBannerEvent.this.d(this.f5910c, this.f5909b, this.f5911d, this.f5912e, dTBAdResponse.getRenderingBundle(true), this.f5913f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DTBAdCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DTBCacheData f5915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CustomEventBannerListener f5916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f5917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AdSize f5918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f5919e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f5920f;

        b(DTBCacheData dTBCacheData, CustomEventBannerListener customEventBannerListener, Context context, AdSize adSize, String str, String str2) {
            this.f5915a = dTBCacheData;
            this.f5916b = customEventBannerListener;
            this.f5917c = context;
            this.f5918d = adSize;
            this.f5919e = str;
            this.f5920f = str2;
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onFailure(AdError adError) {
            String str = APSAdMobCustomBannerEvent.f5903e;
            Log.e(str, "Failed to load the ad in APSAdMobCustomBannerEvent class; " + adError.getMessage());
            this.f5915a.setBidRequestFailed(true);
            this.f5916b.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class", BuildConfig.APPLICATION_ID));
        }

        @Override // com.amazon.device.ads.DTBAdCallback
        public void onSuccess(DTBAdResponse dTBAdResponse) {
            Log.i(APSAdMobCustomBannerEvent.f5903e, " Load the ad successfully in APSAdMobCustomBannerEvent class");
            this.f5915a.addResponse(dTBAdResponse);
            APSAdMobCustomBannerEvent.this.d(this.f5917c, this.f5916b, this.f5918d, this.f5919e, dTBAdResponse.getRenderingBundle(false), this.f5920f);
        }
    }

    private void c(Context context, CustomEventBannerListener customEventBannerListener, AdSize adSize, Bundle bundle, String str) {
        String string = bundle.getString(DtbConstants.ADMOB_SLOTGROUP_KEY);
        String string2 = bundle.getString(DtbConstants.ADMOB_SLOTUUID_KEY);
        int i10 = bundle.getInt(DtbConstants.ADMOB_WIDTH_KEY);
        int i11 = bundle.getInt(DtbConstants.ADMOB_HEIGHT_KEY);
        String string3 = bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY);
        if (DtbCommonUtils.isNullOrEmpty(bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY))) {
            Log.e(f5903e, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class because no request id found");
            customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class because no request id found", BuildConfig.APPLICATION_ID));
        } else if (!DtbCommonUtils.isNullOrEmpty(string)) {
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            dTBAdRequest.setSlotGroup(string);
            DTBCacheData dTBCacheData = new DTBCacheData(string3, dTBAdRequest);
            AdRegistration.addAdMobCache(string3, dTBCacheData);
            try {
                dTBAdRequest.loadSmartBanner(new a(dTBCacheData, customEventBannerListener, context, adSize, str, string3));
            } catch (DTBLoadException e10) {
                Log.e(f5903e, "Fail to execute loadBannerAd method for rendering smart banner ad in APSAdMobCustomBannerEvent class", e10);
                customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class", BuildConfig.APPLICATION_ID));
            }
        } else if (!DtbCommonUtils.isNullOrEmpty(string2) && i10 > 0 && i11 > 0) {
            DTBAdRequest dTBAdRequest2 = new DTBAdRequest();
            dTBAdRequest2.setSizes(new DTBAdSize(i10, i11, string2));
            DTBCacheData dTBCacheData2 = new DTBCacheData(string3, dTBAdRequest2);
            AdRegistration.addAdMobCache(string3, dTBCacheData2);
            dTBAdRequest2.loadAd(new b(dTBCacheData2, customEventBannerListener, context, adSize, str, string3));
        } else {
            Log.e(f5903e, "Fail to execute loadBannerAd method because not have sufficient info in APSAdMobCustomBannerEvent class");
            customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class", BuildConfig.APPLICATION_ID));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CustomEventBannerListener customEventBannerListener, AdSize adSize, String str, Bundle bundle, String str2) {
        if (DTBAdUtil.validateSinglePriceAdMobCustomEvent(str, bundle)) {
            this.f5904a = customEventBannerListener;
            this.f5905b = adSize;
            new DTBAdView(context, this).fetchAd(bundle);
            AdRegistration.removeAdMobCache(str2);
            return;
        }
        customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerEvent class", BuildConfig.APPLICATION_ID));
    }

    @Override // com.amazon.device.ads.DTBExpectedSizeProvider
    public int getExpectedHeight() {
        return this.f5907d;
    }

    @Override // com.amazon.device.ads.DTBExpectedSizeProvider
    public int getExpectedWidth() {
        return this.f5906c;
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClicked(View view) {
        AdListener adListener;
        try {
            View findAncestorOfType = DTBAdUtil.findAncestorOfType(view, AdView.class);
            if (findAncestorOfType == null || (adListener = ((AdView) findAncestorOfType).getAdListener()) == null) {
                return;
            }
            adListener.onAdClicked();
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute onAdClicked method during runtime", e10);
            l2.a.i(m2.b.ERROR, c.EXCEPTION, "Fail to execute onAdClicked method during runtime in APSAdMobCustomBannerEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdClosed(View view) {
        AdListener adListener;
        try {
            View findAncestorOfType = DTBAdUtil.findAncestorOfType(view, AdView.class);
            if (findAncestorOfType == null || (adListener = ((AdView) findAncestorOfType).getAdListener()) == null) {
                return;
            }
            adListener.onAdClosed();
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute onAdClosed method during runtime", e10);
            l2.a.i(m2.b.ERROR, c.EXCEPTION, "Fail to execute onAdClosed method during runtime in APSAdMobCustomBannerEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdFailed(View view) {
        try {
            CustomEventBannerListener customEventBannerListener = this.f5904a;
            if (customEventBannerListener != null) {
                customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Custom banner ad failed to load", BuildConfig.APPLICATION_ID));
            }
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute onAdFailed method during runtime", e10);
            l2.a.i(m2.b.ERROR, c.EXCEPTION, "Fail to execute onAdFailed method during runtime in APSAdMobCustomBannerEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    @Deprecated
    public void onAdLeftApplication(View view) {
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdLoaded(View view) {
        try {
            ViewGroup adViewWrapper = DTBAdUtil.getAdViewWrapper(view, this.f5905b.getWidth(), this.f5905b.getHeight(), this.f5906c, this.f5907d);
            CustomEventBannerListener customEventBannerListener = this.f5904a;
            if (customEventBannerListener != null) {
                customEventBannerListener.onAdLoaded(adViewWrapper);
            }
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute onAdLoaded method during runtime", e10);
            l2.a.i(m2.b.ERROR, c.EXCEPTION, "Fail to execute requestBannerAd method during runtime in APSAdMobCustomBannerEvent class", e10);
        }
    }

    @Override // com.amazon.device.ads.DTBAdListener
    public void onAdOpen(View view) {
        AdListener adListener;
        try {
            View findAncestorOfType = DTBAdUtil.findAncestorOfType(view, AdView.class);
            if (findAncestorOfType == null || (adListener = ((AdView) findAncestorOfType).getAdListener()) == null) {
                return;
            }
            adListener.onAdOpened();
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute onAdOpen method during runtime", e10);
            l2.a.i(m2.b.ERROR, c.EXCEPTION, "Fail to execute onAdOpen method during runtime in APSAdMobCustomBannerEvent class", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEvent
    public void onDestroy() {
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

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBanner
    public void requestBannerAd(Context context, CustomEventBannerListener customEventBannerListener, String str, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle) {
        try {
            if (bundle.containsKey(DtbConstants.APS_ADAPTER_VERSION) && bundle.getString(DtbConstants.APS_ADAPTER_VERSION, BuildConfig.VERSION_NAME).equals(DtbConstants.APS_ADAPTER_VERSION_2)) {
                String string = bundle.getString(DtbConstants.ADMOB_REQUEST_ID_KEY);
                DTBCacheData adMobCache = AdRegistration.getAdMobCache(string);
                if (adMobCache != null) {
                    if (adMobCache.isBidRequestFailed()) {
                        Log.e(f5903e, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerSingleEvent class because previous bid requests failure");
                        customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd in APSAdMobCustomBannerSingleEvent class because previous bid requests failure", BuildConfig.APPLICATION_ID));
                        return;
                    }
                    DTBAdResponse adResponse = adMobCache.getAdResponse();
                    if (adResponse != null) {
                        d(context, customEventBannerListener, adSize, str, adResponse.getRenderingBundle(!DtbCommonUtils.isNullOrEmpty(bundle.getString(DtbConstants.ADMOB_SLOTGROUP_KEY))), string);
                        return;
                    }
                }
                c(context, customEventBannerListener, adSize, bundle, str);
                return;
            }
            Bundle bidFromFetchManager = DTBAdUtil.getBidFromFetchManager(bundle);
            if (DTBAdUtil.validateAdMobCustomEvent(str, bidFromFetchManager)) {
                this.f5904a = customEventBannerListener;
                this.f5905b = adSize;
                new DTBAdView(context, this).fetchAd(bidFromFetchManager);
                return;
            }
            customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd", BuildConfig.APPLICATION_ID));
        } catch (RuntimeException e10) {
            Log.e(f5903e, "Fail to execute requestBannerAd method during runtime in APSAdMobCustomBannerEvent class", e10);
            l2.a.i(m2.b.FATAL, c.EXCEPTION, "Fail to execute requestBannerAd method during runtime in APSAdMobCustomBannerEvent class", e10);
            customEventBannerListener.onAdFailedToLoad(new com.google.android.gms.ads.AdError(3, "Fail to load custom banner ad in requestBannerAd", BuildConfig.APPLICATION_ID));
        }
    }

    @Override // com.amazon.device.ads.DTBExpectedSizeProvider
    public void setExpectedHeight(int i10) {
        this.f5907d = i10;
    }

    @Override // com.amazon.device.ads.DTBExpectedSizeProvider
    public void setExpectedWidth(int i10) {
        this.f5906c = i10;
    }
}
