package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzov {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzov(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / DownloadResource.STATUS_BAD_REQUEST;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
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
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
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
        this.zzu = i14 / i16;
        this.zzv = i17 / i15;
        return i16;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] zzl = zzl(this.zzl, this.zzm, i11);
        this.zzl = zzl;
        int i12 = this.zzb;
        System.arraycopy(sArr, i10 * i12, zzl, this.zzm * i12, i12 * i11);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12 = this.zzh / i11;
        int i13 = this.zzb;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.zzi[i16] = (short) (i17 / i14);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    private final void zzk() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zzd;
        float f12 = f10 / f11;
        float f13 = this.zze * f11;
        double d10 = f12;
        float f14 = 1.0f;
        int i19 = 1;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i20 = this.zzk;
            if (i20 >= this.zzh) {
                int i21 = 0;
                while (true) {
                    int i22 = this.zzr;
                    if (i22 > 0) {
                        int min = Math.min(this.zzh, i22);
                        zzh(this.zzj, i21, min);
                        this.zzr -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i23 = this.zza;
                        int i24 = i23 > 4000 ? i23 / TTAdSdk.INIT_LOCAL_FAIL_CODE : 1;
                        if (this.zzb == i19 && i24 == i19) {
                            i10 = zzg(sArr, i21, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i21, i24);
                            int zzg = zzg(this.zzi, 0, this.zzf / i24, this.zzg / i24);
                            if (i24 != i19) {
                                int i25 = zzg * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.zzf;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.zzg;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.zzb == i19) {
                                    i10 = zzg(sArr, i21, i27, i28);
                                } else {
                                    zzi(sArr, i21, i19);
                                    i10 = zzg(this.zzi, 0, i27, i28);
                                }
                            } else {
                                i10 = zzg;
                            }
                        }
                        int i31 = this.zzu;
                        int i32 = (i31 == 0 || (i13 = this.zzs) == 0 || this.zzv > i31 * 3 || i31 + i31 <= this.zzt * 3) ? i10 : i13;
                        this.zzt = i31;
                        this.zzs = i10;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f12 >= 2.0f) {
                                i12 = (int) (i32 / ((-1.0f) + f12));
                            } else {
                                this.zzr = (int) ((i32 * (2.0f - f12)) / ((-1.0f) + f12));
                                i12 = i32;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i12);
                            this.zzl = zzl;
                            int i33 = i12;
                            zzj(i12, this.zzb, zzl, this.zzm, sArr2, i21, sArr2, i21 + i32);
                            this.zzm += i33;
                            i21 += i32 + i33;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.zzj;
                            if (f12 < 0.5f) {
                                i11 = (int) ((i34 * f12) / (f14 - f12));
                            } else {
                                this.zzr = (int) ((i34 * ((f12 + f12) - 1.0f)) / (f14 - f12));
                                i11 = i34;
                            }
                            int i35 = i34 + i11;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i35);
                            this.zzl = zzl2;
                            int i36 = this.zzb;
                            System.arraycopy(sArr3, i21 * i36, zzl2, this.zzm * i36, i36 * i34);
                            zzj(i11, this.zzb, this.zzl, this.zzm + i34, sArr3, i21 + i34, sArr3, i21);
                            this.zzm += i35;
                            i21 += i11;
                        }
                    }
                    if (this.zzh + i21 > i20) {
                        break;
                    }
                    f14 = 1.0f;
                    i19 = 1;
                }
                int i37 = this.zzk - i21;
                short[] sArr4 = this.zzj;
                int i38 = this.zzb;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.zzk = i37;
                f14 = 1.0f;
            }
        }
        if (f13 == f14 || this.zzm == i18) {
            return;
        }
        int i39 = this.zza;
        int i40 = (int) (i39 / f13);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.zzm - i18;
        short[] zzl3 = zzl(this.zzn, this.zzo, i41);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i42 = this.zzb;
        System.arraycopy(sArr5, i18 * i42, zzl3, this.zzo * i42, i42 * i41);
        this.zzm = i18;
        this.zzo += i41;
        int i43 = 0;
        while (true) {
            i14 = this.zzo;
            i15 = i14 - 1;
            if (i43 >= i15) {
                break;
            }
            while (true) {
                i16 = this.zzp + 1;
                i17 = this.zzq;
                if (i16 * i40 <= i17 * i39) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.zzb;
                    if (i44 < i45) {
                        short[] sArr6 = this.zzl;
                        int i46 = this.zzm;
                        short[] sArr7 = this.zzn;
                        int i47 = (i43 * i45) + i44;
                        short s10 = sArr7[i47];
                        short s11 = sArr7[i47 + i45];
                        int i48 = this.zzq;
                        int i49 = this.zzp;
                        int i50 = (i49 + 1) * i40;
                        int i51 = i50 - (i48 * i39);
                        int i52 = i50 - (i49 * i40);
                        sArr6[(i46 * i45) + i44] = (short) (((s10 * i51) + ((i52 - i51) * s11)) / i52);
                        i44++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i16;
            if (i16 == i39) {
                this.zzp = 0;
                zzcw.zzf(i17 == i40);
                this.zzq = 0;
            }
            i43++;
        }
        if (i15 != 0) {
            short[] sArr8 = this.zzn;
            int i53 = this.zzb;
            System.arraycopy(sArr8, i15 * i53, sArr8, 0, (i14 - i15) * i53);
            this.zzo -= i15;
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i10 = this.zzm - min;
        this.zzm = i10;
        short[] sArr = this.zzl;
        int i11 = this.zzb;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i12 = this.zzm + ((int) ((((i11 / (f10 / f11)) + this.zzo) / (this.zze * f11)) + 0.5f));
        short[] sArr = this.zzj;
        int i13 = this.zzh;
        this.zzj = zzl(sArr, i11, i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.zzh;
            i10 = i15 + i15;
            int i16 = this.zzb;
            if (i14 >= i10 * i16) {
                break;
            }
            this.zzj[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i12) {
            this.zzm = i12;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = remaining / i10;
        int i12 = i10 * i11;
        short[] zzl = zzl(this.zzj, this.zzk, i11);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
