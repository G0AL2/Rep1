package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzel  reason: invalid package */
/* loaded from: classes2.dex */
final class zzel implements zzas {
    private static final byte[] zza = new byte[0];
    private final zzjt zzb;
    private final zzej zzc;
    private final zzeu zzd;
    private final zzei zze;

    private zzel(zzjt zzjtVar, zzeu zzeuVar, zzei zzeiVar, zzej zzejVar, int i10, byte[] bArr) {
        this.zzb = zzjtVar;
        this.zzd = zzeuVar;
        this.zze = zzeiVar;
        this.zzc = zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzel zzb(zzjt zzjtVar) throws GeneralSecurityException {
        if (zzjtVar.zzk()) {
            if (zzjtVar.zze().zzl()) {
                if (!zzjtVar.zzf().zzs()) {
                    zzjq zzb = zzjtVar.zze().zzb();
                    zzeu zzc = zzen.zzc(zzb);
                    zzei zzb2 = zzen.zzb(zzb);
                    zzej zza2 = zzen.zza(zzb);
                    int zzf = zzb.zzf();
                    if (zzf - 2 == 1) {
                        return new zzel(zzjtVar, zzc, zzb2, zza2, 32, null);
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzjk.zza(zzf)));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 32) {
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
            zzjt zzjtVar = this.zzb;
            zzeu zzeuVar = this.zzd;
            zzei zzeiVar = this.zze;
            zzej zzejVar = this.zzc;
            return zzek.zzb(copyOf, zzeuVar.zza(copyOf, zzjtVar.zzf().zzt()), zzeuVar, zzeiVar, zzejVar, new byte[0]).zza(copyOfRange, zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
