package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgao {
    private final zzgab zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgao(zzgab zzgabVar) {
        this.zza = zzgabVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgag zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza = zzgin.zza(bArr2, bArr);
        byte[] zzc = zzgin.zzc(bArr2);
        byte[] zzc2 = zzghh.zzc(zzc, bArr);
        byte[] zzd = zzgan.zzd(zzgan.zzb);
        zzgab zzgabVar = this.zza;
        return new zzgag(zzgabVar.zzb(null, zza, "eae_prk", zzc2, "shared_secret", zzd, zzgabVar.zza()), zzc);
    }
}
