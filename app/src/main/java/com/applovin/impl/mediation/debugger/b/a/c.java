package com.applovin.impl.mediation.debugger.b.a;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f7483a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7484b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f7485c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b> f7486d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.a.b> f7487e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.b.b> map, MaxAdFormat maxAdFormat, m mVar) {
        b bVar;
        this.f7483a = JsonUtils.getString(jSONObject, "name", "");
        this.f7484b = JsonUtils.getBoolean(jSONObject, "default", Boolean.FALSE).booleanValue();
        this.f7485c = a("bidders", jSONObject, map, maxAdFormat, mVar);
        List<b> a10 = a("waterfall", jSONObject, map, maxAdFormat, mVar);
        this.f7486d = a10;
        Iterator<b> it = a10.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = it.next();
            if (bVar.a().c().x()) {
                break;
            }
        }
        this.f7487e = bVar != null ? bVar.e() : null;
    }

    private List<b> a(String str, JSONObject jSONObject, Map<String, com.applovin.impl.mediation.debugger.b.b.b> map, MaxAdFormat maxAdFormat, m mVar) {
        com.applovin.impl.mediation.debugger.b.b.b bVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null && (bVar = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                arrayList.add(new b(jSONObject2, maxAdFormat, bVar, mVar));
            }
        }
        return arrayList;
    }

    public List<b> a() {
        return this.f7485c;
    }

    public List<b> b() {
        return this.f7486d;
    }

    public boolean c() {
        return this.f7484b;
    }

    public List<com.applovin.impl.mediation.debugger.a.b> d() {
        return this.f7487e;
    }
}
