package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdvo implements zzfgg {
    private final Map zza;
    private final zzbdm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvo(zzbdm zzbdmVar, Map map) {
        this.zza = map;
        this.zzb = zzbdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffzVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffzVar)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffzVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffzVar, String str) {
        if (this.zza.containsKey(zzffzVar)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffzVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffzVar, String str) {
        if (this.zza.containsKey(zzffzVar)) {
            this.zzb.zzc(((zzdvn) this.zza.get(zzffzVar)).zzb);
        }
    }
}
