package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazb {
    private boolean zza;

    public final synchronized void zza() throws InterruptedException {
        while (!this.zza) {
            wait();
        }
    }

    public final synchronized boolean zzb() {
        boolean z10;
        z10 = this.zza;
        this.zza = false;
        return z10;
    }

    public final synchronized boolean zzc() {
        if (this.zza) {
            return false;
        }
        this.zza = true;
        notifyAll();
        return true;
    }
}
