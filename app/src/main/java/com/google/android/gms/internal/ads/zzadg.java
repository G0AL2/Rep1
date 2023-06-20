package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadg implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzadc
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzadg.zza;
            return new zzyr[]{new zzadg(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzeg.zzZ("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzg;
    private long zzA;
    private zzadf zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzdo zzJ;
    private zzdo zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzyu zzai;
    private final zzadb zzh;
    private final zzadi zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzadg() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final int zzn(int i10) {
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
            case 238:
            case 241:
            case 251:
            case 16871:
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
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
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
            case 165:
            case 16877:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean zzo(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    private final int zzp(zzys zzysVar, zzadf zzadfVar, int i10, boolean z10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zzb, i10);
            int i12 = this.zzaa;
            zzw();
            return i12;
        } else if ("S_TEXT/ASS".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zzd, i10);
            int i13 = this.zzaa;
            zzw();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(zzadfVar.zzb)) {
            zzx(zzysVar, zze, i10);
            int i14 = this.zzaa;
            zzw();
            return i14;
        } else {
            zzzy zzzyVar = zzadfVar.zzV;
            if (!this.zzac) {
                if (zzadfVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzH()[0];
                            this.zzad = true;
                        } else {
                            throw zzbp.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.zzag;
                    if ((b10 & 1) == 1) {
                        int i15 = b10 & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            ((zzyl) zzysVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzzyVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzzyVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i15 == 2) {
                            if (!this.zzae) {
                                ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i16 = this.zzaf * 4;
                            this.zzn.zzC(i16);
                            ((zzyl) zzysVar).zzn(this.zzn.zzH(), 0, i16, false);
                            this.zzZ += i16;
                            int i17 = (this.zzaf >> 1) + 1;
                            int i18 = (i17 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i18) {
                                this.zzv = ByteBuffer.allocate(i18);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i17);
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                i11 = this.zzaf;
                                if (i19 >= i11) {
                                    break;
                                }
                                int zzn = this.zzn.zzn();
                                if (i19 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn - i20));
                                } else {
                                    this.zzv.putInt(zzn - i20);
                                }
                                i19++;
                                i20 = zzn;
                            }
                            int i21 = (i10 - this.zzZ) - i20;
                            if ((i11 & 1) == 1) {
                                this.zzv.putInt(i21);
                            } else {
                                this.zzv.putShort((short) i21);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i18);
                            zzzyVar.zzr(this.zzt, i18, 1);
                            this.zzaa += i18;
                        }
                    }
                } else {
                    byte[] bArr = zzadfVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzadfVar.zzb) ? zzadfVar.zzf > 0 : z10) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i10) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzzyVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = i10 + this.zzq.zzd();
            if (!"V_MPEG4/ISO/AVC".equals(zzadfVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzadfVar.zzb)) {
                if (zzadfVar.zzS != null) {
                    zzcw.zzf(this.zzq.zzd() == 0);
                    zzadfVar.zzS.zzd(zzysVar);
                }
                while (true) {
                    int i22 = this.zzZ;
                    if (i22 >= zzd3) {
                        break;
                    }
                    int zzq = zzq(zzysVar, zzzyVar, zzd3 - i22);
                    this.zzZ += zzq;
                    this.zzaa += zzq;
                }
            } else {
                byte[] zzH = this.zzm.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i23 = zzadfVar.zzW;
                int i24 = 4 - i23;
                while (this.zzZ < zzd3) {
                    int i25 = this.zzab;
                    if (i25 == 0) {
                        int min = Math.min(i23, this.zzq.zza());
                        ((zzyl) zzysVar).zzn(zzH, i24 + min, i23 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH, i24, min);
                        }
                        this.zzZ += i23;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzzw.zzb(zzzyVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq2 = zzq(zzysVar, zzzyVar, i25);
                        this.zzZ += zzq2;
                        this.zzaa += zzq2;
                        this.zzab -= zzq2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzadfVar.zzb)) {
                this.zzo.zzF(0);
                zzzw.zzb(zzzyVar, this.zzo, 4);
                this.zzaa += 4;
            }
            int i26 = this.zzaa;
            zzw();
            return i26;
        }
    }

    private final int zzq(zzys zzysVar, zzzy zzzyVar, int i10) throws IOException {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i10, zza2);
            zzzw.zzb(zzzyVar, this.zzq, min);
            return min;
        }
        return zzzw.zza(zzzyVar, zzysVar, i10, false);
    }

    private final long zzr(long j10) throws zzbp {
        long j11 = this.zzy;
        if (j11 != -9223372036854775807L) {
            return zzeg.zzw(j10, j11, 1000L);
        }
        throw zzbp.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i10) throws zzbp {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbp.zza("Element " + i10 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i10) throws zzbp {
        if (this.zzB != null) {
            return;
        }
        throw zzbp.zza("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzadf r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzu(com.google.android.gms.internal.ads.zzadf, long, int, int, int):void");
    }

    private final void zzv(zzys zzysVar, int i10) throws IOException {
        if (this.zzn.zzd() >= i10) {
            return;
        }
        if (this.zzn.zzb() < i10) {
            zzdy zzdyVar = this.zzn;
            int zzb2 = zzdyVar.zzb();
            zzdyVar.zzz(Math.max(zzb2 + zzb2, i10));
        }
        ((zzyl) zzysVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i10 - this.zzn.zzd(), false);
        this.zzn.zzE(i10);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzys zzysVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        if (this.zzr.zzb() < i11) {
            zzdy zzdyVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i11 + i10);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzyl) zzysVar).zzn(this.zzr.zzH(), length, i10, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i11);
    }

    private static byte[] zzy(long j10, String str, long j11) {
        zzcw.zzd(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        return zzeg.zzZ(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private static int[] zzz(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzysVar)) {
                for (int i10 = 0; i10 < this.zzj.size(); i10++) {
                    zzadf zzadfVar = (zzadf) this.zzj.valueAt(i10);
                    zzadf.zzd(zzadfVar);
                    zzzz zzzzVar = zzadfVar.zzS;
                    if (zzzzVar != null) {
                        zzzzVar.zza(zzadfVar.zzV, zzadfVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzysVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzzrVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            } else if (this.zzC) {
                long j10 = this.zzH;
                if (j10 != -1) {
                    zzzrVar.zza = j10;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzai = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i10 = 0; i10 < this.zzj.size(); i10++) {
            zzzz zzzzVar = ((zzadf) this.zzj.valueAt(i10)).zzS;
            if (zzzzVar != null) {
                zzzzVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return new zzadh().zza(zzysVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x027f, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r19, int r20, com.google.android.gms.internal.ads.zzys r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzg(int, int, com.google.android.gms.internal.ads.zzys):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) throws com.google.android.gms.internal.ads.zzbp {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadg.zzh(int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(int i10, double d10) throws zzbp {
        if (i10 == 181) {
            zzt(i10);
            this.zzB.zzP = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    zzt(i10);
                    this.zzB.zzC = (float) d10;
                    return;
                case 21970:
                    zzt(i10);
                    this.zzB.zzD = (float) d10;
                    return;
                case 21971:
                    zzt(i10);
                    this.zzB.zzE = (float) d10;
                    return;
                case 21972:
                    zzt(i10);
                    this.zzB.zzF = (float) d10;
                    return;
                case 21973:
                    zzt(i10);
                    this.zzB.zzG = (float) d10;
                    return;
                case 21974:
                    zzt(i10);
                    this.zzB.zzH = (float) d10;
                    return;
                case 21975:
                    zzt(i10);
                    this.zzB.zzI = (float) d10;
                    return;
                case 21976:
                    zzt(i10);
                    this.zzB.zzJ = (float) d10;
                    return;
                case 21977:
                    zzt(i10);
                    this.zzB.zzK = (float) d10;
                    return;
                case 21978:
                    zzt(i10);
                    this.zzB.zzL = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            zzt(i10);
                            this.zzB.zzr = (float) d10;
                            return;
                        case 30324:
                            zzt(i10);
                            this.zzB.zzs = (float) d10;
                            return;
                        case 30325:
                            zzt(i10);
                            this.zzB.zzt = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(int i10, long j10) throws zzbp {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzbp.zza("ContentEncodingOrder " + j10 + " not supported", null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzbp.zza("ContentEncodingScope " + j10 + " not supported", null);
        } else {
            switch (i10) {
                case 131:
                    zzt(i10);
                    this.zzB.zzd = (int) j10;
                    return;
                case 136:
                    zzt(i10);
                    this.zzB.zzU = j10 == 1;
                    return;
                case 155:
                    this.zzP = zzr(j10);
                    return;
                case 159:
                    zzt(i10);
                    this.zzB.zzN = (int) j10;
                    return;
                case 176:
                    zzt(i10);
                    this.zzB.zzl = (int) j10;
                    return;
                case 179:
                    zzs(i10);
                    this.zzJ.zzc(zzr(j10));
                    return;
                case 186:
                    zzt(i10);
                    this.zzB.zzm = (int) j10;
                    return;
                case 215:
                    zzt(i10);
                    this.zzB.zzc = (int) j10;
                    return;
                case 231:
                    this.zzI = zzr(j10);
                    return;
                case 238:
                    this.zzW = (int) j10;
                    return;
                case 241:
                    if (this.zzL) {
                        return;
                    }
                    zzs(i10);
                    this.zzK.zzc(j10);
                    this.zzL = true;
                    return;
                case 251:
                    this.zzX = true;
                    return;
                case 16871:
                    zzt(i10);
                    zzadf.zzb(this.zzB, (int) j10);
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    throw zzbp.zza("ContentCompAlgo " + j10 + " not supported", null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        throw zzbp.zza("DocTypeReadVersion " + j10 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    throw zzbp.zza("EBMLReadVersion " + j10 + " not supported", null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    throw zzbp.zza("ContentEncAlgo " + j10 + " not supported", null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    throw zzbp.zza("AESSettingsCipherMode " + j10 + " not supported", null);
                case 21420:
                    this.zzE = j10 + this.zzx;
                    return;
                case 21432:
                    zzt(i10);
                    int i11 = (int) j10;
                    if (i11 == 0) {
                        this.zzB.zzv = 0;
                        return;
                    } else if (i11 == 1) {
                        this.zzB.zzv = 2;
                        return;
                    } else if (i11 == 3) {
                        this.zzB.zzv = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.zzB.zzv = 3;
                        return;
                    }
                case 21680:
                    zzt(i10);
                    this.zzB.zzn = (int) j10;
                    return;
                case 21682:
                    zzt(i10);
                    this.zzB.zzp = (int) j10;
                    return;
                case 21690:
                    zzt(i10);
                    this.zzB.zzo = (int) j10;
                    return;
                case 21930:
                    zzt(i10);
                    this.zzB.zzT = j10 == 1;
                    return;
                case 21998:
                    zzt(i10);
                    this.zzB.zzf = (int) j10;
                    return;
                case 22186:
                    zzt(i10);
                    this.zzB.zzQ = j10;
                    return;
                case 22203:
                    zzt(i10);
                    this.zzB.zzR = j10;
                    return;
                case 25188:
                    zzt(i10);
                    this.zzB.zzO = (int) j10;
                    return;
                case 30114:
                    this.zzY = j10;
                    return;
                case 30321:
                    zzt(i10);
                    int i12 = (int) j10;
                    if (i12 == 0) {
                        this.zzB.zzq = 0;
                        return;
                    } else if (i12 == 1) {
                        this.zzB.zzq = 1;
                        return;
                    } else if (i12 == 2) {
                        this.zzB.zzq = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.zzB.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzt(i10);
                    this.zzB.zze = (int) j10;
                    return;
                case 2807729:
                    this.zzy = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            zzt(i10);
                            int i13 = (int) j10;
                            if (i13 == 1) {
                                this.zzB.zzz = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.zzB.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzt(i10);
                            int zzb2 = zzo.zzb((int) j10);
                            if (zzb2 != -1) {
                                this.zzB.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzt(i10);
                            zzadf zzadfVar = this.zzB;
                            zzadfVar.zzw = true;
                            int zza2 = zzo.zza((int) j10);
                            if (zza2 != -1) {
                                zzadfVar.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzt(i10);
                            this.zzB.zzA = (int) j10;
                            return;
                        case 21949:
                            zzt(i10);
                            this.zzB.zzB = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzk(int i10, long j10, long j11) throws zzbp {
        zzcw.zzb(this.zzai);
        if (i10 == 160) {
            this.zzX = false;
            this.zzY = 0L;
        } else if (i10 == 174) {
            this.zzB = new zzadf();
        } else if (i10 == 187) {
            this.zzL = false;
        } else if (i10 == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
        } else if (i10 == 20533) {
            zzt(i10);
            this.zzB.zzg = true;
        } else if (i10 == 21968) {
            zzt(i10);
            this.zzB.zzw = true;
        } else if (i10 == 408125543) {
            long j12 = this.zzx;
            if (j12 != -1 && j12 != j10) {
                throw zzbp.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j10;
            this.zzw = j11;
        } else if (i10 == 475249515) {
            this.zzJ = new zzdo(32);
            this.zzK = new zzdo(32);
        } else if (i10 == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
                return;
            }
            this.zzai.zzL(new zzzt(this.zzA, 0L));
            this.zzC = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i10, String str) throws zzbp {
        if (i10 == 134) {
            zzt(i10);
            this.zzB.zzb = str;
        } else if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbp.zza("DocType " + str + " not supported", null);
        } else if (i10 == 21358) {
            zzt(i10);
            this.zzB.zza = str;
        } else if (i10 != 2274716) {
        } else {
            zzt(i10);
            zzadf.zzc(this.zzB, str);
        }
    }

    public zzadg(int i10) {
        zzacz zzaczVar = new zzacz();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzaczVar;
        zzaczVar.zza(new zzade(this, null));
        this.zzk = true;
        this.zzi = new zzadi();
        this.zzj = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzzo.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }
}
