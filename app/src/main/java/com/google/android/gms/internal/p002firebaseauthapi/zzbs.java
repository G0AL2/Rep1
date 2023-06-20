package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbs {
    public static final String zza;
    public static final String zzb;
    @Deprecated
    public static final zzli zzc;
    @Deprecated
    public static final zzli zzd;
    @Deprecated
    public static final zzli zze;

    static {
        new zzbz();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzci();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzcl();
        new zzcf();
        new zzcr();
        new zzcv();
        new zzco();
        new zzcy();
        zzli zzb2 = zzli.zzb();
        zzc = zzb2;
        zzd = zzb2;
        zze = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbq.zzn(new zzbw());
        zzfp.zza();
        zzbq.zzm(new zzbz(), true);
        zzbq.zzm(new zzci(), true);
        if (zzdm.zzb()) {
            return;
        }
        zzbq.zzm(new zzcf(), true);
        zzcl.zzg(true);
        zzbq.zzm(new zzco(), true);
        zzbq.zzm(new zzcr(), true);
        zzbq.zzm(new zzcv(), true);
        zzbq.zzm(new zzcy(), true);
    }
}
