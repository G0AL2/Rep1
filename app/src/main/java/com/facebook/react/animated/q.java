package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: TrackingAnimatedNode.java */
/* loaded from: classes.dex */
class q extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f15322e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15323f;

    /* renamed from: g  reason: collision with root package name */
    private final int f15324g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15325h;

    /* renamed from: i  reason: collision with root package name */
    private final JavaOnlyMap f15326i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(ReadableMap readableMap, l lVar) {
        this.f15322e = lVar;
        this.f15323f = readableMap.getInt("animationId");
        this.f15324g = readableMap.getInt("toValue");
        this.f15325h = readableMap.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f15326i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        return "TrackingAnimatedNode[" + this.f15238d + "]: animationID: " + this.f15323f + " toValueNode: " + this.f15324g + " valueNode: " + this.f15325h + " animationConfig: " + this.f15326i;
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        this.f15326i.putDouble("toValue", ((s) this.f15322e.o(this.f15324g)).k());
        this.f15322e.y(this.f15323f, this.f15325h, this.f15326i, null);
    }
}
