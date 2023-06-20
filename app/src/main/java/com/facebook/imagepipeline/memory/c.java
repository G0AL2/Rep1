package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: Bucket.java */
/* loaded from: classes.dex */
class c<V> {

    /* renamed from: a  reason: collision with root package name */
    public final int f14836a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14837b;

    /* renamed from: c  reason: collision with root package name */
    final Queue f14838c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14839d;

    /* renamed from: e  reason: collision with root package name */
    private int f14840e;

    public c(int i10, int i11, int i12, boolean z10) {
        y3.k.i(i10 > 0);
        y3.k.i(i11 >= 0);
        y3.k.i(i12 >= 0);
        this.f14836a = i10;
        this.f14837b = i11;
        this.f14838c = new LinkedList();
        this.f14840e = i12;
        this.f14839d = z10;
    }

    void a(V v10) {
        this.f14838c.add(v10);
    }

    public void b() {
        y3.k.i(this.f14840e > 0);
        this.f14840e--;
    }

    @Deprecated
    public V c() {
        V g10 = g();
        if (g10 != null) {
            this.f14840e++;
        }
        return g10;
    }

    int d() {
        return this.f14838c.size();
    }

    public void e() {
        this.f14840e++;
    }

    public boolean f() {
        return this.f14840e + d() > this.f14837b;
    }

    public V g() {
        return (V) this.f14838c.poll();
    }

    public void h(V v10) {
        y3.k.g(v10);
        if (this.f14839d) {
            y3.k.i(this.f14840e > 0);
            this.f14840e--;
            a(v10);
            return;
        }
        int i10 = this.f14840e;
        if (i10 > 0) {
            this.f14840e = i10 - 1;
            a(v10);
            return;
        }
        z3.a.l("BUCKET", "Tried to release value %s from an empty bucket!", v10);
    }
}
