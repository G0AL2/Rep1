package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfyb extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyb() {
        super(zzgcq.class, new zzfxz(zzfwf.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzg(int i10, int i11) {
        zzgcs zzc = zzgct.zzc();
        zzc.zza(i10);
        return new zzgaq((zzgct) zzc.zzal(), i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfya(this, zzgct.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgcq.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgcq zzgcqVar = (zzgcq) zzgmaVar;
        zzgim.zzb(zzgcqVar.zza(), 0);
        zzgim.zza(zzgcqVar.zzf().zzd());
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
