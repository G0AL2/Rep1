package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzek  reason: invalid package */
/* loaded from: classes2.dex */
final class zzek {
    private static final byte[] zza = new byte[0];
    private final zzej zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzek(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzej zzejVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzek zzb(byte[] bArr, byte[] bArr2, zzeu zzeuVar, zzei zzeiVar, zzej zzejVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArr4 = zzet.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb = zzet.zzb(zzet.zzb, bArr4, zzejVar.zzb());
            byte[] bArr5 = zzet.zzg;
            byte[] bArr6 = zza;
            byte[] zzc = zzlx.zzc(zzet.zza, zzeiVar.zzd(bArr5, bArr6, "psk_id_hash", zzb), zzeiVar.zzd(bArr5, bArr3, "info_hash", zzb));
            byte[] zzd = zzeiVar.zzd(bArr2, bArr6, "secret", zzb);
            byte[] zzc2 = zzeiVar.zzc(zzd, zzc, "key", zzb, zzejVar.zza());
            byte[] zzc3 = zzeiVar.zzc(zzd, zzc, "base_nonce", zzb, 12);
            BigInteger bigInteger = BigInteger.ONE;
            return new zzek(bArr, zzc2, zzc3, bigInteger.shiftLeft(96).subtract(bigInteger), zzejVar);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzc() throws GeneralSecurityException {
        byte[] zzd;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length == 13) {
                if (byteArray[0] == 0) {
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                } else {
                    throw new GeneralSecurityException("integer too large");
                }
            } else {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            }
        }
        zzd = zzlx.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzc(), bArr, bArr2);
    }
}
