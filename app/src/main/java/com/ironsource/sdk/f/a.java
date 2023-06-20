package com.ironsource.sdk.f;

import com.ironsource.mediationsdk.model.c;
import com.ironsource.mediationsdk.model.d;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.utils.j;
import com.ironsource.sdk.controller.u;
import com.ironsource.sdk.g.d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private d f28106a;

    /* renamed from: b  reason: collision with root package name */
    private p f28107b;

    /* renamed from: c  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.p f28108c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28109d;

    /* renamed from: e  reason: collision with root package name */
    private u f28110e;

    /* renamed from: f  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.b f28111f;

    /* renamed from: g  reason: collision with root package name */
    private c f28112g;

    /* renamed from: h  reason: collision with root package name */
    private j f28113h;

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.model.b f28114i;

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0352a {

        /* renamed from: a  reason: collision with root package name */
        public String f28115a;

        /* renamed from: b  reason: collision with root package name */
        public String f28116b;

        /* renamed from: c  reason: collision with root package name */
        public String f28117c;

        public static C0352a a(d.e eVar) {
            String str;
            C0352a c0352a = new C0352a();
            if (eVar == d.e.RewardedVideo) {
                c0352a.f28115a = "showRewardedVideo";
                c0352a.f28116b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar != d.e.Interstitial) {
                if (eVar == d.e.OfferWall) {
                    c0352a.f28115a = "showOfferWall";
                    c0352a.f28116b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return c0352a;
            } else {
                c0352a.f28115a = "showInterstitial";
                c0352a.f28116b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            }
            c0352a.f28117c = str;
            return c0352a;
        }
    }

    public a() {
        this.f28106a = new com.ironsource.mediationsdk.model.d();
    }

    public a(com.ironsource.mediationsdk.model.d dVar, p pVar, com.ironsource.mediationsdk.utils.p pVar2, boolean z10, u uVar, com.ironsource.mediationsdk.utils.b bVar, c cVar, j jVar, com.ironsource.mediationsdk.model.b bVar2) {
        this.f28106a = dVar;
        this.f28107b = pVar;
        this.f28108c = pVar2;
        this.f28109d = z10;
        this.f28110e = uVar;
        this.f28111f = bVar;
        this.f28112g = cVar;
        this.f28113h = jVar;
        this.f28114i = bVar2;
    }

    public com.ironsource.mediationsdk.model.d a() {
        return this.f28106a;
    }

    public p b() {
        return this.f28107b;
    }

    public com.ironsource.mediationsdk.utils.p c() {
        return this.f28108c;
    }

    public boolean d() {
        return this.f28109d;
    }

    public u e() {
        return this.f28110e;
    }

    public com.ironsource.mediationsdk.utils.b f() {
        return this.f28111f;
    }

    public c g() {
        return this.f28112g;
    }

    public j h() {
        return this.f28113h;
    }

    public com.ironsource.mediationsdk.model.b i() {
        return this.f28114i;
    }
}
