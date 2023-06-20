package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfxb implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfxb zzfxbVar = (zzfxb) obj;
        int length = this.zza.length;
        int length2 = zzfxbVar.zza.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = zzfxbVar.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfxb) {
            return Arrays.equals(this.zza, ((zzfxb) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzgic.zza(this.zza);
    }
}
