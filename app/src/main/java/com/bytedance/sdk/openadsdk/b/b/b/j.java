package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: LoadVideoErrorModel.java */
/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f11039a;

    /* renamed from: b  reason: collision with root package name */
    private long f11040b;

    /* renamed from: c  reason: collision with root package name */
    private long f11041c;

    /* renamed from: d  reason: collision with root package name */
    private int f11042d;

    /* renamed from: e  reason: collision with root package name */
    private String f11043e;

    /* renamed from: f  reason: collision with root package name */
    private String f11044f;

    public void a(String str) {
        this.f11039a = str;
    }

    public void b(long j10) {
        this.f11041c = j10;
    }

    public void c(String str) {
        this.f11044f = str;
    }

    public void a(long j10) {
        this.f11040b = j10;
    }

    public void b(String str) {
        this.f11043e = str;
    }

    public void a(int i10) {
        this.f11042d = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.f11039a);
            jSONObject.put("preload_size", this.f11040b);
            jSONObject.put("load_time", this.f11041c);
            jSONObject.put("error_code", this.f11042d);
            jSONObject.put("error_message", this.f11043e);
            jSONObject.put("error_message_server", this.f11044f);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
