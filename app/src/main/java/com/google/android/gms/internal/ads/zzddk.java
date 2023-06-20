package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzddk implements zzgqu {
    private final zzgrh zza;

    public zzddk(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    public static zzddj zzc(Set set) {
        return new zzddj(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzddj zzb() {
        return new zzddj(((zzgrf) this.zza).zzb());
    }
}
