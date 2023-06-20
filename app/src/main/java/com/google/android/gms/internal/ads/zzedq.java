package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzedq implements zzddh, zzdbw {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzeea zzd;

    public zzedq(zzeea zzeeaVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzeeaVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int intValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfh)).intValue();
            }
            if (i10 >= intValue) {
                return;
            }
            this.zzd.zzd(z10);
            synchronized (obj) {
                zzb++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzb(true);
    }
}
