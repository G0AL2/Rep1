package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ah {

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.lifecycle.a f26973a;

    /* loaded from: classes3.dex */
    final class a extends com.ironsource.lifecycle.g {
        public a() {
        }

        @Override // com.ironsource.lifecycle.g, java.lang.Runnable
        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", this.f26214a);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.ironsource.mediationsdk.a.g.f26727w.b(new com.ironsource.mediationsdk.a.c(44, mediationAdditionalData));
        }
    }
}
