package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class e1 extends j3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Context context, String str, h1 h1Var, k3 k3Var, com.chartboost.sdk.d dVar, Handler handler, String str2) {
        super(context, k3Var);
        qe.k.f(context, "context");
        qe.k.f(h1Var, "callback");
        qe.k.f(k3Var, "viewBaseCallback");
        qe.k.f(dVar, "protocol");
        qe.k.f(handler, "uiHandler");
        setFocusable(false);
        o1 a10 = o1.a();
        this.f14099d = (RelativeLayout) a10.a(new RelativeLayout(context));
        this.f14097b = (y0) a10.a(new y0(context));
        com.chartboost.sdk.f.c(context);
        this.f14097b.setWebViewClient((WebViewClient) a10.a(new g1(context, h1Var)));
        w0 w0Var = (w0) a10.a(new w0(this.f14099d, null, dVar, handler));
        this.f14098c = w0Var;
        this.f14097b.setWebChromeClient(w0Var);
        b();
        if (str != null) {
            this.f14097b.loadDataWithBaseURL(str2, str, "text/html", "utf-8", null);
        } else {
            dVar.c("Html is null");
        }
        if (this.f14097b.getSettings() != null) {
            this.f14097b.getSettings().setSupportZoom(false);
        }
        this.f14099d.addView(this.f14097b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f14097b.setLayoutParams(layoutParams);
        this.f14097b.setBackgroundColor(0);
        this.f14099d.setLayoutParams(layoutParams);
    }

    private final void b() {
        if (l.b().a(19)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }
}
