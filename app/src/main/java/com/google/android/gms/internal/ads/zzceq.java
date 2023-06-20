package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzceq {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzceq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzceq(zzcep zzcepVar) {
    }

    public final void zza() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc == 3) {
                if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeU)).longValue() <= currentTimeMillis) {
                    this.zzc = 1;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        synchronized (this.zza) {
            if (this.zzc != 2) {
                return;
            }
            this.zzc = 3;
            if (this.zzc == 3) {
                this.zzb = currentTimeMillis2;
            }
        }
    }
}
