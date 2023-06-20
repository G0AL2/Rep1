package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzcf extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcf() {
        super(zzgu.class, new zzcd(zzan.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzg(int i10, int i11, int i12) {
        zzgw zzb = zzgx.zzb();
        zzb.zza(i10);
        zzgz zzb2 = zzha.zzb();
        zzb2.zza(16);
        zzb.zzb((zzha) zzb2.zzk());
        return new zzfd((zzgx) zzb.zzk(), i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzce(this, zzgx.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzgu.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgu zzguVar = (zzgu) zzaaqVar;
        zzna.zzc(zzguVar.zza(), 0);
        zzna.zzb(zzguVar.zzf().zzd());
        if (zzguVar.zze().zza() != 12 && zzguVar.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
