package com.applovin.impl.mediation.a;

import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a extends f implements MaxAd {

    /* renamed from: a  reason: collision with root package name */
    protected com.applovin.impl.mediation.g f7206a;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7207c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdWaterfallInfo f7208d;

    /* renamed from: e  reason: collision with root package name */
    private String f7209e;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
        this.f7207c = new AtomicBoolean();
        this.f7206a = gVar;
    }

    public static a a(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, m mVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        if (formatFromString.isAdViewAd()) {
            return new b(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d(map, jSONObject, jSONObject2, mVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c(map, jSONObject, jSONObject2, mVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    private long u() {
        return b("load_started_time_ms", 0L);
    }

    public abstract a a(com.applovin.impl.mediation.g gVar);

    public String a() {
        return this.f7209e;
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("creative_id") && !b("creative_id")) {
                c("creative_id", BundleUtils.getString("creative_id", bundle));
            }
            if (!bundle.containsKey("ad_width") || b("ad_width") || !bundle.containsKey("ad_height") || b("ad_height")) {
                return;
            }
            int i10 = BundleUtils.getInt("ad_width", bundle);
            int i11 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i10);
            c("ad_height", i11);
        }
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f7208d = maxAdWaterfallInfo;
    }

    public void a(String str) {
        this.f7209e = str;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject b10 = b();
        JsonUtils.putAll(b10, jSONObject);
        a(Utils.KEY_AD_VALUES, (Object) b10);
    }

    public JSONObject b() {
        return a(Utils.KEY_AD_VALUES, new JSONObject());
    }

    public JSONObject c() {
        return a("revenue_parameters", new JSONObject());
    }

    public String d() {
        return JsonUtils.getString(c(), "revenue_event", "");
    }

    public boolean e() {
        com.applovin.impl.mediation.g gVar = this.f7206a;
        return gVar != null && gVar.f() && this.f7206a.g();
    }

    public String f() {
        return a("event_id", "");
    }

    public com.applovin.impl.mediation.g g() {
        return this.f7206a;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f7216b.B().a(f());
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject b10 = b();
        if (b10.has(str)) {
            return JsonUtils.getString(b10, str, str2);
        }
        Bundle U = U();
        return U.containsKey(str) ? U.getString(str) : b(str, str2);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return b("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return b("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return b("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(b("ad_format", a("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return b("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(l());
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        return JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_REVENUE, -1.0d);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        return JsonUtils.getString(a("revenue_parameters", (JSONObject) null), ImpressionData.IMPRESSION_DATA_KEY_PRECISION, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int b10 = b("ad_width", -3);
        int b11 = b("ad_height", -3);
        return (b10 == -3 || b11 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(b10, b11);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f7208d;
    }

    public Bundle h() {
        JSONObject a10;
        if (b("credentials")) {
            a10 = a("credentials", new JSONObject());
        } else {
            a10 = a("server_parameters", new JSONObject());
            JsonUtils.putString(a10, FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, l());
        }
        return JsonUtils.toBundle(a10);
    }

    public String i() {
        return b("bid_response", (String) null);
    }

    public long j() {
        return b("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, U()));
    }

    public boolean k() {
        return b("is_js_tag_ad", Boolean.FALSE).booleanValue();
    }

    public String l() {
        return b("third_party_ad_placement_id", (String) null);
    }

    public String m() {
        return a("waterfall_name", "");
    }

    public String n() {
        return a("waterfall_test_name", "");
    }

    public long o() {
        if (u() > 0) {
            return q() - u();
        }
        return -1L;
    }

    public void p() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public long q() {
        return b("load_completed_time_ms", 0L);
    }

    public void r() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public AtomicBoolean s() {
        return this.f7207c;
    }

    public void t() {
        this.f7206a = null;
        this.f7208d = null;
    }

    @Override // com.applovin.impl.mediation.a.f
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + l() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }
}
