package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgav {
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
