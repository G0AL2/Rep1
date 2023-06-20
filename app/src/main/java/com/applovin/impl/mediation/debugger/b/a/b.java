package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final d f7479a;

    /* renamed from: b  reason: collision with root package name */
    private final e f7480b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f7481c;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.a.b> f7482d;

    public b(JSONObject jSONObject, MaxAdFormat maxAdFormat, com.applovin.impl.mediation.debugger.b.b.b bVar, m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f7480b = new e(jSONObject2, mVar);
        } else {
            this.f7480b = null;
        }
        this.f7479a = new d(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, bVar);
        this.f7482d = bVar.x() ? new ArrayList() : null;
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f7481c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f7481c.add(new e(jSONObject3, mVar));
            }
            List<com.applovin.impl.mediation.debugger.a.b> list = this.f7482d;
            if (list != null) {
                list.add(new com.applovin.impl.mediation.debugger.a.b(JsonUtils.getString(jSONObject3, "id", ""), JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null), maxAdFormat));
            }
        }
    }

    public d a() {
        return this.f7479a;
    }

    public e b() {
        return this.f7480b;
    }

    public boolean c() {
        return this.f7480b != null;
    }

    public List<e> d() {
        return this.f7481c;
    }

    public List<com.applovin.impl.mediation.debugger.a.b> e() {
        return this.f7482d;
    }
}
