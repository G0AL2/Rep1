package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.ads.AdError;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.media.DashParser;
import com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeg {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;

    static {
        int i10 = Build.VERSION.SDK_INT;
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, DownloadResource.STATUS_QUEUED_FOR_WIFI, DownloadResource.STATUS_WAITING_FOR_NETWORK, 202, 205, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, DownloadResource.STATUS_RUNNING, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, DownloadResource.STATUS_PENDING, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, DownloadResource.STATUS_PAUSED_BY_APP, DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, DownloadResource.STATUS_WAITING_TO_RETRY, 197, 204, 203, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    public static Point zzA(Context context) {
        String zzah;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzW(context)) {
            if (zza < 28) {
                zzah = zzah("sys.display-size");
            } else {
                zzah = zzah("vendor.display-size");
            }
            if (!TextUtils.isEmpty(zzah)) {
                try {
                    String[] split = zzah.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e("Util", "Invalid display size: ".concat(String.valueOf(zzah)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static Handler zzB(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler zzC(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzD() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static zzad zzE(int i10, int i11, int i12) {
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/raw");
        zzabVar.zzw(i11);
        zzabVar.zzT(i12);
        zzabVar.zzN(i10);
        return zzabVar.zzY();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbx zzF(com.google.android.gms.internal.ads.zzcb r11, com.google.android.gms.internal.ads.zzbx r12) {
        /*
            boolean r0 = r11.zzs()
            boolean r1 = r11.zzc()
            r2 = r11
            com.google.android.gms.internal.ads.zzk r2 = (com.google.android.gms.internal.ads.zzk) r2
            com.google.android.gms.internal.ads.zzci r3 = r2.zzn()
            boolean r4 = r3.zzo()
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1a
        L18:
            r3 = 0
            goto L2b
        L1a:
            int r4 = r2.zzf()
            r2.zzj()
            r2.zzr()
            int r3 = r3.zzk(r4, r7, r7)
            if (r3 == r5) goto L18
            r3 = 1
        L2b:
            com.google.android.gms.internal.ads.zzci r4 = r2.zzn()
            boolean r8 = r4.zzo()
            if (r8 == 0) goto L37
        L35:
            r2 = 0
            goto L48
        L37:
            int r8 = r2.zzf()
            r2.zzj()
            r2.zzr()
            int r2 = r4.zzj(r8, r7, r7)
            if (r2 == r5) goto L35
            r2 = 1
        L48:
            boolean r4 = r11.zzb()
            boolean r5 = r11.zza()
            com.google.android.gms.internal.ads.zzci r11 = r11.zzn()
            boolean r11 = r11.zzo()
            com.google.android.gms.internal.ads.zzbv r8 = new com.google.android.gms.internal.ads.zzbv
            r8.<init>()
            r8.zzb(r12)
            r12 = 4
            r9 = r0 ^ 1
            r8.zzd(r12, r9)
            if (r1 == 0) goto L6c
            if (r0 != 0) goto L6c
            r12 = 1
            goto L6d
        L6c:
            r12 = 0
        L6d:
            r10 = 5
            r8.zzd(r10, r12)
            if (r3 == 0) goto L77
            if (r0 != 0) goto L77
            r12 = 1
            goto L78
        L77:
            r12 = 0
        L78:
            r10 = 6
            r8.zzd(r10, r12)
            if (r11 != 0) goto L88
            if (r3 != 0) goto L84
            if (r4 == 0) goto L84
            if (r1 == 0) goto L88
        L84:
            if (r0 != 0) goto L88
            r12 = 1
            goto L89
        L88:
            r12 = 0
        L89:
            r3 = 7
            r8.zzd(r3, r12)
            if (r2 == 0) goto L93
            if (r0 != 0) goto L93
            r12 = 1
            goto L94
        L93:
            r12 = 0
        L94:
            r3 = 8
            r8.zzd(r3, r12)
            if (r11 != 0) goto La5
            if (r2 != 0) goto La1
            if (r4 == 0) goto La5
            if (r5 == 0) goto La5
        La1:
            if (r0 != 0) goto La5
            r11 = 1
            goto La6
        La5:
            r11 = 0
        La6:
            r12 = 9
            r8.zzd(r12, r11)
            r11 = 10
            r8.zzd(r11, r9)
            if (r1 == 0) goto Lb6
            if (r0 != 0) goto Lb6
            r11 = 1
            goto Lb7
        Lb6:
            r11 = 0
        Lb7:
            r12 = 11
            r8.zzd(r12, r11)
            if (r1 == 0) goto Lc1
            if (r0 != 0) goto Lc1
            goto Lc2
        Lc1:
            r6 = 0
        Lc2:
            r11 = 12
            r8.zzd(r11, r6)
            com.google.android.gms.internal.ads.zzbx r11 = r8.zze()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeg.zzF(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzbx):com.google.android.gms.internal.ads.zzbx");
    }

    public static Object zzG(Object obj) {
        return obj;
    }

    public static String zzH(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String zzI(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, zzfoi.zzc);
    }

    public static String zzJ(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            int length = objArr.length;
            if (i10 >= length) {
                return sb2.toString();
            }
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }

    public static String zzK(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return zzfoc.zzb(networkCountryIso);
            }
        }
        return zzfoc.zzb(Locale.getDefault().getCountry());
    }

    public static String zzL(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static String zzM(Locale locale) {
        return zza >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String zzN(int i10) {
        switch (i10) {
            case -1:
                return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return DownloadResource.TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzO(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfoc.zza(str);
        int i10 = 0;
        String str2 = zza2.split(Constants.FILENAME_SEQUENCE_SEPARATOR, 2)[0];
        if (zzk == null) {
            zzk = zzai();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i10 >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i10])) {
                return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(zza2.substring(strArr[i10].length())));
            }
            i10 += 2;
        }
    }

    public static ExecutorService zzP(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory("ExoPlayer:Loader:ProgressiveMediaPeriod") { // from class: com.google.android.gms.internal.ads.zzef
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        });
    }

    public static void zzQ(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        if (i11 >= 0 && j11 % 1000000 == 0) {
            long j12 = j11 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 < 0 && 1000000 % j11 == 0) {
            long j13 = 1000000 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        } else {
            double d10 = 1000000.0d / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
        }
    }

    public static void zzR(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean zzS(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean zzT(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean zzU(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean zzV(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean zzW(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzX(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static boolean zzY(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] zzZ(String str) {
        return str.getBytes(zzfoi.zzc);
    }

    public static float zza(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static byte[] zzaa(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Object[] zzab(Object[] objArr) {
        return objArr;
    }

    public static Object[] zzac(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] zzad(Object[] objArr, int i10) {
        zzcw.zzd(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static String[] zzae() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzM(configuration.locale)};
        for (int i10 = 0; i10 < split.length; i10++) {
            split[i10] = zzO(split[i10]);
        }
        return split;
    }

    public static String[] zzaf(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] zzag(String str, String str2) {
        return str.split(str2, 2);
    }

    private static String zzah(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zzdn.zza("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    private static HashMap zzai() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 86);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i10 >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static int zzb(long[] jArr, long j10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j10);
        return !z10 ? binarySearch : binarySearch - 1;
    }

    public static int zzc(int[] iArr, int i10, boolean z10, boolean z11) {
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i10);
        return binarySearch;
    }

    public static int zzd(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = binarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int zze(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int zzf(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int zzg(byte[] bArr, int i10, int i11, int i12) {
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = zzn[(i13 >>> 24) ^ (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)] ^ (i13 << 8);
        }
        return i13;
    }

    public static int zzh(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzo[i13 ^ (bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)];
            i10++;
        }
        return i13;
    }

    public static int zzi(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int zzj(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i11 = zza;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int zzk(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int zzl(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 != 10) {
            if (i10 != 7) {
                if (i10 != 8) {
                    switch (i10) {
                        case 15:
                            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i10) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return AdError.ICONVIEW_MISSING_ERROR_CODE;
                                default:
                                    return 6006;
                            }
                    }
                }
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            }
            return 6005;
        }
        return 6004;
    }

    public static int zzm(String str) {
        String[] split;
        int length;
        int i10 = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z10 = length >= 3 && "neg".equals(split[length + (-2)]);
            Objects.requireNonNull(str2);
            try {
                i10 = Integer.parseInt(str2);
                if (z10) {
                    return -i10;
                }
            } catch (NumberFormatException unused) {
            }
            return i10;
        }
        return 0;
    }

    public static int zzn(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                if (i10 != 24) {
                    return i10 != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int zzo(int i10, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11;
        }
        return i11 + i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzp(Uri uri) {
        char c10;
        String scheme = uri.getScheme();
        if (scheme == null || !zzfoc.zzc("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String zza2 = zzfoc.zza(lastPathSegment.substring(lastIndexOf + 1));
                switch (zza2.hashCode()) {
                    case 104579:
                        if (zza2.equals("ism")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 108321:
                        if (zza2.equals(DashParser.EXTENSION)) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3242057:
                        if (zza2.equals("isml")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3299913:
                        if (zza2.equals(HlsParser.EXTENSION)) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                int i10 = c10 != 0 ? c10 != 1 ? (c10 == 2 || c10 == 3) ? 1 : 4 : 2 : 0;
                if (i10 != 4) {
                    return i10;
                }
            }
            Pattern pattern = zzj;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group != null) {
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
            return 4;
        }
        return 3;
    }

    public static long zzq(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static long zzr(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static long zzs(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long zzt(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static long zzu(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static long zzv(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long zzw(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            return (i10 >= 0 || j11 % j12 != 0) ? (long) (j10 * (j11 / j12)) : j10 * (j11 / j12);
        }
        return j10 / (j12 / j11);
    }

    public static long zzx(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j13) & (j11 ^ j10)) < 0) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    public static long zzy(int i10, int i11) {
        return (i11 & 4294967295L) | ((i10 & 4294967295L) << 32);
    }

    public static long zzz(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
