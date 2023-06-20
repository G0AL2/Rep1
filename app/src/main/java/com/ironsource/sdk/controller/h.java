package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    private static final String f27802c = "com.ironsource.sdk.controller.h";

    /* renamed from: a  reason: collision with root package name */
    private final d f27803a;

    /* renamed from: b  reason: collision with root package name */
    private final t f27804b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(d dVar, t tVar) {
        this.f27803a = dVar;
        this.f27804b = tVar;
    }

    private static String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put("hash", SDKUtils.encodeString(str3));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public final void messageHandler(String str, String str2, String str3) {
        try {
            String str4 = f27802c;
            Logger.i(str4, "messageHandler(" + str + " " + str3 + ")");
            if (this.f27804b.b(str, str2, str3)) {
                this.f27803a.a(str, str2);
                return;
            }
            d dVar = this.f27803a;
            String a10 = a(str, str2, str3);
            x.d dVar2 = dVar.f27714a;
            if (dVar2 != null) {
                x.this.b(x.u(x.this, "unauthorizedMessage", a10, null, null));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            String str5 = f27802c;
            Logger.i(str5, "messageHandler failed with exception " + e10.getMessage());
        }
    }
}
