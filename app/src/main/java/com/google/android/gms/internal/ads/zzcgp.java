package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcgp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgp(zzcgv zzcgvVar, String str, String str2) {
        this.zzc = zzcgvVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgw zzcgwVar;
        zzcgw zzcgwVar2;
        zzcgv zzcgvVar = this.zzc;
        zzcgwVar = zzcgvVar.zzq;
        if (zzcgwVar != null) {
            zzcgwVar2 = zzcgvVar.zzq;
            zzcgwVar2.zzb(this.zza, this.zzb);
        }
    }
}
