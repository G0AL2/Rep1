package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfxy extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxy() {
        super(zzgch.class, new zzfxw(zzfwf.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzg(int i10, int i11, int i12) {
        zzgcj zzc = zzgck.zzc();
        zzc.zza(i10);
        zzgcm zzc2 = zzgcn.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgcn) zzc2.zzal());
        return new zzgaq((zzgck) zzc.zzal(), i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfxx(this, zzgck.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgch.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgch zzgchVar = (zzgch) zzgmaVar;
        zzgim.zzb(zzgchVar.zza(), 0);
        zzgim.zza(zzgchVar.zzg().zzd());
        if (zzgchVar.zzf().zza() != 12 && zzgchVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}
