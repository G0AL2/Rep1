package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.bytedance.sdk.component.widget.SSWebView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: DynamicJsParser.java */
/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: e  reason: collision with root package name */
    private static String f9650e;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f9651f = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill")));

    /* renamed from: a  reason: collision with root package name */
    private Context f9652a;

    /* renamed from: b  reason: collision with root package name */
    private SSWebView f9653b;

    /* renamed from: c  reason: collision with root package name */
    private String f9654c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.d.b f9655d;

    /* compiled from: DynamicJsParser.java */
    /* loaded from: classes.dex */
    private class a {
        private a() {
        }

        @JavascriptInterface
        public void calculateResult(String str) {
            f.this.b(str);
        }

        @JavascriptInterface
        public String getDomSizeFromNative(String str, String str2, String str3, boolean z10, boolean z11, int i10) {
            return l.b(str, str2, str3, z10, z11, i10);
        }

        @JavascriptInterface
        public String jsCoreGlobal() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", com.bytedance.sdk.component.adexpress.c.b.b(f.this.f9652a, com.bytedance.sdk.component.adexpress.c.b.a(f.this.f9652a)));
                jSONObject.put("height", com.bytedance.sdk.component.adexpress.c.b.b(f.this.f9652a, com.bytedance.sdk.component.adexpress.c.b.b(f.this.f9652a)));
                jSONObject.put("os", "Android");
            } catch (Exception unused) {
            }
            return jSONObject.toString();
        }

        @JavascriptInterface
        public double systemFontSizeRatioNative() {
            return 1.2d;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public f(Context context, String str) {
        this.f9652a = context;
        this.f9654c = str;
        SSWebView sSWebView = new SSWebView(this.f9652a);
        this.f9653b = sSWebView;
        sSWebView.setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f9653b.a(new a(), "JS_DYNAMIC_LAYOUT_OBJ");
        }
        this.f9653b.a("about:blank");
        a();
    }

    private void c() {
        try {
            String f10 = f();
            String h10 = h();
            if (TextUtils.isEmpty(h10)) {
                b();
            } else {
                SSWebView sSWebView = this.f9653b;
                sSWebView.a(f10 + h10, (ValueCallback<String>) null);
            }
        } catch (Throwable unused) {
            b();
        }
    }

    private void d() {
        String str = "javascript:var res = getLayoutInfo(" + this.f9654c + ");window.JS_DYNAMIC_LAYOUT_OBJ.calculateResult(JSON.stringify(res));";
        SSWebView sSWebView = this.f9653b;
        if (sSWebView != null) {
            com.bytedance.sdk.component.utils.k.a(sSWebView.getWebView(), str);
        }
    }

    private static String e() {
        String str;
        if (TextUtils.isEmpty(f9650e)) {
            return null;
        }
        String f10 = f();
        if (i()) {
            str = "(function () {var se = document.createElement('script');se.type = 'text/javascript';se.src = '" + ("file//" + com.bytedance.sdk.component.adexpress.a.b.b.f() + "/" + com.bytedance.sdk.component.utils.e.a(f9650e)) + "';document.body.appendChild(se);})();";
        } else {
            str = "(function () {var JS_TTDYNAMIC_URL = '" + f9650e + "';var xhrObj = new XMLHttpRequest();xhrObj.open('GET', JS_TTDYNAMIC_URL, false);xhrObj.send('');var se = document.createElement('script');se.type = 'text/javascript';se.text = xhrObj.responseText;document.getElementsByTagName('head')[0].appendChild(se);})();";
        }
        return "javascript:" + f10 + str;
    }

    private static String f() {
        return "var global = Function('return this')();global.jsCoreGlobal = {width:" + com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b())) + ",height:" + com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b(), com.bytedance.sdk.component.adexpress.c.b.b(com.bytedance.sdk.component.adexpress.a.a.a.a().c().b())) + ",os:'Android'};global.systemFontSizeRatioNative = 1.2;";
    }

    private void g() {
        com.bytedance.sdk.component.utils.h.b().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.c.f.1
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f9653b != null) {
                    f.this.f9653b.l();
                }
                f.this.f9653b = null;
            }
        });
    }

    private String h() {
        try {
            return a(new FileInputStream(com.bytedance.sdk.component.adexpress.a.b.b.f() + "/" + com.bytedance.sdk.component.utils.e.a(f9650e)));
        } catch (IOException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static boolean i() {
        if (TextUtils.isEmpty(f9650e)) {
            return false;
        }
        String a10 = com.bytedance.sdk.component.utils.e.a(f9650e);
        if (TextUtils.isEmpty(a10)) {
            return false;
        }
        return new File(com.bytedance.sdk.component.adexpress.a.b.b.f(), a10).exists();
    }

    private void b() {
        SSWebView sSWebView;
        String e10 = e();
        if (TextUtils.isEmpty(e10) || (sSWebView = this.f9653b) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.k.a(sSWebView.getWebView(), e10);
    }

    public static void a(String str) {
        f9650e = str;
    }

    private void a() {
        if (i() && Build.VERSION.SDK_INT >= 19) {
            c();
        } else {
            b();
        }
        b();
    }

    private String b(com.bytedance.sdk.component.adexpress.b.l lVar) {
        return lVar == null ? "" : lVar.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        com.bytedance.sdk.component.adexpress.dynamic.b.h hVar = new com.bytedance.sdk.component.adexpress.dynamic.b.h();
        try {
            com.bytedance.sdk.component.adexpress.dynamic.b.h.a(new JSONObject(str), hVar, null);
        } catch (Exception unused) {
            hVar = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.d.b bVar = this.f9655d;
        if (bVar != null) {
            bVar.a(hVar);
        }
        g();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c.i
    public void a(com.bytedance.sdk.component.adexpress.dynamic.d.b bVar) {
        this.f9655d = bVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.c.i
    public void a(com.bytedance.sdk.component.adexpress.b.l lVar) {
        com.bytedance.sdk.component.adexpress.dynamic.d.b bVar;
        if (TextUtils.isEmpty(f9650e) && (bVar = this.f9655d) != null) {
            bVar.a(null);
            g();
        }
        l.b(b(lVar));
        d();
    }

    public String a(InputStream inputStream) {
        BufferedReader bufferedReader;
        try {
            StringBuilder sb2 = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.bytedance.sdk.component.utils.l.a("TemplateToModelParser", "readStream error", th);
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                com.bytedance.sdk.component.utils.l.a("TemplateToModelParser", "br error", th2);
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                com.bytedance.sdk.component.utils.l.a("TemplateToModelParser", "is error", th3);
                            }
                        }
                    }
                }
            }
            String sb3 = sb2.toString();
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                com.bytedance.sdk.component.utils.l.a("TemplateToModelParser", "br error", th4);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th5) {
                    com.bytedance.sdk.component.utils.l.a("TemplateToModelParser", "is error", th5);
                }
            }
            return sb3;
        } catch (Throwable th6) {
            th = th6;
            bufferedReader = null;
        }
    }
}
