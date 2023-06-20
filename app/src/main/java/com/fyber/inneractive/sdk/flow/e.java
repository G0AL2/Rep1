package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class e implements n.c, a.InterfaceC0236a {

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.a f17205c;

    /* renamed from: d  reason: collision with root package name */
    public b f17206d;

    /* renamed from: e  reason: collision with root package name */
    public InneractiveAdRequest f17207e;

    /* renamed from: f  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17208f;

    /* renamed from: g  reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.n f17209g;

    /* renamed from: b  reason: collision with root package name */
    public long f17204b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f17203a = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.e();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveErrorCode inneractiveErrorCode) {
        b();
        if (IAlog.f20222a <= 3) {
            Thread.dumpStack();
        }
        IAlog.d("%sgot onAdRequestFailed! with: %s", d(), inneractiveErrorCode);
        if (this.f17206d != null) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            if (eVar != null && eVar.f20168i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f20168i + ": " + eVar.f20169j));
            }
            ((n) this.f17206d).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    public void b() {
        if (this.f17204b > 0) {
            IAlog.a("%scancel in flight timeout after %d millis", d(), Long.valueOf(System.currentTimeMillis() - this.f17204b));
            com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(this.f17203a);
            this.f17204b = 0L;
        }
    }

    public com.fyber.inneractive.sdk.response.e c() {
        Content content;
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f17205c;
        if (aVar == null || (content = ((c) aVar).f17198c) == 0) {
            return null;
        }
        return content.c();
    }

    public String d() {
        return IAlog.a(this);
    }

    public void e() {
        IAlog.a("%sin flight timeout reached after %d millis", d(), Long.valueOf(System.currentTimeMillis() - this.f17204b));
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f17205c;
        if (aVar != null) {
            aVar.a();
            this.f17205c = null;
        }
    }

    public void f() {
        int a10;
        com.fyber.inneractive.sdk.config.x a11;
        b();
        InneractiveAdRequest inneractiveAdRequest = this.f17207e;
        if (inneractiveAdRequest instanceof a0) {
            inneractiveAdRequest.getClass();
        }
        UnitDisplayType unitDisplayType = null;
        InneractiveAdRequest inneractiveAdRequest2 = this.f17207e;
        if (inneractiveAdRequest2 != null && (a11 = com.fyber.inneractive.sdk.config.a.a(inneractiveAdRequest2.getSpotId())) != null) {
            for (com.fyber.inneractive.sdk.config.y yVar : a11.f17070a) {
                com.fyber.inneractive.sdk.config.r rVar = yVar.f17074c;
                if (rVar != null) {
                    unitDisplayType = rVar.f17018b;
                }
            }
        }
        com.fyber.inneractive.sdk.config.j jVar = IAConfigManager.J.f16887w;
        jVar.getClass();
        if (unitDisplayType == UnitDisplayType.BANNER) {
            a10 = jVar.f16992a.f16987b.a("in_flight_banner_timeout_sec", 10, 3);
        } else {
            a10 = jVar.f16992a.f16987b.a("in_flight_interstitial_timeout_sec", 25, 3);
        }
        com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(this.f17203a, TimeUnit.SECONDS.toMillis(a10));
        this.f17204b = System.currentTimeMillis();
        IAlog.a("%sstart in flight timeout", d());
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0236a
    public void a() {
        T t10;
        x xVar;
        b();
        IAlog.d("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.a aVar = this.f17205c;
        if (aVar != null) {
            b bVar = this.f17206d;
            if (bVar != null) {
                InneractiveAdRequest inneractiveAdRequest = this.f17207e;
                Content content = ((c) aVar).f17198c;
                n nVar = (n) bVar;
                m mVar = nVar.f17274a;
                if (mVar.f17267j || (xVar = mVar.f17263f) == null || !xVar.supportsRefresh()) {
                    nVar.f17274a.f17267j = false;
                    m mVar2 = nVar.f17274a;
                    mVar2.f17262e = content;
                    content.f17239a = inneractiveAdRequest;
                    if (!mVar2.d()) {
                        m mVar3 = nVar.f17274a;
                        mVar3.getClass();
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", IAlog.a(mVar3), nVar.f17274a.f17262e.f17242d);
                        d dVar = nVar.f17274a.f17265h;
                        com.fyber.inneractive.sdk.response.e c10 = dVar != null ? dVar.c() : null;
                        InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.INVALID_INPUT;
                        nVar.a(inneractiveAdRequest, c10, new InneractiveInfrastructureError(inneractiveErrorCode, new Exception("Cannot find appropriate unit controller for unit: " + nVar.f17274a.f17262e.f17242d)));
                        nVar.f17274a.f17262e = null;
                    } else {
                        m mVar4 = nVar.f17274a;
                        InneractiveAdSpot.RequestListener requestListener = mVar4.f17259b;
                        if (requestListener != null) {
                            requestListener.onInneractiveSuccessfulAdRequest(mVar4);
                        }
                    }
                } else if (nVar.f17274a.f17263f.canRefreshAd()) {
                    m mVar5 = nVar.f17274a;
                    mVar5.f17262e = content;
                    content.f17239a = inneractiveAdRequest;
                    m.c cVar = mVar5.f17266i;
                    if (cVar != null) {
                        cVar.onAdRefreshed(mVar5);
                    } else {
                        x xVar2 = mVar5.f17263f;
                        if (xVar2 instanceof InneractiveAdViewUnitController) {
                            ((InneractiveAdViewUnitController) xVar2).onAdRefreshed(mVar5);
                        }
                    }
                } else {
                    m mVar6 = nVar.f17274a;
                    mVar6.getClass();
                    IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", IAlog.a(mVar6));
                    m mVar7 = nVar.f17274a;
                    mVar7.f17266i.onAdRefreshFailed(mVar7, InneractiveErrorCode.CANCELLED);
                }
                String str = nVar.f17274a.f17258a;
                com.fyber.inneractive.sdk.metrics.c cVar2 = com.fyber.inneractive.sdk.metrics.c.f17371c;
                cVar2.a(str).e();
                cVar2.a(str).b();
                m mVar8 = nVar.f17274a;
                j jVar = mVar8.f17262e;
                if (jVar != null && (t10 = jVar.f17240b) != 0 && t10.f20173n != null) {
                    j jVar2 = mVar8.f17262e;
                    T t11 = jVar2.f17240b;
                    new com.fyber.inneractive.sdk.metrics.b(t11, mVar8.f17260c, mVar8.f17258a, t11.f20173n, jVar2.f17241c.c()).a();
                }
            }
            this.f17205c = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a.InterfaceC0236a
    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        b();
        IAlog.d("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        b bVar = this.f17206d;
        if (bVar != null) {
            ((n) bVar).a(this.f17207e, c(), inneractiveInfrastructureError);
        }
    }
}
