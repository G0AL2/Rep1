package com.bytedance.sdk.openadsdk.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsAppAdDownloadManager.java */
/* loaded from: classes.dex */
public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final n f13236a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13237b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, r3.c> f13238c = new HashMap();

    private a(b bVar, n nVar) {
        this.f13237b = bVar;
        this.f13236a = nVar;
    }

    public static a a(b bVar, n nVar) {
        return new a(bVar, nVar);
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void a() {
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void b() {
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void b(JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void c() {
        this.f13238c.clear();
    }

    private n a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        n nVar = new n();
        nVar.b(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nVar.m(str);
        }
        if (this.f13236a == null) {
            return nVar;
        }
        String a10 = nVar.aa() != null ? nVar.aa().a() : null;
        if (TextUtils.isEmpty(a10)) {
            return this.f13236a;
        }
        return (this.f13236a.aa() == null || !a10.equals(this.f13236a.aa().a())) ? nVar : this.f13236a;
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void a(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        a(context, a(optJSONObject, str), optJSONObject, i10, z10);
    }

    private void a(Context context, n nVar, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || nVar == null || nVar.aa() == null || jSONObject == null || this.f13237b == null || this.f13238c.get(nVar.aa().a()) != null) {
            return;
        }
        String a10 = u.a(i10);
        if (TextUtils.isEmpty(a10)) {
            return;
        }
        this.f13238c.put(nVar.aa().a(), a(context, nVar, jSONObject, a10, z10));
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void a(Context context, JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        a(context, a(optJSONObject, (String) null), str);
    }

    private void a(Context context, n nVar, String str) {
        if (context == null || nVar == null) {
            return;
        }
        if (nVar.aa() == null) {
            r3.d.a(context, nVar, str).d();
        } else {
            r3.c cVar = this.f13238c.get(nVar.aa().a());
            if (cVar != null) {
                cVar.d();
            }
        }
        if (context instanceof com.bytedance.sdk.openadsdk.core.video.c.b) {
            ((com.bytedance.sdk.openadsdk.core.video.c.b) context).L();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.e.c
    public void a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        a(a(optJSONObject, (String) null), optJSONObject);
    }

    private void a(n nVar, JSONObject jSONObject) {
        if (this.f13237b == null || nVar == null || nVar.aa() == null) {
            return;
        }
        String a10 = nVar.aa().a();
        if (this.f13238c.containsKey(a10)) {
            this.f13238c.remove(a10);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f13237b.a("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    private r3.c a(Context context, n nVar, JSONObject jSONObject, String str, boolean z10) {
        r3.c a10 = r3.d.a(context, nVar, str);
        a10.a(true);
        return a10;
    }
}
