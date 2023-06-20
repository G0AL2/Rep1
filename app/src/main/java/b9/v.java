package b9;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import b9.v;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.n0;
import j8.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MediaCodecUtil.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a */
    private static final Pattern f5002a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<b, List<n>> f5003b = new HashMap<>();

    /* renamed from: c */
    private static int f5004c = -1;

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final String f5005a;

        /* renamed from: b */
        public final boolean f5006b;

        /* renamed from: c */
        public final boolean f5007c;

        public b(String str, boolean z10, boolean z11) {
            this.f5005a = str;
            this.f5006b = z10;
            this.f5007c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f5005a, bVar.f5005a) && this.f5006b == bVar.f5006b && this.f5007c == bVar.f5007c;
        }

        public int hashCode() {
            return ((((this.f5005a.hashCode() + 31) * 31) + (this.f5006b ? 1231 : 1237)) * 31) + (this.f5007c ? 1231 : 1237);
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class e implements d {
        private e() {
        }

        @Override // b9.v.d
        public MediaCodecInfo a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // b9.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // b9.v.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // b9.v.d
        public int d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // b9.v.d
        public boolean e() {
            return false;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public static final class f implements d {

        /* renamed from: a */
        private final int f5008a;

        /* renamed from: b */
        private MediaCodecInfo[] f5009b;

        public f(boolean z10, boolean z11) {
            this.f5008a = (z10 || z11) ? 1 : 0;
        }

        private void f() {
            if (this.f5009b == null) {
                this.f5009b = new MediaCodecList(this.f5008a).getCodecInfos();
            }
        }

        @Override // b9.v.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.f5009b[i10];
        }

        @Override // b9.v.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // b9.v.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // b9.v.d
        public int d() {
            f();
            return this.f5009b.length;
        }

        @Override // b9.v.d
        public boolean e() {
            return true;
        }
    }

    /* compiled from: MediaCodecUtil.java */
    /* loaded from: classes2.dex */
    public interface g<T> {
        int a(T t10);
    }

    private static boolean A(MediaCodecInfo mediaCodecInfo) {
        return n0.f29709a >= 29 && B(mediaCodecInfo);
    }

    private static boolean B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean C(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = n0.f29709a;
        if (i10 >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                String str3 = n0.f29710b;
                if ("a70".equals(str3) || ("Xiaomi".equals(n0.f29711c) && str3.startsWith("HM"))) {
                    return false;
                }
            }
            if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                String str4 = n0.f29710b;
                if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                    return false;
                }
            }
            if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                String str5 = n0.f29710b;
                if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                    return false;
                }
            }
            if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(n0.f29711c))) {
                String str6 = n0.f29710b;
                if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                    return false;
                }
            }
            if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(n0.f29711c)) {
                String str7 = n0.f29710b;
                if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                    return false;
                }
            }
            if (i10 <= 19 && n0.f29710b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                return false;
            }
            return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
        }
        return false;
    }

    private static boolean D(MediaCodecInfo mediaCodecInfo, String str) {
        if (n0.f29709a >= 29) {
            return E(mediaCodecInfo);
        }
        return !F(mediaCodecInfo, str);
    }

    private static boolean E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean F(MediaCodecInfo mediaCodecInfo, String str) {
        if (n0.f29709a >= 29) {
            return G(mediaCodecInfo);
        }
        if (ea.v.p(str)) {
            return true;
        }
        String e10 = ib.b.e(mediaCodecInfo.getName());
        if (e10.startsWith("arc.")) {
            return false;
        }
        if (e10.startsWith("omx.google.") || e10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e10.startsWith("omx.sec.") && e10.contains(".sw.")) || e10.equals("omx.qcom.video.decoder.hevcswvdec") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) {
            return true;
        }
        return (e10.startsWith("omx.") || e10.startsWith("c2.")) ? false : true;
    }

    private static boolean G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean H(MediaCodecInfo mediaCodecInfo) {
        if (n0.f29709a >= 29) {
            return I(mediaCodecInfo);
        }
        String e10 = ib.b.e(mediaCodecInfo.getName());
        return (e10.startsWith("omx.google.") || e10.startsWith("c2.android.") || e10.startsWith("c2.google.")) ? false : true;
    }

    private static boolean I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int J(n nVar) {
        String str = nVar.f4950a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (n0.f29709a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int K(n nVar) {
        return nVar.f4950a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int L(p1 p1Var, n nVar) {
        try {
            return nVar.m(p1Var) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static /* synthetic */ int M(g gVar, Object obj, Object obj2) {
        return gVar.a(obj2) - gVar.a(obj);
    }

    public static int N() throws c {
        if (f5004c == -1) {
            int i10 = 0;
            n r10 = r("video/avc", false, false);
            if (r10 != null) {
                MediaCodecInfo.CodecProfileLevel[] g10 = r10.g();
                int length = g10.length;
                int i11 = 0;
                while (i10 < length) {
                    i11 = Math.max(h(g10[i10].level), i11);
                    i10++;
                }
                i10 = Math.max(i11, n0.f29709a >= 21 ? 345600 : 172800);
            }
            f5004c = i10;
        }
        return f5004c;
    }

    private static int O(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    private static <T> void P(List<T> list, final g<T> gVar) {
        Collections.sort(list, new Comparator() { // from class: b9.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return v.d(v.g.this, obj, obj2);
            }
        });
    }

    private static int Q(int i10) {
        if (i10 != 10) {
            if (i10 != 11) {
                if (i10 != 20) {
                    if (i10 != 21) {
                        if (i10 != 30) {
                            if (i10 != 31) {
                                if (i10 != 40) {
                                    if (i10 != 41) {
                                        if (i10 != 50) {
                                            if (i10 != 51) {
                                                switch (i10) {
                                                    case 60:
                                                        return 2048;
                                                    case 61:
                                                        return 4096;
                                                    case 62:
                                                        return Constants.BUFFER_SIZE;
                                                    default:
                                                        return -1;
                                                }
                                            }
                                            return AdRequest.MAX_CONTENT_URL_LENGTH;
                                        }
                                        return 256;
                                    }
                                    return 128;
                                }
                                return 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int R(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return i10 != 3 ? -1 : 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int d(g gVar, Object obj, Object obj2) {
        return M(gVar, obj, obj2);
    }

    private static void e(String str, List<n> list) {
        if ("audio/raw".equals(str)) {
            if (n0.f29709a < 26 && n0.f29710b.equals("R9") && list.size() == 1 && list.get(0).f4950a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n.B("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            P(list, new g() { // from class: b9.s
                @Override // b9.v.g
                public final int a(Object obj) {
                    return v.J((n) obj);
                }
            });
        }
        int i10 = n0.f29709a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f4950a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                P(list, new g() { // from class: b9.t
                    @Override // b9.v.g
                    public final int a(Object obj) {
                        return v.K((n) obj);
                    }
                });
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f4950a)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int f(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 10:
                return IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return Constants.BUFFER_SIZE;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return Constants.MIN_PROGRESS_STEP;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int g(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return AdRequest.MAX_CONTENT_URL_LENGTH;
                            case 32:
                                return IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return Constants.BUFFER_SIZE;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return Constants.MIN_PROGRESS_STEP;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int h(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case AdRequest.MAX_CONTENT_URL_LENGTH /* 512 */:
                return 921600;
            case IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES /* 1024 */:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case Constants.BUFFER_SIZE /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case Constants.MIN_PROGRESS_STEP /* 65536 */:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int i(int i10) {
        if (i10 != 66) {
            if (i10 != 77) {
                if (i10 != 88) {
                    if (i10 != 100) {
                        if (i10 != 110) {
                            if (i10 != 122) {
                                return i10 != 244 ? -1 : 64;
                            }
                            return 32;
                        }
                        return 16;
                    }
                    return 8;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static Integer j(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH);
            case '\n':
                return Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static Integer k(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH);
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (AudioTrackTranscoder.MIMETYPE_AUDIO_AAC.equals(ea.v.h(Integer.parseInt(strArr[1], 16))) && (O = O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(valueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    public static String m(p1 p1Var) {
        Pair<Integer, Integer> q10;
        if ("audio/eac3-joc".equals(p1Var.f32709l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(p1Var.f32709l) || (q10 = q(p1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) q10.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    private static Pair<Integer, Integer> n(String str, String[] strArr, fa.b bVar) {
        int i10;
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i11 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AV1 profile: ");
                sb2.append(parseInt);
                ea.r.h("MediaCodecUtil", sb2.toString());
                return null;
            } else if (parseInt3 != 8 && parseInt3 != 10) {
                StringBuilder sb3 = new StringBuilder(34);
                sb3.append("Unknown AV1 bit depth: ");
                sb3.append(parseInt3);
                ea.r.h("MediaCodecUtil", sb3.toString());
                return null;
            } else {
                if (parseInt3 != 8) {
                    i11 = (bVar == null || !(bVar.f30205d != null || (i10 = bVar.f30204c) == 7 || i10 == 6)) ? 2 : 4096;
                }
                int f10 = f(parseInt2);
                if (f10 == -1) {
                    StringBuilder sb4 = new StringBuilder(30);
                    sb4.append("Unknown AV1 level: ");
                    sb4.append(parseInt2);
                    ea.r.h("MediaCodecUtil", sb4.toString());
                    return null;
                }
                return new Pair<>(Integer.valueOf(i11), Integer.valueOf(f10));
            }
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(valueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> o(String str, String[] strArr) {
        int parseInt;
        int i10;
        if (strArr.length < 2) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i10 = parseInt2;
            } else {
                String valueOf2 = String.valueOf(str);
                ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf2) : new String("Ignoring malformed AVC codec string: "));
                return null;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown AVC profile: ");
                sb2.append(i10);
                ea.r.h("MediaCodecUtil", sb2.toString());
                return null;
            }
            int g10 = g(parseInt);
            if (g10 == -1) {
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown AVC level: ");
                sb3.append(parseInt);
                ea.r.h("MediaCodecUtil", sb3.toString());
                return null;
            }
            return new Pair<>(Integer.valueOf(i11), Integer.valueOf(g10));
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(valueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    private static String p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0075, code lost:
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> q(j8.p1 r6) {
        /*
            java.lang.String r0 = r6.f32706i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f32709l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f32706i
            android.util.Pair r6 = w(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = -1
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f32706i
            android.util.Pair r6 = y(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f32706i
            android.util.Pair r6 = l(r6, r0)
            return r6
        L8a:
            java.lang.String r6 = r6.f32706i
            android.util.Pair r6 = x(r6, r0)
            return r6
        L91:
            java.lang.String r6 = r6.f32706i
            android.util.Pair r6 = o(r6, r0)
            return r6
        L98:
            java.lang.String r1 = r6.f32706i
            fa.b r6 = r6.f32721x
            android.util.Pair r6 = n(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.v.q(j8.p1):android.util.Pair");
    }

    public static n r(String str, boolean z10, boolean z11) throws c {
        List<n> s10 = s(str, z10, z11);
        if (s10.isEmpty()) {
            return null;
        }
        return s10.get(0);
    }

    public static synchronized List<n> s(String str, boolean z10, boolean z11) throws c {
        d eVar;
        synchronized (v.class) {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<n>> hashMap = f5003b;
            List<n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = n0.f29709a;
            if (i10 >= 21) {
                eVar = new f(z10, z11);
            } else {
                eVar = new e();
            }
            ArrayList<n> t10 = t(bVar, eVar);
            if (z10 && t10.isEmpty() && 21 <= i10 && i10 <= 23) {
                t10 = t(bVar, new e());
                if (!t10.isEmpty()) {
                    String str2 = t10.get(0).f4950a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    ea.r.h("MediaCodecUtil", sb2.toString());
                }
            }
            e(str, t10);
            jb.s p10 = jb.s.p(t10);
            hashMap.put(bVar, p10);
            return p10;
        }
    }

    private static ArrayList<n> t(b bVar, d dVar) throws c {
        String p10;
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean b10;
        boolean c10;
        boolean z11;
        try {
            ArrayList<n> arrayList = new ArrayList<>();
            String str3 = bVar.f5005a;
            int d10 = dVar.d();
            boolean e10 = dVar.e();
            int i12 = 0;
            while (i12 < d10) {
                MediaCodecInfo a10 = dVar.a(i12);
                if (!A(a10)) {
                    String name = a10.getName();
                    if (C(a10, name, e10, str3) && (p10 = p(a10, name, str3)) != null) {
                        try {
                            capabilitiesForType = a10.getCapabilitiesForType(p10);
                            b10 = dVar.b("tunneled-playback", p10, capabilitiesForType);
                            c10 = dVar.c("tunneled-playback", p10, capabilitiesForType);
                            z11 = bVar.f5007c;
                        } catch (Exception e11) {
                            e = e11;
                            str = p10;
                            str2 = name;
                            i10 = i12;
                            z10 = e10;
                            i11 = d10;
                        }
                        if ((z11 || !c10) && (!z11 || b10)) {
                            boolean b11 = dVar.b("secure-playback", p10, capabilitiesForType);
                            boolean c11 = dVar.c("secure-playback", p10, capabilitiesForType);
                            boolean z12 = bVar.f5006b;
                            if ((z12 || !c11) && (!z12 || b11)) {
                                boolean D = D(a10, str3);
                                boolean F = F(a10, str3);
                                boolean H = H(a10);
                                if (!(e10 && bVar.f5006b == b11) && (e10 || bVar.f5006b)) {
                                    str = p10;
                                    str2 = name;
                                    i10 = i12;
                                    z10 = e10;
                                    i11 = d10;
                                    if (!z10 && b11) {
                                        arrayList.add(n.B(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, D, F, H, false, true));
                                        return arrayList;
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e10 = z10;
                                } else {
                                    str = p10;
                                    str2 = name;
                                    i10 = i12;
                                    z10 = e10;
                                    i11 = d10;
                                    try {
                                        arrayList.add(n.B(name, str3, p10, capabilitiesForType, D, F, H, false, false));
                                    } catch (Exception e12) {
                                        e = e12;
                                        if (n0.f29709a <= 23 && !arrayList.isEmpty()) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb2.append("Skipping codec ");
                                            sb2.append(str2);
                                            sb2.append(" (failed to query capabilities)");
                                            ea.r.c("MediaCodecUtil", sb2.toString());
                                            i12 = i10 + 1;
                                            d10 = i11;
                                            e10 = z10;
                                        } else {
                                            String str4 = str2;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 25 + str.length());
                                            sb3.append("Failed to query codec ");
                                            sb3.append(str4);
                                            sb3.append(" (");
                                            sb3.append(str);
                                            sb3.append(")");
                                            ea.r.c("MediaCodecUtil", sb3.toString());
                                            throw e;
                                        }
                                    }
                                    i12 = i10 + 1;
                                    d10 = i11;
                                    e10 = z10;
                                }
                            }
                        }
                    }
                }
                i10 = i12;
                z10 = e10;
                i11 = d10;
                i12 = i10 + 1;
                d10 = i11;
                e10 = z10;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new c(e13);
        }
    }

    public static List<n> u(List<n> list, final p1 p1Var) {
        ArrayList arrayList = new ArrayList(list);
        P(arrayList, new g() { // from class: b9.r
            @Override // b9.v.g
            public final int a(Object obj) {
                int L;
                L = v.L(p1.this, (n) obj);
                return L;
            }
        });
        return arrayList;
    }

    public static n v() throws c {
        return r("audio/raw", false, false);
    }

    private static Pair<Integer, Integer> w(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f5002a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(valueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String group = matcher.group(1);
        Integer k10 = k(group);
        if (k10 == null) {
            String valueOf3 = String.valueOf(group);
            ea.r.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(valueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer j10 = j(str2);
        if (j10 == null) {
            String valueOf4 = String.valueOf(str2);
            ea.r.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(valueOf4) : new String("Unknown Dolby Vision level string: "));
            return null;
        }
        return new Pair<>(k10, j10);
    }

    private static Pair<Integer, Integer> x(String str, String[] strArr) {
        if (strArr.length < 4) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i10 = 1;
        Matcher matcher = f5002a.matcher(strArr[1]);
        if (!matcher.matches()) {
            String valueOf2 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(valueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                String valueOf3 = String.valueOf(group);
                ea.r.h("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer z10 = z(str2);
        if (z10 == null) {
            String valueOf4 = String.valueOf(str2);
            ea.r.h("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), z10);
    }

    private static Pair<Integer, Integer> y(String str, String[] strArr) {
        if (strArr.length < 3) {
            String valueOf = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int R = R(parseInt);
            if (R == -1) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Unknown VP9 profile: ");
                sb2.append(parseInt);
                ea.r.h("MediaCodecUtil", sb2.toString());
                return null;
            }
            int Q = Q(parseInt2);
            if (Q == -1) {
                StringBuilder sb3 = new StringBuilder(30);
                sb3.append("Unknown VP9 level: ");
                sb3.append(parseInt2);
                ea.r.h("MediaCodecUtil", sb3.toString());
                return null;
            }
            return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(str);
            ea.r.h("MediaCodecUtil", valueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(valueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    private static Integer z(String str) {
        if (str == null) {
            return null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c10 = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c10 = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c10 = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c10 = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c10 = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c10 = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c10 = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c10 = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH);
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case '\b':
                return 64;
            case '\t':
                return 256;
            case '\n':
                return 2048;
            case 11:
                return Integer.valueOf((int) Constants.BUFFER_SIZE);
            case '\f':
                return 32768;
            case '\r':
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return Integer.valueOf((int) Constants.MIN_PROGRESS_STEP);
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }
}
