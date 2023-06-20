package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcq implements Runnable {
    final /* synthetic */ zzbcu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcq(zzbcu zzbcuVar) {
        this.zza = zzbcuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcu.zzh(this.zza);
    }
}
