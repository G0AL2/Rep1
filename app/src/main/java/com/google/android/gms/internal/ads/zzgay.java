package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgay extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgay() {
        super(zzgbj.class, new zzgaw(zzfwx.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzgbp zzgbpVar) throws GeneralSecurityException {
        if (zzgbpVar.zza() >= 10) {
            if (zzgbpVar.zza() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzgax(this, zzgbm.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgbj.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgbj zzgbjVar = (zzgbj) zzgmaVar;
        zzgim.zzb(zzgbjVar.zza(), 0);
        zzn(zzgbjVar.zzg().zzd());
        zzm(zzgbjVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}
