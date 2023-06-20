package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes2.dex */
public class e implements d.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f20097a;

    public e(g gVar) {
        this.f20097a = gVar;
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar) {
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(gVar));
        g gVar2 = this.f20097a;
        EventsListener eventslistener = gVar2.f17248c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(gVar2.f17246a);
        }
        g gVar3 = this.f20097a;
        gVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(gVar3));
        this.f20097a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b(com.fyber.inneractive.sdk.web.d dVar) {
        this.f20097a.d(true);
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(gVar));
        g gVar2 = this.f20097a;
        EventsListener eventslistener = gVar2.f17248c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdResized(gVar2.f17246a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b() {
        this.f20097a.z();
        this.f20097a.B();
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, a0 a0Var) {
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(gVar));
        g gVar2 = this.f20097a;
        EventsListener eventslistener = gVar2.f17248c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdCollapsed(gVar2.f17246a);
        }
        this.f20097a.I();
        g gVar3 = this.f20097a;
        gVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(gVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public d0.a a(String str, p0 p0Var) {
        z zVar;
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(gVar));
        ViewGroup viewGroup = this.f20097a.f20104p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.l.f20301a : this.f20097a.f20104p.getContext();
        if (context != null) {
            g gVar2 = this.f20097a;
            if (gVar2.f17254i) {
                AdContent adcontent = gVar2.f17247b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((u) adcontent).f17240b : null;
                if (fVar != null) {
                    gVar2.a(fVar);
                }
                g gVar3 = this.f20097a;
                AdContent adcontent2 = gVar3.f17247b;
                if (adcontent2 != 0 && (zVar = ((u) adcontent2).f17242d) != null && ((y) zVar).f17074c != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                    if (((y) zVar).f17074c.f17018b == UnitDisplayType.MRECT) {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16854e;
                    } else {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16856g;
                    }
                    gVar3.a(aVar, bVar);
                }
                return this.f20097a.a(context, str, p0Var, com.fyber.inneractive.sdk.util.e.DISPLAY);
            }
        }
        return new d0.a(d0.c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a() {
        this.f20097a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a(String str, String str2) {
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(gVar));
        ViewGroup viewGroup = this.f20097a.f20104p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        g gVar2 = this.f20097a;
        if (!gVar2.f20110v) {
            s.a(gVar2.f20104p.getContext(), str, str2, this.f20097a.f17247b);
            this.f20097a.f20110v = true;
            g gVar3 = this.f20097a;
            gVar3.getClass();
            IAlog.a("%sreporting auto redirect", IAlog.a(gVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(gVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a(boolean z10) {
        z zVar;
        r rVar;
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        g gVar = this.f20097a;
        gVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(gVar), Boolean.valueOf(z10));
        if (z10) {
            g gVar2 = this.f20097a;
            if (!gVar2.f20103o) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(gVar2));
                AdContent adcontent = gVar2.f17247b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent != 0 ? (com.fyber.inneractive.sdk.response.f) ((u) adcontent).f17240b : null;
                if (fVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = gVar2.f20101m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.m();
                    }
                    gVar2.b(fVar);
                }
                long G = gVar2.G();
                gVar2.f20099k = G;
                if (G != 0) {
                    gVar2.a(G, true);
                }
                AdContent adcontent2 = gVar2.f17247b;
                if (adcontent2 != 0 && (zVar = ((u) adcontent2).f17242d) != null && (rVar = ((y) zVar).f17074c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (rVar.f17018b == UnitDisplayType.MRECT) {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16854e;
                    } else {
                        bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16856g;
                    }
                    gVar2.a(aVar, bVar);
                }
                gVar2.A();
                this.f20097a.f20103o = true;
                return;
            }
            b bVar2 = gVar2.f20113y;
            if (bVar2 != null) {
                bVar2.b();
            }
            this.f20097a.I();
            return;
        }
        b bVar3 = this.f20097a.f20113y;
        if (bVar3 != null && bVar3.f20090h) {
            bVar3.c();
        }
        this.f20097a.d(false);
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public boolean a(String str) {
        ViewGroup viewGroup = this.f20097a.f20104p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f20097a.f20104p.getContext(), str);
        if (startRichMediaIntent) {
            g gVar = this.f20097a;
            if (gVar.f17248c != 0) {
                gVar.z();
                return startRichMediaIntent;
            }
            return startRichMediaIntent;
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        g gVar = this.f20097a;
        EventsListener eventslistener = gVar.f17248c;
        if (eventslistener != 0) {
            ((InneractiveAdViewEventsListener) eventslistener).onAdEnteredErrorState(gVar.f17246a, adDisplayError);
        }
    }
}
