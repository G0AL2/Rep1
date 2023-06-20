package com.facebook.imagepipeline.producers;

/* compiled from: ThreadHandoffProducer.java */
/* loaded from: classes.dex */
public class y0<T> implements o0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o0<T> f15167a;

    /* renamed from: b  reason: collision with root package name */
    private final z0 f15168b;

    /* compiled from: ThreadHandoffProducer.java */
    /* loaded from: classes.dex */
    class a extends w0<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r0 f15169f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p0 f15170g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ l f15171h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, r0 r0Var, p0 p0Var, String str, r0 r0Var2, p0 p0Var2, l lVar2) {
            super(lVar, r0Var, p0Var, str);
            this.f15169f = r0Var2;
            this.f15170g = p0Var2;
            this.f15171h = lVar2;
        }

        @Override // w3.g
        protected void b(T t10) {
        }

        @Override // w3.g
        protected T c() throws Exception {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.w0, w3.g
        public void f(T t10) {
            this.f15169f.j(this.f15170g, "BackgroundThreadHandoffProducer", null);
            y0.this.f15167a.b(this.f15171h, this.f15170g);
        }
    }

    /* compiled from: ThreadHandoffProducer.java */
    /* loaded from: classes.dex */
    class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w0 f15173a;

        b(w0 w0Var) {
            this.f15173a = w0Var;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            this.f15173a.a();
            y0.this.f15168b.a(this.f15173a);
        }
    }

    public y0(o0<T> o0Var, z0 z0Var) {
        this.f15167a = (o0) y3.k.g(o0Var);
        this.f15168b = z0Var;
    }

    private static String e(p0 p0Var) {
        if (x5.a.b()) {
            return "ThreadHandoffProducer_produceResults_" + p0Var.getId();
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.o0
    public void b(l<T> lVar, p0 p0Var) {
        try {
            if (c6.b.d()) {
                c6.b.a("ThreadHandoffProducer#produceResults");
            }
            r0 h10 = p0Var.h();
            a aVar = new a(lVar, h10, p0Var, "BackgroundThreadHandoffProducer", h10, p0Var, lVar);
            p0Var.c(new b(aVar));
            this.f15168b.b(x5.a.a(aVar, e(p0Var)));
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }
}
