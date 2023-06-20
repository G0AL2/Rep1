package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Networking.NetworkHelper;
import com.chartboost.sdk.impl.s0;
import java.util.HashMap;

/* loaded from: classes.dex */
public class z2 extends s0 {

    /* renamed from: o  reason: collision with root package name */
    private final com.chartboost.sdk.Tracking.d f14426o;

    /* renamed from: p  reason: collision with root package name */
    private final k1 f14427p;

    /* renamed from: q  reason: collision with root package name */
    private final x2 f14428q;

    public z2(String str, com.chartboost.sdk.Tracking.d dVar, k1 k1Var) {
        this(NetworkHelper.a(str), NetworkHelper.b(str), null, dVar, k1Var, new x2());
    }

    @Override // com.chartboost.sdk.impl.s0, com.chartboost.sdk.impl.o0
    public com.chartboost.sdk.Networking.a a() {
        String a10 = this.f14428q.a(this.f14426o, this.f14427p);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-API", "8.4.3");
        return new com.chartboost.sdk.Networking.a(hashMap, a10.getBytes(), "application/json");
    }

    public z2(String str, String str2, s0.a aVar, com.chartboost.sdk.Tracking.d dVar, k1 k1Var, x2 x2Var) {
        super(str, str2, null, 2, aVar);
        this.f14299m = false;
        this.f14426o = dVar;
        this.f14427p = k1Var;
        this.f14428q = x2Var;
    }
}
