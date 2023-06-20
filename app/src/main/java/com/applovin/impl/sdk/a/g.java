package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.a.j;
import com.applovin.impl.a.l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f8015h = true;

    /* renamed from: i  reason: collision with root package name */
    private final com.applovin.impl.a.a f8016i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f8017j;

    /* renamed from: k  reason: collision with root package name */
    private MediaEvents f8018k;

    /* renamed from: l  reason: collision with root package name */
    private final VastProperties f8019l;

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f8020m;

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f8021n;

    /* renamed from: o  reason: collision with root package name */
    private final AtomicBoolean f8022o;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicBoolean f8023p;

    public g(com.applovin.impl.a.a aVar) {
        super(aVar);
        this.f8017j = new AtomicBoolean();
        this.f8020m = new AtomicBoolean();
        this.f8021n = new AtomicBoolean();
        this.f8022o = new AtomicBoolean();
        this.f8023p = new AtomicBoolean();
        this.f8016i = aVar;
        this.f8019l = aVar.e() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.e(), true, Position.STANDALONE);
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (v.a()) {
                this.f7990c.b(this.f7991d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected AdSessionContext a(WebView webView) {
        com.applovin.impl.a.f fVar;
        Set<j> set;
        if (f8015h || this.f8016i.aS() != null) {
            ArrayList arrayList = new ArrayList();
            for (com.applovin.impl.a.b bVar : this.f8016i.aS().a()) {
                List<com.applovin.impl.a.g> b10 = bVar.b();
                if (!b10.isEmpty()) {
                    ArrayList<com.applovin.impl.a.g> arrayList2 = new ArrayList();
                    for (com.applovin.impl.a.g gVar : b10) {
                        if ("omid".equalsIgnoreCase(gVar.a())) {
                            arrayList2.add(gVar);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        set = bVar.d();
                        fVar = com.applovin.impl.a.f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        l.a(set, fVar, this.f7989b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList();
                        for (com.applovin.impl.a.g gVar2 : arrayList2) {
                            try {
                                arrayList3.add(new URL(gVar2.b()));
                            } catch (Throwable th) {
                                if (v.a()) {
                                    this.f7990c.b(this.f7991d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c10 = bVar.c();
                            String a10 = bVar.a();
                            if (!StringUtils.isValidString(c10) || StringUtils.isValidString(a10)) {
                                for (URL url : arrayList3) {
                                    arrayList.add(StringUtils.isValidString(c10) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a10, url, c10) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                set = bVar.d();
                fVar = com.applovin.impl.a.f.FAILED_TO_LOAD_RESOURCE;
                l.a(set, fVar, this.f7989b);
            }
            String e10 = this.f7989b.al().e();
            if (TextUtils.isEmpty(e10)) {
                if (v.a()) {
                    this.f7990c.e(this.f7991d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f7989b.al().d(), e10, arrayList, this.f8016i.getOpenMeasurementContentUrl(), this.f8016i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (v.a()) {
                    this.f7990c.b(this.f7991d, "Failed to create ad session context", th2);
                    return null;
                }
                return null;
            }
        }
        throw new AssertionError();
    }

    public void a(final float f10, final boolean z10) {
        if (this.f8020m.compareAndSet(false, true)) {
            a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.start(f10, z10 ? 0.0f : 1.0f);
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    protected void a(AdSession adSession) {
        try {
            this.f8018k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (v.a()) {
                this.f7990c.b(this.f7991d, "Failed to create media events", th);
            }
        }
    }

    public void a(final boolean z10) {
        a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.volumeChange(z10 ? 0.0f : 1.0f);
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f7994g.loaded(gVar.f8019l);
            }
        });
    }

    public void f() {
        if (this.f8021n.compareAndSet(false, true)) {
            a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.f8022o.compareAndSet(false, true)) {
            a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.f8023p.compareAndSet(false, true)) {
            a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.complete();
            }
        });
    }

    public void j() {
        a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.resume();
            }
        });
    }

    public void l() {
        if (this.f8017j.compareAndSet(false, true)) {
            a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.f8017j.compareAndSet(true, false)) {
            a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f8018k.bufferFinish();
                }
            });
        }
    }

    public void n() {
        a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.f8018k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
