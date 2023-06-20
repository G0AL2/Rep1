package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzasg {
    public static final zzasg zza = new zzasg(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    zzasg(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzasg) && Arrays.equals(this.zzb, ((zzasg) obj).zzb);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzb);
        return "AudioCapabilities[maxChannelCount=2, supportedEncodings=" + arrays + "]";
    }
}
