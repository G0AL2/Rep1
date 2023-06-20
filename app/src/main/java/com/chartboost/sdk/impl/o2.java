package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.s0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o2 implements s0.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f14239a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14240b;

    public o2(f fVar, String str) {
        this.f14239a = fVar;
        this.f14240b = str;
    }

    @Override // com.chartboost.sdk.impl.s0.a
    public void a(s0 s0Var, JSONObject jSONObject) {
        f fVar = this.f14239a;
        if (fVar.f13980o.f13938e || com.chartboost.sdk.g.f13889n) {
            synchronized (fVar) {
                f fVar2 = this.f14239a;
                if (fVar2.f13980o.f13934a != 2) {
                    fVar2.c(this.f14240b);
                }
            }
        }
    }

    @Override // com.chartboost.sdk.impl.s0.a
    public void a(s0 s0Var, CBError cBError) {
        f fVar = this.f14239a;
        if (fVar.f13980o.f13938e) {
            synchronized (fVar) {
                this.f14239a.c(this.f14240b);
            }
        }
        m1.d(new com.chartboost.sdk.Tracking.b("show_request_error", cBError.getErrorDesc(), this.f14239a.f13980o.f13935b, this.f14240b));
    }
}
