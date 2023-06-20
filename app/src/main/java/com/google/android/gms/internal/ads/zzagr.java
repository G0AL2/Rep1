package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagr implements zzahn {
    private final zzaga zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzee zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzagr(zzaga zzagaVar) {
        this.zza = zzagaVar;
    }

    private final void zzd(int i10) {
        this.zzc = i10;
        this.zzd = 0;
    }

    private final boolean zze(zzdy zzdyVar, byte[] bArr, int i10) {
        int min = Math.min(zzdyVar.zza(), i10 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzG(min);
        } else {
            zzdyVar.zzB(bArr, this.zzd, min);
        }
        int i11 = this.zzd + min;
        this.zzd = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zza(zzdy zzdyVar, int i10) throws zzbp {
        long j10;
        zzcw.zzb(this.zze);
        int i11 = -1;
        int i12 = 2;
        if ((i10 & 1) != 0) {
            int i13 = this.zzc;
            if (i13 != 0 && i13 != 1) {
                if (i13 != 2) {
                    int i14 = this.zzj;
                    if (i14 != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + i14 + " more bytes");
                    }
                    this.zza.zzc();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i15 = i10;
        while (zzdyVar.zza() > 0) {
            int i16 = this.zzc;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != i12) {
                        int zza = zzdyVar.zza();
                        int i17 = this.zzj;
                        int i18 = i17 != i11 ? zza - i17 : 0;
                        if (i18 > 0) {
                            zza -= i18;
                            zzdyVar.zzE(zzdyVar.zzc() + zza);
                        }
                        this.zza.zza(zzdyVar);
                        int i19 = this.zzj;
                        if (i19 != i11) {
                            int i20 = i19 - zza;
                            this.zzj = i20;
                            if (i20 == 0) {
                                this.zza.zzc();
                                zzd(1);
                            }
                        }
                    } else {
                        if (zze(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzdyVar, null, this.zzi)) {
                            this.zzb.zzh(0);
                            if (this.zzf) {
                                this.zzb.zzj(4);
                                int zzc = this.zzb.zzc(3);
                                this.zzb.zzj(1);
                                int zzc2 = this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                long zzc3 = (zzc2 << 15) | (zzc << 30) | this.zzb.zzc(15);
                                this.zzb.zzj(1);
                                if (!this.zzh && this.zzg) {
                                    this.zzb.zzj(4);
                                    int zzc4 = this.zzb.zzc(3);
                                    this.zzb.zzj(1);
                                    int zzc5 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    int zzc6 = this.zzb.zzc(15);
                                    this.zzb.zzj(1);
                                    this.zze.zzb((zzc4 << 30) | (zzc5 << 15) | zzc6);
                                    this.zzh = true;
                                }
                                j10 = this.zze.zzb(zzc3);
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            i15 |= true != this.zzk ? 0 : 4;
                            this.zza.zzd(j10, i15);
                            zzd(3);
                            i11 = -1;
                        }
                    }
                } else if (zze(zzdyVar, this.zzb.zza, 9)) {
                    int i21 = 0;
                    this.zzb.zzh(0);
                    int zzc7 = this.zzb.zzc(24);
                    if (zzc7 != 1) {
                        Log.w("PesReader", "Unexpected start code prefix: " + zzc7);
                        i11 = -1;
                        this.zzj = -1;
                    } else {
                        this.zzb.zzj(8);
                        int zzc8 = this.zzb.zzc(16);
                        this.zzb.zzj(5);
                        this.zzk = this.zzb.zzl();
                        this.zzb.zzj(2);
                        this.zzf = this.zzb.zzl();
                        this.zzg = this.zzb.zzl();
                        this.zzb.zzj(6);
                        int zzc9 = this.zzb.zzc(8);
                        this.zzi = zzc9;
                        if (zzc8 == 0) {
                            this.zzj = -1;
                        } else {
                            int i22 = (zzc8 - 3) - zzc9;
                            this.zzj = i22;
                            if (i22 < 0) {
                                Log.w("PesReader", "Found negative packet payload size: " + i22);
                                i11 = -1;
                                this.zzj = -1;
                                i21 = 2;
                            }
                        }
                        i11 = -1;
                        i21 = 2;
                    }
                    zzd(i21);
                } else {
                    i11 = -1;
                }
            } else {
                zzdyVar.zzG(zzdyVar.zza());
            }
            i12 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzee zzeeVar, zzyu zzyuVar, zzahm zzahmVar) {
        this.zze = zzeeVar;
        this.zza.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
