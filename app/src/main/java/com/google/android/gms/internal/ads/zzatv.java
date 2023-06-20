package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatv {
    private static final byte[] zza = new byte[4096];
    private final zzayj zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[Constants.MIN_PROGRESS_STEP];
    private int zzf;
    private int zzg;

    public zzatv(zzayj zzayjVar, long j10, long j11) {
        this.zzb = zzayjVar;
        this.zzd = j10;
        this.zzc = j11;
    }

    private final int zzj(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int zza2 = this.zzb.zza(bArr, i10 + i12, i11 - i12);
            if (zza2 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + zza2;
        }
        throw new InterruptedException();
    }

    private final int zzk(byte[] bArr, int i10, int i11) {
        int i12 = this.zzg;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.zze, 0, bArr, i10, min);
        zzn(min);
        return min;
    }

    private final int zzl(int i10) {
        int min = Math.min(this.zzg, i10);
        zzn(min);
        return min;
    }

    private final void zzm(int i10) {
        if (i10 != -1) {
            this.zzd += i10;
        }
    }

    private final void zzn(int i10) {
        int i11 = this.zzg - i10;
        this.zzg = i11;
        this.zzf = 0;
        byte[] bArr = this.zze;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[Constants.MIN_PROGRESS_STEP + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.zze = bArr2;
    }

    public final int zza(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i10, i11);
        if (zzk == 0) {
            zzk = zzj(bArr, i10, i11, 0, true);
        }
        zzm(zzk);
        return zzk;
    }

    public final int zzb(int i10) throws IOException, InterruptedException {
        int zzl = zzl(i10);
        if (zzl == 0) {
            zzl = zzj(zza, 0, Math.min(i10, 4096), 0, true);
        }
        zzm(zzl);
        return zzl;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final void zze() {
        this.zzf = 0;
    }

    public final boolean zzf(int i10, boolean z10) throws IOException, InterruptedException {
        int i11 = this.zzf + i10;
        int length = this.zze.length;
        if (i11 > length) {
            this.zze = Arrays.copyOf(this.zze, zzazo.zze(length + length, Constants.MIN_PROGRESS_STEP + i11, i11 + 524288));
        }
        int min = Math.min(this.zzg - this.zzf, i10);
        while (min < i10) {
            min = zzj(this.zze, this.zzf, i10, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i12 = this.zzf + i10;
        this.zzf = i12;
        this.zzg = Math.max(this.zzg, i12);
        return true;
    }

    public final boolean zzg(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (zzf(i11, false)) {
            System.arraycopy(this.zze, this.zzf - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    public final boolean zzh(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i10, i11);
        while (zzk < i11 && zzk != -1) {
            zzk = zzj(bArr, i10, i11, zzk, z10);
        }
        zzm(zzk);
        return zzk != -1;
    }

    public final boolean zzi(int i10, boolean z10) throws IOException, InterruptedException {
        int zzl = zzl(i10);
        while (zzl < i10 && zzl != -1) {
            zzl = zzj(zza, -zzl, Math.min(i10, zzl + 4096), zzl, false);
        }
        zzm(zzl);
        return zzl != -1;
    }
}
