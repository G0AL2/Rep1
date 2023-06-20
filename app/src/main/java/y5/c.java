package y5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingRequestListener.java */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f39280a;

    public c(Set<e> set) {
        this.f39280a = new ArrayList(set.size());
        for (e eVar : set) {
            if (eVar != null) {
                this.f39280a.add(eVar);
            }
        }
    }

    private void m(String str, Throwable th) {
        z3.a.k("ForwardingRequestListener", str, th);
    }

    @Override // y5.e
    public void a(b6.b bVar, Object obj, String str, boolean z10) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).a(bVar, obj, str, z10);
            } catch (Exception e10) {
                m("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void b(String str, String str2) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).b(str, str2);
            } catch (Exception e10) {
                m("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public boolean c(String str) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f39280a.get(i10).c(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // y5.e
    public void d(b6.b bVar, String str, Throwable th, boolean z10) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).d(bVar, str, th, z10);
            } catch (Exception e10) {
                m("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void e(String str, String str2, Map<String, String> map) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).e(str, str2, map);
            } catch (Exception e10) {
                m("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void f(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).f(str, str2, th, map);
            } catch (Exception e10) {
                m("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // y5.e
    public void g(b6.b bVar, String str, boolean z10) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).g(bVar, str, z10);
            } catch (Exception e10) {
                m("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void h(String str, String str2, Map<String, String> map) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).h(str, str2, map);
            } catch (Exception e10) {
                m("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void i(String str, String str2, boolean z10) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).i(str, str2, z10);
            } catch (Exception e10) {
                m("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.s0
    public void j(String str, String str2, String str3) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).j(str, str2, str3);
            } catch (Exception e10) {
                m("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // y5.e
    public void k(String str) {
        int size = this.f39280a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                this.f39280a.get(i10).k(str);
            } catch (Exception e10) {
                m("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    public void l(e eVar) {
        this.f39280a.add(eVar);
    }

    public c(e... eVarArr) {
        this.f39280a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f39280a.add(eVar);
            }
        }
    }
}
