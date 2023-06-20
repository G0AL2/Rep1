package pb;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rb.a;

/* compiled from: FirebaseABTesting.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final sc.b<rb.a> f35718a;

    /* renamed from: b  reason: collision with root package name */
    private final String f35719b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f35720c = null;

    public c(Context context, sc.b<rb.a> bVar, String str) {
        this.f35718a = bVar;
        this.f35719b = str;
    }

    private void a(a.c cVar) {
        this.f35718a.get().c(cVar);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int g10 = g();
        for (b bVar : list) {
            while (arrayDeque.size() >= g10) {
                i(((a.c) arrayDeque.pollFirst()).f36545b);
            }
            a.c d10 = bVar.d(this.f35719b);
            a(d10);
            arrayDeque.offer(d10);
        }
    }

    private static List<b> c(List<Map<String, String>> list) throws a {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(b.a(map));
        }
        return arrayList;
    }

    private List<a.c> d() {
        return this.f35718a.get().f(this.f35719b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!set.contains(bVar.b())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> f(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f36545b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f35720c == null) {
            this.f35720c = Integer.valueOf(this.f35718a.get().e(this.f35719b));
        }
        return this.f35720c.intValue();
    }

    private void i(String str) {
        this.f35718a.get().clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection<a.c> collection) {
        for (a.c cVar : collection) {
            i(cVar.f36545b);
        }
    }

    private void l(List<b> list) throws a {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (b bVar : list) {
            hashSet.add(bVar.b());
        }
        List<a.c> d10 = d();
        HashSet hashSet2 = new HashSet();
        for (a.c cVar : d10) {
            hashSet2.add(cVar.f36545b);
        }
        j(f(d10, hashSet));
        b(e(list, hashSet2));
    }

    private void m() throws a {
        if (this.f35718a.get() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() throws a {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) throws a {
        m();
        if (list != null) {
            l(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
