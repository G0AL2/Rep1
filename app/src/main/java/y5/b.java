package y5;

import com.facebook.imagepipeline.producers.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingRequestListener2.java */
/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f39279a;

    public b(Set<d> set) {
        this.f39279a = new ArrayList(set.size());
        for (d dVar : set) {
            if (dVar != null) {
                this.f39279a.add(dVar);
            }
        }
    }

    private void l(String str, Throwable th) {
        z3.a.k("ForwardingRequestListener2", str, th);
    }

    @Override // y5.d
    public void a(p0 p0Var) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).a(p0Var);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void b(p0 p0Var, String str, boolean z10) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).b(p0Var, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void c(p0 p0Var, String str, Map<String, String> map) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).c(p0Var, str, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void d(p0 p0Var, String str) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).d(p0Var, str);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // y5.d
    public void e(p0 p0Var) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).e(p0Var);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public boolean f(p0 p0Var, String str) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f39279a.get(i10).f(p0Var, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // y5.d
    public void g(p0 p0Var) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).g(p0Var);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void h(p0 p0Var, String str, String str2) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).h(p0Var, str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // y5.d
    public void i(p0 p0Var, Throwable th) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).i(p0Var, th);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void j(p0 p0Var, String str, Map<String, String> map) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).j(p0Var, str, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.r0
    public void k(p0 p0Var, String str, Throwable th, Map<String, String> map) {
        int size = this.f39279a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39279a.get(i10).k(p0Var, str, th, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }
}
