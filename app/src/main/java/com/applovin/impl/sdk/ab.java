package com.applovin.impl.sdk;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class ab {

    /* renamed from: a  reason: collision with root package name */
    private static WebView f8057a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile String f8058b;

    public static String a() {
        return f8058b;
    }

    public static void a(m mVar) {
    }

    public static void b(final m mVar) {
        if (f8058b != null) {
            return;
        }
        f8058b = "";
        if (com.applovin.impl.sdk.utils.g.b()) {
            mVar.S().a(new com.applovin.impl.sdk.e.z(mVar, true, new Runnable() { // from class: com.applovin.impl.sdk.ab.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String unused = ab.f8058b = WebSettings.getDefaultUserAgent(m.this.L());
                    } catch (Throwable th) {
                        if (v.a()) {
                            m.this.A().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            }), o.a.BACKGROUND);
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.ab.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ab.a(m.this);
                        String unused = ab.f8058b = ab.f8057a.getSettings().getUserAgentString();
                    } catch (Throwable th) {
                        if (v.a()) {
                            m.this.A().b("WebViewDataCollector", "Failed to collect user agent", th);
                        }
                    }
                }
            });
        }
    }
}
