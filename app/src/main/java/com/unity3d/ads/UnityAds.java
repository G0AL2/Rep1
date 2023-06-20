package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.UnityAdsImplementation;

/* loaded from: classes3.dex */
public final class UnityAds {

    /* loaded from: classes3.dex */
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* loaded from: classes3.dex */
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR
    }

    public static boolean getDebugMode() {
        return UnityAdsImplementation.getDebugMode();
    }

    public static String getToken() {
        return UnityAdsImplementation.getToken();
    }

    public static String getVersion() {
        return UnityAdsImplementation.getVersion();
    }

    public static void initialize(Context context, String str) {
        UnityAdsImplementation.initialize(context, str, false, null);
    }

    public static boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    public static boolean isSupported() {
        return UnityAdsImplementation.isSupported();
    }

    @Deprecated
    public static void load(String str) {
        load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds.1
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str2) {
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str2, UnityAdsLoadError unityAdsLoadError, String str3) {
            }
        });
    }

    public static void setDebugMode(boolean z10) {
        UnityAdsImplementation.setDebugMode(z10);
    }

    @Deprecated
    public static void show(Activity activity, String str) {
        UnityAdsImplementation.show(activity, str, null);
    }

    public static void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getToken(iUnityAdsTokenListener);
    }

    public static void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.show(activity, str, iUnityAdsShowListener);
    }

    public static void initialize(Context context, String str, boolean z10) {
        UnityAdsImplementation.initialize(context, str, z10, null);
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    @Deprecated
    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.show(activity, str, unityAdsShowOptions, null);
    }

    public static void initialize(Context context, String str, boolean z10, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.initialize(context, str, z10, iUnityAdsInitializationListener);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
