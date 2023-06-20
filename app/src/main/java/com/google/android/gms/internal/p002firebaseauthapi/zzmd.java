package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
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

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmd {
    private final ECPrivateKey zza;

    public zzmd(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, int i11) throws GeneralSecurityException {
        ECPoint eCPoint;
        boolean z10;
        ECParameterSpec params = this.zza.getParams();
        EllipticCurve curve = params.getCurve();
        int zza = zzmf.zza(curve);
        int i12 = i11 - 1;
        int i13 = 1;
        if (i12 == 0) {
            int length = bArr.length;
            if (length == zza + zza + 1) {
                if (bArr[0] == 4) {
                    int i14 = zza + 1;
                    eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i14)), new BigInteger(1, Arrays.copyOfRange(bArr, i14, length)));
                    zzmf.zzd(eCPoint, curve);
                } else {
                    throw new GeneralSecurityException("invalid point format");
                }
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        } else if (i12 != 2) {
            BigInteger zzb = zzmf.zzb(curve);
            int length2 = bArr.length;
            if (length2 == zza + 1) {
                byte b10 = bArr[0];
                if (b10 == 2) {
                    z10 = false;
                } else if (b10 != 3) {
                    throw new GeneralSecurityException("invalid format");
                } else {
                    z10 = true;
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() != -1 && bigInteger.compareTo(zzb) < 0) {
                    eCPoint = new ECPoint(bigInteger, zzmf.zzc(bigInteger, z10, curve));
                } else {
                    throw new GeneralSecurityException("x is out of range");
                }
            } else {
                throw new GeneralSecurityException("compressed point has wrong length");
            }
        } else {
            int length3 = bArr.length;
            if (length3 == zza + zza) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, length3)));
                zzmf.zzd(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        }
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, params);
        zzmh zzmhVar = zzmh.zzg;
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) zzmhVar.zza("EC")).generatePublic(eCPublicKeySpec);
        ECPrivateKey eCPrivateKey = this.zza;
        try {
            ECParameterSpec params2 = eCPublicKey.getParams();
            ECParameterSpec params3 = eCPrivateKey.getParams();
            if (params2.getCurve().equals(params3.getCurve()) && params2.getGenerator().equals(params3.getGenerator()) && params2.getOrder().equals(params3.getOrder()) && params2.getCofactor() == params3.getCofactor()) {
                ECPoint w10 = eCPublicKey.getW();
                zzmf.zzd(w10, eCPrivateKey.getParams().getCurve());
                PublicKey generatePublic = ((KeyFactory) zzmhVar.zza("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
                KeyAgreement keyAgreement = (KeyAgreement) zzmh.zze.zza("ECDH");
                keyAgreement.init(eCPrivateKey);
                try {
                    keyAgreement.doPhase(generatePublic, true);
                    byte[] generateSecret = keyAgreement.generateSecret();
                    EllipticCurve curve2 = eCPrivateKey.getParams().getCurve();
                    BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                    if (bigInteger2.signum() != -1 && bigInteger2.compareTo(zzmf.zzb(curve2)) < 0) {
                        zzmf.zzc(bigInteger2, true, curve2);
                        byte[] zzc = zzlx.zzc(bArr, generateSecret);
                        Mac mac = (Mac) zzmh.zzb.zza(str);
                        if (i10 <= mac.getMacLength() * 255) {
                            if (bArr2 != null && bArr2.length != 0) {
                                mac.init(new SecretKeySpec(bArr2, str));
                            } else {
                                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                            }
                            byte[] bArr4 = new byte[i10];
                            mac.init(new SecretKeySpec(mac.doFinal(zzc), str));
                            byte[] bArr5 = new byte[0];
                            int i15 = 0;
                            while (true) {
                                mac.update(bArr5);
                                mac.update((byte[]) null);
                                mac.update((byte) i13);
                                bArr5 = mac.doFinal();
                                int length4 = bArr5.length;
                                int i16 = i15 + length4;
                                if (i16 < i10) {
                                    System.arraycopy(bArr5, 0, bArr4, i15, length4);
                                    i13++;
                                    i15 = i16;
                                } else {
                                    System.arraycopy(bArr5, 0, bArr4, i15, i10 - i15);
                                    return bArr4;
                                }
                            }
                        } else {
                            throw new GeneralSecurityException("size too large");
                        }
                    } else {
                        throw new GeneralSecurityException("shared secret is out of range");
                    }
                } catch (IllegalStateException e10) {
                    throw new GeneralSecurityException(e10.toString());
                }
            } else {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e11) {
            throw new GeneralSecurityException(e11.toString());
        }
    }
}
