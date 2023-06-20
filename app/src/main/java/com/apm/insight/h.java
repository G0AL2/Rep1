package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.t;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Context f6342a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Application f6343b = null;

    /* renamed from: c  reason: collision with root package name */
    private static long f6344c = 0;

    /* renamed from: d  reason: collision with root package name */
    private static String f6345d = "default";

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6346e = false;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f  reason: collision with root package name */
    private static com.apm.insight.runtime.d f6347f;

    /* renamed from: i  reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f6350i;

    /* renamed from: n  reason: collision with root package name */
    private static volatile String f6355n;

    /* renamed from: g  reason: collision with root package name */
    private static ConfigManager f6348g = new ConfigManager();

    /* renamed from: h  reason: collision with root package name */
    private static a f6349h = new a();

    /* renamed from: j  reason: collision with root package name */
    private static t f6351j = null;

    /* renamed from: k  reason: collision with root package name */
    private static volatile String f6352k = null;

    /* renamed from: l  reason: collision with root package name */
    private static Object f6353l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static volatile int f6354m = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f6356o = 0;

    public static com.apm.insight.runtime.d a() {
        if (f6347f == null) {
            f6347f = com.apm.insight.runtime.i.a(f6342a);
        }
        return f6347f;
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(j());
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(int i10) {
        f6356o = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10, String str) {
        if (f6350i == null) {
            synchronized (h.class) {
                if (f6350i == null) {
                    f6350i = new ConcurrentHashMap<>();
                }
            }
        }
        f6350i.put(Integer.valueOf(i10), str);
    }

    public static void a(Application application) {
        if (application != null) {
            f6343b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f6343b == null) {
            f6344c = System.currentTimeMillis();
            f6342a = context;
            f6343b = application;
            f6352k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f6347f = new com.apm.insight.runtime.d(f6342a, iCommonParams, a());
    }

    public static void a(com.apm.insight.runtime.d dVar) {
        f6347f = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        f6345d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(boolean z10) {
        f6346e = z10;
    }

    public static a b() {
        return f6349h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i10, String str) {
        f6354m = i10;
        f6355n = str;
    }

    public static t c() {
        if (f6351j == null) {
            synchronized (h.class) {
                f6351j = new t(f6342a);
            }
        }
        return f6351j;
    }

    public static boolean d() {
        return i().isDebugMode() && n().contains("local_test");
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static String f() {
        if (f6352k == null) {
            synchronized (f6353l) {
                if (f6352k == null) {
                    f6352k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f6352k;
    }

    public static Context g() {
        return f6342a;
    }

    public static Application h() {
        return f6343b;
    }

    public static ConfigManager i() {
        return f6348g;
    }

    public static long j() {
        return f6344c;
    }

    public static String k() {
        return f6345d;
    }

    public static int l() {
        return f6356o;
    }

    public static boolean m() {
        return f6346e;
    }

    public static String n() {
        Object obj = a().a().get("channel");
        return obj == null ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : String.valueOf(obj);
    }

    public static ConcurrentHashMap<Integer, String> o() {
        return f6350i;
    }

    public static int p() {
        return f6354m;
    }

    public static String q() {
        return f6355n;
    }
}
