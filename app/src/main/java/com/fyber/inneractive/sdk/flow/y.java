package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.e0;

/* loaded from: classes.dex */
public class y extends j<com.fyber.inneractive.sdk.response.g> {

    /* renamed from: g  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.i f17324g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17325h;

    public y(com.fyber.inneractive.sdk.config.z zVar, com.fyber.inneractive.sdk.config.global.s sVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(zVar, sVar);
        this.f17325h = false;
        a((y) gVar);
        a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public void a() {
        com.fyber.inneractive.sdk.player.i iVar = this.f17324g;
        if (iVar != null) {
            iVar.a();
            this.f17324g = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean d() {
        com.fyber.inneractive.sdk.config.a0 a0Var = ((com.fyber.inneractive.sdk.config.y) this.f17242d).f17077f;
        if (a0Var == null) {
            return false;
        }
        return e0.a(a0Var.f16908j);
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean e() {
        return this.f17324g != null;
    }

    public String f() {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        T t10 = this.f17240b;
        if (t10 == 0 || (bVar = ((com.fyber.inneractive.sdk.response.g) t10).C) == null) {
            return null;
        }
        return bVar.f17387b;
    }

    @Override // com.fyber.inneractive.sdk.flow.j
    public boolean isVideoAd() {
        return true;
    }
}
