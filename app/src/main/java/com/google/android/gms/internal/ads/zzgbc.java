package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgbc {
    @Deprecated
    public static final zzggs zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        new zzgbb();
        zzggs zzc2 = zzggs.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxk.zzn(new zzgbf());
        zzfxk.zzm(new zzgbb(), true);
        if (zzfzf.zzb()) {
            return;
        }
        zzfxk.zzm(new zzgay(), true);
    }
}
