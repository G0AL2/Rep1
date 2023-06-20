package com.bytedance.sdk.openadsdk.core.j.b;

import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.a;
import com.bytedance.sdk.openadsdk.core.j.b.b;
import com.bytedance.sdk.openadsdk.i.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VastTracker.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f12430a;

    /* renamed from: b  reason: collision with root package name */
    private b f12431b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12432c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f12433d;

    /* compiled from: VastTracker.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f12434a;

        /* renamed from: b  reason: collision with root package name */
        private b f12435b = b.TRACKING_URL;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12436c = false;

        public a(String str) {
            this.f12434a = str;
        }

        public a a(boolean z10) {
            this.f12436c = z10;
            return this;
        }

        public c a() {
            return new c(this.f12434a, this.f12435b, Boolean.valueOf(this.f12436c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VastTracker.java */
    /* loaded from: classes.dex */
    public enum b {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str, b bVar, Boolean bool) {
        this.f12430a = str;
        this.f12431b = bVar;
        this.f12432c = bool.booleanValue();
    }

    public static List<String> a(List<c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar, long j10, String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (c cVar : list) {
            if (cVar != null && (!cVar.e() || cVar.d())) {
                arrayList.add(cVar.c());
                cVar.f_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.j.c.c(arrayList).a(aVar).a(j10).a(str).a();
    }

    public static void b(List<c> list, com.bytedance.sdk.openadsdk.core.j.a.a aVar, long j10, String str) {
        a(a(list, aVar, j10, str));
    }

    public String c() {
        return this.f12430a;
    }

    public boolean d() {
        return this.f12432c;
    }

    public boolean e() {
        return this.f12433d;
    }

    public void f_() {
        this.f12433d = true;
    }

    public static List<com.bytedance.sdk.openadsdk.core.j.b.a> c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new a.C0171a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), optJSONObject.optLong("trackingMilliseconds", 0L)).a());
                }
            }
        }
        return arrayList;
    }

    public static JSONArray b(List<c> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).c());
        }
        return jSONArray;
    }

    public static List<com.bytedance.sdk.openadsdk.core.j.b.b> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new b.a(optJSONObject.optString(AppLovinEventTypes.USER_VIEWED_CONTENT), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).a());
                }
            }
        }
        return arrayList;
    }

    public static void a(List<String> list) {
        com.bytedance.sdk.component.e.b.b c10;
        for (String str : list) {
            if (str != null && (c10 = d.a().b().c()) != null) {
                c10.a(str);
                c10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.openadsdk.core.j.b.c.1
                    @Override // com.bytedance.sdk.component.e.a.a
                    public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    }

                    @Override // com.bytedance.sdk.component.e.a.a
                    public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    }
                });
            }
        }
    }

    public static List<c> a(JSONArray jSONArray) {
        return a(jSONArray, false);
    }

    public static List<c> a(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String optString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new a(optString).a(z10).a());
                }
            }
        }
        return arrayList;
    }
}
