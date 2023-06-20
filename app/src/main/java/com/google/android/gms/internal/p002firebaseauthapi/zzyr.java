package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzyr extends zzyo {
    private final OutputStream zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyr(OutputStream outputStream, int i10) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzO(byte b10) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzP(int i10, boolean z10) throws IOException {
        zzM(11);
        zzf(i10 << 3);
        zzc(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzQ(int i10, zzyi zzyiVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzs(zzyiVar.zzd());
        zzyiVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt, com.google.android.gms.internal.p002firebaseauthapi.zzxy
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzp(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzh(int i10, int i11) throws IOException {
        zzM(14);
        zzf((i10 << 3) | 5);
        zzd(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzi(int i10) throws IOException {
        zzM(4);
        zzd(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzj(int i10, long j10) throws IOException {
        zzM(18);
        zzf((i10 << 3) | 1);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzk(long j10) throws IOException {
        zzM(8);
        zze(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzl(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        if (i11 >= 0) {
            zzf(i11);
        } else {
            zzg(i11);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzm(int i10) throws IOException {
        if (i10 >= 0) {
            zzs(i10);
        } else {
            zzu(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzn(int i10, zzaaq zzaaqVar, zzabc zzabcVar) throws IOException {
        zzs((i10 << 3) | 2);
        zzxs zzxsVar = (zzxs) zzaaqVar;
        int zzn = zzxsVar.zzn();
        if (zzn == -1) {
            zzn = zzabcVar.zza(zzxsVar);
            zzxsVar.zzp(zzn);
        }
        zzs(zzn);
        zzabcVar.zzn(zzaaqVar, this.zze);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzo(int i10, String str) throws IOException {
        zzs((i10 << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        System.arraycopy(bArr, 0, this.zza, i13, i14);
        int i15 = i11 - i14;
        this.zzc = this.zzb;
        this.zzd += i14;
        zzL();
        if (i15 <= this.zzb) {
            System.arraycopy(bArr, i14, this.zza, 0, i15);
            this.zzc = i15;
        } else {
            this.zzf.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzq(int i10, int i11) throws IOException {
        zzs((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzr(int i10, int i11) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzf(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzs(int i10) throws IOException {
        zzM(5);
        zzf(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzt(int i10, long j10) throws IOException {
        zzM(20);
        zzf(i10 << 3);
        zzg(j10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyt
    public final void zzu(long j10) throws IOException {
        zzM(10);
        zzg(j10);
    }

    public final void zzv(String str) throws IOException {
        int zzc;
        try {
            int length = str.length() * 3;
            int zzE = zzyt.zzE(length);
            int i10 = zzE + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int zzb = zzaci.zzb(str, bArr, 0, length);
                zzs(zzb);
                zzp(bArr, 0, zzb);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzL();
            }
            int zzE2 = zzyt.zzE(str.length());
            int i12 = this.zzc;
            try {
                if (zzE2 == zzE) {
                    int i13 = i12 + zzE2;
                    this.zzc = i13;
                    int zzb2 = zzaci.zzb(str, this.zza, i13, this.zzb - i13);
                    this.zzc = i12;
                    zzc = (zzb2 - i12) - zzE2;
                    zzf(zzc);
                    this.zzc = zzb2;
                } else {
                    zzc = zzaci.zzc(str);
                    zzf(zzc);
                    this.zzc = zzaci.zzb(str, this.zza, this.zzc, zzc);
                }
                this.zzd += zzc;
            } catch (zzach e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzyq(e11);
            }
        } catch (zzach e12) {
            zzJ(str, e12);
        }
    }
}
