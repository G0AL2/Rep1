package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdwg {
    final /* synthetic */ zzdwh zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdwg(zzdwh zzdwhVar) {
        this.zza = zzdwhVar;
    }

    public static /* bridge */ /* synthetic */ zzdwg zza(zzdwg zzdwgVar) {
        Map map;
        Map map2 = zzdwgVar.zzb;
        map = zzdwgVar.zza.zzc;
        map2.putAll(map);
        return zzdwgVar;
    }

    public final zzdwg zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdwg zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdwg zzd(zzfbl zzfblVar) {
        this.zzb.put("aai", zzfblVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            zzc("rid", zzfblVar.zzap);
        }
        return this;
    }

    public final zzdwg zze(zzfbo zzfboVar) {
        this.zzb.put("gqi", zzfboVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdwm zzdwmVar;
        zzdwmVar = this.zza.zza;
        return zzdwmVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // java.lang.Runnable
            public final void run() {
                zzdwg.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // java.lang.Runnable
            public final void run() {
                zzdwg.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdwm zzdwmVar;
        zzdwmVar = this.zza.zza;
        zzdwmVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdwm zzdwmVar;
        zzdwmVar = this.zza.zza;
        zzdwmVar.zzd(this.zzb);
    }
}
