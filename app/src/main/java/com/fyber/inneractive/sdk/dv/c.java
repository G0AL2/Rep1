package com.fyber.inneractive.sdk.dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class c extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public class a implements b.InterfaceC0234b {
        public a(c cVar) {
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.interfaces.a a() {
            return new com.fyber.inneractive.sdk.dv.b();
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.response.b b() {
            return new e();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.a {
        public b(c cVar) {
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return IAConfigManager.J.E != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.dv.a);
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f17239a;
            boolean z10 = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (inneractiveAdSpot.getAdContent().d() && z10) {
                if (inneractiveAdSpot.getAdContent().c().f20173n == UnitDisplayType.INTERSTITIAL) {
                    return new com.fyber.inneractive.sdk.dv.interstitial.d();
                }
                return new com.fyber.inneractive.sdk.dv.rewarded.c();
            }
            return null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0229c implements a.InterfaceC0233a {
        public C0229c() {
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return c.a(c.this, inneractiveAdSpot);
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot) {
            return new com.fyber.inneractive.sdk.dv.banner.b();
        }
    }

    public static boolean a(c cVar, InneractiveAdSpot inneractiveAdSpot) {
        cVar.getClass();
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.dv.a);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        b.a.f17184a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MOBILE_ADS, new a(this));
        c.b.f17186a.f17185a.add(new b(this));
        a.b.f17182a.f17181a.add(new C0229c());
    }
}
