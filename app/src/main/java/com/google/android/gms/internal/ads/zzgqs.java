package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqs implements zzgqu {
    private zzgrh zza;

    public static void zza(zzgrh zzgrhVar, zzgrh zzgrhVar2) {
        zzgqs zzgqsVar = (zzgqs) zzgrhVar;
        if (zzgqsVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgqsVar.zza = zzgrhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        zzgrh zzgrhVar = this.zza;
        if (zzgrhVar != null) {
            return zzgrhVar.zzb();
        }
        throw new IllegalStateException();
    }
}
