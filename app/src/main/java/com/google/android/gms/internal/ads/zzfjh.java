package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfjh implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjh(zzfji zzfjiVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
