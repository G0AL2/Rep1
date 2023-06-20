package com.facebook.imagepipeline.producers;

import android.util.Pair;
import b6.b;

/* compiled from: BitmapMemoryCacheKeyMultiplexProducer.java */
/* loaded from: classes.dex */
public class g extends i0<Pair<t3.d, b.c>, c4.a<w5.c>> {

    /* renamed from: f  reason: collision with root package name */
    private final p5.f f14957f;

    public g(p5.f fVar, o0 o0Var) {
        super(o0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f14957f = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: l */
    public c4.a<w5.c> g(c4.a<w5.c> aVar) {
        return c4.a.q(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: m */
    public Pair<t3.d, b.c> j(p0 p0Var) {
        return Pair.create(this.f14957f.c(p0Var.k(), p0Var.a()), p0Var.o());
    }
}
