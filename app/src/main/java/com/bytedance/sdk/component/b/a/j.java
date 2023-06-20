package com.bytedance.sdk.component.b.a;

/* compiled from: Protocol.java */
/* loaded from: classes.dex */
public enum j {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: e  reason: collision with root package name */
    private final String f10071e;

    j(String str) {
        this.f10071e = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f10071e;
    }
}
