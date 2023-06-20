package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbo {
    private static final ArrayList zza = new ArrayList();
    private static final Pattern zzb = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(String str, String str2) {
        char c10;
        zzbn zzc;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC)) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return 9;
            case 1:
                if (str2 == null || (zzc = zzc(str2)) == null) {
                    return 0;
                }
                return zzc.zza();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static int zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzh(str)) {
            return 2;
        }
        if ("text".equals(zzi(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(zzi(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = zza.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = ((zzbm) zza.get(i10)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    static zzbn zzc(String str) {
        Matcher matcher = zzb.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            try {
                return new zzbn(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String zzd(int i10) {
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

    public static String zze(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean zzf(String str, String str2) {
        char c10;
        zzbn zzc;
        int zza2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals(AudioTrackTranscoder.MIMETYPE_AUDIO_AAC)) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (zzc = zzc(str2)) == null || (zza2 = zzc.zza()) == 0 || zza2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzg(String str) {
        return "audio".equals(zzi(str));
    }

    public static boolean zzh(String str) {
        return DownloadResource.TYPE_VIDEO.equals(zzi(str));
    }

    private static String zzi(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
