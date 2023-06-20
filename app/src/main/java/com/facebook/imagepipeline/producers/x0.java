package com.facebook.imagepipeline.producers;

/* compiled from: SwallowResultProducer.java */
/* loaded from: classes.dex */
public class x0<T> implements o0<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f15164a;

    /* compiled from: SwallowResultProducer.java */
    /* loaded from: classes.dex */
    class a extends p<T, Void> {
        a(x0 x0Var, l lVar) {
            super(lVar);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(T t10, int i10) {
            if (b.e(i10)) {
                p().c(null, i10);
            }
        }
    }

    public x0(o0<T> o0Var) {
        this.f15164a = o0Var;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<Void> lVar, p0 p0Var) {
        this.f15164a.b(new a(this, lVar), p0Var);
    }
}
