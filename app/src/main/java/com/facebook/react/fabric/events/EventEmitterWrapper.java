package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.b;
import g6.a;

@SuppressLint({"MissingNativeLoadLibrary"})
/* loaded from: classes.dex */
public class EventEmitterWrapper {
    @a
    private final HybridData mHybridData = initHybrid();

    static {
        b.a();
    }

    private EventEmitterWrapper() {
    }

    private boolean d() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            return hybridData.isValid();
        }
        return false;
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap, int i10);

    private native void invokeUniqueEvent(String str, NativeMap nativeMap, int i10);

    public synchronized void a() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
    }

    public synchronized void b(String str, WritableMap writableMap, int i10) {
        if (d()) {
            invokeEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap, i10);
        }
    }

    public synchronized void c(String str, WritableMap writableMap, int i10) {
        if (d()) {
            invokeUniqueEvent(str, writableMap == null ? new WritableNativeMap() : (NativeMap) writableMap, i10);
        }
    }
}
