package com.bytedance.sdk.component.a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Java2JsMsg.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f9259a = new ConcurrentHashMap();

    private p() {
    }

    public static p a() {
        return new p();
    }

    public String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.f9259a.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public p a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f9259a.put(str, obj);
        }
        return this;
    }
}
