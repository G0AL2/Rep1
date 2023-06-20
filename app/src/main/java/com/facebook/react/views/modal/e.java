package com.facebook.react.views.modal;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: RequestCloseEvent.java */
/* loaded from: classes.dex */
class e extends com.facebook.react.uimanager.events.c<e> {
    /* JADX INFO: Access modifiers changed from: protected */
    public e(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topRequestClose";
    }
}
