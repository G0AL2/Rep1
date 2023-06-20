package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzche implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzchf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzche(zzchf zzchfVar, boolean z10) {
        this.zzb = zzchfVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzJ("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
