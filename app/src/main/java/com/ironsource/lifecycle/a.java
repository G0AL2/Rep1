package com.ironsource.lifecycle;

import qe.k;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f26184a;

    /* renamed from: b  reason: collision with root package name */
    private final g f26185b;

    public a(g gVar) {
        k.f(gVar, "task");
        this.f26185b = gVar;
        d.a().a(this);
        this.f26184a = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        this.f26184a = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        this.f26185b.f26214a = Long.valueOf(System.currentTimeMillis() - this.f26184a);
        this.f26185b.run();
    }
}
