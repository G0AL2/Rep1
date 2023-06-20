package com.bytedance.sdk.component.adexpress.dynamic.c;

import org.json.JSONObject;

/* compiled from: DynamicNativeParser.java */
/* loaded from: classes.dex */
public class h implements i {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.d.b f9668a;

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.bytedance.sdk.component.adexpress.b.l lVar) {
        try {
            JSONObject a10 = lVar.a();
            JSONObject jSONObject = new JSONObject(a10.optString("template_Plugin"));
            JSONObject optJSONObject = a10.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.b.h a11 = new g(jSONObject, optJSONObject, a10.optJSONObject("AdSize"), new JSONObject(a10.optString("diff_template_Plugin"))).a();
            a11.a(new JSONObject(optJSONObject.optString("dynamic_creative")).optString("color"));
            this.f9668a.a(a11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c.i
    public void a(com.bytedance.sdk.component.adexpress.dynamic.d.b bVar) {
        this.f9668a = bVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c.i
    public void a(final com.bytedance.sdk.component.adexpress.b.l lVar) {
        if (lVar.m() == 1) {
            b(lVar);
        } else {
            com.bytedance.sdk.component.f.e.a().execute(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.c.h.1
                @Override // java.lang.Runnable
                public void run() {
                    h.this.b(lVar);
                }
            });
        }
    }
}
