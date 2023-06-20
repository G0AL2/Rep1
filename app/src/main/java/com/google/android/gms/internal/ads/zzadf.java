package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzadf {
    public byte[] zzM;
    public zzzz zzS;
    public boolean zzT;
    public zzzy zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzzx zzi;
    public byte[] zzj;
    public zzv zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private static Pair zzf(zzdy zzdyVar) throws zzbp {
        try {
            zzdyVar.zzG(16);
            long zzq = zzdyVar.zzq();
            if (zzq == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzq == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzq != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzc = zzdyVar.zzc() + 20;
            byte[] zzH = zzdyVar.zzH();
            while (true) {
                int length = zzH.length;
                if (zzc < length - 4) {
                    if (zzH[zzc] == 0 && zzH[zzc + 1] == 0 && zzH[zzc + 2] == 1 && zzH[zzc + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzH, zzc, length)));
                    }
                    zzc++;
                } else {
                    throw zzbp.zza("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbp {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 1;
                int i13 = 0;
                while (true) {
                    i10 = bArr[i12] & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i13 += 255;
                    i12++;
                }
                int i14 = i12 + 1;
                int i15 = i13 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14] & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + i11;
                if (bArr[i17] == 1) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, i17, bArr2, 0, i15);
                    int i19 = i17 + i15;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzbp.zza("Error parsing vorbis codec private", null);
                    }
                    throw zzbp.zza("Error parsing vorbis codec private", null);
                }
                throw zzbp.zza("Error parsing vorbis codec private", null);
            }
            throw zzbp.zza("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdy zzdyVar) throws zzbp {
        UUID uuid;
        UUID uuid2;
        try {
            int zzi = zzdyVar.zzi();
            if (zzi == 1) {
                return true;
            }
            if (zzi == 65534) {
                zzdyVar.zzF(24);
                long zzr = zzdyVar.zzr();
                uuid = zzadg.zzf;
                if (zzr == uuid.getMostSignificantBits()) {
                    long zzr2 = zzdyVar.zzr();
                    uuid2 = zzadg.zzf;
                    if (zzr2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbp.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzbp {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbp.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zze(zzyu zzyuVar, int i10) throws zzbp {
        char c10;
        List singletonList;
        List list;
        String str;
        int i11;
        String str2;
        byte[] bArr;
        int i12;
        int i13;
        Map map;
        Map map2;
        int i14;
        Map map3;
        zzyo zza;
        String str3 = this.zzb;
        int i15 = 1;
        int i16 = 4;
        int i17 = 0;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c10 = ' ';
                    break;
                }
                c10 = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1045209816:
                if (str3.equals("S_TEXT/WEBVTT")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str4 = "audio/raw";
        zzo zzoVar = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        r12 = null;
        byte[] bArr2 = null;
        switch (c10) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 2:
                str4 = "video/av01";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 3:
                str4 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                singletonList = bArr3 == null ? null : Collections.singletonList(bArr3);
                str4 = "video/mp4v-es";
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 7:
                zzya zza2 = zzya.zza(new zzdy(zzi(str3)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzf;
                str4 = "video/avc";
                i11 = -1;
                i16 = -1;
                List list2 = list;
                str2 = str;
                singletonList = list2;
                break;
            case '\b':
                zzzh zza3 = zzzh.zza(new zzdy(zzi(str3)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzd;
                str4 = "video/hevc";
                i11 = -1;
                i16 = -1;
                List list22 = list;
                str2 = str;
                singletonList = list22;
                break;
            case '\t':
                Pair zzf = zzf(new zzdy(zzi(str3)));
                str4 = (String) zzf.first;
                singletonList = (List) zzf.second;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case '\n':
                str4 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 11:
                singletonList = zzg(zzi(str3));
                str4 = "audio/vorbis";
                str2 = null;
                i11 = Constants.BUFFER_SIZE;
                i16 = -1;
                break;
            case '\f':
                singletonList = new ArrayList(3);
                singletonList.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                singletonList.add(allocate.order(byteOrder).putLong(this.zzQ).array());
                singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str4 = "audio/opus";
                str2 = null;
                i11 = 5760;
                i16 = -1;
                break;
            case '\r':
                singletonList = Collections.singletonList(zzi(str3));
                zzxs zza4 = zzxt.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str2 = zza4.zzc;
                str4 = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                i11 = -1;
                i16 = -1;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i11 = 4096;
                i16 = -1;
                break;
            case 15:
                str4 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i11 = 4096;
                i16 = -1;
                break;
            case 16:
                str4 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 17:
                str4 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 18:
                this.zzS = new zzzz();
                str4 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 21:
                str4 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 22:
                singletonList = Collections.singletonList(zzi(str3));
                str4 = "audio/flac";
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 23:
                if (zzh(new zzdy(zzi(str3)))) {
                    i16 = zzeg.zzn(this.zzO);
                    if (i16 == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    }
                    singletonList = null;
                    str2 = null;
                    i11 = -1;
                    break;
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                singletonList = null;
                str2 = null;
                str4 = "audio/x-unknown";
                i11 = -1;
                i16 = -1;
                break;
            case 24:
                i16 = zzeg.zzn(this.zzO);
                if (i16 == 0) {
                    Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzO + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str4 = "audio/x-unknown";
                    i11 = -1;
                    i16 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i11 = -1;
                break;
            case 25:
                int i18 = this.zzO;
                if (i18 != 8) {
                    if (i18 != 16) {
                        Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i18 + ". Setting mimeType to audio/x-unknown");
                        singletonList = null;
                        str2 = null;
                        str4 = "audio/x-unknown";
                        i11 = -1;
                        i16 = -1;
                        break;
                    } else {
                        i16 = 268435456;
                        singletonList = null;
                        str2 = null;
                        i11 = -1;
                        break;
                    }
                } else {
                    singletonList = null;
                    str2 = null;
                    i11 = -1;
                    i16 = 3;
                    break;
                }
            case 26:
                int i19 = this.zzO;
                if (i19 != 32) {
                    Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i19 + ". Setting mimeType to audio/x-unknown");
                    singletonList = null;
                    str2 = null;
                    str4 = "audio/x-unknown";
                    i11 = -1;
                    i16 = -1;
                    break;
                }
                singletonList = null;
                str2 = null;
                i11 = -1;
                break;
            case 27:
                str4 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 28:
                bArr = zzadg.zzc;
                singletonList = zzfrj.zzq(bArr, zzi(this.zzb));
                str2 = null;
                str4 = "text/x-ssa";
                i11 = -1;
                i16 = -1;
                break;
            case 29:
                singletonList = null;
                str2 = null;
                str4 = "text/vtt";
                i11 = -1;
                i16 = -1;
                break;
            case 30:
                singletonList = zzfrj.zzp(zzi(str3));
                str4 = "application/vobsub";
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case 31:
                str4 = "application/pgs";
                singletonList = null;
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            case ' ':
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                singletonList = zzfrj.zzp(bArr4);
                str4 = "application/dvbsubs";
                str2 = null;
                i11 = -1;
                i16 = -1;
                break;
            default:
                throw zzbp.zza("Unrecognized codec identifier.", null);
        }
        byte[] bArr5 = this.zzM;
        if (bArr5 != null && (zza = zzyo.zza(new zzdy(bArr5))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        int i20 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
        zzab zzabVar = new zzab();
        if (zzbo.zzg(str5)) {
            zzabVar.zzw(this.zzN);
            zzabVar.zzT(this.zzP);
            zzabVar.zzN(i16);
        } else if (zzbo.zzh(str5)) {
            if (this.zzp == 0) {
                int i21 = this.zzn;
                i12 = -1;
                if (i21 == -1) {
                    i21 = this.zzl;
                }
                this.zzn = i21;
                int i22 = this.zzo;
                if (i22 == -1) {
                    i22 = this.zzm;
                }
                this.zzo = i22;
            } else {
                i12 = -1;
            }
            float f10 = (this.zzn == i12 || (i14 = this.zzo) == i12) ? -1.0f : (this.zzm * i13) / (this.zzl * i14);
            if (this.zzw) {
                if (this.zzC != -1.0f && this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f) {
                    bArr2 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                }
                zzoVar = new zzo(this.zzx, this.zzz, this.zzy, bArr2);
            }
            if (this.zza != null) {
                map = zzadg.zzg;
                if (map.containsKey(this.zza)) {
                    map2 = zzadg.zzg;
                    i12 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) != 0) {
                    if (Float.compare(this.zzs, 90.0f) == 0) {
                        i17 = 90;
                    } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                        i17 = 180;
                    } else if (Float.compare(this.zzs, -90.0f) == 0) {
                        i17 = 270;
                    }
                }
                zzabVar.zzX(this.zzl);
                zzabVar.zzF(this.zzm);
                zzabVar.zzP(f10);
                zzabVar.zzR(i17);
                zzabVar.zzQ(this.zzu);
                zzabVar.zzV(this.zzv);
                zzabVar.zzy(zzoVar);
                i15 = 2;
            }
            i17 = i12;
            zzabVar.zzX(this.zzl);
            zzabVar.zzF(this.zzm);
            zzabVar.zzP(f10);
            zzabVar.zzR(i17);
            zzabVar.zzQ(this.zzu);
            zzabVar.zzV(this.zzv);
            zzabVar.zzy(zzoVar);
            i15 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzbp.zza("Unexpected MIME type.", null);
        } else {
            i15 = 3;
        }
        if (this.zza != null) {
            map3 = zzadg.zzg;
            if (!map3.containsKey(this.zza)) {
                zzabVar.zzJ(this.zza);
            }
        }
        zzabVar.zzG(i10);
        zzabVar.zzS(str5);
        zzabVar.zzL(i11);
        zzabVar.zzK(this.zzY);
        zzabVar.zzU(i20);
        zzabVar.zzI(singletonList);
        zzabVar.zzx(str2);
        zzabVar.zzB(this.zzk);
        zzad zzY = zzabVar.zzY();
        zzzy zzv = zzyuVar.zzv(this.zzc, i15);
        this.zzV = zzv;
        zzv.zzk(zzY);
    }
}
