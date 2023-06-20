package p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CountingLruMap.java */
/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final y<V> f35546a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<K, V> f35547b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private int f35548c = 0;

    public h(y<V> yVar) {
        this.f35546a = yVar;
    }

    private int f(V v10) {
        if (v10 == null) {
            return 0;
        }
        return this.f35546a.a(v10);
    }

    public synchronized V a(K k10) {
        return this.f35547b.get(k10);
    }

    public synchronized int b() {
        return this.f35547b.size();
    }

    public synchronized K c() {
        return this.f35547b.isEmpty() ? null : this.f35547b.keySet().iterator().next();
    }

    public synchronized ArrayList<Map.Entry<K, V>> d(y3.l<K> lVar) {
        ArrayList<Map.Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f35547b.entrySet().size());
        for (Map.Entry<K, V> entry : this.f35547b.entrySet()) {
            if (lVar == null || lVar.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    public synchronized int e() {
        return this.f35548c;
    }

    public synchronized V g(K k10, V v10) {
        V remove;
        remove = this.f35547b.remove(k10);
        this.f35548c -= f(remove);
        this.f35547b.put(k10, v10);
        this.f35548c += f(v10);
        return remove;
    }

    public synchronized V h(K k10) {
        V remove;
        remove = this.f35547b.remove(k10);
        this.f35548c -= f(remove);
        return remove;
    }

    public synchronized ArrayList<V> i(y3.l<K> lVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it = this.f35547b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (lVar == null || lVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f35548c -= f(next.getValue());
                it.remove();
            }
        }
        return arrayList;
    }
}
