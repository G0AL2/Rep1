package com.android.billingclient.api;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class SkuDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f6010a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f6011b;

    public SkuDetails(String str) throws JSONException {
        this.f6010a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f6011b = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            if (TextUtils.isEmpty(jSONObject.optString("type"))) {
                throw new IllegalArgumentException("SkuType cannot be empty.");
            }
            return;
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    public String a() {
        return this.f6011b.optString("description");
    }

    public String b() {
        return this.f6011b.optString("freeTrialPeriod");
    }

    public String c() {
        return this.f6011b.optString("iconUrl");
    }

    public String d() {
        return this.f6011b.optString("introductoryPrice");
    }

    public int e() {
        return this.f6011b.optInt("introductoryPriceCycles");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f6010a, ((SkuDetails) obj).f6010a);
        }
        return false;
    }

    public String f() {
        return this.f6011b.optString("introductoryPricePeriod");
    }

    public String g() {
        return this.f6010a;
    }

    public String h() {
        if (this.f6011b.has("original_price")) {
            return this.f6011b.optString("original_price");
        }
        return i();
    }

    public int hashCode() {
        return this.f6010a.hashCode();
    }

    public String i() {
        return this.f6011b.optString(InAppPurchaseMetaData.KEY_PRICE);
    }

    public String j() {
        return this.f6011b.optString("price_currency_code");
    }

    public String k() {
        return this.f6011b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    public String l() {
        return this.f6011b.optString("subscriptionPeriod");
    }

    public String m() {
        return this.f6011b.optString("title");
    }

    public String n() {
        return this.f6011b.optString("type");
    }

    public int o() {
        return this.f6011b.optInt("offer_type");
    }

    public String p() {
        return this.f6011b.optString("offer_id");
    }

    public String q() {
        String optString = this.f6011b.optString("offerIdToken");
        return optString.isEmpty() ? this.f6011b.optString("offer_id_token") : optString;
    }

    public final String r() {
        return this.f6011b.optString("packageName");
    }

    public String s() {
        return this.f6011b.optString("serializedDocid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String t() {
        return this.f6011b.optString("skuDetailsToken");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6010a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
