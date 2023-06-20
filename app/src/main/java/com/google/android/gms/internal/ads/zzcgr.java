package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcgr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgr(zzcgv zzcgvVar, int i10, int i11) {
        this.zzc = zzcgvVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        zzcgw zzcgwVar2;
        zzcgv zzcgvVar = this.zzc;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            zzcgwVar2 = zzcgvVar.zzq;
            zzcgwVar2.zzj(this.zza, this.zzb);
        }
    }
}
