package com.fyber.inneractive.sdk.web;

import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public class m extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        IAlog.d("%s onConsoleMessage: %s", "IAwebChromeClient", consoleMessage.message());
        if (IAlog.f20222a >= 1) {
            IAlog.a(1, null, consoleMessage.message().replaceAll("%", "%%"), "VPAID");
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.d("%sonJsAlert: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.d("%sonJsBeforeUnload: %s", "IAwebChromeClient", str2);
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        IAlog.d("%sonJsConfirm: %s", "IAwebChromeClient", str2);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        IAlog.d("%sonJsPrompt: %s", "IAwebChromeClient", str2);
        jsPromptResult.cancel();
        return true;
    }
}
