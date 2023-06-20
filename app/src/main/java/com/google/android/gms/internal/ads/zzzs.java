package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzzs {
    public final zzzv zza;
    public final zzzv zzb;

    public zzzs(zzzv zzzvVar, zzzv zzzvVar2) {
        this.zza = zzzvVar;
        this.zzb = zzzvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzs.class == obj.getClass()) {
            zzzs zzzsVar = (zzzs) obj;
            if (this.zza.equals(zzzsVar.zza) && this.zzb.equals(zzzsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
