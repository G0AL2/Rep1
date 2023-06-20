package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class o0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f14229a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14230b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14231c;

    /* renamed from: e  reason: collision with root package name */
    public final File f14233e;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f14232d = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    public long f14234f = 0;

    /* renamed from: g  reason: collision with root package name */
    public long f14235g = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f14236h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f14237i = 0;

    public o0(String str, String str2, int i10, File file) {
        this.f14229a = str;
        this.f14230b = str2;
        this.f14231c = i10;
        this.f14233e = file;
    }

    public com.chartboost.sdk.Networking.a a() {
        return new com.chartboost.sdk.Networking.a(null, null, null);
    }

    public void a(CBError cBError, q0 q0Var) {
    }

    public void a(T t10, q0 q0Var) {
    }

    public void a(String str, long j10) {
    }

    public boolean b() {
        return this.f14232d.compareAndSet(0, -1);
    }

    public p0<T> a(q0 q0Var) {
        return p0.a((Object) null);
    }
}
