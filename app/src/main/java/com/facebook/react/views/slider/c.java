package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSlidingCompleteEvent.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final double f16177a;

    public c(int i10, int i11, double d10) {
        super(i10, i11);
        this.f16177a = d10;
    }

    public double a() {
        return this.f16177a;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topSlidingComplete";
    }
}
