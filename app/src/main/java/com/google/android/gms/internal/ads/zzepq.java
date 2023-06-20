package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepq implements zzetg {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetg zzc;
    private final long zzd;

    public zzepq(zzetg zzetgVar, long j10, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetgVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzepp zzeppVar = (zzepp) this.zza.get();
        if (zzeppVar == null || zzeppVar.zza()) {
            zzeppVar = new zzepp(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeppVar);
        }
        return zzeppVar.zza;
    }
}
