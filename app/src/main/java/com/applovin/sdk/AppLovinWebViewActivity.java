package com.applovin.sdk;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinWebViewActivity extends Activity {
    public static final String EVENT_DISMISSED_VIA_BACK_BUTTON = "dismissed_via_back_button";
    public static final String INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON = "immersive_mode_on";
    public static final String INTENT_EXTRA_KEY_SDK_KEY = "sdk_key";

    /* renamed from: a  reason: collision with root package name */
    private String f9094a;

    /* renamed from: b  reason: collision with root package name */
    private WebView f9095b;

    /* renamed from: c  reason: collision with root package name */
    private EventListener f9096c;

    /* loaded from: classes.dex */
    public interface EventListener {
        void onReceivedEvent(String str);
    }

    public void loadUrl(String str, EventListener eventListener) {
        this.f9096c = eventListener;
        WebView webView = this.f9095b;
        if (webView == null) {
            this.f9094a = str;
        } else {
            webView.loadUrl(str);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        EventListener eventListener = this.f9096c;
        if (eventListener != null) {
            eventListener.onReceivedEvent(EVENT_DISMISSED_VIA_BACK_BUTTON);
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(INTENT_EXTRA_KEY_SDK_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            if (v.a()) {
                v.i("AppLovinWebViewActivity", "No SDK key specified");
            }
            finish();
            return;
        }
        final m mVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(getApplicationContext()), getApplicationContext()).coreSdk;
        WebView tryToCreateWebView = Utils.tryToCreateWebView(this, "WebView Activity");
        this.f9095b = tryToCreateWebView;
        if (tryToCreateWebView == null) {
            finish();
            return;
        }
        setContentView(tryToCreateWebView);
        WebSettings settings = this.f9095b.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        this.f9095b.setVerticalScrollBarEnabled(true);
        this.f9095b.setHorizontalScrollBarEnabled(true);
        this.f9095b.setScrollBarStyle(33554432);
        this.f9095b.setWebViewClient(new WebViewClient() { // from class: com.applovin.sdk.AppLovinWebViewActivity.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                if (v.a()) {
                    v A = mVar.A();
                    A.b("AppLovinWebViewActivity", "Handling url load: " + str);
                }
                if ("applovin".equalsIgnoreCase(scheme) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(host) && AppLovinWebViewActivity.this.f9096c != null) {
                    if (path.endsWith("webview_event")) {
                        Set<String> queryParameterNames = parse.getQueryParameterNames();
                        String str2 = queryParameterNames.isEmpty() ? "" : (String) queryParameterNames.toArray()[0];
                        if (!StringUtils.isValidString(str2)) {
                            if (v.a()) {
                                mVar.A().e("AppLovinWebViewActivity", "Failed to parse WebView event parameter");
                                return true;
                            }
                            return true;
                        }
                        String queryParameter = parse.getQueryParameter(str2);
                        if (v.a()) {
                            v A2 = mVar.A();
                            A2.b("AppLovinWebViewActivity", "Parsed WebView event parameter name: " + str2 + " and value: " + queryParameter);
                        }
                        AppLovinWebViewActivity.this.f9096c.onReceivedEvent(queryParameter);
                        return true;
                    }
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        if (getIntent().getBooleanExtra(INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, false)) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (StringUtils.isValidString(this.f9094a)) {
            this.f9095b.loadUrl(this.f9094a);
        }
    }
}
