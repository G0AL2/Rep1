package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzti implements zzvp {
    public long zza;
    public long zzb;
    public zzvo zzc;
    public zzti zzd;

    public zzti(long j10, int i10) {
        zze(j10, Constants.MIN_PROGRESS_STEP);
    }

    public final int zza(long j10) {
        long j11 = this.zza;
        int i10 = this.zzc.zzb;
        return (int) (j10 - j11);
    }

    public final zzti zzb() {
        this.zzc = null;
        zzti zztiVar = this.zzd;
        this.zzd = null;
        return zztiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final zzvo zzc() {
        zzvo zzvoVar = this.zzc;
        Objects.requireNonNull(zzvoVar);
        return zzvoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvp
    public final zzvp zzd() {
        zzti zztiVar = this.zzd;
        if (zztiVar == null || zztiVar.zzc == null) {
            return null;
        }
        return zztiVar;
    }

    public final void zze(long j10, int i10) {
        zzcw.zzf(this.zzc == null);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
