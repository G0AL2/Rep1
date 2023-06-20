package com.bytedance.sdk.component.f.a;

import org.json.JSONObject;

/* compiled from: ThreadLogModel.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f10403a;

    /* renamed from: b  reason: collision with root package name */
    public int f10404b;

    /* renamed from: c  reason: collision with root package name */
    public int f10405c;

    /* renamed from: d  reason: collision with root package name */
    public int f10406d;

    public a(int i10, int i11, int i12, int i13) {
        this.f10403a = i10;
        this.f10404b = i11;
        this.f10405c = i12;
        this.f10406d = i13;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f10403a);
            jSONObject.put("sdk_max_thread_num", this.f10404b);
            jSONObject.put("app_thread_num", this.f10405c);
            jSONObject.put("app_max_thread_num", this.f10406d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
