package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzu implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdzu(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaoc zzaocVar = (zzaoc) this.zza.zzb();
        final Context zza = ((zzcnl) this.zzb).zza();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        zzfvl zzb = zzfvmVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaoc zzaocVar2 = zzaoc.this;
                return zzaocVar2.zzc().zzg(zza);
            }
        });
        zzgrc.zzb(zzb);
        return zzb;
    }
}
