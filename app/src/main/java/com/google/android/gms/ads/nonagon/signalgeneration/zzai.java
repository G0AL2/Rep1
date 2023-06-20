package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzdba;
import com.google.android.gms.internal.ads.zzffz;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzgqu;
import com.google.android.gms.internal.ads.zzgrh;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzai implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzai(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzfgf) this.zza.zzb()).zzb(zzffz.GENERATE_SIGNALS, ((zzdba) this.zzc).zzb().zzc()).zzf(((zzal) this.zzb).zzb()).zzi(((Integer) zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS).zza();
    }
}
