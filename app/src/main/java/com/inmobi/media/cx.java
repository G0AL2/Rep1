package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExpandProperties.java */
/* loaded from: classes3.dex */
public class cx {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25037d = "cx";

    /* renamed from: b  reason: collision with root package name */
    public boolean f25039b;

    /* renamed from: c  reason: collision with root package name */
    public String f25040c;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25038a = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f25041e = true;

    public cx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", ic.a().f25745a);
            jSONObject.put("height", ic.a().f25746b);
            jSONObject.put("useCustomClose", this.f25038a);
            jSONObject.put("isModal", this.f25041e);
        } catch (JSONException unused) {
        }
        this.f25040c = jSONObject.toString();
    }

    public static cx a(String str) {
        cx cxVar = new cx();
        cxVar.f25040c = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            cxVar.f25041e = true;
            if (jSONObject.has("useCustomClose")) {
                cxVar.f25039b = true;
            }
            cxVar.f25038a = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return cxVar;
    }
}
