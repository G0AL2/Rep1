package jb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Multimaps.java */
/* loaded from: classes3.dex */
public final class d0 {

    /* compiled from: Multimaps.java */
    /* loaded from: classes3.dex */
    private static class a<K, V> extends c<K, V> {

        /* renamed from: g  reason: collision with root package name */
        transient ib.q<? extends List<V>> f32979g;

        a(Map<K, Collection<V>> map, ib.q<? extends List<V>> qVar) {
            super(map);
            this.f32979g = (ib.q) ib.l.j(qVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // jb.d
        /* renamed from: B */
        public List<V> r() {
            return this.f32979g.get();
        }

        @Override // jb.f
        Map<K, Collection<V>> d() {
            return t();
        }

        @Override // jb.f
        Set<K> f() {
            return u();
        }
    }

    /* compiled from: Multimaps.java */
    /* loaded from: classes3.dex */
    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return e().b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        abstract b0<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return e().remove(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(b0<?, ?> b0Var, Object obj) {
        if (obj == b0Var) {
            return true;
        }
        if (obj instanceof b0) {
            return b0Var.asMap().equals(((b0) obj).asMap());
        }
        return false;
    }

    public static <K, V> x<K, V> b(Map<K, Collection<V>> map, ib.q<? extends List<V>> qVar) {
        return new a(map, qVar);
    }
}
