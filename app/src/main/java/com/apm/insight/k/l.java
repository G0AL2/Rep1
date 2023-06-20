package com.apm.insight.k;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final int f6467a;

    /* renamed from: b  reason: collision with root package name */
    private String f6468b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f6469c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f6470d;

    public l(int i10) {
        this.f6467a = i10;
    }

    public l(int i10, String str) {
        this.f6467a = i10;
        this.f6468b = str;
    }

    public l(int i10, Throwable th) {
        this.f6467a = i10;
        if (th != null) {
            this.f6468b = th.getMessage();
        }
    }

    public l(int i10, JSONObject jSONObject) {
        this.f6467a = i10;
        this.f6469c = jSONObject;
    }

    public l(int i10, byte[] bArr) {
        this.f6467a = i10;
        this.f6470d = bArr;
    }

    public boolean a() {
        return this.f6467a != 207;
    }

    public byte[] b() {
        return this.f6470d;
    }
}
