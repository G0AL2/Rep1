package com.facebook.imagepipeline.producers;

/* compiled from: DelegatingConsumer.java */
/* loaded from: classes.dex */
public abstract class p<I, O> extends b<I> {

    /* renamed from: b  reason: collision with root package name */
    private final l<O> f15088b;

    public p(l<O> lVar) {
        this.f15088b = lVar;
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void g() {
        this.f15088b.a();
    }

    @Override // com.facebook.imagepipeline.producers.b
    protected void h(Throwable th) {
        this.f15088b.b(th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.b
    public void j(float f10) {
        this.f15088b.d(f10);
    }

    public l<O> p() {
        return this.f15088b;
    }
}
