package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzel extends zzek {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzel(byte[] bArr) {
        super(false);
        Objects.requireNonNull(bArr);
        zzcw.zzd(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.zza, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        this.zzb = zzevVar.zza;
        zzi(zzevVar);
        long j10 = zzevVar.zzf;
        int length = this.zza.length;
        if (j10 <= length) {
            int i10 = (int) j10;
            this.zzc = i10;
            int i11 = length - i10;
            this.zzd = i11;
            long j11 = zzevVar.zzg;
            if (j11 != -1) {
                this.zzd = (int) Math.min(i11, j11);
            }
            this.zze = true;
            zzj(zzevVar);
            long j12 = zzevVar.zzg;
            return j12 != -1 ? j12 : this.zzd;
        }
        throw new zzer(AdError.REMOTE_ADS_SERVICE_ERROR);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zzb = null;
    }
}
