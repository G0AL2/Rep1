package com.chartboost.sdk.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b0 extends d0 {

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<a0> f13915e;

    public b0(WeakReference<a0> weakReference, double d10) {
        super(d10);
        this.f13915e = weakReference;
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a() {
        a0 a0Var;
        WeakReference<a0> weakReference = this.f13915e;
        if (weakReference == null || (a0Var = weakReference.get()) == null) {
            return;
        }
        a0Var.b();
    }

    @Override // com.chartboost.sdk.impl.d0
    public void i() {
        WeakReference<a0> weakReference = this.f13915e;
        if (weakReference != null) {
            weakReference.clear();
            this.f13915e = null;
        }
        super.i();
    }
}
