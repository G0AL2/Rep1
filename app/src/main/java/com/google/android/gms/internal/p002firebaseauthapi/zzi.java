package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzi  reason: invalid package */
/* loaded from: classes2.dex */
final class zzi extends zzh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(char c10) {
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = 46;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
