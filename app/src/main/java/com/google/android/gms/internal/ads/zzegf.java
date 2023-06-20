package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegf implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;

    public zzegf(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzege zzb() {
        return new zzege((zzcws) this.zza.zzb(), (Context) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzdtp) this.zzd.zzb(), ((zzdbk) this.zze).zza(), (zzfok) this.zzf.zzb());
    }
}
