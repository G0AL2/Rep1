package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class IAMraidKit extends BroadcastReceiver {
    private static final com.fyber.inneractive.sdk.util.t sProvider = new a();

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.util.t {
        @Override // com.fyber.inneractive.sdk.util.t
        public com.fyber.inneractive.sdk.util.u a() {
            return com.fyber.inneractive.sdk.util.u.Mraid;
        }

        @Override // com.fyber.inneractive.sdk.util.t
        public boolean a(String str) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0234b {
        public b(IAMraidKit iAMraidKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.interfaces.a a() {
            return new com.fyber.inneractive.sdk.flow.h();
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.response.b b() {
            return new com.fyber.inneractive.sdk.response.c();
        }
    }

    /* loaded from: classes.dex */
    public class c implements c.a {
        public c() {
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot) {
            return new com.fyber.inneractive.sdk.renderers.k();
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0233a {
        public d() {
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot) {
            return new com.fyber.inneractive.sdk.renderers.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof com.fyber.inneractive.sdk.flow.u);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IAlog.a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.util.t tVar = sProvider;
        IAConfigManager.J.H.put(tVar.a(), tVar);
        b bVar = new b(this);
        b.a.f17184a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML, bVar);
        b.a.f17184a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID, bVar);
        c.b.f17186a.f17185a.add(new c());
        a.b.f17182a.f17181a.add(new d());
    }
}
