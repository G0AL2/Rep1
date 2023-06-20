package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxo implements zzfwf {
    private final zzfxc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfxo(zzfxc zzfxcVar, zzfxn zzfxnVar) {
        this.zza = zzfxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwz zzfwzVar : this.zza.zze(copyOfRange)) {
                try {
                    return ((zzfwf) zzfwzVar.zza()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e10) {
                    logger = zzfxp.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (zzfwz zzfwzVar2 : this.zza.zze(zzfwk.zza)) {
            try {
                return ((zzfwf) zzfwzVar2.zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwf) this.zza.zzb().zza()).zzb(bArr, bArr2));
    }
}
