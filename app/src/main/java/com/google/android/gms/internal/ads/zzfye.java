package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfye extends zzgas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfye() {
        super(zzgcw.class, new zzfyc(zzfwf.class));
    }

    public static void zzg(boolean z10) throws GeneralSecurityException {
        if (zzm()) {
            zzfxk.zzm(new zzfye(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgaq zzh(int i10, int i11) {
        zzgcy zzc = zzgcz.zzc();
        zzc.zza(i10);
        return new zzgaq((zzgcz) zzc.zzal(), i11);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new zzfyd(this, zzgcz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* synthetic */ zzgma zzb(zzgji zzgjiVar) throws zzglc {
        return zzgcw.zze(zzgjiVar, zzgkc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final /* bridge */ /* synthetic */ void zzd(zzgma zzgmaVar) throws GeneralSecurityException {
        zzgcw zzgcwVar = (zzgcw) zzgmaVar;
        zzgim.zzb(zzgcwVar.zza(), 0);
        zzgim.zza(zzgcwVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }
}
