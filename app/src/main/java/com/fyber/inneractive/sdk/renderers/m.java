package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.z;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.p;
import com.fyber.inneractive.sdk.flow.s;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.model.vast.q;
import com.fyber.inneractive.sdk.player.c;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class m extends s<y, InneractiveFullscreenAdEventsListener> implements com.fyber.inneractive.sdk.interfaces.c {
    public c.b D;
    public n F;

    /* renamed from: w  reason: collision with root package name */
    public c.a f20137w;

    /* renamed from: x  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f20138x;

    /* renamed from: y  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.b f20139y;

    /* renamed from: z  reason: collision with root package name */
    public WeakReference<InneractiveFullscreenVideoContentController> f20140z;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public UnitDisplayType E = UnitDisplayType.INTERSTITIAL;
    public final c.InterfaceC0240c G = new a();
    public final RelativeLayout.LayoutParams H = new RelativeLayout.LayoutParams(-1, -1);
    public boolean I = false;
    public boolean J = false;

    /* loaded from: classes2.dex */
    public class a implements c.InterfaceC0240c {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.c.InterfaceC0240c
        public void a(com.fyber.inneractive.sdk.player.c cVar) {
            m.this.f20139y.d(false);
            m.this.f20139y.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean E() {
        return this.I;
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int G() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        Integer b10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (sVar = ((y) adcontent).f17241c) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.i.class) == null || (b10 = ((com.fyber.inneractive.sdk.config.global.features.i) ((y) this.f17247b).f17241c.a(com.fyber.inneractive.sdk.config.global.features.i.class)).b("close_clickable_area_dp")) == null) {
            return -1;
        }
        return b10.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public int H() {
        com.fyber.inneractive.sdk.config.global.s sVar;
        Integer b10;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (sVar = ((y) adcontent).f17241c) == null || sVar.a(com.fyber.inneractive.sdk.config.global.features.i.class) == null || (b10 = ((com.fyber.inneractive.sdk.config.global.features.i) ((y) this.f17247b).f17241c.a(com.fyber.inneractive.sdk.config.global.features.i.class)).b("close_visible_size_dp")) == null) {
            return -1;
        }
        return b10.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // com.fyber.inneractive.sdk.flow.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long I() {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.J
            com.fyber.inneractive.sdk.config.i r1 = r0.f16886v
            com.fyber.inneractive.sdk.config.h r1 = r1.f16987b
            java.lang.String r2 = "endcard"
            com.fyber.inneractive.sdk.config.f r1 = r1.a(r2)
            r1.getClass()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f16936a
            java.lang.String r3 = "endcard_cr"
            boolean r2 = r2.containsKey(r3)
            r4 = 1
            java.lang.String r5 = "endcard_ci"
            r6 = 3
            if (r2 != 0) goto L96
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f16936a
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L28
            goto L96
        L28:
            com.fyber.inneractive.sdk.config.i r0 = r0.f16886v
            com.fyber.inneractive.sdk.config.h r0 = r0.f16987b
            java.lang.String r1 = "vast_endcard_x_delay"
            java.lang.String r2 = java.lang.Long.toString(r6)
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f16984a
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L43
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f16984a
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L43:
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L48
            goto L49
        L48:
        L49:
            AdContent extends com.fyber.inneractive.sdk.flow.j r0 = r8.f17247b
            if (r0 == 0) goto Lc3
            com.fyber.inneractive.sdk.flow.y r0 = (com.fyber.inneractive.sdk.flow.y) r0
            T extends com.fyber.inneractive.sdk.response.e r1 = r0.f17240b
            if (r1 == 0) goto Lc3
            com.fyber.inneractive.sdk.response.g r1 = (com.fyber.inneractive.sdk.response.g) r1
            com.fyber.inneractive.sdk.model.vast.b r1 = r1.C
            if (r1 == 0) goto Lc3
            com.fyber.inneractive.sdk.model.vast.c r1 = r1.f17392g
            if (r1 == 0) goto Lc3
            com.fyber.inneractive.sdk.model.vast.g r1 = r1.f17395a
            com.fyber.inneractive.sdk.model.vast.g r2 = com.fyber.inneractive.sdk.model.vast.g.Static
            if (r1 != r2) goto Lc3
            com.fyber.inneractive.sdk.config.global.s r0 = r0.f17241c
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r1 = com.fyber.inneractive.sdk.config.global.features.j.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.a(r1)
            com.fyber.inneractive.sdk.config.global.features.j r0 = (com.fyber.inneractive.sdk.config.global.features.j) r0
            if (r0 == 0) goto L8d
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r8.E
            int[] r2 = com.fyber.inneractive.sdk.config.global.features.j.a.f16955a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r4) goto L86
            r2 = 2
            if (r1 == r2) goto L7f
            goto L8d
        L7f:
            java.lang.String r1 = "endcard_x_btn_delay_iv"
            java.lang.Integer r0 = r0.b(r1)
            goto L8e
        L86:
            java.lang.String r1 = "endcard_x_btn_delay_rv"
            java.lang.Integer r0 = r0.b(r1)
            goto L8e
        L8d:
            r0 = 0
        L8e:
            if (r0 == 0) goto Lc3
            int r0 = r0.intValue()
            long r6 = (long) r0
            goto Lc3
        L96:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r8.E
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r2 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r2) goto L9d
            goto L9e
        L9d:
            r3 = r5
        L9e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f16936a     // Catch: java.lang.Exception -> Lb3
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Exception -> Lb3
            if (r0 == 0) goto Lb3
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f16936a     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb3
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> Lb3
            goto Lb4
        Lb3:
            r0 = r6
        Lb4:
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto Lc3
            r2 = 5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto Lc3
            r8.f17291t = r4
            r6 = r0
        Lc3:
            com.fyber.inneractive.sdk.player.controller.b r0 = r8.f20139y
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto Lce
            long r3 = r6 * r1
            r0.a(r3)
        Lce:
            long r6 = r6 * r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.m.I():long");
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public boolean J() {
        com.fyber.inneractive.sdk.player.ui.g gVar = this.f20138x;
        return gVar != null && ((com.fyber.inneractive.sdk.player.ui.i) gVar).d();
    }

    public void L() {
        if (this.B || this.f17248c == 0) {
            return;
        }
        this.B = true;
        c.a aVar = this.f20137w;
        if (aVar != null && aVar.wasDismissedByUser()) {
            a(q.EVENT_CLOSE);
            a(q.EVENT_CLOSE_LINEAR);
        }
        ((InneractiveFullscreenAdEventsListener) this.f17248c).onAdDismissed(this.f17246a);
    }

    public final void M() {
        z zVar;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (zVar = ((y) adcontent).f17242d) == null || ((com.fyber.inneractive.sdk.config.y) zVar).f17074c == null) {
            return;
        }
        IAConfigManager.J.f16888x.a(((com.fyber.inneractive.sdk.config.y) zVar).f17074c.f17018b == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.f16852c : com.fyber.inneractive.sdk.cache.session.enums.b.f16853d, com.fyber.inneractive.sdk.cache.session.enums.a.CLICK);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.interfaces.c.a r5, android.app.Activity r6) throws com.fyber.inneractive.sdk.external.InneractiveUnitController.AdDisplayError {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.m.a(com.fyber.inneractive.sdk.interfaces.c$a, android.app.Activity):void");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void c(boolean z10) {
        com.fyber.inneractive.sdk.player.ui.g gVar = this.f20138x;
        if ((gVar != null && ((com.fyber.inneractive.sdk.player.ui.i) gVar).d()) && this.I) {
            return;
        }
        if (z10) {
            this.f17292u.c();
        } else {
            this.f17292u.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        c.a aVar = this.f20137w;
        if (aVar != null) {
            aVar.destroy();
        }
        if (this.A) {
            L();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.f20139y;
        if (bVar != null) {
            bVar.destroy();
            this.f20139y = null;
        }
        com.fyber.inneractive.sdk.player.ui.g gVar = this.f20138x;
        if (gVar != null) {
            gVar.destroy();
            this.f20138x = null;
        }
        this.f20137w = null;
        this.f20140z = null;
        super.destroy();
    }

    public void e() {
        if (!this.C) {
            this.f17292u.a(true);
        }
        this.C = true;
    }

    public void g() {
        com.fyber.inneractive.sdk.model.vast.c cVar;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.f17247b;
        if (adcontent != 0) {
            y yVar = (y) adcontent;
            if (yVar.f17239a == null || yVar.f17240b == 0) {
                return;
            }
            String str = null;
            M();
            com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) ((y) this.f17247b).f17240b).C;
            if (bVar != null && (cVar = bVar.f17392g) != null && (hVar = cVar.f17396b) != null) {
                str = hVar.toString();
            }
            a(str);
        }
    }

    public void h() {
        this.I = true;
        CountDownTimer countDownTimer = this.f17293v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f17293v = null;
        }
        if (!this.f17290s) {
            this.f17290s = true;
            c.a aVar = this.f20137w;
            if (aVar != null) {
                d(aVar.isCloseButtonDisplay());
            }
        }
        c.a aVar2 = this.f20137w;
        if (aVar2 == null || !aVar2.isCloseButtonDisplay()) {
            return;
        }
        e(true);
    }

    public void j() {
        c.a aVar = this.f20137w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    public void k() {
        c.a aVar = this.f20137w;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    public void l() {
        IAConfigManager.J.f16888x.a(this.E == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.b.f16853d : com.fyber.inneractive.sdk.cache.session.enums.b.f16852c, com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION);
        A();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void m() {
        L();
        InneractiveAdSpot inneractiveAdSpot = this.f17246a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof p)) {
            return;
        }
        ((p) inneractiveAdSpot).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        super.o();
        this.f17292u.b();
    }

    public void onCompleted() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.s.a(this.f20140z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        d0 d0Var = IAConfigManager.J.f16888x;
        UnitDisplayType unitDisplayType = this.E;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        d0Var.a(unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.b.f16852c : com.fyber.inneractive.sdk.cache.session.enums.b.f16853d, com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION);
        if (this.E == unitDisplayType2) {
            c.b bVar = this.D;
            if (bVar != null) {
                ((InneractiveFullscreenUnitController.a) bVar).a();
            }
            D();
        }
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || ((y) adcontent).f17324g == null) {
            return;
        }
        F();
    }

    public void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.s.a(this.f20140z);
        c.a aVar = this.f20137w;
        if (aVar != null) {
            aVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    public void onProgress(int i10, int i11) {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.s.a(this.f20140z);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i10, i11);
        }
    }

    public void r() {
        z();
    }

    @Override // com.fyber.inneractive.sdk.flow.s, com.fyber.inneractive.sdk.interfaces.c
    public void s() {
        super.s();
        com.fyber.inneractive.sdk.util.a aVar = this.f17292u;
        if (aVar.f20226b) {
            aVar.f20229e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public boolean u() {
        com.fyber.inneractive.sdk.player.i iVar;
        com.fyber.inneractive.sdk.player.controller.b bVar;
        c.a aVar;
        com.fyber.inneractive.sdk.player.ui.g gVar;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (iVar = ((y) adcontent).f17324g) == null || (bVar = this.f20139y) == null || (aVar = this.f20137w) == null || (gVar = this.f20138x) == null) {
            return false;
        }
        ((com.fyber.inneractive.sdk.player.f) iVar.f19701f).getClass();
        if (((com.fyber.inneractive.sdk.player.ui.i) gVar).d()) {
            if (this.f17287p) {
                aVar.dismissAd(true);
                return true;
            }
            return true;
        } else if (bVar.c()) {
            bVar.c(true);
            return true;
        } else {
            return true;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void a(c.b bVar) {
        this.D = bVar;
    }

    public d0.a a(p0 p0Var, com.fyber.inneractive.sdk.util.e eVar) {
        Context context;
        M();
        if (this.f20138x.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.l.f20301a;
        } else {
            context = this.f20138x.getContext();
        }
        AdContent adcontent = this.f17247b;
        return a(context, adcontent != 0 ? ((y) adcontent).f() : null, p0Var, eVar);
    }

    public void a(boolean z10, Orientation orientation) {
        c.a aVar = this.f20137w;
        if (aVar != null) {
            aVar.setActivityOrientation(z10, orientation);
        }
    }

    public void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        c.a aVar = this.f20137w;
        if (aVar == null || aVar.getLayout() == null || this.f20137w.getLayout().getContext() == null) {
            return;
        }
        if (!this.J) {
            com.fyber.inneractive.sdk.network.s.a(this.f20137w.getLayout().getContext(), str, str2, this.f17247b);
            this.J = true;
            IAlog.a(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.a(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    public d0.a a(String str, p0 p0Var) {
        T t10;
        Context context;
        com.fyber.inneractive.sdk.model.vast.h hVar;
        AdContent adcontent = this.f17247b;
        if (adcontent != 0 && (t10 = ((y) adcontent).f17240b) != 0 && t10 != 0) {
            com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) t10).C;
            M();
            if (bVar != null) {
                com.fyber.inneractive.sdk.model.vast.c cVar = bVar.f17392g;
                String str2 = null;
                if (cVar != null && (hVar = cVar.f17396b) != null) {
                    str2 = hVar.toString();
                }
                a(str2);
                com.fyber.inneractive.sdk.util.e eVar = cVar == null ? com.fyber.inneractive.sdk.util.e.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.e.VAST_ENDCARD;
                if (this.f20138x.getContext() == null) {
                    context = com.fyber.inneractive.sdk.util.l.f20301a;
                } else {
                    context = this.f20138x.getContext();
                }
                d0.a a10 = a(context, str, p0Var, eVar);
                if (cVar != null && a10.f20243a != d0.c.FAILED) {
                    q qVar = q.EVENT_CLICK;
                    String[] strArr = {"EVENT_CLICK"};
                    com.fyber.inneractive.sdk.player.i iVar = ((y) this.f17247b).f17324g;
                    if (iVar != null) {
                        iVar.a("EVENT_TRACKING", strArr);
                    }
                }
                return a10;
            }
        }
        return new d0.a(d0.c.FAILED, new Exception("Internal SDK Error"), "null");
    }

    public void a(boolean z10) {
        com.fyber.inneractive.sdk.player.i iVar;
        c.a aVar;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (iVar = ((y) adcontent).f17324g) == null) {
            return;
        }
        iVar.a("TRACKING_COMPLETED", new String[0]);
        F();
        String[] strArr = new String[0];
        com.fyber.inneractive.sdk.player.i iVar2 = ((y) this.f17247b).f17324g;
        if (iVar2 != null) {
            iVar2.a("TRACKING_COMPLETED", strArr);
        }
        if (IAConfigManager.J.f16886v.f16987b.a("endcard").a("dsos", false) && z10 && (aVar = this.f20137w) != null) {
            aVar.dismissAd(true);
        } else {
            c(z10);
        }
    }

    public void a(View view, String str) {
        if (view == null || view.getContext() == null) {
            return;
        }
        InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
        z();
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    /* renamed from: a */
    public boolean b(y yVar) {
        com.fyber.inneractive.sdk.config.g gVar;
        T t10;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        com.fyber.inneractive.sdk.model.vast.c cVar;
        IAConfigManager iAConfigManager = IAConfigManager.J;
        com.fyber.inneractive.sdk.config.h hVar = iAConfigManager.f16886v.f16987b;
        hVar.getClass();
        String str = iAConfigManager.f16868d;
        if (hVar.f16985b.containsKey(str)) {
            gVar = hVar.f16985b.get(str);
        } else {
            gVar = new com.fyber.inneractive.sdk.config.g();
        }
        if (gVar.f16937a.containsKey("endcard") || (t10 = yVar.f17240b) == 0 || (bVar = ((com.fyber.inneractive.sdk.response.g) t10).C) == null || (cVar = bVar.f17392g) == null || cVar.f17395a != com.fyber.inneractive.sdk.model.vast.g.Static) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) yVar.f17241c.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        UnitDisplayType unitDisplayType = this.E;
        jVar.getClass();
        int i10 = j.a.f16955a[unitDisplayType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            return jVar.a("countdown_iv", false);
        }
        return jVar.a("countdown_rv", false);
    }

    @Override // com.fyber.inneractive.sdk.flow.s
    public long a(long j10) {
        if (this.f17291t) {
            return j10;
        }
        com.fyber.inneractive.sdk.config.h hVar = IAConfigManager.J.f16886v.f16987b;
        long j11 = 12;
        String l10 = Long.toString(12L);
        if (hVar.f16984a.containsKey("vast_endcard_x_fallback_delay")) {
            l10 = hVar.f16984a.get("vast_endcard_x_fallback_delay");
        }
        try {
            j11 = Long.parseLong(l10);
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    public void a(q qVar) {
        com.fyber.inneractive.sdk.player.i iVar;
        AdContent adcontent = this.f17247b;
        if (adcontent == 0 || (iVar = ((y) adcontent).f17324g) == null) {
            return;
        }
        iVar.a("EVENT_TRACKING", qVar.f17476a);
    }
}
