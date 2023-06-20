package com.chartboost.sdk.impl;

import java.io.File;

/* loaded from: classes.dex */
public class d3 {

    /* renamed from: a  reason: collision with root package name */
    private long f13953a;

    /* renamed from: b  reason: collision with root package name */
    private int f13954b;

    /* renamed from: c  reason: collision with root package name */
    private int f13955c;

    /* renamed from: d  reason: collision with root package name */
    private long f13956d;

    /* renamed from: e  reason: collision with root package name */
    private long f13957e;

    /* renamed from: f  reason: collision with root package name */
    private long f13958f;

    /* renamed from: g  reason: collision with root package name */
    private final r0 f13959g;

    /* renamed from: h  reason: collision with root package name */
    private long f13960h;

    /* renamed from: i  reason: collision with root package name */
    private int f13961i;

    public d3(long j10, int i10, int i11, long j11, long j12, long j13, int i12, r0 r0Var) {
        this.f13953a = j10;
        this.f13954b = i10;
        this.f13955c = i11;
        this.f13956d = j11;
        this.f13957e = j12;
        this.f13958f = j13;
        this.f13959g = r0Var;
    }

    public void a() {
        this.f13961i++;
    }

    public final void a(int i10) {
    }

    public final void b(int i10) {
        this.f13954b = i10;
    }

    public final void c(long j10) {
        this.f13953a = j10;
    }

    public final void d(long j10) {
        this.f13956d = j10;
    }

    public final void e(long j10) {
        this.f13957e = j10;
    }

    public final void f(long j10) {
        this.f13958f = j10;
    }

    private final int d() {
        r0 r0Var = this.f13959g;
        if (r0Var != null && r0Var.d()) {
            return this.f13955c;
        }
        return this.f13954b;
    }

    private final long e() {
        long j10;
        r0 r0Var = this.f13959g;
        if (r0Var != null && r0Var.d()) {
            j10 = this.f13957e;
        } else {
            j10 = this.f13956d;
        }
        return j10 * 1000;
    }

    private final void f() {
        long e10 = e();
        long currentTimeMillis = System.currentTimeMillis() - this.f13960h;
        if (currentTimeMillis > e10) {
            m2.a("Video loading limit reset");
            this.f13961i = 0;
            this.f13960h = 0L;
            return;
        }
        m2.a(qe.k.l("Video loading limit reached, will resume in timeToResetWindow: ", Long.valueOf(e10 - currentTimeMillis)));
    }

    public boolean a(File file) {
        qe.k.f(file, "file");
        return System.currentTimeMillis() - file.lastModified() > this.f13958f * ((long) 1000);
    }

    public final void b(long j10) {
        this.f13960h = j10;
    }

    public final void c(int i10) {
        this.f13955c = i10;
    }

    public boolean b() {
        f();
        return this.f13961i < d();
    }

    public final long c() {
        return this.f13960h;
    }

    public boolean a(long j10) {
        return j10 >= this.f13953a;
    }
}
