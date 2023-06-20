package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoNewClickEventMethod.java */
/* loaded from: classes.dex */
public class c extends com.bytedance.sdk.component.a.d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f13244a;

    public c(w wVar) {
        this.f13244a = new WeakReference<>(wVar);
    }

    @Override // com.bytedance.sdk.component.a.d
    protected void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("newClickEvent", new d.b() { // from class: com.bytedance.sdk.openadsdk.f.a.c.1
            @Override // com.bytedance.sdk.component.a.d.b
            public com.bytedance.sdk.component.a.d a() {
                return new c(w.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.a.d
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        w wVar = this.f13244a.get();
        if (wVar == null) {
            c();
        } else {
            wVar.d(jSONObject);
        }
    }
}
