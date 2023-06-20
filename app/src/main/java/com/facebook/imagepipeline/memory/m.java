package com.facebook.imagepipeline.memory;

import java.util.LinkedList;

/* compiled from: OOMSoftReferenceBucket.java */
/* loaded from: classes.dex */
class m<V> extends c<V> {

    /* renamed from: f  reason: collision with root package name */
    private LinkedList<c4.f<V>> f14854f;

    public m(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f14854f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.c
    void a(V v10) {
        c4.f<V> poll = this.f14854f.poll();
        if (poll == null) {
            poll = new c4.f<>();
        }
        poll.c(v10);
        this.f14838c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.c
    public V g() {
        c4.f<V> fVar = (c4.f) this.f14838c.poll();
        y3.k.g(fVar);
        V b10 = fVar.b();
        fVar.a();
        this.f14854f.add(fVar);
        return b10;
    }
}
