package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeda implements zzdim {
    private final String zzc;
    private final zzfgp zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeda(String str, zzfgp zzfgpVar) {
        this.zzc = str;
        this.zzd = zzfgpVar;
    }

    private final zzfgo zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfgo zzb = zzfgo.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final void zza(String str) {
        zzfgp zzfgpVar = this.zzd;
        zzfgo zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfgpVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final void zzb(String str, String str2) {
        zzfgp zzfgpVar = this.zzd;
        zzfgo zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfgpVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final void zzc(String str) {
        zzfgp zzfgpVar = this.zzd;
        zzfgo zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfgpVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final void zzd(String str) {
        zzfgp zzfgpVar = this.zzd;
        zzfgo zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfgpVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdim
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
