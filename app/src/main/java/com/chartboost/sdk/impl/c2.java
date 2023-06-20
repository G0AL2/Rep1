package com.chartboost.sdk.impl;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c2 {
    private static com.chartboost.sdk.Model.b a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return new com.chartboost.sdk.Model.b("html", str.substring(str.lastIndexOf(47) + 1), str);
    }

    public static b2 b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new b2();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("seatbid");
        n1 n1Var = new n1();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("seat");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("bid");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        int length2 = optJSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i11);
                            if (jSONObject3 != null) {
                                JSONObject optJSONObject = jSONObject3.optJSONObject("ext");
                                if (optJSONObject != null) {
                                    optJSONObject = optJSONObject.optJSONObject("bidder");
                                }
                                if (optJSONObject == null) {
                                    optJSONObject = jSONObject3.getJSONObject("ext");
                                }
                                if (optJSONObject != null) {
                                    n1Var = a(optJSONObject);
                                    com.chartboost.sdk.Model.b a10 = a(n1Var.e());
                                    if (a10 != null) {
                                        arrayList.add(a10);
                                    }
                                }
                                arrayList2.add(a(jSONObject3, n1Var));
                            }
                        }
                    }
                    arrayList3.add(new n2(optString, arrayList2));
                }
            }
        }
        return a(jSONObject, arrayList3, arrayList);
    }

    private static n1 a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("imptrackers");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(optJSONArray.optString(i10, ""));
            }
        }
        return new n1(jSONObject.optString("crtype", ""), jSONObject.optString("adId", ""), jSONObject.optString("cgn", ""), jSONObject.getString("template"), arrayList, jSONObject.optString("videoUrl"));
    }

    private static i0 a(JSONObject jSONObject, n1 n1Var) throws JSONException {
        return new i0(jSONObject.getString("id"), jSONObject.getString("impid"), Double.valueOf(jSONObject.getDouble(InAppPurchaseMetaData.KEY_PRICE)), jSONObject.optString("burl", ""), jSONObject.optString("crid", ""), jSONObject.optString("adm", ""), n1Var);
    }

    private static b2 a(JSONObject jSONObject, ArrayList<n2> arrayList, ArrayList<com.chartboost.sdk.Model.b> arrayList2) throws JSONException {
        return new b2(jSONObject.getString("id"), jSONObject.optString("nbr", ""), jSONObject.optString("cur", "USD"), jSONObject.optString("bidid", ""), arrayList, arrayList2);
    }
}
