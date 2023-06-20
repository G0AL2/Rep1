package com.facebook.imagepipeline.producers;

import android.util.Pair;
import b6.b;

/* compiled from: EncodedCacheKeyMultiplexProducer.java */
/* loaded from: classes.dex */
public class s extends i0<Pair<t3.d, b.c>, w5.e> {

    /* renamed from: f  reason: collision with root package name */
    private final p5.f f15106f;

    public s(p5.f fVar, boolean z10, o0 o0Var) {
        super(o0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z10);
        this.f15106f = fVar;
    }

    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: l */
    public w5.e g(w5.e eVar) {
        return w5.e.b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.i0
    /* renamed from: m */
    public Pair<t3.d, b.c> j(p0 p0Var) {
        return Pair.create(this.f15106f.a(p0Var.k(), p0Var.a()), p0Var.o());
    }
}
