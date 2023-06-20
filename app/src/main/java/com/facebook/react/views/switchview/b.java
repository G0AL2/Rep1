package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSwitchEvent.java */
/* loaded from: classes.dex */
class b extends c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16182a;

    public b(int i10, int i11, boolean z10) {
        super(i10, i11);
        this.f16182a = z10;
    }

    public boolean a() {
        return this.f16182a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}
