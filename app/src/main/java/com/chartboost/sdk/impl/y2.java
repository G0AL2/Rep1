package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class y2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14419a;

    /* renamed from: b  reason: collision with root package name */
    private String f14420b;

    /* renamed from: c  reason: collision with root package name */
    private int f14421c;

    /* renamed from: d  reason: collision with root package name */
    private int f14422d;

    public y2(boolean z10, String str, int i10, int i11) {
        this.f14419a = z10;
        this.f14420b = str;
        this.f14421c = i10;
        this.f14422d = i11;
    }

    public String a() {
        return this.f14420b;
    }

    public int b() {
        return this.f14421c;
    }

    public int c() {
        return this.f14422d;
    }

    public boolean d() {
        return this.f14419a;
    }

    public static y2 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("tracking");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new y2(optJSONObject.optBoolean("enabled", false), optJSONObject.optString("endpoint", "https://ssp-events.chartboost.com/track/sdk"), optJSONObject.optInt("eventLimit", 10), optJSONObject.optInt("windowDuration", 60));
    }
}
