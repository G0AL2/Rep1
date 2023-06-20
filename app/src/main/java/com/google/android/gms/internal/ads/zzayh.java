package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzayh implements zzayj {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;

    public zzayh(byte[] bArr) {
        Objects.requireNonNull(bArr);
        zzayz.zzc(bArr.length > 0);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.zza, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzaylVar) throws IOException {
        this.zzb = zzaylVar.zza;
        long j10 = zzaylVar.zzc;
        int i10 = (int) j10;
        this.zzc = i10;
        long j11 = zzaylVar.zzd;
        long j12 = -1;
        if (j11 == -1) {
            j11 = this.zza.length - j10;
        } else {
            j12 = j11;
        }
        int i11 = (int) j11;
        this.zzd = i11;
        if (i11 <= 0 || i10 + i11 > this.zza.length) {
            int length = this.zza.length;
            throw new IOException("Unsatisfiable range: [" + i10 + ", " + j12 + "], length: " + length);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws IOException {
        this.zzb = null;
    }
}
