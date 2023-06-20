package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfiw {
    private final String zza;
    private final String zzb;

    private zzfiw(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfiw zza(String str, String str2) {
        zzfjv.zza(str, "Name is null or empty");
        zzfjv.zza(str2, "Version is null or empty");
        return new zzfiw(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
