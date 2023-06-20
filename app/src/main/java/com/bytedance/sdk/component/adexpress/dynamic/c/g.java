package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.c.e;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DynamicLayoutInflater.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: g  reason: collision with root package name */
    private static HashMap<String, String> f9658g;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f9659a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f9660b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.c f9661c;

    /* renamed from: d  reason: collision with root package name */
    private a f9662d;

    /* renamed from: e  reason: collision with root package name */
    private b f9663e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.d f9664f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicLayoutInflater.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        float f9665a;

        /* renamed from: b  reason: collision with root package name */
        float f9666b;

        /* renamed from: c  reason: collision with root package name */
        boolean f9667c;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            if (jSONObject != null) {
                aVar.f9665a = (float) jSONObject.optDouble("width");
                aVar.f9666b = (float) jSONObject.optDouble("height");
                aVar.f9667c = jSONObject.optBoolean("isLandscape");
            }
            return aVar;
        }
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f9658g = hashMap;
        hashMap.put("subtitle", "description");
        f9658g.put("source", "source|app.app_name");
        f9658g.put("screenshot", "dynamic_creative.screenshot");
    }

    public g(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f9659a = jSONObject;
        this.f9660b = jSONObject2;
        this.f9661c = new com.bytedance.sdk.component.adexpress.dynamic.b.c(jSONObject2);
        this.f9662d = a.a(jSONObject3);
        this.f9664f = com.bytedance.sdk.component.adexpress.dynamic.b.d.a(jSONObject4);
    }

    private String b() {
        com.bytedance.sdk.component.adexpress.dynamic.b.c cVar = this.f9661c;
        return cVar == null ? "" : String.valueOf(cVar.a("adx_name"));
    }

    public com.bytedance.sdk.component.adexpress.dynamic.b.h a() {
        JSONObject jSONObject;
        this.f9661c.a();
        try {
            jSONObject = new JSONObject(this.f9664f.f9564b);
        } catch (JSONException e10) {
            e10.printStackTrace();
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.b.h a10 = a(d.a(this.f9659a, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.b.h) null);
        a(a10);
        e eVar = new e();
        e.a aVar = new e.a();
        a aVar2 = this.f9662d;
        aVar.f9647a = aVar2.f9665a;
        aVar.f9648b = aVar2.f9666b;
        aVar.f9649c = 0.0f;
        eVar.a(aVar);
        eVar.a(a10, 0.0f, 0.0f);
        eVar.a();
        com.bytedance.sdk.component.adexpress.dynamic.b.b bVar = eVar.f9643a;
        if (bVar.f9554d == 65536.0f) {
            return null;
        }
        return bVar.f9556f;
    }

    private void a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar == null) {
            return;
        }
        int b10 = com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a()));
        a aVar = this.f9662d;
        float min = aVar.f9667c ? aVar.f9665a : Math.min(aVar.f9665a, b10);
        if (this.f9662d.f9666b == 0.0f) {
            hVar.e(min);
            hVar.i().e().i("auto");
            hVar.f(0.0f);
            return;
        }
        hVar.e(min);
        int b11 = com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.c.a(), com.bytedance.sdk.component.adexpress.c.b.c(com.bytedance.sdk.component.adexpress.c.a()));
        a aVar2 = this.f9662d;
        hVar.f(aVar2.f9667c ? aVar2.f9666b : Math.min(aVar2.f9666b, b11));
        hVar.i().e().i("fixed");
    }

    public com.bytedance.sdk.component.adexpress.dynamic.b.h a(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.f9664f != null) {
                b bVar = new b();
                this.f9663e = bVar;
                JSONObject a10 = bVar.a(this.f9664f.f9563a, optInt, jSONObject);
                if (a10 != null) {
                    jSONObject = a10;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.b.h a11 = a(jSONObject);
        a11.b(hVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            a11.a((List<com.bytedance.sdk.component.adexpress.dynamic.b.h>) null);
            return a11;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i10);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = a11.i().e().Q();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.b.h a12 = a(optJSONArray2.optJSONObject(i11), a11);
                    arrayList.add(a12);
                    arrayList3.add(a12);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            a11.a(arrayList);
        }
        if (arrayList2.size() > 0) {
            a11.b(arrayList2);
        }
        return a11;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.b.h a(JSONObject jSONObject) {
        String a10;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        j.a(optString, optJSONObject);
        JSONObject a11 = j.a(optString, j.a(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.b.h hVar = new com.bytedance.sdk.component.adexpress.dynamic.b.h();
        if (TextUtils.isEmpty(optString2)) {
            hVar.b(String.valueOf(hVar.hashCode()));
        } else {
            hVar.b(optString2);
        }
        if (optJSONObject != null) {
            hVar.c((float) optJSONObject.optDouble("x"));
            hVar.d((float) optJSONObject.optDouble("y"));
            hVar.e((float) optJSONObject.optDouble("width"));
            hVar.f((float) optJSONObject.optDouble("height"));
            hVar.g(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.b.e eVar = new com.bytedance.sdk.component.adexpress.dynamic.b.e();
            eVar.a(optString);
            eVar.b(optJSONObject.optString("data"));
            eVar.c(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.b.f c10 = com.bytedance.sdk.component.adexpress.dynamic.b.f.c(optJSONObject);
            eVar.a(c10);
            com.bytedance.sdk.component.adexpress.dynamic.b.f c11 = com.bytedance.sdk.component.adexpress.dynamic.b.f.c(a11);
            if (c11 == null) {
                eVar.b(c10);
            } else {
                eVar.b(c11);
            }
            a(c10);
            a(c11);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.f9660b) != null) {
                a(eVar, jSONObject2.optInt("image_mode"));
            }
            String b10 = eVar.b();
            com.bytedance.sdk.component.adexpress.dynamic.b.f e10 = eVar.e();
            if (f9658g.containsKey(b10) && !e10.G()) {
                e10.r(f9658g.get(b10));
            }
            if (e10.G()) {
                a10 = eVar.c();
            } else {
                a10 = a(eVar.c());
            }
            if (com.bytedance.sdk.component.adexpress.c.b()) {
                if (TextUtils.equals(b10, "star") || TextUtils.equals(b10, "text_star")) {
                    a10 = a("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(b10, "score-count") || TextUtils.equals(b10, "score-count-type-1") || TextUtils.equals(b10, "score-count-type-2")) {
                    a10 = a("dynamic_creative.comment_num_i18n|");
                }
            }
            if (!TextUtils.isEmpty(b()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                eVar.b(a10 + "adx:" + b());
            } else {
                eVar.b(a10);
            }
            hVar.a(eVar);
        }
        return hVar;
    }

    private void a(com.bytedance.sdk.component.adexpress.dynamic.b.e eVar, int i10) {
        int lastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            eVar.a("image");
            String a10 = j.a("image");
            eVar.e().r(a10);
            eVar.f().r(a10);
            eVar.b(a10);
            if (a10 != null && (lastIndexOf = a10.lastIndexOf(".")) > 0) {
                String substring = a10.substring(0, lastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("width", a(substring + ".width"));
                    jSONObject.put("height", a(substring + ".height"));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                eVar.c(jSONObject.toString());
            }
            eVar.e().am();
            return;
        }
        eVar.a(DownloadResource.TYPE_VIDEO);
        String a11 = j.a(DownloadResource.TYPE_VIDEO);
        eVar.e().r(a11);
        eVar.f().r(a11);
        eVar.b(a11);
        eVar.e().al();
    }

    private String a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f9661c.b(str2)) {
                String valueOf = String.valueOf(this.f9661c.a(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private void a(com.bytedance.sdk.component.adexpress.dynamic.b.f fVar) {
        if (fVar == null) {
            return;
        }
        String s10 = fVar.s();
        if (TextUtils.isEmpty(s10)) {
            return;
        }
        int indexOf = s10.indexOf("{{");
        int indexOf2 = s10.indexOf("}}");
        if (indexOf < 0 || indexOf2 < 0 || indexOf2 < indexOf) {
            return;
        }
        String a10 = a(s10.substring(indexOf + 1, indexOf2));
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        fVar.k((s10.substring(0, indexOf) + s10.substring(indexOf2 + 2)) + a10);
    }
}
