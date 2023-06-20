package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevh implements zzetg {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbxz zzc;

    public zzevh(zzbxz zzbxzVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbxzVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzm(zzfvc.zzo(zzfvc.zzi(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdf)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfok() { // from class: com.google.android.gms.internal.ads.zzevg
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return new zzevi((Bundle) obj);
            }
        }, zzcfv.zza);
    }
}
