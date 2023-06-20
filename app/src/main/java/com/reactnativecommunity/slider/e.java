package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactSlidingStartEvent.java */
/* loaded from: classes3.dex */
public class e extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: a  reason: collision with root package name */
    private final double f28337a;

    public e(int i10, double d10) {
        super(i10);
        this.f28337a = d10;
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, a());
        return createMap;
    }

    public double a() {
        return this.f28337a;
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
        return "topSlidingStart";
    }
}
