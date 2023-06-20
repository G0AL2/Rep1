package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.net.SocketTimeoutException;

/* compiled from: ResponseUtil.java */
/* loaded from: classes.dex */
public class n {
    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, WritableMap writableMap) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushMap(writableMap);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
        }
    }

    public static void b(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushString(str);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
        }
    }

    public static void c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, long j10, long j11) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushInt((int) j10);
        createArray.pushInt((int) j11);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", createArray);
        }
    }

    public static void d(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, long j10, long j11) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushInt((int) j10);
        createArray.pushInt((int) j11);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didSendNetworkData", createArray);
        }
    }

    public static void e(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, String str, long j10, long j11) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushString(str);
        createArray.pushInt((int) j10);
        createArray.pushInt((int) j11);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", createArray);
        }
    }

    public static void f(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, String str, Throwable th) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushString(str);
        if (th != null && th.getClass() == SocketTimeoutException.class) {
            createArray.pushBoolean(true);
        }
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
        }
    }

    public static void g(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushNull();
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
        }
    }

    public static void h(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, int i11, WritableMap writableMap, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        createArray.pushInt(i11);
        createArray.pushMap(writableMap);
        createArray.pushString(str);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", createArray);
        }
    }
}
