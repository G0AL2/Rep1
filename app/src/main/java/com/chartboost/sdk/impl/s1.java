package com.chartboost.sdk.impl;

import com.chartboost.sdk.Privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a  reason: collision with root package name */
    private i2 f14301a;

    public s1(i2 i2Var) {
        this.f14301a = i2Var;
    }

    public DataUseConsent a(String str) {
        return this.f14301a.b().get(str);
    }
}
