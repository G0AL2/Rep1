package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class m implements u1 {

    /* renamed from: a  reason: collision with root package name */
    public final l f19956a;

    public m(l lVar) {
        l lVar2 = (l) z.a(lVar, "output");
        this.f19956a = lVar2;
        lVar2.f19947a = this;
    }

    public void a(int i10, float f10) throws IOException {
        l lVar = this.f19956a;
        lVar.getClass();
        lVar.g(i10, Float.floatToRawIntBits(f10));
    }

    public void b(int i10, Object obj, f1 f1Var) throws IOException {
        this.f19956a.b(i10, (q0) obj, f1Var);
    }

    public void a(int i10, double d10) throws IOException {
        l lVar = this.f19956a;
        lVar.getClass();
        lVar.f(i10, Double.doubleToRawLongBits(d10));
    }

    public void a(int i10, int i11) throws IOException {
        this.f19956a.j(i10, l.d(i11));
    }

    public void a(int i10, long j10) throws IOException {
        this.f19956a.g(i10, l.b(j10));
    }

    public void a(int i10, Object obj, f1 f1Var) throws IOException {
        l lVar = this.f19956a;
        lVar.i(i10, 3);
        f1Var.a((f1) ((q0) obj), (u1) lVar.f19947a);
        lVar.i(i10, 4);
    }

    public final void a(int i10, Object obj) throws IOException {
        if (obj instanceof i) {
            this.f19956a.c(i10, (i) obj);
        } else {
            this.f19956a.a(i10, (q0) obj);
        }
    }
}
