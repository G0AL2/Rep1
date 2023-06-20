package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public c() {
        new com.ironsource.mediationsdk.adunit.a.a();
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", com.ironsource.sdk.e.a.a.f28095a);
        hashMap.put("ompv", "7");
        com.ironsource.mediationsdk.adunit.a.a.a(hashMap);
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                com.ironsource.mediationsdk.adunit.a.a.a("imm", Boolean.valueOf(h.a(activity)));
            }
        }
    }

    public final void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            com.ironsource.mediationsdk.adunit.a.a.a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void b(Context context) {
        com.ironsource.mediationsdk.adunit.a.a.a("gpi", Boolean.valueOf(k.a(context)));
    }

    public final void c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            com.ironsource.mediationsdk.adunit.a.a.a("debug", jSONObject);
        }
    }
}
