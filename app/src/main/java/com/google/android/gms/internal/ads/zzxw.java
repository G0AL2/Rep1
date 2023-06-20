package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxw {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & 63);
    }

    public static zzad zzc(zzdy zzdyVar, String str, String str2, zzv zzvVar) {
        int i10 = zzc[(zzdyVar.zzk() & DownloadResource.STATUS_RUNNING) >> 6];
        int zzk = zzdyVar.zzk();
        int i11 = zze[(zzk & 56) >> 3];
        if ((zzk & 4) != 0) {
            i11++;
        }
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS("audio/ac3");
        zzabVar.zzw(i11);
        zzabVar.zzT(i10);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzad zzd(zzdy zzdyVar, String str, String str2, zzv zzvVar) {
        zzdyVar.zzG(2);
        int i10 = zzc[(zzdyVar.zzk() & DownloadResource.STATUS_RUNNING) >> 6];
        int zzk = zzdyVar.zzk();
        int i11 = zze[(zzk & 14) >> 1];
        if ((zzk & 1) != 0) {
            i11++;
        }
        if (((zzdyVar.zzk() & 30) >> 1) > 0 && (2 & zzdyVar.zzk()) != 0) {
            i11 += 2;
        }
        String str3 = (zzdyVar.zza() <= 0 || (zzdyVar.zzk() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        zzab zzabVar = new zzab();
        zzabVar.zzH(str);
        zzabVar.zzS(str3);
        zzabVar.zzw(i11);
        zzabVar.zzT(i10);
        zzabVar.zzB(zzvVar);
        zzabVar.zzK(str2);
        return zzabVar.zzY();
    }

    public static zzxv zze(zzdx zzdxVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int zzc2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzb2 = zzdxVar.zzb();
        zzdxVar.zzj(40);
        int zzc3 = zzdxVar.zzc(5);
        zzdxVar.zzh(zzb2);
        int i20 = -1;
        if (zzc3 > 10) {
            zzdxVar.zzj(16);
            int zzc4 = zzdxVar.zzc(2);
            if (zzc4 == 0) {
                i20 = 0;
            } else if (zzc4 == 1) {
                i20 = 1;
            } else if (zzc4 == 2) {
                i20 = 2;
            }
            zzdxVar.zzj(3);
            int zzc5 = zzdxVar.zzc(11) + 1;
            int i21 = zzc5 + zzc5;
            int zzc6 = zzdxVar.zzc(2);
            if (zzc6 == 3) {
                i16 = zzd[zzdxVar.zzc(2)];
                zzc2 = 3;
                i15 = 6;
            } else {
                zzc2 = zzdxVar.zzc(2);
                i15 = zzb[zzc2];
                i16 = zzc[zzc6];
            }
            int i22 = i15 * 256;
            int zzc7 = zzdxVar.zzc(3);
            boolean zzl = zzdxVar.zzl();
            int i23 = zze[zzc7] + (zzl ? 1 : 0);
            zzdxVar.zzj(10);
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(8);
            }
            if (zzc7 == 0) {
                zzdxVar.zzj(5);
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(8);
                }
                i17 = 0;
                zzc7 = 0;
            } else {
                i17 = zzc7;
            }
            if (i20 == 1) {
                if (zzdxVar.zzl()) {
                    zzdxVar.zzj(16);
                }
                i18 = 1;
            } else {
                i18 = i20;
            }
            if (zzdxVar.zzl()) {
                if (i17 > 2) {
                    zzdxVar.zzj(2);
                }
                if ((i17 & 1) != 0 && i17 > 2) {
                    zzdxVar.zzj(6);
                }
                if ((i17 & 4) != 0) {
                    zzdxVar.zzj(6);
                }
                if (zzl && zzdxVar.zzl()) {
                    zzdxVar.zzj(5);
                }
                if (i18 == 0) {
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (i17 == 0 && zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(6);
                    }
                    int zzc8 = zzdxVar.zzc(2);
                    if (zzc8 == 1) {
                        zzdxVar.zzj(5);
                    } else if (zzc8 == 2) {
                        zzdxVar.zzj(12);
                    } else if (zzc8 == 3) {
                        int zzc9 = zzdxVar.zzc(5);
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(4);
                            }
                            if (zzdxVar.zzl()) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(4);
                                }
                            }
                        }
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(5);
                            if (zzdxVar.zzl()) {
                                zzdxVar.zzj(7);
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(8);
                                    zzdxVar.zzj((zzc9 + 2) * 8);
                                    zzdxVar.zzd();
                                }
                            }
                        }
                        zzdxVar.zzj((zzc9 + 2) * 8);
                        zzdxVar.zzd();
                    }
                    if (i17 < 2) {
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                        if (zzc7 == 0 && zzdxVar.zzl()) {
                            zzdxVar.zzj(14);
                        }
                    }
                    if (zzdxVar.zzl()) {
                        if (zzc2 == 0) {
                            zzdxVar.zzj(5);
                            i18 = 0;
                            zzc2 = 0;
                        } else {
                            for (int i24 = 0; i24 < i15; i24++) {
                                if (zzdxVar.zzl()) {
                                    zzdxVar.zzj(5);
                                }
                            }
                        }
                    }
                    i18 = 0;
                }
            }
            if (zzdxVar.zzl()) {
                zzdxVar.zzj(5);
                if (i17 == 2) {
                    zzdxVar.zzj(4);
                    i17 = 2;
                }
                if (i17 >= 6) {
                    zzdxVar.zzj(2);
                }
                if (zzdxVar.zzl()) {
                    i19 = 8;
                    zzdxVar.zzj(8);
                } else {
                    i19 = 8;
                }
                if (i17 == 0 && zzdxVar.zzl()) {
                    zzdxVar.zzj(i19);
                }
                if (zzc6 < 3) {
                    zzdxVar.zzi();
                }
            }
            if (i18 == 0 && zzc2 != 3) {
                zzdxVar.zzi();
            }
            if (i18 == 2 && (zzc2 == 3 || zzdxVar.zzl())) {
                zzdxVar.zzj(6);
            }
            str = (zzdxVar.zzl() && zzdxVar.zzc(6) == 1 && zzdxVar.zzc(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i20;
            i10 = i21;
            i14 = i22;
            i11 = i16;
            i12 = i23;
        } else {
            zzdxVar.zzj(32);
            int zzc10 = zzdxVar.zzc(2);
            String str2 = zzc10 == 3 ? null : "audio/ac3";
            int zzf2 = zzf(zzc10, zzdxVar.zzc(6));
            zzdxVar.zzj(8);
            int zzc11 = zzdxVar.zzc(3);
            if ((zzc11 & 1) != 0 && zzc11 != 1) {
                zzdxVar.zzj(2);
            }
            if ((zzc11 & 4) != 0) {
                zzdxVar.zzj(2);
            }
            if (zzc11 == 2) {
                zzdxVar.zzj(2);
            }
            str = str2;
            i10 = zzf2;
            i11 = zzc10 < 3 ? zzc[zzc10] : -1;
            i12 = zze[zzc11] + (zzdxVar.zzl() ? 1 : 0);
            i13 = -1;
            i14 = 1536;
        }
        return new zzxv(str, i13, i12, i11, i10, i14, null);
    }

    private static int zzf(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = zzc[i10];
        if (i13 == 44100) {
            int i14 = zzg[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = zzf[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
