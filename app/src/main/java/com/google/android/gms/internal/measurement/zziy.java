package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public class zziy extends zzix {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziy(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && zzd() == ((zzjb) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zziy) {
                zziy zziyVar = (zziy) obj;
                int zzk = zzk();
                int zzk2 = zziyVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zziyVar.zzd()) {
                        if (zzd <= zziyVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zziyVar.zza;
                            zziyVar.zzc();
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
                        int zzd2 = zziyVar.zzd();
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

    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjb
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    protected final int zze(int i10, int i11, int i12) {
        return zzkk.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final zzjb zzf(int i10, int i11) {
        int zzj = zzjb.zzj(0, i11, zzd());
        return zzj == 0 ? zzjb.zzb : new zziv(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzjb
    public final void zzh(zzir zzirVar) throws IOException {
        ((zzjg) zzirVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final boolean zzi() {
        return zzna.zzf(this.zza, 0, zzd());
    }
}
