package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccn {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcdn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzccn(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcdnVar;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzan)).booleanValue()) {
            return;
        }
        if (j10 - this.zzb.zzf() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzao)).booleanValue()) {
            this.zzb.zzK(-1);
            this.zzb.zzL(j10);
        } else {
            this.zzb.zzK(i10);
            this.zzb.zzL(j10);
        }
        zza();
    }
}
