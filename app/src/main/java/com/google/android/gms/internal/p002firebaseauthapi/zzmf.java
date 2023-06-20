package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmf {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzb(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static BigInteger zzb(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static BigInteger zzc(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger zzb = zzb(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zzb);
        if (zzb.signum() == 1) {
            BigInteger mod2 = mod.mod(zzb);
            BigInteger bigInteger2 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger2)) {
                if (zzb.testBit(0) && zzb.testBit(1)) {
                    bigInteger2 = mod2.modPow(zzb.add(BigInteger.ONE).shiftRight(2), zzb);
                } else if (zzb.testBit(0) && !zzb.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = zzb.subtract(bigInteger2).shiftRight(1);
                    int i10 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zzb);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, zzb);
                        BigInteger bigInteger3 = BigInteger.ONE;
                        if (modPow.add(bigInteger3).equals(zzb)) {
                            BigInteger shiftRight2 = zzb.add(bigInteger3).shiftRight(1);
                            BigInteger bigInteger4 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(zzb).multiply(mod3)).mod(zzb);
                                BigInteger mod4 = multiply.add(multiply).mod(zzb);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(zzb);
                                    bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(zzb);
                                    bigInteger4 = mod5;
                                } else {
                                    bigInteger3 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger4;
                        } else if (modPow.equals(bigInteger3)) {
                            bigInteger2 = bigInteger2.add(bigInteger3);
                            i10++;
                            if (i10 == 128 && !zzb.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                } else {
                    bigInteger2 = null;
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zzb).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z10 != bigInteger2.testBit(0) ? zzb.subtract(bigInteger2).mod(zzb) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger zzb = zzb(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX != null && affineY != null) {
            if (affineX.signum() != -1 && affineX.compareTo(zzb) < 0) {
                if (affineY.signum() != -1 && affineY.compareTo(zzb) < 0) {
                    if (!affineY.multiply(affineY).mod(zzb).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(zzb))) {
                        throw new GeneralSecurityException("Point is not on curve");
                    }
                    return;
                }
                throw new GeneralSecurityException("y is out of range");
            }
            throw new GeneralSecurityException("x is out of range");
        }
        throw new GeneralSecurityException("point is at infinity");
    }

    public static ECPublicKey zze(int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec zzf = zzf(i10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        zzd(eCPoint, zzf.getCurve());
        return (ECPublicKey) ((KeyFactory) zzmh.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zzf));
    }

    public static ECParameterSpec zzf(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                return zzg("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
            }
            return zzg("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        return zzg("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    private static ECParameterSpec zzg(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
