package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzagk {
    private final zzzy zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzagk(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    private final void zze(int i10) {
        long j10 = this.zzl;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.zzm;
        long j11 = this.zzb;
        long j12 = this.zzk;
        this.zza.zzs(j10, z10 ? 1 : 0, (int) (j11 - j12), i10, null);
    }

    public final void zza(long j10, int i10, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zze(i10 + ((int) (j10 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i10, int i11) {
        if (this.zzf) {
            int i12 = this.zzd;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.zzd = i12 + (i11 - i10);
                return;
            }
            this.zzg = (bArr[i13] & 128) != 0;
            this.zzf = false;
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j10, int i10, int i11, long j11, boolean z10) {
        boolean z11 = false;
        this.zzg = false;
        this.zzh = false;
        this.zze = j11;
        this.zzd = 0;
        this.zzb = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zze(i10);
                }
                this.zzi = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z12 = i11 >= 16 && i11 <= 21;
        this.zzc = z12;
        this.zzf = (z12 || i11 <= 9) ? true : true;
    }
}
