package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class w2 {

    /* renamed from: a  reason: collision with root package name */
    private String f14397a;

    /* renamed from: b  reason: collision with root package name */
    private String f14398b;

    /* renamed from: c  reason: collision with root package name */
    private String f14399c;

    /* renamed from: d  reason: collision with root package name */
    private String f14400d;

    /* renamed from: e  reason: collision with root package name */
    private String f14401e;

    public w2(String str, String str2, String str3, String str4, String str5) {
        this.f14397a = str;
        this.f14398b = str2;
        this.f14399c = str3;
        this.f14400d = str4;
        this.f14401e = str5;
    }

    public String a() {
        return this.f14400d;
    }

    public String b() {
        return this.f14399c;
    }

    public String c() {
        return this.f14398b;
    }

    public String d() {
        return this.f14397a;
    }

    public String toString() {
        String str = this.f14399c;
        if (str != null && str.length() > 20) {
            str = this.f14399c.substring(0, 20);
        }
        return "TrackAd{location='" + this.f14397a + "'ad_type='" + this.f14398b + "', ad_impression_id='" + str + "', ad_creative_id='" + this.f14400d + "', ad_creative_type='" + this.f14401e + "'}";
    }
}
