package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzy implements zzghk {
    private final String zza;
    private final int zzb;
    private zzgcq zzc;
    private zzgbs zzd;
    private int zze;
    private zzgdc zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzy(zzgfo zzgfoVar) throws GeneralSecurityException {
        String zzf = zzgfoVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzfxm.zzb)) {
            try {
                zzgct zze = zzgct.zze(zzgfoVar.zze(), zzgkc.zza());
                this.zzc = (zzgcq) zzfxk.zzd(zzgfoVar);
                this.zzb = zze.zza();
            } catch (zzglc e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        } else if (zzf.equals(zzfxm.zza)) {
            try {
                zzgbv zzd = zzgbv.zzd(zzgfoVar.zze(), zzgkc.zza());
                this.zzd = (zzgbs) zzfxk.zzd(zzgfoVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
            } catch (zzglc e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        } else if (zzf.equals(zzfzj.zza)) {
            try {
                zzgdf zze2 = zzgdf.zze(zzgfoVar.zze(), zzgkc.zza());
                this.zzf = (zzgdc) zzfxk.zzd(zzgfoVar);
                this.zzb = zze2.zza();
            } catch (zzglc e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghk
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghk
    public final zzgap zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.zzb) {
            if (this.zza.equals(zzfxm.zzb)) {
                zzgcp zzc = zzgcq.zzc();
                zzc.zzaj(this.zzc);
                zzc.zza(zzgji.zzw(bArr, 0, this.zzb));
                return new zzgap((zzfwf) zzfxk.zzg(this.zza, (zzgcq) zzc.zzal(), zzfwf.class));
            } else if (this.zza.equals(zzfxm.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                zzgbx zzc2 = zzgby.zzc();
                zzc2.zzaj(this.zzd.zzf());
                zzc2.zza(zzgji.zzv(copyOfRange));
                zzgel zzc3 = zzgem.zzc();
                zzc3.zzaj(this.zzd.zzg());
                zzc3.zza(zzgji.zzv(copyOfRange2));
                zzgbr zzc4 = zzgbs.zzc();
                zzc4.zzc(this.zzd.zza());
                zzc4.zza((zzgby) zzc2.zzal());
                zzc4.zzb((zzgem) zzc3.zzal());
                return new zzgap((zzfwf) zzfxk.zzg(this.zza, (zzgbs) zzc4.zzal(), zzfwf.class));
            } else if (this.zza.equals(zzfzj.zza)) {
                zzgdb zzc5 = zzgdc.zzc();
                zzc5.zzaj(this.zzf);
                zzc5.zza(zzgji.zzw(bArr, 0, this.zzb));
                return new zzgap((zzfwl) zzfxk.zzg(this.zza, (zzgdc) zzc5.zzal(), zzfwl.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
