package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdt  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdt extends zzff {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzff
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws GeneralSecurityException {
        zzim zzimVar = (zzim) obj;
        zzij zzb = zzimVar.zze().zzb();
        zzis zze = zzb.zze();
        int zzc = zzee.zzc(zze.zzf());
        byte[] zzt = zzimVar.zzf().zzt();
        return new zzmb((ECPrivateKey) ((KeyFactory) zzmh.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, zzt), zzmf.zzf(zzc))), zze.zzd().zzt(), zzee.zzb(zze.zzg()), zzee.zzd(zzb.zzh()), new zzef(zzb.zza().zzd()));
    }
}
