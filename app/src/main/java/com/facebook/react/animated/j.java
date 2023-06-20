package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: ModulusAnimatedNode.java */
/* loaded from: classes.dex */
class j extends s {

    /* renamed from: i  reason: collision with root package name */
    private final l f15275i;

    /* renamed from: j  reason: collision with root package name */
    private final int f15276j;

    /* renamed from: k  reason: collision with root package name */
    private final double f15277k;

    public j(ReadableMap readableMap, l lVar) {
        this.f15275i = lVar;
        this.f15276j = readableMap.getInt("input");
        this.f15277k = readableMap.getDouble("modulus");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "NativeAnimatedNodesManager[" + this.f15238d + "] inputNode: " + this.f15276j + " modulus: " + this.f15277k + " super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        b o10 = this.f15275i.o(this.f15276j);
        if (o10 != null && (o10 instanceof s)) {
            double k10 = ((s) o10).k();
            double d10 = this.f15277k;
            this.f15333f = ((k10 % d10) + d10) % d10;
            return;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
    }
}
