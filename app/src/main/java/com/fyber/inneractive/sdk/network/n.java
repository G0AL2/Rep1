package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.b;
import com.fyber.inneractive.sdk.flow.e;
import com.fyber.inneractive.sdk.network.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdRequest f17616a;

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17617b;

    /* renamed from: c  reason: collision with root package name */
    public c f17618c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17619d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f17620e = false;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f17621f;

    /* loaded from: classes.dex */
    public class a implements u<com.fyber.inneractive.sdk.response.e> {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(com.fyber.inneractive.sdk.response.e eVar, Exception exc, boolean z10) {
            InneractiveErrorCode inneractiveErrorCode;
            com.fyber.inneractive.sdk.response.e eVar2 = eVar;
            if (exc == null) {
                n.this.a(eVar2);
                return;
            }
            n.this.getClass();
            if (exc instanceof n0) {
                if (((n0) exc).f17624a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
            } else if (exc instanceof FileNotFoundException) {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            } else if (exc instanceof z) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            } else {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            }
            n nVar = n.this;
            if (nVar.f17618c == null) {
                return;
            }
            if (nVar.f17620e) {
                IAlog.d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            } else {
                nVar.a(inneractiveErrorCode, eVar2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements b0.a {
        public b() {
        }

        @Override // com.fyber.inneractive.sdk.network.b0.a
        public void a(String str) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1392135285:
                    if (str.equals("sdkInitNetworkRequest")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 740780854:
                    if (str.equals("sdkGotServerResponse")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1745989196:
                    if (str.equals("sdkParsedResponse")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    com.fyber.inneractive.sdk.metrics.c.f17371c.a(n.this.f17619d).f();
                    return;
                case 1:
                    com.fyber.inneractive.sdk.metrics.c.f17371c.a(n.this.f17619d).g();
                    return;
                case 2:
                    com.fyber.inneractive.sdk.metrics.c.f17371c.a(n.this.f17619d).d();
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public n(InneractiveAdRequest inneractiveAdRequest, String str, com.fyber.inneractive.sdk.config.global.s sVar, c cVar) {
        this.f17616a = inneractiveAdRequest;
        this.f17619d = str;
        this.f17618c = cVar;
        this.f17617b = sVar;
        this.f17621f = new c0(new a(), inneractiveAdRequest, sVar);
        a();
    }

    public void a() {
        this.f17621f.f17552d = new b();
    }

    public void a(InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e eVar) {
        c cVar;
        if (this.f17620e || (cVar = this.f17618c) == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.e) cVar).a(this.f17616a, eVar, inneractiveErrorCode);
    }

    public void a(com.fyber.inneractive.sdk.response.e eVar) {
        InneractiveErrorCode a10;
        if (this.f17618c == null) {
            return;
        }
        if (this.f17620e) {
            IAlog.d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.config.y b10 = com.fyber.inneractive.sdk.config.a.b(eVar.f20172m);
        InneractiveAdRequest inneractiveAdRequest = this.f17616a;
        if (inneractiveAdRequest != null) {
            inneractiveAdRequest.setSelectedUnitConfig(b10);
        }
        com.fyber.inneractive.sdk.config.global.e eVar2 = new com.fyber.inneractive.sdk.config.global.e();
        ImpressionData impressionData = eVar.f20177r;
        eVar2.f16946a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            eVar2.f16947b = Long.valueOf(IAConfigManager.J.f16868d);
        } catch (NumberFormatException unused) {
            IAlog.a("invalid publisherId", new Object[0]);
        }
        com.fyber.inneractive.sdk.config.global.s sVar = this.f17617b;
        if (sVar != null) {
            sVar.a(eVar2);
        }
        if (b10 == null) {
            a10 = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
        } else {
            a10 = eVar.a(this.f17616a, this.f17617b);
        }
        if (a10 == null) {
            c cVar = this.f17618c;
            InneractiveAdRequest inneractiveAdRequest2 = this.f17616a;
            com.fyber.inneractive.sdk.flow.e eVar3 = (com.fyber.inneractive.sdk.flow.e) cVar;
            com.fyber.inneractive.sdk.config.global.s sVar2 = eVar3.f17208f;
            IAlog.d("%sonAdDataAvailable: got response data: %s", eVar3.d(), eVar);
            com.fyber.inneractive.sdk.response.a a11 = com.fyber.inneractive.sdk.response.a.a(eVar.f20166g);
            b.InterfaceC0234b interfaceC0234b = b.a.f17184a.f17183a.get(a11);
            com.fyber.inneractive.sdk.interfaces.a a12 = interfaceC0234b != null ? interfaceC0234b.a() : null;
            eVar3.f17205c = a12;
            if (a12 == null) {
                IAlog.e("%sonAdDataAvailable: Cannot find content handler for ad type: %s", eVar3.d(), a11);
                e.b bVar = eVar3.f17206d;
                if (bVar != null) {
                    ((com.fyber.inneractive.sdk.flow.n) bVar).a(inneractiveAdRequest2, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                    return;
                }
                return;
            }
            IAlog.d("%sonAdDataAvailable: found response loader: %s", eVar3.d(), eVar3.f17205c);
            ((com.fyber.inneractive.sdk.flow.c) eVar3.f17205c).a(inneractiveAdRequest2, eVar, sVar2, eVar3);
            return;
        }
        if (b10 == null || a10 == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
            IAlog.b("%sGot configuration mismatch!", IAlog.a(this));
            IAConfigManager.a();
        }
        com.fyber.inneractive.sdk.response.a a13 = com.fyber.inneractive.sdk.response.a.a(eVar.f20166g);
        if (a13 != null) {
            com.fyber.inneractive.sdk.util.n.a(new com.fyber.inneractive.sdk.flow.a(new com.fyber.inneractive.sdk.flow.b(eVar, this.f17616a, a13 == com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f17617b.c()), new InneractiveInfrastructureError(a10, eVar.f20183x)));
        }
        a(a10, eVar);
    }
}
