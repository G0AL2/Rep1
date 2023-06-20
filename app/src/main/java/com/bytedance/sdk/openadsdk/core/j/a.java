package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.e.n;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAdConfig.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    d f12386a = new d(this);

    /* renamed from: b  reason: collision with root package name */
    b f12387b;

    /* renamed from: c  reason: collision with root package name */
    c f12388c;

    /* renamed from: d  reason: collision with root package name */
    private String f12389d;

    /* renamed from: e  reason: collision with root package name */
    private String f12390e;

    /* renamed from: f  reason: collision with root package name */
    private String f12391f;

    /* renamed from: g  reason: collision with root package name */
    private String f12392g;

    /* renamed from: h  reason: collision with root package name */
    private double f12393h;

    /* renamed from: i  reason: collision with root package name */
    private String f12394i;

    /* renamed from: j  reason: collision with root package name */
    private String f12395j;

    public d a() {
        return this.f12386a;
    }

    public b b() {
        return this.f12387b;
    }

    public c c() {
        return this.f12388c;
    }

    public String d() {
        return this.f12389d;
    }

    public String e() {
        return this.f12390e;
    }

    public String f() {
        return this.f12391f;
    }

    public String g() {
        return this.f12392g;
    }

    public double h() {
        return this.f12393h;
    }

    public String i() {
        String str = this.f12395j;
        if (str == null) {
            return this.f12391f;
        }
        str.hashCode();
        if (str.equals("VAST_ICON")) {
            b bVar = this.f12387b;
            return bVar != null ? bVar.f12447h : this.f12391f;
        } else if (!str.equals("VAST_END_CARD")) {
            return this.f12391f;
        } else {
            c cVar = this.f12388c;
            return cVar != null ? cVar.f12447h : this.f12391f;
        }
    }

    public JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.f12386a.a());
        b bVar = this.f12387b;
        if (bVar != null) {
            jSONObject.put("vastIcon", bVar.a());
        }
        c cVar = this.f12388c;
        if (cVar != null) {
            jSONObject.put("endCard", cVar.a());
        }
        jSONObject.put("title", this.f12389d);
        jSONObject.put("description", this.f12390e);
        jSONObject.put("clickThroughUrl", this.f12391f);
        jSONObject.put("videoUrl", this.f12392g);
        jSONObject.put("videDuration", this.f12393h);
        jSONObject.put("tag", this.f12394i);
        return jSONObject;
    }

    public String k() {
        return this.f12394i;
    }

    public void a(b bVar) {
        if (bVar != null) {
            bVar.a(this.f12392g);
        }
        this.f12387b = bVar;
    }

    public void b(String str) {
        this.f12390e = str;
    }

    public void c(String str) {
        this.f12391f = str;
    }

    public void d(String str) {
        this.f12392g = str;
    }

    public void e(String str) {
        this.f12395j = str;
    }

    public void f(String str) {
        this.f12394i = str;
        this.f12386a.a(str);
    }

    public void a(c cVar) {
        if (cVar != null) {
            cVar.a(this.f12392g);
        }
        this.f12388c = cVar;
    }

    public void a(String str) {
        this.f12389d = str;
    }

    public void a(double d10) {
        this.f12393h = d10;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.f12386a.a(jSONObject.optJSONObject("videoTrackers"));
        aVar.f12387b = b.a(jSONObject.optJSONObject("vastIcon"));
        aVar.f12388c = c.b(jSONObject.optJSONObject("endCard"));
        aVar.f12389d = jSONObject.optString("title");
        aVar.f12390e = jSONObject.optString("description");
        aVar.f12391f = jSONObject.optString("clickThroughUrl");
        aVar.f12392g = jSONObject.optString("videoUrl");
        aVar.f12393h = jSONObject.optDouble("videDuration");
        aVar.f12394i = jSONObject.optString("tag");
        return aVar;
    }

    public void a(n nVar) {
        this.f12386a.a(nVar);
    }
}
