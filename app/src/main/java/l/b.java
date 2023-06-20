package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f33622a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f33623b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f33624c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f33625d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f33629d;
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f33628c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: l.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0437b<K, V> extends e<K, V> {
        C0437b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // l.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f33628c;
        }

        @Override // l.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f33629d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f33626a;

        /* renamed from: b  reason: collision with root package name */
        final V f33627b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f33628c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f33629d;

        c(K k10, V v10) {
            this.f33626a = k10;
            this.f33627b = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f33626a.equals(cVar.f33626a) && this.f33627b.equals(cVar.f33627b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f33626a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f33627b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f33626a.hashCode() ^ this.f33627b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f33626a + "=" + this.f33627b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f33630a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33631b = true;

        d() {
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f33630a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f33629d;
                this.f33630a = cVar3;
                this.f33631b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f33631b) {
                this.f33631b = false;
                this.f33630a = b.this.f33622a;
            } else {
                c<K, V> cVar = this.f33630a;
                this.f33630a = cVar != null ? cVar.f33628c : null;
            }
            return this.f33630a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33631b) {
                return b.this.f33622a != null;
            }
            c<K, V> cVar = this.f33630a;
            return (cVar == null || cVar.f33628c == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f33633a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f33634b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f33633a = cVar2;
            this.f33634b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f33634b;
            c<K, V> cVar2 = this.f33633a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // l.b.f
        public void a(c<K, V> cVar) {
            if (this.f33633a == cVar && cVar == this.f33634b) {
                this.f33634b = null;
                this.f33633a = null;
            }
            c<K, V> cVar2 = this.f33633a;
            if (cVar2 == cVar) {
                this.f33633a = b(cVar2);
            }
            if (this.f33634b == cVar) {
                this.f33634b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f33634b;
            this.f33634b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33634b != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0437b c0437b = new C0437b(this.f33623b, this.f33622a);
        this.f33624c.put(c0437b, Boolean.FALSE);
        return c0437b;
    }

    public Map.Entry<K, V> e() {
        return this.f33622a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    protected c<K, V> f(K k10) {
        c<K, V> cVar = this.f33622a;
        while (cVar != null && !cVar.f33626a.equals(k10)) {
            cVar = cVar.f33628c;
        }
        return cVar;
    }

    public b<K, V>.d g() {
        b<K, V>.d dVar = new d();
        this.f33624c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f33623b;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> i(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f33625d++;
        c<K, V> cVar2 = this.f33623b;
        if (cVar2 == null) {
            this.f33622a = cVar;
            this.f33623b = cVar;
            return cVar;
        }
        cVar2.f33628c = cVar;
        cVar.f33629d = cVar2;
        this.f33623b = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f33622a, this.f33623b);
        this.f33624c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k10, V v10) {
        c<K, V> f10 = f(k10);
        if (f10 != null) {
            return f10.f33627b;
        }
        i(k10, v10);
        return null;
    }

    public V k(K k10) {
        c<K, V> f10 = f(k10);
        if (f10 == null) {
            return null;
        }
        this.f33625d--;
        if (!this.f33624c.isEmpty()) {
            for (f<K, V> fVar : this.f33624c.keySet()) {
                fVar.a(f10);
            }
        }
        c<K, V> cVar = f10.f33629d;
        if (cVar != null) {
            cVar.f33628c = f10.f33628c;
        } else {
            this.f33622a = f10.f33628c;
        }
        c<K, V> cVar2 = f10.f33628c;
        if (cVar2 != null) {
            cVar2.f33629d = cVar;
        } else {
            this.f33623b = cVar;
        }
        f10.f33628c = null;
        f10.f33629d = null;
        return f10.f33627b;
    }

    public int size() {
        return this.f33625d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
