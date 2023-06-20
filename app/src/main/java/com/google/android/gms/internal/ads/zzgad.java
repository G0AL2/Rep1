package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgad {
    private static final byte[] zza = new byte[0];
    private final zzgac zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgad(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgac zzgacVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgacVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgad zzc(byte[] bArr, byte[] bArr2, zzgao zzgaoVar, zzgab zzgabVar, zzgac zzgacVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] bArr4 = zzgan.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb = zzgan.zzb(zzgan.zzb, bArr4, zzgacVar.zzb());
            byte[] bArr5 = zzgan.zzg;
            byte[] bArr6 = zza;
            byte[] zzc = zzghh.zzc(zzgan.zza, zzgabVar.zzd(bArr5, bArr6, "psk_id_hash", zzb), zzgabVar.zzd(bArr5, bArr3, "info_hash", zzb));
            byte[] zzd = zzgabVar.zzd(bArr2, bArr6, "secret", zzb);
            byte[] zzc2 = zzgabVar.zzc(zzd, zzc, "key", zzb, zzgacVar.zza());
            byte[] zzc3 = zzgabVar.zzc(zzd, zzc, "base_nonce", zzb, 12);
            BigInteger bigInteger = BigInteger.ONE;
            return new zzgad(bArr, zzc2, zzc3, bigInteger.shiftLeft(96).subtract(bigInteger), zzgacVar);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
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
        zzd = zzghh.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
