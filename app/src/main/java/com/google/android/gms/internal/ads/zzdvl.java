package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdvl implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzdvl(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String zza = ((zzevo) this.zza).zza();
        Context zza2 = ((zzcnl) this.zzb).zza();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        Map zzb = ((zzgqy) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            zzbdm zzbdmVar = new zzbdm(new zzbds(zza2));
            zzbdmVar.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzdvm
                @Override // com.google.android.gms.internal.ads.zzbdl
                public final void zza(zzbfb zzbfbVar) {
                    zzbfbVar.zzh(zza);
                }
            });
            emptySet = Collections.singleton(new zzdiz(new zzdvo(zzbdmVar, zzb), zzfvmVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzgrc.zzb(emptySet);
        return emptySet;
    }
}
