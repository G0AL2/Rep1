package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzffw {
    final /* synthetic */ zzffx zza;
    private final Object zzb;
    private final String zzc;
    private final zzfvl zzd;
    private final List zze;
    private final zzfvl zzf;

    private zzffw(zzffx zzffxVar, Object obj, String str, zzfvl zzfvlVar, List list, zzfvl zzfvlVar2) {
        this.zza = zzffxVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = zzfvlVar;
        this.zze = list;
        this.zzf = zzfvlVar2;
    }

    public final zzffk zza() {
        zzffy zzffyVar;
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        final zzffk zzffkVar = new zzffk(obj, str, this.zzf);
        zzffyVar = this.zza.zzd;
        zzffyVar.zza(zzffkVar);
        zzfvl zzfvlVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzffq
            @Override // java.lang.Runnable
            public final void run() {
                zzffy zzffyVar2;
                zzffw zzffwVar = zzffw.this;
                zzffk zzffkVar2 = zzffkVar;
                zzffyVar2 = zzffwVar.zza.zzd;
                zzffyVar2.zzc(zzffkVar2);
            }
        };
        zzfvm zzfvmVar = zzcfv.zzf;
        zzfvlVar.zzc(runnable, zzfvmVar);
        zzfvc.zzr(zzffkVar, new zzffu(this, zzffkVar), zzfvmVar);
        return zzffkVar;
    }

    public final zzffw zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzffw zzc(Class cls, zzfuj zzfujVar) {
        zzfvm zzfvmVar;
        zzffx zzffxVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfvl zzfvlVar = this.zzd;
        List list = this.zze;
        zzfvl zzfvlVar2 = this.zzf;
        zzfvmVar = zzffxVar.zzb;
        return new zzffw(zzffxVar, obj, str, zzfvlVar, list, zzfvc.zzg(zzfvlVar2, cls, zzfujVar, zzfvmVar));
    }

    public final zzffw zzd(final zzfvl zzfvlVar) {
        return zzg(new zzfuj() { // from class: com.google.android.gms.internal.ads.zzffr
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzfvl.this;
            }
        }, zzcfv.zzf);
    }

    public final zzffw zze(final zzffi zzffiVar) {
        return zzf(new zzfuj() { // from class: com.google.android.gms.internal.ads.zzfft
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzfvc.zzi(zzffi.this.zza(obj));
            }
        });
    }

    public final zzffw zzf(zzfuj zzfujVar) {
        zzfvm zzfvmVar;
        zzfvmVar = this.zza.zzb;
        return zzg(zzfujVar, zzfvmVar);
    }

    public final zzffw zzg(zzfuj zzfujVar, Executor executor) {
        return new zzffw(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzfvc.zzn(this.zzf, zzfujVar, executor));
    }

    public final zzffw zzh(String str) {
        return new zzffw(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzffw zzi(long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzffx zzffxVar = this.zza;
        Object obj = this.zzb;
        String str = this.zzc;
        zzfvl zzfvlVar = this.zzd;
        List list = this.zze;
        zzfvl zzfvlVar2 = this.zzf;
        scheduledExecutorService = zzffxVar.zzc;
        return new zzffw(zzffxVar, obj, str, zzfvlVar, list, zzfvc.zzo(zzfvlVar2, j10, timeUnit, scheduledExecutorService));
    }
}
