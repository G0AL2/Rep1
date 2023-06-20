package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zztj {
    private final zzdy zza = new zzdy(32);
    private zzti zzb;
    private zzti zzc;
    private zzti zzd;
    private long zze;
    private final zzvv zzf;

    public zztj(zzvv zzvvVar, byte[] bArr) {
        this.zzf = zzvvVar;
        zzti zztiVar = new zzti(0L, Constants.MIN_PROGRESS_STEP);
        this.zzb = zztiVar;
        this.zzc = zztiVar;
        this.zzd = zztiVar;
    }

    private final int zzi(int i10) {
        zzti zztiVar = this.zzd;
        if (zztiVar.zzc == null) {
            zzvo zzb = this.zzf.zzb();
            zzti zztiVar2 = new zzti(this.zzd.zzb, Constants.MIN_PROGRESS_STEP);
            zztiVar.zzc = zzb;
            zztiVar.zzd = zztiVar2;
        }
        return Math.min(i10, (int) (this.zzd.zzb - this.zze));
    }

    private static zzti zzj(zzti zztiVar, long j10) {
        while (j10 >= zztiVar.zzb) {
            zztiVar = zztiVar.zzd;
        }
        return zztiVar;
    }

    private static zzti zzk(zzti zztiVar, long j10, ByteBuffer byteBuffer, int i10) {
        zzti zzj = zzj(zztiVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (zzj.zzb - j10));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzl(zzti zztiVar, long j10, byte[] bArr, int i10) {
        zzti zzj = zzj(zztiVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (zzj.zzb - j10));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzm(zzti zztiVar, zzgb zzgbVar, zztl zztlVar, zzdy zzdyVar) {
        zzti zztiVar2;
        int i10;
        if (zzgbVar.zzk()) {
            long j10 = zztlVar.zzb;
            zzdyVar.zzC(1);
            zzti zzl = zzl(zztiVar, j10, zzdyVar.zzH(), 1);
            long j11 = j10 + 1;
            byte b10 = zzdyVar.zzH()[0];
            int i11 = b10 & 128;
            int i12 = b10 & Byte.MAX_VALUE;
            zzfy zzfyVar = zzgbVar.zza;
            byte[] bArr = zzfyVar.zza;
            if (bArr == null) {
                zzfyVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztiVar2 = zzl(zzl, j11, zzfyVar.zza, i12);
            long j12 = j11 + i12;
            if (i11 != 0) {
                zzdyVar.zzC(2);
                zztiVar2 = zzl(zztiVar2, j12, zzdyVar.zzH(), 2);
                j12 += 2;
                i10 = zzdyVar.zzo();
            } else {
                i10 = 1;
            }
            int[] iArr = zzfyVar.zzd;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfyVar.zze;
            if (iArr3 == null || iArr3.length < i10) {
                iArr3 = new int[i10];
            }
            int[] iArr4 = iArr3;
            if (i11 != 0) {
                int i13 = i10 * 6;
                zzdyVar.zzC(i13);
                zztiVar2 = zzl(zztiVar2, j12, zzdyVar.zzH(), i13);
                j12 += i13;
                zzdyVar.zzF(0);
                for (int i14 = 0; i14 < i10; i14++) {
                    iArr2[i14] = zzdyVar.zzo();
                    iArr4[i14] = zzdyVar.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztlVar.zza - ((int) (j12 - zztlVar.zzb));
            }
            zzzx zzzxVar = zztlVar.zzc;
            int i15 = zzeg.zza;
            zzfyVar.zzc(i10, iArr2, iArr4, zzzxVar.zzb, zzfyVar.zza, zzzxVar.zza, zzzxVar.zzc, zzzxVar.zzd);
            long j13 = zztlVar.zzb;
            int i16 = (int) (j12 - j13);
            zztlVar.zzb = j13 + i16;
            zztlVar.zza -= i16;
        } else {
            zztiVar2 = zztiVar;
        }
        if (zzgbVar.zze()) {
            zzdyVar.zzC(4);
            zzti zzl2 = zzl(zztiVar2, zztlVar.zzb, zzdyVar.zzH(), 4);
            int zzn = zzdyVar.zzn();
            zztlVar.zzb += 4;
            zztlVar.zza -= 4;
            zzgbVar.zzi(zzn);
            zzti zzk = zzk(zzl2, zztlVar.zzb, zzgbVar.zzb, zzn);
            zztlVar.zzb += zzn;
            int i17 = zztlVar.zza - zzn;
            zztlVar.zza = i17;
            ByteBuffer byteBuffer = zzgbVar.zze;
            if (byteBuffer != null && byteBuffer.capacity() >= i17) {
                zzgbVar.zze.clear();
            } else {
                zzgbVar.zze = ByteBuffer.allocate(i17);
            }
            return zzk(zzk, zztlVar.zzb, zzgbVar.zze, zztlVar.zza);
        }
        zzgbVar.zzi(zztlVar.zza);
        return zzk(zztiVar2, zztlVar.zzb, zzgbVar.zzb, zztlVar.zza);
    }

    private final void zzn(int i10) {
        long j10 = this.zze + i10;
        this.zze = j10;
        zzti zztiVar = this.zzd;
        if (j10 == zztiVar.zzb) {
            this.zzd = zztiVar.zzd;
        }
    }

    public final int zza(zzp zzpVar, int i10, boolean z10) throws IOException {
        int zzi = zzi(i10);
        zzti zztiVar = this.zzd;
        int zza = zzpVar.zza(zztiVar.zzc.zza, zztiVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j10) {
        zzti zztiVar;
        if (j10 != -1) {
            while (true) {
                zztiVar = this.zzb;
                if (j10 < zztiVar.zzb) {
                    break;
                }
                this.zzf.zzc(zztiVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztiVar.zza) {
                this.zzc = zztiVar;
            }
        }
    }

    public final void zzd(zzgb zzgbVar, zztl zztlVar) {
        zzm(this.zzc, zzgbVar, zztlVar, this.zza);
    }

    public final void zze(zzgb zzgbVar, zztl zztlVar) {
        this.zzc = zzm(this.zzc, zzgbVar, zztlVar, this.zza);
    }

    public final void zzf() {
        zzti zztiVar = this.zzb;
        if (zztiVar.zzc != null) {
            this.zzf.zzd(zztiVar);
            zztiVar.zzb();
        }
        this.zzb.zze(0L, Constants.MIN_PROGRESS_STEP);
        zzti zztiVar2 = this.zzb;
        this.zzc = zztiVar2;
        this.zzd = zztiVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i10) {
        while (i10 > 0) {
            int zzi = zzi(i10);
            zzti zztiVar = this.zzd;
            zzdyVar.zzB(zztiVar.zzc.zza, zztiVar.zza(this.zze), zzi);
            i10 -= zzi;
            zzn(zzi);
        }
    }
}
