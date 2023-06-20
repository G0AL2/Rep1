package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbv  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbv implements zzan {
    private final zzbi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbv(zzbi zzbiVar, zzbu zzbuVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbf zzbfVar : this.zza.zzd(copyOfRange)) {
                try {
                    return ((zzan) zzbfVar.zza()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e10) {
                    logger = zzbw.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (zzbf zzbfVar2 : this.zza.zzd(zzaq.zza)) {
            try {
                return ((zzan) zzbfVar2.zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
