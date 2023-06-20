package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmy {
    private static final ThreadLocal zza = new zzmx();

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
