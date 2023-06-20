package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;

/* loaded from: assets/audience_network.dex */
public class O5 extends WebViewClient {
    public final /* synthetic */ O6 A00;

    public O5(O6 o62) {
        this.A00 = o62;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C07828z.A2e);
        return true;
    }
}
