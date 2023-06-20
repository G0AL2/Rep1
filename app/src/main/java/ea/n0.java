package ea;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
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
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import j8.j2;
import j8.p1;
import j8.p2;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class n0 {

    /* renamed from: a */
    public static final int f29709a;

    /* renamed from: b */
    public static final String f29710b;

    /* renamed from: c */
    public static final String f29711c;

    /* renamed from: d */
    public static final String f29712d;

    /* renamed from: e */
    public static final String f29713e;

    /* renamed from: f */
    public static final byte[] f29714f;

    /* renamed from: g */
    private static final Pattern f29715g;

    /* renamed from: h */
    private static final Pattern f29716h;

    /* renamed from: i */
    private static final Pattern f29717i;

    /* renamed from: j */
    private static HashMap<String, String> f29718j;

    /* renamed from: k */
    private static final String[] f29719k;

    /* renamed from: l */
    private static final String[] f29720l;

    /* renamed from: m */
    private static final int[] f29721m;

    /* renamed from: n */
    private static final int[] f29722n;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f29709a = i10;
        String str = Build.DEVICE;
        f29710b = str;
        String str2 = Build.MANUFACTURER;
        f29711c = str2;
        String str3 = Build.MODEL;
        f29712d = str3;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(i10);
        f29713e = sb2.toString();
        f29714f = new byte[0];
        f29715g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f29716h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f29717i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f29719k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f29720l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f29721m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f29722n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, DownloadResource.STATUS_QUEUED_FOR_WIFI, DownloadResource.STATUS_WAITING_FOR_NETWORK, 202, 205, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, DownloadResource.STATUS_DEVICE_NOT_FOUND_ERROR, DownloadResource.STATUS_RUNNING, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, DownloadResource.STATUS_PENDING, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, DownloadResource.STATUS_PAUSED_BY_APP, DownloadResource.STATUS_INSUFFICIENT_SPACE_ERROR, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, DownloadResource.STATUS_WAITING_TO_RETRY, 197, 204, 203, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};
    }

    private static HashMap<String, String> A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f29719k.length);
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
            String[] strArr = f29719k;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    private static String A0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f29720l;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                String valueOf = String.valueOf(strArr[i10 + 1]);
                String valueOf2 = String.valueOf(str.substring(strArr[i10].length()));
                return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }
            i10 += 2;
        }
    }

    public static Uri B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f29717i.matcher(ib.b.e(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static <T> void B0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static String C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long C0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static String D(byte[] bArr) {
        return new String(bArr, ib.d.f31905c);
    }

    public static ExecutorService D0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: ea.m0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return n0.a(str, runnable);
            }
        });
    }

    public static String E(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, ib.d.f31905c);
    }

    public static String E0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = ib.b.e(str);
        String str2 = S0(e10, Constants.FILENAME_SEQUENCE_SEPARATOR)[0];
        if (f29718j == null) {
            f29718j = A();
        }
        String str3 = f29718j.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(e10.substring(str2.length()));
            e10 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? A0(e10) : e10;
    }

    public static int F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static <T> T[] F0(T[] tArr, T t10) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t10;
        return (T[]) k(copyOf);
    }

    public static int G(int i10) {
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
                int i11 = f29709a;
                return (i11 < 23 && i11 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static <T> T[] G0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static p2.b H(p2 p2Var, p2.b bVar) {
        boolean d10 = p2Var.d();
        boolean R = p2Var.R();
        boolean L = p2Var.L();
        boolean o10 = p2Var.o();
        boolean e02 = p2Var.e0();
        boolean t10 = p2Var.t();
        boolean q10 = p2Var.w().q();
        boolean z10 = false;
        p2.b.a d11 = new p2.b.a().b(bVar).d(4, !d10).d(5, R && !d10).d(6, L && !d10).d(7, !q10 && (L || !e02 || R) && !d10).d(8, o10 && !d10).d(9, !q10 && (o10 || (e02 && t10)) && !d10).d(10, !d10).d(11, R && !d10);
        if (R && !d10) {
            z10 = true;
        }
        return d11.d(12, z10).e();
    }

    public static <T> T[] H0(T[] tArr, int i10) {
        a.a(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static int I(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static <T> T[] I0(T[] tArr, int i10, int i11) {
        a.a(i10 >= 0);
        a.a(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static byte[] J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static long J0(String str) throws j2 {
        Matcher matcher = f29715g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw j2.a(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "), null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (Constants.FILENAME_SEQUENCE_SEPARATOR.equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
    }

    public static int K(String str, int i10) {
        int i11 = 0;
        for (String str2 : T0(str)) {
            if (i10 == v.n(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static long K0(String str) {
        Matcher matcher = f29716h.matcher(str);
        if (matcher.matches()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
            String group2 = matcher.group(5);
            double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
            String group3 = matcher.group(7);
            double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
            String group4 = matcher.group(10);
            double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
            String group5 = matcher.group(12);
            double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
            String group6 = matcher.group(14);
            long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
            return isEmpty ? -parseDouble6 : parseDouble6;
        }
        return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
    }

    public static String L(String str, int i10) {
        String[] T0 = T0(str);
        if (T0.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T0) {
            if (i10 == v.n(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static boolean L0(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static String M(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static boolean M0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static String N(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return ib.b.f(networkCountryIso);
            }
        }
        return ib.b.f(Locale.getDefault().getCountry());
    }

    public static <T> void N0(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static Point O(Context context) {
        DisplayManager displayManager;
        Display display = (f29709a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return P(context, display);
    }

    public static long O0(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 >= 0 || j11 % j12 != 0) {
            return (long) (j10 * (j11 / j12));
        }
        return j10 * (j11 / j12);
    }

    public static Point P(Context context, Display display) {
        String m02;
        if (display.getDisplayId() == 0 && x0(context)) {
            if (f29709a < 28) {
                m02 = m0("sys.display-size");
            } else {
                m02 = m0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(m02)) {
                try {
                    String[] R0 = R0(m02.trim(), "x");
                    if (R0.length == 2) {
                        int parseInt = Integer.parseInt(R0[0]);
                        int parseInt2 = Integer.parseInt(R0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(m02);
                r.c("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(f29711c) && f29712d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i10 = f29709a;
        if (i10 >= 23) {
            U(display, point);
        } else if (i10 >= 17) {
            T(display, point);
        } else {
            S(display, point);
        }
        return point;
    }

    public static long[] P0(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (i11 >= 0 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    public static Looper Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void Q0(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i11 >= 0 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 < 0 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        } else {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
        }
    }

    public static Locale R() {
        return f29709a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static String[] R0(String str, String str2) {
        return str.split(str2, -1);
    }

    private static void S(Display display, Point point) {
        display.getSize(point);
    }

    public static String[] S0(String str, String str2) {
        return str.split(str2, 2);
    }

    private static void T(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] T0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : R0(str.trim(), "(\\s*,\\s*)");
    }

    private static void U(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static long U0(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static UUID V(String str) {
        String e10 = ib.b.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1860423953:
                if (e10.equals("playready")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1400551171:
                if (e10.equals("widevine")) {
                    c10 = 1;
                    break;
                }
                break;
            case 790309106:
                if (e10.equals("clearkey")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return j8.h.f32429e;
            case 1:
                return j8.h.f32428d;
            case 2:
                return j8.h.f32427c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static byte[] V0(InputStream inputStream) throws IOException {
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

    public static int W(int i10) {
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

    public static long W0(int i10, int i11) {
        return X0(i11) | (X0(i10) << 32);
    }

    public static int X(String str) {
        String[] R0;
        int length;
        if (str != null && (length = (R0 = R0(str, "_")).length) >= 2) {
            String str2 = R0[length - 1];
            boolean z10 = length >= 3 && "neg".equals(R0[length - 2]);
            try {
                int parseInt = Integer.parseInt((String) a.e(str2));
                return z10 ? -parseInt : parseInt;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return 0;
    }

    public static long X0(int i10) {
        return i10 & 4294967295L;
    }

    public static String Y(int i10) {
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

    public static CharSequence Y0(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    public static String Z(Locale locale) {
        return f29709a >= 21 ? a0(locale) : locale.toString();
    }

    public static long Z0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return y0(str, runnable);
    }

    private static String a0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void a1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static long b(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static long b0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static long c0(long j10) {
        if (j10 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j10 + SystemClock.elapsedRealtime();
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(list.size() - 1, i10) : i10;
    }

    public static int d0(int i10) {
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

    public static int e(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j10);
            i10 = z10 ? binarySearch - 1 : binarySearch;
        }
        return z11 ? Math.min(jArr.length - 1, i10) : i10;
    }

    public static p1 e0(int i10, int i11, int i12) {
        return new p1.b().e0("audio/raw").H(i11).f0(i12).Y(i10).E();
    }

    public static int f(s sVar, long j10, boolean z10, boolean z11) {
        int i10;
        int c10 = sVar.c() - 1;
        int i11 = 0;
        while (i11 <= c10) {
            int i12 = (i11 + c10) >>> 1;
            if (sVar.b(i12) < j10) {
                i11 = i12 + 1;
            } else {
                c10 = i12 - 1;
            }
        }
        if (z10 && (i10 = c10 + 1) < sVar.c() && sVar.b(i10) == j10) {
            return i10;
        }
        if (z11 && c10 == -1) {
            return 0;
        }
        return c10;
    }

    public static int f0(int i10, int i11) {
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
        return i11 * 2;
    }

    public static <T extends Comparable<? super T>> int g(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int binarySearch = Collections.binarySearch(list, t10);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(t10) == 0);
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static long g0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static int h(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i10);
            i11 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int h0(int i10) {
        if (i10 != 13) {
            switch (i10) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static int i(long[] jArr, long j10, boolean z10, boolean z11) {
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
            i10 = z10 ? binarySearch + 1 : binarySearch;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static String i0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? Constants.FILENAME_SEQUENCE_SEPARATOR : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static <T> T j(T t10) {
        return t10;
    }

    public static String[] j0() {
        String[] k02 = k0();
        for (int i10 = 0; i10 < k02.length; i10++) {
            k02[i10] = E0(k02[i10]);
        }
        return k02;
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    private static String[] k0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f29709a >= 24 ? l0(configuration) : new String[]{Z(configuration.locale)};
    }

    public static int l(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    private static String[] l0(Configuration configuration) {
        return R0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static long m(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    private static String m0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            String valueOf = String.valueOf(str);
            r.d("Util", valueOf.length() != 0 ? "Failed to read system property ".concat(valueOf) : new String("Failed to read system property "), e10);
            return null;
        }
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String n0(int i10) {
        switch (i10) {
            case -2:
                return "none";
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
            case 6:
                return "camera motion";
            default:
                if (i10 >= 10000) {
                    StringBuilder sb2 = new StringBuilder(20);
                    sb2.append("custom (");
                    sb2.append(i10);
                    sb2.append(")");
                    return sb2.toString();
                }
                return "?";
        }
    }

    public static int o(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static String o0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        sb2.append(str3);
        sb2.append(") ");
        sb2.append("ExoPlayerLib/2.17.1");
        return sb2.toString();
    }

    public static float p(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static byte[] p0(String str) {
        return str.getBytes(ib.d.f31905c);
    }

    public static int q(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int q0(String str) {
        String e10 = ib.b.e(str);
        if (e10.endsWith(".mpd")) {
            return 0;
        }
        if (e10.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = f29717i.matcher(e10);
        if (matcher.matches()) {
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                return group.contains("format=m3u8-aapl") ? 2 : 1;
            }
            return 1;
        }
        return 4;
    }

    public static long r(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static boolean r0(a0 a0Var, a0 a0Var2, Inflater inflater) {
        if (a0Var.a() <= 0) {
            return false;
        }
        if (a0Var2.b() < a0Var.a()) {
            a0Var2.c(a0Var.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.d(), a0Var.e(), a0Var.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(a0Var2.d(), i10, a0Var2.b() - i10);
                if (inflater.finished()) {
                    a0Var2.O(i10);
                    return true;
                } else if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                } else if (i10 == a0Var2.b()) {
                    a0Var2.c(a0Var2.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s0(Context context) {
        return f29709a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static int t(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29721m[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static boolean t0(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29722n[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static boolean u0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static Handler v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean v0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static Handler w() {
        return x(null);
    }

    public static boolean w0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static Handler x(Handler.Callback callback) {
        return v((Looper) a.h(Looper.myLooper()), callback);
    }

    public static boolean x0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Handler y() {
        return z(null);
    }

    public static /* synthetic */ Thread y0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Handler z(Handler.Callback callback) {
        return v(Q(), callback);
    }

    public static int z0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
