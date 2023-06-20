package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d2 extends s0 {

    /* renamed from: o  reason: collision with root package name */
    private static final String f13952o = "d2";

    public d2(Context context, w1 w1Var, b bVar) {
        super(w1Var.f14392a, w1Var.f14393b, w1Var.f14394c, w1Var.f14395d, w1Var.f14396e);
        this.f14297k = new x1(context, w1Var.f14394c, bVar).f();
    }

    @Override // com.chartboost.sdk.impl.s0, com.chartboost.sdk.impl.o0
    public p0<JSONObject> a(q0 q0Var) {
        if (q0Var.f14268b == null) {
            return p0.a(new CBError(CBError.b.INVALID_RESPONSE, "Response is not a valid json object"));
        }
        try {
            return p0.a(new JSONObject(new String(q0Var.f14268b)));
        } catch (JSONException e10) {
            String str = f13952o;
            CBLogging.b(str, "parseServerResponse: " + e10.toString());
            return p0.a(new CBError(CBError.b.HTTP_NOT_FOUND, "No Bid"));
        }
    }

    @Override // com.chartboost.sdk.impl.s0
    public void c() {
    }
}
