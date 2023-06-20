package com.inmobi.media;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SdkContext.java */
/* loaded from: classes3.dex */
public final class ho {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25680a = "ho";

    /* renamed from: b  reason: collision with root package name */
    private static Context f25681b = null;

    /* renamed from: c  reason: collision with root package name */
    private static String f25682c = "";

    /* renamed from: d  reason: collision with root package name */
    private static String f25683d;

    /* renamed from: e  reason: collision with root package name */
    private static String f25684e;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicBoolean f25685f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f25686g;

    /* renamed from: h  reason: collision with root package name */
    private static final ExecutorService f25687h;

    static {
        String simpleName = ho.class.getSimpleName();
        f25685f = new AtomicBoolean();
        f25686g = false;
        f25687h = Executors.newSingleThreadExecutor(new ht(simpleName));
    }

    public static void a(Runnable runnable) {
        f25687h.submit(runnable);
    }

    public static void b(Context context, String str) {
        e(context);
        f25684e = str;
    }

    public static Context c() {
        return f25681b;
    }

    public static Application d() {
        Context context = f25681b;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    private static void e(Context context) {
        a(context.getApplicationContext());
        f25685f.set(true);
        if (Build.VERSION.SDK_INT >= 17 || f25682c != null) {
            return;
        }
        try {
            f25682c = new WebView(context).getSettings().getUserAgentString();
        } catch (Exception unused) {
            a((Context) null);
        }
    }

    public static String f() {
        String str = f25683d;
        return str == null ? f25684e : str;
    }

    public static String g() {
        return f25683d;
    }

    public static String h() {
        return f25684e;
    }

    public static String i() {
        if (TextUtils.isEmpty(f25682c) && Build.VERSION.SDK_INT >= 17) {
            f25682c = f(f25681b);
        }
        return f25682c;
    }

    public static boolean j() {
        return f25685f.get();
    }

    public static void k() {
        Context c10 = c();
        if (c10 != null) {
            File b10 = b(c10);
            if (b10.mkdir()) {
                return;
            }
            b10.isDirectory();
        }
    }

    public static void l() {
        Context c10 = c();
        if (c10 != null) {
            File c11 = c(c10);
            if (c11.mkdir()) {
                return;
            }
            c11.isDirectory();
        }
    }

    public static String m() {
        if (c() != null) {
            return hf.a(c(), "coppa_store").b("im_accid");
        }
        return null;
    }

    public static void a(Context context, String str) {
        e(context);
        f25683d = str;
    }

    public static File c(Context context) {
        return new File(context.getFilesDir(), "as_cached_content");
    }

    @TargetApi(17)
    private static String f(Context context) {
        try {
            return g(context);
        } catch (bq e10) {
            gg.a().a(new hg(e10));
            try {
                String property = System.getProperty("http.agent");
                return property == null ? "" : property;
            } catch (Exception e11) {
                gg.a().a(new hg(e11));
                return "";
            }
        }
    }

    @TargetApi(17)
    private static String g(Context context) throws bq {
        try {
            return WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Exception e10) {
            throw new bq(e10.getMessage());
        }
    }

    public static boolean b() {
        return (f25681b == null || f25683d == null) ? false : true;
    }

    public static boolean c(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT < 23) {
            return packageManager.checkPermission(str, packageManager.getNameForUid(Binder.getCallingUid())) == 0;
        }
        return d(context, str);
    }

    public static boolean a() {
        return f25681b != null;
    }

    public static void b(boolean z10) {
        f25685f.set(z10);
    }

    public static void a(Context context) {
        f25681b = context;
    }

    public static File b(Context context) {
        return new File(context.getFilesDir(), "im_cached_content");
    }

    private static boolean d(Context context, String str) {
        if (context != null && str != null) {
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
                if (strArr != null) {
                    for (String str2 : strArr) {
                        if (str2.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void a(boolean z10) {
        f25686g = z10;
    }

    public static void b(String str) {
        if (c() != null) {
            hf.a(c(), "coppa_store").a("im_accid", str);
        }
    }

    public static boolean e() {
        return f25686g;
    }

    public static void a(File file, String str) {
        if (str != null && str.trim().length() != 0) {
            is.a(new File(file, str));
        } else {
            is.a(file);
        }
    }

    public static void d(Context context) {
        try {
            File file = new File(context.getCacheDir(), "im_cached_content");
            if (file.exists()) {
                is.a(file);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static void a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static File a(String str) {
        k();
        File b10 = b(c());
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new File(b10, valueOf + String.valueOf(str.substring(length).hashCode() & Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }
}
