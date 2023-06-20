package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxv extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxv() {
        super(zzgby.class, new zzfxt(zzgie.class));
    }

    public static final void zzh(zzgby zzgbyVar) throws GeneralSecurityException {
        zzgim.zzb(zzgbyVar.zza(), 0);
        zzgim.zza(zzgbyVar.zzh().zzd());
        zzm(zzgbyVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgce zzgceVar) throws GeneralSecurityException {
        if (zzgceVar.zza() < 12 || zzgceVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfxu(this, zzgcb.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgby.zzf(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzh((zzgby) zzgmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}
