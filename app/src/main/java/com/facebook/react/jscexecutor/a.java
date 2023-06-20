package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;

/* compiled from: JSCExecutorFactory.java */
/* loaded from: classes.dex */
public class a implements JavaScriptExecutorFactory {

    /* renamed from: a  reason: collision with root package name */
    private final String f15436a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15437b;

    public a(String str, String str2) {
        this.f15436a = str;
        this.f15437b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() throws Exception {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f15436a);
        writableNativeMap.putString("DeviceIdentity", this.f15437b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + toString());
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + toString());
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
