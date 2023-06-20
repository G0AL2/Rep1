package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzrq implements zzeq {
    private final zzeq zza;
    private final int zzb;
    private final zzrp zzc;
    private final byte[] zzd;
    private int zze;

    public zzrq(zzeq zzeqVar, int i10, zzrp zzrpVar) {
        zzcw.zzd(i10 > 0);
        this.zza = zzeqVar;
        this.zzb = i10;
        this.zzc = zzrpVar;
        this.zzd = new byte[1];
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zze;
        if (i12 == 0) {
            int i13 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i14 = (this.zzd[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr2 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int zza = this.zza.zza(bArr2, i13, i15);
                        if (zza != -1) {
                            i13 += zza;
                            i15 -= zza;
                        }
                    }
                    while (i14 > 0) {
                        int i16 = i14 - 1;
                        if (bArr2[i16] != 0) {
                            break;
                        }
                        i14 = i16;
                    }
                    if (i14 > 0) {
                        this.zzc.zza(new zzdy(bArr2, i14));
                    }
                }
                i12 = this.zzb;
                this.zze = i12;
            }
            return -1;
        }
        int zza2 = this.zza.zza(bArr, i10, Math.min(i12, i11));
        if (zza2 != -1) {
            this.zze -= zza2;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        this.zza.zzf(zzfsVar);
    }
}
