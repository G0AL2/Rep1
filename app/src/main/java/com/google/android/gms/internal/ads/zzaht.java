package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaht implements zzahs {
    private final zzyu zza;
    private final zzzy zzb;
    private final zzahv zzc;
    private final zzad zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaht(zzyu zzyuVar, zzzy zzzyVar, zzahv zzahvVar, String str, int i10) throws zzbp {
        this.zza = zzyuVar;
        this.zzb = zzzyVar;
        this.zzc = zzahvVar;
        int i11 = (zzahvVar.zzb * zzahvVar.zze) / 8;
        int i12 = zzahvVar.zzd;
        if (i12 == i11) {
            int i13 = zzahvVar.zzc * i11;
            int i14 = i13 * 8;
            int max = Math.max(i11, i13 / 10);
            this.zze = max;
            zzab zzabVar = new zzab();
            zzabVar.zzS(str);
            zzabVar.zzv(i14);
            zzabVar.zzO(i14);
            zzabVar.zzL(max);
            zzabVar.zzw(zzahvVar.zzb);
            zzabVar.zzT(zzahvVar.zzc);
            zzabVar.zzN(i10);
            this.zzd = zzabVar.zzY();
            return;
        }
        throw zzbp.zza("Expected block size: " + i11 + "; got: " + i12, null);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zza(int i10, long j10) {
        this.zza.zzL(new zzahy(this.zzc, 1, i10, j10));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(long j10) {
        this.zzf = j10;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final boolean zzc(zzys zzysVar, long j10) throws IOException {
        int i10;
        zzahv zzahvVar;
        int i11;
        int i12;
        long j11 = j10;
        while (true) {
            i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 <= 0 || (i11 = this.zzg) >= (i12 = this.zze)) {
                break;
            }
            int zza = zzzw.zza(this.zzb, zzysVar, (int) Math.min(i12 - i11, j11), true);
            if (zza == -1) {
                j11 = 0;
            } else {
                this.zzg += zza;
                j11 -= zza;
            }
        }
        int i13 = this.zzc.zzd;
        int i14 = this.zzg / i13;
        if (i14 > 0) {
            long j12 = this.zzf;
            long zzw = zzeg.zzw(this.zzh, 1000000L, zzahvVar.zzc);
            int i15 = i14 * i13;
            int i16 = this.zzg - i15;
            this.zzb.zzs(j12 + zzw, 1, i15, i16, null);
            this.zzh += i14;
            this.zzg = i16;
        }
        return i10 <= 0;
    }
}
