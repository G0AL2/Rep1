package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;

@SuppressLint({"MissingNativeLoadLibrary"})
@g6.a
/* loaded from: classes.dex */
public class Binding {
    @g6.a
    private final HybridData mHybridData = initHybrid();

    static {
        b.a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, Object obj, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj2);

    private native void uninstallFabricUIManager();

    public void a() {
        uninstallFabricUIManager();
    }

    public native void driveCxxAnimations();

    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    public native void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    public native void renderTemplateToSurface(int i10, String str);

    public native void setConstraints(int i10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11);

    public native void setPixelDensity(float f10);

    public native void startSurface(int i10, String str, NativeMap nativeMap);

    public native void startSurfaceWithConstraints(int i10, String str, NativeMap nativeMap, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11);

    public native void stopSurface(int i10);

    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}
