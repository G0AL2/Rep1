package com.google.android.gms.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class VersionInfo {
    protected int zza;
    protected int zzb;
    protected int zzc;

    public VersionInfo(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }
}
