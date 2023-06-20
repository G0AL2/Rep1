package s5;

import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.v0;
import y5.d;

/* compiled from: CloseableProducerToDataSourceAdapter.java */
/* loaded from: classes.dex */
public class b<T> extends a<c4.a<T>> {
    private b(o0<c4.a<T>> o0Var, v0 v0Var, d dVar) {
        super(o0Var, v0Var, dVar);
    }

    public static <T> com.facebook.datasource.c<c4.a<T>> I(o0<c4.a<T>> o0Var, v0 v0Var, d dVar) {
        if (c6.b.d()) {
            c6.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        b bVar = new b(o0Var, v0Var, dVar);
        if (c6.b.d()) {
            c6.b.b();
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.datasource.a
    /* renamed from: H */
    public void h(c4.a<T> aVar) {
        c4.a.w(aVar);
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    /* renamed from: J */
    public c4.a<T> a() {
        return c4.a.q((c4.a) super.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s5.a
    /* renamed from: K */
    public void F(c4.a<T> aVar, int i10, p0 p0Var) {
        super.F(c4.a.q(aVar), i10, p0Var);
    }
}
