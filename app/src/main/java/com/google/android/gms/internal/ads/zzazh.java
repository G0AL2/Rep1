package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazh {
    public byte[] zza;
    private int zzb;
    private int zzc;

    public zzazh() {
    }

    public zzazh(int i10) {
        this.zza = new byte[i10];
        this.zzc = i10;
    }

    public final int zza() {
        return this.zzc - this.zzb;
    }

    public final int zzb() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
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
        this.zzb = i11 + 1;
        return ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int zzg() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int zzh() {
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

    public final int zzi() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException("Top bit not zero: " + zze);
    }

    public final int zzj() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        this.zzb = i11 + 1;
        return (bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final long zzk() {
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

    public final long zzl() {
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

    public final long zzm() {
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

    public final long zzn() {
        long zzl = zzl();
        if (zzl >= 0) {
            return zzl;
        }
        throw new IllegalStateException("Top bit not zero: " + zzl);
    }

    public final String zzo(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.zzb;
        int i12 = i11 + i10;
        int i13 = i12 - 1;
        if (i13 < this.zzc && this.zza[i13] == 0) {
            i10--;
        }
        String str = new String(this.zza, i11, i10);
        this.zzb = i12;
        return str;
    }

    public final short zzp() {
        byte[] bArr = this.zza;
        int i10 = this.zzb;
        int i11 = i10 + 1;
        this.zzb = i11;
        byte b10 = bArr[i10];
        this.zzb = i11 + 1;
        return (short) ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final void zzq(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zza, this.zzb, bArr, i10, i11);
        this.zzb += i11;
    }

    public final void zzr() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zzs(int i10) {
        zzt(zzb() < i10 ? new byte[i10] : this.zza, i10);
    }

    public final void zzt(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = 0;
    }

    public final void zzu(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zza.length) {
            z10 = true;
        }
        zzayz.zzc(z10);
        this.zzc = i10;
    }

    public final void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= this.zzc) {
            z10 = true;
        }
        zzayz.zzc(z10);
        this.zzb = i10;
    }

    public final void zzw(int i10) {
        zzv(this.zzb + i10);
    }

    public zzazh(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
