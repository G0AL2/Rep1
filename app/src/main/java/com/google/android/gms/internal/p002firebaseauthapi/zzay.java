package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzay  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzay {
    public static zzax zza(String str) throws GeneralSecurityException {
        if (zzbq.zzk().containsKey(str)) {
            return (zzax) zzbq.zzk().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
