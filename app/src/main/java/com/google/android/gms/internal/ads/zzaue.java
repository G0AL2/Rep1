package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaue {
    public final int zza = 1;
    public final byte[] zzb;

    public zzaue(int i10, byte[] bArr) {
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaue.class == obj.getClass() && Arrays.equals(this.zzb, ((zzaue) obj).zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzb) + 31;
    }
}
