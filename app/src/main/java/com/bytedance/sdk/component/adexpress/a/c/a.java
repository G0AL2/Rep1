package com.bytedance.sdk.component.adexpress.a.c;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.adexpress.dynamic.c.f;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TempPkgModel.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f9353a;

    /* renamed from: b  reason: collision with root package name */
    private String f9354b;

    /* renamed from: c  reason: collision with root package name */
    private String f9355c;

    /* renamed from: d  reason: collision with root package name */
    private String f9356d;

    /* renamed from: e  reason: collision with root package name */
    private List<C0145a> f9357e;

    /* compiled from: TempPkgModel.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.a.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0145a {

        /* renamed from: a  reason: collision with root package name */
        private String f9358a;

        /* renamed from: b  reason: collision with root package name */
        private String f9359b;

        /* renamed from: c  reason: collision with root package name */
        private int f9360c;

        public String a() {
            return this.f9358a;
        }

        public String b() {
            return this.f9359b;
        }

        public int c() {
            return this.f9360c;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0145a) {
                String str = this.f9358a;
                return str != null && str.equals(((C0145a) obj).a());
            }
            return super.equals(obj);
        }

        public void a(String str) {
            this.f9358a = str;
        }

        public void b(String str) {
            this.f9359b = str;
        }

        public void a(int i10) {
            this.f9360c = i10;
        }
    }

    public String a() {
        return this.f9353a;
    }

    public String b() {
        return this.f9354b;
    }

    public String c() {
        return this.f9355c;
    }

    public String d() {
        return this.f9356d;
    }

    public List<C0145a> e() {
        if (this.f9357e == null) {
            this.f9357e = new ArrayList();
        }
        return this.f9357e;
    }

    public boolean f() {
        return (TextUtils.isEmpty(c()) || TextUtils.isEmpty(b()) || TextUtils.isEmpty(a())) ? false : true;
    }

    public String g() {
        if (f()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("name", a());
                jSONObject.putOpt(MediationMetaData.KEY_VERSION, b());
                jSONObject.putOpt("main", c());
                jSONObject.putOpt("fallback", d());
                JSONArray jSONArray = new JSONArray();
                if (e() != null) {
                    for (C0145a c0145a : e()) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt(ImagesContract.URL, c0145a.a());
                        jSONObject2.putOpt("md5", c0145a.b());
                        jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0145a.c()));
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.putOpt("resources", jSONArray);
                return jSONObject.toString();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public void a(String str) {
        this.f9353a = str;
    }

    public void b(String str) {
        this.f9354b = str;
    }

    public void c(String str) {
        this.f9355c = str;
    }

    public void d(String str) {
        this.f9356d = str;
    }

    public void a(List<C0145a> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f9357e = list;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.a(jSONObject.optString("name"));
        aVar.b(jSONObject.optString(MediationMetaData.KEY_VERSION));
        aVar.c(jSONObject.optString("main"));
        String optString = jSONObject.optString("fallback_optimize");
        aVar.d(optString);
        f.a(optString);
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                C0145a c0145a = new C0145a();
                c0145a.a(optJSONObject.optString(ImagesContract.URL));
                c0145a.b(optJSONObject.optString("md5"));
                c0145a.a(optJSONObject.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0145a);
            }
        }
        aVar.a(arrayList);
        if (aVar.f()) {
            return aVar;
        }
        return null;
    }

    public static a e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return a(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
