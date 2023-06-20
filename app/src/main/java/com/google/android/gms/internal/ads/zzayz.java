package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayz {
    public static int zza(int i10, int i11, int i12) {
        if (i10 < 0 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return 0;
    }

    public static String zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static void zzc(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }
}
