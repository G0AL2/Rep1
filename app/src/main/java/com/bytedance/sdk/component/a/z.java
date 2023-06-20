package com.bytedance.sdk.component.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* compiled from: WebViewBridge.java */
/* loaded from: classes.dex */
public class z extends a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ boolean f9315j = true;

    /* renamed from: h  reason: collision with root package name */
    protected String f9316h;

    /* renamed from: i  reason: collision with root package name */
    protected WebView f9317i;

    @Override // com.bytedance.sdk.component.a.a
    protected Context a(j jVar) {
        Context context = jVar.f9247e;
        if (context != null) {
            return context;
        }
        WebView webView = jVar.f9243a;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.a.a
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    protected void b(j jVar) {
        this.f9317i = jVar.f9243a;
        this.f9316h = jVar.f9245c;
        if (Build.VERSION.SDK_INT < 17 || jVar.f9256n) {
            return;
        }
        c();
    }

    @SuppressLint({"AddJavascriptInterface"})
    protected void c() {
        if (!f9315j && this.f9317i == null) {
            throw new AssertionError();
        }
        this.f9317i.addJavascriptInterface(this, this.f9316h);
    }

    protected void d() {
        this.f9317i.removeJavascriptInterface(this.f9316h);
    }

    @Override // com.bytedance.sdk.component.a.a
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @Override // com.bytedance.sdk.component.a.a
    protected String a() {
        return this.f9317i.getUrl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.a.a
    public void b() {
        super.b();
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.a.a
    public void a(String str, q qVar) {
        if (qVar != null && !TextUtils.isEmpty(qVar.f9267h)) {
            String str2 = qVar.f9267h;
            a(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.a(str, qVar);
    }

    @Override // com.bytedance.sdk.component.a.a
    protected void a(String str) {
        a(str, "javascript:" + this.f9316h + "._handleMessageFromToutiao(" + str + ")");
    }

    private void a(String str, final String str2) {
        if (this.f9210f || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.a.z.1
            @Override // java.lang.Runnable
            public void run() {
                if (z.this.f9210f) {
                    return;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 19) {
                        i.a("Invoking Jsb using evaluateJavascript: " + str2);
                        z.this.f9317i.evaluateJavascript(str2, null);
                    } else {
                        i.a("Invoking Jsb using loadUrl: " + str2);
                        z.this.f9317i.loadUrl(str2);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            i.a("Received call on sub-thread, posting to main thread: " + str2);
            this.f9208d.post(runnable);
            return;
        }
        runnable.run();
    }
}
