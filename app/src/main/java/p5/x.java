package p5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: StagingArea.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f35579b = x.class;

    /* renamed from: a  reason: collision with root package name */
    private Map<t3.d, w5.e> f35580a = new HashMap();

    private x() {
    }

    public static x d() {
        return new x();
    }

    private synchronized void e() {
        z3.a.w(f35579b, "Count = %d", Integer.valueOf(this.f35580a.size()));
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f35580a.values());
            this.f35580a.clear();
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w5.e eVar = (w5.e) arrayList.get(i10);
            if (eVar != null) {
                eVar.close();
            }
        }
    }

    public synchronized boolean b(t3.d dVar) {
        y3.k.g(dVar);
        if (this.f35580a.containsKey(dVar)) {
            w5.e eVar = this.f35580a.get(dVar);
            synchronized (eVar) {
                if (w5.e.r0(eVar)) {
                    return true;
                }
                this.f35580a.remove(dVar);
                z3.a.E(f35579b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                return false;
            }
        }
        return false;
    }

    public synchronized w5.e c(t3.d dVar) {
        y3.k.g(dVar);
        w5.e eVar = this.f35580a.get(dVar);
        if (eVar != null) {
            synchronized (eVar) {
                if (!w5.e.r0(eVar)) {
                    this.f35580a.remove(dVar);
                    z3.a.E(f35579b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(eVar)), dVar.a(), Integer.valueOf(System.identityHashCode(dVar)));
                    return null;
                }
                eVar = w5.e.b(eVar);
            }
        }
        return eVar;
    }

    public synchronized void f(t3.d dVar, w5.e eVar) {
        y3.k.g(dVar);
        y3.k.b(Boolean.valueOf(w5.e.r0(eVar)));
        w5.e.d(this.f35580a.put(dVar, w5.e.b(eVar)));
        e();
    }

    public boolean g(t3.d dVar) {
        w5.e remove;
        y3.k.g(dVar);
        synchronized (this) {
            remove = this.f35580a.remove(dVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.q0();
        } finally {
            remove.close();
        }
    }

    public synchronized boolean h(t3.d dVar, w5.e eVar) {
        y3.k.g(dVar);
        y3.k.g(eVar);
        y3.k.b(Boolean.valueOf(w5.e.r0(eVar)));
        w5.e eVar2 = this.f35580a.get(dVar);
        if (eVar2 == null) {
            return false;
        }
        c4.a<b4.g> h10 = eVar2.h();
        c4.a<b4.g> h11 = eVar.h();
        if (h10 != null && h11 != null && h10.y() == h11.y()) {
            this.f35580a.remove(dVar);
            c4.a.w(h11);
            c4.a.w(h10);
            w5.e.d(eVar2);
            e();
            return true;
        }
        c4.a.w(h11);
        c4.a.w(h10);
        w5.e.d(eVar2);
        return false;
    }
}
