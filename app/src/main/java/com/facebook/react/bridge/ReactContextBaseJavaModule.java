package com.facebook.react.bridge;

import android.app.Activity;
import f6.a;

/* loaded from: classes.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule() {
        this.mReactApplicationContext = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContext() {
        return (ReactApplicationContext) a.d(this.mReactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        ReactSoftExceptionLogger.logSoftException("ReactContextBaseJavaModule", new RuntimeException("Catalyst Instance has already disappeared: requested by " + getName()));
        return null;
    }

    public ReactContextBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
