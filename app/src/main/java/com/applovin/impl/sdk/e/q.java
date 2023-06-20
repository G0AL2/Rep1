package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.mediation.h;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q extends com.applovin.impl.sdk.e.a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8436a;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdLoadListener f8437c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.d f8438d;

    /* loaded from: classes.dex */
    private class a extends com.applovin.impl.adview.e {
        private a(com.applovin.impl.sdk.m mVar) {
            super(null, mVar);
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            for (String str2 : q.this.f8349b.b(bVar)) {
                if (str2.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.e
        protected boolean a(WebView webView, String str, boolean z10) {
            if (com.applovin.impl.sdk.v.a()) {
                q qVar = q.this;
                qVar.b("Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (a(scheme, com.applovin.impl.sdk.c.b.f8205ca)) {
                if (a(host, com.applovin.impl.sdk.c.b.f8206cb)) {
                    if (com.applovin.impl.sdk.v.a()) {
                        q.this.a("Ad load succeeded");
                    }
                    if (q.this.f8437c == null) {
                        return true;
                    }
                    q.this.f8437c.adReceived(q.this.f8436a);
                } else if (!a(host, com.applovin.impl.sdk.c.b.f8207cc)) {
                    if (com.applovin.impl.sdk.v.a()) {
                        q.this.d("Unrecognized webview event");
                        return true;
                    }
                    return true;
                } else {
                    if (com.applovin.impl.sdk.v.a()) {
                        q.this.a("Ad load failed");
                    }
                    if (q.this.f8437c == null) {
                        return true;
                    }
                    q.this.f8437c.failedToReceiveAd(204);
                }
                q.this.f8437c = null;
                return true;
            }
            return true;
        }
    }

    public q(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskProcessJavaScriptTagAd", mVar);
        this.f8436a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, mVar);
        this.f8437c = appLovinAdLoadListener;
        mVar.H().a(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.f().equalsIgnoreCase(this.f8436a.N())) {
            this.f8349b.H().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f8437c;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f8436a);
                this.f8437c = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Rendering AppLovin ad #" + this.f8436a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.q.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    q qVar = q.this;
                    q qVar2 = q.this;
                    a aVar = new a(qVar2.f8349b);
                    q qVar3 = q.this;
                    qVar.f8438d = new com.applovin.impl.adview.d(aVar, qVar3.f8349b, qVar3.f());
                    q.this.f8438d.loadDataWithBaseURL(q.this.f8436a.aw(), q.this.f8436a.b(), "text/html", null, "");
                } catch (Throwable th) {
                    q.this.f8349b.H().b(q.this);
                    if (com.applovin.impl.sdk.v.a()) {
                        q.this.a("Failed to initialize WebView", th);
                    }
                    if (q.this.f8437c != null) {
                        q.this.f8437c.failedToReceiveAd(-1);
                        q.this.f8437c = null;
                    }
                }
            }
        });
    }
}
