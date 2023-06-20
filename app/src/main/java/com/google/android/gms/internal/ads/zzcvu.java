package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcvu implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcvu(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzdei zzb() {
        return new zzdei((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
