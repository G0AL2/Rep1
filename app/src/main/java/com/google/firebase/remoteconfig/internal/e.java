package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final Date f23643f = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f23644a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f23645b;

    /* renamed from: c  reason: collision with root package name */
    private Date f23646c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f23647d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f23648e;

    /* compiled from: ConfigContainer.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f23649a;

        /* renamed from: b  reason: collision with root package name */
        private Date f23650b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f23651c;

        /* renamed from: d  reason: collision with root package name */
        private JSONObject f23652d;

        public e a() throws JSONException {
            return new e(this.f23649a, this.f23650b, this.f23651c, this.f23652d);
        }

        public b b(Map<String, String> map) {
            this.f23649a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f23649a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f23651c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f23650b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f23652d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private b() {
            this.f23649a = new JSONObject();
            this.f23650b = e.f23643f;
            this.f23651c = new JSONArray();
            this.f23652d = new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f23647d;
    }

    public JSONObject d() {
        return this.f23645b;
    }

    public Date e() {
        return this.f23646c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f23644a.toString().equals(((e) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f23648e;
    }

    public int hashCode() {
        return this.f23644a.hashCode();
    }

    public String toString() {
        return this.f23644a.toString();
    }

    private e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f23645b = jSONObject;
        this.f23646c = date;
        this.f23647d = jSONArray;
        this.f23648e = jSONObject2;
        this.f23644a = jSONObject3;
    }
}
