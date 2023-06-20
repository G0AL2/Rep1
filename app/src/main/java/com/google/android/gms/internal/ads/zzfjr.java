package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfjr implements Runnable {
    final /* synthetic */ zzfjs zza;
    private final WebView zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjr(zzfjs zzfjsVar) {
        WebView webView;
        this.zza = zzfjsVar;
        webView = zzfjsVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
