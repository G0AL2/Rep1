package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzauo implements zzatw {
    public static final zzaty zza = new zzauj();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzazc zzE;
    private zzazc zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzatx zzab;
    private final zzaui zzac;
    private final zzauq zze;
    private final SparseArray zzf;
    private final boolean zzg;
    private final zzazh zzh;
    private final zzazh zzi;
    private final zzazh zzj;
    private final zzazh zzk;
    private final zzazh zzl;
    private final zzazh zzm;
    private final zzazh zzn;
    private final zzazh zzo;
    private final zzazh zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzaun zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzauo() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int zzl(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean zzm(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    private final long zzn(long j10) throws zzarw {
        long j11 = this.zzt;
        if (j11 != -9223372036854775807L) {
            return zzazo.zzj(j10, j11, 1000L);
        }
        throw new zzarw("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void zzo(zzaun zzaunVar, long j10) {
        int i10;
        byte[] zzq;
        if ("S_TEXT/UTF8".equals(zzaunVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j11 = this.zzJ;
            if (j11 == -9223372036854775807L) {
                zzq = zzc;
            } else {
                int i11 = (int) (j11 / 3600000000L);
                long j12 = j11 - (i11 * 3600000000L);
                int i12 = (int) (j12 / 60000000);
                long j13 = j12 - (60000000 * i12);
                zzq = zzazo.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) (j13 / 1000000)), Integer.valueOf((int) ((j13 - (i10 * 1000000)) / 1000))));
            }
            System.arraycopy(zzq, 0, bArr, 19, 12);
            zzauf zzaufVar = zzaunVar.zzN;
            zzazh zzazhVar = this.zzn;
            zzaufVar.zzb(zzazhVar, zzazhVar.zzd());
            this.zzY += this.zzn.zzd();
        }
        zzaunVar.zzN.zzc(j10, this.zzP, this.zzY, 0, zzaunVar.zzg);
        this.zzZ = true;
        zzp();
    }

    private final void zzp() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = (byte) 0;
        this.zzT = false;
        this.zzm.zzr();
    }

    private static int[] zzq(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final int zzr(zzatv zzatvVar, zzauf zzaufVar, int i10) throws IOException, InterruptedException {
        int zzd2;
        int zza2 = this.zzm.zza();
        if (zza2 > 0) {
            zzd2 = Math.min(i10, zza2);
            zzaufVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzaufVar.zzd(zzatvVar, i10, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    private final void zzs(zzatv zzatvVar, int i10) throws IOException, InterruptedException {
        if (this.zzj.zzd() >= i10) {
            return;
        }
        if (this.zzj.zzb() < i10) {
            zzazh zzazhVar = this.zzj;
            byte[] bArr = zzazhVar.zza;
            int length = bArr.length;
            zzazhVar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i10)), this.zzj.zzd());
        }
        zzazh zzazhVar2 = this.zzj;
        zzatvVar.zzh(zzazhVar2.zza, zzazhVar2.zzd(), i10 - this.zzj.zzd(), false);
        this.zzj.zzu(i10);
    }

    private final void zzt(zzatv zzatvVar, zzaun zzaunVar, int i10) throws IOException, InterruptedException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzaunVar.zza)) {
            int i12 = i10 + 32;
            if (this.zzn.zzb() < i12) {
                this.zzn.zza = Arrays.copyOf(zzb, i12 + i10);
            }
            zzatvVar.zzh(this.zzn.zza, 32, i10, false);
            this.zzn.zzv(0);
            this.zzn.zzu(i12);
            return;
        }
        zzauf zzaufVar = zzaunVar.zzN;
        if (!this.zzR) {
            if (zzaunVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzatvVar.zzh(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b10 = this.zzj.zza[0];
                    if ((b10 & 128) != 128) {
                        this.zzV = b10;
                        this.zzS = true;
                    } else {
                        throw new zzarw("Extension bit is set in signal byte");
                    }
                }
                byte b11 = this.zzV;
                if ((b11 & 1) == 1) {
                    int i13 = b11 & 2;
                    this.zzP |= 1073741824;
                    if (!this.zzT) {
                        zzatvVar.zzh(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzazh zzazhVar = this.zzj;
                        zzazhVar.zza[0] = (byte) ((i13 != 2 ? 0 : 128) | 8);
                        zzazhVar.zzv(0);
                        zzaufVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzv(0);
                        zzaufVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i13 == 2) {
                        if (!this.zzU) {
                            zzatvVar.zzh(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzv(0);
                            this.zzW = this.zzj.zzg();
                            this.zzU = true;
                        }
                        int i14 = this.zzW * 4;
                        this.zzj.zzs(i14);
                        zzatvVar.zzh(this.zzj.zza, 0, i14, false);
                        this.zzQ += i14;
                        int i15 = (this.zzW >> 1) + 1;
                        int i16 = (i15 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.zzq = ByteBuffer.allocate(i16);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i15);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.zzW;
                            if (i17 >= i11) {
                                break;
                            }
                            int zzi = this.zzj.zzi();
                            if (i17 % 2 == 0) {
                                this.zzq.putShort((short) (zzi - i18));
                            } else {
                                this.zzq.putInt(zzi - i18);
                            }
                            i17++;
                            i18 = zzi;
                        }
                        int i19 = (i10 - this.zzQ) - i18;
                        if ((i11 & 1) == 1) {
                            this.zzq.putInt(i19);
                        } else {
                            this.zzq.putShort((short) i19);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzt(this.zzq.array(), i16);
                        zzaufVar.zzb(this.zzp, i16);
                        this.zzY += i16;
                    }
                }
            } else {
                byte[] bArr = zzaunVar.zzf;
                if (bArr != null) {
                    this.zzm.zzt(bArr, bArr.length);
                }
            }
            this.zzR = true;
        }
        int zzd2 = i10 + this.zzm.zzd();
        if (!"V_MPEG4/ISO/AVC".equals(zzaunVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzaunVar.zza)) {
            while (true) {
                int i20 = this.zzQ;
                if (i20 >= zzd2) {
                    break;
                }
                zzr(zzatvVar, zzaufVar, zzd2 - i20);
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i21 = zzaunVar.zzO;
            int i22 = 4 - i21;
            while (this.zzQ < zzd2) {
                int i23 = this.zzX;
                if (i23 == 0) {
                    int min = Math.min(i21, this.zzm.zza());
                    zzatvVar.zzh(bArr2, i22 + min, i21 - min, false);
                    if (min > 0) {
                        this.zzm.zzq(bArr2, i22, min);
                    }
                    this.zzQ += i21;
                    this.zzi.zzv(0);
                    this.zzX = this.zzi.zzi();
                    this.zzh.zzv(0);
                    zzaufVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i23 - zzr(zzatvVar, zzaufVar, i23);
                }
            }
        }
        if ("A_VORBIS".equals(zzaunVar.zza)) {
            this.zzk.zzv(0);
            zzaufVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i10) throws zzarw {
        zzaud zzaucVar;
        zzazc zzazcVar;
        zzazc zzazcVar2;
        int i11;
        int i12 = 0;
        if (i10 == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzo((zzaun) this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        } else if (i10 == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzaun zzaunVar = this.zzw;
                zzaunVar.zzb(this.zzab, zzaunVar.zzb);
                SparseArray sparseArray = this.zzf;
                zzaun zzaunVar2 = this.zzw;
                sparseArray.put(zzaunVar2.zzb, zzaunVar2);
            }
            this.zzw = null;
        } else if (i10 == 19899) {
            int i13 = this.zzy;
            if (i13 != -1) {
                long j10 = this.zzz;
                if (j10 != -1) {
                    if (i13 == 475249515) {
                        this.zzB = j10;
                        return;
                    }
                    return;
                }
            }
            throw new zzarw("Mandatory element SeekID or SeekPosition not found");
        } else if (i10 == 25152) {
            zzaun zzaunVar3 = this.zzw;
            if (zzaunVar3.zze) {
                if (zzaunVar3.zzg != null) {
                    zzaunVar3.zzi = new zzats(new zzatr(zzare.zzb, "video/webm", this.zzw.zzg.zzb, false));
                    return;
                }
                throw new zzarw("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (i10 == 28032) {
            zzaun zzaunVar4 = this.zzw;
            if (zzaunVar4.zze && zzaunVar4.zzf != null) {
                throw new zzarw("Combining encryption and compression is not supported");
            }
        } else if (i10 == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j11 = this.zzu;
            if (j11 != -9223372036854775807L) {
                this.zzv = zzn(j11);
            }
        } else if (i10 != 374648427) {
            if (i10 == 475249515 && !this.zzx) {
                zzatx zzatxVar = this.zzab;
                if (this.zzs != -1 && this.zzv != -9223372036854775807L && (zzazcVar = this.zzE) != null && zzazcVar.zza() != 0 && (zzazcVar2 = this.zzF) != null && zzazcVar2.zza() == zzazcVar.zza()) {
                    int zza2 = zzazcVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i14 = 0; i14 < zza2; i14++) {
                        jArr3[i14] = this.zzE.zzb(i14);
                        jArr[i14] = this.zzs + this.zzF.zzb(i14);
                    }
                    while (true) {
                        i11 = zza2 - 1;
                        if (i12 >= i11) {
                            break;
                        }
                        int i15 = i12 + 1;
                        iArr[i12] = (int) (jArr[i15] - jArr[i12]);
                        jArr2[i12] = jArr3[i15] - jArr3[i12];
                        i12 = i15;
                    }
                    iArr[i11] = (int) ((this.zzs + this.zzr) - jArr[i11]);
                    jArr2[i11] = this.zzv - jArr3[i11];
                    this.zzE = null;
                    this.zzF = null;
                    zzaucVar = new zzatu(iArr, jArr, jArr2, jArr3);
                } else {
                    this.zzE = null;
                    this.zzF = null;
                    zzaucVar = new zzauc(this.zzv);
                }
                zzatxVar.zzc(zzaucVar);
                this.zzx = true;
            }
        } else if (this.zzf.size() != 0) {
            this.zzab.zzb();
        } else {
            throw new zzarw("No valid tracks were found");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i10, double d10) {
        if (i10 == 181) {
            this.zzw.zzI = (int) d10;
        } else if (i10 == 17545) {
            this.zzu = (long) d10;
        } else {
            switch (i10) {
                case 21969:
                    this.zzw.zzw = (float) d10;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d10;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d10;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d10;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d10;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d10;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d10;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d10;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d10;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d10;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatxVar) {
        this.zzab = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zze(long j10, long j11) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zzd();
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatvVar, zzaub zzaubVar) throws IOException, InterruptedException {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzatvVar)) {
                return -1;
            }
            long zzd2 = zzatvVar.zzd();
            if (this.zzA) {
                this.zzC = zzd2;
                zzaubVar.zza = this.zzB;
                this.zzA = false;
                return 1;
            } else if (this.zzx) {
                long j10 = this.zzC;
                if (j10 != -1) {
                    zzaubVar.zza = j10;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatvVar) throws IOException, InterruptedException {
        return new zzaup().zza(zzatvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i10, long j10) throws zzarw {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw new zzarw("ContentEncodingOrder " + j10 + " not supported");
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw new zzarw("ContentEncodingScope " + j10 + " not supported");
        } else {
            switch (i10) {
                case 131:
                    this.zzw.zzc = (int) j10;
                    return;
                case 136:
                    this.zzw.zzL = j10 == 1;
                    return;
                case 155:
                    this.zzJ = zzn(j10);
                    return;
                case 159:
                    this.zzw.zzG = (int) j10;
                    return;
                case 176:
                    this.zzw.zzj = (int) j10;
                    return;
                case 179:
                    this.zzE.zzc(zzn(j10));
                    return;
                case 186:
                    this.zzw.zzk = (int) j10;
                    return;
                case 215:
                    this.zzw.zzb = (int) j10;
                    return;
                case 231:
                    this.zzD = zzn(j10);
                    return;
                case 241:
                    if (this.zzG) {
                        return;
                    }
                    this.zzF.zzc(j10);
                    this.zzG = true;
                    return;
                case 251:
                    this.zzaa = true;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw new zzarw("ContentCompAlgo " + j10 + " not supported");
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        throw new zzarw("DocTypeReadVersion " + j10 + " not supported");
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw new zzarw("EBMLReadVersion " + j10 + " not supported");
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw new zzarw("ContentEncAlgo " + j10 + " not supported");
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw new zzarw("AESSettingsCipherMode " + j10 + " not supported");
                case 21420:
                    this.zzz = j10 + this.zzs;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    if (i11 == 0) {
                        this.zzw.zzp = 0;
                        return;
                    } else if (i11 == 1) {
                        this.zzw.zzp = 2;
                        return;
                    } else if (i11 == 3) {
                        this.zzw.zzp = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.zzw.zzp = 3;
                        return;
                    }
                case 21680:
                    this.zzw.zzl = (int) j10;
                    return;
                case 21682:
                    this.zzw.zzn = (int) j10;
                    return;
                case 21690:
                    this.zzw.zzm = (int) j10;
                    return;
                case 21930:
                    this.zzw.zzM = j10 == 1;
                    return;
                case 22186:
                    this.zzw.zzJ = j10;
                    return;
                case 22203:
                    this.zzw.zzK = j10;
                    return;
                case 25188:
                    this.zzw.zzH = (int) j10;
                    return;
                case 2352003:
                    this.zzw.zzd = (int) j10;
                    return;
                case 2807729:
                    this.zzt = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            int i12 = (int) j10;
                            if (i12 == 1) {
                                this.zzw.zzt = 2;
                                return;
                            } else if (i12 != 2) {
                                return;
                            } else {
                                this.zzw.zzt = 1;
                                return;
                            }
                        case 21946:
                            int i13 = (int) j10;
                            if (i13 != 1) {
                                if (i13 == 16) {
                                    this.zzw.zzs = 6;
                                    return;
                                } else if (i13 == 18) {
                                    this.zzw.zzs = 7;
                                    return;
                                } else if (i13 != 6 && i13 != 7) {
                                    return;
                                }
                            }
                            this.zzw.zzs = 3;
                            return;
                        case 21947:
                            zzaun zzaunVar = this.zzw;
                            zzaunVar.zzq = true;
                            int i14 = (int) j10;
                            if (i14 == 1) {
                                zzaunVar.zzr = 1;
                                return;
                            } else if (i14 == 9) {
                                zzaunVar.zzr = 6;
                                return;
                            } else if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                zzaunVar.zzr = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzw.zzu = (int) j10;
                            return;
                        case 21949:
                            this.zzw.zzv = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i10, long j10, long j11) throws zzarw {
        if (i10 == 160) {
            this.zzaa = false;
        } else if (i10 == 174) {
            this.zzw = new zzaun(null);
        } else if (i10 == 187) {
            this.zzG = false;
        } else if (i10 == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
        } else if (i10 == 20533) {
            this.zzw.zze = true;
        } else if (i10 == 21968) {
            this.zzw.zzq = true;
        } else if (i10 == 408125543) {
            long j12 = this.zzs;
            if (j12 != -1 && j12 != j10) {
                throw new zzarw("Multiple Segment elements not supported");
            }
            this.zzs = j10;
            this.zzr = j11;
        } else if (i10 == 475249515) {
            this.zzE = new zzazc(32);
            this.zzF = new zzazc(32);
        } else if (i10 == 524531317 && !this.zzx) {
            if (this.zzg && this.zzB != -1) {
                this.zzA = true;
                return;
            }
            this.zzab.zzc(new zzauc(this.zzv));
            this.zzx = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i10, String str) throws zzarw {
        if (i10 == 134) {
            this.zzw.zza = str;
        } else if (i10 != 17026) {
            if (i10 != 2274716) {
                return;
            }
            zzaun.zza(this.zzw, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            throw new zzarw("DocType " + str + " not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01eb, code lost:
        throw new com.google.android.gms.internal.ads.zzarw("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(int r19, int r20, com.google.android.gms.internal.ads.zzatv r21) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauo.zzk(int, int, com.google.android.gms.internal.ads.zzatv):void");
    }

    public zzauo(int i10) {
        zzaui zzauiVar = new zzaui();
        this.zzs = -1L;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1L;
        this.zzC = -1L;
        this.zzD = -9223372036854775807L;
        this.zzac = zzauiVar;
        zzauiVar.zzb(new zzaul(this, null));
        this.zzg = true;
        this.zze = new zzauq();
        this.zzf = new SparseArray();
        this.zzj = new zzazh(4);
        this.zzk = new zzazh(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzazh(4);
        this.zzh = new zzazh(zzazf.zza);
        this.zzi = new zzazh(4);
        this.zzm = new zzazh();
        this.zzn = new zzazh();
        this.zzo = new zzazh(8);
        this.zzp = new zzazh();
    }
}
