package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7474a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7475b;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f7476c;

    /* renamed from: d  reason: collision with root package name */
    private final c f7477d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f7478e;

    public a(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.b.b> map, m mVar) {
        this.f7474a = JsonUtils.getString(jSONObject, "name", "");
        this.f7475b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f7476c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f7478e = new ArrayList(jSONArray.length());
        c cVar = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                c cVar2 = new c(jSONObject2, map, this.f7476c, mVar);
                this.f7478e.add(cVar2);
                if (cVar == null && cVar2.c()) {
                    cVar = cVar2;
                }
            }
        }
        this.f7477d = cVar;
    }

    private c g() {
        if (this.f7478e.isEmpty()) {
            return null;
        }
        return this.f7478e.get(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        return this.f7475b.compareToIgnoreCase(aVar.f7475b);
    }

    public String a() {
        return this.f7474a;
    }

    public String b() {
        return this.f7475b;
    }

    public String c() {
        MaxAdFormat maxAdFormat = this.f7476c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public MaxAdFormat d() {
        return this.f7476c;
    }

    public c e() {
        c cVar = this.f7477d;
        return cVar != null ? cVar : g();
    }

    public String f() {
        return "\n---------- " + this.f7475b + " ----------\nIdentifier - " + this.f7474a + "\nFormat     - " + c();
    }
}
