package com.applovin.impl.sdk.e;

import android.net.Uri;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f8368c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8369d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8370e;

    public d(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, mVar, appLovinAdLoadListener);
        this.f8368c = aVar;
    }

    private void j() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Caching HTML resources...");
        }
        this.f8368c.a(a(this.f8368c.b(), this.f8368c.H(), this.f8368c));
        this.f8368c.a(true);
        if (com.applovin.impl.sdk.v.a()) {
            a("Finish caching non-video resources for ad #" + this.f8368c.getAdIdNumber());
            com.applovin.impl.sdk.v A = this.f8349b.A();
            String e10 = e();
            A.a(e10, "Ad updated with cachedHTML = " + this.f8368c.b());
        }
    }

    private void k() {
        Uri e10;
        if (b() || (e10 = e(this.f8368c.i())) == null) {
            return;
        }
        if (this.f8368c.aK()) {
            this.f8368c.a(this.f8368c.b().replaceFirst(this.f8368c.e(), e10.toString()));
            if (com.applovin.impl.sdk.v.a()) {
                a("Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.f8368c.g();
        this.f8368c.a(e10);
    }

    public void a(boolean z10) {
        this.f8369d = z10;
    }

    public void b(boolean z10) {
        this.f8370e = z10;
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        super.run();
        boolean f10 = this.f8368c.f();
        boolean z10 = this.f8370e;
        if (f10 || z10) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Begin caching for streaming ad #" + this.f8368c.getAdIdNumber() + "...");
            }
            c();
            if (f10) {
                if (this.f8369d) {
                    i();
                }
                j();
                if (!this.f8369d) {
                    i();
                }
                k();
            } else {
                i();
                j();
            }
        } else {
            if (com.applovin.impl.sdk.v.a()) {
                a("Begin processing for non-streaming ad #" + this.f8368c.getAdIdNumber() + "...");
            }
            c();
            j();
            k();
            i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f8368c.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f8368c, this.f8349b);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f8368c, this.f8349b);
        a(this.f8368c);
        a();
    }
}
