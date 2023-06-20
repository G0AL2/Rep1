package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Locale;

/* compiled from: IdUtils.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static String f12381a;

    /* renamed from: b  reason: collision with root package name */
    private static String f12382b;

    /* renamed from: c  reason: collision with root package name */
    private static String f12383c;

    /* renamed from: d  reason: collision with root package name */
    private static String f12384d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f12385e;

    public static String a(Context context) {
        if (TextUtils.isEmpty(f12381a) && !f12385e) {
            synchronized (j.class) {
                if (!f12385e) {
                    e(context);
                }
            }
        }
        try {
            if (TextUtils.isEmpty(f12381a) && com.bytedance.sdk.openadsdk.multipro.b.c()) {
                f12381a = c.a(d(context)).b("did", (String) null);
            }
        } catch (Exception unused) {
        }
        return f12381a;
    }

    public static String b(Context context) {
        if (f12383c == null && !f12385e) {
            synchronized (j.class) {
                if (!f12385e) {
                    e(context);
                }
            }
        }
        return f12383c;
    }

    public static String c(Context context) {
        if (TextUtils.isEmpty(f12384d) && !f12385e) {
            synchronized (j.class) {
                if (!f12385e) {
                    e(context);
                }
            }
        }
        return f12384d;
    }

    private static Context d(Context context) {
        return context == null ? m.a() : context;
    }

    @SuppressLint({"HardwareIds"})
    private static void e(Context context) {
        Context d10;
        if (f12385e || (d10 = d(context)) == null) {
            return;
        }
        f12381a = c.a(d10).b("did", (String) null);
        f12382b = b();
        f12383c = String.valueOf(Build.TIME);
        f12384d = c.a(d10).b("uuid", (String) null);
        f12385e = true;
    }

    private static String b() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.m.e()) {
                sb2.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.m.b()) {
                sb2.append("FLYME-");
            } else {
                String n10 = com.bytedance.sdk.openadsdk.utils.m.n();
                if (com.bytedance.sdk.openadsdk.utils.m.a(n10)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(n10)) {
                    sb2.append(n10);
                    sb2.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f12381a)) {
            c.a(context).a("did", str);
            f12381a = str;
        }
        if (TextUtils.isEmpty(f12381a)) {
            return;
        }
        s.a(f12381a);
    }

    public static String a() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(locale2) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
