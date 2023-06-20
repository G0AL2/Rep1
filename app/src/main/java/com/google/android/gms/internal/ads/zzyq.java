package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyq implements zzzy {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ int zze(zzp zzpVar, int i10, boolean z10) {
        return zzzw.zza(this, zzpVar, i10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final int zzf(zzp zzpVar, int i10, boolean z10, int i11) throws IOException {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i10));
        if (zza == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzk(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i10) {
        zzzw.zzb(this, zzdyVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzr(zzdy zzdyVar, int i10, int i11) {
        zzdyVar.zzG(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzs(long j10, int i10, int i11, int i12, zzzx zzzxVar) {
    }
}
