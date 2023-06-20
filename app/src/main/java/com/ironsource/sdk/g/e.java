package com.ironsource.sdk.g;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f28187a;

    /* renamed from: b  reason: collision with root package name */
    public int f28188b;

    public e(int i10, String str) {
        this.f28188b = i10;
        this.f28187a = str == null ? "" : str;
    }

    public final String toString() {
        return "error - code:" + this.f28188b + ", message:" + this.f28187a;
    }
}
