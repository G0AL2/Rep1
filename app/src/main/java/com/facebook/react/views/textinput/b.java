package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactContentSizeChangedEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: a  reason: collision with root package name */
    private float f16326a;

    /* renamed from: b  reason: collision with root package name */
    private float f16327b;

    public b(int i10, int i11, float f10, float f11) {
        super(i10, i11);
        this.f16326a = f10;
        this.f16327b = f11;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.f16326a);
        createMap2.putDouble("height", this.f16327b);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topContentSizeChange";
    }
}
