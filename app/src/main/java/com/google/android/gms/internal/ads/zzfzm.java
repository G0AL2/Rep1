package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfzm extends zzgat {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final /* bridge */ /* synthetic */ Object zza(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgdz zzgdzVar = (zzgdz) zzgmaVar;
        zzgdw zzc = zzgdzVar.zzf().zzc();
        zzgef zzf = zzc.zzf();
        int zzc2 = zzfzx.zzc(zzf.zzg());
        byte[] zzE = zzgdzVar.zzg().zzE();
        return new zzghl((ECPrivateKey) ((KeyFactory) zzghs.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzE), zzghq.zze(zzc2))), zzf.zze().zzE(), zzfzx.zzb(zzf.zzh()), zzfzx.zzd(zzc.zzi()), new zzfzy(zzc.zza().zze()));
    }
}
