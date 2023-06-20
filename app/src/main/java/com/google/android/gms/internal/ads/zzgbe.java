package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgbe implements zzfwx {
    private final zzfxc zza;
    private final byte[] zzb = {0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgbe(zzfxc zzfxcVar, zzgbd zzgbdVar) {
        this.zza = zzfxcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwz zzfwzVar : this.zza.zze(copyOf)) {
                try {
                    if (zzfwzVar.zzd() == 4) {
                        ((zzfwx) zzfwzVar.zza()).zza(copyOfRange, zzghh.zzc(bArr2, this.zzb));
                        return;
                    } else {
                        ((zzfwx) zzfwzVar.zza()).zza(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e10) {
                    logger = zzgbf.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (zzfwz zzfwzVar2 : this.zza.zze(zzfwk.zza)) {
                try {
                    ((zzfwx) zzfwzVar2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwx
    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zzb().zzd() == 4) {
            return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwx) this.zza.zzb().zza()).zzb(zzghh.zzc(bArr, this.zzb)));
        }
        return zzghh.zzc(this.zza.zzb().zzb(), ((zzfwx) this.zza.zzb().zza()).zzb(bArr));
    }
}
