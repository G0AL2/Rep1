package com.facebook.react.views.view;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: ViewGroupClickEvent.java */
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {
    public h(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topClick";
    }
}
