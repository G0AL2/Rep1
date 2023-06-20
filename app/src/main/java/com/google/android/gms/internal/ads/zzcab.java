package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcab implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcad zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcab(zzcad zzcadVar, Context context) {
        this.zzb = zzcadVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzcaa zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcac zzcacVar = (zzcac) weakHashMap.get(this.zza);
        if (zzcacVar != null && zzcacVar.zza + ((Long) zzbjf.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()) {
            zza = new zzbzz(this.zza, zzcacVar.zzb).zza();
        } else {
            zza = new zzbzz(this.zza).zza();
        }
        zzcad zzcadVar = this.zzb;
        weakHashMap2 = zzcadVar.zza;
        weakHashMap2.put(this.zza, new zzcac(zzcadVar, zza));
        return zza;
    }
}
