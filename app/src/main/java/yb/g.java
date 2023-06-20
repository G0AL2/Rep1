package yb;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* compiled from: CommonUtils.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f39386a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    private static long f39387b = -1;

    /* compiled from: CommonUtils.java */
    /* loaded from: classes3.dex */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: k  reason: collision with root package name */
        private static final Map<String, a> f39398k;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f39398k = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        static a f() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                vb.f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = f39398k.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static String A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(String str) {
        StatFs statFs;
        long blockSize = new StatFs(str).getBlockSize();
        return (statFs.getBlockCount() * blockSize) - (blockSize * statFs.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean d(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                vb.f.f().e(str, e10);
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    static long g(String str, String str2, int i10) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(Constants.FILENAME_SEQUENCE_SEPARATOR, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : arrayList) {
            sb2.append(str2);
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            return z(sb3);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L5f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r3 == 0) goto L36
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L59
            r2 = r6
        L36:
            e(r1, r0)
            goto L5f
        L3a:
            r7 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5b
        L3e:
            r7 = move-exception
            r1 = r2
        L40:
            vb.f r3 = vb.f.f()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L59
            r4.append(r6)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L59
            r3.e(r6, r7)     // Catch: java.lang.Throwable -> L59
            goto L36
        L59:
            r6 = move-exception
            r2 = r1
        L5b:
            e(r2, r0)
            throw r6
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.g.i(java.io.File, java.lang.String):java.lang.String");
    }

    public static ActivityManager.RunningAppProcessInfo j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean k(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int q10 = q(context, str, "bool");
            if (q10 > 0) {
                return resources.getBoolean(q10);
            }
            int q11 = q(context, str, "string");
            if (q11 > 0) {
                return Boolean.parseBoolean(context.getString(q11));
            }
        }
        return z10;
    }

    public static int l() {
        return a.f().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int m(Context context) {
        boolean x10 = x(context);
        ?? r02 = x10;
        if (y(context)) {
            r02 = (x10 ? 1 : 0) | true;
        }
        return w() ? r02 | 4 : r02;
    }

    public static String n(Context context) {
        int q10 = q(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (q10 == 0) {
            q10 = q(context, "com.crashlytics.android.build_id", "string");
        }
        if (q10 != 0) {
            return context.getResources().getString(q10);
        }
        return null;
    }

    public static boolean o(Context context) {
        return (x(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String p(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i10);
                return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static synchronized long s() {
        long j10;
        synchronized (g.class) {
            if (f39387b == -1) {
                long j11 = 0;
                String i10 = i(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(i10)) {
                    String upperCase = i10.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j11 = g(upperCase, "KB", IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                        } else if (upperCase.endsWith("MB")) {
                            j11 = g(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j11 = g(upperCase, "GB", 1073741824);
                        } else {
                            vb.f f10 = vb.f.f();
                            f10.k("Unexpected meminfo format while computing RAM: " + upperCase);
                        }
                    } catch (NumberFormatException e10) {
                        vb.f f11 = vb.f.f();
                        f11.e("Unexpected meminfo format while computing RAM: " + upperCase, e10);
                    }
                }
                f39387b = j11;
            }
            j10 = f39387b;
        }
        return j10;
    }

    private static String t(String str, String str2) {
        return u(str.getBytes(), str2);
    }

    private static String u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            vb.f f10 = vb.f.f();
            f10.e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    public static String v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int i12 = i10 * 2;
            char[] cArr2 = f39386a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean x(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu") && string != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(Context context) {
        boolean x10 = x(context);
        String str = Build.TAGS;
        if ((x10 || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !x10 && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String z(String str) {
        return t(str, "SHA-1");
    }
}
