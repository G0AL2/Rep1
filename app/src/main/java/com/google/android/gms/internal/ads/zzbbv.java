package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbv {
    final long zza;
    final String zzb;
    final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbv(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbbv)) {
            zzbbv zzbbvVar = (zzbbv) obj;
            if (zzbbvVar.zza == this.zza && zzbbvVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
