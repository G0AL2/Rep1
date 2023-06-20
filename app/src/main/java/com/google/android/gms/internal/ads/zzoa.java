package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzoa {
    private zzoc zzc;
    private zzmv zzb = zzmv.zza;
    final zznz zza = zznz.zza;

    public final zzoa zzb(zzmv zzmvVar) {
        this.zzb = zzmvVar;
        return this;
    }

    public final zzoa zzc(zzmy[] zzmyVarArr) {
        this.zzc = new zzoc(zzmyVarArr);
        return this;
    }

    public final zzom zzd() {
        if (this.zzc == null) {
            this.zzc = new zzoc(new zzmy[0]);
        }
        return new zzom(this, null);
    }
}
