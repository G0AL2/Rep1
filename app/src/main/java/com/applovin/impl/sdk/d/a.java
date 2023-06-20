package com.applovin.impl.sdk.d;

import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8269a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8270b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f8271c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8272d;

    public a(String str, String str2) {
        this(str, str2, null, false);
    }

    public a(String str, String str2, Map<String, String> map, boolean z10) {
        this.f8269a = str;
        this.f8270b = str2;
        this.f8271c = map;
        this.f8272d = z10;
    }

    public String a() {
        return this.f8269a;
    }

    public String b() {
        return this.f8270b;
    }

    public Map<String, String> c() {
        return this.f8271c;
    }

    public boolean d() {
        return this.f8272d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f8269a + "', backupUrl='" + this.f8270b + "', headers='" + this.f8271c + "', shouldFireInWebView='" + this.f8272d + "'}";
    }
}
