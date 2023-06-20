package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzr {
    @Deprecated
    public static final zzggs zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        new zzfzq();
        new zzfzo();
        zza = zzggs.zzc();
        zzb = zzggs.zzc();
        zzc = zzggs.zzc();
        try {
            zzfxk.zzn(new zzfzt());
            zzfxk.zzn(new zzfzw());
            zzfxm.zza();
            if (zzfzf.zzb()) {
                return;
            }
            zzfxk.zzk(new zzfzo(), new zzfzq(), true);
            zzfxk.zzk(new zzgak(), new zzgam(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
