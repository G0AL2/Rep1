package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.network.p;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.c0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.w0;
import com.fyber.inneractive.sdk.web.d;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class k extends s<u, InneractiveFullscreenAdEventsListener> {
    public w0 E;
    public c.b I;
    public l0 J;

    /* renamed from: w  reason: collision with root package name */
    public d.f f20131w;

    /* renamed from: y  reason: collision with root package name */
    public IAmraidWebViewController f20133y;

    /* renamed from: x  reason: collision with root package name */
    public boolean f20132x = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f20134z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public boolean H = false;

    /* loaded from: classes2.dex */
    public class a implements w0.b {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.util.w0.b
        public void a(w0 w0Var) {
            k.this.G = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean E() {
        return !this.B && this.f20133y.I;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int G() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        Integer b10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (sVar = ((u) adcontent).f17241c) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null || (b10 = ((com.fyber.inneractive.sdk.config.global.features.c) ((u) this.f17247b).f17241c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b10.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int H() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        Integer b10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (sVar = ((u) adcontent).f17241c) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null || (b10 = ((com.fyber.inneractive.sdk.config.global.features.c) ((u) this.f17247b).f17241c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b10.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public long I() {
        int i10 = 2;
        if (this.F == UnitDisplayType.REWARDED) {
            int a10 = IAConfigManager.J.f16886v.f16987b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(a10));
            i10 = a10;
        } else {
            com.fyber.inneractive.sdk.config.h hVar = IAConfigManager.J.f16886v.f16987b;
            String l10 = Long.toString(2L);
            if (hVar.f16984a.containsKey("mraid_x_delay")) {
                l10 = hVar.f16984a.get("mraid_x_delay");
            }
            try {
                i10 = Integer.parseInt(l10);
            } catch (Throwable unused) {
            }
        }
        return i10 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean J() {
        return false;
    }

    public final void L() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.H) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.I != null) {
            a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.b.f16855f);
            ((InneractiveFullscreenUnitController.a) this.I).a();
        }
        D();
        this.H = true;
    }

    public final void M() {
        if (this.f17247b != 0 && this.f20133y != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            com.fyber.inneractive.sdk.web.c cVar = this.f20133y.f20365b;
            layoutParams.gravity = 17;
            cVar.setLayoutParams(layoutParams);
            return;
        }
        IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        EventsListener eventslistener;
        if (this.f20134z && !this.A && (eventslistener = this.f17248c) != 0) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f17246a);
        }
        this.f20131w = null;
        w0 w0Var = this.E;
        if (w0Var != null) {
            w0Var.f20351e = null;
            this.E = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        EventsListener eventslistener;
        if (this.F == UnitDisplayType.REWARDED) {
            L();
        }
        if (!this.A && (eventslistener = this.f17248c) != 0) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdDismissed(this.f17246a);
        }
        l0 l0Var = this.J;
        if (l0Var != null) {
            long j10 = l0Var.f20305b;
            if (j10 != 0) {
                String a10 = c0.a(j10, l0Var.f20307d);
                l0Var.f20305b = 0L;
                l0Var.f20306c = 0L;
                l0Var.f20307d = 0L;
                InneractiveAdSpot inneractiveAdSpot = l0Var.f20304a;
                com.fyber.inneractive.sdk.flow.j adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
                p pVar = p.INTERSTITIAL_VIEW_TIME;
                InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f17239a : null;
                com.fyber.inneractive.sdk.response.e c10 = adContent != null ? adContent.c() : null;
                JSONArray c11 = (adContent == null || (sVar = adContent.f17241c) == null) ? null : sVar.c();
                q.a aVar = new q.a(c10);
                aVar.f17683c = pVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c11;
                aVar.a("time", a10);
                aVar.a((String) null);
            }
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f17246a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof com.fyber.inneractive.sdk.flow.p)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.p) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        w0 w0Var;
        super.o();
        if (this.F == UnitDisplayType.REWARDED && (w0Var = this.E) != null) {
            w0Var.b();
        }
        l0 l0Var = this.J;
        if (l0Var != null) {
            if (l0Var.f20305b == 0) {
                l0Var.f20305b = System.currentTimeMillis();
            }
            if (l0Var.f20306c > 0) {
                l0Var.f20307d += System.currentTimeMillis() - l0Var.f20306c;
                l0Var.f20306c = 0L;
            }
        }
        this.f17292u.b();
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void s() {
        w0 w0Var;
        super.s();
        if (this.F == UnitDisplayType.REWARDED && (w0Var = this.E) != null) {
            w0Var.a();
        }
        l0 l0Var = this.J;
        if (l0Var != null) {
            l0Var.f20306c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f17292u;
        if (aVar.f20226b) {
            aVar.f20229e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean u() {
        boolean z10;
        if (this.f17282k == null) {
            z10 = true;
        } else if (this.F == UnitDisplayType.REWARDED) {
            if (this.G) {
                L();
            }
            z10 = this.G;
        } else {
            z10 = this.f17287p;
        }
        if (z10) {
            c.a aVar = this.f17282k;
            if (aVar != null) {
                aVar.dismissAd(true);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        a.InterfaceC0237a interfaceC0237a;
        z zVar;
        super.a(aVar, activity);
        AdContent adcontent = this.f17247b;
        r rVar = (adcontent == 0 || (zVar = ((u) adcontent).f17242d) == null) ? null : ((y) zVar).f17074c;
        boolean z10 = false;
        if (rVar != null) {
            IAmraidWebViewController iAmraidWebViewController = adcontent != 0 ? ((u) adcontent).f17297g : null;
            this.f20133y = iAmraidWebViewController;
            if (iAmraidWebViewController != null) {
                if (iAmraidWebViewController.f20365b != null) {
                    this.F = rVar.f17018b;
                    this.f20134z = false;
                    this.A = false;
                    this.J = new l0(this.f17246a);
                    this.f17282k = aVar;
                    View closeButton = aVar.getCloseButton();
                    if (closeButton != null && (interfaceC0237a = iAmraidWebViewController.f20405x) != null) {
                        com.fyber.inneractive.sdk.measurement.f fVar = (com.fyber.inneractive.sdk.measurement.f) interfaceC0237a;
                        try {
                            AdSession adSession = fVar.f17334b;
                            if (adSession != null) {
                                adSession.addFriendlyObstruction(closeButton, FriendlyObstructionPurpose.CLOSE_AD, null);
                            }
                        } catch (Throwable th) {
                            fVar.a(th);
                        }
                    }
                    com.fyber.inneractive.sdk.response.f fVar2 = (com.fyber.inneractive.sdk.response.f) ((u) this.f17247b).f17240b;
                    int i10 = fVar2.f20164e;
                    int i11 = fVar2.f20165f;
                    if ((i10 == 300 && i11 == 250) || (i10 == 600 && i11 == 500)) {
                        z10 = true;
                    }
                    this.B = z10;
                    if (z10) {
                        this.f20133y.setAdDefaultSize(com.fyber.inneractive.sdk.util.l.a(i10), com.fyber.inneractive.sdk.util.l.a(i11));
                    }
                    if (this.f20131w == null) {
                        this.f20131w = new l(this);
                    }
                    this.f20133y.setListener(this.f20131w);
                    M();
                    IAmraidWebViewController iAmraidWebViewController2 = this.f20133y;
                    ViewGroup layout = this.f17282k.getLayout();
                    InneractiveAdRequest inneractiveAdRequest = ((u) this.f17247b).f17239a;
                    iAmraidWebViewController2.a(layout, (ViewGroup.LayoutParams) null);
                    this.f20134z = true;
                    if (this.F == UnitDisplayType.REWARDED) {
                        w0 w0Var = new w0(TimeUnit.SECONDS, IAConfigManager.J.f16886v.f16987b.a("rewarded_mraid_delay", 31, 30));
                        this.E = w0Var;
                        w0Var.f20351e = new a();
                        w0Var.c();
                        return;
                    }
                    return;
                }
            }
            IAlog.e("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        IAlog.e("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
        throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public /* bridge */ /* synthetic */ boolean b(u uVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void c(boolean z10) {
        if (E()) {
            return;
        }
        if (z10) {
            this.f17292u.c();
        } else {
            this.f17292u.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
        M();
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public long a(long j10) {
        if (this.F == UnitDisplayType.REWARDED) {
            return 0L;
        }
        com.fyber.inneractive.sdk.config.h hVar = IAConfigManager.J.f16886v.f16987b;
        long j11 = 13;
        String l10 = Long.toString(13L);
        if (hVar.f16984a.containsKey("mraid_x_fallback_delay")) {
            l10 = hVar.f16984a.get("mraid_x_fallback_delay");
        }
        try {
            j11 = Long.parseLong(l10);
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.I = bVar;
    }
}
