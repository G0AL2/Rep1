package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfgt {
    public final String zza;
    public final String zzb;

    public zzfgt(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfgt) {
            zzfgt zzfgtVar = (zzfgt) obj;
            return this.zza.equals(zzfgtVar.zza) && this.zzb.equals(zzfgtVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
