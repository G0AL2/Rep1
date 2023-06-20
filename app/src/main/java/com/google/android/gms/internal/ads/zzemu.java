package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemu {
    private final zzdns zza;
    private final zzemh zzb;
    private final zzdbw zzc;

    public zzemu(zzdns zzdnsVar, zzfgp zzfgpVar) {
        this.zza = zzdnsVar;
        final zzemh zzemhVar = new zzemh(zzfgpVar);
        this.zzb = zzemhVar;
        final zzbrb zzg = zzdnsVar.zzg();
        this.zzc = new zzdbw() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // com.google.android.gms.internal.ads.zzdbw
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzemh zzemhVar2 = zzemh.this;
                zzbrb zzbrbVar = zzg;
                zzemhVar2.zza(zzeVar);
                if (zzbrbVar != null) {
                    try {
                        zzbrbVar.zzf(zzeVar);
                    } catch (RemoteException e10) {
                        zzcfi.zzl("#007 Could not call remote method.", e10);
                    }
                }
                if (zzbrbVar != null) {
                    try {
                        zzbrbVar.zze(zzeVar.zza);
                    } catch (RemoteException e11) {
                        zzcfi.zzl("#007 Could not call remote method.", e11);
                    }
                }
            }
        };
    }

    public final zzdbw zza() {
        return this.zzc;
    }

    public final zzddh zzb() {
        return this.zzb;
    }

    public final zzdlp zzc() {
        return new zzdlp(this.zza, this.zzb.zzc());
    }

    public final zzemh zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.zzb.zze(zzbfVar);
    }
}
