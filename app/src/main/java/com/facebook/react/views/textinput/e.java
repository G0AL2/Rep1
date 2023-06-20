package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactTextChangedEvent.java */
/* loaded from: classes.dex */
public class e extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: a  reason: collision with root package name */
    private String f16356a;

    /* renamed from: b  reason: collision with root package name */
    private int f16357b;

    public e(int i10, int i11, String str, int i12) {
        super(i10, i11);
        this.f16356a = str;
        this.f16357b = i12;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f16356a);
        createMap.putInt("eventCount", this.f16357b);
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}
