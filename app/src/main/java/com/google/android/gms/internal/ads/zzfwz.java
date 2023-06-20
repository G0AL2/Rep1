package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwz {
    private final Object zza;
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwz(Object obj, byte[] bArr, int i10, int i11, int i12) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final Object zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
