package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaau implements zzyr {
    private zzyu zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzacr zzg;
    private zzys zzh;
    private zzaax zzi;
    private zzaeo zzj;
    private final zzdy zza = new zzdy(6);
    private long zzf = -1;

    private final int zze(zzys zzysVar) throws IOException {
        this.zza.zzC(2);
        ((zzyl) zzysVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyu zzyuVar = this.zzb;
        Objects.requireNonNull(zzyuVar);
        zzyuVar.zzB();
        this.zzb.zzL(new zzzt(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbk... zzbkVarArr) {
        zzyu zzyuVar = this.zzb;
        Objects.requireNonNull(zzyuVar);
        zzzy zzv = zzyuVar.zzv(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES, 4);
        zzab zzabVar = new zzab();
        zzabVar.zzz("image/jpeg");
        zzabVar.zzM(new zzbl(zzbkVarArr));
        zzv.zzk(zzabVar.zzY());
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r24, com.google.android.gms.internal.ads.zzzr r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaau.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzb = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeoVar = this.zzj;
            Objects.requireNonNull(zzaeoVar);
            zzaeoVar.zzc(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        if (zze(zzysVar) != 65496) {
            return false;
        }
        int zze = zze(zzysVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzyl zzylVar = (zzyl) zzysVar;
            zzylVar.zzm(this.zza.zzH(), 0, 2, false);
            zzylVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzysVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzyl zzylVar2 = (zzyl) zzysVar;
            zzylVar2.zzl(2, false);
            this.zza.zzC(6);
            zzylVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}
