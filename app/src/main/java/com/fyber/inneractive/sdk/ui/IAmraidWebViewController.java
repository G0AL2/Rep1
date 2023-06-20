package com.fyber.inneractive.sdk.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.measurement.a;
import com.fyber.inneractive.sdk.measurement.f;
import com.fyber.inneractive.sdk.mraid.a0;
import com.fyber.inneractive.sdk.mraid.b0;
import com.fyber.inneractive.sdk.mraid.e;
import com.fyber.inneractive.sdk.mraid.g;
import com.fyber.inneractive.sdk.mraid.h;
import com.fyber.inneractive.sdk.mraid.i;
import com.fyber.inneractive.sdk.mraid.m;
import com.fyber.inneractive.sdk.mraid.o;
import com.fyber.inneractive.sdk.mraid.p;
import com.fyber.inneractive.sdk.mraid.q;
import com.fyber.inneractive.sdk.mraid.r;
import com.fyber.inneractive.sdk.mraid.u;
import com.fyber.inneractive.sdk.mraid.v;
import com.fyber.inneractive.sdk.mraid.w;
import com.fyber.inneractive.sdk.mraid.x;
import com.fyber.inneractive.sdk.mraid.y;
import com.fyber.inneractive.sdk.mraid.z;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.a;
import com.fyber.inneractive.sdk.web.d;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.inmobi.media.jh;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class IAmraidWebViewController extends d<d.f> {
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f20205a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f20206b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f20207c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f20208d0;

    /* renamed from: e0  reason: collision with root package name */
    public d.g f20209e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Runnable f20210f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Runnable f20211g0;

    /* loaded from: classes2.dex */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class ViewTreeObserver$OnPreDrawListenerC0271a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0272a implements Runnable {
                public RunnableC0272a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.InterfaceC0237a interfaceC0237a;
                    AdEvents adEvents;
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    if (iAmraidWebViewController.f20404w == null || (interfaceC0237a = iAmraidWebViewController.f20405x) == null) {
                        return;
                    }
                    f fVar = (f) interfaceC0237a;
                    if (fVar.f17336d || fVar.f17334b == null || (adEvents = fVar.f17335c) == null) {
                        return;
                    }
                    fVar.f17336d = true;
                    try {
                        adEvents.impressionOccurred();
                    } catch (Throwable th) {
                        fVar.a(th);
                    }
                }
            }

            public ViewTreeObserver$OnPreDrawListenerC0271a() {
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int i10;
                com.fyber.inneractive.sdk.web.c cVar;
                String arrayList;
                com.fyber.inneractive.sdk.web.c cVar2 = IAmraidWebViewController.this.f20365b;
                if (cVar2 != null) {
                    cVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    iAmraidWebViewController.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    if (iAmraidWebViewController.f20365b.getScaleX() != 1.0f && iAmraidWebViewController.f20365b.getScaleY() != 1.0f) {
                        arrayList2.add(new x(iAmraidWebViewController.f20365b.getWidthDp(), iAmraidWebViewController.f20365b.getHeightDp()));
                        arrayList2.add(new v(iAmraidWebViewController.f20365b.getWidthDp(), iAmraidWebViewController.f20365b.getHeightDp()));
                    } else {
                        arrayList2.add(new x(iAmraidWebViewController.K, iAmraidWebViewController.L));
                        arrayList2.add(new v(iAmraidWebViewController.M, iAmraidWebViewController.N));
                    }
                    com.fyber.inneractive.sdk.web.c cVar3 = iAmraidWebViewController.f20365b;
                    int c10 = l.c(cVar3 != null ? cVar3.getWidth() : iAmraidWebViewController.M);
                    com.fyber.inneractive.sdk.web.c cVar4 = iAmraidWebViewController.f20365b;
                    if (cVar4 != null) {
                        i10 = cVar4.getHeight();
                    } else {
                        i10 = iAmraidWebViewController.N;
                    }
                    arrayList2.add(new u(0, 0, c10, l.c(i10)));
                    if (iAmraidWebViewController.f20365b != null) {
                        if (arrayList2.toString().length() >= 2) {
                            String str = "{" + arrayList.substring(1, arrayList.length() - 1) + "}";
                            iAmraidWebViewController.f20365b.a("window.mraidbridge.fireChangeEvent(" + str + ");");
                            IAlog.d("Fire changes: %s", str);
                        }
                    }
                    a0 a0Var = a0.DEFAULT;
                    iAmraidWebViewController.f20406y = a0Var;
                    iAmraidWebViewController.a(new y(a0Var));
                    com.fyber.inneractive.sdk.web.c cVar5 = iAmraidWebViewController.f20365b;
                    boolean a10 = (cVar5 == null || cVar5.getContext() == null) ? false : k.a(new Intent(iAmraidWebViewController.f20365b.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
                    z zVar = new z();
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:"));
                    zVar.f17517b = k.a(intent);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("sms:"));
                    zVar.f17516a = k.a(intent2);
                    zVar.f17518c = k.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
                    zVar.f17520e = a10;
                    zVar.f17519d = k.n();
                    iAmraidWebViewController.a(zVar);
                    IAmraidWebViewController iAmraidWebViewController2 = IAmraidWebViewController.this;
                    iAmraidWebViewController2.a(new w(iAmraidWebViewController2.f20209e0));
                    IAmraidWebViewController iAmraidWebViewController3 = IAmraidWebViewController.this;
                    if (iAmraidWebViewController3.f20209e0 == d.g.INTERSTITIAL && (cVar = iAmraidWebViewController3.f20365b) != null) {
                        cVar.a("showInterstitial();");
                    }
                    com.fyber.inneractive.sdk.web.c cVar6 = IAmraidWebViewController.this.f20365b;
                    if (cVar6 != null) {
                        cVar6.a("window.mraidbridge.fireReadyEvent();");
                    }
                    IAmraidWebViewController iAmraidWebViewController4 = IAmraidWebViewController.this;
                    iAmraidWebViewController4.a(iAmraidWebViewController4.g(), true);
                    IAmraidWebViewController.this.n();
                    n.f20310b.postDelayed(new RunnableC0272a(), 100L);
                }
                return false;
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.web.c cVar = IAmraidWebViewController.this.f20365b;
            if (cVar != null) {
                cVar.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC0271a());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.web.c cVar = IAmraidWebViewController.this.f20365b;
            if (cVar != null) {
                cVar.a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.web.c cVar = IAmraidWebViewController.this.f20365b;
            if (cVar != null) {
                try {
                    cVar.invalidate();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public IAmraidWebViewController(Context context, boolean z10, d.g gVar, d.EnumC0274d enumC0274d, d.h hVar, boolean z11, com.fyber.inneractive.sdk.measurement.a aVar) {
        super(context, z10, false, gVar, enumC0274d, hVar, aVar);
        this.Z = false;
        this.f20205a0 = false;
        this.f20206b0 = false;
        this.f20207c0 = true;
        this.f20208d0 = false;
        this.f20210f0 = new a();
        this.f20211g0 = new b();
        this.Y = z11;
        this.f20365b.setId(R.id.inneractive_webview_mraid);
        this.f20209e0 = gVar;
    }

    public final void a(long j10) {
        n.f20310b.postDelayed(new c(), j10);
    }

    public void e(boolean z10) {
        com.fyber.inneractive.sdk.web.c cVar;
        a(new b0(z10));
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z10));
        L l10 = this.f20370g;
        if (l10 != 0) {
            l10.a(z10);
        }
        if (this.f20205a0 && this.Z && this.f20206b0 && (cVar = this.f20365b) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FyMraidVideo.");
            sb2.append(z10 ? "play" : "pause");
            sb2.append("();");
            cVar.a(sb2.toString());
        }
        if (this.f20365b == null || !z10) {
            return;
        }
        a(1L);
        a(100L);
        a(250L);
        a(1000L);
    }

    public void l() {
        a(false);
        Handler handler = n.f20310b;
        handler.removeCallbacks(this.f20211g0);
        handler.removeCallbacks(this.f20210f0);
    }

    public void m() {
        com.fyber.inneractive.sdk.web.c cVar = this.f20365b;
        if (cVar != null) {
            this.Z = true;
            if (Build.VERSION.SDK_INT >= 17 && this.f20206b0) {
                cVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            n.f20310b.postDelayed(this.f20210f0, 0L);
        }
    }

    public final void n() {
        com.fyber.inneractive.sdk.web.c cVar;
        if (this.Z && this.f20205a0 && this.f20206b0 && (cVar = this.f20365b) != null) {
            cVar.a("FyMraidVideo.play()");
            Runnable runnable = this.f20211g0;
            if (runnable != null) {
                n.f20310b.postDelayed(runnable, 5000L);
            }
            if (this.f20208d0) {
                this.f20365b.a("FyMraidVideo.mute(true)");
            }
        }
    }

    public void setAutoplayMRAIDVideos(boolean z10) {
        this.f20206b0 = z10;
    }

    public void setCenteringTagsRequired(boolean z10) {
        this.f20207c0 = z10;
    }

    public void setMuteMraidVideo(boolean z10) {
        this.f20208d0 = z10;
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public boolean a(String str, p0 p0Var) {
        com.fyber.inneractive.sdk.mraid.f fVar;
        com.fyber.inneractive.sdk.web.c cVar;
        f fVar2;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        com.fyber.inneractive.sdk.mraid.b bVar = null;
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith("success")) {
                IAlog.d("received iaadfinishedloading success", new Object[0]);
                if (!this.f20364a && this.f20369f != null && (cVar = this.f20365b) != null) {
                    cVar.a();
                    this.f20364a = true;
                    com.fyber.inneractive.sdk.measurement.a aVar = this.f20404w;
                    if (aVar != null) {
                        com.fyber.inneractive.sdk.web.c cVar2 = this.f20365b;
                        j jVar = this.f20385v;
                        IAlog.a("omsdk initMraidSession", new Object[0]);
                        Partner partner = ((com.fyber.inneractive.sdk.measurement.d) aVar).f17331c;
                        if (partner == null) {
                            IAlog.a("omsdk partner is null", new Object[0]);
                            fVar2 = null;
                        } else {
                            fVar2 = new f(partner, cVar2, jVar);
                            try {
                                AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(fVar2.f17333a, cVar2, "", ""));
                                fVar2.f17334b = createAdSession;
                                createAdSession.registerAdView(cVar2);
                                fVar2.f17334b.start();
                                AdEvents createAdEvents = AdEvents.createAdEvents(fVar2.f17334b);
                                fVar2.f17335c = createAdEvents;
                                createAdEvents.loaded();
                            }
                        }
                        this.f20405x = fVar2;
                    }
                    IAlog.a("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.a(this), Long.valueOf(System.currentTimeMillis() - this.f20380q));
                    Runnable runnable = this.f20378o;
                    if (runnable != null) {
                        n.f20310b.removeCallbacks(runnable);
                        this.f20378o = null;
                    }
                    a.f fVar3 = this.f20369f;
                    if (fVar3 != null) {
                        fVar3.a(this);
                    }
                }
            }
            return true;
        } else if ("mraid".equals(Uri.parse(str).getScheme())) {
            URI create = URI.create(str);
            String host = create.getHost();
            try {
                Map<String, String> a10 = a(create);
                com.fyber.inneractive.sdk.mraid.f[] values = com.fyber.inneractive.sdk.mraid.f.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        fVar = values[i10];
                        if (fVar.f17503a.equals(host)) {
                            break;
                        }
                        i10++;
                    } else {
                        fVar = com.fyber.inneractive.sdk.mraid.f.UNSPECIFIED;
                        break;
                    }
                }
                switch (fVar.ordinal()) {
                    case 0:
                        bVar = new com.fyber.inneractive.sdk.mraid.c(a10, this, p0Var);
                        break;
                    case 1:
                        bVar = new e(a10, this, p0Var);
                        break;
                    case 2:
                        bVar = new r(a10, this, p0Var);
                        break;
                    case 3:
                        bVar = new com.fyber.inneractive.sdk.mraid.l(a10, this, p0Var);
                        break;
                    case 4:
                        bVar = new com.fyber.inneractive.sdk.mraid.n(a10, this, p0Var);
                        break;
                    case 5:
                        bVar = new com.fyber.inneractive.sdk.mraid.j(a10, this, p0Var);
                        break;
                    case 6:
                        bVar = new p(a10, this, p0Var);
                        break;
                    case 7:
                        bVar = new o(a10, this, p0Var);
                        break;
                    case 8:
                        bVar = new m(a10, this, p0Var);
                        break;
                    case 9:
                        bVar = new q(a10, this, p0Var);
                        break;
                    case 10:
                        bVar = new g(a10, this, p0Var);
                        break;
                    case 11:
                        bVar = new h(a10, this, p0Var);
                        break;
                    case 12:
                        bVar = new i(a10, this, p0Var);
                        break;
                    case 13:
                        bVar = new com.fyber.inneractive.sdk.mraid.k(a10, this, p0Var);
                        break;
                    case 14:
                        bVar = new com.fyber.inneractive.sdk.mraid.d(a10, this, p0Var);
                        break;
                }
                if (bVar != null && (!(bVar instanceof e) || this.B != d.g.INTERSTITIAL)) {
                    bVar.f17488a = host;
                    IAlog.d("Processing MRaid command: %s", host);
                    if (bVar instanceof com.fyber.inneractive.sdk.mraid.a) {
                        a(new d.j(this, (com.fyber.inneractive.sdk.mraid.a) bVar, p0Var));
                    } else {
                        if (bVar.b()) {
                            d();
                        }
                        bVar.a();
                    }
                    b(host);
                    return true;
                }
                b(host);
                return true;
            } catch (Exception unused) {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.web.d
    public boolean a(WebView webView, String str) {
        IAlog.a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f20365b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str != null && str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.d("Dispatching MRAID Video detection event", new Object[0]);
                com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.f20384u;
                j jVar = this.f20385v;
                com.fyber.inneractive.sdk.response.e c10 = jVar == null ? null : jVar.c();
                j jVar2 = this.f20385v;
                JSONArray c11 = jVar2 == null ? null : jVar2.f17241c.c();
                q.a aVar = new q.a(c10);
                aVar.f17683c = pVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c11;
                aVar.a((String) null);
                this.f20205a0 = true;
                n();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.f20370g != 0) {
                    b(false);
                    com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.f20384u;
                    j jVar3 = this.f20385v;
                    com.fyber.inneractive.sdk.response.e c12 = jVar3 == null ? null : jVar3.c();
                    j jVar4 = this.f20385v;
                    JSONArray c13 = jVar4 == null ? null : jVar4.f17241c.c();
                    q.a aVar2 = new q.a(c12);
                    aVar2.f17682b = oVar;
                    aVar2.f17681a = inneractiveAdRequest2;
                    aVar2.f17684d = c13;
                    aVar2.a("video_timeout_in_msecs", String.valueOf((int) jh.DEFAULT_BITMAP_TIMEOUT)).a((String) null);
                }
                L l10 = this.f20370g;
                if (l10 != 0) {
                    ((d.f) l10).a(new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            }
            return true;
        } else {
            return super.a(webView, str);
        }
    }
}
