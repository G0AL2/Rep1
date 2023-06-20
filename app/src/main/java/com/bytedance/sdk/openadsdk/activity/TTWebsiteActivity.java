package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.common.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.q;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TTWebsiteActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private String f10922a = null;

    /* renamed from: b  reason: collision with root package name */
    private e f10923b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        final String stringExtra = getIntent().getStringExtra("metaString");
        setContentView(t.f(this, "tt_activity_website"));
        final WebView webView = (WebView) findViewById(t.e(this, "tt_ad_website"));
        final ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_close"));
        final ProgressBar progressBar = (ProgressBar) findViewById(t.e(this, "tt_titlebar_browser_progress"));
        ((ImageView) findViewById(t.e(this, "tt_titlebar_back"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (webView.canGoBack()) {
                    webView.goBack();
                } else {
                    TTWebsiteActivity.this.finish();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.this.finish();
            }
        });
        imageView.setVisibility(4);
        imageView.setClickable(false);
        ((TextView) findViewById(t.e(this, "tt_titlebar_title"))).setText(t.a(this, "tt_privacy_title"));
        ((ImageView) findViewById(t.e(this, "tt_titlebar_go_to_webview"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                String url = webView.getUrl();
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                intent.setData(Uri.parse(url));
                b.a(TTWebsiteActivity.this, intent, null);
            }
        });
        ((ImageView) findViewById(t.e(this, "tt_titlebar_debug_info"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TTWebsiteActivity.this.f10923b == null) {
                    TTWebsiteActivity.this.f10923b = new e(TTWebsiteActivity.this);
                    TTWebsiteActivity.this.f10923b.a(stringExtra);
                    TTWebsiteActivity.this.f10923b.setCanceledOnTouchOutside(false);
                }
                TTWebsiteActivity.this.f10923b.show();
            }
        });
        if (m.h() != null) {
            this.f10922a = m.h().s();
        }
        l.e("TTWebsiteActivity", "mWebsiteUrl=" + this.f10922a);
        if (this.f10922a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                webView.getSettings().setMixedContentMode(0);
            }
            try {
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setSavePassword(false);
                webView.getSettings().setAllowFileAccess(false);
            } catch (Throwable unused) {
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
            try {
                webView.loadUrl(this.f10922a, hashMap);
            } catch (Throwable unused2) {
                webView.loadUrl(this.f10922a);
            }
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.5
                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView2, int i10) {
                    super.onProgressChanged(webView2, i10);
                    if (progressBar == null || TTWebsiteActivity.this.isFinishing()) {
                        return;
                    }
                    if (i10 == 100) {
                        progressBar.setVisibility(8);
                        if (webView2.canGoBack()) {
                            imageView.setVisibility(0);
                            imageView.setClickable(true);
                            return;
                        }
                        imageView.setVisibility(4);
                        imageView.setClickable(false);
                        return;
                    }
                    progressBar.setVisibility(0);
                    progressBar.setProgress(i10);
                }
            });
            webView.setWebViewClient(new SSWebView.a() { // from class: com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity.6
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    super.onPageFinished(webView2, str);
                    l.e("TTWebsiteActivity", "onPageFinished invoke....url=" + str);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView2, webResourceRequest, webResourceError);
                    l.e("TTWebsiteActivity", "onReceivedError invoke....onReceivedError=" + webResourceError.getErrorCode());
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView2, webResourceRequest, webResourceResponse);
                    l.e("TTWebsiteActivity", "onReceivedHttpError invoke....errorResponse=" + webResourceResponse);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                    l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....view=" + webView2 + ",request=" + webResourceRequest);
                    if (webView2 == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView2.loadUrl(webResourceRequest.getUrl().toString());
                        l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url1=" + webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView2.loadUrl(webResourceRequest.toString());
                    l.e("TTWebsiteActivity", "shouldOverrideUrlLoading invoke....url2=" + webResourceRequest.toString());
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView2, int i10, String str, String str2) {
                    super.onReceivedError(webView2, i10, str, str2);
                    l.e("TTWebsiteActivity", "onReceivedError invoke....description=" + str + ",failingUrl=" + str2);
                }
            });
            q.a(webView);
            return;
        }
        finish();
    }

    public static void a(Context context, n nVar, String str) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.b.e.b(context, nVar, str, "open_policy");
        if (TextUtils.isEmpty(m.h().s())) {
            return;
        }
        String jSONObject = nVar != null ? nVar.ar().toString() : "";
        Intent intent = new Intent(context, TTWebsiteActivity.class);
        intent.putExtra("metaString", jSONObject);
        b.a(context, intent, null);
    }
}
