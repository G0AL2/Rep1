package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class x extends a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.a.e f8462a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinAdLoadListener f8463c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(com.applovin.impl.a.e eVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super("TaskResolveVastWrapper", mVar);
        this.f8463c = appLovinAdLoadListener;
        this.f8462a = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.v.a()) {
            d("Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 != -1009) {
            com.applovin.impl.a.l.a(this.f8462a, this.f8463c, i10 == -1001 ? com.applovin.impl.a.f.TIMED_OUT : com.applovin.impl.a.f.GENERAL_WRAPPER_ERROR, i10, this.f8349b);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8463c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String a10 = com.applovin.impl.a.l.a(this.f8462a);
        if (StringUtils.isValidString(a10)) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Resolving VAST ad with depth " + this.f8462a.a() + " at " + a10);
            }
            try {
                this.f8349b.S().a((a) new u<com.applovin.impl.sdk.utils.r>(com.applovin.impl.sdk.network.c.a(this.f8349b).a(a10).b("GET").a((c.a) com.applovin.impl.sdk.utils.r.f8943a).a(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.en)).intValue()).b(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.eo)).intValue()).c(false).a(), this.f8349b) { // from class: com.applovin.impl.sdk.e.x.1
                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(int i10, String str, com.applovin.impl.sdk.utils.r rVar) {
                        if (com.applovin.impl.sdk.v.a()) {
                            d("Unable to resolve VAST wrapper. Server returned " + i10);
                        }
                        x.this.a(i10);
                    }

                    @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                    public void a(com.applovin.impl.sdk.utils.r rVar, int i10) {
                        this.f8349b.S().a((a) r.a(rVar, x.this.f8462a, x.this.f8463c, x.this.f8349b));
                    }
                });
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Unable to resolve VAST wrapper", th);
                }
            }
        } else if (com.applovin.impl.sdk.v.a()) {
            d("Resolving VAST failed. Could not find resolution URL");
        }
        a(-1);
    }
}
