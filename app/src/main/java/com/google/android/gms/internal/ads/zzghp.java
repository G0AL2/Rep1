package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghp {
    private final ECPublicKey zza;

    public zzghp(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzgho zza(String str, byte[] bArr, byte[] bArr2, int i10, int i11) throws GeneralSecurityException {
        char c10;
        int i12;
        byte[] bArr3;
        int i13;
        byte[] bArr4;
        KeyPair zzb = zzghq.zzb(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzb.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzb.getPrivate();
        ECPublicKey eCPublicKey2 = this.zza;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (params.getCurve().equals(params2.getCurve()) && params.getGenerator().equals(params2.getGenerator()) && params.getOrder().equals(params2.getOrder()) && params.getCofactor() == params2.getCofactor()) {
                ECPoint w10 = eCPublicKey2.getW();
                zzghq.zzc(w10, eCPrivateKey.getParams().getCurve());
                PublicKey generatePublic = ((KeyFactory) zzghs.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
                KeyAgreement keyAgreement = (KeyAgreement) zzghs.zze.zza("ECDH");
                keyAgreement.init(eCPrivateKey);
                int i14 = 1;
                try {
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger = new BigInteger(1, generateSecret);
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(zzghq.zza(curve)) < 0) {
                        BigInteger zza = zzghq.zza(curve);
                        BigInteger mod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(zza);
                        if (zza.signum() == 1) {
                            BigInteger mod2 = mod.mod(zza);
                            BigInteger bigInteger2 = BigInteger.ZERO;
                            if (!mod2.equals(bigInteger2)) {
                                if (zza.testBit(0) && zza.testBit(1)) {
                                    bigInteger2 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
                                } else if (zza.testBit(0) && !zza.testBit(1)) {
                                    bigInteger2 = BigInteger.ONE;
                                    BigInteger shiftRight = zza.subtract(bigInteger2).shiftRight(1);
                                    int i15 = 0;
                                    while (true) {
                                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zza);
                                        if (mod3.equals(BigInteger.ZERO)) {
                                            break;
                                        }
                                        BigInteger modPow = mod3.modPow(shiftRight, zza);
                                        BigInteger bigInteger3 = BigInteger.ONE;
                                        if (modPow.add(bigInteger3).equals(zza)) {
                                            BigInteger shiftRight2 = zza.add(bigInteger3).shiftRight(i14);
                                            BigInteger bigInteger4 = bigInteger2;
                                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                                BigInteger mod4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(zza).multiply(mod3)).mod(zza);
                                                BigInteger mod5 = multiply.add(multiply).mod(zza);
                                                if (shiftRight2.testBit(bitLength)) {
                                                    BigInteger mod6 = mod4.multiply(bigInteger2).add(mod5.multiply(mod3)).mod(zza);
                                                    bigInteger3 = bigInteger2.multiply(mod5).add(mod4).mod(zza);
                                                    bigInteger4 = mod6;
                                                } else {
                                                    bigInteger4 = mod4;
                                                    bigInteger3 = mod5;
                                                }
                                            }
                                            bigInteger2 = bigInteger4;
                                        } else if (modPow.equals(bigInteger3)) {
                                            bigInteger2 = bigInteger2.add(bigInteger3);
                                            i15++;
                                            if (i15 == 128 && !zza.isProbablePrime(80)) {
                                                throw new InvalidAlgorithmParameterException("p is not prime");
                                            }
                                            i14 = 1;
                                        } else {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                    }
                                } else {
                                    bigInteger2 = null;
                                }
                                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                                    throw new GeneralSecurityException("Could not find a modular square root");
                                }
                            }
                            if (!bigInteger2.testBit(0)) {
                                zza.subtract(bigInteger2).mod(zza);
                            }
                            EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                            ECPoint w11 = eCPublicKey.getW();
                            zzghq.zzc(w11, curve2);
                            int bitLength2 = (zzghq.zza(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                            int i16 = i11 - 1;
                            if (i16 != 0) {
                                if (i16 != 2) {
                                    int i17 = bitLength2 + 1;
                                    bArr4 = new byte[i17];
                                    byte[] byteArray = w11.getAffineX().toByteArray();
                                    int length = byteArray.length;
                                    c10 = 0;
                                    System.arraycopy(byteArray, 0, bArr4, i17 - length, length);
                                    bArr4[0] = true != w11.getAffineY().testBit(0) ? (byte) 2 : (byte) 3;
                                } else {
                                    int i18 = bitLength2 + bitLength2;
                                    bArr4 = new byte[i18];
                                    byte[] byteArray2 = w11.getAffineX().toByteArray();
                                    int length2 = byteArray2.length;
                                    if (length2 > bitLength2) {
                                        byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                                    }
                                    byte[] byteArray3 = w11.getAffineY().toByteArray();
                                    int length3 = byteArray3.length;
                                    if (length3 > bitLength2) {
                                        byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                                    }
                                    int length4 = byteArray3.length;
                                    c10 = 0;
                                    System.arraycopy(byteArray3, 0, bArr4, i18 - length4, length4);
                                    int length5 = byteArray2.length;
                                    System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                                }
                                bArr3 = bArr4;
                                i13 = 2;
                                i12 = 1;
                            } else {
                                c10 = 0;
                                i12 = 1;
                                int i19 = bitLength2 + bitLength2 + 1;
                                bArr3 = new byte[i19];
                                byte[] byteArray4 = w11.getAffineX().toByteArray();
                                byte[] byteArray5 = w11.getAffineY().toByteArray();
                                int length6 = byteArray5.length;
                                System.arraycopy(byteArray5, 0, bArr3, i19 - length6, length6);
                                int length7 = byteArray4.length;
                                System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                                bArr3[0] = 4;
                                i13 = 2;
                            }
                            byte[][] bArr5 = new byte[i13];
                            bArr5[c10] = bArr3;
                            bArr5[i12] = generateSecret;
                            byte[] zzc = zzghh.zzc(bArr5);
                            Mac mac = (Mac) zzghs.zzb.zza(str);
                            if (i10 <= mac.getMacLength() * 255) {
                                if (bArr != null && bArr.length != 0) {
                                    mac.init(new SecretKeySpec(bArr, str));
                                } else {
                                    mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                                }
                                byte[] doFinal = mac.doFinal(zzc);
                                byte[] bArr6 = new byte[i10];
                                mac.init(new SecretKeySpec(doFinal, str));
                                byte[] bArr7 = new byte[0];
                                int i20 = 0;
                                while (true) {
                                    mac.update(bArr7);
                                    mac.update(bArr2);
                                    mac.update((byte) i12);
                                    byte[] doFinal2 = mac.doFinal();
                                    int length8 = doFinal2.length;
                                    int i21 = i20 + length8;
                                    if (i21 < i10) {
                                        System.arraycopy(doFinal2, 0, bArr6, i20, length8);
                                        i12++;
                                        bArr7 = doFinal2;
                                        i20 = i21;
                                    } else {
                                        System.arraycopy(doFinal2, 0, bArr6, i20, i10 - i20);
                                        return new zzgho(bArr3, bArr6);
                                    }
                                }
                            } else {
                                throw new GeneralSecurityException("size too large");
                            }
                        } else {
                            throw new InvalidAlgorithmParameterException("p must be positive");
                        }
                    } else {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                } catch (IllegalStateException e10) {
                    throw new GeneralSecurityException(e10);
                }
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e11) {
            throw new GeneralSecurityException(e11);
        }
    }
}
