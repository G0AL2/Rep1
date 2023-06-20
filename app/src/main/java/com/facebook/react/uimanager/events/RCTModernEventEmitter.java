package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i10, int i11, String str, WritableMap writableMap);

    void receiveEvent(int i10, int i11, String str, boolean z10, int i12, WritableMap writableMap, int i13);

    void receiveTouches(j jVar);
}
