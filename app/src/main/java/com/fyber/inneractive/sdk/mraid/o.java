package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.p0;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends b {
    public o(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        Map<String, String> map = this.f17489b;
        this.f17490c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && "false".equals(this.f17489b.get("allowOrientationChange"))) ? false : true, this.f17489b.get("forceOrientation"));
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public boolean b() {
        return false;
    }
}
