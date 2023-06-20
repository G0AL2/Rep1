package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;

@o6.a(name = TimingModule.NAME)
/* loaded from: classes.dex */
public final class TimingModule extends NativeTimingSpec implements LifecycleEventListener, n6.c {
    public static final String NAME = "Timing";
    private final d mJavaTimerManager;

    /* loaded from: classes.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.facebook.react.modules.core.c
        public void callIdleCallbacks(double d10) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d10);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void callTimers(WritableArray writableArray) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void emitTimeDriftWarning(String str) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
            }
        }
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, k6.d dVar) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new d(reactApplicationContext, new a(), g.i(), dVar);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d10, double d11, double d12, boolean z10) {
        this.mJavaTimerManager.q((int) d10, (int) d11, d12, z10);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d10) {
        this.mJavaTimerManager.deleteTimer((int) d10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public boolean hasActiveTimersInRange(long j10) {
        return this.mJavaTimerManager.r(j10);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        n6.b.e(getReactApplicationContext()).c(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        n6.b.e(reactApplicationContext).h(this);
        this.mJavaTimerManager.A();
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    @Override // n6.c
    public void onHeadlessJsTaskFinish(int i10) {
        this.mJavaTimerManager.v(i10);
    }

    @Override // n6.c
    public void onHeadlessJsTaskStart(int i10) {
        this.mJavaTimerManager.w(i10);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mJavaTimerManager.x();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mJavaTimerManager.y();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mJavaTimerManager.z();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z10) {
        this.mJavaTimerManager.setSendIdleEvents(z10);
    }
}
