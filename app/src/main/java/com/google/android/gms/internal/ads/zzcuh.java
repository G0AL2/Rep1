package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcuh implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzcuh(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzcyn) this.zza).zza();
        zzcfo zza = ((zzcnv) this.zzb).zza();
        JSONObject jSONObject = (JSONObject) this.zzc.zzb();
        String str = (String) this.zzd.zzb();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzbaj(UUID.randomUUID().toString(), zza, str, jSONObject, false, equals);
    }
}
