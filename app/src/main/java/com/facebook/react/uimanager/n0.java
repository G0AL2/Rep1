package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* compiled from: ThemedReactContext.java */
/* loaded from: classes.dex */
public class n0 extends ReactContext {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f15906a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15907b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15908c;

    public n0(ReactApplicationContext reactApplicationContext, Context context, String str, int i10) {
        super(context);
        if (reactApplicationContext.hasCatalystInstance()) {
            initializeWithInstance(reactApplicationContext.getCatalystInstance());
        }
        this.f15906a = reactApplicationContext;
        this.f15907b = str;
        this.f15908c = i10;
    }

    public String a() {
        return this.f15907b;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f15906a.addLifecycleEventListener(lifecycleEventListener);
    }

    public ReactApplicationContext b() {
        return this.f15906a;
    }

    public int c() {
        return this.f15908c;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f15906a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (isBridgeless()) {
            return this.f15906a.getJSIModule(jSIModuleType);
        }
        return super.getJSIModule(jSIModuleType);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f15906a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f15906a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f15906a.removeLifecycleEventListener(lifecycleEventListener);
    }
}
