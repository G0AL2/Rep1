package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.y;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ToolUtils.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f13597a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    private static s f13598b = new s();

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f13599c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f13600d = null;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f13601e = "";

    /* renamed from: f  reason: collision with root package name */
    private static String f13602f = null;

    /* renamed from: g  reason: collision with root package name */
    private static String f13603g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f13604h = null;

    /* renamed from: i  reason: collision with root package name */
    private static HashSet<String> f13605i = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* compiled from: ToolUtils.java */
    /* loaded from: classes.dex */
    public static class a implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        int f13608a;

        a(int i10) {
            this.f13608a = 1;
            this.f13608a = i10;
        }

        private String b() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                                com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                com.bytedance.sdk.openadsdk.core.c.a(com.bytedance.sdk.openadsdk.core.m.a()).a("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.sdk.component.utils.l.e("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                str = "unKnow";
                th = th3;
            }
            return str;
        }

        private synchronized String c() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.u.a.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = u.s();
                    com.bytedance.sdk.component.utils.l.b("getUA", "webview ua：" + strArr[0]);
                }
            });
            while ("unKnow".equals(strArr[0])) {
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public synchronized String call() throws Exception {
            String c10;
            c10 = this.f13608a == 1 ? c() : "unKnow";
            if (this.f13608a == 2) {
                c10 = b();
            }
            return c10;
        }
    }

    public static String a(int i10) {
        switch (i10) {
            case 1:
                return "embeded_ad_landingpage";
            case 2:
                return "banner_ad_landingpage";
            case 3:
                return "interaction_landingpage";
            case 4:
                return "splash_ad_landingpage";
            case 5:
                return "fullscreen_interstitial_ad";
            case 6:
                return "draw_ad_landingpage";
            case 7:
                return "rewarded_video_landingpage";
            default:
                return null;
        }
    }

    public static void a(com.bytedance.sdk.openadsdk.core.e.n nVar, View view) {
    }

    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? "open_ad" : i10 != 7 ? i10 != 8 ? i10 != 9 ? "embeded_ad" : "draw_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static boolean b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c(Context context, String str) {
        return (com.bytedance.sdk.openadsdk.core.h.d() == null || com.bytedance.sdk.openadsdk.core.h.d().a()) ? false : true;
    }

    public static boolean d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.b.a(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int e(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        JSONObject aH;
        int aI = nVar.aI();
        if (aI != 0 || (aH = nVar.aH()) == null) {
            return aI;
        }
        int optInt = aH.optInt("ad_slot_type", 0);
        nVar.C(optInt);
        return optInt;
    }

    public static boolean e(int i10) {
        return i10 == 4;
    }

    public static int f(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        JSONObject aH = nVar.aH();
        if (aH != null) {
            return aH.optInt("rit", 0);
        }
        return 0;
    }

    public static boolean f(int i10) {
        return i10 == 5;
    }

    public static double g(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        return c(nVar.aH());
    }

    public static boolean g(int i10) {
        return i10 == 6;
    }

    public static String h(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        JSONObject aH;
        String aJ = nVar.aJ();
        if (TextUtils.isEmpty(aJ) && (aH = nVar.aH()) != null) {
            aJ = aH.optString("req_id", "");
            nVar.q(aJ);
        }
        return aJ == null ? "" : aJ;
    }

    public static String i(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null || nVar.aa() == null || TextUtils.isEmpty(nVar.aa().a())) {
            return null;
        }
        return nVar.aa().a();
    }

    public static long j() {
        try {
            if (v()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean k() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String l() {
        return String.format("https://%s", "log.byteoversea.com/service/2/app_log_test/");
    }

    public static String m() {
        int o10 = o();
        return (o10 == 1 || o10 == 2) ? "https://sf-tb-sg.ibytedtos.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-muse-va.ibytedtos.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    public static String n() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.e("ToolUtils", e10.toString());
            return "";
        }
    }

    private static String p(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID).appendQueryParameter("version_code", e()).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String q() {
        int i10 = -p();
        if (i10 >= 0) {
            return "Etc/GMT+" + i10;
        }
        return "Etc/GMT" + i10;
    }

    static /* synthetic */ String s() {
        return u();
    }

    private static String u() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.m.a());
            webView.setWebViewClient(new SSWebView.a());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    com.bytedance.sdk.openadsdk.core.c.a(com.bytedance.sdk.openadsdk.core.m.a()).a("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.e("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    private static boolean v() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static boolean c(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        return nVar != null && e(nVar) == 7;
    }

    public static String g() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) com.bytedance.sdk.openadsdk.core.m.a().getSystemService("activity")).getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String k(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.e("ToolUtils", e10.toString());
            return "";
        }
    }

    public static boolean l(Context context) {
        if (context != null) {
            boolean z10 = context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("can query all package = ");
            sb2.append(!z10);
            com.bytedance.sdk.component.utils.l.c("ToolUtils", sb2.toString());
            return !z10;
        }
        throw new IllegalArgumentException("params context is null");
    }

    public static boolean m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int o() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (f13605i.contains(id2)) {
                return 2;
            }
            if (id2 == null || !id2.startsWith("Asia/")) {
                if (id2 == null || !id2.startsWith("Europe/")) {
                    if (id2 != null) {
                        if (id2.startsWith("America/")) {
                            return 5;
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 2;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.e("ToolUtils", th.toString());
            return 0;
        }
    }

    public static long c(String str) {
        return a(b(str));
    }

    public static synchronized String f() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f13604h) && com.bytedance.sdk.openadsdk.core.m.a() != null) {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.m.a().getPackageManager().getPackageInfo(d(), 0);
                f13603g = String.valueOf(packageInfo.versionCode);
                f13604h = packageInfo.versionName;
            }
            str = f13604h;
        }
        return str;
    }

    public static long i() {
        long blockSize;
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                blockSize = statFs.getBlockSizeLong();
                blockCount = statFs.getBlockCountLong();
            } else {
                blockSize = statFs.getBlockSize();
                blockCount = statFs.getBlockCount();
            }
            return blockCount * blockSize;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static JSONObject b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void m(String str) {
        if (TTAdSdk.isInitSuccess()) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b("You must use method '" + str + "' after initialization, please check.");
    }

    public static long n(Context context) {
        int i10 = -1;
        try {
            i10 = context.getApplicationInfo().targetSdkVersion;
            com.bytedance.sdk.component.utils.l.a("ToolUtils", "targetSdkVersion = ", Integer.valueOf(i10));
        } catch (Throwable unused) {
        }
        return i10;
    }

    private static double c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static double e(String str) {
        return c(b(str));
    }

    public static String c() {
        return l.a();
    }

    public static int h() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() { // from class: com.bytedance.sdk.openadsdk.utils.u.2

                /* renamed from: a  reason: collision with root package name */
                private Pattern f13606a = Pattern.compile("^cpu[0-9]+$");

                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return this.f13606a.matcher(str).matches();
                }
            })) == null) {
                return 0;
            }
            return Math.max(listFiles.length, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String j(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale.getLanguage();
            String country = locale.getCountry();
            return language + "_" + country;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.e("ToolUtils", e10.toString());
            return "";
        }
    }

    public static int p() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    public static boolean b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        return nVar != null && e(nVar) == 9;
    }

    public static int c(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("cpu_count", 0);
    }

    public static boolean d(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        return nVar != null && e(nVar) == 8;
    }

    public static synchronized String e() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f13603g) && com.bytedance.sdk.openadsdk.core.m.a() != null) {
                PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.m.a().getPackageManager().getPackageInfo(d(), 0);
                f13603g = String.valueOf(packageInfo.versionCode);
                f13604h = packageInfo.versionName;
            }
            str = f13603g;
        }
        return str;
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static void l(final String str) {
        com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("reportMultiLog") { // from class: com.bytedance.sdk.openadsdk.utils.u.3
            @Override // java.lang.Runnable
            public void run() {
                if (u.f13599c || !com.bytedance.sdk.openadsdk.core.m.h().F()) {
                    return;
                }
                try {
                    boolean unused = u.f13599c = true;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    com.bytedance.sdk.openadsdk.h.b.a().a("reportMultiLog", jSONObject);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }, 5);
    }

    public static void n(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
    }

    public static boolean a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, Constants.MIN_PROGRESS_STEP);
            if (queryIntentActivities != null) {
                return queryIntentActivities.size() > 0;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static int b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public static int c(int i10) {
        BufferedReader bufferedReader;
        Throwable th;
        FileReader fileReader;
        BufferedReader bufferedReader2;
        int parseInt;
        FileReader fileReader2 = null;
        BufferedReader bufferedReader3 = null;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            try {
                fileReader = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
                try {
                    bufferedReader2 = new BufferedReader(fileReader);
                } catch (Throwable th2) {
                    BufferedReader bufferedReader4 = bufferedReader3;
                    th = th2;
                    fileReader2 = fileReader;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th3) {
                bufferedReader = bufferedReader3;
                th = th3;
            }
            try {
                String readLine = bufferedReader2.readLine();
                if (!TextUtils.isEmpty(readLine) && (parseInt = Integer.parseInt(readLine)) > i11) {
                    i11 = parseInt;
                }
                try {
                    bufferedReader2.close();
                    fileReader.close();
                } catch (Exception unused) {
                }
                bufferedReader3 = bufferedReader2;
                fileReader2 = fileReader;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = bufferedReader2;
                fileReader2 = fileReader;
                try {
                    com.bytedance.sdk.component.utils.l.e("ToolUtils", th.getMessage());
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                            bufferedReader3 = bufferedReader;
                        }
                    }
                    bufferedReader3 = bufferedReader;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (fileReader2 != null) {
                        fileReader2.close();
                    }
                }
            }
        }
    }

    public static int d(String str) {
        return b(b(str));
    }

    public static long g(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("free_internal_storage", 0L).longValue();
    }

    public static int p(Context context) {
        int b10 = com.bytedance.sdk.component.utils.o.b(context);
        if (b10 == 6) {
            return 5;
        }
        return b10;
    }

    public static String b() {
        if (!TextUtils.isEmpty(f13601e)) {
            return f13601e;
        }
        try {
            f13601e = com.bytedance.sdk.openadsdk.core.h.a("sdk_local_web_ua", 86400000L);
            if (TextUtils.isEmpty(f13601e)) {
                if (Build.VERSION.SDK_INT < 17) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        if (TextUtils.isEmpty(f13601e)) {
                            SSWebView sSWebView = new SSWebView(com.bytedance.sdk.openadsdk.core.m.a());
                            sSWebView.setWebViewClient(new SSWebView.a());
                            f13601e = sSWebView.getUserAgentString();
                        }
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.u.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (TextUtils.isEmpty(u.f13601e)) {
                                        SSWebView sSWebView2 = new SSWebView(com.bytedance.sdk.openadsdk.core.m.a());
                                        sSWebView2.setWebViewClient(new SSWebView.a());
                                        String unused = u.f13601e = sSWebView2.getUserAgentString();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        });
                    }
                } else if (TextUtils.isEmpty(f13601e)) {
                    f13601e = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.m.a());
                }
                com.bytedance.sdk.openadsdk.core.h.a("sdk_local_web_ua", f13601e);
            }
        } catch (Exception unused) {
        }
        return f13601e;
    }

    public static String g(String str) {
        return a(str, false);
    }

    public static long o(Context context) {
        int i10 = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = context.getApplicationInfo().minSdkVersion;
                com.bytedance.sdk.component.utils.l.a("ToolUtils", "minSdkVersion = ", Integer.valueOf(i10));
            }
        } catch (Throwable unused) {
        }
        return i10;
    }

    public static synchronized String d() {
        String str;
        synchronized (u.class) {
            if (TextUtils.isEmpty(f13602f) && com.bytedance.sdk.openadsdk.core.m.a() != null) {
                f13602f = com.bytedance.sdk.openadsdk.core.m.a().getPackageName();
            }
            str = f13602f;
        }
        return str;
    }

    public static int i(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("is_root", -1);
    }

    public static String a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return b(e(nVar));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean i(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long f(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long h(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("total_sdcard_storage", 0L).longValue();
    }

    public static int a(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c10 = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c10 = 3;
                    break;
                }
                break;
            case 564365438:
                if (str.equals("cache_splash_ad")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1912999166:
                if (str.equals("draw_ad")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 7;
            case 2:
            case 4:
                return 4;
            case 3:
                return 5;
            case 5:
                return 3;
            case 6:
                return 6;
            default:
                return 1;
        }
    }

    public static long f(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("total_internal_storage", 0L).longValue();
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.m.h().q();
        }
        if (TextUtils.isEmpty(str)) {
            return o() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/";
        } else if (str.startsWith("http")) {
            return str;
        } else {
            return "https://" + str;
        }
    }

    public static boolean j(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null) {
            return true;
        }
        int c10 = com.bytedance.sdk.openadsdk.core.m.h().c(f(nVar));
        int c11 = com.bytedance.sdk.component.utils.o.c(com.bytedance.sdk.openadsdk.core.m.a());
        if (c10 != 1) {
            if (c10 == 2) {
                return f(c11) || e(c11) || g(c11);
            } else if (c10 != 3) {
                return c10 != 5 || e(c11) || g(c11);
            } else {
                return false;
            }
        }
        return e(c11);
    }

    private static long a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public static String a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        JSONObject aH = nVar.aH();
        return aH != null ? aH.optString("rit", str) : str;
    }

    public static int d(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("cpu_max_frequency", 0);
    }

    public static int d(int i10) {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2;
        int parseInt;
        FileReader fileReader = null;
        BufferedReader bufferedReader3 = null;
        int i11 = 0;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_min_freq");
                try {
                    bufferedReader2 = new BufferedReader(fileReader2);
                } catch (Throwable th2) {
                    BufferedReader bufferedReader4 = bufferedReader3;
                    th = th2;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
                try {
                    String readLine = bufferedReader2.readLine();
                    if (!TextUtils.isEmpty(readLine) && ((parseInt = Integer.parseInt(readLine)) < i11 || i11 == 0)) {
                        i11 = parseInt;
                    }
                    try {
                        bufferedReader2.close();
                        fileReader2.close();
                    } catch (Exception unused) {
                    }
                    bufferedReader3 = bufferedReader2;
                    fileReader = fileReader2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                    fileReader = fileReader2;
                    try {
                        com.bytedance.sdk.component.utils.l.e("ToolUtils", th.getMessage());
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused2) {
                                bufferedReader3 = bufferedReader;
                            }
                        }
                        bufferedReader3 = bufferedReader;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                    }
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader3;
                th = th4;
            }
        }
    }

    public static String e(Context context, String str) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            th.printStackTrace();
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            return null;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                        }
                    }
                } while (!readLine.contains(str));
                if (readLine == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused5) {
                    }
                    return null;
                }
                String[] split = readLine.split("\\s+");
                com.bytedance.sdk.component.utils.l.b("ToolUtils", "getTotalMemory = " + split[1]);
                String str2 = split[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused6) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused7) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static String a() {
        String b10;
        String str = "unKnow";
        try {
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                b10 = com.bytedance.sdk.openadsdk.multipro.d.a.b("sp_multi_ua_data", "android_system_ua", "unKnow");
            } else {
                b10 = com.bytedance.sdk.openadsdk.core.c.a(com.bytedance.sdk.openadsdk.core.m.a()).b("android_system_ua", "unKnow");
            }
        } catch (Exception unused) {
        }
        if (b10 == null || "unKnow".equals(b10)) {
            FutureTask futureTask = new FutureTask(new a(2));
            f13597a.execute(futureTask);
            str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
            com.bytedance.sdk.component.utils.l.e("getUA", " getAndroidSystemUA userAgent" + str);
            return str;
        }
        return b10;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    public static String b(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("total_memory", "0");
    }

    public static void b(com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        if (nVar != null) {
            try {
                String O = nVar.O();
                if (TextUtils.isEmpty(O) && nVar.ab() != null && nVar.ab().c() == 1 && !TextUtils.isEmpty(nVar.ab().b())) {
                    O = nVar.ab().b();
                }
                String str2 = O;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                y.a(com.bytedance.sdk.openadsdk.core.m.a(), str2, nVar, a(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static String a(Context context) {
        String b10 = com.bytedance.sdk.openadsdk.core.c.a(context).b("total_memory", (String) null);
        if (b10 == null || f(b10) <= 0) {
            b10 = e(context, "MemTotal");
            if (f(b10) <= 0) {
                b10 = g();
            }
            com.bytedance.sdk.openadsdk.core.c.a(context).a("total_memory", b10);
        }
        return b10;
    }

    public static String a(String str, boolean z10) {
        String str2;
        String p10 = com.bytedance.sdk.openadsdk.core.m.h().p();
        if (TextUtils.isEmpty(p10)) {
            int o10 = o();
            if (o10 == 1) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else if (o10 == 2) {
                str2 = "https://pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://pangolin16.isnssdk.com" + str;
            }
            if (!z10) {
                return s.b(str2);
            }
            return p(str2);
        }
        String str3 = "https://" + p10 + str;
        if (s.a() && !z10) {
            str3 = s.b(str3);
        }
        return z10 ? p(str3) : str3;
    }

    public static int e(Context context) {
        return com.bytedance.sdk.openadsdk.core.c.a(context).b("cpu_min_frequency", 0);
    }

    public static Map<String, Object> a(boolean z10, com.bytedance.sdk.openadsdk.core.e.n nVar, long j10, long j11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.Y());
        hashMap.put("load_time", Long.valueOf(j10));
        l3.b J = nVar.J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.o()));
            hashMap.put("video_resolution", J.u());
        }
        if (!z10) {
            hashMap.put("error_code", Long.valueOf(j11));
            if (TextUtils.isEmpty(str)) {
                str = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
            hashMap.put("error_message", str);
        }
        return hashMap;
    }

    public static Map<String, Object> a(com.bytedance.sdk.openadsdk.core.e.n nVar, long j10, i3.a aVar) {
        if (nVar == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("creative_id", nVar.Y());
        hashMap.put("buffers_time", Long.valueOf(j10));
        l3.b J = nVar.J();
        if (J != null) {
            hashMap.put("video_size", Long.valueOf(J.o()));
            hashMap.put("video_resolution", J.u());
        }
        a(hashMap, aVar);
        return hashMap;
    }

    private static void a(Map<String, Object> map, i3.a aVar) {
        if (map.containsKey("video_resolution") || aVar == null) {
            return;
        }
        try {
            map.put("video_resolution", String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(aVar.j()), Integer.valueOf(aVar.k())));
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject, boolean z10) {
        String a10;
        if (!s.a() || (a10 = s.a("testGps.txt")) == null) {
            return;
        }
        try {
            String[] split = a10.split(",");
            if (split.length >= 2 && j(split[1]) && j(split[0])) {
                if (z10) {
                    a(jSONObject, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    a(jSONObject2, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                    jSONObject.put("geo", jSONObject2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public static void a(JSONObject jSONObject, Float f10, Float f11) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(com.bytedance.sdk.component.c.a.a("w0yrwBEUr1ini9hm/p022A==", com.bytedance.sdk.openadsdk.core.a.a()), f11);
            jSONObject.put(com.bytedance.sdk.component.c.a.a("LeHrqxcsm457V3n1/LcJVw==", com.bytedance.sdk.openadsdk.core.a.a()), f10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean a(long j10, long j11) {
        long j12 = j11 - j10;
        return j12 < 86400000 && j12 > -86400000 && a(j10) == a(j11);
    }

    public static long a(long j10) {
        return (j10 + TimeZone.getDefault().getOffset(j10)) / 86400000;
    }

    public static void a(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || context == null || !m(context)) {
            return;
        }
        int i11 = 3572;
        int length = str2.length();
        int i12 = 0;
        int i13 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        while (i13 <= i10) {
            if (i11 < length) {
                Log.d(str, i10 + Constants.FILENAME_SEQUENCE_SEPARATOR + i13 + ":" + str2.substring(i12, i11));
                i13++;
                i12 = i11;
                i11 += 3572;
            } else {
                Log.d(str, i10 + Constants.FILENAME_SEQUENCE_SEPARATOR + i13 + ":" + str2.substring(i12));
                return;
            }
        }
    }
}
