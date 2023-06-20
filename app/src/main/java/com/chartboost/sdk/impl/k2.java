package com.chartboost.sdk.impl;

import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class k2 {

    /* renamed from: a  reason: collision with root package name */
    private i2 f14140a;

    public k2(i2 i2Var) {
        this.f14140a = i2Var;
    }

    public DataUseConsent a(String str) {
        DataUseConsent a10 = this.f14140a.a(str);
        if (a10 != null) {
            e2.a(str);
        }
        return a10;
    }
}
