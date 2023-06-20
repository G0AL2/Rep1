package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class t1 implements cb.g0<s1> {

    /* renamed from: a  reason: collision with root package name */
    private final cb.g0<String> f23028a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.g0<u> f23029b;

    /* renamed from: c  reason: collision with root package name */
    private final cb.g0<w0> f23030c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.g0<Context> f23031d;

    /* renamed from: e  reason: collision with root package name */
    private final cb.g0<e2> f23032e;

    /* renamed from: f  reason: collision with root package name */
    private final cb.g0<Executor> f23033f;

    public t1(cb.g0<String> g0Var, cb.g0<u> g0Var2, cb.g0<w0> g0Var3, cb.g0<Context> g0Var4, cb.g0<e2> g0Var5, cb.g0<Executor> g0Var6) {
        this.f23028a = g0Var;
        this.f23029b = g0Var2;
        this.f23030c = g0Var3;
        this.f23031d = g0Var4;
        this.f23032e = g0Var5;
        this.f23033f = g0Var6;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ s1 a() {
        String a10 = this.f23028a.a();
        u a11 = this.f23029b.a();
        w0 a12 = this.f23030c.a();
        Context a13 = ((a3) this.f23031d).a();
        e2 a14 = this.f23032e.a();
        return new s1(a10 != null ? new File(a13.getExternalFilesDir(null), a10) : a13.getExternalFilesDir(null), a11, a12, a13, a14, cb.f0.b(this.f23033f));
    }
}
