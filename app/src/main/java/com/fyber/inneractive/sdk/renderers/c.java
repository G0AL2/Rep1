package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.w;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.player.c;

/* loaded from: classes2.dex */
public class c extends n {

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.f f20095c;

    public c(com.fyber.inneractive.sdk.player.i iVar) {
        this.f20095c = (com.fyber.inneractive.sdk.player.f) iVar.c();
    }

    public com.fyber.inneractive.sdk.player.ui.g a(Context context) {
        if (this.f20143b == null) {
            this.f20143b = new com.fyber.inneractive.sdk.player.ui.d(context);
        }
        return this.f20143b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, y yVar) {
        if (this.f20142a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f20142a = new com.fyber.inneractive.sdk.player.controller.e(this.f20095c, (com.fyber.inneractive.sdk.player.ui.d) this.f20143b, inneractiveAdSpot.getAdContent().f17242d, yVar.f17241c, false, selectedUnitController instanceof z ? ((z) selectedUnitController).isOverlayOutside() : false, inneractiveAdSpot instanceof w ? ((w) inneractiveAdSpot).a() : null, IAConfigManager.J.f16876l || yVar.f17244f);
        }
        return this.f20142a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public boolean a() {
        this.f20095c.getClass();
        return false;
    }

    @Override // com.fyber.inneractive.sdk.renderers.n
    public void a(c.InterfaceC0240c interfaceC0240c) {
        com.fyber.inneractive.sdk.player.f fVar = this.f20095c;
        fVar.getClass();
        interfaceC0240c.a(fVar);
    }
}
