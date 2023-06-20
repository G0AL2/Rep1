package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeab implements zzgqu {
    public static zzeab zza() {
        zzeab zzeabVar;
        zzeabVar = zzeaa.zza;
        return zzeabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzaw.zze().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        zzgrc.zzb(valueOf);
        return valueOf;
    }
}
