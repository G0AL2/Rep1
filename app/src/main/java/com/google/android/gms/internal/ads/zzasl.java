package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzasl implements Runnable {
    final /* synthetic */ zzart zza;
    final /* synthetic */ zzasp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasl(zzasp zzaspVar, zzart zzartVar) {
        this.zzb = zzaspVar;
        this.zza = zzartVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasq zzasqVar;
        zzasqVar = this.zzb.zzb;
        zzasqVar.zzh(this.zza);
    }
}
