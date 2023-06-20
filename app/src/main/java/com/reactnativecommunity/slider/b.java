package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSliderEvent.java */
/* loaded from: classes3.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final double f28334a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28335b;

    public b(int i10, double d10, boolean z10) {
        super(i10);
        this.f28334a = d10;
        this.f28335b = z10;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        createMap.putBoolean("fromUser", b());
        return createMap;
    }

    public double a() {
        return this.f28334a;
    }

    public boolean b() {
        return this.f28335b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}
