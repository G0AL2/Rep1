package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdv extends zzfh {
    private static final byte[] zza = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv() {
        super(zzim.class, zzip.class, new zzdt(zzas.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzi(int i10, int i11, int i12, zzax zzaxVar, byte[] bArr, int i13) {
        zzif zza2 = zzig.zza();
        zzir zza3 = zzis.zza();
        int i14 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzyi.zzn(bArr));
        zzis zzisVar = (zzis) zza3.zzk();
        zzkd zza4 = zzke.zza();
        zza4.zza(zzaxVar.zzb());
        zza4.zzb(zzyi.zzn(zzaxVar.zzc()));
        int zzd = zzaxVar.zzd() - 1;
        if (zzd == 0) {
            i14 = 3;
        } else if (zzd != 1) {
            i14 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i14);
        zzic zza5 = zzid.zza();
        zza5.zza((zzke) zza4.zzk());
        zzii zzb = zzij.zzb();
        zzb.zzb(zzisVar);
        zzb.zza((zzid) zza5.zzk());
        zzb.zzc(i12);
        zza2.zza((zzij) zzb.zzk());
        return new zzfd((zzig) zza2.zzk(), i13);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzdu(this, zzig.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzim.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzim zzimVar = (zzim) zzaaqVar;
        if (!zzimVar.zzf().zzs()) {
            zzna.zzc(zzimVar.zza(), 0);
            zzee.zza(zzimVar.zze().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfh
    public final /* synthetic */ zzaaq zzg(zzaaq zzaaqVar) throws GeneralSecurityException {
        return ((zzim) zzaaqVar).zze();
    }
}
