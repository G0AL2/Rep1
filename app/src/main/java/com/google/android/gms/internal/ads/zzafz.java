package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafz implements zzaga {
    private final List zza;
    private final zzzy[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzafz(List list) {
        this.zza = list;
        this.zzb = new zzzy[list.size()];
    }

    private final boolean zzf(zzdy zzdyVar, int i10) {
        if (zzdyVar.zza() == 0) {
            return false;
        }
        if (zzdyVar.zzk() != i10) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzzy[] zzzyVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int zzc = zzdyVar.zzc();
                    int zza = zzdyVar.zza();
                    for (zzzy zzzyVar : this.zzb) {
                        zzdyVar.zzF(zzc);
                        zzzyVar.zzq(zzdyVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        for (int i10 = 0; i10 < this.zzb.length; i10++) {
            zzahj zzahjVar = (zzahj) this.zza.get(i10);
            zzahmVar.zzc();
            zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 3);
            zzab zzabVar = new zzab();
            zzabVar.zzH(zzahmVar.zzb());
            zzabVar.zzS("application/dvbsubs");
            zzabVar.zzI(Collections.singletonList(zzahjVar.zzb));
            zzabVar.zzK(zzahjVar.zza);
            zzv.zzk(zzabVar.zzY());
            this.zzb[i10] = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzzy zzzyVar : this.zzb) {
                    zzzyVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j10 != -9223372036854775807L) {
            this.zzf = j10;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
