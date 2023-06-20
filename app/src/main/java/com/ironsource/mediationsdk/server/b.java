package com.ironsource.mediationsdk.server;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f27382a;

    /* renamed from: b  reason: collision with root package name */
    private String f27383b;

    /* renamed from: c  reason: collision with root package name */
    private String f27384c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f27385d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f27386e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f27387f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27388g;

    /* renamed from: h  reason: collision with root package name */
    private ImpressionData f27389h;

    public b(String str) {
        this.f27382a = str;
        this.f27383b = "";
        this.f27384c = "";
        this.f27385d = new ArrayList();
        this.f27386e = new ArrayList();
        this.f27387f = new ArrayList();
        this.f27388g = true;
        this.f27389h = null;
    }

    public b(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    public b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f27388g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f27382a = jSONObject.getString("instance");
            }
            this.f27383b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getJSONObject("serverData").toString() : "";
            this.f27384c = jSONObject.has(InAppPurchaseMetaData.KEY_PRICE) ? jSONObject.getString(InAppPurchaseMetaData.KEY_PRICE) : "0";
            this.f27385d = new ArrayList();
            this.f27386e = new ArrayList();
            this.f27387f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        this.f27385d.add(jSONArray.getString(i10));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        this.f27386e.add(jSONArray2.getString(i11));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                        this.f27387f.add(jSONArray3.getString(i12));
                    }
                }
            }
            this.f27389h = new ImpressionData(com.ironsource.mediationsdk.c.b.a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f27388g = true;
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("AuctionResponseItem exception " + e10.getMessage());
        }
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f27389h;
        if (impressionData != null) {
            ImpressionData impressionData2 = new ImpressionData(impressionData);
            impressionData2.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
            return impressionData2;
        }
        return null;
    }

    public String a() {
        return this.f27382a;
    }

    public String b() {
        return this.f27383b;
    }

    public String c() {
        return this.f27384c;
    }

    public List<String> d() {
        return this.f27385d;
    }

    public List<String> e() {
        return this.f27386e;
    }

    public List<String> f() {
        return this.f27387f;
    }

    public boolean g() {
        return this.f27388g;
    }
}
