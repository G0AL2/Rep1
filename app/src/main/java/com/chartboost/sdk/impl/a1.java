package com.chartboost.sdk.impl;

import com.applovin.sdk.AppLovinEventParameters;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.m0;
import com.chartboost.sdk.impl.s0;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a1 extends s0 {

    /* renamed from: o  reason: collision with root package name */
    private final JSONObject f13896o;

    /* renamed from: p  reason: collision with root package name */
    private final JSONObject f13897p;

    /* renamed from: q  reason: collision with root package name */
    private final JSONObject f13898q;

    /* renamed from: r  reason: collision with root package name */
    private final JSONObject f13899r;

    public a1(String str, l2 l2Var, int i10, s0.a aVar) {
        super("https://live.chartboost.com", str, l2Var, i10, aVar);
        this.f13896o = new JSONObject();
        this.f13897p = new JSONObject();
        this.f13898q = new JSONObject();
        this.f13899r = new JSONObject();
    }

    public void a(String str, Object obj, int i10) {
        if (i10 == 0) {
            n0.a(this.f13899r, str, obj);
            a("ad", this.f13899r);
        }
    }

    @Override // com.chartboost.sdk.impl.s0
    public void c() {
        l2.a d10 = this.f14300n.d();
        n0.a(this.f13897p, "app", this.f14300n.f14159l);
        n0.a(this.f13897p, "bundle", this.f14300n.f14156i);
        n0.a(this.f13897p, "bundle_id", this.f14300n.f14157j);
        n0.a(this.f13897p, "custom_id", com.chartboost.sdk.g.f13877b);
        n0.a(this.f13897p, "session_id", "");
        n0.a(this.f13897p, "ui", -1);
        JSONObject jSONObject = this.f13897p;
        Boolean bool = Boolean.FALSE;
        n0.a(jSONObject, "test_mode", bool);
        a("app", this.f13897p);
        n0.a(this.f13898q, "carrier", n0.a(n0.a("carrier_name", this.f14300n.f14162o.optString("carrier-name")), n0.a("mobile_country_code", this.f14300n.f14162o.optString("mobile-country-code")), n0.a("mobile_network_code", this.f14300n.f14162o.optString("mobile-network-code")), n0.a("iso_country_code", this.f14300n.f14162o.optString("iso-country-code")), n0.a("phone_type", Integer.valueOf(this.f14300n.f14162o.optInt("phone-type")))));
        n0.a(this.f13898q, "model", this.f14300n.f14152e);
        n0.a(this.f13898q, "device_type", this.f14300n.f14160m);
        n0.a(this.f13898q, "actual_device_type", this.f14300n.f14161n);
        n0.a(this.f13898q, "os", this.f14300n.f14153f);
        n0.a(this.f13898q, ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, this.f14300n.f14154g);
        n0.a(this.f13898q, "language", this.f14300n.f14155h);
        n0.a(this.f13898q, "timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f14300n.f14151d.a())));
        n0.a(this.f13898q, "reachability", Integer.valueOf(this.f14300n.f14149b.b()));
        n0.a(this.f13898q, "is_portrait", Boolean.valueOf(this.f14300n.m()));
        n0.a(this.f13898q, "scale", Float.valueOf(d10.f14172e));
        n0.a(this.f13898q, "timezone", this.f14300n.f14164q);
        n0.a(this.f13898q, "mobile_network", Integer.valueOf(this.f14300n.a()));
        n0.a(this.f13898q, "dw", Integer.valueOf(d10.f14168a));
        n0.a(this.f13898q, "dh", Integer.valueOf(d10.f14169b));
        n0.a(this.f13898q, "dpi", d10.f14173f);
        n0.a(this.f13898q, "w", Integer.valueOf(d10.f14170c));
        n0.a(this.f13898q, "h", Integer.valueOf(d10.f14171d));
        n0.a(this.f13898q, "user_agent", com.chartboost.sdk.g.f13892q);
        n0.a(this.f13898q, "device_family", "");
        n0.a(this.f13898q, "retina", bool);
        m0.a e10 = this.f14300n.e();
        n0.a(this.f13898q, "identity", e10.f14188b);
        int i10 = e10.f14187a;
        if (i10 != -1) {
            n0.a(this.f13898q, "limit_ad_tracking", Boolean.valueOf(i10 == 1));
        }
        n0.a(this.f13898q, "pidatauseconsent", Integer.valueOf(e2.f13964a.getValue()));
        Integer num = e10.f14192f;
        if (num != null) {
            n0.a(this.f13898q, "appsetidscope", num);
        }
        n0.a(this.f13898q, "privacy", this.f14300n.i());
        a("device", this.f13898q);
        n0.a(this.f13896o, "sdk", this.f14300n.f14158k);
        if (com.chartboost.sdk.g.f13880e != null) {
            n0.a(this.f13896o, "framework_version", com.chartboost.sdk.g.f13882g);
            n0.a(this.f13896o, "wrapper_version", com.chartboost.sdk.g.f13878c);
        }
        MediationModel mediationModel = com.chartboost.sdk.g.f13884i;
        if (mediationModel != null) {
            n0.a(this.f13896o, "mediation", mediationModel.getMediation());
            n0.a(this.f13896o, "mediation_version", com.chartboost.sdk.g.f13884i.getMediationVersion());
            n0.a(this.f13896o, "adapter_version", com.chartboost.sdk.g.f13884i.getAdapterVersion());
        }
        n0.a(this.f13896o, "commit_hash", "57765bc2b2f75148b38b00aeb311ac30843720cb");
        String str = this.f14300n.f14150c.get().f13710a;
        if (!l.b().a(str)) {
            n0.a(this.f13896o, "config_variant", str);
        }
        a("sdk", this.f13896o);
        n0.a(this.f13899r, "session", Integer.valueOf(this.f14300n.k()));
        if (this.f13899r.isNull("cache")) {
            n0.a(this.f13899r, "cache", bool);
        }
        if (this.f13899r.isNull(AppLovinEventParameters.REVENUE_AMOUNT)) {
            n0.a(this.f13899r, AppLovinEventParameters.REVENUE_AMOUNT, 0);
        }
        if (this.f13899r.isNull("retry_count")) {
            n0.a(this.f13899r, "retry_count", 0);
        }
        if (this.f13899r.isNull("location")) {
            n0.a(this.f13899r, "location", "");
        }
        a("ad", this.f13899r);
    }
}
