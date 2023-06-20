package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzx {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzx(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzx.class == obj.getClass()) {
            zzzx zzzxVar = (zzzx) obj;
            if (this.zza == zzzxVar.zza && this.zzc == zzzxVar.zzc && this.zzd == zzzxVar.zzd && Arrays.equals(this.zzb, zzzxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
