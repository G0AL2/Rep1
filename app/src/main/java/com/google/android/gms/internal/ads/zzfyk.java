package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfyk extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyk() {
        super(zzgge.class, new zzfyi(zzfwf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfyj(this, zzggh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgge.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgim.zzb(((zzgge) zzgmaVar).zza(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 6;
    }
}
