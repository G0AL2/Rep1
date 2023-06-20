package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfzf {
    private static final Logger zza = Logger.getLogger(zzfzf.class.getName());
    private static final AtomicBoolean zzb = new AtomicBoolean(false);

    private zzfzf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean zza() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zza.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean zzb() {
        return zzb.get();
    }
}
