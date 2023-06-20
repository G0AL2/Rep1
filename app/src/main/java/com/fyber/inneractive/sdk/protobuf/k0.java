package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.z;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f19943b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19944a;

    static {
        k0 k0Var = new k0();
        f19943b = k0Var;
        k0Var.f19944a = false;
    }

    public k0() {
        this.f19944a = true;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = z.f20078a;
            int length = bArr.length;
            int i10 = length;
            for (int i11 = 0; i11 < 0 + length; i11++) {
                i10 = (i10 * 31) + bArr[i11];
            }
            if (i10 == 0) {
                return 1;
            }
            return i10;
        } else if (!(obj instanceof z.c)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            if (r6 != r7) goto Lb
            goto L5a
        Lb:
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L16
            goto L58
        L16:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L58
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
        L58:
            r7 = 0
            goto L5b
        L5a:
            r7 = 1
        L5b:
            if (r7 == 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.k0.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        a();
        Charset charset = z.f20078a;
        k10.getClass();
        v10.getClass();
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a();
        for (K k10 : map.keySet()) {
            Charset charset = z.f20078a;
            k10.getClass();
            map.get(k10).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        a();
        return (V) super.remove(obj);
    }

    public k0(Map<K, V> map) {
        super(map);
        this.f19944a = true;
    }

    public final void a() {
        if (!this.f19944a) {
            throw new UnsupportedOperationException();
        }
    }
}
