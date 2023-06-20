package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class r extends o0<Void> {

    /* renamed from: j  reason: collision with root package name */
    private final j1 f14278j;

    /* renamed from: k  reason: collision with root package name */
    private final r0 f14279k;

    /* renamed from: l  reason: collision with root package name */
    final q f14280l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(j1 j1Var, r0 r0Var, q qVar, File file) {
        super("GET", qVar.f14260d, 2, file);
        this.f14237i = 1;
        this.f14278j = j1Var;
        this.f14279k = r0Var;
        this.f14280l = qVar;
    }

    @Override // com.chartboost.sdk.impl.o0
    public com.chartboost.sdk.Networking.a a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", com.chartboost.sdk.g.f13885j);
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.f14279k.b()));
        return new com.chartboost.sdk.Networking.a(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(Void r12, q0 q0Var) {
        this.f14278j.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(CBError cBError, q0 q0Var) {
        this.f14278j.a(this, cBError, q0Var);
    }
}
