package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: ValueAnimatedNode.java */
/* loaded from: classes.dex */
class s extends b {

    /* renamed from: e  reason: collision with root package name */
    Object f15332e;

    /* renamed from: f  reason: collision with root package name */
    double f15333f;

    /* renamed from: g  reason: collision with root package name */
    double f15334g;

    /* renamed from: h  reason: collision with root package name */
    private c f15335h;

    public s() {
        this.f15332e = null;
        this.f15333f = Double.NaN;
        this.f15334g = 0.0d;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        return "ValueAnimatedNode[" + this.f15238d + "]: value: " + this.f15333f + " offset: " + this.f15334g;
    }

    public void h() {
        this.f15334g += this.f15333f;
        this.f15333f = 0.0d;
    }

    public void i() {
        this.f15333f += this.f15334g;
        this.f15334g = 0.0d;
    }

    public Object j() {
        return this.f15332e;
    }

    public double k() {
        if (Double.isNaN(this.f15334g + this.f15333f)) {
            g();
        }
        return this.f15334g + this.f15333f;
    }

    public void l() {
        c cVar = this.f15335h;
        if (cVar == null) {
            return;
        }
        cVar.a(k());
    }

    public void m(c cVar) {
        this.f15335h = cVar;
    }

    public s(ReadableMap readableMap) {
        this.f15332e = null;
        this.f15333f = Double.NaN;
        this.f15334g = 0.0d;
        this.f15333f = readableMap.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f15334g = readableMap.getDouble("offset");
    }
}
