package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private static final CharSequence f6502a = "sony";

    /* renamed from: b  reason: collision with root package name */
    private static final CharSequence f6503b = "amigo";

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f6504c = "funtouch";

    public static String a() {
        if (d.c()) {
            return j();
        }
        if (d.d()) {
            return l();
        }
        if (m()) {
            return n();
        }
        String k10 = k();
        if (TextUtils.isEmpty(k10)) {
            if (e()) {
                return d();
            }
            if (f()) {
                return g();
            }
            if (c()) {
                return b();
            }
            String h10 = h();
            return !TextUtils.isEmpty(h10) ? h10 : Build.DISPLAY;
        }
        return k10;
    }

    private static String a(String str) {
        Process exec;
        BufferedReader bufferedReader;
        String str2 = "";
        BufferedReader bufferedReader2 = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            exec = runtime.exec("getprop " + str);
            bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        } catch (Throwable unused) {
        }
        try {
            str2 = bufferedReader.readLine();
            exec.destroy();
            k.a(bufferedReader);
            return str2;
        } catch (Throwable unused2) {
            bufferedReader2 = bufferedReader;
            k.a(bufferedReader2);
            return str2;
        }
    }

    public static String b() {
        return a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String d() {
        return a("ro.vivo.os.build.display.id") + "_" + a("ro.vivo.product.version");
    }

    public static boolean e() {
        String a10 = a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(a10) && a10.toLowerCase(Locale.getDefault()).contains(f6504c);
    }

    public static boolean f() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains(f6503b);
    }

    public static String g() {
        return Build.DISPLAY + "_" + a("ro.gn.sv.version");
    }

    public static String h() {
        if (i()) {
            return "eui_" + a("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean i() {
        return !TextUtils.isEmpty(a("ro.letv.release.version"));
    }

    public static String j() {
        if (d.c()) {
            return "miui_" + a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static String k() {
        String a10 = d.a();
        if (a10 == null || !a10.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return a10 + "_" + Build.DISPLAY;
    }

    public static String l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    public static boolean m() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.toLowerCase(Locale.getDefault()).contains("oppo");
    }

    public static String n() {
        if (m()) {
            return "coloros_" + a("ro.build.version.opporom") + "_" + Build.DISPLAY;
        }
        return "";
    }
}
