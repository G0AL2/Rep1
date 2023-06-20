package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcja implements zzayj {
    private final zzayj zza;
    private final long zzb;
    private final zzayj zzc;
    private long zzd;
    private Uri zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcja(zzayj zzayjVar, int i10, zzayj zzayjVar2) {
        this.zza = zzayjVar;
        this.zzb = i10;
        this.zzc = zzayjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
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

    @Override // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzaylVar) throws IOException {
        zzayl zzaylVar2;
        this.zze = zzaylVar.zza;
        long j10 = zzaylVar.zzc;
        long j11 = this.zzb;
        zzayl zzaylVar3 = null;
        if (j10 >= j11) {
            zzaylVar2 = null;
        } else {
            long j12 = zzaylVar.zzd;
            zzaylVar2 = new zzayl(zzaylVar.zza, null, j10, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, null, 0);
        }
        long j13 = zzaylVar.zzd;
        if (j13 == -1 || zzaylVar.zzc + j13 > this.zzb) {
            long max = Math.max(this.zzb, zzaylVar.zzc);
            long j14 = zzaylVar.zzd;
            zzaylVar3 = new zzayl(zzaylVar.zza, null, max, max, j14 != -1 ? Math.min(j14, (zzaylVar.zzc + j14) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzaylVar2 != null ? this.zza.zzb(zzaylVar2) : 0L;
        long zzb2 = zzaylVar3 != null ? this.zzc.zzb(zzaylVar3) : 0L;
        this.zzd = zzaylVar.zzc;
        if (zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }
}
