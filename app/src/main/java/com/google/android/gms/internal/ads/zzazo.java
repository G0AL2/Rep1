package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzazo {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    private static final Pattern zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i10 = 26;
        }
        zza = i10;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i10;
        zzf = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzg = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzh = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float zza(float f10, float f11, float f12) {
        return Math.max(0.1f, Math.min(f10, 8.0f));
    }

    public static int zzb(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static int zzc(long[] jArr, long j10, boolean z10, boolean z11) {
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

    public static int zzd(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int zze(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int zzf(int i10) {
        return i10 != 1 ? 13107200 : 3538944;
    }

    public static int zzg(String str) {
        int length = str.length();
        zzayz.zzc(length <= 4);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 = (i10 << 8) | str.charAt(i11);
        }
        return i10;
    }

    public static int zzh(int i10) {
        if (i10 != 8) {
            if (i10 != 16) {
                return i10 != 24 ? i10 != 32 ? 0 : 1073741824 : RecyclerView.UNDEFINED_DURATION;
            }
            return 2;
        }
        return 3;
    }

    public static int zzi(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 1073741824) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return i11;
                    }
                    throw new IllegalArgumentException();
                }
                return i11 + i11;
            }
            return i11 * 4;
        }
        return i11 * 3;
    }

    public static long zzj(long j10, long j11, long j12) {
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 < 0 || j12 % j11 != 0) {
            return (i10 >= 0 || j11 % j12 != 0) ? (long) (j10 * (j11 / j12)) : j10 * (j11 / j12);
        }
        return j10 / (j12 / j11);
    }

    public static String zzk(Object[] objArr) {
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

    public static ExecutorService zzl(String str) {
        return Executors.newSingleThreadExecutor(new zzazn("Loader:ExtractorMediaPeriod"));
    }

    public static void zzm(zzayj zzayjVar) {
        if (zzayjVar != null) {
            try {
                zzayjVar.zzd();
            } catch (IOException unused) {
            }
        }
    }

    public static void zzn(long[] jArr, long j10, long j11) {
        int i10 = 0;
        int i11 = (j11 > 1000000L ? 1 : (j11 == 1000000L ? 0 : -1));
        if (i11 >= 0 && j11 % 1000000 == 0) {
            long j12 = j11 / 1000000;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
        } else if (i11 >= 0 || 1000000 % j11 != 0) {
            double d10 = 1000000.0d / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
        } else {
            long j13 = 1000000 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j13;
                i10++;
            }
        }
    }

    public static boolean zzo(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] zzp(String str) {
        byte[] bArr = new byte[38];
        for (int i10 = 0; i10 < 38; i10++) {
            int i11 = i10 + i10;
            bArr[i10] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i11), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static byte[] zzq(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}
