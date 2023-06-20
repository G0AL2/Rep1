package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegj implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzegj(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzegi((Context) this.zza.zzb(), (zzcws) this.zzb.zzb(), (Executor) this.zzc.zzb());
    }
}
