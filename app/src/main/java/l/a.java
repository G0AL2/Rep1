package l;

import java.util.HashMap;
import java.util.Map;
import l.b;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f33621e = new HashMap<>();

    public boolean contains(K k10) {
        return this.f33621e.containsKey(k10);
    }

    @Override // l.b
    protected b.c<K, V> f(K k10) {
        return this.f33621e.get(k10);
    }

    @Override // l.b
    public V j(K k10, V v10) {
        b.c<K, V> f10 = f(k10);
        if (f10 != null) {
            return f10.f33627b;
        }
        this.f33621e.put(k10, i(k10, v10));
        return null;
    }

    @Override // l.b
    public V k(K k10) {
        V v10 = (V) super.k(k10);
        this.f33621e.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> l(K k10) {
        if (contains(k10)) {
            return this.f33621e.get(k10).f33629d;
        }
        return null;
    }
}
