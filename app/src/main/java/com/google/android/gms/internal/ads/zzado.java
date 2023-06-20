package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzado implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzadm
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzado.zza;
            return new zzyr[]{new zzado(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private static final zzaby zzb = new zzaby() { // from class: com.google.android.gms.internal.ads.zzadn
    };
    private final zzdy zzc;
    private final zzzk zzd;
    private final zzzg zze;
    private final zzzi zzf;
    private final zzzy zzg;
    private zzyu zzh;
    private zzzy zzi;
    private zzzy zzj;
    private int zzk;
    private zzbl zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzadq zzq;
    private boolean zzr;

    public zzado() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzys r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zzf(com.google.android.gms.internal.ads.zzys):int");
    }

    private final long zzg(long j10) {
        return this.zzm + ((j10 * 1000000) / this.zzd.zzd);
    }

    private final zzadq zzh(zzys zzysVar, boolean z10) throws IOException {
        ((zzyl) zzysVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzadj(zzysVar.zzd(), zzysVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    private final boolean zzj(zzys zzysVar) throws IOException {
        zzadq zzadqVar = this.zzq;
        if (zzadqVar != null) {
            long zzb2 = zzadqVar.zzb();
            if (zzb2 != -1 && zzysVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzysVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzys zzysVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int zzb2;
        int i12 = true != z10 ? 131072 : 32768;
        zzysVar.zzj();
        if (zzysVar.zzf() == 0) {
            zzbl zza2 = this.zzf.zza(zzysVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i11 = (int) zzysVar.zze();
            if (!z10) {
                ((zzyl) zzysVar).zzo(i11, false);
            }
            i10 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (!zzj(zzysVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i10 == 0 || zzi(zze, i10)) && (zzb2 = zzzl.zzb(zze)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i10 = zze;
                    }
                    ((zzyl) zzysVar).zzl(zzb2 - 4, false);
                } else {
                    int i15 = i14 + 1;
                    if (i14 == i12) {
                        if (z10) {
                            return false;
                        }
                        throw zzbp.zza("Searched too many bytes.", null);
                    }
                    if (z10) {
                        zzysVar.zzj();
                        ((zzyl) zzysVar).zzl(i11 + i15, false);
                    } else {
                        ((zzyl) zzysVar).zzo(1, false);
                    }
                    i14 = i15;
                    i10 = 0;
                    i13 = 0;
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            ((zzyl) zzysVar).zzo(i11 + i14, false);
        } else {
            zzysVar.zzj();
        }
        this.zzk = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        zzcw.zzb(this.zzi);
        int i10 = zzeg.zza;
        int zzf = zzf(zzysVar);
        if (zzf == -1 && (this.zzq instanceof zzadk)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzadk zzadkVar = (zzadk) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzh = zzyuVar;
        zzzy zzv = zzyuVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzadq zzadqVar = this.zzq;
        if (zzadqVar instanceof zzadk) {
            zzadk zzadkVar = (zzadk) zzadqVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzk(zzysVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzado(int i10) {
        this.zzc = new zzdy(10);
        this.zzd = new zzzk();
        this.zze = new zzzg();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzi();
        zzyq zzyqVar = new zzyq();
        this.zzg = zzyqVar;
        this.zzj = zzyqVar;
    }
}
