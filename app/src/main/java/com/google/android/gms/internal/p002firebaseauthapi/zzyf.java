package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyf  reason: invalid package */
/* loaded from: classes2.dex */
public class zzyf extends zzye {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyf(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzyi) && zzd() == ((zzyi) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzyf) {
                zzyf zzyfVar = (zzyf) obj;
                int zzm = zzm();
                int zzm2 = zzyfVar.zzm();
                if (zzm == 0 || zzm2 == 0 || zzm == zzm2) {
                    int zzd = zzd();
                    if (zzd <= zzyfVar.zzd()) {
                        if (zzd <= zzyfVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzyfVar.zza;
                            zzyfVar.zzc();
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < zzd) {
                                if (bArr[i10] != bArr2[i11]) {
                                    return false;
                                }
                                i10++;
                                i11++;
                            }
                            return true;
                        }
                        int zzd2 = zzyfVar.zzd();
                        throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzd2);
                    }
                    int zzd3 = zzd();
                    throw new IllegalArgumentException("Length too large: " + zzd + zzd3);
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    protected void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    protected final int zzf(int i10, int i11, int i12) {
        return zzzr.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final zzyi zzg(int i10, int i11) {
        int zzl = zzyi.zzl(0, i11, zzd());
        return zzl == 0 ? zzyi.zzb : new zzyc(this.zza, 0, zzl);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final zzym zzh() {
        return zzym.zzu(this.zza, 0, zzd(), true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    protected final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final void zzj(zzxy zzxyVar) throws IOException {
        zzxyVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzyi
    public final boolean zzk() {
        return zzaci.zzf(this.zza, 0, zzd());
    }
}
