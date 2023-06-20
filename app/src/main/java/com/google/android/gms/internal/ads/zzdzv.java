package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzv implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdzv(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffz zzffzVar = zzffz.WEBVIEW_COOKIE;
        zzffw zzi = zzffp.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaH));
            }
        }, zzffzVar, (zzfgf) this.zza.zzb()).zzi(1L, TimeUnit.SECONDS);
        final zzdzt zzdztVar = new zzffi() { // from class: com.google.android.gms.internal.ads.zzdzt
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzffs
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfvc.zzi("");
            }
        }).zza();
    }
}
