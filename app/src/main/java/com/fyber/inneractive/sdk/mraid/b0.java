package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;

/* loaded from: classes.dex */
public class b0 extends t {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17492a;

    public b0(boolean z10) {
        this.f17492a = z10;
    }

    @Override // com.fyber.inneractive.sdk.mraid.t
    public String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("viewable: ");
        sb2.append(this.f17492a ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        return sb2.toString();
    }
}
