package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d2 implements cb.g0<c2> {

    /* renamed from: a  reason: collision with root package name */
    private final cb.g0<a0> f22798a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.g0<d3> f22799b;

    /* renamed from: c  reason: collision with root package name */
    private final cb.g0<k1> f22800c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.g0<Executor> f22801d;

    /* renamed from: e  reason: collision with root package name */
    private final cb.g0<w0> f22802e;

    public d2(cb.g0<a0> g0Var, cb.g0<d3> g0Var2, cb.g0<k1> g0Var3, cb.g0<Executor> g0Var4, cb.g0<w0> g0Var5) {
        this.f22798a = g0Var;
        this.f22799b = g0Var2;
        this.f22800c = g0Var3;
        this.f22801d = g0Var4;
        this.f22802e = g0Var5;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ c2 a() {
        a0 a10 = this.f22798a.a();
        return new c2(a10, cb.f0.b(this.f22799b), this.f22800c.a(), cb.f0.b(this.f22801d), this.f22802e.a());
    }
}
