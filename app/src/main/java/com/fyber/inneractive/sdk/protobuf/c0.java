package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class c0 extends d0 {

    /* loaded from: classes2.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, c0> f19844a;

        public a(Map.Entry<K, c0> entry) {
            this.f19844a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f19844a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            c0 value = this.f19844a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q0) {
                c0 value = this.f19844a.getValue();
                q0 q0Var = value.f19851a;
                value.f19852b = null;
                value.f19851a = (q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes2.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f19845a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f19845a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19845a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.f19845a.next();
            return next.getValue() instanceof c0 ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f19845a.remove();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d0
    public int hashCode() {
        return a(null).hashCode();
    }

    public String toString() {
        return a(null).toString();
    }
}
