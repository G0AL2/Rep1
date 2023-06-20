package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class H5AdsWebViewClient extends zzbpd {
    private final zzbpq zza;

    public H5AdsWebViewClient(Context context, WebView webView) {
        this.zza = new zzbpq(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    protected WebViewClient getDelegate() {
        return this.zza;
    }

    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
