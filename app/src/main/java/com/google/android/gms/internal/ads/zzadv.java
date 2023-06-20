package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
class zzadv {
    public final int zzd;

    public zzadv(int i10) {
        this.zzd = i10;
    }

    public static int zze(int i10) {
        return (i10 >> 24) & 255;
    }

    public static String zzf(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}
