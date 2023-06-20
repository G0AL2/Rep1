package com.bytedance.sdk.openadsdk.utils;

import android.os.Build;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: RomUtils.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13579a = false;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f13580b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f13581c = "sony";

    /* renamed from: d  reason: collision with root package name */
    private static final CharSequence f13582d = "amigo";

    /* renamed from: e  reason: collision with root package name */
    private static final CharSequence f13583e = "funtouch";

    /* renamed from: f  reason: collision with root package name */
    private static String f13584f = null;

    /* renamed from: g  reason: collision with root package name */
    private static int f13585g = Integer.MAX_VALUE;

    /* compiled from: RomUtils.java */
    /* loaded from: classes.dex */
    public static class a implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        private String f13587a;

        public a(String str) {
            this.f13587a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String c10 = m.c(this.f13587a);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            com.bytedance.sdk.component.utils.l.b("RomUtils", "property:" + c10 + ",getSystemProperty use time :" + currentTimeMillis2);
            if (!TextUtils.isEmpty(c10)) {
                try {
                    if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                        com.bytedance.sdk.component.utils.l.d("RomUtils", "SPMultiHelper-getPropertyFromSPMultiHelper:" + c10);
                        com.bytedance.sdk.openadsdk.multipro.d.a.a("rom_info", "rom_property_info", c10);
                    } else {
                        com.bytedance.sdk.component.utils.l.d("RomUtils", "SP-getPropertyFromSP:" + c10);
                        com.bytedance.sdk.component.utils.u.a("rom_info", com.bytedance.sdk.openadsdk.core.m.a()).a("rom_property_info", c10);
                    }
                } catch (Throwable unused) {
                }
            }
            return c10;
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty(f13584f)) {
            return f13584f;
        }
        String a10 = com.bytedance.sdk.openadsdk.core.h.a("sdk_local_rom_info", 604800000L);
        f13584f = a10;
        if (TextUtils.isEmpty(a10)) {
            String u10 = u();
            f13584f = u10;
            com.bytedance.sdk.openadsdk.core.h.a("sdk_local_rom_info", u10);
        }
        return f13584f;
    }

    public static String c() {
        return d("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static boolean e() {
        if (!f13580b) {
            try {
                Class.forName("miui.os.Build");
                f13579a = true;
                f13580b = true;
                return true;
            } catch (Exception unused) {
                f13580b = true;
            }
        }
        return f13579a;
    }

    public static String f() {
        return d("ro.vivo.os.build.display.id") + "_" + d("ro.vivo.product.version");
    }

    public static boolean g() {
        String d10 = d("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(d10) && d10.toLowerCase().contains(f13583e);
    }

    public static boolean h() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(f13582d);
    }

    public static String i() {
        return Build.DISPLAY + "_" + d("ro.gn.sv.version");
    }

    public static String j() {
        if (k()) {
            return "eui_" + d("ro.letv.release.version") + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean k() {
        return !TextUtils.isEmpty(d("ro.letv.release.version"));
    }

    public static String l() {
        if (e()) {
            return "miui_" + d("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
        }
        return "";
    }

    public static String m() {
        String n10 = n();
        if (n10 == null || !n10.toLowerCase().contains("emotionui")) {
            return "";
        }
        return n10 + "_" + Build.DISPLAY;
    }

    public static String n() {
        return d("ro.build.version.emui");
    }

    public static boolean o() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static String p() {
        if (o()) {
            try {
                String d10 = d("ro.smartisan.version");
                return "smartisan_" + d10;
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    public static String q() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    public static boolean r() {
        if (f13585g == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String k10 = u.k("kllk");
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains(k10)) {
                f13585g = 1;
            } else {
                f13585g = 0;
            }
        }
        return f13585g == 1;
    }

    public static String s() {
        if (r()) {
            String k10 = u.k("ro.build.version.kllkrom");
            return "coloros_" + d(k10) + "_" + Build.DISPLAY;
        }
        return "";
    }

    public static boolean t() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String u() {
        if (o()) {
            return p();
        }
        if (e()) {
            return l();
        }
        if (b()) {
            return q();
        }
        if (r()) {
            return s();
        }
        String m10 = m();
        if (TextUtils.isEmpty(m10)) {
            if (g()) {
                return f();
            }
            if (h()) {
                return i();
            }
            if (d()) {
                return c();
            }
            String j10 = j();
            return !TextUtils.isEmpty(j10) ? j10 : Build.DISPLAY;
        }
        return m10;
    }

    private static String v() {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                String b10 = com.bytedance.sdk.openadsdk.multipro.d.a.b("rom_info", "rom_property_info", "");
                com.bytedance.sdk.component.utils.l.c("RomUtils", "get Property From SPMultiHelper..." + b10);
                return b10;
            }
            String b11 = com.bytedance.sdk.component.utils.u.a("rom_info", com.bytedance.sdk.openadsdk.core.m.a()).b("rom_property_info", "");
            com.bytedance.sdk.component.utils.l.c("RomUtils", "get Property From SP...=" + b11);
            return b11;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        String str2 = "";
        Process process = null;
        try {
        } catch (IOException e10) {
            com.bytedance.sdk.component.utils.l.c("ToolUtils", "Exception while closing InputStream", e10);
        }
        try {
            try {
                Process exec = Runtime.getRuntime().exec("getprop " + str);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
                    try {
                        str2 = bufferedReader.readLine();
                        exec.exitValue();
                        bufferedReader.close();
                    } catch (IllegalThreadStateException unused) {
                        process = exec;
                        try {
                            process.destroy();
                        } catch (Throwable unused2) {
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return str2;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.l.c("ToolUtils", "Unable to read sysprop " + str, th);
                            return str2;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e11) {
                                    com.bytedance.sdk.component.utils.l.c("ToolUtils", "Exception while closing InputStream", e11);
                                }
                            }
                        }
                    }
                } catch (IllegalThreadStateException unused3) {
                    bufferedReader = null;
                }
            } catch (IllegalThreadStateException unused4) {
                bufferedReader = null;
            }
            return str2;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    private static String d(String str) {
        String str2;
        try {
            str2 = v();
            try {
                if (TextUtils.isEmpty(str2)) {
                    final com.bytedance.sdk.component.f.f fVar = new com.bytedance.sdk.component.f.f(new a(str), 5, 2);
                    com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.m.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fVar.run();
                        }
                    }, 5);
                    str2 = (String) fVar.get(1L, TimeUnit.SECONDS);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = n();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || t();
    }
}
