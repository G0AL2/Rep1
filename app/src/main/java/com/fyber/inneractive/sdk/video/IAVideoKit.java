package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.a;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.factories.c;
import com.fyber.inneractive.sdk.flow.i;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.player.cache.n;
import com.fyber.inneractive.sdk.renderers.h;
import com.fyber.inneractive.sdk.renderers.j;
import com.fyber.inneractive.sdk.renderers.m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t;
import com.fyber.inneractive.sdk.util.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final t sProvider = new a();

    /* loaded from: classes2.dex */
    public class b implements b.InterfaceC0234b {
        public b(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.interfaces.a a() {
            return new i(IronSourceConstants.INTERSTITIAL_AD_UNIT);
        }

        @Override // com.fyber.inneractive.sdk.factories.b.InterfaceC0234b
        public com.fyber.inneractive.sdk.response.b b() {
            return new com.fyber.inneractive.sdk.response.d();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements c.a {
        public c(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof y);
        }

        @Override // com.fyber.inneractive.sdk.factories.c.a
        public com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f17239a;
            boolean z10 = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (inneractiveAdSpot.getAdContent().d() && z10) {
                return new m();
            }
            return new j();
        }
    }

    /* loaded from: classes2.dex */
    public class d implements a.InterfaceC0233a {
        public d(IAVideoKit iAVideoKit) {
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public boolean a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof y);
        }

        @Override // com.fyber.inneractive.sdk.factories.a.InterfaceC0233a
        public com.fyber.inneractive.sdk.interfaces.b b(InneractiveAdSpot inneractiveAdSpot) {
            return new h();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        t tVar = sProvider;
        IAConfigManager.J.H.put(tVar.a(), tVar);
        n nVar = n.f17852f;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        if (applicationContext == null) {
            IAlog.e("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.a()) {
            nVar.f17853a = applicationContext;
            new Thread(nVar.f17857e, "VideoCache").start();
        }
        IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        b.a.f17184a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new b(this));
        c.b.f17186a.f17185a.add(new c(this));
        a.b.f17182a.f17181a.add(new d(this));
    }

    /* loaded from: classes2.dex */
    public class a implements t {
        @Override // com.fyber.inneractive.sdk.util.t
        public boolean a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return n.f17852f.a();
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.util.t
        public u a() {
            return u.Video;
        }
    }
}
