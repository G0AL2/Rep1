package com.ironsource.sdk.b;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes3.dex */
public class c extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    private static final String f27623b = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final e.a f27624a;

    public c(e.a aVar) {
        this.f27624a = aVar;
    }

    private static String a(String str, String str2) {
        return "ISNAdViewWebClient | External Adunit failed to load." + str + " Status code: " + str2;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        try {
            this.f27624a.a(a("onReceivedError", String.valueOf(i10)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        try {
            this.f27624a.a(a("onReceivedErrorM", String.valueOf(webResourceError.getErrorCode())));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f27624a.a(a("onReceivedHttpError", Build.VERSION.SDK_INT >= 21 ? String.valueOf(webResourceResponse.getStatusCode()) : ""));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            String str = f27623b;
            Logger.e(str, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            this.f27624a.b(renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system");
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }
}
