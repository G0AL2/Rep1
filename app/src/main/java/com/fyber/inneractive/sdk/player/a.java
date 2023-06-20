package com.fyber.inneractive.sdk.player;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.util.l;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public y f17719a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0239a f17720b;

    /* renamed from: com.fyber.inneractive.sdk.player.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0239a {
    }

    public a(y yVar) {
        this.f17719a = yVar;
    }

    public InterfaceC0239a a() throws Throwable {
        a0 a0Var;
        UnitDisplayType unitDisplayType;
        if (this.f17720b == null) {
            Application application = l.f20301a;
            y yVar = this.f17719a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) yVar.f17240b;
            z zVar = yVar.f17242d;
            InneractiveAdRequest inneractiveAdRequest = yVar.f17239a;
            com.fyber.inneractive.sdk.measurement.a aVar = null;
            if (zVar != null && ((com.fyber.inneractive.sdk.config.global.features.h) yVar.f17241c.a(com.fyber.inneractive.sdk.config.global.features.h.class)).c() && (a0Var = ((com.fyber.inneractive.sdk.config.y) this.f17719a.f17242d).f17077f) != null && ((unitDisplayType = a0Var.f16908j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)) {
                aVar = IAConfigManager.J.I;
            }
            this.f17720b = new f(application, gVar, zVar, inneractiveAdRequest, yVar, aVar);
        }
        return this.f17720b;
    }
}
