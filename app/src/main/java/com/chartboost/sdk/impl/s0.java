package com.chartboost.sdk.impl;

import com.chartboost.sdk.ChartboostDSP;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.NetworkHelper;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.m0;
import com.chartboost.sdk.impl.n0;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s0 extends o0<JSONObject> {

    /* renamed from: j  reason: collision with root package name */
    private final String f14296j;

    /* renamed from: k  reason: collision with root package name */
    public JSONObject f14297k;

    /* renamed from: l  reason: collision with root package name */
    public final a f14298l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14299m;

    /* renamed from: n  reason: collision with root package name */
    protected final l2 f14300n;

    /* loaded from: classes.dex */
    public interface a {
        void a(s0 s0Var, CBError cBError);

        void a(s0 s0Var, JSONObject jSONObject);
    }

    public s0(String str, String str2, l2 l2Var, int i10, a aVar) {
        super("POST", NetworkHelper.a(str, str2), i10, null);
        this.f14299m = false;
        this.f14297k = new JSONObject();
        this.f14296j = str2;
        this.f14300n = l2Var;
        this.f14298l = aVar;
    }

    private String d() {
        String str = com.chartboost.sdk.g.f13893r;
        int[] iArr = com.chartboost.sdk.g.f13894s;
        JSONObject jSONObject = new JSONObject();
        if (str != null && str.length() > 0 && iArr != null && iArr.length > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i10 : iArr) {
                    jSONArray.put(i10);
                }
                jSONObject.put("exchangeMode", 2);
                jSONObject.put("bidFloor", 0.01d);
                jSONObject.put(Analytics.Param.CODE, str);
                jSONObject.put("forceCreativeTypes", jSONArray);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject.toString();
    }

    public void a(String str) {
    }

    public void c() {
        l2.a d10 = this.f14300n.d();
        a("app", this.f14300n.f14159l);
        a("model", this.f14300n.f14152e);
        a("device_type", this.f14300n.f14160m);
        a("actual_device_type", this.f14300n.f14161n);
        a("os", this.f14300n.f14153f);
        a(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.f14300n.f14154g);
        a("language", this.f14300n.f14155h);
        a("sdk", this.f14300n.f14158k);
        a("user_agent", com.chartboost.sdk.g.f13892q);
        a("timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f14300n.f14151d.a())));
        a("session", Integer.valueOf(this.f14300n.k()));
        a("reachability", Integer.valueOf(this.f14300n.b()));
        a("is_portrait", Boolean.valueOf(this.f14300n.m()));
        a("scale", Float.valueOf(d10.f14172e));
        a("bundle", this.f14300n.f14156i);
        a("bundle_id", this.f14300n.f14157j);
        a("carrier", this.f14300n.f14162o);
        a("custom_id", com.chartboost.sdk.g.f13877b);
        MediationModel mediationModel = com.chartboost.sdk.g.f13884i;
        if (mediationModel != null) {
            a("mediation", mediationModel.getMediation());
            a("mediation_version", com.chartboost.sdk.g.f13884i.getMediationVersion());
            a("adapter_version", com.chartboost.sdk.g.f13884i.getAdapterVersion());
        }
        if (com.chartboost.sdk.g.f13880e != null) {
            a("framework_version", com.chartboost.sdk.g.f13882g);
            a("wrapper_version", com.chartboost.sdk.g.f13878c);
        }
        a("timezone", this.f14300n.f14164q);
        a("mobile_network", Integer.valueOf(this.f14300n.a()));
        a("dw", Integer.valueOf(d10.f14168a));
        a("dh", Integer.valueOf(d10.f14169b));
        a("dpi", d10.f14173f);
        a("w", Integer.valueOf(d10.f14170c));
        a("h", Integer.valueOf(d10.f14171d));
        a("commit_hash", "57765bc2b2f75148b38b00aeb311ac30843720cb");
        m0.a e10 = this.f14300n.e();
        a("identity", e10.f14188b);
        int i10 = e10.f14187a;
        if (i10 != -1) {
            a("limit_ad_tracking", Boolean.valueOf(i10 == 1));
        }
        Object obj = e10.f14192f;
        if (obj != null) {
            a("appsetidscope", obj);
        }
        a("pidatauseconsent", Integer.valueOf(e2.f13964a.getValue()));
        String str = this.f14300n.f14150c.get().f13710a;
        if (!l.b().a(str)) {
            a("config_variant", str);
        }
        a("privacy", this.f14300n.i());
    }

    public String e() {
        if (this.f14296j == null) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14296j.startsWith("/") ? "" : "/");
        sb2.append(this.f14296j);
        return sb2.toString();
    }

    public String f() {
        return e();
    }

    public void a(String str, Object obj) {
        n0.a(this.f14297k, str, obj);
    }

    private void a(q0 q0Var, CBError cBError) {
        n0.a[] aVarArr = new n0.a[5];
        aVarArr[0] = n0.a("endpoint", e());
        aVarArr[1] = n0.a("statuscode", q0Var == null ? "None" : Integer.valueOf(q0Var.f14267a));
        aVarArr[2] = n0.a("error", cBError == null ? "None" : cBError.getError().toString());
        aVarArr[3] = n0.a("errorDescription", cBError != null ? cBError.getErrorDesc() : "None");
        aVarArr[4] = n0.a("retryCount", (Object) 0);
        JSONObject a10 = n0.a(aVarArr);
        CBLogging.a("CBRequest", "sendToSessionLogs: " + a10.toString());
    }

    @Override // com.chartboost.sdk.impl.o0
    public com.chartboost.sdk.Networking.a a() {
        String d10;
        c();
        String jSONObject = this.f14297k.toString();
        String str = com.chartboost.sdk.g.f13885j;
        String a10 = l0.a(l0.b(String.format(Locale.US, "%s %s\n%s\n%s", this.f14229a, f(), com.chartboost.sdk.g.f13886k, jSONObject).getBytes()));
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-API", "8.4.3");
        hashMap.put("X-Chartboost-App", str);
        hashMap.put("X-Chartboost-Signature", a10);
        if (m2.f14204a) {
            String b10 = m2.b();
            if (b10.length() > 0) {
                hashMap.put("X-Chartboost-Test", b10);
            }
            String a11 = m2.a();
            if (a11 != null) {
                hashMap.put("X-Chartboost-Test", a11);
            }
        }
        if (ChartboostDSP.isDSP && (d10 = d()) != null && d10.length() > 0) {
            hashMap.put("X-Chartboost-DspDemoApp", d10);
        }
        return new com.chartboost.sdk.Networking.a(hashMap, jSONObject.getBytes(), "application/json");
    }

    @Override // com.chartboost.sdk.impl.o0
    public p0<JSONObject> a(q0 q0Var) {
        try {
            if (q0Var.f14268b == null) {
                return p0.a(new CBError(CBError.b.INVALID_RESPONSE, "Response is not a valid json object"));
            }
            JSONObject jSONObject = new JSONObject(new String(q0Var.f14268b));
            CBLogging.d("CBRequest", "Request " + e() + " succeeded. Response code: " + q0Var.f14267a + ", body: " + jSONObject.toString(4));
            if (this.f14299m) {
                int optInt = jSONObject.optInt("status");
                if (optInt == 404) {
                    return p0.a(new CBError(CBError.b.HTTP_NOT_FOUND, "404 error from server"));
                }
                if (optInt < 200 || optInt > 299) {
                    String str = "Request failed due to status code " + optInt + " in message";
                    CBLogging.b("CBRequest", str);
                    return p0.a(new CBError(CBError.b.UNEXPECTED_RESPONSE, str));
                }
            }
            return p0.a(jSONObject);
        } catch (Exception e10) {
            m1.d(new com.chartboost.sdk.Tracking.a("response_json_serialization_error", e10.getMessage(), "", ""));
            CBLogging.b("CBRequest", "parseServerResponse: " + e10.toString());
            return p0.a(new CBError(CBError.b.MISCELLANEOUS, e10.getLocalizedMessage()));
        }
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(JSONObject jSONObject, q0 q0Var) {
        CBLogging.d("CBRequest", "Request success: " + this.f14230b + " status: " + q0Var.f14267a);
        a aVar = this.f14298l;
        if (aVar != null && jSONObject != null) {
            aVar.a(this, jSONObject);
        }
        a(q0Var, (CBError) null);
    }

    @Override // com.chartboost.sdk.impl.o0
    public void a(CBError cBError, q0 q0Var) {
        if (cBError == null) {
            return;
        }
        CBLogging.d("CBRequest", "Request failure: " + this.f14230b + " status: " + cBError.getErrorDesc());
        a aVar = this.f14298l;
        if (aVar != null) {
            aVar.a(this, cBError);
        }
        a(q0Var, cBError);
    }
}
