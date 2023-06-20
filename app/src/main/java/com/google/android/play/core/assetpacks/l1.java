package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l1 implements cb.g0<k1> {

    /* renamed from: a  reason: collision with root package name */
    private final cb.g0<a0> f22907a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.g0<d3> f22908b;

    /* renamed from: c  reason: collision with root package name */
    private final cb.g0<w0> f22909c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.g0<Executor> f22910d;

    public l1(cb.g0<a0> g0Var, cb.g0<d3> g0Var2, cb.g0<w0> g0Var3, cb.g0<Executor> g0Var4) {
        this.f22907a = g0Var;
        this.f22908b = g0Var2;
        this.f22909c = g0Var3;
        this.f22910d = g0Var4;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ k1 a() {
        a0 a10 = this.f22907a.a();
        return new k1(a10, cb.f0.b(this.f22908b), this.f22909c.a(), cb.f0.b(this.f22910d));
    }
}
