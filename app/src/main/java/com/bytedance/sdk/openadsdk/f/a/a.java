package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DoGetAdsFromNetworkAsyncMethod.java */
/* loaded from: classes.dex */
public class a extends com.bytedance.sdk.component.a.d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f13239a;

    public a(w wVar) {
        this.f13239a = new WeakReference<>(wVar);
    }

    @Override // com.bytedance.sdk.component.a.d
    protected void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("getNetworkData", new d.b() { // from class: com.bytedance.sdk.openadsdk.f.a.a.1
            @Override // com.bytedance.sdk.component.a.d.b
            public com.bytedance.sdk.component.a.d a() {
                return new a(w.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.a.d
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        w wVar = this.f13239a.get();
        if (wVar == null) {
            c();
        } else {
            wVar.a(jSONObject, new com.bytedance.sdk.openadsdk.g.c() { // from class: com.bytedance.sdk.openadsdk.f.a.a.2
                @Override // com.bytedance.sdk.openadsdk.g.c
                public void a(boolean z10, List<n> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z10) {
                            a.this.a((a) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", w.b(list));
                            a.this.a((a) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
