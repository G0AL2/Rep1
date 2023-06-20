package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcp {
    public zzfcp() {
        try {
            zzfxm.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgjf zzt = zzgji.zzt();
        try {
            zzfwj.zzb(zzfwt.zzb(zzfws.zza("AES128_GCM")), zzfwh.zzb(zzt));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdwc zzdwcVar) {
        zzfwt zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfwf) zzc.zzd(zzfwf.class)).zza(bArr, bArr2);
            zzdwcVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CryptoUtils.decrypt");
            zzdwcVar.zza().put("df", e10.toString());
            return null;
        }
    }

    private static final zzfwt zzc(String str) {
        try {
            return zzfwj.zza(zzfwg.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
