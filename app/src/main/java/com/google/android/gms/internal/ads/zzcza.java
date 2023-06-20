package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcza {
    private final zzeat zza;
    private final zzfcd zzb;
    private final zzfgf zzc;
    private final zzcsn zzd;
    private final zzeiv zze;
    private final zzdgx zzf;
    private zzfbx zzg;
    private final zzebx zzh;
    private final zzdaz zzi;
    private final Executor zzj;
    private final zzebk zzk;
    private final zzefi zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcza(zzeat zzeatVar, zzfcd zzfcdVar, zzfgf zzfgfVar, zzcsn zzcsnVar, zzeiv zzeivVar, zzdgx zzdgxVar, zzfbx zzfbxVar, zzebx zzebxVar, zzdaz zzdazVar, Executor executor, zzebk zzebkVar, zzefi zzefiVar) {
        this.zza = zzeatVar;
        this.zzb = zzfcdVar;
        this.zzc = zzfgfVar;
        this.zzd = zzcsnVar;
        this.zze = zzeivVar;
        this.zzf = zzdgxVar;
        this.zzg = zzfbxVar;
        this.zzh = zzebxVar;
        this.zzi = zzdazVar;
        this.zzj = executor;
        this.zzk = zzebkVar;
        this.zzl = zzefiVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfdc.zzb(th, this.zzl);
    }

    public final zzdgx zzc() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfbx zzd(zzfbx zzfbxVar) throws Exception {
        this.zzd.zza(zzfbxVar);
        return zzfbxVar;
    }

    public final zzfvl zze(final zzfdv zzfdvVar) {
        zzffk zza = this.zzc.zzb(zzffz.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfuj() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzcza.this.zzf(zzfdvVar, (zzbzv) obj);
            }
        }).zza();
        zzfvc.zzr(zza, new zzcyy(this), this.zzj);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzf(zzfdv zzfdvVar, zzbzv zzbzvVar) throws Exception {
        zzbzvVar.zzi = zzfdvVar;
        return this.zzh.zza(zzbzvVar);
    }

    public final zzfvl zzg(zzbzv zzbzvVar) {
        zzffk zza = this.zzc.zzb(zzffz.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbzvVar)).zza();
        zzfvc.zzr(zza, new zzcyz(this), this.zzj);
        return zza;
    }

    public final zzfvl zzh(zzfvl zzfvlVar) {
        zzffw zzf = this.zzc.zzb(zzffz.RENDERER, zzfvlVar).zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                zzfbx zzfbxVar = (zzfbx) obj;
                zzcza.this.zzd(zzfbxVar);
                return zzfbxVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final zzfvl zzi() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgf zzfgfVar = this.zzc;
        return zzffp.zzc(this.zza.zza(), zzffz.PRELOADED_LOADER, zzfgfVar).zza();
    }

    public final zzfvl zzj(zzfvl zzfvlVar) {
        zzfbx zzfbxVar = this.zzg;
        if (zzfbxVar != null) {
            zzfgf zzfgfVar = this.zzc;
            return zzffp.zzc(zzfvc.zzi(zzfbxVar), zzffz.SERVER_TRANSACTION, zzfgfVar).zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc().zzj();
        zzffw zzb = this.zzc.zzb(zzffz.SERVER_TRANSACTION, zzfvlVar);
        final zzebk zzebkVar = this.zzk;
        return zzb.zzf(new zzfuj() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzebk.this.zzb((zzbzv) obj);
            }
        }).zza();
    }

    public final void zzk(zzfbx zzfbxVar) {
        this.zzg = zzfbxVar;
    }
}
