package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Api;
import java.util.Set;
import y3.p;
import z5.s;
import z5.t;

/* compiled from: BasePool.java */
/* loaded from: classes.dex */
public abstract class b<V> implements b4.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f14824a;

    /* renamed from: b  reason: collision with root package name */
    final b4.c f14825b;

    /* renamed from: c  reason: collision with root package name */
    final s f14826c;

    /* renamed from: d  reason: collision with root package name */
    final SparseArray<com.facebook.imagepipeline.memory.c<V>> f14827d;

    /* renamed from: e  reason: collision with root package name */
    final Set<V> f14828e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14829f;

    /* renamed from: g  reason: collision with root package name */
    final a f14830g;

    /* renamed from: h  reason: collision with root package name */
    final a f14831h;

    /* renamed from: i  reason: collision with root package name */
    private final t f14832i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14833j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BasePool.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f14834a;

        /* renamed from: b  reason: collision with root package name */
        int f14835b;

        a() {
        }

        public void a(int i10) {
            int i11;
            int i12 = this.f14835b;
            if (i12 >= i10 && (i11 = this.f14834a) > 0) {
                this.f14834a = i11 - 1;
                this.f14835b = i12 - i10;
                return;
            }
            z3.a.M("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i10), Integer.valueOf(this.f14835b), Integer.valueOf(this.f14834a));
        }

        public void b(int i10) {
            this.f14834a++;
            this.f14835b += i10;
        }
    }

    /* compiled from: BasePool.java */
    /* renamed from: com.facebook.imagepipeline.memory.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0197b extends RuntimeException {
        public C0197b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* compiled from: BasePool.java */
    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c(int i10, int i11, int i12, int i13) {
            super("Pool hard cap violation? Hard cap = " + i10 + " Used size = " + i11 + " Free size = " + i12 + " Request size = " + i13);
        }
    }

    public b(b4.c cVar, s sVar, t tVar) {
        this.f14824a = getClass();
        this.f14825b = (b4.c) y3.k.g(cVar);
        s sVar2 = (s) y3.k.g(sVar);
        this.f14826c = sVar2;
        this.f14832i = (t) y3.k.g(tVar);
        this.f14827d = new SparseArray<>();
        if (sVar2.f40058d) {
            q();
        } else {
            u(new SparseIntArray(0));
        }
        this.f14828e = y3.m.b();
        this.f14831h = new a();
        this.f14830g = new a();
    }

    private synchronized void h() {
        boolean z10;
        if (s() && this.f14831h.f14835b != 0) {
            z10 = false;
            y3.k.i(z10);
        }
        z10 = true;
        y3.k.i(z10);
    }

    private void i(SparseIntArray sparseIntArray) {
        this.f14827d.clear();
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int keyAt = sparseIntArray.keyAt(i10);
            this.f14827d.put(keyAt, new com.facebook.imagepipeline.memory.c<>(o(keyAt), sparseIntArray.valueAt(i10), 0, this.f14826c.f40058d));
        }
    }

    private synchronized com.facebook.imagepipeline.memory.c<V> l(int i10) {
        return this.f14827d.get(i10);
    }

    private synchronized void q() {
        SparseIntArray sparseIntArray = this.f14826c.f40057c;
        if (sparseIntArray != null) {
            i(sparseIntArray);
            this.f14829f = false;
        } else {
            this.f14829f = true;
        }
    }

    private synchronized void u(SparseIntArray sparseIntArray) {
        y3.k.g(sparseIntArray);
        this.f14827d.clear();
        SparseIntArray sparseIntArray2 = this.f14826c.f40057c;
        if (sparseIntArray2 != null) {
            for (int i10 = 0; i10 < sparseIntArray2.size(); i10++) {
                int keyAt = sparseIntArray2.keyAt(i10);
                this.f14827d.put(keyAt, new com.facebook.imagepipeline.memory.c<>(o(keyAt), sparseIntArray2.valueAt(i10), sparseIntArray.get(keyAt, 0), this.f14826c.f40058d));
            }
            this.f14829f = false;
        } else {
            this.f14829f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void v() {
        if (z3.a.u(2)) {
            z3.a.z(this.f14824a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f14830g.f14834a), Integer.valueOf(this.f14830g.f14835b), Integer.valueOf(this.f14831h.f14834a), Integer.valueOf(this.f14831h.f14835b));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
        r2.b();
     */
    @Override // b4.e, c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(V r8) {
        /*
            r7 = this;
            y3.k.g(r8)
            int r0 = r7.n(r8)
            int r1 = r7.o(r0)
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.c r2 = r7.l(r0)     // Catch: java.lang.Throwable -> Lae
            java.util.Set<V> r3 = r7.f14828e     // Catch: java.lang.Throwable -> Lae
            boolean r3 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lae
            r4 = 2
            if (r3 != 0) goto L3d
            java.lang.Class<?> r2 = r7.f14824a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lae
            r5 = 0
            int r6 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r6     // Catch: java.lang.Throwable -> Lae
            r5 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            r4[r5] = r0     // Catch: java.lang.Throwable -> Lae
            z3.a.h(r2, r3, r4)     // Catch: java.lang.Throwable -> Lae
            r7.j(r8)     // Catch: java.lang.Throwable -> Lae
            z5.t r8 = r7.f14832i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L3d:
            if (r2 == 0) goto L7e
            boolean r3 = r2.f()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.s()     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L7e
            boolean r3 = r7.t(r8)     // Catch: java.lang.Throwable -> Lae
            if (r3 != 0) goto L52
            goto L7e
        L52:
            r2.h(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f14831h     // Catch: java.lang.Throwable -> Lae
            r2.b(r1)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r2 = r7.f14830g     // Catch: java.lang.Throwable -> Lae
            r2.a(r1)     // Catch: java.lang.Throwable -> Lae
            z5.t r2 = r7.f14832i     // Catch: java.lang.Throwable -> Lae
            r2.c(r1)     // Catch: java.lang.Throwable -> Lae
            boolean r1 = z3.a.u(r4)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto La9
            java.lang.Class<?> r1 = r7.f14824a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            z3.a.x(r1, r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            goto La9
        L7e:
            if (r2 == 0) goto L83
            r2.b()     // Catch: java.lang.Throwable -> Lae
        L83:
            boolean r2 = z3.a.u(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L9c
            java.lang.Class<?> r2 = r7.f14824a     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lae
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lae
            z3.a.x(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> Lae
        L9c:
            r7.j(r8)     // Catch: java.lang.Throwable -> Lae
            com.facebook.imagepipeline.memory.b$a r8 = r7.f14830g     // Catch: java.lang.Throwable -> Lae
            r8.a(r1)     // Catch: java.lang.Throwable -> Lae
            z5.t r8 = r7.f14832i     // Catch: java.lang.Throwable -> Lae
            r8.b(r1)     // Catch: java.lang.Throwable -> Lae
        La9:
            r7.v()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            return
        Lae:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.b.a(java.lang.Object):void");
    }

    protected abstract V f(int i10);

    synchronized boolean g(int i10) {
        if (this.f14833j) {
            return true;
        }
        s sVar = this.f14826c;
        int i11 = sVar.f40055a;
        int i12 = this.f14830g.f14835b;
        if (i10 > i11 - i12) {
            this.f14832i.g();
            return false;
        }
        int i13 = sVar.f40056b;
        if (i10 > i13 - (i12 + this.f14831h.f14835b)) {
            x(i13 - i10);
        }
        if (i10 > i11 - (this.f14830g.f14835b + this.f14831h.f14835b)) {
            this.f14832i.g();
            return false;
        }
        return true;
    }

    @Override // b4.e
    public V get(int i10) {
        V p10;
        h();
        int m10 = m(i10);
        synchronized (this) {
            com.facebook.imagepipeline.memory.c<V> k10 = k(m10);
            if (k10 != null && (p10 = p(k10)) != null) {
                y3.k.i(this.f14828e.add(p10));
                int n10 = n(p10);
                int o10 = o(n10);
                this.f14830g.b(o10);
                this.f14831h.a(o10);
                this.f14832i.e(o10);
                v();
                if (z3.a.u(2)) {
                    z3.a.x(this.f14824a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(p10)), Integer.valueOf(n10));
                }
                return p10;
            }
            int o11 = o(m10);
            if (g(o11)) {
                this.f14830g.b(o11);
                if (k10 != null) {
                    k10.e();
                }
                V v10 = null;
                try {
                    v10 = f(m10);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f14830g.a(o11);
                        com.facebook.imagepipeline.memory.c<V> k11 = k(m10);
                        if (k11 != null) {
                            k11.b();
                        }
                        p.c(th);
                    }
                }
                synchronized (this) {
                    y3.k.i(this.f14828e.add(v10));
                    y();
                    this.f14832i.d(o11);
                    v();
                    if (z3.a.u(2)) {
                        z3.a.x(this.f14824a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v10)), Integer.valueOf(m10));
                    }
                }
                return v10;
            }
            throw new c(this.f14826c.f40055a, this.f14830g.f14835b, this.f14831h.f14835b, o11);
        }
    }

    protected abstract void j(V v10);

    synchronized com.facebook.imagepipeline.memory.c<V> k(int i10) {
        com.facebook.imagepipeline.memory.c<V> cVar = this.f14827d.get(i10);
        if (cVar == null && this.f14829f) {
            if (z3.a.u(2)) {
                z3.a.w(this.f14824a, "creating new bucket %s", Integer.valueOf(i10));
            }
            com.facebook.imagepipeline.memory.c<V> w10 = w(i10);
            this.f14827d.put(i10, w10);
            return w10;
        }
        return cVar;
    }

    protected abstract int m(int i10);

    protected abstract int n(V v10);

    protected abstract int o(int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized V p(com.facebook.imagepipeline.memory.c<V> cVar) {
        return cVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        this.f14825b.a(this);
        this.f14832i.f(this);
    }

    synchronized boolean s() {
        boolean z10;
        z10 = this.f14830g.f14835b + this.f14831h.f14835b > this.f14826c.f40056b;
        if (z10) {
            this.f14832i.a();
        }
        return z10;
    }

    protected boolean t(V v10) {
        y3.k.g(v10);
        return true;
    }

    com.facebook.imagepipeline.memory.c<V> w(int i10) {
        return new com.facebook.imagepipeline.memory.c<>(o(i10), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, this.f14826c.f40058d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized void x(int i10) {
        int i11 = this.f14830g.f14835b;
        int i12 = this.f14831h.f14835b;
        int min = Math.min((i11 + i12) - i10, i12);
        if (min <= 0) {
            return;
        }
        if (z3.a.u(2)) {
            z3.a.y(this.f14824a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i10), Integer.valueOf(this.f14830g.f14835b + this.f14831h.f14835b), Integer.valueOf(min));
        }
        v();
        for (int i13 = 0; i13 < this.f14827d.size() && min > 0; i13++) {
            com.facebook.imagepipeline.memory.c cVar = (com.facebook.imagepipeline.memory.c) y3.k.g(this.f14827d.valueAt(i13));
            while (min > 0) {
                Object g10 = cVar.g();
                if (g10 == null) {
                    break;
                }
                j(g10);
                int i14 = cVar.f14836a;
                min -= i14;
                this.f14831h.a(i14);
            }
        }
        v();
        if (z3.a.u(2)) {
            z3.a.x(this.f14824a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i10), Integer.valueOf(this.f14830g.f14835b + this.f14831h.f14835b));
        }
    }

    synchronized void y() {
        if (s()) {
            x(this.f14826c.f40056b);
        }
    }

    public b(b4.c cVar, s sVar, t tVar, boolean z10) {
        this(cVar, sVar, tVar);
        this.f14833j = z10;
    }
}
