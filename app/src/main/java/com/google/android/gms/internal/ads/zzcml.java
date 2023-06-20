package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzcml extends zzclp {
    public zzcml(zzcli zzcliVar, zzbdm zzbdmVar, boolean z10) {
        super(zzcliVar, zzbdmVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzM(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcli)) {
            zzcfi.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcli zzcliVar = (zzcli) webView;
        zzccj zzccjVar = this.zza;
        if (zzccjVar != null) {
            zzccjVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcliVar.zzP() != null) {
            zzcliVar.zzP().zzD();
        }
        if (zzcliVar.zzQ().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzM);
        } else if (zzcliVar.zzaC()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzL);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzK);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzu(zzcliVar.getContext(), zzcliVar.zzp().zza, str2);
    }
}
