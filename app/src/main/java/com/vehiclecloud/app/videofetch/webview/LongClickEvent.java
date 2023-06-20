package com.vehiclecloud.app.videofetch.webview;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes3.dex */
public class LongClickEvent extends com.facebook.react.uimanager.events.c<VideoSourceEvent> {
    static final String EVENT_NAME = "onLongClick";
    private final WritableMap mParams;

    public LongClickEvent(int i10, WritableMap writableMap) {
        super(i10);
        this.mParams = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        init(getViewTag());
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.mParams);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return EVENT_NAME;
    }
}
