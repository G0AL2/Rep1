package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfoe extends zzfod {
    private final char zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoe(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i10 = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final boolean zzb(char c10) {
        return c10 == this.zza;
    }
}
