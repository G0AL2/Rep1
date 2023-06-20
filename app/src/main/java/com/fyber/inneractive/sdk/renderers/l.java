package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.os.Build;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.u;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;

/* loaded from: classes2.dex */
public class l implements d.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f20136a;

    public l(k kVar) {
        this.f20136a = kVar;
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar) {
        k kVar = this.f20136a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(kVar));
        this.f20136a.C = true;
        this.f20136a.M();
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b(com.fyber.inneractive.sdk.web.d dVar) {
        k kVar = this.f20136a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(kVar));
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void b() {
        this.f20136a.z();
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, a0 a0Var) {
        k kVar = this.f20136a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(kVar));
        k kVar2 = this.f20136a;
        if (kVar2.C) {
            kVar2.C = false;
            this.f20136a.M();
            return;
        }
        if (kVar2.F == UnitDisplayType.REWARDED) {
            kVar2.L();
        }
        c.a aVar = this.f20136a.f17282k;
        if (aVar != null) {
            aVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public d0.a a(String str, p0 p0Var) {
        com.fyber.inneractive.sdk.cache.session.enums.b bVar;
        k kVar = this.f20136a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(kVar));
        Context context = com.fyber.inneractive.sdk.util.l.f20301a;
        c.a aVar = this.f20136a.f17282k;
        if (aVar != null && aVar.getLayout() != null && this.f20136a.f17282k.getLayout().getContext() != null) {
            context = this.f20136a.f17282k.getLayout().getContext();
        }
        if (context != null) {
            k kVar2 = this.f20136a;
            if (kVar2.f17254i) {
                AdContent adcontent = kVar2.f17247b;
                com.fyber.inneractive.sdk.response.f fVar = adcontent == 0 ? null : (com.fyber.inneractive.sdk.response.f) ((u) adcontent).f17240b;
                if (fVar != null) {
                    kVar2.a(fVar);
                }
                k kVar3 = this.f20136a;
                com.fyber.inneractive.sdk.cache.session.enums.a aVar2 = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                if (kVar3.F == UnitDisplayType.REWARDED) {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16855f;
                } else {
                    bVar = com.fyber.inneractive.sdk.cache.session.enums.b.f16857h;
                }
                kVar3.a(aVar2, bVar);
                return this.f20136a.a(context, str, p0Var, com.fyber.inneractive.sdk.util.e.DISPLAY);
            }
        }
        return new d0.a(d0.c.FAILED, new Exception("No context or no native click detected"), context == null ? "null" : context.getClass().getName());
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a() {
        this.f20136a.a(new WebViewRendererProcessHasGoneError());
        this.f20136a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a(String str, String str2) {
        k kVar = this.f20136a;
        kVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(kVar));
        c.a aVar = this.f20136a.f17282k;
        if (aVar == null || aVar.getLayout() == null) {
            return;
        }
        k kVar2 = this.f20136a;
        if (!kVar2.D) {
            s.a(kVar2.f17282k.getLayout().getContext(), str, str2, this.f20136a.f17247b);
            this.f20136a.D = true;
            k kVar3 = this.f20136a;
            kVar3.getClass();
            IAlog.a("%sreporting auto redirect", IAlog.a(kVar3));
            return;
        }
        IAlog.a("%sredirect already reported for this ad", IAlog.a(kVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.u
    public void a(boolean z10) {
        com.fyber.inneractive.sdk.web.c cVar;
        String str;
        if (z10) {
            k kVar = this.f20136a;
            if (!kVar.f20132x) {
                kVar.f20132x = true;
                if (kVar.f17247b != 0) {
                    IAmraidWebViewController iAmraidWebViewController = kVar.f20133y;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.m();
                    }
                    T t10 = ((u) kVar.f17247b).f17240b;
                    if (t10 != 0 && (str = t10.f20170k) != null && str.trim().length() > 0) {
                        IAlog.d("%sfiring impression!", IAlog.a(kVar));
                        int i10 = IAlog.f20222a;
                        IAlog.a(1, null, "AD_IMPRESSION", new Object[0]);
                        kVar.b(str);
                    }
                    if (Build.VERSION.SDK_INT >= 19 && (cVar = kVar.f20133y.f20365b) != null) {
                        cVar.a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    kVar.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, kVar.F == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.b.f16855f : com.fyber.inneractive.sdk.cache.session.enums.b.f16857h);
                    kVar.A();
                    kVar.F();
                }
            }
        }
        k kVar2 = this.f20136a;
        kVar2.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(kVar2), Boolean.valueOf(z10));
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10, Orientation orientation) {
        c.a aVar = this.f20136a.f17282k;
        if (aVar != null) {
            aVar.setActivityOrientation(z10, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public boolean a(String str) {
        c.a aVar = this.f20136a.f17282k;
        if (aVar == null || aVar.getLayout() == null) {
            return false;
        }
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.f20136a.f17282k.getLayout().getContext(), str);
        if (startRichMediaIntent) {
            this.f20136a.z();
            return startRichMediaIntent;
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(com.fyber.inneractive.sdk.web.d dVar, boolean z10) {
        if (z10) {
            k kVar = this.f20136a;
            if (!kVar.f17290s) {
                kVar.f17290s = true;
                k kVar2 = this.f20136a;
                c.a aVar = kVar2.f17282k;
                if (aVar != null) {
                    kVar2.d(aVar.isCloseButtonDisplay());
                }
            }
            this.f20136a.K();
            c.a aVar2 = this.f20136a.f17282k;
            if (aVar2 == null || !aVar2.isCloseButtonDisplay()) {
                return;
            }
            k kVar3 = this.f20136a;
            kVar3.f17287p = false;
            c.a aVar3 = kVar3.f17282k;
            if (aVar3 != null) {
                aVar3.disableCloseButton();
            }
            kVar3.f17292u.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d.f
    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        this.f20136a.e(false);
        k kVar = this.f20136a;
        EventsListener eventslistener = kVar.f17248c;
        if (eventslistener != 0) {
            ((InneractiveFullscreenAdEventsListener) eventslistener).onAdEnteredErrorState(kVar.f17246a, adDisplayError);
        }
    }
}
