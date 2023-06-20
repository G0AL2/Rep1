package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxs extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxs() {
        super(zzgbs.class, new zzfxq(zzfwf.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzgca zzc = zzgcb.zzc();
        zzgcd zzc2 = zzgce.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgce) zzc2.zzal());
        zzc.zza(i10);
        zzgeo zzc3 = zzgep.zzc();
        zzger zzc4 = zzges.zzc();
        zzc4.zzb(5);
        zzc4.zza(i13);
        zzc3.zzb((zzges) zzc4.zzal());
        zzc3.zza(32);
        zzgbu zza = zzgbv.zza();
        zza.zza((zzgcb) zzc.zzal());
        zza.zzb((zzgep) zzc3.zzal());
        return new zzgaq((zzgbv) zza.zzal(), i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfxr(this, zzgbv.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgbs.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgbs zzgbsVar = (zzgbs) zzgmaVar;
        zzgim.zzb(zzgbsVar.zza(), 0);
        new zzfxv();
        zzfxv.zzh(zzgbsVar.zzf());
        new zzgbb();
        zzgbb.zzh(zzgbsVar.zzg());
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
