package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.m0;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y implements z {

    /* renamed from: a  reason: collision with root package name */
    public String f17072a;

    /* renamed from: b  reason: collision with root package name */
    public String f17073b;

    /* renamed from: c  reason: collision with root package name */
    public r f17074c;

    /* renamed from: d  reason: collision with root package name */
    public v f17075d;

    /* renamed from: e  reason: collision with root package name */
    public w f17076e;

    /* renamed from: f  reason: collision with root package name */
    public a0 f17077f;

    /* renamed from: g  reason: collision with root package name */
    public c0 f17078g;

    public b0 a() {
        return this.f17077f;
    }

    public c0 b() {
        return this.f17078g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        m0.a(jSONObject, "id", this.f17072a);
        m0.a(jSONObject, "spotId", this.f17073b);
        m0.a(jSONObject, "display", this.f17074c);
        m0.a(jSONObject, "monitor", this.f17075d);
        m0.a(jSONObject, "native", this.f17076e);
        m0.a(jSONObject, DownloadResource.TYPE_VIDEO, this.f17077f);
        m0.a(jSONObject, "viewability", this.f17078g);
        return jSONObject.toString();
    }
}
