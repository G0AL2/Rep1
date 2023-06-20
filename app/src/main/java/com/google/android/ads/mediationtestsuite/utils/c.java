package com.google.android.ads.mediationtestsuite.utils;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: AppInfoUtil.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static List<ActivityInfo> f20909a = null;

    /* renamed from: b  reason: collision with root package name */
    private static List<ActivityInfo> f20910b = null;

    /* renamed from: c  reason: collision with root package name */
    private static List<ProviderInfo> f20911c = null;

    /* renamed from: d  reason: collision with root package name */
    private static List<String> f20912d = null;

    /* renamed from: e  reason: collision with root package name */
    private static Bundle f20913e = null;

    /* renamed from: f  reason: collision with root package name */
    private static AdvertisingIdClient.Info f20914f = null;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f20915g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInfoUtil.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f20916a;

        a(Context context) {
            this.f20916a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AdvertisingIdClient.Info unused = c.f20914f = AdvertisingIdClient.getAdvertisingIdInfo(this.f20916a);
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean b(String str) {
        for (ActivityInfo activityInfo : f20909a) {
            if (activityInfo.name.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(String str) {
        Bundle bundle = f20913e;
        return bundle != null && bundle.containsKey(str);
    }

    public static boolean d(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static void e(Context context) {
        new Thread(new a(context)).start();
    }

    public static String f() {
        AdvertisingIdClient.Info info = f20914f;
        if (info == null || info.isLimitAdTrackingEnabled()) {
            return null;
        }
        return f20914f.getId();
    }

    public static String g() {
        if (!f20915g) {
            Log.e("gma_test", "App Info not initialized");
            return null;
        }
        Bundle bundle = f20913e;
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.*$")) {
            return string;
        }
        return null;
    }

    public static String h(Context context) {
        i(context);
        return g();
    }

    public static void i(Context context) {
        if (f20915g) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 4235);
            f20912d = Arrays.asList(packageInfo.requestedPermissions);
            f20909a = Arrays.asList(packageInfo.activities);
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                f20910b = Arrays.asList(activityInfoArr);
            } else {
                f20910b = new ArrayList();
            }
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                f20911c = Arrays.asList(providerInfoArr);
            } else {
                f20911c = new ArrayList();
            }
            f20913e = packageInfo.applicationInfo.metaData;
        } catch (Exception unused) {
            Log.e("gma_test", "Failed to load application info from PackageManager.");
        }
        e(context);
        f20915g = true;
    }

    public static boolean j(Context context) {
        return (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean k(String str) {
        return f20912d.contains(str);
    }

    public static boolean l(String str) {
        for (ProviderInfo providerInfo : f20911c) {
            if (providerInfo.name.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(String str) {
        for (ActivityInfo activityInfo : f20910b) {
            if (activityInfo.name.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
