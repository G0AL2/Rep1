package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzasn implements Runnable {
    final /* synthetic */ zzatn zza;
    final /* synthetic */ zzasp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasn(zzasp zzaspVar, zzatn zzatnVar) {
        this.zzb = zzaspVar;
        this.zza = zzatnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
