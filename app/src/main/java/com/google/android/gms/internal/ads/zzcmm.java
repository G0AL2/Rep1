package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcmm extends zzcml {
    public zzcmm(zzcli zzcliVar, zzbdm zzbdmVar, boolean z10) {
        super(zzcliVar, zzbdmVar, z10);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzM(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
