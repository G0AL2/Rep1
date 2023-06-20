package com.facebook.react.config;

/* loaded from: classes.dex */
public class ReactFeatureFlags {
    public static boolean enableAggressiveEventEmitterCleanup = false;
    public static boolean enableEagerRootViewAttachment = false;
    public static boolean enableExperimentalStaticViewConfigs = false;
    public static boolean enableFabricLogs = false;
    public static volatile boolean enableFabricRenderer = false;
    public static boolean enableLockFreeEventDispatcher = false;
    public static boolean enableRoundedCornerPostprocessing = false;
    public static boolean enableRuntimeScheduler = false;
    public static boolean enableRuntimeSchedulerInTurboModule = false;
    public static volatile boolean enableTurboModulePromiseAsyncDispatch = false;
    public static boolean insertZReorderBarriersOnViewGroupChildren = true;
    private static boolean mapBufferSerializationEnabled = false;
    public static boolean useGlobalCallbackCleanupScopeUsingRetainJSCallback = false;
    private static boolean useOverflowInset = false;
    public static boolean useTurboModuleManagerCallbackCleanupScope = false;
    public static volatile boolean useTurboModules = false;
    public static volatile boolean warnOnLegacyNativeModuleSystemUse = false;

    public static boolean doesUseOverflowInset() {
        return useOverflowInset;
    }

    public static boolean isMapBufferSerializationEnabled() {
        return mapBufferSerializationEnabled;
    }

    public static void setMapBufferSerializationEnabled(boolean z10) {
        mapBufferSerializationEnabled = z10;
    }

    public static void setUseOverflowInset(boolean z10) {
        useOverflowInset = z10;
    }
}
