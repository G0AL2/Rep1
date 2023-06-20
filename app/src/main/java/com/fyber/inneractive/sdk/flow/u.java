package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* loaded from: classes.dex */
public class u extends j<com.fyber.inneractive.sdk.response.f> {

    /* renamed from: g  reason: collision with root package name */
    public IAmraidWebViewController f17297g;

    public u(com.fyber.inneractive.sdk.config.z zVar, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(zVar, sVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public void a() {
        IAmraidWebViewController iAmraidWebViewController = this.f17297g;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.k();
            this.f17297g.l();
            this.f17297g = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        com.fyber.inneractive.sdk.config.r rVar;
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.z zVar = this.f17242d;
        if (zVar == null || (rVar = ((com.fyber.inneractive.sdk.config.y) zVar).f17074c) == null || (unitDisplayType = rVar.f17018b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        IAmraidWebViewController iAmraidWebViewController = this.f17297g;
        if (iAmraidWebViewController != null) {
            if (iAmraidWebViewController.f20365b != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean isVideoAd() {
        return false;
    }
}
