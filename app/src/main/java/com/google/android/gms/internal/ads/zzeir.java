package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeir {
    private final zzfcs zza;
    private final zzdtz zzb;
    private final zzdwh zzc;
    private final zzfgp zzd;

    public zzeir(zzfcs zzfcsVar, zzdtz zzdtzVar, zzdwh zzdwhVar, zzfgp zzfgpVar) {
        this.zza = zzfcsVar;
        this.zzb = zzdtzVar;
        this.zzc = zzdwhVar;
        this.zzd = zzfgpVar;
    }

    public final void zza(zzfbo zzfboVar, zzfbl zzfblVar, int i10, zzefh zzefhVar, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzb = zzfgo.zzb("adapter_status");
            zzb.zzg(zzfboVar);
            zzb.zzf(zzfblVar);
            zzb.zza("adapter_l", String.valueOf(j10));
            zzb.zza("sc", Integer.toString(i10));
            if (zzefhVar != null) {
                zzb.zza("arec", Integer.toString(zzefhVar.zzb().zza));
                String zza = this.zza.zza(zzefhVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdty zzb2 = this.zzb.zzb(zzfblVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbwg zzbwgVar = zzb2.zzb;
                if (zzbwgVar != null) {
                    zzb.zza("adapter_v", zzbwgVar.toString());
                }
                zzbwg zzbwgVar2 = zzb2.zzc;
                if (zzbwgVar2 != null) {
                    zzb.zza("adapter_sv", zzbwgVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdwg zza2 = this.zzc.zza();
        zza2.zze(zzfboVar);
        zza2.zzd(zzfblVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j10));
        zza2.zzb("sc", Integer.toString(i10));
        if (zzefhVar != null) {
            zza2.zzb("arec", Integer.toString(zzefhVar.zzb().zza));
            String zza3 = this.zza.zza(zzefhVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdty zzb3 = this.zzb.zzb(zzfblVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbwg zzbwgVar3 = zzb3.zzb;
            if (zzbwgVar3 != null) {
                zza2.zzb("adapter_v", zzbwgVar3.toString());
            }
            zzbwg zzbwgVar4 = zzb3.zzc;
            if (zzbwgVar4 != null) {
                zza2.zzb("adapter_sv", zzbwgVar4.toString());
            }
        }
        zza2.zzg();
    }
}
