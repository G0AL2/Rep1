package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: OnLayoutEvent.java */
/* loaded from: classes.dex */
public class q extends com.facebook.react.uimanager.events.c<q> {

    /* renamed from: e  reason: collision with root package name */
    private static final h0.f<q> f15922e = new h0.f<>(20);

    /* renamed from: a  reason: collision with root package name */
    private int f15923a;

    /* renamed from: b  reason: collision with root package name */
    private int f15924b;

    /* renamed from: c  reason: collision with root package name */
    private int f15925c;

    /* renamed from: d  reason: collision with root package name */
    private int f15926d;

    private q() {
    }

    public static q b(int i10, int i11, int i12, int i13, int i14, int i15) {
        q b10 = f15922e.b();
        if (b10 == null) {
            b10 = new q();
        }
        b10.a(i10, i11, i12, i13, i14, i15);
        return b10;
    }

    protected void a(int i10, int i11, int i12, int i13, int i14, int i15) {
        super.init(i10, i11);
        this.f15923a = i12;
        this.f15924b = i13;
        this.f15925c = i14;
        this.f15926d = i15;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", r.a(this.f15923a));
        createMap.putDouble("y", r.a(this.f15924b));
        createMap.putDouble("width", r.a(this.f15925c));
        createMap.putDouble("height", r.a(this.f15926d));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt(Analytics.Param.TARGET, getViewTag());
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        f15922e.a(this);
    }
}
