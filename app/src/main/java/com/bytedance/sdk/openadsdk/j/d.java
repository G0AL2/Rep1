package com.bytedance.sdk.openadsdk.j;

/* compiled from: NetType.java */
/* loaded from: classes.dex */
public enum d {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_UNKNOWN("mobile");
    

    /* renamed from: g  reason: collision with root package name */
    private String f13359g;

    d(String str) {
        this.f13359g = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f13359g;
    }
}
