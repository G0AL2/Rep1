package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxu extends zzgar {
    final /* synthetic */ zzfxv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxu(zzfxv zzfxvVar, Class cls) {
        super(cls);
        this.zza = zzfxvVar;
    }

    public static final zzgby zzf(zzgcb zzgcbVar) throws GeneralSecurityException {
        zzgbx zzc = zzgby.zzc();
        zzc.zzb(zzgcbVar.zzg());
        zzc.zza(zzgji.zzv(zzgik.zza(zzgcbVar.zza())));
        zzc.zzc(0);
        return (zzgby) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ zzgma zza(zzgma zzgmaVar) throws GeneralSecurityException {
        return zzf((zzgcb) zzgmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgcb.zzf(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    /* renamed from: zze */
    public final void zzd(zzgcb zzgcbVar) throws GeneralSecurityException {
        zzgim.zza(zzgcbVar.zza());
        zzfxv zzfxvVar = this.zza;
        zzfxv.zzm(zzgcbVar.zzg());
    }
}
