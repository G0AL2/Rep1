package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgm {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgm(String str, zzad zzadVar, zzad zzadVar2, int i10, int i11) {
        boolean z10 = false;
        if (i10 != 0) {
            i11 = i11 == 0 ? 0 : i11;
            zzcw.zzd(z10);
            zzcw.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzadVar);
            this.zzb = zzadVar;
            Objects.requireNonNull(zzadVar2);
            this.zzc = zzadVar2;
            this.zzd = i10;
            this.zze = i11;
        }
        z10 = true;
        zzcw.zzd(z10);
        zzcw.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzadVar);
        this.zzb = zzadVar;
        Objects.requireNonNull(zzadVar2);
        this.zzc = zzadVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgm.class == obj.getClass()) {
            zzgm zzgmVar = (zzgm) obj;
            if (this.zzd == zzgmVar.zzd && this.zze == zzgmVar.zze && this.zza.equals(zzgmVar.zza) && this.zzb.equals(zzgmVar.zzb) && this.zzc.equals(zzgmVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
