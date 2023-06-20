package com.applovin.impl.mediation.a;

import android.view.View;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends e {
    private b(b bVar, com.applovin.impl.mediation.g gVar) {
        super(bVar.T(), bVar.J(), bVar.I(), gVar, bVar.f7216b);
    }

    public b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        super(map, jSONObject, jSONObject2, null, mVar);
    }

    public boolean A() {
        return b("proe", (Boolean) this.f7216b.a(com.applovin.impl.sdk.c.a.J)).booleanValue();
    }

    public long B() {
        return Utils.parseColor(b("bg_color", (String) null));
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new b(this, gVar);
    }

    public int u() {
        int b10 = b("ad_view_width", -2);
        if (b10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b10;
    }

    public int v() {
        int b10 = b("ad_view_height", -2);
        if (b10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b10;
    }

    public View w() {
        com.applovin.impl.mediation.g gVar;
        if (!e() || (gVar = ((a) this).f7206a) == null) {
            return null;
        }
        return gVar.a();
    }

    public long x() {
        return b("viewability_imp_delay_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.b.bI)).longValue());
    }

    public boolean y() {
        return z() >= 0;
    }

    public long z() {
        long b10 = b("ad_refresh_ms", -1L);
        return b10 >= 0 ? b10 : a("ad_refresh_ms", ((Long) this.f7216b.a(com.applovin.impl.sdk.c.a.f8177m)).longValue());
    }
}
