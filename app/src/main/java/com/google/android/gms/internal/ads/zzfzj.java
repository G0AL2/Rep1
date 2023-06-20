package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzj {
    public static final String zza;
    @Deprecated
    public static final zzggs zzb;
    @Deprecated
    public static final zzggs zzc;

    static {
        new zzfzi();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzggs.zzc();
        zzc = zzggs.zzc();
        try {
            zzfxk.zzn(new zzfzl());
            if (zzfzf.zzb()) {
                return;
            }
            zzfxk.zzm(new zzfzi(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
