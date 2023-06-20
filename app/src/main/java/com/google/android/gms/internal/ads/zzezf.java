package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzezf implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzezf(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzeza zzb() {
        zzcel zzi;
        Context context = (Context) this.zza.zzb();
        zzfdk zzfdkVar = (zzfdk) this.zzb.zzb();
        zzfec zzfecVar = (zzfec) this.zzc.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfo)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z10 = false;
        if (zzi != null && zzi.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfq)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || z10) {
                zzfeb zza = zzfecVar.zza(zzfds.Rewarded, context, zzfdkVar, new zzeye(new zzeyb()));
                zzeyq zzeyqVar = new zzeyq(new zzeyp());
                zzfdo zzfdoVar = zza.zza;
                zzfvm zzfvmVar = zzcfv.zza;
                return new zzeyg(zzeyqVar, new zzeym(zzfdoVar, zzfvmVar), zza.zzb, zza.zza.zza().zzf, zzfvmVar);
            }
        }
        return new zzeyp();
    }
}
