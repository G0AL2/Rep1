package ea;

import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeTypes.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f29742a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f29743b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MimeTypes.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29744a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29745b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29746c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MimeTypes.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29747a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29748b;

        public b(int i10, int i11) {
            this.f29747a = i10;
            this.f29748b = i11;
        }

        public int a() {
            int i10 = this.f29748b;
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 29) {
                        if (i10 != 42) {
                            if (i10 != 22) {
                                return i10 != 23 ? 0 : 15;
                            }
                            return 1073741824;
                        }
                        return 16;
                    }
                    return 12;
                }
                return 11;
            }
            return 10;
        }
    }

    public static boolean a(String str, String str2) {
        b i10;
        int a10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (i10 = i(str2)) == null || (a10 = i10.a()) == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : n0.T0(str)) {
            String g10 = g(str2);
            if (g10 != null && p(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] T0 = n0.T0(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : T0) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f29742a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f29742a.get(i10);
            if (str.startsWith(aVar.f29745b)) {
                return aVar.f29744a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC)) {
                    c10 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return i10.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e10 = ib.b.e(str.trim());
        if (e10.startsWith("avc1") || e10.startsWith("avc3")) {
            return "video/avc";
        }
        if (e10.startsWith("hev1") || e10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e10.startsWith("dvav") || e10.startsWith("dva1") || e10.startsWith("dvhe") || e10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e10.startsWith("av01")) {
            return "video/av01";
        }
        if (e10.startsWith("vp9") || e10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e10.startsWith("vp8") || e10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e10.startsWith("mp4a")) {
            return e10.startsWith("mha1") ? "audio/mha1" : e10.startsWith("mhm1") ? "audio/mhm1" : (e10.startsWith("ac-3") || e10.startsWith("dac3")) ? "audio/ac3" : (e10.startsWith("ec-3") || e10.startsWith("dec3")) ? "audio/eac3" : e10.startsWith("ec+3") ? "audio/eac3-joc" : (e10.startsWith("ac-4") || e10.startsWith("dac4")) ? "audio/ac4" : e10.startsWith("dtsc") ? "audio/vnd.dts" : e10.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e10.startsWith("dtsh") || e10.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e10.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e10.startsWith("opus") ? "audio/opus" : e10.startsWith("vorbis") ? "audio/vorbis" : e10.startsWith("flac") ? "audio/flac" : e10.startsWith("stpp") ? "application/ttml+xml" : e10.startsWith("wvtt") ? "text/vtt" : e10.contains("cea708") ? "application/cea-708" : (e10.contains("eia608") || e10.contains("cea608")) ? "application/cea-608" : e(e10);
        }
        if (e10.startsWith("mp4a.") && (i10 = i(e10)) != null) {
            str2 = h(i10.f29747a);
        }
        return str2 == null ? AudioTrackTranscoder.MIMETYPE_AUDIO_AAC : str2;
    }

    public static String h(int i10) {
        if (i10 != 32) {
            if (i10 != 33) {
                if (i10 != 35) {
                    if (i10 != 64) {
                        if (i10 != 163) {
                            if (i10 != 177) {
                                if (i10 != 165) {
                                    if (i10 != 166) {
                                        switch (i10) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i10) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    static b i(String str) {
        Matcher matcher = f29743b.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) ea.a.e(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : n0.T0(str)) {
            String g10 = g(str2);
            if (g10 != null && s(g10)) {
                return g10;
            }
        }
        return null;
    }

    private static String k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (t(str)) {
            return 2;
        }
        if (s(str)) {
            return 3;
        }
        if (q(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    private static int m(String str) {
        int size = f29742a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f29742a.get(i10);
            if (str.equals(aVar.f29744a)) {
                return aVar.f29746c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : n0.T0(str)) {
            String g10 = g(str2);
            if (g10 != null && t(g10)) {
                return g10;
            }
        }
        return null;
    }

    public static boolean p(String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(String str) {
        return "image".equals(k(str));
    }

    public static boolean r(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean s(String str) {
        return "text".equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean t(String str) {
        return DownloadResource.TYPE_VIDEO.equals(k(str));
    }

    public static String u(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c10 = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
