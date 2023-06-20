package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzawu implements zzaxl {
    final /* synthetic */ zzawv zza;
    private final int zzb;

    public zzawu(zzawv zzawvVar, int i10) {
        this.zza = zzawvVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final int zzb(zzaru zzaruVar, zzato zzatoVar, boolean z10) {
        return this.zza.zze(this.zzb, zzaruVar, zzatoVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzd(long j10) {
        this.zza.zzy(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}
