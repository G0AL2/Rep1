package com.fyber.inneractive.sdk.player;

import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.model.vast.m;
import com.fyber.inneractive.sdk.network.j0;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.player.a;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.n;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.a f19696a;

    /* renamed from: b  reason: collision with root package name */
    public InneractiveAdRequest f19697b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.g f19698c;

    /* renamed from: d  reason: collision with root package name */
    public b f19699d;

    /* renamed from: e  reason: collision with root package name */
    public m f19700e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0239a f19701f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19702g = false;

    /* renamed from: h  reason: collision with root package name */
    public s f19703h;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19704a;

        static {
            int[] iArr = new int[InneractiveVideoError.Error.values().length];
            f19704a = iArr;
            try {
                iArr[InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19704a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19704a[InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19704a[InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19704a[InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public i(com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest, y yVar, b bVar) {
        this.f19697b = inneractiveAdRequest;
        this.f19698c = gVar;
        this.f19699d = bVar;
        this.f19703h = yVar.b();
        this.f19696a = new com.fyber.inneractive.sdk.player.a(yVar);
    }

    public final o a(InneractiveVideoError.Error error) {
        int i10 = a.f19704a[error.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            IAlog.a("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
                            return o.VAST_UNKNOWN_PLAYER_ERROR;
                        }
                        return o.VAST_ERROR_BUFFER_TIMEOUT;
                    }
                    return o.VAST_ERROR_PRE_BUFFER_TIMEOUT;
                }
                return o.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
            }
            return o.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        return o.VAST_ERROR_NO_MEDIA_FILES;
    }

    public final void b() {
        o a10 = a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f19697b;
        com.fyber.inneractive.sdk.response.g gVar = this.f19698c;
        JSONArray c10 = this.f19703h.c();
        q.a aVar = new q.a(gVar);
        aVar.f17682b = a10;
        aVar.f17681a = inneractiveAdRequest;
        aVar.f17684d = c10;
        aVar.a((String) null);
    }

    public a.InterfaceC0239a c() {
        return this.f19701f;
    }

    public final void d() {
        a.InterfaceC0239a interfaceC0239a = this.f19701f;
        if (interfaceC0239a != null) {
            m mVar = this.f19700e;
            f fVar = (f) interfaceC0239a;
            fVar.f17742t = this;
            if (mVar != null) {
                String str = mVar.f17443g;
                fVar.f17744v = mVar;
                fVar.f17741s++;
                fVar.f17737o = false;
                fVar.f17739q = false;
                fVar.f17725c = str;
                IAlog.a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
                com.fyber.inneractive.sdk.util.q qVar = fVar.f17735m;
                if (qVar != null) {
                    qVar.cancel(true);
                    qVar.f20319b = null;
                    fVar.f17736n = null;
                }
                if (fVar.f17736n == null) {
                    fVar.f17736n = new d(fVar);
                }
                IAlog.a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
                if (!fVar.f17724b.a()) {
                    com.fyber.inneractive.sdk.util.q qVar2 = new com.fyber.inneractive.sdk.util.q(fVar.f17723a, fVar.f17736n, fVar.f17725c, null, 81920);
                    fVar.f17735m = qVar2;
                    qVar2.executeOnExecutor(n.f20309a, new Void[0]);
                }
                if (!fVar.f17738p) {
                    fVar.f17724b.a(str, fVar.f17743u);
                }
                int i10 = 10;
                if (k.m()) {
                    s sVar = fVar.f17726d;
                    int a10 = IAConfigManager.J.f16886v.f16987b.a("VASTLoadTimeoutWiFi", 10, 1);
                    if (sVar != null) {
                        Integer b10 = ((j) sVar.a(j.class)).b("load_timeout_wifi");
                        if (b10 != null) {
                            i10 = b10.intValue();
                        }
                    } else {
                        i10 = a10;
                    }
                } else {
                    s sVar2 = fVar.f17726d;
                    i10 = IAConfigManager.J.f16886v.f16987b.a("VASTLoadTimeout3G", 30, 1);
                    if (sVar2 != null) {
                        Integer b11 = ((j) sVar2.a(j.class)).b("load_timeout_3g");
                        i10 = b11 != null ? b11.intValue() : 30;
                    }
                }
                fVar.a(i10 * 1000);
                fVar.B.a();
                return;
            }
            return;
        }
        b bVar = this.f19699d;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        com.fyber.inneractive.sdk.flow.i iVar = (com.fyber.inneractive.sdk.flow.i) bVar;
        iVar.a((InneractiveError) inneractiveInfrastructureError);
        iVar.a(inneractiveInfrastructureError);
    }

    public final void e() {
        try {
            this.f19701f = this.f19696a.a();
        } catch (Throwable th) {
            b bVar = this.f19699d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th);
            com.fyber.inneractive.sdk.flow.i iVar = (com.fyber.inneractive.sdk.flow.i) bVar;
            iVar.a((InneractiveError) inneractiveInfrastructureError);
            iVar.a(inneractiveInfrastructureError);
        }
    }

    public void a() {
        com.fyber.inneractive.sdk.player.controller.c cVar;
        IAmraidWebViewController iAmraidWebViewController;
        a.InterfaceC0239a interfaceC0239a = this.f19696a.f17720b;
        if (interfaceC0239a != null) {
            f fVar = (f) interfaceC0239a;
            fVar.f17738p = true;
            IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
            View c10 = fVar.c();
            if (c10 != null && (c10 instanceof com.fyber.inneractive.sdk.web.c)) {
                ((com.fyber.inneractive.sdk.web.c) c10).destroy();
            }
            com.fyber.inneractive.sdk.util.q qVar = fVar.f17735m;
            if (qVar != null) {
                qVar.cancel(true);
                qVar.f20319b = null;
                fVar.f17736n = null;
            }
            fVar.a();
            com.fyber.inneractive.sdk.player.controller.g gVar = fVar.f17724b;
            if (gVar != null) {
                gVar.b();
                fVar.f17724b = null;
            }
            fVar.f17734l = null;
            fVar.f17742t = null;
            Runnable runnable = fVar.f17727e;
            if (runnable != null) {
                n.f20310b.removeCallbacks(runnable);
            }
            com.fyber.inneractive.sdk.flow.g gVar2 = fVar.B;
            if (gVar2 != null) {
                gVar2.f17218f = false;
                View view = gVar2.f17219g;
                if (view != null && (view instanceof com.fyber.inneractive.sdk.web.c) && (cVar = gVar2.f17221i) != null && (iAmraidWebViewController = cVar.f17864a) != null) {
                    iAmraidWebViewController.l();
                    cVar.f17864a = null;
                }
                j0 j0Var = gVar2.f17223k;
                if (j0Var != null) {
                    j0Var.f17549a = true;
                }
                gVar2.f17221i = null;
            }
            fVar.B = null;
        }
    }

    public void a(InneractiveVideoError inneractiveVideoError, InneractiveErrorCode inneractiveErrorCode, JSONObject jSONObject, boolean z10) {
        com.fyber.inneractive.sdk.model.vast.b bVar;
        o a10 = a(inneractiveVideoError.getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f19697b;
        com.fyber.inneractive.sdk.response.g gVar = this.f19698c;
        JSONArray c10 = this.f19703h.c();
        q.a aVar = new q.a(gVar);
        aVar.f17682b = a10;
        aVar.f17681a = inneractiveAdRequest;
        aVar.f17684d = c10;
        if (jSONObject != null) {
            try {
                aVar.f17686f.put(new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        aVar.a((String) null);
        IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
        InneractiveErrorCode inneractiveErrorCode2 = z10 ? InneractiveErrorCode.LOAD_TIMEOUT : null;
        IAlog.a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
        if (inneractiveVideoError.getPlayerError().isFatal()) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (inneractiveErrorCode2 == null) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            o oVar = o.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f19697b;
            com.fyber.inneractive.sdk.response.g gVar2 = this.f19698c;
            JSONArray c11 = this.f19703h.c();
            q.a aVar2 = new q.a(gVar2);
            aVar2.f17682b = oVar;
            aVar2.f17681a = inneractiveAdRequest2;
            aVar2.f17684d = c11;
            aVar2.a((String) null);
        }
        this.f19700e = null;
        com.fyber.inneractive.sdk.response.g gVar3 = this.f19698c;
        if (gVar3 != null && (bVar = gVar3.C) != null) {
            this.f19700e = bVar.f17389d.poll();
        }
        if (this.f19700e == null) {
            b();
            b bVar2 = this.f19699d;
            if (bVar2 != null) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode2, inneractiveVideoError.getCause());
                com.fyber.inneractive.sdk.flow.i iVar = (com.fyber.inneractive.sdk.flow.i) bVar2;
                iVar.a((InneractiveError) inneractiveInfrastructureError);
                iVar.a(inneractiveInfrastructureError);
                a();
            }
        } else if (this.f19702g) {
        } else {
            e();
            d();
        }
    }

    public void a(String str, String... strArr) {
        a.InterfaceC0239a interfaceC0239a = this.f19701f;
        if (interfaceC0239a != null) {
            f fVar = (f) interfaceC0239a;
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                fVar.f19691z = true;
            } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String str2 : strArr) {
                    fVar.a(fVar.f19689x, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.q.a(str2));
                }
            }
        }
    }
}
