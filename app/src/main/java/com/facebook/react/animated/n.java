package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
class n extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f15300e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15301f;

    /* renamed from: g  reason: collision with root package name */
    private double f15302g;

    /* renamed from: h  reason: collision with root package name */
    private double f15303h;

    /* renamed from: i  reason: collision with root package name */
    private double f15304i;

    /* renamed from: j  reason: collision with root package name */
    private double f15305j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15306k;

    /* renamed from: l  reason: collision with root package name */
    private final b f15307l;

    /* renamed from: m  reason: collision with root package name */
    private double f15308m;

    /* renamed from: n  reason: collision with root package name */
    private double f15309n;

    /* renamed from: o  reason: collision with root package name */
    private double f15310o;

    /* renamed from: p  reason: collision with root package name */
    private double f15311p;

    /* renamed from: q  reason: collision with root package name */
    private double f15312q;

    /* renamed from: r  reason: collision with root package name */
    private int f15313r;

    /* renamed from: s  reason: collision with root package name */
    private int f15314s;

    /* renamed from: t  reason: collision with root package name */
    private double f15315t;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpringAnimation.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        double f15316a;

        /* renamed from: b  reason: collision with root package name */
        double f15317b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(ReadableMap readableMap) {
        b bVar = new b();
        this.f15307l = bVar;
        bVar.f15317b = readableMap.getDouble("initialVelocity");
        a(readableMap);
    }

    private void c(double d10) {
        double d11;
        double d12;
        if (e()) {
            return;
        }
        this.f15312q += d10 <= 0.064d ? d10 : 0.064d;
        double d13 = this.f15303h;
        double d14 = this.f15304i;
        double d15 = this.f15302g;
        double d16 = -this.f15305j;
        double sqrt = d13 / (Math.sqrt(d15 * d14) * 2.0d);
        double sqrt2 = Math.sqrt(d15 / d14);
        double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
        double d17 = this.f15309n - this.f15308m;
        double d18 = this.f15312q;
        if (sqrt < 1.0d) {
            double exp = Math.exp((-sqrt) * sqrt2 * d18);
            double d19 = sqrt * sqrt2;
            double d20 = d16 + (d19 * d17);
            double d21 = d18 * sqrt3;
            d12 = this.f15309n - ((((d20 / sqrt3) * Math.sin(d21)) + (Math.cos(d21) * d17)) * exp);
            d11 = ((d19 * exp) * (((Math.sin(d21) * d20) / sqrt3) + (Math.cos(d21) * d17))) - (((Math.cos(d21) * d20) - ((sqrt3 * d17) * Math.sin(d21))) * exp);
        } else {
            double exp2 = Math.exp((-sqrt2) * d18);
            double d22 = this.f15309n - (((((sqrt2 * d17) + d16) * d18) + d17) * exp2);
            d11 = exp2 * ((d16 * ((d18 * sqrt2) - 1.0d)) + (d18 * d17 * sqrt2 * sqrt2));
            d12 = d22;
        }
        b bVar = this.f15307l;
        bVar.f15316a = d12;
        bVar.f15317b = d11;
        if (e() || (this.f15306k && f())) {
            if (this.f15302g > 0.0d) {
                double d23 = this.f15309n;
                this.f15308m = d23;
                this.f15307l.f15316a = d23;
            } else {
                double d24 = this.f15307l.f15316a;
                this.f15309n = d24;
                this.f15308m = d24;
            }
            this.f15307l.f15317b = 0.0d;
        }
    }

    private double d(b bVar) {
        return Math.abs(this.f15309n - bVar.f15316a);
    }

    private boolean e() {
        return Math.abs(this.f15307l.f15317b) <= this.f15310o && (d(this.f15307l) <= this.f15311p || this.f15302g == 0.0d);
    }

    private boolean f() {
        if (this.f15302g > 0.0d) {
            double d10 = this.f15308m;
            double d11 = this.f15309n;
            if ((d10 < d11 && this.f15307l.f15316a > d11) || (d10 > d11 && this.f15307l.f15316a < d11)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        this.f15302g = readableMap.getDouble("stiffness");
        this.f15303h = readableMap.getDouble("damping");
        this.f15304i = readableMap.getDouble("mass");
        this.f15305j = this.f15307l.f15317b;
        this.f15309n = readableMap.getDouble("toValue");
        this.f15310o = readableMap.getDouble("restSpeedThreshold");
        this.f15311p = readableMap.getDouble("restDisplacementThreshold");
        this.f15306k = readableMap.getBoolean("overshootClamping");
        int i10 = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f15313r = i10;
        this.f15239a = i10 == 0;
        this.f15314s = 0;
        this.f15312q = 0.0d;
        this.f15301f = false;
    }

    @Override // com.facebook.react.animated.d
    public void b(long j10) {
        long j11 = j10 / 1000000;
        if (!this.f15301f) {
            if (this.f15314s == 0) {
                this.f15315t = this.f15240b.f15333f;
                this.f15314s = 1;
            }
            b bVar = this.f15307l;
            double d10 = this.f15240b.f15333f;
            bVar.f15316a = d10;
            this.f15308m = d10;
            this.f15300e = j11;
            this.f15312q = 0.0d;
            this.f15301f = true;
        }
        c((j11 - this.f15300e) / 1000.0d);
        this.f15300e = j11;
        this.f15240b.f15333f = this.f15307l.f15316a;
        if (e()) {
            int i10 = this.f15313r;
            if (i10 != -1 && this.f15314s >= i10) {
                this.f15239a = true;
                return;
            }
            this.f15301f = false;
            this.f15240b.f15333f = this.f15315t;
            this.f15314s++;
        }
    }
}
