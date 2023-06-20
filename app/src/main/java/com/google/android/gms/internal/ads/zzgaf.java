package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgaf implements zzfwn {
    private static final byte[] zza = new byte[0];
    private final zzgfg zzb;
    private final zzgac zzc;
    private final zzgao zzd;
    private final zzgab zze;

    private zzgaf(zzgfg zzgfgVar, zzgao zzgaoVar, zzgab zzgabVar, zzgac zzgacVar, byte[] bArr) {
        this.zzb = zzgfgVar;
        this.zzd = zzgaoVar;
        this.zze = zzgabVar;
        this.zzc = zzgacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgaf zzb(zzgfg zzgfgVar) throws GeneralSecurityException {
        if (!zzgfgVar.zzh().zzD()) {
            zzgfa zzc = zzgfgVar.zzc();
            return new zzgaf(zzgfgVar, zzgah.zzc(zzc), zzgah.zzb(zzc), zzgah.zza(zzc), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgfg zzgfgVar = this.zzb;
        zzgao zzgaoVar = this.zzd;
        zzgab zzgabVar = this.zze;
        zzgac zzgacVar = this.zzc;
        zzgag zza2 = zzgaoVar.zza(zzgfgVar.zzh().zzE(), zzgin.zzb());
        zzgad zzc = zzgad.zzc(zza2.zza(), zza2.zzb(), zzgaoVar, zzgabVar, zzgacVar, bArr3);
        return zzghh.zzc(zzc.zza(), zzc.zzb(bArr, zza));
    }
}
