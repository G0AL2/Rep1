package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzekf extends zzbuf {
    private final zzdbr zza;
    private final zzdje zzb;
    private final zzdcl zzc;
    private final zzdda zzd;
    private final zzddf zze;
    private final zzdgm zzf;
    private final zzddz zzg;
    private final zzdjw zzh;
    private final zzdgi zzi;
    private final zzdcg zzj;

    public zzekf(zzdbr zzdbrVar, zzdje zzdjeVar, zzdcl zzdclVar, zzdda zzddaVar, zzddf zzddfVar, zzdgm zzdgmVar, zzddz zzddzVar, zzdjw zzdjwVar, zzdgi zzdgiVar, zzdcg zzdcgVar) {
        this.zza = zzdbrVar;
        this.zzb = zzdjeVar;
        this.zzc = zzdclVar;
        this.zzd = zzddaVar;
        this.zze = zzddfVar;
        this.zzf = zzdgmVar;
        this.zzg = zzddzVar;
        this.zzh = zzdjwVar;
        this.zzi = zzdgiVar;
        this.zzj = zzdcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf() {
        this.zzg.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    @Deprecated
    public final void zzj(int i10) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i10, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfdc.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzo() {
        this.zze.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblvVar, String str) {
    }

    public void zzs(zzcax zzcaxVar) {
    }

    public void zzt(zzcbb zzcbbVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
