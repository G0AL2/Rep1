package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbb extends zzgas {
    public zzgbb() {
        super(zzgem.class, new zzgaz(zzfwx.class));
    }

    public static final void zzh(zzgem zzgemVar) throws GeneralSecurityException {
        zzgim.zzb(zzgemVar.zza(), 0);
        if (zzgemVar.zzh().zzd() >= 16) {
            zzn(zzgemVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzm(int i10, int i11, int i12, int i13) {
        zzgeo zzc = zzgep.zzc();
        zzger zzc2 = zzges.zzc();
        zzc2.zzb(i12);
        zzc2.zza(i11);
        zzc.zzb((zzges) zzc2.zzal());
        zzc.zza(i10);
        return new zzgaq((zzgep) zzc.zzal(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzges zzgesVar) throws GeneralSecurityException {
        if (zzgesVar.zza() >= 10) {
            int zzg = zzgesVar.zzg() - 2;
            if (zzg == 1) {
                if (zzgesVar.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 2) {
                if (zzgesVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 3) {
                if (zzgesVar.zza() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 4) {
                if (zzgesVar.zza() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 5) {
                if (zzgesVar.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzgba(this, zzgep.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgem.zzf(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzh((zzgem) zzgmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}
