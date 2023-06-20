package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.o;

/* loaded from: classes.dex */
public class f extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f8372a;

    /* loaded from: classes.dex */
    public interface a {
        void a(o.a aVar);
    }

    public f(com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskCollectAdvertisingId", mVar, true);
        this.f8372a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8372a.a(this.f8349b.V().k());
    }
}
