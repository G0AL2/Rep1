package com.applovin.impl.adview;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7026a;

    /* renamed from: b  reason: collision with root package name */
    private final b f7027b;

    public c(b bVar, com.applovin.impl.sdk.m mVar) {
        this.f7026a = mVar.A();
        this.f7027b = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7026a;
            vVar.d("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (com.applovin.impl.sdk.v.a()) {
            this.f7026a.b("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7026a;
            vVar.d("AdWebView", "Alert attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7026a;
            vVar.d("AdWebView", "JS onBeforeUnload attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f7026a;
            vVar.d("AdWebView", "JS confirm attempted: " + str2);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        b bVar;
        if (i10 != 100 || (bVar = this.f7027b) == null) {
            return;
        }
        bVar.a(webView);
    }
}
