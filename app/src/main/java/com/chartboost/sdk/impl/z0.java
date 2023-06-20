package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public class z0 extends com.chartboost.sdk.d {
    public z0(Context context, com.chartboost.sdk.Model.c cVar, p1 p1Var, com.chartboost.sdk.Networking.b bVar, Handler handler, com.chartboost.sdk.b bVar2, com.chartboost.sdk.c cVar2, u0 u0Var) {
        super(context, cVar, handler, bVar2, p1Var, cVar2, bVar, u0Var);
    }

    @Override // com.chartboost.sdk.d
    public j3 a(Context context, e3 e3Var) {
        try {
            return new m3(context, this.f13806f, this.T, this.U, this, this.f13801a, this.f13807g);
        } catch (Exception e10) {
            c("Can't instantiate WebViewBase: " + e10.toString());
            return null;
        }
    }

    @Override // com.chartboost.sdk.d
    public void z() {
    }
}
