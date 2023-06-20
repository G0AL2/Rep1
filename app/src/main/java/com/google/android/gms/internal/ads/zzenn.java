package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenn implements zzetg {
    private final Clock zza;
    private final zzfcd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenn(Clock clock, zzfcd zzfcdVar) {
        this.zza = clock;
        this.zzb = zzfcdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzi(new zzeno(this.zzb, this.zza.currentTimeMillis()));
    }
}
