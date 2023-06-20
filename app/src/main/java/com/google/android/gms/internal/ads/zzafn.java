package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzafn extends zzafl {
    private zzafm zza;
    private int zzb;
    private boolean zzc;
    private zzaad zzd;
    private zzaab zze;

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final long zza(zzdy zzdyVar) {
        if ((zzdyVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = zzdyVar.zzH()[0];
        zzafm zzafmVar = this.zza;
        zzcw.zzb(zzafmVar);
        int i10 = !zzafmVar.zzd[(b10 >> 1) & (255 >>> (8 - zzafmVar.zze))].zza ? zzafmVar.zza.zze : zzafmVar.zza.zzf;
        long j10 = this.zzc ? (this.zzb + i10) / 4 : 0;
        if (zzdyVar.zzb() < zzdyVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd() + 4);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            zzdyVar.zzE(zzdyVar.zzd() + 4);
        }
        byte[] zzH = zzdyVar.zzH();
        zzH[zzdyVar.zzd() - 4] = (byte) (j10 & 255);
        zzH[zzdyVar.zzd() - 3] = (byte) ((j10 >>> 8) & 255);
        zzH[zzdyVar.zzd() - 2] = (byte) ((j10 >>> 16) & 255);
        zzH[zzdyVar.zzd() - 1] = (byte) ((j10 >>> 24) & 255);
        this.zzc = true;
        this.zzb = i10;
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final boolean zzc(zzdy zzdyVar, long j10, zzafi zzafiVar) throws IOException {
        zzafm zzafmVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.zza != null) {
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        }
        zzaad zzaadVar = this.zzd;
        if (zzaadVar == null) {
            zzaae.zzd(1, zzdyVar, false);
            int zzh = zzdyVar.zzh();
            int zzk = zzdyVar.zzk();
            int zzh2 = zzdyVar.zzh();
            int zzg = zzdyVar.zzg();
            int i15 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzdyVar.zzg();
            int i16 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzdyVar.zzg();
            int i17 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzdyVar.zzk();
            this.zzd = new zzaad(zzh, zzk, zzh2, i15, i16, i17, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzdyVar.zzk() & 1), Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd()));
        } else {
            zzaab zzaabVar = this.zze;
            if (zzaabVar == null) {
                this.zze = zzaae.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zzd()];
                System.arraycopy(zzdyVar.zzH(), 0, bArr, 0, zzdyVar.zzd());
                int i18 = zzaadVar.zza;
                int i19 = 5;
                zzaae.zzd(5, zzdyVar, false);
                int zzk3 = zzdyVar.zzk() + 1;
                zzaaa zzaaaVar = new zzaaa(zzdyVar.zzH());
                zzaaaVar.zzc(zzdyVar.zzc() * 8);
                int i20 = 0;
                while (i20 < zzk3) {
                    if (zzaaaVar.zzb(24) == 5653314) {
                        int zzb = zzaaaVar.zzb(16);
                        int zzb2 = zzaaaVar.zzb(24);
                        long[] jArr = new long[zzb2];
                        long j11 = 0;
                        if (!zzaaaVar.zzd()) {
                            boolean zzd = zzaaaVar.zzd();
                            int i21 = 0;
                            while (i21 < zzb2) {
                                if (zzd) {
                                    if (zzaaaVar.zzd()) {
                                        i14 = zzk3;
                                        jArr[i21] = zzaaaVar.zzb(i19) + 1;
                                    } else {
                                        i14 = zzk3;
                                        jArr[i21] = 0;
                                    }
                                } else {
                                    i14 = zzk3;
                                    jArr[i21] = zzaaaVar.zzb(5) + 1;
                                }
                                i21++;
                                zzk3 = i14;
                                i19 = 5;
                            }
                            i13 = zzk3;
                        } else {
                            i13 = zzk3;
                            int zzb3 = zzaaaVar.zzb(5) + 1;
                            int i22 = 0;
                            while (i22 < zzb2) {
                                int zzb4 = zzaaaVar.zzb(zzaae.zza(zzb2 - i22));
                                int i23 = 0;
                                while (i23 < zzb4 && i22 < zzb2) {
                                    jArr[i22] = zzb3;
                                    i22++;
                                    i23++;
                                    zzaabVar = zzaabVar;
                                    bArr = bArr;
                                }
                                zzb3++;
                                zzaabVar = zzaabVar;
                                bArr = bArr;
                            }
                        }
                        zzaab zzaabVar2 = zzaabVar;
                        byte[] bArr2 = bArr;
                        int zzb5 = zzaaaVar.zzb(4);
                        if (zzb5 > 2) {
                            throw zzbp.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                        }
                        if (zzb5 != 1) {
                            if (zzb5 == 2) {
                                zzb5 = 2;
                            } else {
                                i20++;
                                zzaabVar = zzaabVar2;
                                zzk3 = i13;
                                bArr = bArr2;
                                i19 = 5;
                            }
                        }
                        zzaaaVar.zzc(32);
                        zzaaaVar.zzc(32);
                        int zzb6 = zzaaaVar.zzb(4) + 1;
                        zzaaaVar.zzc(1);
                        if (zzb5 != 1) {
                            j11 = zzb2 * zzb;
                        } else if (zzb != 0) {
                            j11 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                        }
                        zzaaaVar.zzc((int) (zzb6 * j11));
                        i20++;
                        zzaabVar = zzaabVar2;
                        zzk3 = i13;
                        bArr = bArr2;
                        i19 = 5;
                    } else {
                        throw zzbp.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaaaVar.zza(), null);
                    }
                }
                zzaab zzaabVar3 = zzaabVar;
                byte[] bArr3 = bArr;
                int i24 = 6;
                int zzb7 = zzaaaVar.zzb(6) + 1;
                for (int i25 = 0; i25 < zzb7; i25++) {
                    if (zzaaaVar.zzb(16) != 0) {
                        throw zzbp.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i26 = 1;
                int zzb8 = zzaaaVar.zzb(6) + 1;
                int i27 = 0;
                while (true) {
                    int i28 = 3;
                    if (i27 < zzb8) {
                        int zzb9 = zzaaaVar.zzb(16);
                        if (zzb9 == 0) {
                            int i29 = 8;
                            zzaaaVar.zzc(8);
                            zzaaaVar.zzc(16);
                            zzaaaVar.zzc(16);
                            zzaaaVar.zzc(6);
                            zzaaaVar.zzc(8);
                            int zzb10 = zzaaaVar.zzb(4) + 1;
                            int i30 = 0;
                            while (i30 < zzb10) {
                                zzaaaVar.zzc(i29);
                                i30++;
                                i29 = 8;
                            }
                        } else if (zzb9 != i26) {
                            throw zzbp.zza("floor type greater than 1 not decodable: " + zzb9, null);
                        } else {
                            int zzb11 = zzaaaVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i31 = -1;
                            for (int i32 = 0; i32 < zzb11; i32++) {
                                int zzb12 = zzaaaVar.zzb(4);
                                iArr[i32] = zzb12;
                                if (zzb12 > i31) {
                                    i31 = zzb12;
                                }
                            }
                            int i33 = i31 + 1;
                            int[] iArr2 = new int[i33];
                            int i34 = 0;
                            while (i34 < i33) {
                                iArr2[i34] = zzaaaVar.zzb(i28) + 1;
                                int zzb13 = zzaaaVar.zzb(2);
                                if (zzb13 > 0) {
                                    i12 = 8;
                                    zzaaaVar.zzc(8);
                                } else {
                                    i12 = 8;
                                }
                                int i35 = 0;
                                for (int i36 = 1; i35 < (i36 << zzb13); i36 = 1) {
                                    zzaaaVar.zzc(i12);
                                    i35++;
                                    i12 = 8;
                                }
                                i34++;
                                i28 = 3;
                            }
                            zzaaaVar.zzc(2);
                            int zzb14 = zzaaaVar.zzb(4);
                            int i37 = 0;
                            int i38 = 0;
                            for (int i39 = 0; i39 < zzb11; i39++) {
                                i37 += iArr2[iArr[i39]];
                                while (i38 < i37) {
                                    zzaaaVar.zzc(zzb14);
                                    i38++;
                                }
                            }
                        }
                        i27++;
                        i24 = 6;
                        i26 = 1;
                    } else {
                        int i40 = 1;
                        int zzb15 = zzaaaVar.zzb(i24) + 1;
                        int i41 = 0;
                        while (i41 < zzb15) {
                            if (zzaaaVar.zzb(16) <= 2) {
                                zzaaaVar.zzc(24);
                                zzaaaVar.zzc(24);
                                zzaaaVar.zzc(24);
                                int zzb16 = zzaaaVar.zzb(i24) + i40;
                                int i42 = 8;
                                zzaaaVar.zzc(8);
                                int[] iArr3 = new int[zzb16];
                                for (int i43 = 0; i43 < zzb16; i43++) {
                                    iArr3[i43] = ((zzaaaVar.zzd() ? zzaaaVar.zzb(5) : 0) * 8) + zzaaaVar.zzb(3);
                                }
                                int i44 = 0;
                                while (i44 < zzb16) {
                                    int i45 = 0;
                                    while (i45 < i42) {
                                        if ((iArr3[i44] & (1 << i45)) != 0) {
                                            zzaaaVar.zzc(i42);
                                        }
                                        i45++;
                                        i42 = 8;
                                    }
                                    i44++;
                                    i42 = 8;
                                }
                                i41++;
                                i24 = 6;
                                i40 = 1;
                            } else {
                                throw zzbp.zza("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int zzb17 = zzaaaVar.zzb(i24) + 1;
                        for (int i46 = 0; i46 < zzb17; i46++) {
                            int zzb18 = zzaaaVar.zzb(16);
                            if (zzb18 != 0) {
                                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + zzb18);
                            } else {
                                if (zzaaaVar.zzd()) {
                                    i10 = 1;
                                    i11 = zzaaaVar.zzb(4) + 1;
                                } else {
                                    i10 = 1;
                                    i11 = 1;
                                }
                                if (zzaaaVar.zzd()) {
                                    int zzb19 = zzaaaVar.zzb(8) + i10;
                                    for (int i47 = 0; i47 < zzb19; i47++) {
                                        int i48 = i18 - 1;
                                        zzaaaVar.zzc(zzaae.zza(i48));
                                        zzaaaVar.zzc(zzaae.zza(i48));
                                    }
                                }
                                if (zzaaaVar.zzb(2) != 0) {
                                    throw zzbp.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i11 > 1) {
                                    for (int i49 = 0; i49 < i18; i49++) {
                                        zzaaaVar.zzc(4);
                                    }
                                }
                                for (int i50 = 0; i50 < i11; i50++) {
                                    zzaaaVar.zzc(8);
                                    zzaaaVar.zzc(8);
                                    zzaaaVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzaaaVar.zzb(6) + 1;
                        zzaac[] zzaacVarArr = new zzaac[zzb20];
                        for (int i51 = 0; i51 < zzb20; i51++) {
                            zzaacVarArr[i51] = new zzaac(zzaaaVar.zzd(), zzaaaVar.zzb(16), zzaaaVar.zzb(16), zzaaaVar.zzb(8));
                        }
                        if (zzaaaVar.zzd()) {
                            zzafmVar = new zzafm(zzaadVar, zzaabVar3, bArr3, zzaacVarArr, zzaae.zza(zzb20 - 1));
                        } else {
                            throw zzbp.zza("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        zzafmVar = null;
        this.zza = zzafmVar;
        if (zzafmVar == null) {
            return true;
        }
        zzaad zzaadVar2 = zzafmVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaadVar2.zzg);
        arrayList.add(zzafmVar.zzc);
        zzbl zzb21 = zzaae.zzb(zzfrj.zzn(zzafmVar.zzb.zzb));
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/vorbis");
        zzabVar.zzv(zzaadVar2.zzd);
        zzabVar.zzO(zzaadVar2.zzc);
        zzabVar.zzw(zzaadVar2.zza);
        zzabVar.zzT(zzaadVar2.zzb);
        zzabVar.zzI(arrayList);
        zzabVar.zzM(zzb21);
        zzafiVar.zza = zzabVar.zzY();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzi(long j10) {
        super.zzi(j10);
        this.zzc = j10 != 0;
        zzaad zzaadVar = this.zzd;
        this.zzb = zzaadVar != null ? zzaadVar.zze : 0;
    }
}
