package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzev {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbc.zzb("media3.datasource");
    }

    private zzev(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10 + j11;
        boolean z10 = false;
        zzcw.zzd(j13 >= 0);
        zzcw.zzd(j11 >= 0);
        long j14 = -1;
        if (j12 > 0) {
            j14 = j12;
        } else if (j12 != -1) {
            j14 = j12;
            zzcw.zzd(z10);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j11;
            this.zze = j13;
            this.zzg = j14;
            this.zzh = null;
            this.zzi = i11;
        }
        z10 = true;
        zzcw.zzd(z10);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j11;
        this.zze = j13;
        this.zzg = j14;
        this.zzh = null;
        this.zzi = i11;
    }

    public static String zza(int i10) {
        return "GET";
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j10 = this.zzf;
        long j11 = this.zzg;
        int i10 = this.zzi;
        return "DataSpec[" + zza(1) + " " + valueOf + ", " + j10 + ", " + j11 + ", null, " + i10 + "]";
    }

    public final boolean zzb(int i10) {
        return (this.zzi & i10) == i10;
    }

    @Deprecated
    public zzev(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        this(uri, j10 - j11, 1, null, Collections.emptyMap(), j11, j12, null, i10, null);
    }
}
