package p5;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p5.i;
import p5.s;

/* compiled from: LruCountingMemoryCache.java */
/* loaded from: classes.dex */
public class r<K, V> implements i<K, V>, s<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final i.b<K> f35562a;

    /* renamed from: b  reason: collision with root package name */
    final h<K, i.a<K, V>> f35563b;

    /* renamed from: c  reason: collision with root package name */
    final h<K, i.a<K, V>> f35564c;

    /* renamed from: d  reason: collision with root package name */
    private final y<V> f35565d;

    /* renamed from: e  reason: collision with root package name */
    private final y3.n<t> f35566e;

    /* renamed from: f  reason: collision with root package name */
    protected t f35567f;

    /* renamed from: g  reason: collision with root package name */
    private long f35568g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCountingMemoryCache.java */
    /* loaded from: classes.dex */
    public class a implements y<i.a<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f35569a;

        a(r rVar, y yVar) {
            this.f35569a = yVar;
        }

        @Override // p5.y
        /* renamed from: b */
        public int a(i.a<K, V> aVar) {
            return this.f35569a.a(aVar.f35550b.y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LruCountingMemoryCache.java */
    /* loaded from: classes.dex */
    public class b implements c4.h<V> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.a f35570a;

        b(i.a aVar) {
            this.f35570a = aVar;
        }

        @Override // c4.h
        public void a(V v10) {
            r.this.x(this.f35570a);
        }
    }

    public r(y<V> yVar, s.a aVar, y3.n<t> nVar, i.b<K> bVar) {
        new WeakHashMap();
        this.f35565d = yVar;
        this.f35563b = new h<>(z(yVar));
        this.f35564c = new h<>(z(yVar));
        this.f35566e = nVar;
        this.f35567f = (t) y3.k.h(nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f35568g = SystemClock.uptimeMillis();
        this.f35562a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (k() <= (r3.f35567f.f35572a - r4)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean h(V r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            p5.y<V> r0 = r3.f35565d     // Catch: java.lang.Throwable -> L28
            int r4 = r0.a(r4)     // Catch: java.lang.Throwable -> L28
            p5.t r0 = r3.f35567f     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f35576e     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r4 > r0) goto L25
            int r0 = r3.j()     // Catch: java.lang.Throwable -> L28
            p5.t r2 = r3.f35567f     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f35573b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r1
            if (r0 > r2) goto L25
            int r0 = r3.k()     // Catch: java.lang.Throwable -> L28
            p5.t r2 = r3.f35567f     // Catch: java.lang.Throwable -> L28
            int r2 = r2.f35572a     // Catch: java.lang.Throwable -> L28
            int r2 = r2 - r4
            if (r0 > r2) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            monitor-exit(r3)
            return r1
        L28:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.r.h(java.lang.Object):boolean");
    }

    private synchronized void i(i.a<K, V> aVar) {
        y3.k.g(aVar);
        y3.k.i(aVar.f35551c > 0);
        aVar.f35551c--;
    }

    private synchronized void l(i.a<K, V> aVar) {
        y3.k.g(aVar);
        y3.k.i(!aVar.f35552d);
        aVar.f35551c++;
    }

    private synchronized void m(i.a<K, V> aVar) {
        y3.k.g(aVar);
        y3.k.i(!aVar.f35552d);
        aVar.f35552d = true;
    }

    private synchronized void n(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m(it.next());
            }
        }
    }

    private synchronized boolean o(i.a<K, V> aVar) {
        if (aVar.f35552d || aVar.f35551c != 0) {
            return false;
        }
        this.f35563b.g(aVar.f35549a, aVar);
        return true;
    }

    private void p(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                c4.a.w(w(it.next()));
            }
        }
    }

    private static <K, V> void r(i.a<K, V> aVar) {
        i.b<K> bVar;
        if (aVar == null || (bVar = aVar.f35553e) == null) {
            return;
        }
        bVar.a(aVar.f35549a, true);
    }

    private void s(ArrayList<i.a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<i.a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                t(it.next());
            }
        }
    }

    private static <K, V> void t(i.a<K, V> aVar) {
        i.b<K> bVar;
        if (aVar == null || (bVar = aVar.f35553e) == null) {
            return;
        }
        bVar.a(aVar.f35549a, false);
    }

    private synchronized void u() {
        if (this.f35568g + this.f35567f.f35577f > SystemClock.uptimeMillis()) {
            return;
        }
        this.f35568g = SystemClock.uptimeMillis();
        this.f35567f = (t) y3.k.h(this.f35566e.get(), "mMemoryCacheParamsSupplier returned null");
    }

    private synchronized c4.a<V> v(i.a<K, V> aVar) {
        l(aVar);
        return c4.a.T(aVar.f35550b.y(), new b(aVar));
    }

    private synchronized c4.a<V> w(i.a<K, V> aVar) {
        y3.k.g(aVar);
        return (aVar.f35552d && aVar.f35551c == 0) ? aVar.f35550b : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(i.a<K, V> aVar) {
        boolean o10;
        c4.a<V> w10;
        y3.k.g(aVar);
        synchronized (this) {
            i(aVar);
            o10 = o(aVar);
            w10 = w(aVar);
        }
        c4.a.w(w10);
        if (!o10) {
            aVar = null;
        }
        r(aVar);
        u();
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", java.lang.Integer.valueOf(r4.f35563b.b()), java.lang.Integer.valueOf(r4.f35563b.e())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.ArrayList<p5.i.a<K, V>> y(int r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)     // Catch: java.lang.Throwable -> L74
            int r6 = java.lang.Math.max(r6, r0)     // Catch: java.lang.Throwable -> L74
            p5.h<K, p5.i$a<K, V>> r1 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.b()     // Catch: java.lang.Throwable -> L74
            if (r1 > r5) goto L1d
            p5.h<K, p5.i$a<K, V>> r1 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r1 = r1.e()     // Catch: java.lang.Throwable -> L74
            if (r1 > r6) goto L1d
            r5 = 0
            monitor-exit(r4)
            return r5
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
        L22:
            p5.h<K, p5.i$a<K, V>> r2 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.b()     // Catch: java.lang.Throwable -> L74
            if (r2 > r5) goto L35
            p5.h<K, p5.i$a<K, V>> r2 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.e()     // Catch: java.lang.Throwable -> L74
            if (r2 <= r6) goto L33
            goto L35
        L33:
            monitor-exit(r4)
            return r1
        L35:
            p5.h<K, p5.i$a<K, V>> r2 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L4c
            p5.h<K, p5.i$a<K, V>> r3 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            r3.h(r2)     // Catch: java.lang.Throwable -> L74
            p5.h<K, p5.i$a<K, V>> r3 = r4.f35564c     // Catch: java.lang.Throwable -> L74
            java.lang.Object r2 = r3.h(r2)     // Catch: java.lang.Throwable -> L74
            r1.add(r2)     // Catch: java.lang.Throwable -> L74
            goto L22
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "key is null, but exclusiveEntries count: %d, size: %d"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L74
            p5.h<K, p5.i$a<K, V>> r2 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.b()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            r1[r0] = r2     // Catch: java.lang.Throwable -> L74
            r0 = 1
            p5.h<K, p5.i$a<K, V>> r2 = r4.f35563b     // Catch: java.lang.Throwable -> L74
            int r2 = r2.e()     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74
            r1[r0] = r2     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = java.lang.String.format(r6, r1)     // Catch: java.lang.Throwable -> L74
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74
            throw r5     // Catch: java.lang.Throwable -> L74
        L74:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.r.y(int, int):java.util.ArrayList");
    }

    private y<i.a<K, V>> z(y<V> yVar) {
        return new a(this, yVar);
    }

    @Override // p5.s
    public void b(K k10) {
        y3.k.g(k10);
        synchronized (this) {
            i.a<K, V> h10 = this.f35563b.h(k10);
            if (h10 != null) {
                this.f35563b.g(k10, h10);
            }
        }
    }

    @Override // p5.s
    public int c(y3.l<K> lVar) {
        ArrayList<i.a<K, V>> i10;
        ArrayList<i.a<K, V>> i11;
        synchronized (this) {
            i10 = this.f35563b.i(lVar);
            i11 = this.f35564c.i(lVar);
            n(i11);
        }
        p(i11);
        s(i10);
        u();
        q();
        return i11.size();
    }

    @Override // p5.s
    public synchronized boolean d(y3.l<K> lVar) {
        return !this.f35564c.d(lVar).isEmpty();
    }

    @Override // p5.s
    public c4.a<V> e(K k10, c4.a<V> aVar) {
        return g(k10, aVar, this.f35562a);
    }

    public c4.a<V> g(K k10, c4.a<V> aVar, i.b<K> bVar) {
        i.a<K, V> h10;
        c4.a<V> aVar2;
        c4.a<V> aVar3;
        y3.k.g(k10);
        y3.k.g(aVar);
        u();
        synchronized (this) {
            h10 = this.f35563b.h(k10);
            i.a<K, V> h11 = this.f35564c.h(k10);
            aVar2 = null;
            if (h11 != null) {
                m(h11);
                aVar3 = w(h11);
            } else {
                aVar3 = null;
            }
            if (h(aVar.y())) {
                i.a<K, V> a10 = i.a.a(k10, aVar, bVar);
                this.f35564c.g(k10, a10);
                aVar2 = v(a10);
            }
        }
        c4.a.w(aVar3);
        t(h10);
        q();
        return aVar2;
    }

    @Override // p5.s
    public c4.a<V> get(K k10) {
        i.a<K, V> h10;
        c4.a<V> v10;
        y3.k.g(k10);
        synchronized (this) {
            h10 = this.f35563b.h(k10);
            i.a<K, V> a10 = this.f35564c.a(k10);
            v10 = a10 != null ? v(a10) : null;
        }
        t(h10);
        u();
        q();
        return v10;
    }

    public synchronized int j() {
        return this.f35564c.b() - this.f35563b.b();
    }

    public synchronized int k() {
        return this.f35564c.e() - this.f35563b.e();
    }

    public void q() {
        ArrayList<i.a<K, V>> y10;
        synchronized (this) {
            t tVar = this.f35567f;
            int min = Math.min(tVar.f35575d, tVar.f35573b - j());
            t tVar2 = this.f35567f;
            y10 = y(min, Math.min(tVar2.f35574c, tVar2.f35572a - k()));
            n(y10);
        }
        p(y10);
        s(y10);
    }
}
