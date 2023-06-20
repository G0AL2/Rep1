package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzccq(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzccp zzb() {
        return new zzccp((Clock) this.zza.zzb(), (zzccn) this.zzb.zzb());
    }
}
