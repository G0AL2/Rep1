package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzduw implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzduw(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        zzdvo zzb = ((zzdvp) this.zzb).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            emptySet = Collections.singleton(new zzdiz(zzb, zzfvmVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgrc.zzb(emptySet);
        return emptySet;
    }
}
