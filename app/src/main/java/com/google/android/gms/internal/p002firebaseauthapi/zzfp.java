package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfp {
    @Deprecated
    public static final zzli zza;
    @Deprecated
    public static final zzli zzb;
    @Deprecated
    public static final zzli zzc;

    static {
        new zzfo();
        zzli zzb2 = zzli.zzb();
        zza = zzb2;
        zzb = zzb2;
        zzc = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbq.zzn(new zzfs());
        zzbq.zzm(new zzfo(), true);
        if (zzdm.zzb()) {
            return;
        }
        zzbq.zzm(new zzfl(), true);
    }
}
