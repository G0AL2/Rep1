package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicDouble.java */
/* loaded from: classes3.dex */
public class b extends Number {

    /* renamed from: a  reason: collision with root package name */
    private transient AtomicLong f23162a;

    public b(double d10) {
        this.f23162a = new AtomicLong(Double.doubleToRawLongBits(d10));
    }

    public final double a(double d10) {
        long j10;
        double longBitsToDouble;
        do {
            j10 = this.f23162a.get();
            longBitsToDouble = Double.longBitsToDouble(j10) + d10;
        } while (!this.f23162a.compareAndSet(j10, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final double b() {
        return Double.longBitsToDouble(this.f23162a.get());
    }

    public final void c(double d10) {
        this.f23162a.set(Double.doubleToRawLongBits(d10));
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return b();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) b();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) b();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) b();
    }

    public String toString() {
        return Double.toString(b());
    }

    public b() {
        this(0.0d);
    }
}
