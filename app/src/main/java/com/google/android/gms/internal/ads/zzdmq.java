package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdmq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdmq(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfo zza = ((zzcnv) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzbaj(UUID.randomUUID().toString(), zza, "native", new JSONObject(), false, true);
    }
}
