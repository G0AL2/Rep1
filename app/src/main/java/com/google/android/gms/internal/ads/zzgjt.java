package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgjt extends zzgjx {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgjt(byte[] bArr, int i10, int i11) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i11) | i11) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzN() {
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzO(byte b10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzP(int i10, boolean z10) throws IOException {
        zzs(i10 << 3);
        zzO(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzQ(int i10, zzgji zzgjiVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzgjiVar.zzd());
        zzgjiVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx, com.google.android.gms.internal.ads.zzgix
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zze(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzh(int i10, int i11) throws IOException {
        zzs((i10 << 3) | 5);
        zzi(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzi(int i10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            int i12 = i11 + 1;
            this.zzc = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.zzc = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.zzc = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.zzc = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzj(int i10, long j10) throws IOException {
        zzs((i10 << 3) | 1);
        zzk(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzk(long j10) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i10 = this.zzc;
            int i11 = i10 + 1;
            this.zzc = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i11 + 1;
            this.zzc = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i12 + 1;
            this.zzc = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i13 + 1;
            this.zzc = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i14 + 1;
            this.zzc = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.zzc = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.zzc = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.zzc = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzl(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzm(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzn(int i10, zzgma zzgmaVar, zzgmt zzgmtVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzgir zzgirVar = (zzgir) zzgmaVar;
        int zzar = zzgirVar.zzar();
        if (zzar == -1) {
            zzar = zzgmtVar.zza(zzgirVar);
            zzgirVar.zzau(zzar);
        }
        zzs(zzar);
        zzgmtVar.zzn(zzgmaVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzp(str);
    }

    public final void zzp(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int zzE = zzgjx.zzE(str.length() * 3);
            int zzE2 = zzgjx.zzE(str.length());
            if (zzE2 == zzE) {
                int i11 = i10 + zzE2;
                this.zzc = i11;
                int zzd = zzgnz.zzd(str, this.zza, i11, this.zzb - i11);
                this.zzc = i10;
                zzs((zzd - i10) - zzE2);
                this.zzc = zzd;
                return;
            }
            zzs(zzgnz.zze(str));
            byte[] bArr = this.zza;
            int i12 = this.zzc;
            this.zzc = zzgnz.zzd(str, bArr, i12, this.zzb - i12);
        } catch (zzgny e10) {
            this.zzc = i10;
            zzJ(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgju(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzr(int i10, int i11) throws IOException {
        zzs(i10 << 3);
        zzs(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzs(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzt(int i10, long j10) throws IOException {
        zzs(i10 << 3);
        zzu(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzu(long j10) throws IOException {
        boolean z10;
        z10 = zzgjx.zzb;
        if (z10 && this.zzb - this.zzc >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i10 = this.zzc;
                this.zzc = i10 + 1;
                zzgnu.zzq(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzc;
            this.zzc = i11 + 1;
            zzgnu.zzq(bArr2, i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzgju(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e10);
            }
        }
        byte[] bArr4 = this.zza;
        int i13 = this.zzc;
        this.zzc = i13 + 1;
        bArr4[i13] = (byte) j10;
    }
}
