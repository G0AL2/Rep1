package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class c extends b {
    public c(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (v.a()) {
                this.f7990c.b(this.f7991d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createHtmlAdSessionContext(this.f7989b.al().d(), webView, this.f7988a.getOpenMeasurementContentUrl(), this.f7988a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (v.a()) {
                this.f7990c.b(this.f7991d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
