package com.bytedance.sdk.openadsdk;

import android.content.Context;

/* loaded from: classes.dex */
public interface TTAdManager {
    TTAdNative createAdNative(Context context);

    TTAdManager debugLog(int i10);

    String getBiddingToken();

    String getBiddingToken(String str);

    @Deprecated
    int getCcpa();

    @Deprecated
    int getCoppa();

    int getDebugLog();

    @Deprecated
    int getGdpr();

    String getSDKVersion();

    String getSupportRegion();

    boolean isExpressAd(String str, String str2);

    boolean isFullScreenVideoAd(String str, String str2);

    @Deprecated
    TTAdManager isUseTextureView(boolean z10);

    boolean onlyVerityPlayable(String str, int i10, String str2, String str3, String str4);

    @Deprecated
    TTAdManager openDebugMode();

    @Deprecated
    void requestPermissionIfNecessary(Context context);

    @Deprecated
    TTAdManager setAllowShowNotifiFromSDK(boolean z10);

    @Deprecated
    TTAdManager setAppId(String str);

    @Deprecated
    TTAdManager setCcpa(int i10);

    @Deprecated
    TTAdManager setCoppa(int i10);

    @Deprecated
    TTAdManager setData(String str);

    @Deprecated
    TTAdManager setGdpr(int i10);

    TTAdManager setIconId(int i10);

    @Deprecated
    TTAdManager setKeywords(String str);

    @Deprecated
    TTAdManager setName(String str);

    @Deprecated
    TTAdManager setNeedClearTaskReset(String[] strArr);

    @Deprecated
    TTAdManager setPaid(boolean z10);

    @Deprecated
    TTAdManager setTitleBarTheme(int i10);

    void showPrivacyProtection();
}
