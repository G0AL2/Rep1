package com.bytedance.sdk.component.d.c.a;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: SoftLruCache.java */
/* loaded from: classes.dex */
public class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, SoftReference<V>> f10164a;

    /* renamed from: b  reason: collision with root package name */
    private int f10165b;

    /* renamed from: c  reason: collision with root package name */
    private int f10166c;

    /* renamed from: d  reason: collision with root package name */
    private int f10167d;

    /* renamed from: e  reason: collision with root package name */
    private int f10168e;

    /* renamed from: f  reason: collision with root package name */
    private int f10169f;

    /* renamed from: g  reason: collision with root package name */
    private int f10170g;

    /* renamed from: h  reason: collision with root package name */
    private int f10171h;

    public c(int i10) {
        if (i10 > 0) {
            this.f10166c = i10;
            this.f10164a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int c(K k10, V v10) {
        int b10 = b(k10, v10);
        if (b10 >= 0) {
            return b10;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final V a(K k10) {
        V v10;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            SoftReference<V> softReference = this.f10164a.get(k10);
            if (softReference != null) {
                v10 = softReference.get();
                if (v10 != null) {
                    this.f10170g++;
                    return v10;
                }
                this.f10164a.remove(k10);
            } else {
                v10 = null;
            }
            this.f10171h++;
            V b10 = b(k10);
            if (b10 == null) {
                return null;
            }
            synchronized (this) {
                this.f10168e++;
                SoftReference<V> put = this.f10164a.put(k10, new SoftReference<>(b10));
                if (put != null) {
                    v10 = put.get();
                }
                if (v10 != null) {
                    this.f10164a.put(k10, put);
                } else {
                    this.f10165b += c(k10, b10);
                }
            }
            if (v10 != null) {
                a(false, k10, b10, v10);
                return v10;
            }
            a(this.f10166c);
            return b10;
        }
    }

    protected void a(boolean z10, K k10, V v10, V v11) {
    }

    protected int b(K k10, V v10) {
        return 1;
    }

    protected V b(K k10) {
        return null;
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f10170g;
        i11 = this.f10171h + i10;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f10166c), Integer.valueOf(this.f10170g), Integer.valueOf(this.f10171h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public final V a(K k10, V v10) {
        if (k10 != null && v10 != null) {
            V v11 = null;
            synchronized (this) {
                this.f10167d++;
                this.f10165b += c(k10, v10);
                SoftReference<V> put = this.f10164a.put(k10, new SoftReference<>(v10));
                if (put != null && (v11 = put.get()) != null) {
                    this.f10165b -= c(k10, v11);
                }
            }
            if (v11 != null) {
                a(false, k10, v11, v10);
            }
            a(this.f10166c);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r5.f10165b + ", maxSize: " + r6);
        r5.f10165b = 0;
        r5.f10164a.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r6) {
        /*
            r5 = this;
        L0:
            monitor-enter(r5)
            int r0 = r5.f10165b     // Catch: java.lang.Throwable -> L82
            if (r0 < 0) goto L58
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r5.f10164a     // Catch: java.lang.Throwable -> L82
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L12
            int r0 = r5.f10165b     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L12
            goto L58
        L12:
            int r0 = r5.f10165b     // Catch: java.lang.Throwable -> L82
            if (r0 > r6) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            goto L81
        L18:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r5.f10164a     // Catch: java.lang.Throwable -> L82
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L82
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L82
            if (r0 != 0) goto L2c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            goto L81
        L2c:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L82
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L82
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r5.f10164a     // Catch: java.lang.Throwable -> L82
            r2.remove(r1)     // Catch: java.lang.Throwable -> L82
            r2 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L82
            int r3 = r5.f10165b     // Catch: java.lang.Throwable -> L82
            int r4 = r5.c(r1, r0)     // Catch: java.lang.Throwable -> L82
            int r3 = r3 - r4
            r5.f10165b = r3     // Catch: java.lang.Throwable -> L82
            goto L4d
        L4c:
            r0 = r2
        L4d:
            int r3 = r5.f10169f     // Catch: java.lang.Throwable -> L82
            r4 = 1
            int r3 = r3 + r4
            r5.f10169f = r3     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            r5.a(r4, r1, r0, r2)
            goto L0
        L58:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r1.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.append(r2)     // Catch: java.lang.Throwable -> L82
            int r2 = r5.f10165b     // Catch: java.lang.Throwable -> L82
            r1.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L82
            r1.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L82
            android.util.Log.e(r0, r6)     // Catch: java.lang.Throwable -> L82
            r6 = 0
            r5.f10165b = r6     // Catch: java.lang.Throwable -> L82
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r6 = r5.f10164a     // Catch: java.lang.Throwable -> L82
            r6.clear()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
        L81:
            return
        L82:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.d.c.a.c.a(int):void");
    }
}
