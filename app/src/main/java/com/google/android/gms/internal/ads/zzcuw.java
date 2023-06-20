package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcuw {
    private final zzfgp zza;
    private final zzdwh zzb;
    private final zzfbx zzc;

    public zzcuw(zzdwh zzdwhVar, zzfbx zzfbxVar, zzfgp zzfgpVar) {
        this.zza = zzfgpVar;
        this.zzb = zzdwhVar;
        this.zzc = zzfbxVar;
    }

    private static String zzb(int i10) {
        int i11 = i10 - 1;
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j10, int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgp zzfgpVar = this.zza;
            zzfgo zzb = zzfgo.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j10));
            zzb.zza("ad_format", "app_open_ad");
            zzb.zza("acr", zzb(i10));
            zzfgpVar.zzb(zzb);
            return;
        }
        zzdwg zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j10));
        zza.zzb("ad_format", "app_open_ad");
        zza.zzb("acr", zzb(i10));
        zza.zzg();
    }
}
