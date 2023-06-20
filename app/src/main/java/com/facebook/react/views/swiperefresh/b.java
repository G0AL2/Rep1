package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.c;

/* compiled from: RefreshEvent.java */
/* loaded from: classes.dex */
public class b extends c<b> {
    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topRefresh";
    }
}
