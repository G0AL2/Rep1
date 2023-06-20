package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactTextInputEndEditingEvent.java */
/* loaded from: classes.dex */
class g extends com.facebook.react.uimanager.events.c<g> {

    /* renamed from: a  reason: collision with root package name */
    private String f16358a;

    public g(int i10, int i11, String str) {
        super(i10, i11);
        this.f16358a = str;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putString("text", this.f16358a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topEndEditing";
    }
}
