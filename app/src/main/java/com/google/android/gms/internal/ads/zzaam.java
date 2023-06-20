package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaam implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzaal
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzaam.zza;
            return new zzyr[]{new zzaam(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private final byte[] zzb;
    private final zzdy zzc;
    private final zzyz zzd;
    private zzyu zze;
    private zzzy zzf;
    private int zzg;
    private zzbl zzh;
    private zzze zzi;
    private int zzj;
    private int zzk;
    private zzaak zzl;
    private int zzm;
    private long zzn;

    public zzaam() {
        this(0);
    }

    public zzaam(int i10) {
        this.zzb = new byte[42];
        this.zzc = new zzdy(new byte[32768], 0);
        this.zzd = new zzyz();
        this.zzg = 0;
    }

    private final long zze(zzdy zzdyVar, boolean z10) {
        boolean z11;
        Objects.requireNonNull(this.zzi);
        int zzc = zzdyVar.zzc();
        while (zzc <= zzdyVar.zzd() - 16) {
            zzdyVar.zzF(zzc);
            if (zzza.zzc(zzdyVar, this.zzi, this.zzk, this.zzd)) {
                zzdyVar.zzF(zzc);
                return this.zzd.zza;
            }
            zzc++;
        }
        if (z10) {
            while (zzc <= zzdyVar.zzd() - this.zzj) {
                zzdyVar.zzF(zzc);
                try {
                    z11 = zzza.zzc(zzdyVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (zzdyVar.zzc() <= zzdyVar.zzd() && z11) {
                    zzdyVar.zzF(zzc);
                    return this.zzd.zza;
                }
                zzc++;
            }
            zzdyVar.zzF(zzdyVar.zzd());
            return -1L;
        }
        zzdyVar.zzF(zzc);
        return -1L;
    }

    private final void zzf() {
        long j10 = this.zzn;
        zzze zzzeVar = this.zzi;
        int i10 = zzeg.zza;
        this.zzf.zzs((j10 * 1000000) / zzzeVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        boolean zzl;
        zzzu zzztVar;
        boolean z10;
        int i10 = this.zzg;
        if (i10 == 0) {
            zzysVar.zzj();
            long zze = zzysVar.zze();
            zzbl zza2 = zzzb.zza(zzysVar, true);
            ((zzyl) zzysVar).zzo((int) (zzysVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i10 == 1) {
            ((zzyl) zzysVar).zzm(this.zzb, 0, 42, false);
            zzysVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i10 == 2) {
            zzdy zzdyVar = new zzdy(4);
            ((zzyl) zzysVar).zzn(zzdyVar.zzH(), 0, 4, false);
            if (zzdyVar.zzs() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzbp.zza("Failed to read FLAC stream marker.", null);
        } else if (i10 == 3) {
            zzze zzzeVar = this.zzi;
            do {
                zzysVar.zzj();
                zzdx zzdxVar = new zzdx(new byte[4], 4);
                zzyl zzylVar = (zzyl) zzysVar;
                zzylVar.zzm(zzdxVar.zza, 0, 4, false);
                zzl = zzdxVar.zzl();
                int zzc = zzdxVar.zzc(7);
                int zzc2 = zzdxVar.zzc(24) + 4;
                if (zzc == 0) {
                    byte[] bArr = new byte[38];
                    zzylVar.zzn(bArr, 0, 38, false);
                    zzzeVar = new zzze(bArr, 4);
                } else if (zzzeVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzc == 3) {
                        zzdy zzdyVar2 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar2.zzH(), 0, zzc2, false);
                        zzzeVar = zzzeVar.zzf(zzzb.zzb(zzdyVar2));
                    } else if (zzc == 4) {
                        zzdy zzdyVar3 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar3.zzH(), 0, zzc2, false);
                        zzdyVar3.zzG(4);
                        zzzeVar = zzzeVar.zzg(Arrays.asList(zzaae.zzc(zzdyVar3, false, false).zzb));
                    } else if (zzc == 6) {
                        zzdy zzdyVar4 = new zzdy(zzc2);
                        zzylVar.zzn(zzdyVar4.zzH(), 0, zzc2, false);
                        zzdyVar4.zzG(4);
                        zzzeVar = zzzeVar.zze(zzfrj.zzp(zzabg.zzb(zzdyVar4)));
                    } else {
                        zzylVar.zzo(zzc2, false);
                    }
                }
                int i11 = zzeg.zza;
                this.zzi = zzzeVar;
            } while (!zzl);
            Objects.requireNonNull(zzzeVar);
            this.zzj = Math.max(zzzeVar.zzc, 6);
            this.zzf.zzk(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i10 != 4) {
            Objects.requireNonNull(this.zzf);
            zzze zzzeVar2 = this.zzi;
            Objects.requireNonNull(zzzeVar2);
            zzaak zzaakVar = this.zzl;
            if (zzaakVar == null || !zzaakVar.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzza.zzb(zzysVar, zzzeVar2);
                    return 0;
                }
                zzdy zzdyVar5 = this.zzc;
                int zzd = zzdyVar5.zzd();
                if (zzd < 32768) {
                    int zza3 = zzysVar.zza(zzdyVar5.zzH(), zzd, 32768 - zzd);
                    z10 = zza3 == -1;
                    if (!z10) {
                        this.zzc.zzE(zzd + zza3);
                    } else if (this.zzc.zza() == 0) {
                        zzf();
                        return -1;
                    }
                } else {
                    z10 = false;
                }
                zzdy zzdyVar6 = this.zzc;
                int zzc3 = zzdyVar6.zzc();
                int i12 = this.zzm;
                int i13 = this.zzj;
                if (i12 < i13) {
                    zzdyVar6.zzG(Math.min(i13 - i12, zzdyVar6.zza()));
                }
                long zze2 = zze(this.zzc, z10);
                zzdy zzdyVar7 = this.zzc;
                int zzc4 = zzdyVar7.zzc() - zzc3;
                zzdyVar7.zzF(zzc3);
                zzzw.zzb(this.zzf, this.zzc, zzc4);
                this.zzm += zzc4;
                if (zze2 != -1) {
                    zzf();
                    this.zzm = 0;
                    this.zzn = zze2;
                }
                zzdy zzdyVar8 = this.zzc;
                if (zzdyVar8.zza() >= 16) {
                    return 0;
                }
                int zza4 = zzdyVar8.zza();
                System.arraycopy(zzdyVar8.zzH(), zzdyVar8.zzc(), zzdyVar8.zzH(), 0, zza4);
                this.zzc.zzF(0);
                this.zzc.zzE(zza4);
                return 0;
            }
            return zzaakVar.zza(zzysVar, zzzrVar);
        } else {
            zzysVar.zzj();
            zzdy zzdyVar9 = new zzdy(2);
            ((zzyl) zzysVar).zzm(zzdyVar9.zzH(), 0, 2, false);
            int zzo = zzdyVar9.zzo();
            if ((zzo >> 2) == 16382) {
                zzysVar.zzj();
                this.zzk = zzo;
                zzyu zzyuVar = this.zze;
                int i14 = zzeg.zza;
                long zzf = zzysVar.zzf();
                long zzd2 = zzysVar.zzd();
                zzze zzzeVar3 = this.zzi;
                Objects.requireNonNull(zzzeVar3);
                if (zzzeVar3.zzk != null) {
                    zzztVar = new zzzc(zzzeVar3, zzf);
                } else if (zzd2 != -1 && zzzeVar3.zzj > 0) {
                    zzaak zzaakVar2 = new zzaak(zzzeVar3, this.zzk, zzf, zzd2);
                    this.zzl = zzaakVar2;
                    zzztVar = zzaakVar2.zzb();
                } else {
                    zzztVar = new zzzt(zzzeVar3.zza(), 0L);
                }
                zzyuVar.zzL(zzztVar);
                this.zzg = 5;
                return 0;
            }
            zzysVar.zzj();
            throw zzbp.zza("First frame does not start with sync code.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zze = zzyuVar;
        this.zzf = zzyuVar.zzv(0, 1);
        zzyuVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        if (j10 == 0) {
            this.zzg = 0;
        } else {
            zzaak zzaakVar = this.zzl;
            if (zzaakVar != null) {
                zzaakVar.zzd(j11);
            }
        }
        this.zzn = j11 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        zzzb.zza(zzysVar, false);
        zzdy zzdyVar = new zzdy(4);
        ((zzyl) zzysVar).zzm(zzdyVar.zzH(), 0, 4, false);
        return zzdyVar.zzs() == 1716281667;
    }
}
