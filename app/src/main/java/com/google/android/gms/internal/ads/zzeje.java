package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzeje extends zzekf {
    private final zzdjp zza;

    public zzeje(zzdbr zzdbrVar, zzdje zzdjeVar, zzdcl zzdclVar, zzdda zzddaVar, zzddf zzddfVar, zzdcg zzdcgVar, zzdgm zzdgmVar, zzdjw zzdjwVar, zzddz zzddzVar, zzdjp zzdjpVar, zzdgi zzdgiVar) {
        super(zzdbrVar, zzdjeVar, zzdclVar, zzddaVar, zzddfVar, zzdgmVar, zzddzVar, zzdjwVar, zzdgiVar, zzdcgVar);
        this.zza = zzdjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekf, com.google.android.gms.internal.ads.zzbug
    public final void zzs(zzcax zzcaxVar) {
        this.zza.zza(zzcaxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzekf, com.google.android.gms.internal.ads.zzbug
    public final void zzt(zzcbb zzcbbVar) throws RemoteException {
        this.zza.zza(new zzcax(zzcbbVar.zzf(), zzcbbVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzekf, com.google.android.gms.internal.ads.zzbug
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekf, com.google.android.gms.internal.ads.zzbug
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzekf, com.google.android.gms.internal.ads.zzbug
    public final void zzy() {
        this.zza.zzc();
    }
}
