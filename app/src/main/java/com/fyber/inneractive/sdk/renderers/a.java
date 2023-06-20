package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.content.res.Resources;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.player.c;

/* loaded from: classes2.dex */
public class a extends n {

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.f f20082c;

    public a(com.fyber.inneractive.sdk.player.i iVar) {
        this.f20082c = (com.fyber.inneractive.sdk.player.f) iVar.c();
    }

    public com.fyber.inneractive.sdk.player.ui.g a(Context context) throws Resources.NotFoundException {
        if (this.f20143b == null) {
            this.f20143b = new com.fyber.inneractive.sdk.player.ui.f(context);
        }
        return this.f20143b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public void a(c.InterfaceC0240c interfaceC0240c) {
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, y yVar) {
        if (this.f20142a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f20142a = new com.fyber.inneractive.sdk.player.controller.j(this.f20082c, (com.fyber.inneractive.sdk.player.ui.f) this.f20143b, com.fyber.inneractive.sdk.config.a.b(inneractiveAdSpot.getAdContent().c().f20172m), yVar.f17241c, selectedUnitController instanceof z ? ((z) selectedUnitController).isOverlayOutside() : false);
        }
        return this.f20142a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public boolean a() {
        this.f20082c.getClass();
        return false;
    }
}
