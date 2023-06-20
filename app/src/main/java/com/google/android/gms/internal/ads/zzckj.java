package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzckj implements zzeq {
    private final zzeq zza;
    private final long zzb;
    private final zzeq zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckj(zzeq zzeqVar, int i10, zzeq zzeqVar2) {
        this.zza = zzeqVar;
        this.zzb = i10;
        this.zzc = zzeqVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.zzd;
        long j11 = this.zzb;
        if (j10 < j11) {
            int zza = this.zza.zza(bArr, i10, (int) Math.min(i11, j11 - j10));
            long j12 = this.zzd + zza;
            this.zzd = j12;
            i12 = zza;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i10 + i12, i11 - i12);
            this.zzd += zza2;
            return i12 + zza2;
        }
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        zzev zzevVar2;
        this.zze = zzevVar.zza;
        long j10 = zzevVar.zzf;
        long j11 = this.zzb;
        zzev zzevVar3 = null;
        if (j10 >= j11) {
            zzevVar2 = null;
        } else {
            long j12 = zzevVar.zzg;
            zzevVar2 = new zzev(zzevVar.zza, null, j10, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, null, 0);
        }
        long j13 = zzevVar.zzg;
        if (j13 == -1 || zzevVar.zzf + j13 > this.zzb) {
            long max = Math.max(this.zzb, zzevVar.zzf);
            long j14 = zzevVar.zzg;
            zzevVar3 = new zzev(zzevVar.zza, null, max, max, j14 != -1 ? Math.min(j14, (zzevVar.zzf + j14) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzevVar2 != null ? this.zza.zzb(zzevVar2) : 0L;
        long zzb2 = zzevVar3 != null ? this.zzc.zzb(zzevVar3) : 0L;
        this.zzd = zzevVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        return zzfrm.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
    }
}
