package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzchc implements Runnable {
    final /* synthetic */ zzchf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchc(zzchf zzchfVar) {
        this.zza = zzchfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzJ("surfaceCreated", new String[0]);
    }
}
