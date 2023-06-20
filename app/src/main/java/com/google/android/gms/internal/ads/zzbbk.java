package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbk implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbbc zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbbm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbk(zzbbm zzbbmVar, final zzbbc zzbbcVar, final WebView webView, final boolean z10) {
        this.zze = zzbbmVar;
        this.zzb = zzbbcVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbbj
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzbbk zzbbkVar = zzbbk.this;
                zzbbc zzbbcVar2 = zzbbcVar;
                WebView webView2 = webView;
                boolean z11 = z10;
                zzbbkVar.zze.zzd(zzbbcVar2, webView2, (String) obj, z11);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
