package com.applovin.adview;

import android.content.Context;
import com.applovin.impl.adview.o;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinInterstitialAd {
    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                return new o(appLovinSdk, context);
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public String toString() {
        return "AppLovinInterstitialAd{}";
    }
}
