package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmv {
    public static final zzmv zza = new zzmv(new int[]{2}, 8);
    private static final zzmv zzb = new zzmv(new int[]{2, 5, 6}, 8);
    private final int[] zzc;
    private final int zzd;

    public zzmv(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
        this.zzd = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzmv) && Arrays.equals(this.zzc, ((zzmv) obj).zzc);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzc) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzc);
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + arrays + "]";
    }

    public final boolean zza(int i10) {
        return Arrays.binarySearch(this.zzc, i10) >= 0;
    }
}
