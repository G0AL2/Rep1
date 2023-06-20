package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgjv extends zzgjs {
    private final OutputStream zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgjv(OutputStream outputStream, int i10) {
        super(i10);
        this.zzf = outputStream;
    }

    private final void zzL() throws IOException {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzO(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzP(int i10, boolean z10) throws IOException {
        zzM(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzQ(int i10, zzgji zzgjiVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzgjiVar.zzd());
        zzgjiVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx, com.google.android.gms.internal.ads.zzgix
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzh(int i10, int i11) throws IOException {
        zzM(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzi(int i10) throws IOException {
        zzM(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzj(int i10, long j10) throws IOException {
        zzM(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzk(long j10) throws IOException {
        zzM(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzl(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
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
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.zza, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzL();
        if (i16 <= this.zzb) {
            System.arraycopy(bArr, i15, this.zza, 0, i16);
            this.zzc = i16;
        } else {
            this.zzf.write(bArr, i15, i16);
        }
        this.zzd += i16;
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzr(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzs(int i10) throws IOException {
        zzM(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzt(int i10, long j10) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzgjx
    public final void zzu(long j10) throws IOException {
        zzM(10);
        zzg(j10);
    }

    public final void zzv(String str) throws IOException {
        int zze;
        try {
            int length = str.length() * 3;
            int zzE = zzgjx.zzE(length);
            int i10 = zzE + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzd = zzgnz.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzL();
            }
            int zzE2 = zzgjx.zzE(str.length());
            int i12 = this.zzc;
            try {
                if (zzE2 == zzE) {
                    int i13 = i12 + zzE2;
                    this.zzc = i13;
                    int zzd2 = zzgnz.zzd(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zze = (zzd2 - i12) - zzE2;
                    zzf(zze);
                    this.zzc = zzd2;
                } else {
                    zze = zzgnz.zze(str);
                    zzf(zze);
                    this.zzc = zzgnz.zzd(str, this.zza, this.zzc, zze);
                }
                this.zzd += zze;
            } catch (zzgny e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgju(e11);
            }
        } catch (zzgny e12) {
            zzJ(str, e12);
        }
    }
}
