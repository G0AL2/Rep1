package com.iab.omid.library.inmobi.publisher;

import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.b.d;
import com.iab.omid.library.inmobi.b.e;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private com.iab.omid.library.inmobi.e.b f24194a;

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f24195b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f24196c;

    /* renamed from: d  reason: collision with root package name */
    private a f24197d;

    /* renamed from: e  reason: collision with root package name */
    private long f24198e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
        this.f24194a = new com.iab.omid.library.inmobi.e.b(null);
    }

    public void a() {
    }

    public void a(float f10) {
        e.a().a(getWebView(), f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WebView webView) {
        this.f24194a = new com.iab.omid.library.inmobi.e.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f24195b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "environment", "app");
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.inmobi.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.inmobi.d.b.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        com.iab.omid.library.inmobi.d.b.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.inmobi.d.b.a(jSONObject4, "libraryVersion", "1.3.17-Inmobi");
        com.iab.omid.library.inmobi.d.b.a(jSONObject4, "appId", d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.inmobi.d.b.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f24196c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j10) {
        if (j10 >= this.f24198e) {
            this.f24197d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z10) {
        if (e()) {
            e.a().c(getWebView(), z10 ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f24194a.clear();
    }

    public void b(String str, long j10) {
        if (j10 >= this.f24198e) {
            a aVar = this.f24197d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f24197d = aVar2;
                e.a().b(getWebView(), str);
            }
        }
    }

    public AdEvents c() {
        return this.f24195b;
    }

    public MediaEvents d() {
        return this.f24196c;
    }

    public boolean e() {
        return this.f24194a.get() != null;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f24194a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f24198e = com.iab.omid.library.inmobi.d.d.a();
        this.f24197d = a.AD_STATE_IDLE;
    }
}
