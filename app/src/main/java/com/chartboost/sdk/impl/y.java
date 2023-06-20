package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class y extends d0 {

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<x> f14416e;

    public y(WeakReference<x> weakReference, double d10) {
        super(d10);
        this.f14416e = weakReference;
    }

    @Override // com.chartboost.sdk.impl.c0
    public void a() {
        WeakReference<x> weakReference = this.f14416e;
        if (weakReference != null) {
            x xVar = weakReference.get();
            if (xVar != null) {
                xVar.a();
            } else {
                CBLogging.a("BannerRefreshTimer", "Refresh callback is disposed");
            }
        }
    }

    @Override // com.chartboost.sdk.impl.d0
    public void i() {
        WeakReference<x> weakReference = this.f14416e;
        if (weakReference != null) {
            weakReference.clear();
            this.f14416e = null;
        }
        super.i();
    }
}
