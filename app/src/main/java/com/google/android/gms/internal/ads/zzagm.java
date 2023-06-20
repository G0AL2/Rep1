package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagm implements zzaga {
    private zzzy zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzdy zza = new zzdy(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zzb);
        if (this.zzc) {
            int zza = zzdyVar.zza();
            int i10 = this.zzf;
            if (i10 < 10) {
                int min = Math.min(zza, 10 - i10);
                System.arraycopy(zzdyVar.zzH(), zzdyVar.zzc(), this.zza.zzH(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzF(0);
                    if (this.zza.zzk() == 73 && this.zza.zzk() == 68 && this.zza.zzk() == 51) {
                        this.zza.zzG(3);
                        this.zze = this.zza.zzj() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(zza, this.zze - this.zzf);
            zzzw.zzb(this.zzb, zzdyVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 5);
        this.zzb = zzv;
        zzab zzabVar = new zzab();
        zzabVar.zzH(zzahmVar.zzb());
        zzabVar.zzS("application/id3");
        zzv.zzk(zzabVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
        int i10;
        zzcw.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                this.zzb.zzs(j10, 1, i10, 0, null);
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
            this.zzd = j10;
        }
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
