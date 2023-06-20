package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzagi {
    private final zzzy zza;
    private final zzzq zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzagh zzi = new zzagh(null);
    private final zzagh zzj = new zzagh(null);
    private boolean zzk = false;

    public zzagi(zzzy zzzyVar, boolean z10, boolean z11) {
        this.zza = zzzyVar;
        byte[] bArr = new byte[128];
        this.zze = bArr;
        this.zzd = new zzzq(bArr, 0, 0);
    }

    public final void zza(zzzm zzzmVar) {
        this.zzc.append(zzzmVar.zza, zzzmVar);
    }

    public final void zzb(zzzn zzznVar) {
        this.zzb.append(zzznVar.zzd, zzznVar);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j10, int i10, long j11) {
        this.zzf = i10;
        this.zzh = j11;
        this.zzg = j10;
    }

    public final boolean zze(long j10, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        if (this.zzf == 9) {
            if (z10 && this.zzk) {
                long j11 = this.zzg;
                int i11 = i10 + ((int) (j10 - j11));
                long j12 = this.zzm;
                if (j12 != -9223372036854775807L) {
                    boolean z13 = this.zzn;
                    long j13 = this.zzl;
                    this.zza.zzs(j12, z13 ? 1 : 0, (int) (j11 - j13), i11, null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z14 = this.zzn;
        int i12 = this.zzf;
        if (i12 == 5 || (z11 && i12 == 1)) {
            z12 = true;
        }
        boolean z15 = z14 | z12;
        this.zzn = z15;
        return z15;
    }
}
