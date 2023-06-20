package com.android.billingclient.api;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    private final String f6005a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6006b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f6007c;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f6008a;

        /* renamed from: b  reason: collision with root package name */
        private final e f6009b;

        public a(e eVar, List<Purchase> list) {
            this.f6008a = list;
            this.f6009b = eVar;
        }

        public e a() {
            return this.f6009b;
        }

        public List<Purchase> b() {
            return this.f6008a;
        }
    }

    public Purchase(String str, String str2) throws JSONException {
        this.f6005a = str;
        this.f6006b = str2;
        this.f6007c = new JSONObject(str);
    }

    public String a() {
        return this.f6007c.optString("developerPayload");
    }

    public String b() {
        return this.f6007c.optString("orderId");
    }

    public String c() {
        return this.f6005a;
    }

    public String d() {
        return this.f6007c.optString("packageName");
    }

    public int e() {
        return this.f6007c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Purchase) {
            Purchase purchase = (Purchase) obj;
            return TextUtils.equals(this.f6005a, purchase.c()) && TextUtils.equals(this.f6006b, purchase.h());
        }
        return false;
    }

    public long f() {
        return this.f6007c.optLong("purchaseTime");
    }

    public String g() {
        JSONObject jSONObject = this.f6007c;
        return jSONObject.optString(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY, jSONObject.optString("purchaseToken"));
    }

    public String h() {
        return this.f6006b;
    }

    public int hashCode() {
        return this.f6005a.hashCode();
    }

    public ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f6007c.has("productIds")) {
            JSONArray optJSONArray = this.f6007c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f6007c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.f6007c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean j() {
        return this.f6007c.optBoolean("acknowledged", true);
    }

    public boolean k() {
        return this.f6007c.optBoolean("autoRenewing");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f6005a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
