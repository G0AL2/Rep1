package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19893g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f19894a;

    /* renamed from: b  reason: collision with root package name */
    public List<i1<K, V>.c> f19895b;

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f19896c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19897d;

    /* renamed from: e  reason: collision with root package name */
    public volatile i1<K, V>.e f19898e;

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f19899f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes2.dex */
    public class a<FieldDescriptorType> extends i1<FieldDescriptorType, Object> {
        public a(int i10) {
            super(i10, null);
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i1
        public void d() {
            if (!this.f19897d) {
                for (int i10 = 0; i10 < this.f19895b.size(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> a10 = a(i10);
                    if (((u.a) a10.getKey()).b()) {
                        a10.setValue(Collections.unmodifiableList((List) a10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : b()) {
                    if (((u.a) entry.getKey()).b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.d();
        }

        @Override // com.fyber.inneractive.sdk.protobuf.i1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f19900a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Iterable<Object> f19901b = new C0267b();

        /* loaded from: classes2.dex */
        public class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0267b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f19900a;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Map.Entry<K, V>, Comparable<i1<K, V>.c> {

        /* renamed from: a  reason: collision with root package name */
        public final K f19902a;

        /* renamed from: b  reason: collision with root package name */
        public V f19903b;

        public c(K k10, V v10) {
            this.f19902a = k10;
            this.f19903b = v10;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f19902a.compareTo(((c) obj).f19902a);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f19902a;
                Object key = entry.getKey();
                if (k10 == null) {
                    equals = key == null;
                } else {
                    equals = k10.equals(key);
                }
                if (equals) {
                    V v10 = this.f19903b;
                    Object value = entry.getValue();
                    if (v10 == null) {
                        equals2 = value == null;
                    } else {
                        equals2 = v10.equals(value);
                    }
                    if (equals2) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f19902a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f19903b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f19902a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f19903b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i1 i1Var = i1.this;
            int i10 = i1.f19893g;
            i1Var.a();
            V v11 = this.f19903b;
            this.f19903b = v10;
            return v11;
        }

        public String toString() {
            return this.f19902a + "=" + this.f19903b;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public int f19905a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f19906b;

        /* renamed from: c  reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f19907c;

        public d() {
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.f19907c == null) {
                this.f19907c = i1.this.f19896c.entrySet().iterator();
            }
            return this.f19907c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19905a + 1 >= i1.this.f19895b.size()) {
                return !i1.this.f19896c.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            this.f19906b = true;
            int i10 = this.f19905a + 1;
            this.f19905a = i10;
            if (i10 < i1.this.f19895b.size()) {
                return i1.this.f19895b.get(this.f19905a);
            }
            return b().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f19906b) {
                this.f19906b = false;
                i1 i1Var = i1.this;
                int i10 = i1.f19893g;
                i1Var.a();
                if (this.f19905a < i1.this.f19895b.size()) {
                    i1 i1Var2 = i1.this;
                    int i11 = this.f19905a;
                    this.f19905a = i11 - 1;
                    i1Var2.c(i11);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* loaded from: classes2.dex */
    public class e extends AbstractSet<Map.Entry<K, V>> {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            i1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                i1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i1.this.size();
        }
    }

    public /* synthetic */ i1(int i10, a aVar) {
        this(i10);
    }

    public static <FieldDescriptorType extends u.a<FieldDescriptorType>> i1<FieldDescriptorType, Object> b(int i10) {
        return new a(i10);
    }

    public Map.Entry<K, V> a(int i10) {
        return this.f19895b.get(i10);
    }

    public final V c(int i10) {
        a();
        V v10 = this.f19895b.remove(i10).f19903b;
        if (!this.f19896c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = c().entrySet().iterator();
            List<i1<K, V>.c> list = this.f19895b;
            Map.Entry<K, V> next = it.next();
            list.add(new c(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        a();
        if (!this.f19895b.isEmpty()) {
            this.f19895b.clear();
        }
        if (this.f19896c.isEmpty()) {
            return;
        }
        this.f19896c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((i1<K, V>) comparable) >= 0 || this.f19896c.containsKey(comparable);
    }

    public void d() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f19897d) {
            return;
        }
        if (this.f19896c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f19896c);
        }
        this.f19896c = unmodifiableMap;
        if (this.f19899f.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f19899f);
        }
        this.f19899f = unmodifiableMap2;
        this.f19897d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f19898e == null) {
            this.f19898e = new e();
        }
        return this.f19898e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int size2 = this.f19895b.size();
        if (size2 != i1Var.f19895b.size()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!a(i10).equals(i1Var.a(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f19896c.equals(i1Var.f19896c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a((i1<K, V>) comparable);
        if (a10 >= 0) {
            return this.f19895b.get(a10).f19903b;
        }
        return this.f19896c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int size = this.f19895b.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f19895b.get(i11).hashCode();
        }
        return this.f19896c.size() > 0 ? i10 + this.f19896c.hashCode() : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int a10 = a((i1<K, V>) comparable);
        if (a10 >= 0) {
            return (V) c(a10);
        }
        if (this.f19896c.isEmpty()) {
            return null;
        }
        return this.f19896c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f19895b.size() + this.f19896c.size();
    }

    public i1(int i10) {
        this.f19894a = i10;
        this.f19895b = Collections.emptyList();
        this.f19896c = Collections.emptyMap();
        this.f19899f = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public V put(K k10, V v10) {
        a();
        int a10 = a((i1<K, V>) k10);
        if (a10 >= 0) {
            i1<K, V>.c cVar = this.f19895b.get(a10);
            i1.this.a();
            V v11 = cVar.f19903b;
            cVar.f19903b = v10;
            return v11;
        }
        a();
        if (this.f19895b.isEmpty() && !(this.f19895b instanceof ArrayList)) {
            this.f19895b = new ArrayList(this.f19894a);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f19894a) {
            return c().put(k10, v10);
        }
        int size = this.f19895b.size();
        int i11 = this.f19894a;
        if (size == i11) {
            i1<K, V>.c remove = this.f19895b.remove(i11 - 1);
            c().put(remove.f19902a, remove.f19903b);
        }
        this.f19895b.add(i10, new c(k10, v10));
        return null;
    }

    public Iterable<Map.Entry<K, V>> b() {
        if (this.f19896c.isEmpty()) {
            return (Iterable<Map.Entry<K, V>>) b.f19901b;
        }
        return this.f19896c.entrySet();
    }

    public final SortedMap<K, V> c() {
        a();
        if (this.f19896c.isEmpty() && !(this.f19896c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19896c = treeMap;
            this.f19899f = treeMap.descendingMap();
        }
        return (SortedMap) this.f19896c;
    }

    public final int a(K k10) {
        int size = this.f19895b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f19895b.get(size).f19902a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f19895b.get(i11).f19902a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    public final void a() {
        if (this.f19897d) {
            throw new UnsupportedOperationException();
        }
    }
}
