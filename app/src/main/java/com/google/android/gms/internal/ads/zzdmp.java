package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdmp implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdmp(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjb((Context) this.zza.zzb(), new HashSet(), ((zzcyn) this.zzb).zza());
    }
}
