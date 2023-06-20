package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<Activity> f8994a = new WeakReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final MaxFullscreenAdImpl f8995b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        f8994a = new WeakReference<>(activity);
        this.f8995b = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f8995b.logApiCall("destroy()");
        this.f8995b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f8995b.logApiCall("getActivity()");
        return f8994a.get();
    }

    public String getAdUnitId() {
        return this.f8995b.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f8995b.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f8995b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f8995b.logApiCall("loadAd()");
        this.f8995b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8995b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f8995b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f8995b.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8995b.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8995b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(ViewGroup viewGroup, i iVar) {
        showAd(null, viewGroup, iVar);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar) {
        showAd(str, null, viewGroup, iVar);
    }

    public void showAd(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxInterstitialAd");
        this.f8995b.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8995b;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f8995b.showAd(str, str2, viewGroup, iVar, getActivity());
    }

    public String toString() {
        return "" + this.f8995b;
    }
}
