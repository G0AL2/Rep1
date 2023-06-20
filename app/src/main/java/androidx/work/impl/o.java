package androidx.work.impl;

import androidx.work.o;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public class o implements androidx.work.o {

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.w<o.b> f4630c = new androidx.lifecycle.w<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<o.b.c> f4631d = androidx.work.impl.utils.futures.c.t();

    public o() {
        b(androidx.work.o.f4727b);
    }

    @Override // androidx.work.o
    public com.google.common.util.concurrent.c<o.b.c> a() {
        return this.f4631d;
    }

    public void b(o.b bVar) {
        this.f4630c.m(bVar);
        if (bVar instanceof o.b.c) {
            this.f4631d.p((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f4631d.q(((o.b.a) bVar).a());
        }
    }
}
