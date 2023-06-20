package com.bytedance.sdk.openadsdk.multipro.b;

import org.json.JSONObject;

/* compiled from: VideoControllerDataModel.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13513a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13514b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13515c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13516d;

    /* renamed from: e  reason: collision with root package name */
    public long f13517e;

    /* renamed from: f  reason: collision with root package name */
    public long f13518f;

    /* renamed from: g  reason: collision with root package name */
    public long f13519g;

    /* compiled from: VideoControllerDataModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0184a {
        a f();
    }

    public a a(boolean z10) {
        this.f13516d = z10;
        return this;
    }

    public a b(boolean z10) {
        this.f13513a = z10;
        return this;
    }

    public a c(boolean z10) {
        this.f13514b = z10;
        return this;
    }

    public a d(boolean z10) {
        this.f13515c = z10;
        return this;
    }

    public a a(long j10) {
        this.f13517e = j10;
        return this;
    }

    public a b(long j10) {
        this.f13518f = j10;
        return this;
    }

    public a c(long j10) {
        this.f13519g = j10;
        return this;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f13513a);
            jSONObject.put("isFromVideoDetailPage", this.f13514b);
            jSONObject.put("isFromDetailPage", this.f13515c);
            jSONObject.put("duration", this.f13517e);
            jSONObject.put("totalPlayDuration", this.f13518f);
            jSONObject.put("currentPlayPosition", this.f13519g);
            jSONObject.put("isAutoPlay", this.f13516d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        aVar.b(jSONObject.optBoolean("isCompleted"));
        aVar.c(jSONObject.optBoolean("isFromVideoDetailPage"));
        aVar.d(jSONObject.optBoolean("isFromDetailPage"));
        aVar.a(jSONObject.optLong("duration"));
        aVar.b(jSONObject.optLong("totalPlayDuration"));
        aVar.c(jSONObject.optLong("currentPlayPosition"));
        aVar.a(jSONObject.optBoolean("isAutoPlay"));
        return aVar;
    }
}
