package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzfvm;
import com.google.android.gms.internal.ads.zzgqu;
import com.google.android.gms.internal.ads.zzgrc;
import com.google.android.gms.internal.ads.zzgrh;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzal implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzal(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzak zzb() {
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzak(zzfvmVar, ((zzeak) this.zzb).zzb());
    }
}
