package com.facebook.imagepipeline.producers;

/* compiled from: InternalRequestListener.java */
/* loaded from: classes.dex */
public class z extends y implements y5.d {

    /* renamed from: c  reason: collision with root package name */
    private final y5.e f15175c;

    /* renamed from: d  reason: collision with root package name */
    private final y5.d f15176d;

    public z(y5.e eVar, y5.d dVar) {
        super(eVar, dVar);
        this.f15175c = eVar;
        this.f15176d = dVar;
    }

    @Override // y5.d
    public void a(p0 p0Var) {
        y5.e eVar = this.f15175c;
        if (eVar != null) {
            eVar.a(p0Var.k(), p0Var.a(), p0Var.getId(), p0Var.m());
        }
        y5.d dVar = this.f15176d;
        if (dVar != null) {
            dVar.a(p0Var);
        }
    }

    @Override // y5.d
    public void e(p0 p0Var) {
        y5.e eVar = this.f15175c;
        if (eVar != null) {
            eVar.g(p0Var.k(), p0Var.getId(), p0Var.m());
        }
        y5.d dVar = this.f15176d;
        if (dVar != null) {
            dVar.e(p0Var);
        }
    }

    @Override // y5.d
    public void g(p0 p0Var) {
        y5.e eVar = this.f15175c;
        if (eVar != null) {
            eVar.k(p0Var.getId());
        }
        y5.d dVar = this.f15176d;
        if (dVar != null) {
            dVar.g(p0Var);
        }
    }

    @Override // y5.d
    public void i(p0 p0Var, Throwable th) {
        y5.e eVar = this.f15175c;
        if (eVar != null) {
            eVar.d(p0Var.k(), p0Var.getId(), th, p0Var.m());
        }
        y5.d dVar = this.f15176d;
        if (dVar != null) {
            dVar.i(p0Var, th);
        }
    }
}
