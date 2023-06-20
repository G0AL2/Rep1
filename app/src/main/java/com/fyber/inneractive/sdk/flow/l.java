package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.d0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.network.h0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class l<AdContent extends j, EventsListener extends InneractiveUnitController.EventsListener> implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdSpot f17246a;

    /* renamed from: b  reason: collision with root package name */
    public AdContent f17247b;

    /* renamed from: c  reason: collision with root package name */
    public EventsListener f17248c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17249d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17250e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17251f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17252g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17253h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17254i = true;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f17255j;

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.network.u<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17256a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f17257b;

        public a(l lVar, String str, long j10) {
            this.f17256a = str;
            this.f17257b = j10;
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(String str, Exception exc, boolean z10) {
            String str2 = str;
            int i10 = IAlog.f20222a;
            IAlog.a(1, null, "Hit Request - %s", this.f17256a);
            IAlog.a("Hit Request: Hitting URL finished: %s", this.f17256a);
            if (exc == null) {
                IAlog.a("Hit Request: Hitting URL response code: %s", str2);
            } else {
                IAlog.a("Hit Request: Hitting URL failed: %s", exc);
            }
            IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.f17257b));
        }
    }

    public void A() {
        com.fyber.inneractive.sdk.response.e c10;
        OnGlobalImpressionDataListener onGlobalImpressionDataListener;
        ImpressionData impressionData;
        if (this.f17251f || this.f17248c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.f17248c.onAdImpression(this.f17246a);
        AdContent adcontent = this.f17247b;
        if (adcontent != null && (c10 = adcontent.c()) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.J;
            d0 d0Var = iAConfigManager.f16888x;
            if (d0Var != null) {
                UnitDisplayType unitDisplayType = c10.f20173n;
                ImpressionData impressionData2 = c10.f20177r;
                d0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData2 != null ? impressionData2.getAdvertiserDomain() : null);
                d0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", c10.f20184y);
                if (unitDisplayType != UnitDisplayType.REWARDED && (impressionData = c10.f20177r) != null && impressionData.getVideo() != null && c10.f20177r.getVideo().isSkippable()) {
                    d0Var.a(unitDisplayType, "LAST_VAST_SKIPED");
                }
                if (this.f17247b.isVideoAd()) {
                    d0Var.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                }
                d0Var.a(unitDisplayType, "LAST_CLICKED");
            }
            j0 j0Var = iAConfigManager.A;
            com.fyber.inneractive.sdk.config.z zVar = this.f17247b.f17242d;
            ImpressionData impressionData3 = c10.f20177r;
            j0Var.getClass();
            if (zVar != null && (onGlobalImpressionDataListener = j0Var.f20292a) != null) {
                com.fyber.inneractive.sdk.config.y yVar = (com.fyber.inneractive.sdk.config.y) zVar;
                onGlobalImpressionDataListener.onImpression(yVar.f17073b, yVar.f17072a, impressionData3);
            }
            EventsListener eventslistener = this.f17248c;
            if (eventslistener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f17246a, c10.f20177r);
            } else if (eventslistener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventslistener).onAdImpression(this.f17246a, c10.f20177r);
            }
        }
        this.f17251f = true;
    }

    public void B() {
        if (this.f17248c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f17248c.onAdWillOpenExternalApp(this.f17246a);
        }
        C();
    }

    public final void C() {
        this.f17253h = false;
        this.f17252g = false;
    }

    public void D() {
        AdContent adcontent = this.f17247b;
        if (adcontent == null || adcontent.c() == null) {
            return;
        }
        String str = this.f17247b.c().f20174o;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.d("%sfiring rewarded completion!", IAlog.a(this));
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "AD_REWARDED_COMPLETION", new Object[0]);
        b(str);
    }

    public void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f20170k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.d("%sfiring impression!", IAlog.a(this));
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "AD_IMPRESSION", new Object[0]);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f17249d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f17249d = false;
        }
        Runnable runnable = this.f17255j;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
            this.f17255j = null;
        }
        this.f17247b = null;
        this.f17248c = null;
        this.f17246a = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f17246a = inneractiveAdSpot;
        this.f17247b = (AdContent) inneractiveAdSpot.getAdContent();
        this.f17248c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onApplicationInBackground() {
        B();
        C();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f17249d) {
            this.f17249d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f17248c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f17248c.onAdWillCloseInternalBrowser(this.f17246a);
        }
        C();
    }

    public int w() {
        return -1;
    }

    public int x() {
        return -1;
    }

    public boolean y() {
        AdContent adcontent = this.f17247b;
        if (adcontent != null) {
            return adcontent.d();
        }
        return true;
    }

    public void z() {
        com.fyber.inneractive.sdk.response.e c10;
        if (this.f17248c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f17248c.onAdClicked(this.f17246a);
        }
        AdContent adcontent = this.f17247b;
        if (adcontent == null || (c10 = adcontent.c()) == null) {
            return;
        }
        IAConfigManager.J.f16888x.a(c10.f20173n, "LAST_CLICKED", "1");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.util.d0.a a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.p0 r19, com.fyber.inneractive.sdk.util.e r20) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.l.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.p0, com.fyber.inneractive.sdk.util.e):com.fyber.inneractive.sdk.util.d0$a");
    }

    public void b(String str) {
        h0 h0Var = new h0(new a(this, str, System.currentTimeMillis()), str);
        IAConfigManager.J.f16884t.f17705a.offer(h0Var);
        h0Var.a(m0.QUEUED);
    }

    public void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f20171l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "AD_CLICKED", new Object[0]);
        b(str);
    }

    public void a(String str) {
        if (this.f17252g) {
            return;
        }
        this.f17252g = true;
        com.fyber.inneractive.sdk.network.p pVar = com.fyber.inneractive.sdk.network.p.VAST_EVENT_COMPANION_CLICKED;
        AdContent adcontent = this.f17247b;
        InneractiveAdRequest inneractiveAdRequest = adcontent != null ? adcontent.f17239a : null;
        com.fyber.inneractive.sdk.response.e c10 = adcontent != null ? adcontent.c() : null;
        AdContent adcontent2 = this.f17247b;
        JSONArray c11 = adcontent2 != null ? adcontent2.f17241c.c() : null;
        q.a aVar = new q.a(c10);
        aVar.f17683c = pVar;
        aVar.f17681a = inneractiveAdRequest;
        aVar.f17684d = c11;
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "na";
        }
        try {
            jSONObject.put("mime", str);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "mime", str);
        }
        aVar.f17686f.put(jSONObject);
        aVar.a((String) null);
    }

    public void a(InneractiveUnitController.AdDisplayError adDisplayError) {
        String simpleName = adDisplayError.getClass().getSimpleName();
        String message = adDisplayError.getMessage();
        AdContent adcontent = this.f17247b;
        com.fyber.inneractive.sdk.network.r.a(simpleName, message, adcontent != null ? adcontent.f17239a : null, adcontent != null ? adcontent.c() : null);
        if (this.f17248c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), adDisplayError.getMessage());
            this.f17248c.onAdEnteredErrorState(this.f17246a, adDisplayError);
        }
    }

    public void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.b bVar) {
        com.fyber.inneractive.sdk.cache.session.d dVar = IAConfigManager.J.f16888x.f16930a;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.cache.session.c(dVar, aVar, bVar));
        }
    }
}
