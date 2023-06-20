package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: g  reason: collision with root package name */
    private static final String f27641g = "c";

    /* renamed from: a  reason: collision with root package name */
    final String f27642a;

    /* renamed from: b  reason: collision with root package name */
    public String f27643b;

    /* renamed from: c  reason: collision with root package name */
    WebView f27644c;

    /* renamed from: d  reason: collision with root package name */
    public com.ironsource.sdk.b.b f27645d;

    /* renamed from: e  reason: collision with root package name */
    public com.ironsource.sdk.a f27646e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f27647f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27652a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27653b;

        a(String str, String str2) {
            this.f27652a = str;
            this.f27653b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (c.this.f27644c != null) {
                    c.this.f27644c.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", c.this.f27642a);
                if (c.this.f27645d != null) {
                    c.this.f27645d.a(this.f27652a, jSONObject);
                    com.ironsource.sdk.b.b bVar = c.this.f27645d;
                    bVar.f27614a = null;
                    bVar.f27615b = null;
                }
                c.c(c.this, null);
                c.a(c.this, (Activity) null);
            } catch (Exception e10) {
                String str = c.f27641g;
                Log.e(str, "performCleanup | could not destroy ISNAdView webView ID: " + c.this.f27642a);
                com.ironsource.sdk.a.d.a(f.f27597o, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f27575a);
                c.this.b(this.f27653b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f27655a;

        b(String str) {
            this.f27655a = str;
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void a(String str) {
            String str2 = c.f27641g;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            c.this.b(this.f27655a, str);
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void b(String str) {
            String str2 = c.f27641g;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) c.this.f27644c.getParent()).removeView(c.this.f27644c);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            c.this.i();
        }
    }

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, com.ironsource.sdk.a aVar2) {
        this.f27647f = activity;
        com.ironsource.sdk.b.b bVar = new com.ironsource.sdk.b.b();
        this.f27645d = bVar;
        bVar.f27617d = str;
        this.f27642a = str;
        bVar.f27614a = aVar;
        this.f27646e = aVar2;
    }

    static /* synthetic */ Activity a(c cVar, Activity activity) {
        cVar.f27647f = null;
        return null;
    }

    static /* synthetic */ com.ironsource.sdk.b.b c(c cVar, com.ironsource.sdk.b.b bVar) {
        cVar.f27645d = null;
        return null;
    }

    static /* synthetic */ void e(c cVar, String str) {
        Logger.i(f27641g, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.f27647f);
        cVar.f27644c = webView;
        webView.addJavascriptInterface(new com.ironsource.sdk.c.b(cVar), "containerMsgHandler");
        cVar.f27644c.setWebViewClient(new com.ironsource.sdk.b.c(new b(str)));
        com.ironsource.sdk.utils.d.a(cVar.f27644c);
        cVar.f27645d.f27616c = cVar.f27644c;
    }

    static /* synthetic */ String g(c cVar, String str) {
        if (str.startsWith(".")) {
            StringBuilder sb2 = new StringBuilder("file://");
            sb2.append(cVar.f27643b);
            String substring = str.substring(str.indexOf("/") + 1);
            sb2.append(substring.substring(substring.indexOf("/")));
            return sb2.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        a("", "");
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        if (this.f27647f == null) {
            return;
        }
        Logger.i(f27641g, "performCleanup");
        com.ironsource.environment.e.a.f26152a.a(new a(str, str2));
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        String str4 = f27641g;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.f27644c.onPause();
            } else if (!str.equals("onResume")) {
                b(str3, "action not supported");
                return;
            } else {
                this.f27644c.onResume();
            }
            this.f27645d.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f27645d.b(str);
        } catch (Exception e10) {
            String str3 = f27641g;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView b() {
        return this.f27644c;
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.b.b bVar = this.f27645d;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.f27645d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            String str3 = f27641g;
            Logger.i(str3, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        com.ironsource.sdk.b.b bVar = this.f27645d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e10) {
            String str2 = bVar.f27618e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e10.printStackTrace();
        }
    }
}
