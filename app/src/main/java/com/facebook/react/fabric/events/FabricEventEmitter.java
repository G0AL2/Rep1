package com.facebook.react.fabric.events;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.j;
import com.facebook.react.uimanager.events.m;
import com.facebook.systrace.a;

/* loaded from: classes.dex */
public class FabricEventEmitter implements RCTModernEventEmitter {
    private static final String TAG = "FabricEventEmitter";
    private final FabricUIManager mUIManager;

    public FabricEventEmitter(FabricUIManager fabricUIManager) {
        this.mUIManager = fabricUIManager;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i10, String str, WritableMap writableMap) {
        receiveEvent(-1, i10, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new IllegalStateException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, String str, WritableMap writableMap) {
        receiveEvent(i10, i11, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(j jVar) {
        m.c(this, jVar);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap, int i13) {
        a.c(0L, "FabricEventEmitter.receiveEvent('" + str + "')");
        this.mUIManager.receiveEvent(i10, i11, str, z10, i12, writableMap, i13);
        a.g(0L);
    }
}
