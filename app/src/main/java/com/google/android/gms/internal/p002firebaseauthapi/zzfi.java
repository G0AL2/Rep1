package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.fq;
import java.security.SecureRandom;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfi {
    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return i10;
    }
}
