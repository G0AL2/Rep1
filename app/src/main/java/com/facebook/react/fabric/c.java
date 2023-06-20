package com.facebook.react.fabric;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* compiled from: GuardedFrameCallback.java */
/* loaded from: classes.dex */
public abstract class c extends a.AbstractC0209a {

    /* renamed from: b  reason: collision with root package name */
    private final NativeModuleCallExceptionHandler f15388b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public c(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0209a
    public final void a(long j10) {
        try {
            c(j10);
        } catch (RuntimeException e10) {
            this.f15388b.handleException(e10);
        }
    }

    protected abstract void c(long j10);

    protected c(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.f15388b = nativeModuleCallExceptionHandler;
    }
}
