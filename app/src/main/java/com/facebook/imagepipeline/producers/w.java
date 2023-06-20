package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* compiled from: FetchState.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final l<w5.e> f15142a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f15143b;

    /* renamed from: c  reason: collision with root package name */
    private long f15144c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f15145d;

    /* renamed from: e  reason: collision with root package name */
    private q5.a f15146e;

    public w(l<w5.e> lVar, p0 p0Var) {
        this.f15142a = lVar;
        this.f15143b = p0Var;
    }

    public l<w5.e> a() {
        return this.f15142a;
    }

    public p0 b() {
        return this.f15143b;
    }

    public long c() {
        return this.f15144c;
    }

    public r0 d() {
        return this.f15143b.h();
    }

    public int e() {
        return this.f15145d;
    }

    public q5.a f() {
        return this.f15146e;
    }

    public Uri g() {
        return this.f15143b.k().q();
    }

    public void h(long j10) {
        this.f15144c = j10;
    }

    public void i(int i10) {
        this.f15145d = i10;
    }

    public void j(q5.a aVar) {
        this.f15146e = aVar;
    }
}
