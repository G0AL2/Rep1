package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes.dex */
public class n extends d.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f17941a;

    public n(k kVar) {
        this.f17941a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        k kVar = this.f17941a;
        kVar.getClass();
        sb2.append(IAlog.a(kVar));
        sb2.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.a(sb2.toString(), new Object[0]);
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b() {
        com.fyber.inneractive.sdk.model.vast.c f10;
        k kVar = this.f17941a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClickedAndOpen", IAlog.a(kVar));
        this.f17941a.a("2");
        k kVar2 = this.f17941a;
        if (kVar2.f17920g != 0) {
            com.fyber.inneractive.sdk.player.c cVar = kVar2.f17914a;
            if (cVar != null && (f10 = cVar.f()) != null) {
                this.f17941a.f17914a.a(f10, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK);
            }
            int i10 = IAlog.f20222a;
            IAlog.a(1, null, "AD_CLICKED", new Object[0]);
            this.f17941a.f17920g.g();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public d0.a a(String str, p0 p0Var) {
        com.fyber.inneractive.sdk.model.vast.c f10;
        k kVar = this.f17941a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(kVar));
        this.f17941a.a("2");
        k kVar2 = this.f17941a;
        if (kVar2.f17920g != 0) {
            com.fyber.inneractive.sdk.player.c cVar = kVar2.f17914a;
            if (cVar != null && (f10 = cVar.f()) != null) {
                this.f17941a.f17914a.a(f10, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.q.EVENT_CLICK);
            }
            int i10 = IAlog.f20222a;
            IAlog.a(1, null, "AD_CLICKED", new Object[0]);
            return this.f17941a.f17920g.a(str, p0Var);
        }
        return new d0.a(d0.c.FAILED, new Exception("mListener is null, internal SDK fatal error"), "null");
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b(com.fyber.inneractive.sdk.web.d dVar) {
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.r();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a() {
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.j();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public boolean a(String str) {
        View endCardView = this.f17941a.f17917d.getEndCardView();
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.a(endCardView, str);
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar) {
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.r();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, a0 a0Var) {
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.k();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10) {
        k kVar = this.f17941a;
        kVar.getClass();
        IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(kVar), Boolean.valueOf(z10));
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert == 0 || !z10) {
            return;
        }
        listenert.h();
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10, Orientation orientation) {
        k kVar = this.f17941a;
        kVar.getClass();
        IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(kVar), Boolean.valueOf(z10), orientation.toString());
        ListenerT listenert = this.f17941a.f17920g;
        if (listenert != 0) {
            listenert.a(z10, orientation);
        }
    }
}
