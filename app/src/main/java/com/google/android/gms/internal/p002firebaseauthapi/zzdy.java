package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzdy {
    @Deprecated
    public static final zzli zza;
    @Deprecated
    public static final zzli zzb;
    @Deprecated
    public static final zzli zzc;

    static {
        new zzdx();
        new zzdv();
        zza = zzli.zzb();
        zzb = zzli.zzb();
        zzc = zzli.zzb();
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbq.zzn(new zzea());
        zzbq.zzn(new zzec());
        zzbs.zza();
        if (zzdm.zzb()) {
            return;
        }
        zzbq.zzl(new zzdv(), new zzdx(), true);
        zzbq.zzl(new zzeq(), new zzes(), true);
    }
}
