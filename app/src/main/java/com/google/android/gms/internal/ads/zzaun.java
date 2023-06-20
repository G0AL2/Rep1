package com.google.android.gms.internal.ads;

import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaun {
    public boolean zzL;
    public zzauf zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzaue zzg;
    public byte[] zzh;
    public zzats zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaun() {
    }

    public /* synthetic */ zzaun(zzaum zzaumVar) {
    }

    private static List zzc(zzazh zzazhVar) throws zzarw {
        try {
            zzazhVar.zzw(16);
            if (zzazhVar.zzk() != 826496599) {
                return null;
            }
            int zzc = zzazhVar.zzc() + 20;
            byte[] bArr = zzazhVar.zza;
            while (true) {
                int length = bArr.length;
                if (zzc < length - 4) {
                    if (bArr[zzc] == 0 && bArr[zzc + 1] == 0 && bArr[zzc + 2] == 1 && bArr[zzc + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, zzc, length));
                    }
                    zzc++;
                } else {
                    throw new zzarw("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing FourCC VC1 codec private");
        }
    }

    private static List zzd(byte[] bArr) throws zzarw {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 1;
                int i13 = 0;
                while (true) {
                    i10 = bArr[i12];
                    if (i10 != -1) {
                        break;
                    }
                    i13 += 255;
                    i12++;
                }
                int i14 = i12 + 1;
                int i15 = i13 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if (i11 != -1) {
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
                        throw new zzarw("Error parsing vorbis codec private");
                    }
                    throw new zzarw("Error parsing vorbis codec private");
                }
                throw new zzarw("Error parsing vorbis codec private");
            }
            throw new zzarw("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzazh zzazhVar) throws zzarw {
        UUID uuid;
        UUID uuid2;
        try {
            int zzf = zzazhVar.zzf();
            if (zzf == 1) {
                return true;
            }
            if (zzf == 65534) {
                zzazhVar.zzv(24);
                long zzl = zzazhVar.zzl();
                uuid = zzauo.zzd;
                if (zzl == uuid.getMostSignificantBits()) {
                    long zzl2 = zzazhVar.zzl();
                    uuid2 = zzauo.zzd;
                    if (zzl2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarw("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zzb(zzatx zzatxVar, int i10) throws zzarw {
        char c10;
        List singletonList;
        List list;
        int i11;
        int i12;
        int zzh;
        zzart zzi;
        int i13;
        int i14;
        zzazr zzazrVar;
        byte[] bArr;
        int i15;
        String str = this.zza;
        int i16 = 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        String str2 = "audio/raw";
        switch (c10) {
            case 0:
                str2 = "video/x-vnd.on2.vp8";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 1:
                str2 = "video/x-vnd.on2.vp9";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 2:
                str2 = "video/mpeg2";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str2 = "video/mp4v-es";
                i11 = -1;
                i12 = -1;
                break;
            case 6:
                zzazp zza = zzazp.zza(new zzazh(this.zzh));
                list = zza.zza;
                this.zzO = zza.zzb;
                str2 = "video/avc";
                singletonList = list;
                i11 = -1;
                i12 = -1;
                break;
            case 7:
                zzazv zza2 = zzazv.zza(new zzazh(this.zzh));
                list = zza2.zza;
                this.zzO = zza2.zzb;
                str2 = "video/hevc";
                singletonList = list;
                i11 = -1;
                i12 = -1;
                break;
            case '\b':
                singletonList = zzc(new zzazh(this.zzh));
                if (singletonList != null) {
                    str2 = "video/wvc1";
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str2 = "video/x-unknown";
                }
                i11 = -1;
                i12 = -1;
                break;
            case '\t':
                str2 = "video/x-unknown";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case '\n':
                singletonList = zzd(this.zzh);
                str2 = "audio/vorbis";
                i11 = -1;
                i12 = Constants.BUFFER_SIZE;
                break;
            case 11:
                singletonList = new ArrayList(3);
                singletonList.add(this.zzh);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str2 = "audio/opus";
                i11 = -1;
                i12 = 5760;
                break;
            case '\f':
                singletonList = Collections.singletonList(this.zzh);
                str2 = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                i11 = -1;
                i12 = -1;
                break;
            case '\r':
                str2 = "audio/mpeg-L2";
                singletonList = null;
                i11 = -1;
                i12 = 4096;
                break;
            case 14:
                str2 = "audio/mpeg";
                singletonList = null;
                i11 = -1;
                i12 = 4096;
                break;
            case 15:
                str2 = "audio/ac3";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 16:
                str2 = "audio/eac3";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 17:
                str2 = "audio/true-hd";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 18:
            case 19:
                str2 = "audio/vnd.dts";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 20:
                str2 = "audio/vnd.dts.hd";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 21:
                singletonList = Collections.singletonList(this.zzh);
                str2 = "audio/x-flac";
                i11 = -1;
                i12 = -1;
                break;
            case 22:
                if (zze(new zzazh(this.zzh))) {
                    zzh = zzazo.zzh(this.zzH);
                    if (zzh == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    }
                    i11 = zzh;
                    singletonList = null;
                    i12 = -1;
                    break;
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                str2 = "audio/x-unknown";
                singletonList = null;
                i11 = -1;
                i12 = -1;
            case 23:
                zzh = zzazo.zzh(this.zzH);
                if (zzh == 0) {
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    str2 = "audio/x-unknown";
                    singletonList = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                }
                i11 = zzh;
                singletonList = null;
                i12 = -1;
            case 24:
                str2 = "application/x-subrip";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 25:
                singletonList = Collections.singletonList(this.zzh);
                str2 = "application/vobsub";
                i11 = -1;
                i12 = -1;
                break;
            case 26:
                str2 = "application/pgs";
                singletonList = null;
                i11 = -1;
                i12 = -1;
                break;
            case 27:
                byte[] bArr3 = this.zzh;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str2 = "application/dvbsubs";
                i11 = -1;
                i12 = -1;
                break;
            default:
                throw new zzarw("Unrecognized codec identifier.");
        }
        int i17 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
        if (zzaze.zza(str2)) {
            zzi = zzart.zzh(Integer.toString(i10), str2, null, -1, i12, this.zzG, this.zzI, i11, -1, -1, singletonList, this.zzi, i17, this.zzP, null);
            i16 = 1;
        } else if (zzaze.zzb(str2)) {
            if (this.zzn == 0) {
                int i18 = this.zzl;
                i13 = -1;
                if (i18 == -1) {
                    i18 = this.zzj;
                }
                this.zzl = i18;
                int i19 = this.zzm;
                if (i19 == -1) {
                    i19 = this.zzk;
                }
                this.zzm = i19;
            } else {
                i13 = -1;
            }
            float f10 = (this.zzl == i13 || (i15 = this.zzm) == i13) ? -1.0f : (this.zzk * i14) / (this.zzj * i15);
            if (this.zzq) {
                if (this.zzw == -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.zzE + 0.5f));
                    wrap.putShort((short) (this.zzF + 0.5f));
                    wrap.putShort((short) this.zzu);
                    wrap.putShort((short) this.zzv);
                }
                zzazrVar = new zzazr(this.zzr, this.zzt, this.zzs, bArr);
            } else {
                zzazrVar = null;
            }
            zzi = zzart.zzl(Integer.toString(i10), str2, null, -1, i12, this.zzj, this.zzk, -1.0f, singletonList, -1, f10, this.zzo, this.zzp, zzazrVar, this.zzi);
        } else {
            if ("application/x-subrip".equals(str2)) {
                zzi = zzart.zzk(Integer.toString(i10), str2, null, -1, i17, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                throw new zzarw("Unexpected MIME type.");
            } else {
                zzi = zzart.zzi(Integer.toString(i10), str2, null, -1, singletonList, this.zzP, this.zzi);
            }
            i16 = 3;
        }
        zzauf zzbi = zzatxVar.zzbi(this.zzb, i16);
        this.zzN = zzbi;
        zzbi.zza(zzi);
    }
}
