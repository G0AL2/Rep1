package com.iab.omid.library.ironsrc.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.b.e;
import com.iab.omid.library.ironsrc.d.d;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private WebView f24317a;

    /* renamed from: b  reason: collision with root package name */
    private Long f24318b = null;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, VerificationScriptResource> f24319c;

    /* renamed from: d  reason: collision with root package name */
    private final String f24320d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f24319c = map;
        this.f24320d = str;
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.ironsrc.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    @Override // com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.ironsrc.publisher.b.1

            /* renamed from: b  reason: collision with root package name */
            private WebView f24322b;

            {
                this.f24322b = b.this.f24317a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24322b.destroy();
            }
        }, Math.max(4000 - (this.f24318b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f24318b.longValue(), TimeUnit.NANOSECONDS)), (long) Constants.MIN_PROGRESS_TIME));
        this.f24317a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    void j() {
        WebView webView = new WebView(com.iab.omid.library.ironsrc.b.d.a().b());
        this.f24317a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f24317a);
        e.a().a(this.f24317a, this.f24320d);
        for (String str : this.f24319c.keySet()) {
            e.a().a(this.f24317a, this.f24319c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f24318b = Long.valueOf(d.a());
    }
}
