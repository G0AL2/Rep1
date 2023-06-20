package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private String f8725a;

    /* renamed from: b  reason: collision with root package name */
    private String f8726b;

    /* renamed from: c  reason: collision with root package name */
    private String f8727c;

    /* renamed from: d  reason: collision with root package name */
    private String f8728d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f8729e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f8730f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, Object> f8731g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8732h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8733i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8734j;

    /* renamed from: k  reason: collision with root package name */
    private String f8735k;

    /* renamed from: l  reason: collision with root package name */
    private int f8736l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f8737a;

        /* renamed from: b  reason: collision with root package name */
        private String f8738b;

        /* renamed from: c  reason: collision with root package name */
        private String f8739c;

        /* renamed from: d  reason: collision with root package name */
        private String f8740d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f8741e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f8742f;

        /* renamed from: g  reason: collision with root package name */
        private Map<String, Object> f8743g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f8744h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f8745i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f8746j;

        public a a(String str) {
            this.f8737a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f8741e = map;
            return this;
        }

        public a a(boolean z10) {
            this.f8744h = z10;
            return this;
        }

        public h a() {
            return new h(this);
        }

        public a b(String str) {
            this.f8738b = str;
            return this;
        }

        public a b(Map<String, String> map) {
            this.f8742f = map;
            return this;
        }

        public a b(boolean z10) {
            this.f8745i = z10;
            return this;
        }

        public a c(String str) {
            this.f8739c = str;
            return this;
        }

        public a c(Map<String, Object> map) {
            this.f8743g = map;
            return this;
        }

        public a c(boolean z10) {
            this.f8746j = z10;
            return this;
        }

        public a d(String str) {
            this.f8740d = str;
            return this;
        }
    }

    private h(a aVar) {
        this.f8725a = UUID.randomUUID().toString();
        this.f8726b = aVar.f8738b;
        this.f8727c = aVar.f8739c;
        this.f8728d = aVar.f8740d;
        this.f8729e = aVar.f8741e;
        this.f8730f = aVar.f8742f;
        this.f8731g = aVar.f8743g;
        this.f8732h = aVar.f8744h;
        this.f8733i = aVar.f8745i;
        this.f8734j = aVar.f8746j;
        this.f8735k = aVar.f8737a;
        this.f8736l = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(JSONObject jSONObject, m mVar) throws Exception {
        String string = JsonUtils.getString(jSONObject, "uniqueId", UUID.randomUUID().toString());
        String string2 = JsonUtils.getString(jSONObject, "communicatorRequestId", "");
        JsonUtils.getString(jSONObject, "httpMethod", "");
        String string3 = jSONObject.getString("targetUrl");
        String string4 = JsonUtils.getString(jSONObject, "backupUrl", "");
        int i10 = jSONObject.getInt("attemptNumber");
        Map<String, String> synchronizedMap = JsonUtils.valueExists(jSONObject, "parameters") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("parameters"))) : new HashMap<>(0);
        Map<String, String> synchronizedMap2 = JsonUtils.valueExists(jSONObject, "httpHeaders") ? Collections.synchronizedMap(JsonUtils.toStringMap(jSONObject.getJSONObject("httpHeaders"))) : new HashMap<>(0);
        Map<String, Object> synchronizedMap3 = JsonUtils.valueExists(jSONObject, "requestBody") ? Collections.synchronizedMap(JsonUtils.toStringObjectMap(jSONObject.getJSONObject("requestBody"))) : new HashMap<>(0);
        this.f8725a = string;
        this.f8735k = string2;
        this.f8727c = string3;
        this.f8728d = string4;
        this.f8729e = synchronizedMap;
        this.f8730f = synchronizedMap2;
        this.f8731g = synchronizedMap3;
        this.f8732h = jSONObject.optBoolean("isEncodingEnabled", false);
        this.f8733i = jSONObject.optBoolean("gzipBodyEncoding", false);
        this.f8734j = jSONObject.optBoolean("shouldFireInWebView", false);
        this.f8736l = i10;
    }

    public static a o() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return this.f8726b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f8727c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f8728d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> d() {
        return this.f8729e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> e() {
        return this.f8730f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f8725a.equals(((h) obj).f8725a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> f() {
        return this.f8731g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return this.f8732h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h() {
        return this.f8733i;
    }

    public int hashCode() {
        return this.f8725a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.f8734j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j() {
        return this.f8735k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f8736l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.f8736l++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.f8729e;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("postback_ts", String.valueOf(System.currentTimeMillis()));
        this.f8729e = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject n() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uniqueId", this.f8725a);
        jSONObject.put("communicatorRequestId", this.f8735k);
        jSONObject.put("httpMethod", this.f8726b);
        jSONObject.put("targetUrl", this.f8727c);
        jSONObject.put("backupUrl", this.f8728d);
        jSONObject.put("isEncodingEnabled", this.f8732h);
        jSONObject.put("gzipBodyEncoding", this.f8733i);
        jSONObject.put("attemptNumber", this.f8736l);
        if (this.f8729e != null) {
            jSONObject.put("parameters", new JSONObject(this.f8729e));
        }
        if (this.f8730f != null) {
            jSONObject.put("httpHeaders", new JSONObject(this.f8730f));
        }
        if (this.f8731g != null) {
            jSONObject.put("requestBody", new JSONObject(this.f8731g));
        }
        return jSONObject;
    }

    public String toString() {
        return "PostbackRequest{uniqueId='" + this.f8725a + "', communicatorRequestId='" + this.f8735k + "', httpMethod='" + this.f8726b + "', targetUrl='" + this.f8727c + "', backupUrl='" + this.f8728d + "', attemptNumber=" + this.f8736l + ", isEncodingEnabled=" + this.f8732h + ", isGzipBodyEncoding=" + this.f8733i + '}';
    }
}
