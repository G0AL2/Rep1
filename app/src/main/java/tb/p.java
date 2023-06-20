package tb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes3.dex */
class p {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final d<?> f37293a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f37294b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f37295c = new HashSet();

        b(d<?> dVar) {
            this.f37293a = dVar;
        }

        void a(b bVar) {
            this.f37294b.add(bVar);
        }

        void b(b bVar) {
            this.f37295c.add(bVar);
        }

        d<?> c() {
            return this.f37293a;
        }

        Set<b> d() {
            return this.f37294b;
        }

        boolean e() {
            return this.f37294b.isEmpty();
        }

        boolean f() {
            return this.f37295c.isEmpty();
        }

        void g(b bVar) {
            this.f37295c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CycleDetector.java */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f37296a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f37297b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.f37296a.equals(this.f37296a) && cVar.f37297b == this.f37297b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.f37296a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f37297b).hashCode();
        }

        private c(Class<?> cls, boolean z10) {
            this.f37296a = cls;
            this.f37297b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<d<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b10.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c10) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (d<?> dVar : list) {
            b bVar = new b(dVar);
            for (Class<? super Object> cls : dVar.g()) {
                c cVar = new c(cls, !dVar.m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f37297b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (q qVar : bVar2.c().e()) {
                    if (qVar.e() && (set = (Set) hashMap.get(new c(qVar.c(), qVar.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
