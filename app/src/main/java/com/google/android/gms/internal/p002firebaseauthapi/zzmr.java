package com.google.android.gms.internal.p002firebaseauthapi;

import com.inmobi.media.fq;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmr {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            sb2.append("0123456789abcdef".charAt(i10 >> 4));
            sb2.append("0123456789abcdef".charAt(i10 & 15));
        }
        return sb2.toString();
    }
}
