package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcjl implements Runnable {
    final /* synthetic */ zzcjm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjl(zzcjm zzcjmVar) {
        this.zza = zzcjmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}
