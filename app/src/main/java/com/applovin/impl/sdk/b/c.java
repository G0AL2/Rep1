package com.applovin.impl.sdk.b;

import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8158a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f8159b;

    private c(String str, Map<String, String> map) {
        this.f8158a = str;
        this.f8159b = map;
    }

    public static c a(String str) {
        return a(str, null);
    }

    public static c a(String str, Map<String, String> map) {
        return new c(str, map);
    }

    public Map<String, String> a() {
        return this.f8159b;
    }

    public String b() {
        return this.f8158a;
    }

    public String toString() {
        return "PendingReward{result='" + this.f8158a + "'params='" + this.f8159b + "'}";
    }
}
