package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22784a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.d0<d3> f22785b;

    /* renamed from: c  reason: collision with root package name */
    private final k1 f22786c;

    /* renamed from: d  reason: collision with root package name */
    private final cb.d0<Executor> f22787d;

    /* renamed from: e  reason: collision with root package name */
    private final w0 f22788e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c2(a0 a0Var, cb.d0<d3> d0Var, k1 k1Var, cb.d0<Executor> d0Var2, w0 w0Var) {
        this.f22784a = a0Var;
        this.f22785b = d0Var;
        this.f22786c = k1Var;
        this.f22787d = d0Var2;
        this.f22788e = w0Var;
    }

    public final void a(a2 a2Var) {
        File m10 = this.f22784a.m(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d);
        File v10 = this.f22784a.v(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d);
        if (!m10.exists() || !v10.exists()) {
            throw new s0(String.format("Cannot find pack files to move for pack %s.", a2Var.f22914b), a2Var.f22913a);
        }
        File b10 = this.f22784a.b(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d);
        b10.mkdirs();
        if (!m10.renameTo(b10)) {
            throw new s0("Cannot move merged pack files to final location.", a2Var.f22913a);
        }
        new File(this.f22784a.b(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d), "merge.tmp").delete();
        File j10 = this.f22784a.j(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d);
        j10.mkdirs();
        if (!v10.renameTo(j10)) {
            throw new s0("Cannot move metadata files to final location.", a2Var.f22913a);
        }
        a0 a0Var = this.f22784a;
        a0Var.getClass();
        this.f22787d.a().execute(b2.a(a0Var));
        this.f22786c.d(a2Var.f22914b, a2Var.f22769c, a2Var.f22770d);
        this.f22788e.b(a2Var.f22914b);
        this.f22785b.a().a(a2Var.f22913a, a2Var.f22914b);
    }
}
