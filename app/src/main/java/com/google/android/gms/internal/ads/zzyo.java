package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyo {
    public final String zza;

    private zzyo(int i10, int i11, String str) {
        this.zza = str;
    }

    public static zzyo zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        int i10 = zzk >> 1;
        int zzk2 = (zzdyVar.zzk() >> 3) | ((zzk & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = zzk2 < 10 ? ".0" : ".";
        return new zzyo(i10, zzk2, str + ".0" + i10 + str2 + zzk2);
    }
}
