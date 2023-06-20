package com.ironsource.sdk.controller;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements com.ironsource.sdk.b.a {

    /* renamed from: a  reason: collision with root package name */
    y f27701a;

    /* renamed from: b  reason: collision with root package name */
    private com.ironsource.sdk.c.d f27702b = com.ironsource.sdk.c.d.a();

    /* renamed from: c  reason: collision with root package name */
    private c f27703c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0345a {

        /* renamed from: a  reason: collision with root package name */
        String f27704a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f27705b;

        /* renamed from: c  reason: collision with root package name */
        String f27706c;

        /* renamed from: d  reason: collision with root package name */
        String f27707d;

        private C0345a() {
        }

        /* synthetic */ C0345a(byte b10) {
            this();
        }
    }

    public a(c cVar) {
        this.f27703c = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, x.d.a aVar) {
        JSONObject jSONObject = new JSONObject(str);
        C0345a c0345a = new C0345a((byte) 0);
        c0345a.f27704a = jSONObject.optString("functionName");
        c0345a.f27705b = jSONObject.optJSONObject("functionParams");
        c0345a.f27706c = jSONObject.optString("success");
        c0345a.f27707d = jSONObject.optString("fail");
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        try {
            String str2 = c0345a.f27704a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals("removeAdView")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1491535759:
                    if (str2.equals("webviewAction")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                final com.ironsource.sdk.c.d dVar = this.f27702b;
                final JSONObject jSONObject2 = c0345a.f27705b;
                final Activity a10 = this.f27703c.a();
                final String str3 = c0345a.f27706c;
                final String str4 = c0345a.f27707d;
                final String string = jSONObject2.getString("adViewId");
                if (string.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "loadWithUrl fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                }
                com.ironsource.sdk.a c11 = dVar.c(jSONObject2);
                if (dVar.f27659b.containsKey(string)) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "sendMessageToAd fail - collection already contain adViewId");
                    throw new Exception("collection already contain adViewId");
                }
                final com.ironsource.sdk.c.c cVar = new com.ironsource.sdk.c.c(this, a10, string, c11);
                cVar.f27643b = IronSourceStorageUtils.getNetworkStorageDir(a10.getApplicationContext());
                com.ironsource.environment.e.a aVar2 = com.ironsource.environment.e.a.f26152a;
                aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (cVar.f27644c != null) {
                            com.ironsource.sdk.a.d.a(f.f27596n, new com.ironsource.sdk.a.a().a("callfailreason", "loadWithUrl | webView is not null").f27575a);
                        }
                        try {
                            c.e(cVar, str4);
                            cVar.f27644c.loadUrl(c.g(cVar, jSONObject2.getString("urlForWebView")));
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("adViewId", cVar.f27642a);
                            cVar.f27645d.a(str3, jSONObject3);
                        } catch (Exception e10) {
                            cVar.b(str4, e10.getMessage());
                            com.ironsource.sdk.a.d.a(f.f27596n, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f27575a);
                        }
                    }
                });
                if (com.ironsource.sdk.c.d.b(jSONObject2)) {
                    aVar2.a(new Runnable() { // from class: com.ironsource.sdk.c.d.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            dVar.f27659b.put(string, new a(cVar, a10.getApplicationContext()));
                        }
                    });
                } else {
                    dVar.f27659b.put(string, cVar);
                }
            } else if (c10 == 1) {
                com.ironsource.sdk.c.d dVar2 = this.f27702b;
                JSONObject jSONObject3 = c0345a.f27705b;
                String str5 = c0345a.f27706c;
                String str6 = c0345a.f27707d;
                String string2 = new JSONObject(jSONObject3.getString("params")).getString("adViewId");
                if (string2.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "sendMessageToAd fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar2.f27659b.containsKey(string2)) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "sendMessageToAd fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    com.ironsource.sdk.c.e eVar = dVar2.f27659b.get(string2);
                    if (eVar != null) {
                        eVar.b(jSONObject3, str5, str6);
                    }
                }
            } else if (c10 == 2) {
                com.ironsource.sdk.c.d dVar3 = this.f27702b;
                JSONObject jSONObject4 = c0345a.f27705b;
                String str7 = c0345a.f27706c;
                String str8 = c0345a.f27707d;
                String string3 = jSONObject4.getString("adViewId");
                if (string3.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar3.f27659b.containsKey(string3)) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    com.ironsource.sdk.c.e eVar2 = dVar3.f27659b.get(string3);
                    dVar3.f27659b.remove(string3);
                    if (eVar2 != null) {
                        eVar2.a(str7, str8);
                    }
                }
            } else if (c10 == 3) {
                com.ironsource.sdk.c.d dVar4 = this.f27702b;
                JSONObject jSONObject5 = c0345a.f27705b;
                String str9 = c0345a.f27706c;
                String str10 = c0345a.f27707d;
                String string4 = jSONObject5.getString("adViewId");
                if (string4.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "removeAdView fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar4.f27659b.containsKey(string4)) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "removeAdView fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    com.ironsource.sdk.c.e eVar3 = dVar4.f27659b.get(string4);
                    if (eVar3 != null) {
                        eVar3.a(jSONObject5, str9, str10);
                    }
                }
            } else if (c10 != 4) {
                throw new IllegalArgumentException(String.format("%s | unsupported AdViews API", c0345a.f27704a));
            } else {
                com.ironsource.sdk.c.d dVar5 = this.f27702b;
                JSONObject jSONObject6 = c0345a.f27705b;
                String str11 = c0345a.f27706c;
                String str12 = c0345a.f27707d;
                String string5 = jSONObject6.getString("adViewId");
                if (string5.isEmpty()) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "performWebViewAction fail - adViewId is empty");
                    throw new Exception("adViewId is empty");
                } else if (!dVar5.f27659b.containsKey(string5)) {
                    Logger.i(com.ironsource.sdk.c.d.f27657a, "performWebViewAction fail - collection does not contain adViewId");
                    throw new Exception("collection does not contain adViewId");
                } else {
                    com.ironsource.sdk.c.e eVar4 = dVar5.f27659b.get(string5);
                    String string6 = jSONObject6.getString("actionName");
                    if (eVar4 != null) {
                        eVar4.a(string6, str11, str12);
                    }
                }
            }
        } catch (Exception e10) {
            fVar.a("errMsg", e10.getMessage());
            String a11 = com.ironsource.sdk.c.d.a(c0345a.f27705b);
            if (!TextUtils.isEmpty(a11)) {
                fVar.a("adViewId", a11);
            }
            aVar.a(false, c0345a.f27707d, fVar);
        }
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, String str2, String str3) {
        a(str, a.AnonymousClass1.b(str2, str3));
    }

    @Override // com.ironsource.sdk.b.a
    public final void a(String str, JSONObject jSONObject) {
        if (this.f27701a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f27701a.a(str, jSONObject);
    }
}
