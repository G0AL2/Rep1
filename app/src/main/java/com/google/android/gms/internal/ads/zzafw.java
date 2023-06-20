package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafw implements zzaga {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzdx zzc = new zzdx(new byte[7], 7);
    private final zzdy zzd = new zzdy(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzzy zzg;
    private zzzy zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzzy zzu;
    private long zzv;

    public zzafw(boolean z10, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z10;
        this.zze = str;
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzzy zzzyVar, long j10, int i10, int i11) {
        this.zzi = 4;
        this.zzj = i10;
        this.zzu = zzzyVar;
        this.zzv = j10;
        this.zzs = i11;
    }

    private final boolean zzk(zzdy zzdyVar, byte[] bArr, int i10) {
        int min = Math.min(zzdyVar.zza(), i10 - this.zzj);
        zzdyVar.zzB(bArr, this.zzj, min);
        int i11 = this.zzj + min;
        this.zzj = i11;
        return i11 == i10;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | 65280);
    }

    private static final boolean zzm(zzdy zzdyVar, byte[] bArr, int i10) {
        if (zzdyVar.zza() < i10) {
            return false;
        }
        zzdyVar.zzB(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) throws zzbp {
        int i10;
        int i11;
        int i12;
        Objects.requireNonNull(this.zzg);
        int i13 = zzeg.zza;
        while (zzdyVar.zza() > 0) {
            int i14 = this.zzi;
            int i15 = 13;
            int i16 = 2;
            if (i14 == 0) {
                byte[] zzH = zzdyVar.zzH();
                int zzc = zzdyVar.zzc();
                int zzd = zzdyVar.zzd();
                while (true) {
                    if (zzc < zzd) {
                        i10 = zzc + 1;
                        i11 = zzH[zzc] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                        if (this.zzk == 512 && zzl((byte) -1, (byte) i11)) {
                            if (!this.zzm) {
                                int i17 = i10 - 2;
                                zzdyVar.zzF(i17 + 1);
                                if (zzm(zzdyVar, this.zzc.zza, 1)) {
                                    this.zzc.zzh(4);
                                    int zzc2 = this.zzc.zzc(1);
                                    int i18 = this.zzn;
                                    if (i18 == -1 || zzc2 == i18) {
                                        if (this.zzo != -1) {
                                            if (!zzm(zzdyVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzh(i16);
                                            if (this.zzc.zzc(4) == this.zzo) {
                                                zzdyVar.zzF(i17 + 2);
                                            }
                                        }
                                        if (!zzm(zzdyVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzh(14);
                                        int zzc3 = this.zzc.zzc(i15);
                                        if (zzc3 >= 7) {
                                            byte[] zzH2 = zzdyVar.zzH();
                                            int zzd2 = zzdyVar.zzd();
                                            int i19 = i17 + zzc3;
                                            if (i19 < zzd2) {
                                                byte b10 = zzH2[i19];
                                                if (b10 != -1) {
                                                    if (b10 == 73) {
                                                        int i20 = i19 + 1;
                                                        if (i20 == zzd2) {
                                                            break;
                                                        } else if (zzH2[i20] == 68) {
                                                            int i21 = i19 + 2;
                                                            if (i21 == zzd2) {
                                                                break;
                                                            } else if (zzH2[i21] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i22 = i19 + 1;
                                                    if (i22 == zzd2) {
                                                        break;
                                                    }
                                                    byte b11 = zzH2[i22];
                                                    if (zzl((byte) -1, b11) && ((b11 & 8) >> 3) == zzc2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i23 = this.zzk;
                        int i24 = i23 | i11;
                        if (i24 == 329) {
                            i12 = 768;
                        } else if (i24 == 511) {
                            i12 = AdRequest.MAX_CONTENT_URL_LENGTH;
                        } else if (i24 == 836) {
                            i12 = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                        } else if (i24 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzF(0);
                            zzdyVar.zzF(i10);
                            break;
                        } else if (i23 != 256) {
                            this.zzk = 256;
                            zzc = i10 - 1;
                            i15 = 13;
                            i16 = 2;
                        } else {
                            zzc = i10;
                            i15 = 13;
                            i16 = 2;
                        }
                        this.zzk = i12;
                        zzc = i10;
                        i15 = 13;
                        i16 = 2;
                    } else {
                        zzdyVar.zzF(zzc);
                        break;
                    }
                }
                this.zzp = (i11 & 8) >> 3;
                this.zzl = 1 == ((i11 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzdyVar.zzF(i10);
            } else if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        int min = Math.min(zzdyVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzdyVar, min);
                        int i25 = this.zzj + min;
                        this.zzj = i25;
                        int i26 = this.zzs;
                        if (i25 == i26) {
                            long j10 = this.zzt;
                            if (j10 != -9223372036854775807L) {
                                this.zzu.zzs(j10, 1, i26, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzdyVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzh(0);
                            if (!this.zzq) {
                                int zzc4 = this.zzc.zzc(2) + 1;
                                if (zzc4 != 2) {
                                    Log.w("AdtsReader", "Detected audio object type: " + zzc4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzj(5);
                                int zzc5 = this.zzc.zzc(3);
                                int i27 = this.zzo;
                                int i28 = zzxt.zza;
                                byte[] bArr = {(byte) (((i27 >> 1) & 7) | 16), (byte) (((zzc5 << 3) & 120) | ((i27 << 7) & 128))};
                                zzxs zza2 = zzxt.zza(bArr);
                                zzab zzabVar = new zzab();
                                zzabVar.zzH(this.zzf);
                                zzabVar.zzS(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC);
                                zzabVar.zzx(zza2.zzc);
                                zzabVar.zzw(zza2.zzb);
                                zzabVar.zzT(zza2.zza);
                                zzabVar.zzI(Collections.singletonList(bArr));
                                zzabVar.zzK(this.zze);
                                zzad zzY = zzabVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            } else {
                                this.zzc.zzj(10);
                            }
                            this.zzc.zzj(4);
                            int zzc6 = this.zzc.zzc(13) - 7;
                            if (this.zzl) {
                                zzc6 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzc6);
                        }
                    }
                } else if (zzk(zzdyVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
                }
            } else if (zzdyVar.zza() != 0) {
                zzdx zzdxVar = this.zzc;
                zzdxVar.zza[0] = zzdyVar.zzH()[zzdyVar.zzc()];
                zzdxVar.zzh(2);
                int zzc7 = this.zzc.zzc(4);
                int i29 = this.zzo;
                if (i29 != -1 && zzc7 != i29) {
                    zzg();
                } else {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzc7;
                    }
                    zzi();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzf = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzyq();
            return;
        }
        zzahmVar.zzc();
        zzzy zzv2 = zzyuVar.zzv(zzahmVar.zza(), 5);
        this.zzh = zzv2;
        zzab zzabVar = new zzab();
        zzabVar.zzH(zzahmVar.zzb());
        zzabVar.zzS("application/id3");
        zzv2.zzk(zzabVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.zzt = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
