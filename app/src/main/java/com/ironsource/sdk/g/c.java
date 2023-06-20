package com.ironsource.sdk.g;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f28142a;

    /* renamed from: b  reason: collision with root package name */
    public String f28143b;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f28145d;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.sdk.j.a f28148g;

    /* renamed from: c  reason: collision with root package name */
    public int f28144c = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f28146e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f28147f = false;

    public c(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        this.f28143b = str;
        this.f28142a = str2;
        this.f28145d = map;
        this.f28148g = aVar;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceId", this.f28143b);
        hashMap.put("demandSourceName", this.f28142a);
        Map<String, String> map = this.f28145d;
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public final synchronized void a(int i10) {
        this.f28146e = i10;
    }
}
