package m1;

import java.util.ArrayList;
import java.util.List;
import o1.u;
import qe.k;

/* compiled from: ConstraintController.kt */
/* loaded from: classes.dex */
public abstract class c<T> implements l1.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final n1.h<T> f34175a;

    /* renamed from: b  reason: collision with root package name */
    private final List<u> f34176b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f34177c;

    /* renamed from: d  reason: collision with root package name */
    private T f34178d;

    /* renamed from: e  reason: collision with root package name */
    private a f34179e;

    /* compiled from: ConstraintController.kt */
    /* loaded from: classes.dex */
    public interface a {
        void b(List<u> list);

        void c(List<u> list);
    }

    public c(n1.h<T> hVar) {
        k.f(hVar, "tracker");
        this.f34175a = hVar;
        this.f34176b = new ArrayList();
        this.f34177c = new ArrayList();
    }

    private final void h(a aVar, T t10) {
        if (this.f34176b.isEmpty() || aVar == null) {
            return;
        }
        if (t10 != null && !c(t10)) {
            aVar.b(this.f34176b);
        } else {
            aVar.c(this.f34176b);
        }
    }

    @Override // l1.a
    public void a(T t10) {
        this.f34178d = t10;
        h(this.f34179e, t10);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(T t10);

    public final boolean d(String str) {
        k.f(str, "workSpecId");
        T t10 = this.f34178d;
        return t10 != null && c(t10) && this.f34177c.contains(str);
    }

    public final void e(Iterable<u> iterable) {
        k.f(iterable, "workSpecs");
        this.f34176b.clear();
        this.f34177c.clear();
        List<u> list = this.f34176b;
        for (u uVar : iterable) {
            if (b(uVar)) {
                list.add(uVar);
            }
        }
        List<u> list2 = this.f34176b;
        List<String> list3 = this.f34177c;
        for (u uVar2 : list2) {
            list3.add(uVar2.f34905a);
        }
        if (this.f34176b.isEmpty()) {
            this.f34175a.f(this);
        } else {
            this.f34175a.c(this);
        }
        h(this.f34179e, this.f34178d);
    }

    public final void f() {
        if (!this.f34176b.isEmpty()) {
            this.f34176b.clear();
            this.f34175a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f34179e != aVar) {
            this.f34179e = aVar;
            h(aVar, this.f34178d);
        }
    }
}
