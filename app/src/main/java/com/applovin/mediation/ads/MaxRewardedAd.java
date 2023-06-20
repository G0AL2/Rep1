package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, MaxRewardedAd> f8996a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8997b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<Activity> f8998c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    private final MaxFullscreenAdImpl f8999d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f8999d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity != null) {
                if (appLovinSdk != null) {
                    updateActivity(activity);
                    synchronized (f8997b) {
                        Map<String, MaxRewardedAd> map = f8996a;
                        MaxRewardedAd maxRewardedAd = map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    }
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No activity specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public static void updateActivity(Activity activity) {
        a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            f8998c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f8999d.logApiCall("destroy()");
        synchronized (f8997b) {
            f8996a.remove(this.f8999d.getAdUnitId());
        }
        this.f8999d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f8999d.logApiCall("getActivity()");
        return f8998c.get();
    }

    public String getAdUnitId() {
        return this.f8999d.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f8999d.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f8999d.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f8999d.logApiCall("loadAd()");
        this.f8999d.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8999d.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f8999d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f8999d.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8999d.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8999d.setRevenueListener(maxAdRevenueListener);
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxRewardedAd");
        this.f8999d.showAd(str, str2, getActivity());
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8999d;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f8999d.showAd(str, str2, viewGroup, iVar, getActivity());
    }

    public String toString() {
        return "" + this.f8999d;
    }
}
