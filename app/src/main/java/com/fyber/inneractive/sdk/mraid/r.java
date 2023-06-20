package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.p0;
import java.util.Map;

/* loaded from: classes.dex */
public class r extends b {
    public r(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        this.f17490c.b(InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f17489b.get("shouldUseCustomClose")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
