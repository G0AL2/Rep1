package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfws {
    public static zzfwr zza(String str) throws GeneralSecurityException {
        if (zzfxk.zzj().containsKey(str)) {
            return (zzfwr) zzfxk.zzj().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
