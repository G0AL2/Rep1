package com.ironsource.mediationsdk.impressionData;

import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f27091a;

    /* renamed from: b  reason: collision with root package name */
    private String f27092b;

    /* renamed from: c  reason: collision with root package name */
    private String f27093c;

    /* renamed from: d  reason: collision with root package name */
    private String f27094d;

    /* renamed from: e  reason: collision with root package name */
    private String f27095e;

    /* renamed from: f  reason: collision with root package name */
    private String f27096f;

    /* renamed from: g  reason: collision with root package name */
    private String f27097g;

    /* renamed from: h  reason: collision with root package name */
    private String f27098h;

    /* renamed from: i  reason: collision with root package name */
    private String f27099i;

    /* renamed from: j  reason: collision with root package name */
    private String f27100j;

    /* renamed from: k  reason: collision with root package name */
    private Double f27101k;

    /* renamed from: l  reason: collision with root package name */
    private String f27102l;

    /* renamed from: m  reason: collision with root package name */
    private Double f27103m;

    /* renamed from: n  reason: collision with root package name */
    private String f27104n;

    /* renamed from: o  reason: collision with root package name */
    private DecimalFormat f27105o = new DecimalFormat("#.#####");

    public ImpressionData(ImpressionData impressionData) {
        this.f27092b = null;
        this.f27093c = null;
        this.f27094d = null;
        this.f27095e = null;
        this.f27096f = null;
        this.f27097g = null;
        this.f27098h = null;
        this.f27099i = null;
        this.f27100j = null;
        this.f27101k = null;
        this.f27102l = null;
        this.f27103m = null;
        this.f27104n = null;
        this.f27091a = impressionData.f27091a;
        this.f27092b = impressionData.f27092b;
        this.f27093c = impressionData.f27093c;
        this.f27094d = impressionData.f27094d;
        this.f27095e = impressionData.f27095e;
        this.f27096f = impressionData.f27096f;
        this.f27097g = impressionData.f27097g;
        this.f27098h = impressionData.f27098h;
        this.f27099i = impressionData.f27099i;
        this.f27100j = impressionData.f27100j;
        this.f27102l = impressionData.f27102l;
        this.f27104n = impressionData.f27104n;
        this.f27103m = impressionData.f27103m;
        this.f27101k = impressionData.f27101k;
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d10 = null;
        this.f27092b = null;
        this.f27093c = null;
        this.f27094d = null;
        this.f27095e = null;
        this.f27096f = null;
        this.f27097g = null;
        this.f27098h = null;
        this.f27099i = null;
        this.f27100j = null;
        this.f27101k = null;
        this.f27102l = null;
        this.f27103m = null;
        this.f27104n = null;
        if (jSONObject != null) {
            try {
                this.f27091a = jSONObject;
                this.f27092b = jSONObject.optString("auctionId", null);
                this.f27093c = jSONObject.optString("adUnit", null);
                this.f27094d = jSONObject.optString(IMPRESSION_DATA_KEY_COUNTRY, null);
                this.f27095e = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.f27096f = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.f27097g = jSONObject.optString("placement", null);
                this.f27098h = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.f27099i = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_NAME, null);
                this.f27100j = jSONObject.optString(IMPRESSION_DATA_KEY_INSTANCE_ID, null);
                this.f27102l = jSONObject.optString(IMPRESSION_DATA_KEY_PRECISION, null);
                this.f27104n = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f27103m = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble(IMPRESSION_DATA_KEY_REVENUE);
                if (!Double.isNaN(optDouble2)) {
                    d10 = Double.valueOf(optDouble2);
                }
                this.f27101k = d10;
            } catch (Exception e10) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e10.getMessage());
            }
        }
    }

    public String getAb() {
        return this.f27095e;
    }

    public String getAdNetwork() {
        return this.f27098h;
    }

    public String getAdUnit() {
        return this.f27093c;
    }

    public JSONObject getAllData() {
        return this.f27091a;
    }

    public String getAuctionId() {
        return this.f27092b;
    }

    public String getCountry() {
        return this.f27094d;
    }

    public String getEncryptedCPM() {
        return this.f27104n;
    }

    public String getInstanceId() {
        return this.f27100j;
    }

    public String getInstanceName() {
        return this.f27099i;
    }

    public Double getLifetimeRevenue() {
        return this.f27103m;
    }

    public String getPlacement() {
        return this.f27097g;
    }

    public String getPrecision() {
        return this.f27102l;
    }

    public Double getRevenue() {
        return this.f27101k;
    }

    public String getSegmentName() {
        return this.f27096f;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f27097g;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f27097g = replace;
            JSONObject jSONObject = this.f27091a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("auctionId: '");
        sb2.append(this.f27092b);
        sb2.append('\'');
        sb2.append(", adUnit: '");
        sb2.append(this.f27093c);
        sb2.append('\'');
        sb2.append(", country: '");
        sb2.append(this.f27094d);
        sb2.append('\'');
        sb2.append(", ab: '");
        sb2.append(this.f27095e);
        sb2.append('\'');
        sb2.append(", segmentName: '");
        sb2.append(this.f27096f);
        sb2.append('\'');
        sb2.append(", placement: '");
        sb2.append(this.f27097g);
        sb2.append('\'');
        sb2.append(", adNetwork: '");
        sb2.append(this.f27098h);
        sb2.append('\'');
        sb2.append(", instanceName: '");
        sb2.append(this.f27099i);
        sb2.append('\'');
        sb2.append(", instanceId: '");
        sb2.append(this.f27100j);
        sb2.append('\'');
        sb2.append(", revenue: ");
        Double d10 = this.f27101k;
        sb2.append(d10 == null ? null : this.f27105o.format(d10));
        sb2.append(", precision: '");
        sb2.append(this.f27102l);
        sb2.append('\'');
        sb2.append(", lifetimeRevenue: ");
        Double d11 = this.f27103m;
        sb2.append(d11 != null ? this.f27105o.format(d11) : null);
        sb2.append(", encryptedCPM: '");
        sb2.append(this.f27104n);
        return sb2.toString();
    }
}
