package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* compiled from: FrameBasedAnimationDriver.java */
/* loaded from: classes.dex */
class h extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f15257e;

    /* renamed from: f  reason: collision with root package name */
    private double[] f15258f;

    /* renamed from: g  reason: collision with root package name */
    private double f15259g;

    /* renamed from: h  reason: collision with root package name */
    private double f15260h;

    /* renamed from: i  reason: collision with root package name */
    private int f15261i;

    /* renamed from: j  reason: collision with root package name */
    private int f15262j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f15258f;
        if (dArr == null || dArr.length != size) {
            this.f15258f = new double[size];
        }
        for (int i10 = 0; i10 < size; i10++) {
            this.f15258f[i10] = array.getDouble(i10);
        }
        if (readableMap.hasKey("toValue")) {
            this.f15259g = readableMap.getType("toValue") == ReadableType.Number ? readableMap.getDouble("toValue") : 0.0d;
        } else {
            this.f15259g = 0.0d;
        }
        if (readableMap.hasKey("iterations")) {
            this.f15261i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.f15261i = 1;
        }
        this.f15262j = 1;
        this.f15239a = this.f15261i == 0;
        this.f15257e = -1L;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j10) {
        double d10;
        if (this.f15257e < 0) {
            this.f15257e = j10;
            if (this.f15262j == 1) {
                this.f15260h = this.f15240b.f15333f;
            }
        }
        int round = (int) Math.round(((j10 - this.f15257e) / 1000000) / 16.666666666666668d);
        if (round >= 0) {
            if (this.f15239a) {
                return;
            }
            double[] dArr = this.f15258f;
            if (round >= dArr.length - 1) {
                d10 = this.f15259g;
                int i10 = this.f15261i;
                if (i10 != -1 && this.f15262j >= i10) {
                    this.f15239a = true;
                } else {
                    this.f15257e = -1L;
                    this.f15262j++;
                }
            } else {
                double d11 = this.f15260h;
                d10 = d11 + (dArr[round] * (this.f15259g - d11));
            }
            this.f15240b.f15333f = d10;
            return;
        }
        throw new IllegalStateException("Calculated frame index should never be lower than 0");
    }
}
