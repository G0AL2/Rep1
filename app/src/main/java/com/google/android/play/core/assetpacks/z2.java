package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes3.dex */
public final class z2 implements cb.g0<d3> {

    /* renamed from: a  reason: collision with root package name */
    private final cb.g0<Context> f23113a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.g0<p> f23114b;

    /* renamed from: c  reason: collision with root package name */
    private final cb.g0<s1> f23115c;

    public z2(cb.g0<Context> g0Var, cb.g0<p> g0Var2, cb.g0<s1> g0Var3) {
        this.f23113a = g0Var;
        this.f23114b = g0Var2;
        this.f23115c = g0Var3;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ d3 a() {
        d3 d3Var = (d3) (w2.b(((a3) this.f23113a).a()) == null ? cb.f0.b(this.f23114b).a() : cb.f0.b(this.f23115c).a());
        cb.r.g(d3Var);
        return d3Var;
    }
}
