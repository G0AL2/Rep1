package com.fyber.inneractive.sdk.model.vast;

import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a  reason: collision with root package name */
    public g f17395a;

    /* renamed from: b  reason: collision with root package name */
    public h f17396b;

    /* renamed from: c  reason: collision with root package name */
    public int f17397c;

    /* renamed from: d  reason: collision with root package name */
    public int f17398d;

    /* renamed from: e  reason: collision with root package name */
    public String f17399e;

    /* renamed from: f  reason: collision with root package name */
    public String f17400f;

    /* renamed from: g  reason: collision with root package name */
    public String f17401g;

    /* renamed from: h  reason: collision with root package name */
    public Map<q, List<String>> f17402h = new HashMap();

    public c(g gVar, int i10, int i11, String str) {
        this.f17395a = gVar;
        this.f17397c = i10;
        this.f17398d = i11;
        this.f17399e = str;
    }

    public void a(q qVar, String str) {
        List<String> list = this.f17402h.get(qVar);
        if (list == null) {
            list = new ArrayList<>();
            this.f17402h.put(qVar, list);
        }
        list.add(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Companion: ");
        sb2.append(" w:");
        sb2.append(this.f17397c);
        sb2.append(" h:");
        sb2.append(this.f17398d);
        sb2.append(" type:");
        sb2.append(this.f17395a.toString());
        sb2.append(" creativeType: ");
        h hVar = this.f17396b;
        sb2.append(hVar != null ? hVar.f17427a : "none");
        sb2.append(" ctr:");
        sb2.append(this.f17401g);
        sb2.append(" events:");
        sb2.append(this.f17402h);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public List<String> a(q qVar) {
        Map<q, List<String>> map = this.f17402h;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f17397c);
            jSONObject.put("h", this.f17398d);
            jSONObject.put("type", this.f17395a.toString());
            h hVar = this.f17396b;
            jSONObject.put("creativeType", hVar != null ? hVar.f17427a : "none");
            jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, this.f17400f);
        } catch (JSONException e10) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e10.getMessage());
        }
        return jSONObject;
    }
}
