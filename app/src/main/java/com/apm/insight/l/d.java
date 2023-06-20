package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6478a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f6479b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f6480c = Pattern.compile("^0-([\\d]+)$");

    public static String a() {
        return b("ro.build.version.emui");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return b();
        }
        return true;
    }

    private static String b(String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            try {
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                k.a(bufferedReader);
                return str2;
            } catch (Throwable unused) {
                k.a(bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static boolean b() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int c(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            } catch (Throwable unused) {
            }
            try {
                readLine = bufferedReader.readLine();
            } catch (Throwable unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                    return -1;
                }
                return -1;
            }
            if (readLine == null) {
                bufferedReader.close();
                return -1;
            }
            int d10 = d(readLine);
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            return d10;
        } catch (IOException unused4) {
            return -1;
        }
    }

    public static boolean c() {
        if (!f6478a) {
            try {
                Class.forName("miui.os.Build");
                com.apm.insight.k.e.f6425a = true;
                f6478a = true;
                return true;
            } catch (Exception unused) {
                f6478a = true;
            }
        }
        return com.apm.insight.k.e.f6425a;
    }

    private static int d(String str) {
        Matcher matcher = f6480c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static boolean d() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    public static int e() {
        int i10 = f6479b;
        if (i10 > 0) {
            return i10;
        }
        int c10 = c("/sys/devices/system/cpu/possible");
        if (c10 <= 0) {
            c10 = c("/sys/devices/system/cpu/present");
        }
        if (c10 <= 0) {
            c10 = e("/sys/devices/system/cpu/");
        }
        if (c10 <= 0) {
            c10 = Runtime.getRuntime().availableProcessors();
        }
        if (c10 <= 0) {
            c10 = 1;
        }
        f6479b = c10;
        return c10;
    }

    private static int e(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() { // from class: com.apm.insight.l.d.1

                /* renamed from: a  reason: collision with root package name */
                private final Pattern f6481a = Pattern.compile("^cpu[\\d]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return this.f6481a.matcher(str2).matches();
                }
            });
            if (listFiles == null || listFiles.length <= 0) {
                return -1;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
