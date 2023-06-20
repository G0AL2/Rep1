package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;

/* loaded from: classes.dex */
public class SurfaceHandlerBinding implements d {
    @g6.a
    private final HybridData mHybridData;

    static {
        b.a();
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i10, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i10);

    private native void setLayoutConstraintsNative(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11, float f16);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i10);

    private native void startNative();

    private native void stopNative();

    @Override // com.facebook.react.fabric.d
    public int a() {
        return getSurfaceIdNative();
    }

    @Override // com.facebook.react.fabric.d
    public void b(int i10) {
        setSurfaceIdNative(i10);
    }

    @Override // com.facebook.react.fabric.d
    public void c(boolean z10) {
        setDisplayModeNative(!z10 ? 1 : 0);
    }

    @Override // com.facebook.react.fabric.d
    public String d() {
        return getModuleNameNative();
    }

    @Override // com.facebook.react.fabric.d
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // com.facebook.react.fabric.d
    public void start() {
        startNative();
    }

    @Override // com.facebook.react.fabric.d
    public void stop() {
        stopNative();
    }
}
