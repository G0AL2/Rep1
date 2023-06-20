package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k0 extends e0<com.fyber.inneractive.sdk.response.e> {

    /* renamed from: g  reason: collision with root package name */
    public final String f17580g;

    /* renamed from: h  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.bidder.adm.e f17581h;

    public k0(u<com.fyber.inneractive.sdk.response.e> uVar, String str, com.fyber.inneractive.sdk.bidder.adm.e eVar) {
        super(uVar, v.b().a());
        this.f17580g = str;
        this.f17581h = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        return this.f17580g;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.fyber.inneractive.sdk.response.e] */
    @Override // com.fyber.inneractive.sdk.network.b0
    public a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception {
        int a10;
        a0 a0Var = new a0();
        if (inputStream != null) {
            try {
                String stringBuffer = com.fyber.inneractive.sdk.util.s.a(inputStream, false).toString();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f17581h.f16785a;
                if (admParametersOuterClass$AdmParameters != null) {
                    a10 = admParametersOuterClass$AdmParameters.getAdType().a();
                } else {
                    a10 = AdmParametersOuterClass$AdmParameters.a.UNRECOGNIZED.a();
                }
                com.fyber.inneractive.sdk.bidder.adm.e eVar = this.f17581h;
                eVar.f16787c = stringBuffer;
                ?? a11 = a(a10, null, eVar, null);
                a11.f20167h = stringBuffer;
                a0Var.f17523a = a11;
            } catch (Exception e10) {
                IAlog.a("failed parse adm network request", e10, new Object[0]);
                throw new z(e10);
            }
        }
        return a0Var;
    }
}
