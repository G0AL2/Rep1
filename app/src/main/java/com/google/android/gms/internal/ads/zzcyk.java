package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcyk implements zzfuy {
    final /* synthetic */ zzfuy zza;
    final /* synthetic */ zzcyl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyk(zzcyl zzcylVar, zzfuy zzfuyVar) {
        this.zzb = zzcylVar;
        this.zza = zzfuyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // java.lang.Runnable
            public final void run() {
                zzcyl.this.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyi
            @Override // java.lang.Runnable
            public final void run() {
                zzcyl.this.zzd();
            }
        });
        this.zza.zzb((zzcxx) obj);
    }
}
