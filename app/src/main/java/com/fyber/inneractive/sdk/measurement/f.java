package com.fyber.inneractive.sdk.measurement;

import android.webkit.WebView;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.network.r;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.Partner;

/* loaded from: classes.dex */
public class f implements a.InterfaceC0237a {

    /* renamed from: a  reason: collision with root package name */
    public final Partner f17333a;

    /* renamed from: b  reason: collision with root package name */
    public AdSession f17334b;

    /* renamed from: c  reason: collision with root package name */
    public AdEvents f17335c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17336d = false;

    /* renamed from: e  reason: collision with root package name */
    public WebView f17337e;

    /* renamed from: f  reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.j f17338f;

    public f(Partner partner, WebView webView, com.fyber.inneractive.sdk.flow.j jVar) {
        this.f17333a = partner;
        this.f17337e = webView;
        this.f17338f = jVar;
    }

    public final void a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String format = String.format("%s - %s", "OpenMeasurementMraidTracker", th.getMessage());
        com.fyber.inneractive.sdk.flow.j jVar = this.f17338f;
        r.a(simpleName, format, jVar != null ? jVar.f17239a : null, jVar != null ? jVar.c() : null);
    }
}
