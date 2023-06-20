package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class s {

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<x> f14293c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<a0> f14294d;

    /* renamed from: a  reason: collision with root package name */
    private y f14291a = null;

    /* renamed from: b  reason: collision with root package name */
    private b0 f14292b = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14295e = true;

    private void c() {
        WeakReference<a0> weakReference = this.f14294d;
        if (weakReference != null) {
            weakReference.clear();
            this.f14294d = null;
        }
    }

    private e.a e() {
        com.chartboost.sdk.Model.e i10;
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        if (a10 == null || (i10 = a10.i()) == null) {
            return null;
        }
        return i10.a();
    }

    public void a(x xVar) {
        b();
        this.f14293c = new WeakReference<>(xVar);
    }

    public b0 b(WeakReference<a0> weakReference, double d10) {
        return new b0(weakReference, d10);
    }

    public boolean d() {
        return this.f14295e;
    }

    public double f() {
        e.a e10 = e();
        if (e10 != null) {
            return e10.a();
        }
        return 30.0d;
    }

    public double g() {
        e.a e10 = e();
        if (e10 != null) {
            return e10.b();
        }
        return 30.0d;
    }

    public void h() {
        if (this.f14291a != null) {
            CBLogging.a("BannerAutoRefreshManager", "Auto-refreshed is paused at: " + this.f14291a.c());
            this.f14291a.e();
        }
    }

    public void i() {
        b0 b0Var = this.f14292b;
        if (b0Var != null) {
            b0Var.e();
        }
    }

    public void j() {
        n();
        if (this.f14291a == null && this.f14295e && this.f14293c != null) {
            CBLogging.a("BannerAutoRefreshManager", "Register auto refresh start");
            y a10 = a(this.f14293c, f());
            this.f14291a = a10;
            a10.h();
        }
    }

    public void k() {
        o();
        if (this.f14292b == null && this.f14295e && this.f14294d != null) {
            CBLogging.a("BannerAutoRefreshManager", "Register timeout start");
            b0 b10 = b(this.f14294d, g());
            this.f14292b = b10;
            b10.h();
        }
    }

    public void l() {
        if (this.f14291a != null) {
            CBLogging.a("BannerAutoRefreshManager", "Auto-refreshed is resumed at: " + this.f14291a.c());
            this.f14291a.g();
            return;
        }
        j();
    }

    public void m() {
        if (this.f14292b != null) {
            CBLogging.a("BannerAutoRefreshManager", "Timeout banner is resumed at: " + this.f14292b.c());
            this.f14292b.g();
        }
    }

    public void n() {
        y yVar = this.f14291a;
        if (yVar != null) {
            yVar.i();
            this.f14291a = null;
        }
    }

    public void o() {
        b0 b0Var = this.f14292b;
        if (b0Var != null) {
            b0Var.i();
            this.f14292b = null;
        }
    }

    private void b() {
        WeakReference<x> weakReference = this.f14293c;
        if (weakReference != null) {
            weakReference.clear();
            this.f14293c = null;
        }
    }

    public void a(a0 a0Var) {
        c();
        this.f14294d = new WeakReference<>(a0Var);
    }

    public y a(WeakReference<x> weakReference, double d10) {
        return new y(weakReference, d10);
    }

    public void a(boolean z10) {
        this.f14295e = z10;
        if (z10) {
            m();
            l();
            return;
        }
        i();
        h();
    }

    public void a() {
        b();
        c();
    }
}
