package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a  reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f9015a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f9015a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f9015a.logApiCall("destroy()");
        this.f9015a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f9015a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f9015a.getAdUnitId();
    }

    public String getPlacement() {
        this.f9015a.logApiCall("getPlacement()");
        return this.f9015a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f9015a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f9015a.render(maxNativeAdView, maxAd);
    }

    public void setCustomData(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f9015a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f9015a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f9015a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f9015a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f9015a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f9015a;
        maxNativeAdLoaderImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f9015a.setRevenueListener(maxAdRevenueListener);
    }
}
