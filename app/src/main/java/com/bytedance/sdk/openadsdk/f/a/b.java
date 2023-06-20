package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoInterstitialWebViewCloseMethod.java */
/* loaded from: classes.dex */
public class b extends com.bytedance.sdk.component.a.d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f13242a;

    public b(w wVar) {
        this.f13242a = new WeakReference<>(wVar);
    }

    @Override // com.bytedance.sdk.component.a.d
    protected void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("interstitial_webview_close", new d.b() { // from class: com.bytedance.sdk.openadsdk.f.a.b.1
            @Override // com.bytedance.sdk.component.a.d.b
            public com.bytedance.sdk.component.a.d a() {
                return new b(w.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.a.d
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        if (h.d().s()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[JSB-REQ] version: 3 data=");
            sb2.append(jSONObject != null ? jSONObject.toString() : "");
            l.b("DoInterstitialWebViewCloseMethod", sb2.toString());
        }
        l.e("DoInterstitialWebViewCloseMethod", "DoInterstitialWebViewCloseMethod invoke ");
        w wVar = this.f13242a.get();
        if (wVar == null) {
            l.e("DoInterstitialWebViewCloseMethod", "invoke error");
            c();
            return;
        }
        wVar.g();
    }
}
