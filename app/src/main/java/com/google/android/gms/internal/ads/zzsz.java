package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzsz implements zztq {
    final /* synthetic */ zztc zza;
    private final int zzb;

    public zzsz(zztc zztcVar, int i10) {
        this.zza = zztcVar;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zza(zziz zzizVar, zzgb zzgbVar, int i10) {
        return this.zza.zzg(this.zzb, zzizVar, zzgbVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final int zzb(long j10) {
        return this.zza.zzi(this.zzb, j10);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final void zzd() throws IOException {
        this.zza.zzF(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztq
    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}
