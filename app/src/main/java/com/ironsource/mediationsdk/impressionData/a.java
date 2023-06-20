package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.I;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.g;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.i;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes3.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private boolean f27106a = true;

    /* renamed from: b  reason: collision with root package name */
    private String f27107b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0343a implements com.ironsource.mediationsdk.server.a {
        C0343a() {
        }

        @Override // com.ironsource.mediationsdk.server.a
        public final void a(boolean z10) {
            if (z10) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        ContextProvider contextProvider = ContextProvider.getInstance();
        k.e(contextProvider, "ContextProvider.getInstance()");
        Context applicationContext = contextProvider.getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.getDeviceType(applicationContext));
            I ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
            if (ironSourceAdvId != null) {
                jSONObject.put("advId", ironSourceAdvId.f26279a);
                jSONObject.put("advIdType", ironSourceAdvId.f26280b);
            }
        }
        J a10 = J.a();
        k.e(a10, "IronSourceObject.getInstance()");
        String m10 = a10.m();
        if (m10 != null) {
            jSONObject.put("applicationKey", m10);
        }
        return jSONObject;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
    }

    public final void a(String str, JSONObject jSONObject) {
        k.f(str, "dataSource");
        k.f(jSONObject, "impressionData");
        if (!this.f27106a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject a10 = a();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("externalMediationSource", str);
            jSONObject2.putOpt("externalMediationData", jSONObject);
            jSONObject2.putOpt("clientParams", a10);
            IronLog ironLog = IronLog.API;
            ironLog.info("impressionData: " + jSONObject2);
            HttpFunctions.sendPostRequest(this.f27107b, jSONObject2.toString(), new C0343a());
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.API;
            ironLog2.error("exception " + e10.getMessage() + " sending impression data");
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, g gVar) {
        if (gVar != null) {
            com.ironsource.sdk.f.a a10 = gVar.a();
            k.e(a10, "applicationConfigurations");
            this.f27106a = a10.f().f27404a;
            com.ironsource.sdk.f.a a11 = gVar.a();
            k.e(a11, "applicationConfigurations");
            this.f27107b = a11.f().f27405b;
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
    }
}
