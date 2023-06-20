package ea;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: FileTypes.java */
/* loaded from: classes2.dex */
public final class k {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c10;
        if (str == null) {
            return -1;
        }
        String u10 = v.u(str);
        u10.hashCode();
        switch (u10.hashCode()) {
            case -2123537834:
                if (u10.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                if (u10.equals("video/mp2p")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                if (u10.equals("video/mp2t")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1662095187:
                if (u10.equals("video/webm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (u10.equals("audio/amr-wb")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                if (u10.equals("image/jpeg")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                if (u10.equals("application/mp4")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (u10.equals("text/vtt")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                if (u10.equals("audio/x-matroska")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                if (u10.equals("application/webm")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                if (u10.equals("video/x-flv")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (u10.equals("audio/ac3")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (u10.equals("audio/ac4")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                if (u10.equals("audio/amr")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                if (u10.equals("audio/mp4")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                if (u10.equals("audio/ogg")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                if (u10.equals("audio/wav")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                if (u10.equals("video/mp4")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (u10.equals("audio/3gpp")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (u10.equals("audio/eac3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (u10.equals("audio/flac")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (u10.equals("audio/mpeg")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                if (u10.equals("audio/webm")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                if (u10.equals("video/x-matroska")) {
                    c10 = 23;
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
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\b':
            case '\t':
            case 22:
            case 23:
                return 6;
            case 4:
            case '\r':
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case '\n':
                return 5;
            case '\f':
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }
}
