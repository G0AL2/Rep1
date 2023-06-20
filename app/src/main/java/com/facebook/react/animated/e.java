package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* compiled from: DecayAnimation.java */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: e  reason: collision with root package name */
    private final double f15243e;

    /* renamed from: f  reason: collision with root package name */
    private double f15244f;

    /* renamed from: g  reason: collision with root package name */
    private long f15245g;

    /* renamed from: h  reason: collision with root package name */
    private double f15246h;

    /* renamed from: i  reason: collision with root package name */
    private double f15247i;

    /* renamed from: j  reason: collision with root package name */
    private int f15248j;

    /* renamed from: k  reason: collision with root package name */
    private int f15249k;

    public e(ReadableMap readableMap) {
        this.f15243e = readableMap.getDouble("velocity");
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f15244f = readableMap.getDouble("deceleration");
        int i10 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f15248j = i10;
        this.f15249k = 1;
        this.f15239a = i10 == 0;
        this.f15245g = -1L;
        this.f15246h = 0.0d;
        this.f15247i = 0.0d;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j10) {
        long j11 = j10 / 1000000;
        if (this.f15245g == -1) {
            this.f15245g = j11 - 16;
            double d10 = this.f15246h;
            if (d10 == this.f15247i) {
                this.f15246h = this.f15240b.f15333f;
            } else {
                this.f15240b.f15333f = d10;
            }
            this.f15247i = this.f15240b.f15333f;
        }
        double d11 = this.f15246h;
        double d12 = this.f15243e;
        double d13 = this.f15244f;
        double exp = d11 + ((d12 / (1.0d - d13)) * (1.0d - Math.exp((-(1.0d - d13)) * (j11 - this.f15245g))));
        if (Math.abs(this.f15247i - exp) < 0.1d) {
            int i10 = this.f15248j;
            if (i10 != -1 && this.f15249k >= i10) {
                this.f15239a = true;
                return;
            } else {
                this.f15245g = -1L;
                this.f15249k++;
            }
        }
        this.f15247i = exp;
        this.f15240b.f15333f = exp;
    }
}
