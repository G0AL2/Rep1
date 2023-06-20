package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;

@o6.a(name = AccessibilityInfoModule.NAME)
/* loaded from: classes.dex */
public class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
    private static final String ACCESSIBILITY_SERVICE_EVENT_NAME = "accessibilityServiceDidChange";
    public static final String NAME = "AccessibilityInfo";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final ContentObserver animationScaleObserver;
    private AccessibilityManager mAccessibilityManager;
    private b mAccessibilityServiceChangeListener;
    private boolean mAccessibilityServiceEnabled;
    private final ContentResolver mContentResolver;
    private int mRecommendedTimeout;
    private boolean mReduceMotionEnabled;
    private boolean mTouchExplorationEnabled;
    private c mTouchExplorationStateChangeListener;

    /* loaded from: classes.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
            }
        }
    }

    @TargetApi(21)
    /* loaded from: classes.dex */
    private class b implements AccessibilityManager.AccessibilityStateChangeListener {
        private b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendAccessibilityServiceChangeEvent(z10);
        }

        /* synthetic */ b(AccessibilityInfoModule accessibilityInfoModule, a aVar) {
            this();
        }
    }

    @TargetApi(21)
    /* loaded from: classes.dex */
    private class c implements AccessibilityManager.TouchExplorationStateChangeListener {
        private c() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z10);
        }

        /* synthetic */ c(AccessibilityInfoModule accessibilityInfoModule, a aVar) {
            this();
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.animationScaleObserver = new a(new Handler(Looper.getMainLooper()));
        this.mReduceMotionEnabled = false;
        this.mTouchExplorationEnabled = false;
        this.mAccessibilityServiceEnabled = false;
        this.mAccessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        this.mContentResolver = getReactApplicationContext().getContentResolver();
        this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        this.mAccessibilityServiceEnabled = this.mAccessibilityManager.isEnabled();
        this.mReduceMotionEnabled = getIsReduceMotionEnabledValue();
        this.mTouchExplorationStateChangeListener = new c(this, null);
        this.mAccessibilityServiceChangeListener = new b(this, null);
    }

    @TargetApi(21)
    private boolean getIsReduceMotionEnabledValue() {
        String string = Settings.Global.getString(this.mContentResolver, "transition_animation_scale");
        return string != null && string.equals("0.0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendAccessibilityServiceChangeEvent(boolean z10) {
        if (this.mAccessibilityServiceEnabled != z10) {
            this.mAccessibilityServiceEnabled = z10;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ACCESSIBILITY_SERVICE_EVENT_NAME, Boolean.valueOf(this.mAccessibilityServiceEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = getIsReduceMotionEnabledValue();
        if (this.mReduceMotionEnabled != isReduceMotionEnabledValue) {
            this.mReduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.mReduceMotionEnabled));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendTouchExplorationChangeEvent(boolean z10) {
        if (this.mTouchExplorationEnabled != z10) {
            this.mTouchExplorationEnabled = z10;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.mTouchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void announceForAccessibility(String str) {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        obtain.setClassName(AccessibilityInfoModule.class.getName());
        obtain.setPackageName(getReactApplicationContext().getPackageName());
        this.mAccessibilityManager.sendAccessibilityEvent(obtain);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void getRecommendedTimeoutMillis(double d10, Callback callback) {
        if (Build.VERSION.SDK_INT < 29) {
            callback.invoke(Integer.valueOf((int) d10));
            return;
        }
        int recommendedTimeoutMillis = this.mAccessibilityManager.getRecommendedTimeoutMillis((int) d10, 4);
        this.mRecommendedTimeout = recommendedTimeoutMillis;
        callback.invoke(Integer.valueOf(recommendedTimeoutMillis));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendAccessibilityServiceChangeEvent(this.mAccessibilityManager.isEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isAccessibilityServiceEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mAccessibilityServiceEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isReduceMotionEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mReduceMotionEnabled));
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mTouchExplorationEnabled));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostPause() {
        this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        this.mAccessibilityManager.removeAccessibilityStateChangeListener(this.mAccessibilityServiceChangeListener);
        this.mContentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @TargetApi(21)
    public void onHostResume() {
        this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        this.mAccessibilityManager.addAccessibilityStateChangeListener(this.mAccessibilityServiceChangeListener);
        this.mContentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendAccessibilityServiceChangeEvent(this.mAccessibilityManager.isEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.fbreact.specs.NativeAccessibilityInfoSpec
    public void setAccessibilityFocus(double d10) {
    }
}
