package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: DiffClampAnimatedNode.java */
/* loaded from: classes.dex */
class f extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f15250i;

    /* renamed from: j  reason: collision with root package name */
    private final int f15251j;

    /* renamed from: k  reason: collision with root package name */
    private final double f15252k;

    /* renamed from: l  reason: collision with root package name */
    private final double f15253l;

    /* renamed from: m  reason: collision with root package name */
    private double f15254m = 0.0d;

    public f(ReadableMap readableMap, l lVar) {
        this.f15250i = lVar;
        this.f15251j = readableMap.getInt("input");
        this.f15252k = readableMap.getDouble("min");
        this.f15253l = readableMap.getDouble("max");
        this.f15333f = 0.0d;
    }

    private double n() {
        b o10 = this.f15250i.o(this.f15251j);
        if (o10 != null && (o10 instanceof s)) {
            return ((s) o10).k();
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "DiffClampAnimatedNode[" + this.f15238d + "]: InputNodeTag: " + this.f15251j + " min: " + this.f15252k + " max: " + this.f15253l + " lastValue: " + this.f15254m + " super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        double n10 = n();
        double d10 = n10 - this.f15254m;
        this.f15254m = n10;
        this.f15333f = Math.min(Math.max(this.f15333f + d10, this.f15252k), this.f15253l);
    }
}
