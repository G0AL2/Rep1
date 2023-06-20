package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeln implements zzemw {
    final /* synthetic */ zzelo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeln(zzelo zzeloVar) {
        this.zza = zzeloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvv zzcvvVar;
        zzcvv zzcvvVar2;
        zzcvv zzcvvVar3;
        zzcvv zzcvvVar4 = (zzcvv) obj;
        synchronized (this.zza) {
            zzelo zzeloVar = this.zza;
            zzcvvVar = zzeloVar.zzh;
            if (zzcvvVar != null) {
                zzcvvVar3 = zzeloVar.zzh;
                zzcvvVar3.zzV();
            }
            this.zza.zzh = zzcvvVar4;
            zzcvvVar2 = this.zza.zzh;
            zzcvvVar2.zzW();
        }
    }
}
