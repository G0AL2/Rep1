package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public NetworkSettings f27214a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f27215b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27216c;

    /* renamed from: d  reason: collision with root package name */
    public int f27217d;

    /* renamed from: e  reason: collision with root package name */
    public int f27218e;

    /* renamed from: f  reason: collision with root package name */
    public IronSource.AD_UNIT f27219f;

    public a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f27214a = networkSettings;
        this.f27215b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f27217d = optInt;
        this.f27216c = optInt == 2;
        this.f27218e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f27219f = ad_unit;
    }
}
