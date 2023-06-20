package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdwq {
    private final String zze;
    private final zzdwm zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdwq(String str, zzdwm zzdwmVar) {
        this.zze = str;
        this.zzf = zzdwmVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), 10));
        zza.put("tid", this.zza.zzP() ? "" : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "aaia");
                zzg.put("aair", "MalformedJson");
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                zzg.put("rqe", str2);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_started");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map zzg = zzg();
                zzg.put("action", "adapter_init_finished");
                zzg.put("ancn", str);
                this.zzb.add(zzg);
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                if (this.zzd) {
                    return;
                }
                Map zzg = zzg();
                zzg.put("action", "init_finished");
                this.zzb.add(zzg);
                for (Map map : this.zzb) {
                    this.zzf.zze(map);
                }
                this.zzd = true;
            }
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                if (this.zzc) {
                    return;
                }
                Map zzg = zzg();
                zzg.put("action", "init_started");
                this.zzb.add(zzg);
                this.zzc = true;
            }
        }
    }
}
