package jb;

import com.google.android.gms.common.api.Api;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jb.q0;

/* compiled from: Maps.java */
/* loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public class a<K, V> extends s0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // jb.s0
        /* renamed from: b */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public static abstract class b implements ib.f<Map.Entry<?, ?>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f32927a = new a("KEY", 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f32928b = new C0415b("VALUE", 1);

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ b[] f32929c = f();

        /* compiled from: Maps.java */
        /* loaded from: classes3.dex */
        enum a extends b {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ib.f
            /* renamed from: g */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* compiled from: Maps.java */
        /* renamed from: jb.a0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0415b extends b {
            C0415b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // ib.f
            /* renamed from: g */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i10) {
        }

        private static /* synthetic */ b[] f() {
            return new b[]{f32927a, f32928b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f32929c.clone();
        }

        /* synthetic */ b(String str, int i10, z zVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public static abstract class c<K, V> extends q0.d<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        abstract Map<K, V> e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // jb.q0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ib.l.j(collection));
            } catch (UnsupportedOperationException unused) {
                return q0.j(this, collection.iterator());
            }
        }

        @Override // jb.q0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ib.l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = q0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g10.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(g10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends q0.d<K> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f32930a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Map<K, V> map) {
            this.f32930a = (Map) ib.l.j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e().containsKey(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Map<K, V> e() {
            return this.f32930a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f32931a;

        e(Map<K, V> map) {
            this.f32931a = (Map) ib.l.j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        final Map<K, V> e() {
            return this.f32931a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return a0.k(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (ib.i.a(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) ib.l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = q0.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) ib.l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = q0.f();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(f10);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Maps.java */
    /* loaded from: classes3.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f32932a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection<V> f32933b;

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f32932a;
            if (set == null) {
                Set<Map.Entry<K, V>> a10 = a();
                this.f32932a = a10;
                return a10;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f32933b;
            if (collection == null) {
                Collection<V> c10 = c();
                this.f32933b = c10;
                return c10;
            }
            return collection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        h.b(i10, "expectedSize");
        return i10 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Map<?, ?> map, Object obj) {
        return w.e(k(map.entrySet().iterator()), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new r(k10, v10);
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(Map<?, ?> map, Object obj) {
        ib.l.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V g(Map<?, V> map, Object obj) {
        ib.l.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> V h(Map<?, V> map, Object obj) {
        ib.l.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(Map<?, ?> map) {
        StringBuilder b10 = i.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            z10 = false;
            b10.append(entry.getKey());
            b10.append('=');
            b10.append(entry.getValue());
        }
        b10.append('}');
        return b10.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> ib.f<Map.Entry<?, V>, V> j() {
        return b.f32928b;
    }

    static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
