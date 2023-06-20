package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBLogging;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.chartboost.sdk.c f14310a;

    public u0(com.chartboost.sdk.c cVar) {
        this.f14310a = cVar;
    }

    public void a(y0 y0Var) {
        b("onBackground", y0Var);
    }

    public void b(y0 y0Var) {
        b("onForeground", y0Var);
    }

    public void c(y0 y0Var) {
        b("videoEnded", y0Var);
    }

    public void d(y0 y0Var) {
        b("videoFailed", y0Var);
    }

    private final String c() {
        String str;
        com.chartboost.sdk.Model.c b10 = b();
        return (b10 == null || (str = b10.f13695l) == null) ? "" : str;
    }

    public void a(y0 y0Var, float f10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seconds", Float.valueOf(f10));
        String jSONObject2 = jSONObject.toString();
        qe.k.e(jSONObject2, "json.toString()");
        a("playbackTime", jSONObject2, y0Var);
    }

    public void b(y0 y0Var, float f10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", Float.valueOf(f10));
        String jSONObject2 = jSONObject.toString();
        qe.k.e(jSONObject2, "json.toString()");
        a("videoStarted", jSONObject2, y0Var);
    }

    private final void a(String str, String str2, y0 y0Var) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\", " + str2 + ')', y0Var);
    }

    private final void b(String str, y0 y0Var) {
        a("javascript:Chartboost.EventHandler.handleNativeEvent(\"" + str + "\")", y0Var);
    }

    private final void a(String str, y0 y0Var) {
        try {
            if (y0Var != null) {
                CBLogging.a("CBTemplateProxy", qe.k.l("Calling native to javascript: ", str));
                y0Var.loadUrl(str);
            } else {
                m1.d(new com.chartboost.sdk.Tracking.a("show_webview_error", "Webview is null", a(), c()));
                CBLogging.c("CBTemplateProxy", "Calling native to javascript webview is null");
            }
        } catch (Exception e10) {
            m1.d(new com.chartboost.sdk.Tracking.a("show_webview_crash", "Cannot open url", a(), c()));
            CBLogging.c("CBTemplateProxy", qe.k.l("Calling native to javascript. Cannot open url: ", e10));
        }
    }

    private final com.chartboost.sdk.Model.c b() {
        f2 a10;
        com.chartboost.sdk.c cVar = this.f14310a;
        if (cVar == null || (a10 = cVar.a()) == null) {
            return null;
        }
        return a10.c();
    }

    private final String a() {
        com.chartboost.sdk.Model.c b10 = b();
        if (b10 != null) {
            c cVar = b10.f13686c;
            String str = cVar == null ? null : cVar.f13935b;
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
