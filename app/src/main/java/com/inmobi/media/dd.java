package com.inmobi.media;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OrientationProperties.java */
/* loaded from: classes3.dex */
public class dd {

    /* renamed from: e  reason: collision with root package name */
    private static String f25092e = "dd";

    /* renamed from: b  reason: collision with root package name */
    public String f25094b = "none";

    /* renamed from: c  reason: collision with root package name */
    public String f25095c = "right";

    /* renamed from: a  reason: collision with root package name */
    public boolean f25093a = true;

    /* renamed from: d  reason: collision with root package name */
    public String f25096d = null;

    public static dd a(String str, dd ddVar) {
        dd ddVar2 = new dd();
        ddVar2.f25096d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ddVar2.f25094b = jSONObject.optString("forceOrientation", ddVar.f25094b);
            ddVar2.f25093a = jSONObject.optBoolean("allowOrientationChange", ddVar.f25093a);
            ddVar2.f25095c = jSONObject.optString("direction", ddVar.f25095c);
            if (!ddVar2.f25094b.equals(DtbDeviceDataRetriever.ORIENTATION_PORTRAIT) && !ddVar2.f25094b.equals(DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE)) {
                ddVar2.f25094b = "none";
            }
            if (ddVar2.f25095c.equals("left") || ddVar2.f25095c.equals("right")) {
                return ddVar2;
            }
            ddVar2.f25095c = "right";
            return ddVar2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String toString() {
        return "OrientationProperties{allowOrientationChange=" + this.f25093a + ", forceOrientation='" + this.f25094b + "', direction='" + this.f25095c + "', creativeSuppliedProperties='" + this.f25096d + "'}";
    }
}
