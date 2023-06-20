package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzef  reason: invalid package */
/* loaded from: classes2.dex */
final class zzef implements zzma {
    private final String zza;
    private final int zzb;
    private zzhd zzc;
    private zzgf zzd;
    private int zze;
    private zzhp zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzef(zzke zzkeVar) throws GeneralSecurityException {
        String zze = zzkeVar.zze();
        this.zza = zze;
        if (zze.equals(zzbs.zzb)) {
            try {
                zzhg zzd = zzhg.zzd(zzkeVar.zzd(), zzyy.zza());
                this.zzc = (zzhd) zzbq.zzd(zzkeVar);
                this.zzb = zzd.zza();
            } catch (zzzt e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (zze.equals(zzbs.zza)) {
            try {
                zzgi zzc = zzgi.zzc(zzkeVar.zzd(), zzyy.zza());
                this.zzd = (zzgf) zzbq.zzd(zzkeVar);
                this.zze = zzc.zzd().zza();
                this.zzb = this.zze + zzc.zze().zza();
            } catch (zzzt e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (zze.equals(zzdq.zza)) {
            try {
                zzhs zzd2 = zzhs.zzd(zzkeVar.zzd(), zzyy.zza());
                this.zzf = (zzhp) zzbq.zzd(zzkeVar);
                this.zzb = zzd2.zza();
            } catch (zzzt e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zze)));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzma
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzma
    public final zzev zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.zzb) {
            if (this.zza.equals(zzbs.zzb)) {
                zzhc zzb = zzhd.zzb();
                zzb.zzj(this.zzc);
                zzb.zza(zzyi.zzo(bArr, 0, this.zzb));
                return new zzev((zzan) zzbq.zzh(this.zza, (zzhd) zzb.zzk(), zzan.class));
            } else if (this.zza.equals(zzbs.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                zzgk zzb2 = zzgl.zzb();
                zzb2.zzj(this.zzd.zze());
                zzb2.zza(zzyi.zzn(copyOfRange));
                zzjb zzb3 = zzjc.zzb();
                zzb3.zzj(this.zzd.zzf());
                zzb3.zza(zzyi.zzn(copyOfRange2));
                zzge zzb4 = zzgf.zzb();
                zzb4.zzc(this.zzd.zza());
                zzb4.zza((zzgl) zzb2.zzk());
                zzb4.zzb((zzjc) zzb3.zzk());
                return new zzev((zzan) zzbq.zzh(this.zza, (zzgf) zzb4.zzk(), zzan.class));
            } else if (this.zza.equals(zzdq.zza)) {
                zzho zzb5 = zzhp.zzb();
                zzb5.zzj(this.zzf);
                zzb5.zza(zzyi.zzo(bArr, 0, this.zzb));
                return new zzev((zzar) zzbq.zzh(this.zza, (zzhp) zzb5.zzk(), zzar.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
