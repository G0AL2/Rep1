package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcv {
    public static final zzcv zza = new zzcv(0, 0, 0, 1.0f);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzcu
    };
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final float zzf;

    public zzcv(int i10, int i11, int i12, float f10) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcv) {
            zzcv zzcvVar = (zzcv) obj;
            if (this.zzc == zzcvVar.zzc && this.zzd == zzcvVar.zzd && this.zze == zzcvVar.zze && this.zzf == zzcvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
