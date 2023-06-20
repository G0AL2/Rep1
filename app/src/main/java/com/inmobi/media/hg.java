package com.inmobi.media;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CatchEvent.java */
/* loaded from: classes3.dex */
public final class hg extends gi {

    /* renamed from: g  reason: collision with root package name */
    private static final String f25657g = hj.class.getSimpleName();

    public hg(Throwable th) {
        super("crashReporting", "catchEvent");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", th.getClass().getSimpleName());
            jSONObject.put("message", th.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(th));
            jSONObject.put("thread", Thread.currentThread().getName());
            this.f25545f = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }
}
