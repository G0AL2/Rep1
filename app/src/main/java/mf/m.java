package mf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes3.dex */
public class m extends f0 {

    /* renamed from: e  reason: collision with root package name */
    private f0 f34471e;

    public m(f0 f0Var) {
        qe.k.f(f0Var, "delegate");
        this.f34471e = f0Var;
    }

    @Override // mf.f0
    public f0 a() {
        return this.f34471e.a();
    }

    @Override // mf.f0
    public f0 b() {
        return this.f34471e.b();
    }

    @Override // mf.f0
    public long c() {
        return this.f34471e.c();
    }

    @Override // mf.f0
    public f0 d(long j10) {
        return this.f34471e.d(j10);
    }

    @Override // mf.f0
    public boolean e() {
        return this.f34471e.e();
    }

    @Override // mf.f0
    public void f() throws IOException {
        this.f34471e.f();
    }

    @Override // mf.f0
    public f0 g(long j10, TimeUnit timeUnit) {
        qe.k.f(timeUnit, "unit");
        return this.f34471e.g(j10, timeUnit);
    }

    @Override // mf.f0
    public long h() {
        return this.f34471e.h();
    }

    public final f0 i() {
        return this.f34471e;
    }

    public final m j(f0 f0Var) {
        qe.k.f(f0Var, "delegate");
        this.f34471e = f0Var;
        return this;
    }
}
