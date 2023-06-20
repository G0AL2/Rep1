package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSliderEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final double f16175a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16176b;

    public b(int i10, double d10, boolean z10) {
        super(i10);
        this.f16175a = d10;
        this.f16176b = z10;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        createMap.putBoolean("fromUser", b());
        return createMap;
    }

    public double a() {
        return this.f16175a;
    }

    public boolean b() {
        return this.f16176b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}
