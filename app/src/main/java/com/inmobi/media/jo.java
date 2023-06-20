package com.inmobi.media;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;

/* compiled from: UnifiedIdNetworkRequest.java */
/* loaded from: classes3.dex */
public final class jo extends gz {
    /* JADX INFO: Access modifiers changed from: protected */
    public jo(String str, String str2, ir irVar, String str3, int i10, int i11, int i12) {
        super(str, str2, irVar, str3, i10, i11, "application/x-www-form-urlencoded");
        this.f25617l = i12;
    }

    @Override // com.inmobi.media.gz, com.inmobi.media.gx
    public final void a() {
        super.a();
        HashMap<String, String> d10 = ig.d();
        this.f25613h.put("mk-version", hp.a());
        this.f25613h.put("bundle-id", ia.a().f25732a);
        this.f25613h.put("ua", ho.i());
        this.f25613h.put("ts", String.valueOf(System.currentTimeMillis()));
        this.f25613h.put("account_id", this.f25624s);
        Boolean g10 = iq.a().g();
        if (g10 == null) {
            this.f25613h.put("lat", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        } else {
            this.f25613h.put("lat", g10.toString());
        }
        if (d10.get("u-age") != null) {
            this.f25613h.put("age", d10.get("u-age"));
        }
        if (jj.b() != null) {
            this.f25613h.put(Scopes.EMAIL, new ij().a((ij) jj.b()).toString());
        }
        if (jj.a() != null) {
            this.f25613h.put("phone", new ij().a((ij) jj.a()).toString());
        }
        this.f25613h.put("ufids", jl.d().toString());
        if (jj.c() != null) {
            this.f25613h.putAll(jj.c());
        }
    }
}
