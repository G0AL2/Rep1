package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public class zzdz extends zzdy {
    protected final byte[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzeb) && zzd() == ((zzeb) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzdz) {
                zzdz zzdzVar = (zzdz) obj;
                int zzj = zzj();
                int zzj2 = zzdzVar.zzj();
                if (zzj == 0 || zzj2 == 0 || zzj == zzj2) {
                    int zzd = zzd();
                    if (zzd <= zzdzVar.zzd()) {
                        if (zzd <= zzdzVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzdzVar.zza;
                            zzdzVar.zzc();
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
                        int zzd2 = zzdzVar.zzd();
                        StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Ran off end of other: 0, ");
                        sb2.append(zzd);
                        sb2.append(", ");
                        sb2.append(zzd2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    int zzd3 = zzd();
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Length too large: ");
                    sb3.append(zzd);
                    sb3.append(zzd3);
                    throw new IllegalArgumentException(sb3.toString());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzeb
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final int zze(int i10, int i11, int i12) {
        return zzev.zzd(i10, this.zza, 0, i12);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final zzeb zzf(int i10, int i11) {
        int zzi = zzeb.zzi(0, i11, zzd());
        return zzi == 0 ? zzeb.zzb : new zzdw(this.zza, 0, zzi);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    protected final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzeb
    public final boolean zzh() {
        return zzhd.zzd(this.zza, 0, zzd());
    }
}
