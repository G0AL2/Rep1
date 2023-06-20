package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.j;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.response.e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c<Response extends com.fyber.inneractive.sdk.response.e, Content extends j> implements com.fyber.inneractive.sdk.interfaces.a {

    /* renamed from: a  reason: collision with root package name */
    public InneractiveAdRequest f17196a;

    /* renamed from: b  reason: collision with root package name */
    public Response f17197b;

    /* renamed from: c  reason: collision with root package name */
    public Content f17198c;

    /* renamed from: d  reason: collision with root package name */
    public a.InterfaceC0236a f17199d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.z f17200e;

    /* renamed from: f  reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.s f17201f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17202g = false;

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a() {
        this.f17196a = null;
        this.f17197b = null;
        this.f17198c = null;
        this.f17199d = null;
        this.f17200e = null;
    }

    public abstract String b();

    public com.fyber.inneractive.sdk.config.z c() {
        InneractiveAdRequest inneractiveAdRequest = this.f17196a;
        return inneractiveAdRequest == null ? this.f17200e : inneractiveAdRequest.getSelectedUnitConfig();
    }

    public void d() {
        String str;
        InneractiveAdRequest inneractiveAdRequest = this.f17196a;
        if (inneractiveAdRequest != null) {
            com.fyber.inneractive.sdk.metrics.c.f17371c.a(inneractiveAdRequest.f17190b).i();
        } else {
            Response response = this.f17197b;
            if (response != null && (str = response.f20185z) != null) {
                com.fyber.inneractive.sdk.metrics.c.f17371c.a(str).i();
            }
        }
        a.InterfaceC0236a interfaceC0236a = this.f17199d;
        if (interfaceC0236a != null) {
            interfaceC0236a.a();
        }
    }

    public abstract void e();

    /* JADX WARN: Multi-variable type inference failed */
    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.s sVar, a.InterfaceC0236a interfaceC0236a) {
        this.f17196a = inneractiveAdRequest;
        this.f17197b = eVar;
        this.f17199d = interfaceC0236a;
        this.f17201f = sVar;
        if (inneractiveAdRequest == null) {
            this.f17200e = com.fyber.inneractive.sdk.config.a.b(eVar.f20172m);
        }
        try {
            e();
        } catch (Throwable th) {
            IAlog.e("Failed to start ContentLoader", IAlog.a(this));
            com.fyber.inneractive.sdk.network.r.a(th, inneractiveAdRequest, eVar);
            a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    public void a(InneractiveError inneractiveError) {
        com.fyber.inneractive.sdk.util.n.a(new a(new b(this.f17197b, this.f17196a, b(), this.f17201f.c()), inneractiveError));
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        if (this.f17199d != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f17196a;
            Response response = this.f17197b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.f17198c) == null || content.d() || this.f17198c.isVideoAd())) {
                IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : com.fyber.inneractive.sdk.util.s.a(7, 6);
                com.fyber.inneractive.sdk.config.global.s sVar = this.f17201f;
                JSONArray c10 = sVar == null ? null : sVar.c();
                com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.IA_AD_LOAD_FAILED;
                q.a aVar = new q.a(response);
                aVar.f17682b = oVar;
                aVar.f17681a = inneractiveAdRequest;
                aVar.f17684d = c10;
                JSONObject jSONObject = new JSONObject();
                String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                try {
                    jSONObject.put("message", inneractiveErrorCode);
                } catch (Exception unused) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "message", inneractiveErrorCode);
                }
                try {
                    jSONObject.put("description", arrays);
                } catch (Exception unused2) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "description", arrays);
                }
                String description = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("extra_description", description);
                } catch (Exception unused3) {
                    IAlog.e("Got exception adding param to json object: %s, %s", "extra_description", description);
                }
                aVar.f17686f.put(jSONObject);
                aVar.a((String) null);
            }
            this.f17199d.a(inneractiveInfrastructureError);
        }
    }
}
