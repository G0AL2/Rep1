package com.ironsource.sdk.b;

import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.b.a f27614a;

    /* renamed from: c  reason: collision with root package name */
    public WebView f27616c;

    /* renamed from: d  reason: collision with root package name */
    public String f27617d;

    /* renamed from: e  reason: collision with root package name */
    public String f27618e = b.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    private String[] f27619f = {"handleGetViewVisibility"};

    /* renamed from: b  reason: collision with root package name */
    public d f27615b = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27620a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27621b;

        a(String str, String str2) {
            this.f27620a = str;
            this.f27621b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    b.this.f27616c.evaluateJavascript(this.f27620a, null);
                } else {
                    b.this.f27616c.loadUrl(this.f27620a);
                }
            } catch (Throwable unused) {
                String str = b.this.f27618e;
                Log.e(str, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f27621b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private static String d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", str);
    }

    private void e(String str) {
        com.ironsource.environment.e.a.f26152a.a(new a("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.f27615b.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.f27617d);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.f27615b.a());
        } catch (Exception e10) {
            String str = this.f27618e;
            Log.e(str, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            e10.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f27617d);
            a(str, jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final void a(String str, int i10, boolean z10) {
        d dVar = this.f27615b;
        if (dVar.f27625a.containsKey(str)) {
            dVar.f27625a.put(str, Boolean.valueOf(i10 == 0));
        }
        dVar.f27625a.put("isShown", Boolean.valueOf(z10));
        dVar.f27625a.put("isViewVisible", Boolean.valueOf((dVar.f27625a.get("isWindowVisible").booleanValue() || dVar.f27625a.get("isVisible").booleanValue()) && dVar.f27625a.get("isShown").booleanValue()));
        if (!(Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) || this.f27614a == null || this.f27615b == null) {
            return;
        }
        a("containerIsVisible", a());
    }

    public final void a(String str, String str2) {
        com.ironsource.sdk.b.a aVar = this.f27614a;
        if (aVar != null) {
            aVar.a(str, str2, this.f27617d);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.f27616c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f27618e, str4);
            this.f27614a.a(str3, str4, this.f27617d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        e(d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f27617d);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        com.ironsource.sdk.b.a aVar = this.f27614a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public final void b(String str) {
        JSONObject a10 = this.f27615b.a();
        a10.put("adViewId", this.f27617d);
        a(str, a10);
    }

    public boolean c(String str) {
        for (String str2 : this.f27619f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
