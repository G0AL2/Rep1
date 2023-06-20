package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfip {
    private final zzfiw zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    private final String zzf;
    private final zzfiq zzg;

    private zzfip(zzfiw zzfiwVar, WebView webView, String str, List list, String str2, String str3, zzfiq zzfiqVar) {
        this.zza = zzfiwVar;
        this.zzb = webView;
        this.zzg = zzfiqVar;
        this.zzf = str2;
    }

    public static zzfip zzb(zzfiw zzfiwVar, WebView webView, String str, String str2) {
        return new zzfip(zzfiwVar, webView, null, null, str, "", zzfiq.HTML);
    }

    public static zzfip zzc(zzfiw zzfiwVar, WebView webView, String str, String str2) {
        return new zzfip(zzfiwVar, webView, null, null, str, "", zzfiq.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfiq zzd() {
        return this.zzg;
    }

    public final zzfiw zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
