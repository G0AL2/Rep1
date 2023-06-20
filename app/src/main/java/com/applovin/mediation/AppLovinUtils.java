package com.applovin.mediation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";

    /* loaded from: classes.dex */
    public static class ServerParameterKeys {
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    public static AppLovinAdSize appLovinAdSizeFromAdMobAdSize(Context context, AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        AdSize adSize2 = AdSize.BANNER;
        arrayList.add(adSize2);
        AdSize adSize3 = AdSize.LEADERBOARD;
        arrayList.add(adSize3);
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSize2.equals(findClosestSize)) {
            return AppLovinAdSize.BANNER;
        }
        if (adSize3.equals(findClosestSize)) {
            return AppLovinAdSize.LEADER;
        }
        return null;
    }

    public static AdError getAdError(int i10) {
        String str = "AppLovin error code " + i10;
        if (i10 == -8) {
            str = "INVALID_AD_TOKEN";
        } else if (i10 == -7) {
            str = "INVALID_ZONE";
        } else if (i10 != -6) {
            switch (i10) {
                case -1009:
                    str = "NO_NETWORK";
                    break;
                case -1001:
                    str = "FETCH_AD_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INVALID_URL /* -900 */:
                    str = "INVALID_URL";
                    break;
                case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    str = "INVALID_RESPONSE";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    str = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    str = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    str = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                    str = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    str = "SDK_DISABLED";
                    break;
                case -1:
                    str = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    str = "NO_FILL";
                    break;
                default:
                    switch (i10) {
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            str = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            str = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                            str = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
            }
        } else {
            str = "UNABLE_TO_RENDER_AD";
        }
        return new AdError(i10, "AppLovin SDK returned a load failure callback with reason: " + str, AppLovinMediationAdapter.ERROR_DOMAIN);
    }

    private static Bundle retrieveMetadata(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static AppLovinSdk retrieveSdk(Bundle bundle, Context context) {
        AppLovinSdk appLovinSdk;
        String string = bundle != null ? bundle.getString(ServerParameterKeys.SDK_KEY) : null;
        AppLovinSdkSettings sdkSettings = AppLovinMediationAdapter.getSdkSettings(context);
        if (!TextUtils.isEmpty(string)) {
            appLovinSdk = AppLovinSdk.getInstance(string, sdkSettings, context);
        } else {
            appLovinSdk = AppLovinSdk.getInstance(sdkSettings, context);
        }
        appLovinSdk.setPluginVersion(BuildConfig.ADAPTER_VERSION);
        appLovinSdk.setMediationProvider("admob");
        return appLovinSdk;
    }

    public static String retrieveSdkKey(Context context, Bundle bundle) {
        Bundle retrieveMetadata;
        String string = bundle != null ? bundle.getString(ServerParameterKeys.SDK_KEY) : null;
        return (!TextUtils.isEmpty(string) || (retrieveMetadata = retrieveMetadata(context)) == null) ? string : retrieveMetadata.getString("applovin.sdk.key");
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey(ServerParameterKeys.ZONE_ID) ? bundle.getString(ServerParameterKeys.ZONE_ID) : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean("mute_audio");
    }
}
