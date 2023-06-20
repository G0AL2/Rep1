package com.facebook.imagepipeline.producers;

import java.util.Map;

/* compiled from: StatefulProducerRunnable.java */
/* loaded from: classes.dex */
public abstract class w0<T> extends w3.g<T> {

    /* renamed from: b  reason: collision with root package name */
    private final l<T> f15147b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f15148c;

    /* renamed from: d  reason: collision with root package name */
    private final String f15149d;

    /* renamed from: e  reason: collision with root package name */
    private final p0 f15150e;

    public w0(l<T> lVar, r0 r0Var, p0 p0Var, String str) {
        this.f15147b = lVar;
        this.f15148c = r0Var;
        this.f15149d = str;
        this.f15150e = p0Var;
        r0Var.d(p0Var, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w3.g
    public void d() {
        r0 r0Var = this.f15148c;
        p0 p0Var = this.f15150e;
        String str = this.f15149d;
        r0Var.c(p0Var, str, r0Var.f(p0Var, str) ? g() : null);
        this.f15147b.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w3.g
    public void e(Exception exc) {
        r0 r0Var = this.f15148c;
        p0 p0Var = this.f15150e;
        String str = this.f15149d;
        r0Var.k(p0Var, str, exc, r0Var.f(p0Var, str) ? h(exc) : null);
        this.f15147b.b(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w3.g
    public void f(T t10) {
        r0 r0Var = this.f15148c;
        p0 p0Var = this.f15150e;
        String str = this.f15149d;
        r0Var.j(p0Var, str, r0Var.f(p0Var, str) ? i(t10) : null);
        this.f15147b.c(t10, 1);
    }

    protected Map<String, String> g() {
        return null;
    }

    protected Map<String, String> h(Exception exc) {
        return null;
    }

    protected Map<String, String> i(T t10) {
        return null;
    }
}
