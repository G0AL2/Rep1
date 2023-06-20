package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSlidingCompleteEvent.java */
/* loaded from: classes3.dex */
public class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: a  reason: collision with root package name */
    private final double f28336a;

    public d(int i10, double d10) {
        super(i10);
        this.f28336a = d10;
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        return createMap;
    }

    public double a() {
        return this.f28336a;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), b());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topSlidingComplete";
    }
}
