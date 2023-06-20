package com.iab.omid.library.fyber.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.b.e;
import com.iab.omid.library.fyber.d.d;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private WebView f24087a;

    /* renamed from: b  reason: collision with root package name */
    private Long f24088b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f24089c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24090d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24089c = map;
        this.f24090d = str;
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.fyber.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.fyber.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.fyber.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.fyber.publisher.b.1

            /* renamed from: b  reason: collision with root package name */
            private final WebView f24092b;

            {
                this.f24092b = b.this.f24087a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24092b.destroy();
            }
        }, Math.max(4000 - (this.f24088b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f24088b.longValue(), TimeUnit.NANOSECONDS)), (long) Constants.MIN_PROGRESS_TIME));
        this.f24087a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.fyber.b.d.a().b());
        this.f24087a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f24087a);
        e.a().a(this.f24087a, this.f24090d);
        for (String str : this.f24089c.keySet()) {
            e.a().a(this.f24087a, this.f24089c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24088b = Long.valueOf(d.a());
    }
}
