package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzebk implements zzebm {
    private final Map zza;
    private final zzfvm zzb;
    private final zzdem zzc;

    public zzebk(Map map, zzfvm zzfvmVar, zzdem zzdemVar) {
        this.zza = map;
        this.zzb = zzfvmVar;
        this.zzc = zzdemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebm
    public final zzfvl zzb(final zzbzv zzbzvVar) {
        this.zzc.zzbE(zzbzvVar);
        zzfvl zzh = zzfvc.zzh(new zzdzl(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgS)).split(",")) {
            final zzgrh zzgrhVar = (zzgrh) this.zza.get(str.trim());
            if (zzgrhVar != null) {
                zzh = zzfvc.zzg(zzh, zzdzl.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzebi
                    @Override // com.google.android.gms.internal.ads.zzfuj
                    public final zzfvl zza(Object obj) {
                        zzgrh zzgrhVar2 = zzgrh.this;
                        zzdzl zzdzlVar = (zzdzl) obj;
                        return ((zzebm) zzgrhVar2.zzb()).zzb(zzbzvVar);
                    }
                }, this.zzb);
            }
        }
        zzfvc.zzr(zzh, new zzebj(this), zzcfv.zzf);
        return zzh;
    }
}
