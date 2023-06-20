package com.facebook.react.uimanager;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* compiled from: ShadowNodeRegistry.java */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<d0> f15874a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseBooleanArray f15875b = new SparseBooleanArray();

    /* renamed from: c  reason: collision with root package name */
    private final h6.f f15876c = new h6.f();

    public void a(d0 d0Var) {
        this.f15876c.a();
        this.f15874a.put(d0Var.O(), d0Var);
    }

    public void b(d0 d0Var) {
        this.f15876c.a();
        int O = d0Var.O();
        this.f15874a.put(O, d0Var);
        this.f15875b.put(O, true);
    }

    public d0 c(int i10) {
        this.f15876c.a();
        return this.f15874a.get(i10);
    }

    public int d() {
        this.f15876c.a();
        return this.f15875b.size();
    }

    public int e(int i10) {
        this.f15876c.a();
        return this.f15875b.keyAt(i10);
    }

    public boolean f(int i10) {
        this.f15876c.a();
        return this.f15875b.get(i10);
    }

    public void g(int i10) {
        this.f15876c.a();
        if (!this.f15875b.get(i10)) {
            this.f15874a.remove(i10);
            return;
        }
        throw new h("Trying to remove root node " + i10 + " without using removeRootNode!");
    }

    public void h(int i10) {
        this.f15876c.a();
        if (i10 == -1) {
            return;
        }
        if (this.f15875b.get(i10)) {
            this.f15874a.remove(i10);
            this.f15875b.delete(i10);
            return;
        }
        throw new h("View with tag " + i10 + " is not registered as a root view");
    }
}
