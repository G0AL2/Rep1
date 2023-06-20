package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxInterstitialAdViewAdapter, MaxNativeAdAdapter, MaxRewardedAdViewAdapter {
    private static final ExecutorService sCachingExecutorService = Executors.newFixedThreadPool(4);
    private boolean alwaysRewardUser;
    private final v mLogger;
    private final m mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        m mVar = appLovinSdk.coreSdk;
        this.mSdk = mVar;
        this.mLogger = mVar.A();
        this.mTag = getClass().getSimpleName();
    }

    protected static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    protected void checkActivities(Context context, Class<?>... clsArr) {
    }

    protected void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0 || !v.a()) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: " + cls.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i10 = BundleUtils.getInt(AppLovinEventParameters.REVENUE_AMOUNT, 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        if (v.a()) {
            log("Creating reward: " + i10 + " " + string);
        }
        this.reward = MaxRewardImpl.create(i10, string);
    }

    protected Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(String str) {
        this.mLogger.b(this.mTag, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(String str) {
        this.mLogger.e(this.mTag, str);
    }

    protected void e(String str, Throwable th) {
        this.mLogger.b(this.mTag, str, th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Context getApplicationContext() {
        return this.mSdk.L();
    }

    protected ExecutorService getCachingExecutorService() {
        return sCachingExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null && v.a()) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    protected void i(String str) {
        this.mLogger.c(this.mTag, str);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (v.a()) {
            d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        }
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void log(String str) {
        if (v.a()) {
            this.mLogger.c(this.mTag, str);
        }
    }

    protected void log(String str, Throwable th) {
        if (v.a()) {
            this.mLogger.b(this.mTag, str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (v.a()) {
            d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        }
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (v.a()) {
            d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        }
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    protected void userError(String str) {
        userError(str, null);
    }

    protected void userError(String str, Throwable th) {
        if (v.a()) {
            v.c(this.mTag, str, th);
        }
    }

    protected void w(String str) {
        this.mLogger.d(this.mTag, str);
    }
}
