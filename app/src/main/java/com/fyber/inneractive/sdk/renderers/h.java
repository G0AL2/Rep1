package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.player.c;
import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.f0;
import com.fyber.inneractive.sdk.util.p0;

/* loaded from: classes2.dex */
public class h extends com.fyber.inneractive.sdk.flow.l<y, InneractiveAdViewEventsListener> implements com.fyber.inneractive.sdk.interfaces.b, InneractiveNativeVideoContentController.Renderer, f0.e {

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f20115k;

    /* renamed from: l  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.g f20116l;

    /* renamed from: m  reason: collision with root package name */
    public q f20117m;

    /* renamed from: n  reason: collision with root package name */
    public VideoContentListener f20118n;

    /* renamed from: p  reason: collision with root package name */
    public ViewGroup f20120p;

    /* renamed from: q  reason: collision with root package name */
    public n f20121q;

    /* renamed from: t  reason: collision with root package name */
    public Runnable f20124t;

    /* renamed from: o  reason: collision with root package name */
    public final c.InterfaceC0240c f20119o = new a();

    /* renamed from: r  reason: collision with root package name */
    public float f20122r = 0.0f;

    /* renamed from: s  reason: collision with root package name */
    public Rect f20123s = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public boolean f20125u = false;

    /* renamed from: v  reason: collision with root package name */
    public final q.a f20126v = new b();

    /* loaded from: classes2.dex */
    public class a implements c.InterfaceC0240c {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.player.c.InterfaceC0240c
        public void a(com.fyber.inneractive.sdk.player.c cVar) {
            q qVar = h.this.f20117m;
            if (qVar != null) {
                qVar.d(false);
                h.this.f20117m.f();
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    public static /* synthetic */ boolean a(com.fyber.inneractive.sdk.renderers.h r0, boolean r1) {
        /*
            r0.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.h.a(com.fyber.inneractive.sdk.renderers.h, boolean):boolean");
    }

    public final void E() {
        ViewGroup viewGroup;
        Runnable runnable = this.f20124t;
        if (runnable == null || (viewGroup = this.f20120p) == null) {
            return;
        }
        viewGroup.removeCallbacks(runnable);
        this.f20124t = null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.flow.l, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        t();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int f() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void n() {
        q qVar = this.f20117m;
        if (qVar != null) {
            qVar.d(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public int p() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public void pauseVideo() {
        q qVar = this.f20117m;
        if (qVar != null) {
            qVar.pauseVideo();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public void playVideo() {
        q qVar = this.f20117m;
        if (qVar != null) {
            qVar.b(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void t() {
        E();
        f0.d.f20270a.a(this.f20120p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f20120p);
        if (this.f20117m != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            this.f20117m.a((q) null);
            this.f20117m.destroy();
            this.f20117m = null;
        }
        if (this.f20116l != null) {
            this.f20120p.setLayoutTransition(null);
            this.f20120p.removeView(this.f20115k);
            this.f20116l.destroy();
            this.f20116l = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(com.fyber.inneractive.sdk.flow.j jVar) {
        return jVar instanceof y;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a(ViewGroup viewGroup) {
        Bitmap bitmap;
        InneractiveAdSpot inneractiveAdSpot = this.f17246a;
        if (inneractiveAdSpot == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f20120p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (!(selectedUnitController instanceof InneractiveAdViewUnitController)) {
            IAlog.e("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        } else {
            InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
            if (selectedContentController != null) {
                if (selectedContentController instanceof InneractiveAdViewVideoContentController) {
                    this.f20118n = ((InneractiveAdViewVideoContentController) selectedContentController).getEventsListener();
                } else {
                    IAlog.e("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                }
            }
        }
        this.f20125u = false;
        this.f20115k = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.player.i iVar = ((y) this.f17247b).f17324g;
        Context context = viewGroup.getContext();
        if (iVar != null) {
            ((com.fyber.inneractive.sdk.player.f) iVar.f19701f).getClass();
            com.fyber.inneractive.sdk.renderers.a aVar = new com.fyber.inneractive.sdk.renderers.a(iVar);
            this.f20121q = aVar;
            this.f20116l = aVar.a(context);
            this.f20117m = (q) this.f20121q.a(this.f17246a, (y) this.f17247b);
            this.f20120p.addView(this.f20115k, new ViewGroup.LayoutParams(-1, -2));
            this.f20120p.setLayoutTransition(null);
            this.f20115k.addView((View) this.f20116l, new FrameLayout.LayoutParams(-2, -2, 17));
            this.f20117m.a((q) this.f20126v);
            this.f20117m.d(this.f20121q.a());
            this.f20121q.a(this.f20119o);
            if ((this.f20121q instanceof com.fyber.inneractive.sdk.renderers.a) && (bitmap = ((com.fyber.inneractive.sdk.player.f) iVar.f19701f).f17734l) != null) {
                this.f20117m.a(bitmap);
            }
            f0 f0Var = f0.d.f20270a;
            ViewGroup viewGroup2 = this.f20120p;
            f0Var.getClass();
            f0Var.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements q.a {
        public b() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void a(String str, String str2) {
            h hVar = h.this;
            hVar.getClass();
            IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(hVar));
            ViewGroup viewGroup = h.this.f20120p;
            if (viewGroup == null || viewGroup.getContext() == null) {
                return;
            }
            h hVar2 = h.this;
            if (!hVar2.f20125u) {
                s.a(hVar2.f20120p.getContext(), str, str2, h.this.f17247b);
                h.this.f20125u = true;
                h hVar3 = h.this;
                hVar3.getClass();
                IAlog.a("%s reporting auto redirect", IAlog.a(hVar3));
                return;
            }
            IAlog.a("%s redirect already reported for this ad", IAlog.a(hVar2));
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void a(boolean z10) {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void a(boolean z10, Orientation orientation) {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.q.a
        public void c() {
            com.fyber.inneractive.sdk.display.a cVar;
            h hVar = h.this;
            EventsListener eventslistener = hVar.f17248c;
            if (eventslistener != 0) {
                ((InneractiveAdViewEventsListener) eventslistener).onAdExpanded(hVar.f17246a);
            }
            ViewGroup viewGroup = h.this.f20120p;
            if (viewGroup == null || viewGroup.getContext() == null) {
                return;
            }
            h hVar2 = h.this;
            if (hVar2.f17247b instanceof com.fyber.inneractive.sdk.dv.a) {
                cVar = new com.fyber.inneractive.sdk.display.b();
            } else {
                cVar = new com.fyber.inneractive.sdk.display.c();
            }
            if (cVar instanceof com.fyber.inneractive.sdk.display.c) {
                com.fyber.inneractive.sdk.display.c cVar2 = (com.fyber.inneractive.sdk.display.c) cVar;
                Context context = hVar2.f20120p.getContext();
                InneractiveAdSpot inneractiveAdSpot = h.this.f17246a;
                Intent intent = new Intent(context, InneractiveFullscreenAdActivity.class);
                intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                try {
                    IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(context), inneractiveAdSpot.getLocalUniqueId());
                    context.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(context));
                }
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void e() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void g() {
            T t10;
            com.fyber.inneractive.sdk.model.vast.c cVar;
            com.fyber.inneractive.sdk.model.vast.h hVar;
            AdContent adcontent = h.this.f17247b;
            if (adcontent != 0) {
                y yVar = (y) adcontent;
                if (yVar.f17239a == null || (t10 = yVar.f17240b) == 0) {
                    return;
                }
                String str = null;
                com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) t10).C;
                if (bVar != null && (cVar = bVar.f17392g) != null && (hVar = cVar.f17396b) != null) {
                    str = hVar.toString();
                }
                h.this.a(str);
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void h() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void j() {
            h.this.a(new WebViewRendererProcessHasGoneError());
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void k() {
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void l() {
            h hVar = h.this;
            y yVar = (y) hVar.f17247b;
            if (yVar.f17325h) {
                return;
            }
            yVar.f17325h = true;
            hVar.A();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void onCompleted() {
            com.fyber.inneractive.sdk.player.ui.g gVar;
            h hVar = h.this;
            VideoContentListener videoContentListener = hVar.f20118n;
            if (videoContentListener == null || (gVar = hVar.f20116l) == null || !((com.fyber.inneractive.sdk.player.ui.c) gVar).f19768e) {
                return;
            }
            videoContentListener.onCompleted();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void onPlayerError() {
            com.fyber.inneractive.sdk.player.ui.g gVar;
            h hVar = h.this;
            VideoContentListener videoContentListener = hVar.f20118n;
            if (videoContentListener == null || (gVar = hVar.f20116l) == null || !((com.fyber.inneractive.sdk.player.ui.c) gVar).f19768e) {
                return;
            }
            videoContentListener.onPlayerError();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void onProgress(int i10, int i11) {
            com.fyber.inneractive.sdk.player.ui.g gVar;
            h hVar = h.this;
            VideoContentListener videoContentListener = hVar.f20118n;
            if (videoContentListener == null || (gVar = hVar.f20116l) == null || !((com.fyber.inneractive.sdk.player.ui.c) gVar).f19768e) {
                return;
            }
            videoContentListener.onProgress(i10, i11);
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void r() {
            h hVar = h.this;
            if (hVar.f17248c != 0) {
                hVar.z();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public void a(View view, String str) {
            if (view == null || view.getContext() == null) {
                return;
            }
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(view.getContext(), str);
            h.this.z();
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public d0.a a(p0 p0Var, com.fyber.inneractive.sdk.util.e eVar) {
            Context context;
            h hVar = h.this;
            if (hVar.f20116l.getContext() == null) {
                context = com.fyber.inneractive.sdk.util.l.f20301a;
            } else {
                context = h.this.f20116l.getContext();
            }
            AdContent adcontent = h.this.f17247b;
            return hVar.a(context, adcontent != 0 ? ((y) adcontent).f() : null, p0Var, eVar);
        }

        @Override // com.fyber.inneractive.sdk.player.controller.s
        public d0.a a(String str, p0 p0Var) {
            T t10;
            com.fyber.inneractive.sdk.model.vast.c cVar;
            com.fyber.inneractive.sdk.model.vast.h hVar;
            AdContent adcontent = h.this.f17247b;
            if (adcontent != 0) {
                y yVar = (y) adcontent;
                if (yVar.f17239a != null && (t10 = yVar.f17240b) != 0) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.response.g) t10).C;
                    h.this.a((bVar == null || (cVar = bVar.f17392g) == null || (hVar = cVar.f17396b) == null) ? null : hVar.toString());
                }
            }
            Context context = com.fyber.inneractive.sdk.util.l.f20301a;
            ViewGroup viewGroup = h.this.f20120p;
            if (viewGroup != null && viewGroup.getContext() != null) {
                context = h.this.f20120p.getContext();
            }
            if (TextUtils.isEmpty(str)) {
                y yVar2 = (y) h.this.f17247b;
                T t11 = yVar2.f17240b;
                if (t11 != 0) {
                    com.fyber.inneractive.sdk.model.vast.c cVar2 = ((com.fyber.inneractive.sdk.response.g) t11).C.f17392g;
                    r1 = cVar2 != null ? cVar2.f17401g : null;
                    if (r1 == null) {
                        str = yVar2.f();
                    }
                }
                str = r1;
            }
            return h.this.a(context, str, p0Var, com.fyber.inneractive.sdk.util.e.VAST_ENDCARD);
        }
    }

    @Override // com.fyber.inneractive.sdk.util.f0.e
    public void a(View view, float f10, Rect rect) {
        if (this.f20122r == f10 && this.f20123s.equals(rect)) {
            return;
        }
        this.f20122r = f10;
        this.f20123s.set(rect);
        q qVar = this.f20117m;
        if (qVar != null) {
            qVar.b(false);
            ((com.fyber.inneractive.sdk.player.ui.c) this.f20116l).b();
            this.f20117m.a(f10);
        }
        if (f10 > 0.0f) {
            E();
            i iVar = new i(this);
            this.f20124t = iVar;
            this.f20120p.postDelayed(iVar, 100L);
            return;
        }
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public boolean a(View view) {
        return view.equals(this.f20120p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public void a() {
        q qVar = this.f20117m;
        if (qVar != null) {
            qVar.a();
        }
    }
}
