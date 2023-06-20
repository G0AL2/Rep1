package com.amazon.device.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public class DTBAdViewSupportClient extends WebViewClient {
    static final String AMAZON_APP_STORE_LINK = "https://www.amazon.com/gp/mas/dl/android?";
    static final String AMAZON_SCHEME = "amzn";
    static final String GOOGLE_PLAY_STORE_LINK = "https://play.google.com/store/apps/";
    static final String LOG_TAG = DTBAdViewSupportClient.class.getSimpleName();
    static final String MARKET_SCHEME = "market";
    static final String MOBILE_SHOPPING_SCHEME = "com.amazon.mobile.shopping";
    static final String MOBILE_SHOPPING_WEB_SCHEME = "com.amazon.mobile.shopping.web";
    Context context;
    DTBAdMRAIDController controller;

    public DTBAdViewSupportClient(Context context, DTBAdMRAIDController dTBAdMRAIDController) {
        this.context = context;
        this.controller = dTBAdMRAIDController;
    }

    private WebResourceResponse createImageInjectionResponse(String str) {
        try {
            return new WebResourceResponse("image/png", "UTF-8", this.context.getAssets().open(str));
        } catch (IOException unused) {
            String str2 = LOG_TAG;
            DtbLog.error(str2, "Failed to get injection response: " + str);
            return null;
        }
    }

    private boolean matchesLocalInjectionUrl(String str) {
        return ImagesContract.LOCAL.equals(Uri.parse(str.toLowerCase(Locale.US)).getScheme());
    }

    private boolean openUrl(String str) {
        Intent intent;
        int i10;
        Uri parse = Uri.parse(str);
        PackageManager packageManager = this.context.getPackageManager();
        try {
            try {
                if (MOBILE_SHOPPING_WEB_SCHEME.equals(parse.getScheme())) {
                    int indexOf = str.indexOf("//");
                    if (indexOf < 0 || (i10 = indexOf + 2) >= str.length()) {
                        return false;
                    }
                    String substring = str.substring(i10);
                    AdRegistration.getCurrentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://" + substring)));
                    this.controller.onAdLeftApplication();
                    return true;
                } else if (MOBILE_SHOPPING_SCHEME.equals(parse.getScheme())) {
                    if (packageManager.getLaunchIntentForPackage("com.amazon.mShop.android.shopping") != null) {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(parse);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(parse);
                        int indexOf2 = str.indexOf("products/");
                        if (indexOf2 > 0) {
                            intent2.setData(Uri.parse("https://www.amazon.com/dp/" + str.substring(indexOf2 + 9)));
                        }
                        intent = intent2;
                    }
                    AdRegistration.getCurrentActivity().startActivity(intent);
                    this.controller.onAdLeftApplication();
                    return true;
                } else {
                    if (!"market".equals(parse.getScheme()) && !AMAZON_SCHEME.equals(parse.getScheme())) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(parse);
                        AdRegistration.getCurrentActivity().startActivity(intent3);
                        this.controller.onAdLeftApplication();
                        return true;
                    }
                    try {
                        try {
                            Intent intent4 = new Intent("android.intent.action.VIEW");
                            intent4.setData(parse);
                            AdRegistration.getCurrentActivity().startActivity(intent4);
                            this.controller.onAdLeftApplication();
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            DTBAdUtil.directAppStoreLinkToBrowser(this.controller, parse);
                            return true;
                        }
                    } catch (ActivityNotFoundException unused2) {
                        DtbLog.debug(LOG_TAG, "App stores and browsers not found");
                        return false;
                    }
                }
            } catch (ActivityNotFoundException unused3) {
                DtbLog.error(LOG_TAG, "Activity not found com.amazon.mobile.shopping");
                return false;
            }
        } catch (NullPointerException unused4) {
            DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    @Deprecated
    public void onLoadResource(WebView webView, String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Load Resource:" + str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        try {
            String str2 = LOG_TAG;
            DtbLog.debug(str2, "Page finished:" + str);
            if (webView instanceof DTBAdView) {
                if (str.contains("MRAID_ENV")) {
                    this.controller.onPageLoad();
                } else if (str.equals("https://c.amazon-adsystem.com/")) {
                    this.controller.onPageLoad();
                }
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute onPageFinished method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute onPageFinished method", e10);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                this.controller.onLoadError(webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            } else {
                this.controller.onLoadError();
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute onReceivedError method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute onReceivedError method", e10);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Should intercept Resource url: " + str);
        if (matchesLocalInjectionUrl(str)) {
            return createImageInjectionResponse(str.substring(str.lastIndexOf(47) + 1));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            if (this.controller.isTwoPartExpand()) {
                return false;
            }
            return openUrl(str);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute shouldOverrideUrlLoading method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute shouldOverrideUrlLoading method", e10);
            return false;
        }
    }
}
