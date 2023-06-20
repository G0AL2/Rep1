package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbz extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbz() {
        super(zzgf.class, new zzbx(zzan.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzgn zzb = zzgo.zzb();
        zzgq zzb2 = zzgr.zzb();
        zzb2.zza(16);
        zzb.zzb((zzgr) zzb2.zzk());
        zzb.zza(i10);
        zzje zzb3 = zzjf.zzb();
        zzjh zzb4 = zzji.zzb();
        zzb4.zzb(5);
        zzb4.zza(i13);
        zzb3.zzb((zzji) zzb4.zzk());
        zzb3.zza(32);
        zzgh zza = zzgi.zza();
        zza.zza((zzgo) zzb.zzk());
        zza.zzb((zzjf) zzb3.zzk());
        return new zzfd((zzgi) zza.zzk(), i15);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzby(this, zzgi.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzgf.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzgf zzgfVar = (zzgf) zzaaqVar;
        zzna.zzc(zzgfVar.zza(), 0);
        new zzcc();
        zzcc.zzh(zzgfVar.zze());
        new zzfo();
        zzfo.zzh(zzgfVar.zzf());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
