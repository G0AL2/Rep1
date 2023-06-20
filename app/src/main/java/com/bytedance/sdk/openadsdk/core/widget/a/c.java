package com.bytedance.sdk.openadsdk.core.widget.a;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.i;

/* compiled from: TTWebChromeClient.java */
/* loaded from: classes.dex */
public class c extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13108a = WebChromeClient.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final w f13109b;

    /* renamed from: c  reason: collision with root package name */
    private n f13110c;

    public c(w wVar, n nVar) {
        this.f13109b = wVar;
        this.f13110c = nVar;
    }

    private boolean a(String str) {
        try {
            Uri parse = Uri.parse(str);
            if ("bytedance".equals(parse.getScheme().toLowerCase())) {
                i.a(parse, this.f13109b);
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onConsoleMessage(String str, int i10, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
        super.onConsoleMessage(str, i10, str2);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        n nVar = this.f13110c;
        if (nVar != null) {
            nVar.a(webView, i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || TextUtils.isEmpty(consoleMessage.message()) || !a(consoleMessage.message())) {
            return super.onConsoleMessage(consoleMessage);
        }
        return true;
    }
}
