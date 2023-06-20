package com.bytedance.sdk.openadsdk.b.b.b;

import com.bytedance.sdk.openadsdk.b.b.b.c;
import org.json.JSONObject;

/* compiled from: BaseEventModel.java */
/* loaded from: classes.dex */
public class a<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f11014a;

    /* renamed from: b  reason: collision with root package name */
    private String f11015b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f11016c;

    /* renamed from: d  reason: collision with root package name */
    private T f11017d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11018e = false;

    public a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, JSONObject jSONObject, T t10) {
        this.f11017d = null;
        this.f11014a = nVar;
        this.f11015b = str;
        this.f11016c = jSONObject;
        this.f11017d = t10;
    }

    public com.bytedance.sdk.openadsdk.core.e.n a() {
        return this.f11014a;
    }

    public String b() {
        return this.f11015b;
    }

    public JSONObject c() {
        if (this.f11016c == null) {
            this.f11016c = new JSONObject();
        }
        return this.f11016c;
    }

    public T d() {
        return this.f11017d;
    }

    public boolean e() {
        return this.f11018e;
    }

    public void a(boolean z10) {
        this.f11018e = z10;
    }
}
