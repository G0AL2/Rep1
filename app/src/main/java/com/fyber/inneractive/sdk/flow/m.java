package com.fyber.inneractive.sdk.flow;

import android.os.Looper;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.adm.e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.e;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements p, v {

    /* renamed from: a  reason: collision with root package name */
    public final String f17258a;

    /* renamed from: b  reason: collision with root package name */
    public InneractiveAdSpot.RequestListener f17259b;

    /* renamed from: c  reason: collision with root package name */
    public InneractiveAdRequest f17260c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f17261d;

    /* renamed from: e  reason: collision with root package name */
    public j f17262e;

    /* renamed from: f  reason: collision with root package name */
    public x f17263f;

    /* renamed from: g  reason: collision with root package name */
    public Set<x> f17264g;

    /* renamed from: h  reason: collision with root package name */
    public d f17265h;

    /* renamed from: i  reason: collision with root package name */
    public c f17266i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17267j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17268k = false;

    /* renamed from: l  reason: collision with root package name */
    public f f17269l;

    /* loaded from: classes.dex */
    public class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.e f17270a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f17271b;

        public a(com.fyber.inneractive.sdk.bidder.adm.e eVar, String str) {
            this.f17270a = eVar;
            this.f17271b = str;
        }

        public void a(Exception exc, InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
            com.fyber.inneractive.sdk.network.o oVar;
            com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
            e.b bVar = m.this.f17261d;
            if (bVar != null) {
                ((n) bVar).a(null, eVar, new InneractiveInfrastructureError(inneractiveErrorCode));
            }
            m mVar = m.this;
            String str = this.f17271b;
            mVar.getClass();
            if (inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR)) {
                oVar = com.fyber.inneractive.sdk.network.o.FATAL_ADM_MARKUP_FETCHING_ERROR;
            } else {
                oVar = com.fyber.inneractive.sdk.network.o.FATAL_ADM_PARSING_ERROR;
            }
            if (eVar != null) {
                eVar.A = false;
            }
            q.a aVar = new q.a(eVar);
            aVar.f17682b = oVar;
            aVar.f17681a = null;
            aVar.f17684d = null;
            JSONObject jSONObject = new JSONObject();
            String name = exc.getClass().getName();
            try {
                jSONObject.put("exception", name);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "exception", name);
            }
            String localizedMessage = exc.getLocalizedMessage();
            try {
                jSONObject.put("message", localizedMessage);
            } catch (Exception unused2) {
                IAlog.e("Got exception adding param to json object: %s, %s", "message", localizedMessage);
            }
            try {
                jSONObject.put("admPayload", str);
            } catch (Exception unused3) {
                IAlog.e("Got exception adding param to json object: %s, %s", "admPayload", str);
            }
            aVar.f17686f.put(jSONObject);
            aVar.a((String) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.b();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    public m() {
        String uuid = UUID.randomUUID().toString();
        this.f17258a = uuid;
        this.f17264g = new HashSet();
        IAlog.a("%sInneractiveAdSpotImpl created with UID: %s", c(), uuid);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            x xVar = (x) inneractiveUnitController;
            xVar.setAdSpot(this);
            if (this.f17264g.size() > 0) {
                Iterator it = new HashSet(this.f17264g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        x xVar2 = this.f17263f;
                        if (xVar2 != null && xVar2.equals(inneractiveUnitController2)) {
                            this.f17263f.destroy();
                            this.f17263f = null;
                        }
                        this.f17264g.remove(inneractiveUnitController2);
                    }
                }
            }
            this.f17264g.add(xVar);
            if (this.f17262e != null) {
                d();
            }
        }
    }

    public final void b() {
        for (x xVar : this.f17264g) {
            xVar.destroy();
        }
        this.f17264g.clear();
        d dVar = this.f17265h;
        if (dVar != null) {
            dVar.a(true);
            this.f17265h = null;
        }
        this.f17259b = null;
        a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    public final String c() {
        return IAlog.a(this);
    }

    public final boolean d() {
        for (x xVar : this.f17264g) {
            if (xVar.supports(this)) {
                this.f17263f = xVar;
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void destroy() {
        if (Looper.myLooper() != null && Looper.getMainLooper() == Looper.myLooper()) {
            b();
        } else {
            com.fyber.inneractive.sdk.util.n.f20310b.post(new b());
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public j getAdContent() {
        return this.f17262e;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f17260c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getLocalUniqueId() {
        return this.f17258a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveMediationName getMediationName() {
        return IAConfigManager.J.f16878n;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationNameString() {
        return IAConfigManager.J.f16877m;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getMediationVersion() {
        return IAConfigManager.J.f16879o;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f17260c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public InneractiveUnitController getSelectedUnitController() {
        return this.f17263f;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public boolean isReady() {
        j jVar;
        j jVar2 = this.f17262e;
        if (jVar2 == null) {
            return false;
        }
        boolean z10 = jVar2.c() != null && this.f17262e.c().d();
        if (z10 && (jVar = this.f17262e) != null) {
            com.fyber.inneractive.sdk.response.e c10 = jVar.c();
            if (!this.f17268k && c10 != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - c10.f20162c);
                long j10 = c10.f20161b;
                long j11 = minutes - j10;
                IAlog.a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", Long.valueOf(j11), Long.valueOf(j10)), new Object[0]);
                com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar.f17239a;
                JSONArray c11 = jVar.f17241c.c();
                q.a aVar = new q.a(c10);
                aVar.f17682b = oVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c11;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(j11);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j10);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f17686f.put(jSONObject);
                aVar.a((String) null);
                this.f17268k = true;
            }
        }
        return !z10 && this.f17262e.e();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener = this.f17259b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f17259b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            com.fyber.inneractive.sdk.metrics.c.f17371c.a(this.f17258a).c();
            f fVar = new f(this.f17259b, this);
            this.f17269l = fVar;
            if (this.f17261d == null) {
                this.f17261d = new n(this);
            }
            com.fyber.inneractive.sdk.bidder.adm.e eVar = new com.fyber.inneractive.sdk.bidder.adm.e(str);
            a aVar = new a(eVar, str);
            fVar.f();
            eVar.f16788d = this.f17258a;
            com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.bidder.adm.a(eVar, aVar));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            x xVar = this.f17263f;
            if (xVar != null && xVar.equals(inneractiveUnitController)) {
                this.f17263f.destroy();
                this.f17263f = null;
            }
            this.f17264g.remove(inneractiveUnitController);
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        boolean z10;
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f17260c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f17259b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f17259b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest2 = inneractiveAdRequest != null ? inneractiveAdRequest : this.f17260c;
            String str = this.f17258a;
            inneractiveAdRequest2.f17190b = str;
            com.fyber.inneractive.sdk.metrics.c.f17371c.a(str).c();
            if (this.f17264g.isEmpty()) {
                IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
                if (this.f17259b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f17260c;
                    }
                    a(inneractiveAdRequest, (com.fyber.inneractive.sdk.response.e) null);
                    this.f17259b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            d dVar = this.f17265h;
            if (dVar != null) {
                dVar.a(inneractiveAdRequest != null || this.f17260c == null);
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.f17260c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.f17260c = inneractiveAdRequest;
                j jVar = this.f17262e;
                if (jVar != null) {
                    jVar.a();
                    this.f17267j = true;
                }
                Iterator<x> it = this.f17264g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if (it.next() instanceof InneractiveFullscreenUnitController) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    this.f17260c.f17189a = false;
                }
            }
            this.f17265h = new d();
            if (this.f17261d == null) {
                this.f17261d = new n(this);
            }
            IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f17265h);
            d dVar2 = this.f17265h;
            InneractiveAdRequest inneractiveAdRequest4 = this.f17260c;
            e.b bVar = this.f17261d;
            dVar2.f17207e = inneractiveAdRequest4;
            dVar2.f17206d = bVar;
            if (IAConfigManager.g()) {
                dVar2.h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.a("%ssetRequestListener called with: %s", IAlog.a(this), requestListener);
        this.f17259b = requestListener;
    }

    @Override // com.fyber.inneractive.sdk.flow.v
    public void a(c cVar) {
        this.f17266i = cVar;
        IAlog.a("%srequestAd called with request: %s", IAlog.a(this), null);
        if (this.f17260c == null) {
            IAlog.b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.a(this));
            InneractiveAdSpot.RequestListener requestListener = this.f17259b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f17259b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest = this.f17260c;
            String str = this.f17258a;
            inneractiveAdRequest.f17190b = str;
            com.fyber.inneractive.sdk.metrics.c.f17371c.a(str).c();
            if (this.f17264g.isEmpty()) {
                IAlog.b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.a(this));
                if (this.f17259b != null) {
                    a(this.f17260c, (com.fyber.inneractive.sdk.response.e) null);
                    this.f17259b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            d dVar = this.f17265h;
            if (dVar != null) {
                dVar.a(this.f17260c == null);
            }
            this.f17265h = new d();
            if (this.f17261d == null) {
                this.f17261d = new n(this);
            }
            IAlog.a("%sFound ad source for request! %s", IAlog.a(this), this.f17265h);
            d dVar2 = this.f17265h;
            InneractiveAdRequest inneractiveAdRequest2 = this.f17260c;
            e.b bVar = this.f17261d;
            dVar2.f17207e = inneractiveAdRequest2;
            dVar2.f17206d = bVar;
            if (IAConfigManager.g()) {
                dVar2.h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.p
    public void a() {
        j jVar;
        j jVar2 = this.f17262e;
        if (jVar2 != null) {
            if (jVar2.d() && (jVar = this.f17262e) != null && !jVar.f17243e) {
                com.fyber.inneractive.sdk.response.e c10 = jVar.c();
                com.fyber.inneractive.sdk.util.n.f20310b.post(new o(this, Arrays.toString(Thread.currentThread().getStackTrace()), this.f17262e.f17239a, c10));
            }
            this.f17262e.a();
            this.f17262e = null;
        }
        this.f17263f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L33
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f17074c
            if (r1 == 0) goto L1e
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f17074c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f17018b
            goto L34
        L1e:
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f17077f
            if (r1 == 0) goto L33
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f17077f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f16908j
            goto L34
        L33:
            r1 = r0
        L34:
            com.fyber.inneractive.sdk.flow.j r2 = r9.f17262e
            if (r2 == 0) goto L3e
            T extends com.fyber.inneractive.sdk.response.e r2 = r2.f17240b
            if (r2 == 0) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r11
        L3f:
            java.lang.String r6 = r9.f17258a
            if (r1 != 0) goto L47
            if (r4 == 0) goto L47
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f20173n
        L47:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.b r11 = new com.fyber.inneractive.sdk.metrics.b
            com.fyber.inneractive.sdk.flow.j r1 = r9.f17262e
            if (r1 != 0) goto L4f
            goto L55
        L4f:
            com.fyber.inneractive.sdk.config.global.s r0 = r1.f17241c
            org.json.JSONArray r0 = r0.c()
        L55:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.m.a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}
