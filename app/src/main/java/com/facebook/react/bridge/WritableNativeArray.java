package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import g6.a;

@a
/* loaded from: classes.dex */
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeArray() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void pushNativeArray(ReadableNativeArray readableNativeArray);

    private native void pushNativeMap(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray readableArray) {
        f6.a.b(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        pushNativeArray((ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushBoolean(boolean z10);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushDouble(double d10);

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushInt(int i10);

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap readableMap) {
        f6.a.b(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        pushNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushNull();

    @Override // com.facebook.react.bridge.WritableArray
    public native void pushString(String str);
}
