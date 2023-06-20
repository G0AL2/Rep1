package com.facebook.ads.redexgen.X;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.Np  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1135Np implements View.OnClickListener {
    public final /* synthetic */ C1138Ns A00;

    public View$OnClickListenerC1135Np(C1138Ns c1138Ns) {
        this.A00 = c1138Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (L0.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A08;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A08;
            webView2.goForward();
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
