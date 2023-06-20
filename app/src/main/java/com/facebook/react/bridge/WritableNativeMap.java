package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import g6.a;

@a
/* loaded from: classes.dex */
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(initHybrid());
    }

    private static native HybridData initHybrid();

    private native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap readableMap) {
        f6.a.b(readableMap instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String str, ReadableArray readableArray) {
        f6.a.b(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(str, (ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z10);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d10);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i10);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String str, ReadableMap readableMap) {
        f6.a.b(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(str, (ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);
}
