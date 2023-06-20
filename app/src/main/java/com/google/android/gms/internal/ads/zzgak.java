package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgak extends zzgau {
    public zzgak() {
        super(zzgfd.class, zzgfg.class, new zzgai(zzfwm.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzg(int i10, int i11, int i12, int i13) {
        zzgez zza = zzgfa.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i12);
        zzgew zza2 = zzgex.zza();
        zza2.zza((zzgfa) zza.zzal());
        return new zzgaq((zzgex) zza2.zzal(), i13);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzgaj(this, zzgex.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgfd.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgfd zzgfdVar = (zzgfd) zzgmaVar;
        if (!zzgfdVar.zzg().zzD()) {
            if (zzgfdVar.zzk()) {
                zzgim.zzb(zzgfdVar.zza(), 0);
                zzgan.zza(zzgfdVar.zzf().zzc());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 4;
    }
}
