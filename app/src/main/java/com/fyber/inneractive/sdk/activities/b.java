package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class b extends WebChromeClient {
    public b(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i10) {
        Activity activity = (Activity) webView.getContext();
        activity.setTitle("Page is Loading...");
        activity.setProgress(i10 * 100);
        if (i10 == 100) {
            activity.setTitle(webView.getUrl());
        }
    }
}
