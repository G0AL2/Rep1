package s5;

import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.v0;
import java.util.Map;
import y3.k;
import y5.d;

/* compiled from: AbstractProducerToDataSourceAdapter.java */
/* loaded from: classes.dex */
public abstract class a<T> extends com.facebook.datasource.a<T> {

    /* renamed from: i  reason: collision with root package name */
    private final v0 f36743i;

    /* renamed from: j  reason: collision with root package name */
    private final d f36744j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractProducerToDataSourceAdapter.java */
    /* renamed from: s5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0495a extends com.facebook.imagepipeline.producers.b<T> {
        C0495a() {
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void g() {
            a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(Throwable th) {
            a.this.E(th);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(T t10, int i10) {
            a aVar = a.this;
            aVar.F(t10, i10, aVar.f36743i);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void j(float f10) {
            a.this.s(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(o0<T> o0Var, v0 v0Var, d dVar) {
        if (c6.b.d()) {
            c6.b.a("AbstractProducerToDataSourceAdapter()");
        }
        this.f36743i = v0Var;
        this.f36744j = dVar;
        G();
        if (c6.b.d()) {
            c6.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        dVar.a(v0Var);
        if (c6.b.d()) {
            c6.b.b();
        }
        if (c6.b.d()) {
            c6.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        o0Var.b(B(), v0Var);
        if (c6.b.d()) {
            c6.b.b();
        }
        if (c6.b.d()) {
            c6.b.b();
        }
    }

    private l<T> B() {
        return new C0495a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void D() {
        k.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Throwable th) {
        if (super.q(th, C(this.f36743i))) {
            this.f36744j.i(this.f36743i, th);
        }
    }

    private void G() {
        o(this.f36743i.getExtras());
    }

    protected Map<String, Object> C(p0 p0Var) {
        return p0Var.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(T t10, int i10, p0 p0Var) {
        boolean e10 = com.facebook.imagepipeline.producers.b.e(i10);
        if (super.u(t10, e10, C(p0Var)) && e10) {
            this.f36744j.e(this.f36743i);
        }
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    public boolean close() {
        if (super.close()) {
            if (super.c()) {
                return true;
            }
            this.f36744j.g(this.f36743i);
            this.f36743i.u();
            return true;
        }
        return false;
    }
}
