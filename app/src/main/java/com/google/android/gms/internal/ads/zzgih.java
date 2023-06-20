package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgih implements zzgbg {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzgih(String str, Key key) throws GeneralSecurityException {
        char c10;
        int i10;
        zzgig zzgigVar = new zzgig(this);
        this.zza = zzgigVar;
        if (zzfze.zza(2)) {
            this.zzb = str;
            this.zzc = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0) {
                    if (c10 == 1) {
                        i10 = 28;
                    } else if (c10 == 2) {
                        i10 = 32;
                    } else if (c10 == 3) {
                        i10 = 48;
                    } else if (c10 != 4) {
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    } else {
                        i10 = 64;
                    }
                    this.zzd = i10;
                } else {
                    this.zzd = 20;
                }
                zzgigVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgbg
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 <= this.zzd) {
            ((Mac) this.zza.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
