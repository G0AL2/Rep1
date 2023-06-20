package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class d1 {
    public JSONObject a(b1 b1Var) {
        if (b1Var == null) {
            return new JSONObject();
        }
        return n0.a(n0.a("carrier-name", b1Var.d()), n0.a("mobile-country-code", b1Var.a()), n0.a("mobile-network-code", b1Var.b()), n0.a("iso-country-code", b1Var.c()), n0.a("phone-type", Integer.valueOf(b1Var.e())));
    }
}
