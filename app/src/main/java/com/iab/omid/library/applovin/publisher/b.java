package com.iab.omid.library.applovin.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.b.e;
import com.iab.omid.library.applovin.d.d;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private WebView f23969a;

    /* renamed from: b  reason: collision with root package name */
    private Long f23970b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f23971c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23972d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f23971c = map;
        this.f23972d = str;
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.applovin.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.applovin.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.applovin.publisher.b.1

            /* renamed from: b  reason: collision with root package name */
            private final WebView f23974b;

            {
                this.f23974b = b.this.f23969a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23974b.destroy();
            }
        }, Math.max(4000 - (this.f23970b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f23970b.longValue(), TimeUnit.NANOSECONDS)), (long) Constants.MIN_PROGRESS_TIME));
        this.f23969a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.applovin.b.d.a().b());
        this.f23969a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f23969a);
        e.a().a(this.f23969a, this.f23972d);
        for (String str : this.f23971c.keySet()) {
            e.a().a(this.f23969a, this.f23971c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f23970b = Long.valueOf(d.a());
    }
}
