package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.e;
import com.fyber.inneractive.sdk.flow.m;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n implements e.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f17274a;

    public n(m mVar) {
        this.f17274a = mVar;
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        j jVar;
        if (this.f17274a.f17259b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f17274a.a(inneractiveAdRequest, eVar);
            }
            m mVar = this.f17274a;
            if (mVar.f17267j) {
                if (eVar == null && inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((jVar = mVar.f17262e) == null || jVar.d() || mVar.f17262e.isVideoAd())) {
                    IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                    String arrays = inneractiveInfrastructureError.getCause() != null ? Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace()) : com.fyber.inneractive.sdk.util.s.a(7, 6);
                    com.fyber.inneractive.sdk.network.o oVar = com.fyber.inneractive.sdk.network.o.IA_AD_LOAD_FAILED;
                    JSONArray a10 = com.fyber.inneractive.sdk.config.global.s.a(mVar.f17265h, mVar.f17262e);
                    q.a aVar = new q.a(null);
                    aVar.f17682b = oVar;
                    aVar.f17681a = inneractiveAdRequest;
                    aVar.f17684d = a10;
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
                m mVar2 = this.f17274a;
                mVar2.f17259b.onInneractiveFailedAdRequest(mVar2, inneractiveInfrastructureError.getErrorCode());
                return;
            }
            m.c cVar = mVar.f17266i;
            if (cVar != null) {
                cVar.onAdRefreshFailed(mVar, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
