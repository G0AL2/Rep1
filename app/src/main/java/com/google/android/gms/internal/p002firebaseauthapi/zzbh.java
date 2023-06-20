package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbh  reason: invalid package */
/* loaded from: classes2.dex */
final class zzbh implements Comparable {
    private final byte[] zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzbh zzbhVar = (zzbh) obj;
        int length = this.zza.length;
        int length2 = zzbhVar.zza.length;
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
            byte b11 = zzbhVar.zza[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbh) {
            return Arrays.equals(this.zza, ((zzbh) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzmr.zza(this.zza);
    }
}
