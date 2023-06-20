package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.m;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends a {
    /* JADX INFO: Access modifiers changed from: protected */
    public e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, m mVar) {
        super(map, jSONObject, jSONObject2, gVar, mVar);
    }

    public int C() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bJ : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bL : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bN : format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.bP : null;
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.f7216b.a(bVar)).intValue());
        }
        return 0;
    }

    public int D() {
        MaxAdFormat format = getFormat();
        com.applovin.impl.sdk.c.b<Integer> bVar = format == MaxAdFormat.BANNER ? com.applovin.impl.sdk.c.b.bK : format == MaxAdFormat.MREC ? com.applovin.impl.sdk.c.b.bM : format == MaxAdFormat.LEADER ? com.applovin.impl.sdk.c.b.bO : format == MaxAdFormat.NATIVE ? com.applovin.impl.sdk.c.b.bQ : null;
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.f7216b.a(bVar)).intValue());
        }
        return 0;
    }

    public float E() {
        return a("viewability_min_alpha", ((Float) this.f7216b.a(com.applovin.impl.sdk.c.b.bR)).floatValue() / 100.0f);
    }

    public int F() {
        return b("viewability_min_pixels", -1);
    }

    public boolean G() {
        return F() >= 0;
    }

    public long H() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.b.bS)).longValue());
    }
}
