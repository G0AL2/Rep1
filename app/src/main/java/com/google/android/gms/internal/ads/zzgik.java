package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgik {
    private static final ThreadLocal zza = new zzgij();

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
