package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.c0;
import com.fyber.inneractive.sdk.protobuf.q0;
import com.fyber.inneractive.sdk.protobuf.t1;
import com.fyber.inneractive.sdk.protobuf.u.a;
import com.fyber.inneractive.sdk.protobuf.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final u f20049d;

    /* renamed from: a  reason: collision with root package name */
    public final i1<T, Object> f20050a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20051b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20052c;

    /* loaded from: classes2.dex */
    public interface a<T extends a<T>> extends Comparable<T> {
        int a();

        q0.a a(q0.a aVar, q0 q0Var);

        boolean b();

        t1.b c();

        t1.c d();

        boolean e();
    }

    static {
        u uVar = new u(i1.b(0));
        uVar.g();
        f20049d = uVar;
    }

    public u() {
        this.f20050a = i1.b(16);
    }

    public static <T extends a<T>> u<T> b() {
        return f20049d;
    }

    /* renamed from: a */
    public u<T> clone() {
        u<T> uVar = new u<>();
        for (int i10 = 0; i10 < this.f20050a.f19895b.size(); i10++) {
            Map.Entry<T, Object> a10 = this.f20050a.a(i10);
            uVar.c(a10.getKey(), a10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f20050a.b()) {
            uVar.c(entry.getKey(), entry.getValue());
        }
        uVar.f20052c = this.f20052c;
        return uVar;
    }

    public void c(T t10, Object obj) {
        if (t10.b()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d(t10, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(t10, obj);
        }
        if (obj instanceof c0) {
            this.f20052c = true;
        }
        this.f20050a.put(t10, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.z.c) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        if ((r7 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.c0) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.protobuf.t1$b r0 = r6.c()
            java.nio.charset.Charset r1 = com.fyber.inneractive.sdk.protobuf.z.f20078a
            r7.getClass()
            com.fyber.inneractive.sdk.protobuf.t1$c r0 = r0.f20033a
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L43
        L15:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.q0
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.c0
            if (r0 == 0) goto L43
            goto L2f
        L1e:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.z.c
            if (r0 == 0) goto L43
            goto L2f
        L27:
            boolean r0 = r7 instanceof com.fyber.inneractive.sdk.protobuf.i
            if (r0 != 0) goto L2f
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L43
        L2f:
            r0 = 1
            goto L44
        L31:
            boolean r0 = r7 instanceof java.lang.String
            goto L44
        L34:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L44
        L37:
            boolean r0 = r7 instanceof java.lang.Double
            goto L44
        L3a:
            boolean r0 = r7 instanceof java.lang.Float
            goto L44
        L3d:
            boolean r0 = r7 instanceof java.lang.Long
            goto L44
        L40:
            boolean r0 = r7 instanceof java.lang.Integer
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r6.a()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            com.fyber.inneractive.sdk.protobuf.t1$b r6 = r6.c()
            com.fyber.inneractive.sdk.protobuf.t1$c r6 = r6.f20033a
            r3[r2] = r6
            java.lang.Class r6 = r7.getClass()
            java.lang.String r6 = r6.getName()
            r7 = 2
            r3[r7] = r6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.u.d(com.fyber.inneractive.sdk.protobuf.u$a, java.lang.Object):void");
    }

    public boolean e() {
        for (int i10 = 0; i10 < this.f20050a.f19895b.size(); i10++) {
            if (!b(this.f20050a.a(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f20050a.b()) {
            if (!b(entry)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f20050a.equals(((u) obj).f20050a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> f() {
        if (this.f20052c) {
            return new c0.b(this.f20050a.entrySet().iterator());
        }
        return this.f20050a.entrySet().iterator();
    }

    public void g() {
        if (this.f20051b) {
            return;
        }
        this.f20050a.d();
        this.f20051b = true;
    }

    public int hashCode() {
        return this.f20050a.hashCode();
    }

    public static <T extends a<T>> boolean b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.d() == t1.c.MESSAGE) {
            if (key.b()) {
                for (q0 q0Var : (List) entry.getValue()) {
                    if (!q0Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof q0) {
                    if (!((q0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public u(i1<T, Object> i1Var) {
        this.f20050a = i1Var;
        g();
    }

    public static int a(t1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.f20034b;
    }

    public Object a(T t10) {
        Object obj = this.f20050a.get(t10);
        return obj instanceof c0 ? ((c0) obj).a(null) : obj;
    }

    public static int b(a<?> aVar, Object obj) {
        t1.b c10 = aVar.c();
        int a10 = aVar.a();
        if (aVar.b()) {
            int i10 = 0;
            if (aVar.e()) {
                for (Object obj2 : (List) obj) {
                    i10 += a(c10, obj2);
                }
                return l.b(a10) + i10 + l.c(i10);
            }
            for (Object obj3 : (List) obj) {
                i10 += a(c10, a10, obj3);
            }
            return i10;
        }
        return a(c10, a10, obj);
    }

    public final void c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).a(null);
        }
        if (key.b()) {
            Object a10 = a((u<T>) key);
            if (a10 == null) {
                a10 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a10).add(a(obj));
            }
            this.f20050a.put(key, a10);
        } else if (key.d() == t1.c.MESSAGE) {
            Object a11 = a((u<T>) key);
            if (a11 == null) {
                this.f20050a.put(key, a(value));
                return;
            }
            this.f20050a.put(key, ((GeneratedMessageLite.a) key.a(((q0) a11).toBuilder(), (q0) value)).a());
        } else {
            this.f20050a.put(key, a(value));
        }
    }

    public void a(T t10, Object obj) {
        List list;
        if (((GeneratedMessageLite.c) t10).f19809d) {
            d(t10, obj);
            Object a10 = a((u<T>) t10);
            if (a10 == null) {
                list = new ArrayList();
                this.f20050a.put(t10, list);
            } else {
                list = (List) a10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int d() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20050a.f19895b.size(); i11++) {
            Map.Entry<T, Object> a10 = this.f20050a.a(i11);
            i10 += b(a10.getKey(), a10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f20050a.b()) {
            i10 += b(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    public void a(u<T> uVar) {
        for (int i10 = 0; i10 < uVar.f20050a.f19895b.size(); i10++) {
            c(uVar.f20050a.a(i10));
        }
        for (Map.Entry<T, Object> entry : uVar.f20050a.b()) {
            c(entry);
        }
    }

    public static Object a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public final int a(Map.Entry<T, Object> entry) {
        int b10;
        int c10;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.d() == t1.c.MESSAGE && !key.b() && !key.e()) {
            if (value instanceof c0) {
                b10 = (l.b(1) * 2) + l.f(2, entry.getKey().a());
                c10 = l.b(3) + l.a((c0) value);
            } else {
                b10 = (l.b(1) * 2) + l.f(2, entry.getKey().a());
                int b11 = l.b(3);
                int serializedSize = ((q0) value).getSerializedSize();
                c10 = b11 + l.c(serializedSize) + serializedSize;
            }
            return b10 + c10;
        }
        return b(key, value);
    }

    public int c() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f20050a.f19895b.size(); i11++) {
            i10 += a((Map.Entry) this.f20050a.a(i11));
        }
        for (Map.Entry<T, Object> entry : this.f20050a.b()) {
            i10 += a((Map.Entry) entry);
        }
        return i10;
    }

    public static int a(t1.b bVar, int i10, Object obj) {
        int b10 = l.b(i10);
        if (bVar == t1.b.f20023l) {
            b10 *= 2;
        }
        return b10 + a(bVar, obj);
    }

    public static int a(t1.b bVar, Object obj) {
        int serializedSize;
        int c10;
        switch (bVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = l.f19945b;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = l.f19945b;
                return 4;
            case 2:
                return l.a(((Long) obj).longValue());
            case 3:
                return l.a(((Long) obj).longValue());
            case 4:
                return l.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = l.f19945b;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = l.f19945b;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = l.f19945b;
                return 1;
            case 8:
                if (obj instanceof i) {
                    return l.a((i) obj);
                }
                return l.a((String) obj);
            case 9:
                Logger logger6 = l.f19945b;
                return ((q0) obj).getSerializedSize();
            case 10:
                if (obj instanceof c0) {
                    return l.a((c0) obj);
                }
                Logger logger7 = l.f19945b;
                serializedSize = ((q0) obj).getSerializedSize();
                c10 = l.c(serializedSize);
                break;
            case 11:
                if (obj instanceof i) {
                    return l.a((i) obj);
                }
                Logger logger8 = l.f19945b;
                serializedSize = ((byte[]) obj).length;
                c10 = l.c(serializedSize);
                break;
            case 12:
                return l.c(((Integer) obj).intValue());
            case 13:
                if (obj instanceof z.c) {
                    return l.a(((z.c) obj).a());
                }
                return l.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = l.f19945b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = l.f19945b;
                return 8;
            case 16:
                return l.c(l.d(((Integer) obj).intValue()));
            case 17:
                return l.a(l.b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c10 + serializedSize;
    }
}
