package com.applovin.impl.sdk.e;

import com.applovin.impl.a.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.a.e f8450a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f8451c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskRenderVastAd", mVar);
        this.f8451c = appLovinAdLoadListener;
        this.f8450a = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Rendering VAST ad...");
        }
        int size = this.f8450a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        com.applovin.impl.a.i iVar = null;
        com.applovin.impl.a.m mVar = null;
        com.applovin.impl.a.d dVar = null;
        com.applovin.impl.a.c cVar = null;
        String str2 = "";
        for (com.applovin.impl.sdk.utils.r rVar : this.f8450a.b()) {
            com.applovin.impl.sdk.utils.r c10 = rVar.c(com.applovin.impl.a.l.a(rVar) ? "Wrapper" : "InLine");
            if (c10 != null) {
                com.applovin.impl.sdk.utils.r c11 = c10.c("AdSystem");
                if (c11 != null) {
                    iVar = com.applovin.impl.a.i.a(c11, iVar, this.f8349b);
                }
                str = com.applovin.impl.a.l.a(c10, "AdTitle", str);
                str2 = com.applovin.impl.a.l.a(c10, "Description", str2);
                com.applovin.impl.a.l.a(c10.a("Impression"), hashSet, this.f8450a, this.f8349b);
                com.applovin.impl.sdk.utils.r b10 = c10.b("ViewableImpression");
                if (b10 != null) {
                    com.applovin.impl.a.l.a(b10.a("Viewable"), hashSet, this.f8450a, this.f8349b);
                }
                com.applovin.impl.sdk.utils.r c12 = c10.c("AdVerifications");
                if (c12 != null) {
                    cVar = com.applovin.impl.a.c.a(c12, cVar, this.f8450a, this.f8349b);
                }
                com.applovin.impl.a.l.a(c10.a("Error"), hashSet2, this.f8450a, this.f8349b);
                com.applovin.impl.sdk.utils.r b11 = c10.b("Creatives");
                if (b11 != null) {
                    for (com.applovin.impl.sdk.utils.r rVar2 : b11.d()) {
                        com.applovin.impl.sdk.utils.r b12 = rVar2.b("Linear");
                        if (b12 != null) {
                            mVar = com.applovin.impl.a.m.a(b12, mVar, this.f8450a, this.f8349b);
                        } else {
                            com.applovin.impl.sdk.utils.r c13 = rVar2.c("CompanionAds");
                            if (c13 != null) {
                                com.applovin.impl.sdk.utils.r c14 = c13.c("Companion");
                                if (c14 != null) {
                                    dVar = com.applovin.impl.a.d.a(c14, dVar, this.f8450a, this.f8349b);
                                }
                            } else if (com.applovin.impl.sdk.v.a()) {
                                d("Received and will skip rendering for an unidentified creative: " + rVar2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.v.a()) {
                d("Did not find wrapper or inline response for node: " + rVar);
            }
        }
        com.applovin.impl.a.a a10 = new a.C0107a().a(this.f8349b).a(this.f8450a.c()).b(this.f8450a.d()).a(this.f8450a.e()).a(this.f8450a.f()).a(str).b(str2).a(iVar).a(mVar).a(dVar).a(cVar).a(hashSet).a(cVar).b(hashSet2).a();
        com.applovin.impl.a.f a11 = com.applovin.impl.a.l.a(a10);
        if (a11 != null) {
            com.applovin.impl.a.l.a(this.f8450a, this.f8451c, a11, -6, this.f8349b);
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            a("Finished rendering VAST ad: " + a10);
        }
        a10.o().b();
        e eVar = new e(a10, this.f8349b, this.f8451c);
        o.a aVar = o.a.CACHING_OTHER;
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.bi)).booleanValue()) {
            if (a10.getType() == AppLovinAdType.REGULAR) {
                aVar = o.a.CACHING_INTERSTITIAL;
            } else if (a10.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar = o.a.CACHING_INCENTIVIZED;
            }
        }
        this.f8349b.S().a(eVar, aVar);
    }
}
