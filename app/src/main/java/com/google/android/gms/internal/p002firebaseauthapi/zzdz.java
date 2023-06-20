package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz  reason: invalid package */
/* loaded from: classes2.dex */
final class zzdz implements zzas {
    private final zzbi zza;

    public zzdz(zzbi zzbiVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbf zzbfVar : this.zza.zzd(copyOfRange)) {
                try {
                    return ((zzas) zzbfVar.zza()).zza(copyOfRange2, null);
                } catch (GeneralSecurityException e10) {
                    logger = zzea.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (zzbf zzbfVar2 : this.zza.zzd(zzaq.zza)) {
            try {
                return ((zzas) zzbfVar2.zza()).zza(bArr, null);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
