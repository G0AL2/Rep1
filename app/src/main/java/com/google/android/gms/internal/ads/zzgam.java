package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgam extends zzgas {
    public zzgam() {
        super(zzgfg.class, new zzgal(zzfwn.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgfg.zzg(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgfg zzgfgVar = (zzgfg) zzgmaVar;
        zzgim.zzb(zzgfgVar.zza(), 0);
        if (zzgfgVar.zzl()) {
            zzgan.zza(zzgfgVar.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 5;
    }
}
