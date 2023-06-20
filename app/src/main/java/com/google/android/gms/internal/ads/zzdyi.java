package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdyi extends zzbqj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfhh zzd;
    final /* synthetic */ zzcga zze;
    final /* synthetic */ zzdyj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyi(zzdyj zzdyjVar, Object obj, String str, long j10, zzfhh zzfhhVar, zzcga zzcgaVar) {
        this.zzf = zzdyjVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j10;
        this.zzd = zzfhhVar;
        this.zze = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(String str) {
        zzdwq zzdwqVar;
        zzdik zzdikVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwqVar = this.zzf.zzl;
            zzdwqVar.zzb(this.zzb, "error");
            zzdikVar = this.zzf.zzo;
            zzdikVar.zzb(this.zzb, "error");
            zzfhuVar = this.zzf.zzp;
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(false);
            zzfhuVar.zzb(zzfhhVar.zzj());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf() {
        zzdwq zzdwqVar;
        zzdik zzdikVar;
        zzfhu zzfhuVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzc));
            zzdwqVar = this.zzf.zzl;
            zzdwqVar.zzd(this.zzb);
            zzdikVar = this.zzf.zzo;
            zzdikVar.zzd(this.zzb);
            zzfhuVar = this.zzf.zzp;
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(true);
            zzfhuVar.zzb(zzfhhVar.zzj());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
