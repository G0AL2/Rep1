package com.bytedance.sdk.openadsdk.utils;

import com.inmobi.media.fq;
import java.security.SecureRandom;
import java.util.UUID;

/* compiled from: PangleUUID.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f13578a = new ThreadLocal<>();

    public static String a() {
        byte[] bArr = new byte[16];
        ThreadLocal<SecureRandom> threadLocal = f13578a;
        SecureRandom secureRandom = threadLocal.get();
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
            threadLocal.set(secureRandom);
        }
        secureRandom.nextBytes(bArr);
        bArr[6] = (byte) (bArr[6] & 15);
        bArr[6] = (byte) (bArr[6] | 64);
        bArr[8] = (byte) (bArr[8] & 63);
        bArr[8] = (byte) (bArr[8] | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        }
        return new UUID(j11, j10).toString();
    }
}
