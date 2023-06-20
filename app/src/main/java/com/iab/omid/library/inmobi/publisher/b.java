package com.iab.omid.library.inmobi.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.b.e;
import com.iab.omid.library.inmobi.d.d;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private WebView f24203a;

    /* renamed from: b  reason: collision with root package name */
    private Long f24204b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24205c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24206d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24205c = map;
        this.f24206d = str;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.inmobi.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.inmobi.publisher.b.1

            /* renamed from: b  reason: collision with root package name */
            private final WebView f24208b;

            {
                this.f24208b = b.this.f24203a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24208b.destroy();
            }
        }, Math.max(4000 - (this.f24204b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f24204b.longValue(), TimeUnit.NANOSECONDS)), (long) Constants.MIN_PROGRESS_TIME));
        this.f24203a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.inmobi.b.d.a().b());
        this.f24203a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f24203a);
        e.a().a(this.f24203a, this.f24206d);
        for (String str : this.f24205c.keySet()) {
            e.a().a(this.f24203a, this.f24205c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24204b = Long.valueOf(d.a());
    }
}
