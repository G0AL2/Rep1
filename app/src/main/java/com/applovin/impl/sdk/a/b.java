package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final AppLovinAdBase f7988a;

    /* renamed from: b  reason: collision with root package name */
    protected final m f7989b;

    /* renamed from: c  reason: collision with root package name */
    protected final v f7990c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f7991d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f7992e;

    /* renamed from: f  reason: collision with root package name */
    protected AdSession f7993f;

    /* renamed from: g  reason: collision with root package name */
    protected AdEvents f7994g;

    public b(AppLovinAdBase appLovinAdBase) {
        this.f7988a = appLovinAdBase;
        this.f7989b = appLovinAdBase.getSdk();
        this.f7990c = appLovinAdBase.getSdk().A();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f7991d = str;
    }

    protected abstract AdSessionConfiguration a();

    protected abstract AdSessionContext a(WebView webView);

    public void a(View view) {
        a(view, Collections.emptyList());
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7993f.registerAdView(view);
                b.this.f7993f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f7993f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            if (v.a()) {
                                b bVar = b.this;
                                v vVar = bVar.f7990c;
                                String str = bVar.f7991d;
                                vVar.b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    protected void a(AdSession adSession) {
    }

    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7993f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.f7992e) {
                        if (v.a()) {
                            b bVar = b.this;
                            v vVar = bVar.f7990c;
                            String str2 = bVar.f7991d;
                            vVar.b(str2, "Running operation: " + str);
                        }
                        runnable.run();
                    } else if (v.a()) {
                        b bVar2 = b.this;
                        v vVar2 = bVar2.f7990c;
                        String str3 = bVar2.f7991d;
                        vVar2.e(str3, "Failed to run operation: " + str);
                    }
                } catch (Throwable th) {
                    if (v.a()) {
                        b bVar3 = b.this;
                        v vVar3 = bVar3.f7990c;
                        String str4 = bVar3.f7991d;
                        vVar3.b(str4, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    public void b() {
        b(null);
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext a10;
                if (!b.this.f7988a.isOpenMeasurementEnabled()) {
                    if (v.a()) {
                        b bVar = b.this;
                        bVar.f7990c.c(bVar.f7991d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (b.this.f7993f != null) {
                    if (v.a()) {
                        b bVar2 = b.this;
                        v vVar = bVar2.f7990c;
                        String str = bVar2.f7991d;
                        vVar.d(str, "Attempting to start session again for ad: " + b.this.f7988a);
                    }
                } else {
                    if (v.a()) {
                        b bVar3 = b.this;
                        bVar3.f7990c.b(bVar3.f7991d, "Starting session");
                    }
                    AdSessionConfiguration a11 = b.this.a();
                    if (a11 == null || (a10 = b.this.a(webView)) == null) {
                        return;
                    }
                    try {
                        b.this.f7993f = AdSession.createAdSession(a11, a10);
                        try {
                            b bVar4 = b.this;
                            bVar4.f7994g = AdEvents.createAdEvents(bVar4.f7993f);
                            b bVar5 = b.this;
                            bVar5.a(bVar5.f7993f);
                            b.this.f7993f.start();
                            b.this.f7992e = true;
                            if (v.a()) {
                                b bVar6 = b.this;
                                bVar6.f7990c.b(bVar6.f7991d, "Session started");
                            }
                        } catch (Throwable th) {
                            if (v.a()) {
                                b bVar7 = b.this;
                                bVar7.f7990c.b(bVar7.f7991d, "Failed to create ad events", th);
                            }
                        }
                    } catch (Throwable th2) {
                        if (v.a()) {
                            b bVar8 = b.this;
                            bVar8.f7990c.b(bVar8.f7991d, "Failed to create session", th2);
                        }
                    }
                }
            }
        });
    }

    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7994g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.f7994g.impressionOccurred();
            }
        });
    }

    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f7992e = false;
                bVar.f7993f.finish();
                b.this.f7993f = null;
            }
        });
    }
}
