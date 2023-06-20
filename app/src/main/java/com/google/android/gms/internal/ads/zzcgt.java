package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcgt implements Runnable {
    final /* synthetic */ zzcgv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgt(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        boolean z10;
        zzcgw zzcgwVar2;
        zzcgw zzcgwVar3;
        zzcgv zzcgvVar = this.zza;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            z10 = zzcgvVar.zzr;
            if (!z10) {
                zzcgwVar3 = zzcgvVar.zzq;
                zzcgwVar3.zzg();
                this.zza.zzr = true;
            }
            zzcgwVar2 = this.zza.zzq;
            zzcgwVar2.zze();
        }
    }
}
