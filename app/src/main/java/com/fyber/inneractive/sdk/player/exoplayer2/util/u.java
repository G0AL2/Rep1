package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.net.Uri;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final int f19606a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f19607b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f19608c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f19609d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f19610e;

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f19611f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f19612g;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f19613h;

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19614a;

        public a(String str) {
            this.f19614a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f19614a);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        f19606a = i10;
        String str = Build.DEVICE;
        f19607b = str;
        String str2 = Build.MANUFACTURER;
        f19608c = str2;
        String str3 = Build.MODEL;
        f19609d = str3;
        f19610e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f19611f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f19612g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f19613h = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static int a(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                return i10 != 24 ? i10 != 32 ? 0 : 1073741824 : RecyclerView.UNDEFINED_DURATION;
            }
            return 2;
        }
        return 3;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static boolean b(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static ExecutorService c(String str) {
        return Executors.newSingleThreadExecutor(new a(str));
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int a(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int b(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 1073741824) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return i11;
                    }
                    throw new IllegalArgumentException();
                }
                return i11 * 2;
            }
            return i11 * 4;
        }
        return i11 * 3;
    }

    public static int a(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static int b(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".mpd")) {
            return 0;
        }
        if (lowerCase.endsWith(".m3u8")) {
            return 2;
        }
        return (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) ? 1 : 3;
    }

    public static long a(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (i10 >= 0 || j11 % j12 != 0) {
            return (long) (j10 * (j11 / j12));
        }
        return j10 * (j11 / j12);
    }

    public static void a(long[] jArr, long j10, long j11) {
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

    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.j a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar, int i10) {
        if (i10 == 0) {
            return jVar;
        }
        long j10 = jVar.f19466e;
        long j11 = j10 != -1 ? j10 - i10 : -1L;
        Uri uri = jVar.f19462a;
        long j12 = jVar.f19465d + i10;
        return new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri, j12, j12, j11, jVar.f19467f, jVar.f19468g);
    }

    public static int a(String str) {
        int length = str.length();
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(length <= 4);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) | str.charAt(i11);
        }
        return i10;
    }
}
