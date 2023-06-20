package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzcl extends zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl() {
        super(zzhj.class, new zzcj(zzan.class));
    }

    public static void zzg(boolean z10) throws GeneralSecurityException {
        if (zzi()) {
            zzbq.zzm(new zzcl(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfd zzh(int i10, int i11) {
        zzhl zzb = zzhm.zzb();
        zzb.zza(i10);
        return new zzfd((zzhm) zzb.zzk(), i11);
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final zzfe zza() {
        return new zzck(this, zzhm.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* synthetic */ zzaaq zzb(zzyi zzyiVar) throws zzzt {
        return zzhj.zzd(zzyiVar, zzyy.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final /* bridge */ /* synthetic */ void zzd(zzaaq zzaaqVar) throws GeneralSecurityException {
        zzhj zzhjVar = (zzhj) zzaaqVar;
        zzna.zzc(zzhjVar.zza(), 0);
        zzna.zzb(zzhjVar.zze().zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzfg
    public final int zzf() {
        return 3;
    }
}
