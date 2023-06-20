package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzadh {
    private final zzdy zza = new zzdy(8);
    private int zzb;

    private final long zzb(zzys zzysVar) throws IOException {
        zzyl zzylVar = (zzyl) zzysVar;
        int i10 = 0;
        zzylVar.zzm(this.zza.zzH(), 0, 1, false);
        int i11 = this.zza.zzH()[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        if (i11 != 0) {
            int i12 = 128;
            int i13 = 0;
            while ((i11 & i12) == 0) {
                i12 >>= 1;
                i13++;
            }
            int i14 = i11 & (~i12);
            zzylVar.zzm(this.zza.zzH(), 1, i13, false);
            while (i10 < i13) {
                i10++;
                i14 = (this.zza.zzH()[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) + (i14 << 8);
            }
            this.zzb += i13 + 1;
            return i14;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzys zzysVar) throws IOException {
        long zzb;
        int i10;
        long zzd = zzysVar.zzd();
        long j10 = 1024;
        int i11 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        if (i11 != 0 && zzd <= 1024) {
            j10 = zzd;
        }
        int i12 = (int) j10;
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i13 = this.zzb + 1;
            this.zzb = i13;
            if (i13 == i12) {
                return false;
            }
            zzylVar.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & (-256)) | (this.zza.zzH()[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        long zzb2 = zzb(zzysVar);
        long j11 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i11 == 0 || j11 + zzb2 < zzd)) {
            while (true) {
                int i14 = (this.zzb > (j11 + zzb2) ? 1 : (this.zzb == (j11 + zzb2) ? 0 : -1));
                if (i14 < 0) {
                    if (zzb(zzysVar) == Long.MIN_VALUE || (zzb = zzb(zzysVar)) < 0) {
                        return false;
                    }
                    if (i10 != 0) {
                        int i15 = (int) zzb;
                        zzylVar.zzl(i15, false);
                        this.zzb += i15;
                    }
                } else if (i14 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
