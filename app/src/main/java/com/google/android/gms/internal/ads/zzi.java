package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzi {
    public static final zzi zza = new zzi(0, 0, 1, 1, 0, null);
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zze
    };
    public final int zzc = 1;
    private AudioAttributes zzd;

    /* synthetic */ zzi(int i10, int i11, int i12, int i13, int i14, zzh zzhVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final AudioAttributes zza() {
        if (this.zzd == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i10 = zzeg.zza;
            if (i10 >= 29) {
                zzf.zza(usage, 1);
            }
            if (i10 >= 32) {
                zzg.zza(usage, 0);
            }
            this.zzd = usage.build();
        }
        return this.zzd;
    }
}
