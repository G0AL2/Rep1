package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdln implements zzcya {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgrh zzd;
    private final zzdns zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdln(Map map, Map map2, Map map3, zzgrh zzgrhVar, zzdns zzdnsVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgrhVar;
        this.zze = zzdnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final zzefd zza(int i10, String str) {
        zzefd zza;
        zzefd zzefdVar = (zzefd) this.zza.get(str);
        if (zzefdVar != null) {
            return zzefdVar;
        }
        if (i10 == 1) {
            if (this.zze.zze() == null || (zza = ((zzcya) this.zzd.zzb()).zza(i10, str)) == null) {
                return null;
            }
            return zzcye.zza(zza);
        } else if (i10 != 4) {
            return null;
        } else {
            zzehr zzehrVar = (zzehr) this.zzc.get(str);
            if (zzehrVar != null) {
                return new zzefe(zzehrVar, new zzfok() { // from class: com.google.android.gms.internal.ads.zzcyc
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        return new zzcye((List) obj);
                    }
                });
            }
            zzefd zzefdVar2 = (zzefd) this.zzb.get(str);
            if (zzefdVar2 == null) {
                return null;
            }
            return zzcye.zza(zzefdVar2);
        }
    }
}
