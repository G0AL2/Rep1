package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfr  reason: invalid package */
/* loaded from: classes2.dex */
final class zzfr implements zzbe {
    private final zzbi zza;
    private final byte[] zzb = {0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfr(zzbi zzbiVar, zzfq zzfqVar) {
        this.zza = zzbiVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbf zzbfVar : this.zza.zzd(copyOf)) {
                try {
                    if (zzbfVar.zzd() == 4) {
                        ((zzbe) zzbfVar.zza()).zza(copyOfRange, zzlx.zzc(bArr2, this.zzb));
                        return;
                    } else {
                        ((zzbe) zzbfVar.zza()).zza(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e10) {
                    logger = zzfs.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (zzbf zzbfVar2 : this.zza.zzd(zzaq.zza)) {
                try {
                    ((zzbe) zzbfVar2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
