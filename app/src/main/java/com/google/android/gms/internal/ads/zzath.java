package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzath {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final short[] zzf;
    private int zzg;
    private short[] zzh;
    private int zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzm = 0;
    private int zzn = 0;
    private int zzu = 0;
    private float zzo = 1.0f;
    private float zzp = 1.0f;

    public zzath(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i10 / DownloadResource.STATUS_BAD_REQUEST;
        int i12 = i10 / 65;
        this.zzd = i12;
        int i13 = i12 + i12;
        this.zze = i13;
        this.zzf = new short[i13];
        this.zzg = i13;
        int i14 = i11 * i13;
        this.zzh = new short[i14];
        this.zzi = i13;
        this.zzj = new short[i14];
        this.zzk = i13;
        this.zzl = new short[i14];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.zzb;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            int i20 = i18 * i16;
            int i21 = i14 * i11;
            if (i20 < i21) {
                i14 = i18;
            }
            if (i20 < i21) {
                i16 = i11;
            }
            int i22 = i18 * i15;
            int i23 = i17 * i11;
            if (i22 > i23) {
                i17 = i18;
            }
            if (i22 > i23) {
                i15 = i11;
            }
            i11++;
        }
        this.zzw = i14 / i16;
        this.zzx = i17 / i15;
        return i16;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        zzk(i11);
        int i12 = this.zzb;
        System.arraycopy(sArr, i10 * i12, this.zzj, this.zzr * i12, i12 * i11);
        this.zzr += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12 = this.zze / i11;
        int i13 = this.zzb;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.zzf[i16] = (short) (i17 / i14);
        }
    }

    private final void zzj(int i10) {
        int i11 = this.zzq;
        int i12 = this.zzg;
        if (i11 + i10 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.zzg = i13;
            this.zzh = Arrays.copyOf(this.zzh, i13 * this.zzb);
        }
    }

    private final void zzk(int i10) {
        int i11 = this.zzr;
        int i12 = this.zzi;
        if (i11 + i10 > i12) {
            int i13 = i12 + (i12 / 2) + i10;
            this.zzi = i13;
            this.zzj = Arrays.copyOf(this.zzj, i13 * this.zzb);
        }
    }

    private static void zzl(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzm() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.zzr;
        float f10 = this.zzo / this.zzp;
        double d10 = f10;
        int i19 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            zzh(this.zzh, 0, this.zzq);
            this.zzq = 0;
        } else {
            int i20 = this.zzq;
            if (i20 >= this.zze) {
                int i21 = 0;
                while (true) {
                    int i22 = this.zzt;
                    if (i22 > 0) {
                        int min = Math.min(this.zze, i22);
                        zzh(this.zzh, i21, min);
                        this.zzt -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.zzh;
                        int i23 = this.zza;
                        int i24 = i23 > 4000 ? i23 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
                        if (this.zzb == i19 && i24 == i19) {
                            i10 = zzg(sArr, i21, this.zzc, this.zzd);
                        } else {
                            zzi(sArr, i21, i24);
                            int zzg = zzg(this.zzf, 0, this.zzc / i24, this.zzd / i24);
                            if (i24 != i19) {
                                int i25 = zzg * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.zzc;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.zzd;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.zzb == i19) {
                                    i10 = zzg(sArr, i21, i27, i28);
                                } else {
                                    zzi(sArr, i21, i19);
                                    i10 = zzg(this.zzf, 0, i27, i28);
                                }
                            } else {
                                i10 = zzg;
                            }
                        }
                        int i31 = this.zzw;
                        int i32 = (i31 == 0 || (i13 = this.zzu) == 0 || this.zzx > i31 * 3 || i31 + i31 <= this.zzv * 3) ? i10 : i13;
                        this.zzv = i31;
                        this.zzu = i10;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzh;
                            if (f10 >= 2.0f) {
                                i12 = (int) (i32 / ((-1.0f) + f10));
                            } else {
                                this.zzt = (int) ((i32 * (2.0f - f10)) / ((-1.0f) + f10));
                                i12 = i32;
                            }
                            zzk(i12);
                            int i33 = i12;
                            zzl(i12, this.zzb, this.zzj, this.zzr, sArr2, i21, sArr2, i21 + i32);
                            this.zzr += i33;
                            i21 += i32 + i33;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.zzh;
                            if (f10 < 0.5f) {
                                i11 = (int) ((i34 * f10) / (1.0f - f10));
                            } else {
                                this.zzt = (int) ((i34 * ((f10 + f10) - 1.0f)) / (1.0f - f10));
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            zzk(i35);
                            int i36 = this.zzb;
                            System.arraycopy(sArr3, i21 * i36, this.zzj, this.zzr * i36, i36 * i34);
                            zzl(i11, this.zzb, this.zzj, this.zzr + i34, sArr3, i34 + i21, sArr3, i21);
                            this.zzr += i35;
                            i21 += i11;
                        }
                    }
                    if (this.zze + i21 > i20) {
                        break;
                    }
                    i19 = 1;
                }
                int i37 = this.zzq - i21;
                short[] sArr4 = this.zzh;
                int i38 = this.zzb;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.zzq = i37;
            }
        }
        float f11 = this.zzp;
        if (f11 == 1.0f || this.zzr == i18) {
            return;
        }
        int i39 = this.zza;
        int i40 = (int) (i39 / f11);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.zzr - i18;
        int i42 = this.zzs;
        int i43 = this.zzk;
        if (i42 + i41 > i43) {
            int i44 = i43 + (i43 / 2) + i41;
            this.zzk = i44;
            this.zzl = Arrays.copyOf(this.zzl, i44 * this.zzb);
        }
        short[] sArr5 = this.zzj;
        int i45 = this.zzb;
        System.arraycopy(sArr5, i18 * i45, this.zzl, this.zzs * i45, i45 * i41);
        this.zzr = i18;
        this.zzs += i41;
        int i46 = 0;
        while (true) {
            i14 = this.zzs;
            i15 = i14 - 1;
            if (i46 >= i15) {
                break;
            }
            while (true) {
                i16 = this.zzm + 1;
                i17 = this.zzn;
                if (i16 * i40 <= i17 * i39) {
                    break;
                }
                zzk(1);
                int i47 = 0;
                while (true) {
                    int i48 = this.zzb;
                    if (i47 < i48) {
                        short[] sArr6 = this.zzj;
                        int i49 = this.zzr;
                        short[] sArr7 = this.zzl;
                        int i50 = (i46 * i48) + i47;
                        short s10 = sArr7[i50];
                        short s11 = sArr7[i50 + i48];
                        int i51 = this.zzn;
                        int i52 = this.zzm;
                        int i53 = (i52 + 1) * i40;
                        int i54 = i53 - (i51 * i39);
                        int i55 = i53 - (i52 * i40);
                        sArr6[(i49 * i48) + i47] = (short) (((s10 * i54) + ((i55 - i54) * s11)) / i55);
                        i47++;
                    }
                }
                this.zzn++;
                this.zzr++;
            }
            this.zzm = i16;
            if (i16 == i39) {
                this.zzm = 0;
                zzayz.zze(i17 == i40);
                this.zzn = 0;
            }
            i46++;
        }
        if (i15 != 0) {
            short[] sArr8 = this.zzl;
            int i56 = this.zzb;
            System.arraycopy(sArr8, i15 * i56, sArr8, 0, (i14 - i15) * i56);
            this.zzs -= i15;
        }
    }

    public final int zza() {
        return this.zzr;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzr);
        shortBuffer.put(this.zzj, 0, this.zzb * min);
        int i10 = this.zzr - min;
        this.zzr = i10;
        short[] sArr = this.zzj;
        int i11 = this.zzb;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zzc() {
        int i10;
        int i11 = this.zzq;
        float f10 = this.zzo;
        float f11 = this.zzp;
        int i12 = this.zzr + ((int) ((((i11 / (f10 / f11)) + this.zzs) / f11) + 0.5f));
        int i13 = this.zze;
        zzj(i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.zze;
            i10 = i15 + i15;
            int i16 = this.zzb;
            if (i14 >= i10 * i16) {
                break;
            }
            this.zzh[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.zzq += i10;
        zzm();
        if (this.zzr > i12) {
            this.zzr = i12;
        }
        this.zzq = 0;
        this.zzt = 0;
        this.zzs = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        zzj(i11);
        shortBuffer.get(this.zzh, this.zzq * this.zzb, (i12 + i12) / 2);
        this.zzq += i11;
        zzm();
    }

    public final void zze(float f10) {
        this.zzp = f10;
    }

    public final void zzf(float f10) {
        this.zzo = f10;
    }
}
