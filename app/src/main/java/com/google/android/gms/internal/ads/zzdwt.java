package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdwt implements zzgqu {
    private final zzgrh zza;

    public zzdwt(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdws((Clock) this.zza.zzb());
    }
}
