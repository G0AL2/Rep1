package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbag implements Runnable {
    final /* synthetic */ zzatn zza;
    final /* synthetic */ zzbah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbag(zzbah zzbahVar, zzatn zzatnVar) {
        this.zzb = zzbahVar;
        this.zza = zzatnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza();
    }
}
