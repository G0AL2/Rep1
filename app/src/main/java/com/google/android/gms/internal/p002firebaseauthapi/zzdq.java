package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdq {
    public static final String zza;
    @Deprecated
    public static final zzli zzb;
    @Deprecated
    public static final zzli zzc;

    static {
        new zzdp();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzli.zzb();
        zzc = zzli.zzb();
        try {
            zzbq.zzn(new zzds());
            if (zzdm.zzb()) {
                return;
            }
            zzbq.zzm(new zzdp(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
