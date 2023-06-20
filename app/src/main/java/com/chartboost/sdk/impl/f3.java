package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    private long f14007a;

    /* renamed from: b  reason: collision with root package name */
    private int f14008b;

    /* renamed from: c  reason: collision with root package name */
    private int f14009c;

    /* renamed from: d  reason: collision with root package name */
    private long f14010d;

    /* renamed from: e  reason: collision with root package name */
    private long f14011e;

    /* renamed from: f  reason: collision with root package name */
    private long f14012f;

    /* renamed from: g  reason: collision with root package name */
    private int f14013g;

    public f3() {
        this(0L, 0, 0, 0L, 0L, 0L, 0, 127, null);
    }

    public f3(long j10, int i10, int i11, long j11, long j12, long j13, int i12) {
        this.f14007a = j10;
        this.f14008b = i10;
        this.f14009c = i11;
        this.f14010d = j11;
        this.f14011e = j12;
        this.f14012f = j13;
        this.f14013g = i12;
    }

    public final int a() {
        return this.f14013g;
    }

    public final long b() {
        return this.f14007a;
    }

    public final int c() {
        return this.f14008b;
    }

    public final int d() {
        return this.f14009c;
    }

    public final long e() {
        return this.f14010d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            return this.f14007a == f3Var.f14007a && this.f14008b == f3Var.f14008b && this.f14009c == f3Var.f14009c && this.f14010d == f3Var.f14010d && this.f14011e == f3Var.f14011e && this.f14012f == f3Var.f14012f && this.f14013g == f3Var.f14013g;
        }
        return false;
    }

    public final long f() {
        return this.f14011e;
    }

    public final long g() {
        return this.f14012f;
    }

    public int hashCode() {
        return (((((((((((o3.a(this.f14007a) * 31) + this.f14008b) * 31) + this.f14009c) * 31) + o3.a(this.f14010d)) * 31) + o3.a(this.f14011e)) * 31) + o3.a(this.f14012f)) * 31) + this.f14013g;
    }

    public String toString() {
        return "VideoPreCachingModel(maxBytes=" + this.f14007a + ", maxUnitsPerTimeWindow=" + this.f14008b + ", maxUnitsPerTimeWindowCellular=" + this.f14009c + ", timeWindow=" + this.f14010d + ", timeWindowCellular=" + this.f14011e + ", ttl=" + this.f14012f + ", bufferSize=" + this.f14013g + ')';
    }

    public final f3 a(JSONObject jSONObject) {
        qe.k.f(jSONObject, "config");
        f3 f3Var = new f3(0L, 0, 0, 0L, 0L, 0L, 0, 127, null);
        f3Var.f14007a = jSONObject.optLong("maxBytes", 52428800L);
        f3Var.f14008b = jSONObject.optInt("maxUnitsPerTimeWindow", 10);
        f3Var.f14009c = jSONObject.optInt("maxUnitsPerTimeWindowCellular", 10);
        f3Var.f14010d = jSONObject.optLong("timeWindow", 18000L);
        f3Var.f14011e = jSONObject.optLong("timeWindowCellular", 18000L);
        f3Var.f14012f = jSONObject.optLong("ttl", 604800L);
        f3Var.f14013g = jSONObject.optInt("bufferSize", 3);
        return f3Var;
    }

    public /* synthetic */ f3(long j10, int i10, int i11, long j11, long j12, long j13, int i12, int i13, qe.g gVar) {
        this((i13 & 1) != 0 ? 52428800L : j10, (i13 & 2) != 0 ? 10 : i10, (i13 & 4) == 0 ? i11 : 10, (i13 & 8) != 0 ? 18000L : j11, (i13 & 16) == 0 ? j12 : 18000L, (i13 & 32) != 0 ? 604800L : j13, (i13 & 64) != 0 ? 3 : i12);
    }
}
