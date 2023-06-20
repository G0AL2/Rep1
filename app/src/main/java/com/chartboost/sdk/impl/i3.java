package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.h3;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i3 extends o0<Object> {

    /* renamed from: j  reason: collision with root package name */
    private final r0 f14083j;

    /* renamed from: k  reason: collision with root package name */
    private final a f14084k;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, long j10, h3.a aVar);

        void a(String str, String str2, CBError cBError);
    }

    public /* synthetic */ i3(r0 r0Var, File file, String str, a aVar, int i10, int i11, qe.g gVar) {
        this(r0Var, file, str, aVar, (i11 & 16) != 0 ? 2 : i10);
    }

    @Override // com.chartboost.sdk.impl.o0
    public com.chartboost.sdk.Networking.a a() {
        HashMap hashMap = new HashMap();
        String str = com.chartboost.sdk.g.f13885j;
        qe.k.e(str, "appId");
        hashMap.put("X-Chartboost-App", str);
        String b10 = CBUtility.b();
        qe.k.e(b10, "getUserAgent()");
        hashMap.put("X-Chartboost-Client", b10);
        r0 r0Var = this.f14083j;
        hashMap.put("X-Chartboost-Reachability", String.valueOf(r0Var == null ? null : Integer.valueOf(r0Var.b())));
        return new com.chartboost.sdk.Networking.a(hashMap, null, null);
    }

    public i3(r0 r0Var, File file, String str, a aVar, int i10) {
        super("GET", str, i10, file);
        this.f14083j = r0Var;
        this.f14084k = aVar;
        this.f14237i = 1;
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(Object obj, q0 q0Var) {
        a aVar = this.f14084k;
        if (aVar == null) {
            return;
        }
        String str = this.f14230b;
        qe.k.e(str, "uri");
        String name = this.f14233e.getName();
        qe.k.e(name, "outputFile.name");
        aVar.a(str, name);
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(CBError cBError, q0 q0Var) {
        a aVar = this.f14084k;
        if (aVar == null) {
            return;
        }
        String str = this.f14230b;
        qe.k.e(str, "uri");
        String name = this.f14233e.getName();
        qe.k.e(name, "outputFile.name");
        aVar.a(str, name, cBError);
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(String str, long j10) {
        qe.k.f(str, "uri");
        a aVar = this.f14084k;
        if (aVar == null) {
            return;
        }
        String name = this.f14233e.getName();
        qe.k.e(name, "outputFile.name");
        aVar.a(str, name, j10, null);
    }
}
