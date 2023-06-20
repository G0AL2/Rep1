package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbv {
    private final zzw zza = new zzw();

    public final zzbv zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzbv zzb(zzbx zzbxVar) {
        zzy zzyVar;
        zzw zzwVar = this.zza;
        zzyVar = zzbxVar.zzc;
        for (int i10 = 0; i10 < zzyVar.zzb(); i10++) {
            zzwVar.zza(zzyVar.zza(i10));
        }
        return this;
    }

    public final zzbv zzc(int... iArr) {
        zzw zzwVar = this.zza;
        for (int i10 = 0; i10 < 20; i10++) {
            zzwVar.zza(iArr[i10]);
        }
        return this;
    }

    public final zzbv zzd(int i10, boolean z10) {
        zzw zzwVar = this.zza;
        if (z10) {
            zzwVar.zza(i10);
        }
        return this;
    }

    public final zzbx zze() {
        return new zzbx(this.zza.zzb(), null);
    }
}
