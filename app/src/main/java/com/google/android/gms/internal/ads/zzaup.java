package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaup {
    private final zzazh zza = new zzazh(8);
    private int zzb;

    private final long zzb(zzatv zzatvVar) throws IOException, InterruptedException {
        int i10 = 0;
        zzatvVar.zzg(this.zza.zza, 0, 1, false);
        int i11 = this.zza.zza[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            zzatvVar.zzg(this.zza.zza, 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.zza.zza[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
            }
            this.zzb += i13 + 1;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzatv zzatvVar) throws IOException, InterruptedException {
        long zzb;
        int i10;
        long zzc = zzatvVar.zzc();
        long j10 = 1024;
        int i11 = (zzc > (-1L) ? 1 : (zzc == (-1L) ? 0 : -1));
        if (i11 != 0 && zzc <= 1024) {
            j10 = zzc;
        }
        int i12 = (int) j10;
        zzatvVar.zzg(this.zza.zza, 0, 4, false);
        long zzm = this.zza.zzm();
        this.zzb = 4;
        while (zzm != 440786851) {
            int i13 = this.zzb + 1;
            this.zzb = i13;
            if (i13 == i12) {
                return false;
            }
            zzatvVar.zzg(this.zza.zza, 0, 1, false);
            zzm = ((zzm << 8) & (-256)) | (this.zza.zza[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        long zzb2 = zzb(zzatvVar);
        long j11 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i11 == 0 || j11 + zzb2 < zzc)) {
            while (true) {
                int i14 = (this.zzb > (j11 + zzb2) ? 1 : (this.zzb == (j11 + zzb2) ? 0 : -1));
                if (i14 < 0) {
                    if (zzb(zzatvVar) == Long.MIN_VALUE || (zzb = zzb(zzatvVar)) < 0) {
                        return false;
                    }
                    if (i10 != 0) {
                        zzatvVar.zzf((int) zzb, false);
                        this.zzb = (int) (this.zzb + zzb);
                    }
                } else if (i14 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
