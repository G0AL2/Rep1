package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbd {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzbc zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzbc zzbcVar = (zzbc) it.next();
            if (zzbcVar.zzb(str)) {
                return zzbcVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
