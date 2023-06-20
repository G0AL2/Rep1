package com.bytedance.sdk.openadsdk.core.c.a;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: DynamicAdInfo.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f11989a;

    /* renamed from: b  reason: collision with root package name */
    private String f11990b;

    /* renamed from: c  reason: collision with root package name */
    private String f11991c;

    public a(String str, String str2, String str3) {
        this.f11989a = str;
        this.f11990b = str2;
        this.f11991c = str3;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11989a)) {
                jSONObject.put("cid", this.f11989a);
            }
            if (!TextUtils.isEmpty(this.f11990b)) {
                jSONObject.put("log_extra", this.f11990b);
            }
            if (!TextUtils.isEmpty(this.f11991c)) {
                jSONObject.put("download_url", this.f11991c);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
