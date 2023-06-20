package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.p0;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends b {
    public g(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        this.f17490c.a(f.GET_CURRENT_POSITION, "Unsupported action getCurrentPosition");
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
