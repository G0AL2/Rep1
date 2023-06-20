package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzq extends zzgas {
    public zzfzq() {
        super(zzgec.class, new zzfzp(zzfwn.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgec.zzg(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgec zzgecVar = (zzgec) zzgmaVar;
        zzgim.zzb(zzgecVar.zza(), 0);
        zzfzx.zza(zzgecVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 5;
    }
}
