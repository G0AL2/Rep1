package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayl {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayl(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = false;
        zzayz.zzc(j10 >= 0);
        zzayz.zzc(j11 >= 0);
        if (j12 <= 0) {
            j12 = j12 == -1 ? -1L : j12;
            zzayz.zzc(z10);
            this.zza = uri;
            this.zzb = j10;
            this.zzc = j11;
            this.zzd = j12;
        }
        z10 = true;
        zzayz.zzc(z10);
        this.zza = uri;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j10 = this.zzb;
        long j11 = this.zzc;
        long j12 = this.zzd;
        return "DataSpec[" + valueOf + ", " + arrays + ", " + j10 + ", " + j11 + ", " + j12 + ", null, 0]";
    }
}
