package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzetj {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfhs zzd;
    private final zzdwh zze;

    public zzetj(Context context, Executor executor, Set set, zzfhs zzfhsVar, zzdwh zzdwhVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhsVar;
        this.zze = zzdwhVar;
    }

    public final zzfvl zza(final Object obj) {
        zzfhh zza = zzfhg.zza(this.zza, 8);
        zza.zzf();
        final ArrayList arrayList = new ArrayList(this.zzb.size());
        for (final zzetg zzetgVar : this.zzb) {
            zzfvl zzb = zzetgVar.zzb();
            zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeth
                @Override // java.lang.Runnable
                public final void run() {
                    zzetj.this.zzb(zzetgVar);
                }
            }, zzcfv.zzf);
            arrayList.add(zzb);
        }
        zzfvl zza2 = zzfvc.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfvl> list = arrayList;
                Object obj2 = obj;
                for (zzfvl zzfvlVar : list) {
                    zzetf zzetfVar = (zzetf) zzfvlVar.get();
                    if (zzetfVar != null) {
                        zzetfVar.zzf(obj2);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfhu.zza()) {
            zzfhr.zza(zza2, this.zzd, zza);
        }
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzetg zzetgVar) {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        if (((Boolean) zzbjs.zza.zze()).booleanValue()) {
            String zzc = zzfpi.zzc(zzetgVar.getClass().getCanonicalName());
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + zzc + " = " + elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbM)).booleanValue()) {
            zzdwg zza = this.zze.zza();
            zza.zzb("action", "lat_ms");
            zza.zzb("lat_grp", "sig_lat_grp");
            zza.zzb("lat_id", String.valueOf(zzetgVar.zza()));
            zza.zzb("clat_ms", String.valueOf(elapsedRealtime));
            zza.zzh();
        }
    }
}
