package com.fyber.inneractive.sdk.external;

/* loaded from: classes.dex */
public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER(InneractiveMediationNameConsts.OTHER);
    

    /* renamed from: a  reason: collision with root package name */
    public final String f17166a;

    InneractiveMediationName(String str) {
        this.f17166a = str;
    }

    public String getKey() {
        return this.f17166a;
    }
}
