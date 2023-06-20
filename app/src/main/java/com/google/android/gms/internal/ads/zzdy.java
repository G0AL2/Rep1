package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdy {
    private byte[] zza;
    private int zzb;
    private int zzc;

    public zzdy() {
        this.zza = zzeg.zzf;
    }

    public zzdy(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzc = i10;
    }

    public final void zzA(zzdx zzdxVar, int i10) {
        zzB(zzdxVar.zza, 0, i10);
        zzdxVar.zzh(0);
    }

    public final void zzB(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zza, this.zzb, bArr, i10, i11);
        this.zzb += i11;
    }

    public final void zzC(int i10) {
        byte[] bArr = this.zza;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        zzD(bArr, i10);
    }

    public final void zzD(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = 0;
    }

    public final void zzE(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zza.length) {
            z10 = true;
        }
        zzcw.zzd(z10);
        this.zzc = i10;
    }

    public final void zzF(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzc) {
            z10 = true;
        }
        zzcw.zzd(z10);
        this.zzb = i10;
    }

    public final void zzG(int i10) {
        zzF(this.zzb + i10);
    }

    public final byte[] zzH() {
        return this.zza;
    }

    public final int zza() {
        return this.zzc - this.zzb;
    }

    public final int zzb() {
        return this.zza.length;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        this.zzb = i13 + 1;
        return (bArr[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b12 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        this.zzb = i12 + 1;
        return (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | (((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8) | ((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        this.zzb = i13 + 1;
        return ((bArr[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((b12 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final int zzh() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException("Top bit not zero: " + zzg);
    }

    public final int zzi() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        this.zzb = i11 + 1;
        return ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int zzl() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        this.zzb = i12 + 2;
        return (b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int zzm() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        this.zzb = i12 + 1;
        return (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int zzn() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException("Top bit not zero: " + zze);
    }

    public final int zzo() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        this.zzb = i11 + 1;
        return (bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final long zzp() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.zzb = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.zzb = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.zzb = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.zzb = i17;
        byte b16 = bArr[i16];
        this.zzb = i17 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((b13 & 255) << 24) | ((b14 & 255) << 32) | ((b15 & 255) << 40) | ((b16 & 255) << 48) | ((bArr[i17] & 255) << 56);
    }

    public final long zzq() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        this.zzb = i13 + 1;
        return ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public final long zzr() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        int i14 = i13 + 1;
        this.zzb = i14;
        byte b13 = bArr[i13];
        int i15 = i14 + 1;
        this.zzb = i15;
        byte b14 = bArr[i14];
        int i16 = i15 + 1;
        this.zzb = i16;
        byte b15 = bArr[i15];
        int i17 = i16 + 1;
        this.zzb = i17;
        byte b16 = bArr[i16];
        this.zzb = i17 + 1;
        return ((b11 & 255) << 48) | ((b10 & 255) << 56) | ((b12 & 255) << 40) | ((b13 & 255) << 32) | ((b14 & 255) << 24) | ((b15 & 255) << 16) | ((b16 & 255) << 8) | (bArr[i17] & 255);
    }

    public final long zzs() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        int i12 = i11 + 1;
        this.zzb = i12;
        byte b11 = bArr[i11];
        int i13 = i12 + 1;
        this.zzb = i13;
        byte b12 = bArr[i12];
        this.zzb = i13 + 1;
        return ((b11 & 255) << 16) | ((b10 & 255) << 24) | ((b12 & 255) << 8) | (bArr[i13] & 255);
    }

    public final long zzt() {
        long zzr = zzr();
        if (zzr >= 0) {
            return zzr;
        }
        throw new IllegalStateException("Top bit not zero: " + zzr);
    }

    public final long zzu() {
        int i10;
        int i11;
        byte b10;
        int i12;
        long j10 = this.zza[this.zzb];
        int i13 = 7;
        while (true) {
            i10 = 0;
            if (i13 < 0) {
                break;
            }
            if (((1 << i13) & j10) != 0) {
                i13--;
            } else if (i13 < 6) {
                j10 &= i12 - 1;
                i10 = 7 - i13;
            } else if (i13 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i11 = 1; i11 < i10; i11++) {
            if ((this.zza[this.zzb + i11] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (b10 & 63);
        }
        this.zzb += i10;
        return j10;
    }

    public final String zzv(char c10) {
        int i10 = this.zzc;
        int i11 = this.zzb;
        if (i10 - i11 != 0) {
            while (i11 < this.zzc && this.zza[i11] != 0) {
                i11++;
            }
            byte[] bArr = this.zza;
            int i12 = this.zzb;
            String zzI = zzeg.zzI(bArr, i12, i11 - i12);
            this.zzb = i11;
            if (i11 < this.zzc) {
                this.zzb = i11 + 1;
            }
            return zzI;
        }
        return null;
    }

    public final String zzw(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzb;
        int i12 = (i11 + i10) - 1;
        String zzI = zzeg.zzI(this.zza, i11, (i12 >= this.zzc || this.zza[i12] != 0) ? i10 : i10 - 1);
        this.zzb += i10;
        return zzI;
    }

    public final String zzx(int i10, Charset charset) {
        byte[] bArr = this.zza;
        int i11 = this.zzb;
        String str = new String(bArr, i11, i10, charset);
        this.zzb = i11 + i10;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        this.zzb = i11 + 1;
        return (short) ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final void zzz(int i10) {
        byte[] bArr = this.zza;
        if (i10 > bArr.length) {
            this.zza = Arrays.copyOf(bArr, i10);
        }
    }

    public zzdy(int i10) {
        this.zza = new byte[i10];
        this.zzc = i10;
    }

    public zzdy(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
