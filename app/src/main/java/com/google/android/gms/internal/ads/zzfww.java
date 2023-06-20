package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfww {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwv zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwv zzfwvVar = (zzfwv) it.next();
            if (zzfwvVar.zza()) {
                return zzfwvVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
