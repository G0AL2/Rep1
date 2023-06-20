package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgv implements zzfgp {
    private final zzfgz zza;
    private final zzfgx zzb;
    private final zzfgm zzc;

    public zzfgv(zzfgm zzfgmVar, zzfgz zzfgzVar, zzfgx zzfgxVar, byte[] bArr) {
        this.zzc = zzfgmVar;
        this.zza = zzfgzVar;
        this.zzb = zzfgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgp
    public final String zza(zzfgo zzfgoVar) {
        zzfgz zzfgzVar = this.zza;
        Map zzj = zzfgoVar.zzj();
        this.zzb.zza(zzj);
        return zzfgzVar.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfgp
    public final void zzb(zzfgo zzfgoVar) {
        this.zzc.zzb(zza(zzfgoVar));
    }
}
