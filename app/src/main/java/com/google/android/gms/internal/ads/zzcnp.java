package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcnp implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcnp(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzeda zzedaVar = (zzeda) this.zza.zzb();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                emptySet = Collections.singleton(new zzdiz(zzedaVar, zzfvmVar));
                zzgrc.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzgrc.zzb(emptySet);
        return emptySet;
    }
}
