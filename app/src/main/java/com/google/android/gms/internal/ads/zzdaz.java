package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdaz {
    private final zzfgf zza;
    private final zzcfo zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgqo zzg;
    private final String zzh;
    private final zzetj zzi;

    public zzdaz(zzfgf zzfgfVar, zzcfo zzcfoVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgqo zzgqoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzetj zzetjVar) {
        this.zza = zzfgfVar;
        this.zzb = zzcfoVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgqoVar;
        this.zzh = str2;
        this.zzi = zzetjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbzv zza(zzfvl zzfvlVar) throws Exception {
        return new zzbzv((Bundle) zzfvlVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfvl) this.zzg.zzb()).get(), this.zzh, null, null);
    }

    public final zzfvl zzb() {
        zzfgf zzfgfVar = this.zza;
        return zzffp.zzc(this.zzi.zza(new Bundle()), zzffz.SIGNALS, zzfgfVar).zza();
    }

    public final zzfvl zzc() {
        final zzfvl zzb = zzb();
        return this.zza.zza(zzffz.REQUEST_PARCEL, zzb, (zzfvl) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzday
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdaz.this.zza(zzb);
            }
        }).zza();
    }
}
