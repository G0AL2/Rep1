package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeag implements zzgqu {
    public static zzeag zza() {
        zzeag zzeagVar;
        zzeagVar = zzeaf.zza;
        return zzeagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgrc.zzb(uuid);
        return uuid;
    }
}
