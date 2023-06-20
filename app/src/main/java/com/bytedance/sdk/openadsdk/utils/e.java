package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Keep;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.JProtect;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DeviceUtils.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static String f13561a = "";

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f13562b = false;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f13563c = false;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f13564d = false;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f13565e = false;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f13566f = true;

    /* renamed from: g  reason: collision with root package name */
    private static long f13567g;

    /* renamed from: h  reason: collision with root package name */
    private static int f13568h;

    /* renamed from: i  reason: collision with root package name */
    private static int f13569i;

    /* renamed from: j  reason: collision with root package name */
    private static int f13570j;

    /* renamed from: k  reason: collision with root package name */
    private static int f13571k;

    /* renamed from: l  reason: collision with root package name */
    private static int f13572l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceUtils.java */
    /* loaded from: classes.dex */
    public static class a extends BroadcastReceiver {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (!e.f13564d && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new a(), intentFilter);
                    boolean unused = e.f13564d = true;
                } catch (Throwable unused2) {
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int unused = e.f13570j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                    if (e.f13569i != 0) {
                        int unused2 = e.f13570j = (int) ((e.f13570j / e.f13569i) * 100.0d);
                    }
                }
            } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                int unused3 = e.f13571k = intent.getIntExtra("state", 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceUtils.java */
    /* loaded from: classes.dex */
    public static class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("status", -1);
                if (intExtra == -1) {
                    c.f13575a = intExtra;
                }
                if (intExtra == 2) {
                    c.f13575a = 1;
                } else {
                    c.f13575a = 0;
                }
                c.f13576b = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
            }
        }
    }

    /* compiled from: DeviceUtils.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        static int f13575a = -1;

        /* renamed from: b  reason: collision with root package name */
        static float f13576b;

        public static int a() {
            return f13575a;
        }

        public static float b() {
            return f13576b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DeviceUtils.java */
    /* loaded from: classes.dex */
    public static class d extends BroadcastReceiver {
        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (Build.VERSION.SDK_INT < 21 || context == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
            context.registerReceiver(new d(), intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                e.u(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = e.f13572l = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceUtils.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0187e extends BroadcastReceiver {
        C0187e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = e.f13566f = true;
                com.bytedance.sdk.component.utils.l.c("DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = e.f13566f = false;
                com.bytedance.sdk.component.utils.l.c("DeviceUtils", "screen_off");
            }
        }
    }

    /* compiled from: DeviceUtils.java */
    /* loaded from: classes.dex */
    public static class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i10;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.m.a());
                if (advertisingIdInfo != null) {
                    i10 = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (com.bytedance.sdk.openadsdk.core.m.h().p("gaid")) {
                        String id2 = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id2)) {
                            s3.a.a().d(id2);
                            s3.a.b(id2);
                        }
                    }
                } else {
                    i10 = -1;
                }
                if (i10 != -1) {
                    com.bytedance.sdk.openadsdk.core.c.a(com.bytedance.sdk.openadsdk.core.m.a()).a("limit_ad_track", i10);
                }
            } catch (GooglePlayServicesNotAvailableException e10) {
                com.bytedance.sdk.component.utils.l.c("DeviceUtils", "getLmtTask error : indicating that Google Play is not installed on this device.", e10);
            } catch (GooglePlayServicesRepairableException e11) {
                com.bytedance.sdk.component.utils.l.c("DeviceUtils", "getLmtTask error : indicating that there was a recoverable error connecting to Google Play Services.", e11);
            } catch (IOException e12) {
                com.bytedance.sdk.component.utils.l.c("DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e12);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.e("DeviceUtils", th.getMessage());
            }
        }
    }

    @Keep
    @JProtect
    public static JSONObject a(Context context, boolean z10) {
        for (char c10 = 'l'; c10 > 11; c10 = 65534) {
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", g(context));
            a(jSONObject);
            jSONObject.put("type", d(context));
            jSONObject.put("os", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE + "");
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", u.p(context));
            jSONObject.put("screen_width", v.c(context));
            jSONObject.put("screen_height", v.d(context));
            if (com.bytedance.sdk.openadsdk.core.m.h().C()) {
                jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.r.a().c());
            }
            com.bytedance.sdk.openadsdk.core.i.f h10 = com.bytedance.sdk.openadsdk.core.m.h();
            if (h10.p("boot")) {
                jSONObject.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            }
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.j.c(context));
            jSONObject.put("rom_version", m.a());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.j.b(context));
            jSONObject.put("timezone", u.q());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.j.a());
            jSONObject.put("carrier_name", n.a());
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(z10 ? u.a(context) : u.b(context)) * 1024));
            jSONObject.put("locale_language", c());
            jSONObject.put("screen_bright", Math.ceil(d() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", a() ? 0 : 1);
            jSONObject.put("cpu_num", u.c(context));
            jSONObject.put("cpu_max_freq", u.d(context));
            jSONObject.put("cpu_min_freq", u.e(context));
            jSONObject.put("battery_remaining_pct", (int) c.b());
            jSONObject.put("is_charging", c.a());
            jSONObject.put("total_space", String.valueOf(u.f(context)));
            jSONObject.put("free_space_in", String.valueOf(u.g(context)));
            jSONObject.put("sdcard_size", String.valueOf(u.h(context)));
            jSONObject.put("rooted", u.i(context));
            jSONObject.put("enable_assisted_clicking", e());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.t.a(context, "tt_choose_language"));
            jSONObject.put("airplane", h(context));
            jSONObject.put("darkmode", n(context));
            jSONObject.put("headset", o(context));
            jSONObject.put("ringmute", p(context));
            jSONObject.put("screenscale", q(context));
            jSONObject.put("volume", r(context));
            jSONObject.put("low_power_mode", s(context));
            if (h10.p("mnc")) {
                jSONObject.put("mnc", n.c());
            }
            if (h10.p("mcc")) {
                jSONObject.put("mcc", n.b());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Keep
    @JProtect
    public static void a(Context context) {
        if (f13562b) {
            return;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager != null) {
                f13566f = powerManager.isScreenOn();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            C0187e c0187e = new C0187e();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(c0187e, intentFilter);
            f13562b = true;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static void a(JSONObject jSONObject) throws JSONException {
        b(jSONObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f A[Catch: all -> 0x0057, LOOP:0: B:16:0x003f->B:40:0x003f, LOOP_START, PHI: r3 
      PHI: (r3v4 char) = (r3v2 char), (r3v5 char) binds: [B:14:0x003b, B:40:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0017, B:9:0x0025, B:11:0x002d, B:24:0x0051, B:14:0x003b, B:16:0x003f, B:18:0x0043, B:22:0x004d, B:12:0x0033), top: B:31:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:14:0x003b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:26:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:26:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:26:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0050 -> B:24:0x0051). Please submit an issue!!! */
    @androidx.annotation.Keep
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a() {
        /*
            boolean r0 = com.bytedance.sdk.openadsdk.utils.e.f13566f
            if (r0 != 0) goto L5b
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = com.bytedance.sdk.openadsdk.utils.e.f13567g
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L5b
            long r0 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.sdk.openadsdk.utils.e.f13567g = r0
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L57
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L5b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L57
            r2 = 20
            r3 = 55
            if (r1 < r2) goto L33
            boolean r0 = r0.isInteractive()     // Catch: java.lang.Throwable -> L57
            r1 = 0
            goto L51
        L33:
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> L57
        L37:
            r1 = 73
            r2 = 16
        L3b:
            switch(r1) {
                case 72: goto L5b;
                case 73: goto L49;
                case 74: goto L3f;
                default: goto L3e;
            }     // Catch: java.lang.Throwable -> L57
        L3e:
            goto L54
        L3f:
            switch(r2) {
                case 52: goto L54;
                case 53: goto L43;
                case 54: goto L37;
                default: goto L42;
            }     // Catch: java.lang.Throwable -> L57
        L42:
            goto L50
        L43:
            switch(r3) {
                case 29: goto L37;
                case 30: goto L54;
                case 31: goto L3f;
                default: goto L46;
            }     // Catch: java.lang.Throwable -> L57
        L46:
            r3 = 30
            goto L43
        L49:
            r1 = 57
            if (r2 > r1) goto L50
            com.bytedance.sdk.openadsdk.utils.e.f13566f = r0     // Catch: java.lang.Throwable -> L57
            goto L5b
        L50:
            r1 = r2
        L51:
            com.bytedance.sdk.openadsdk.utils.e.f13566f = r0     // Catch: java.lang.Throwable -> L57
            r2 = r1
        L54:
            r1 = 72
            goto L3b
        L57:
            r0 = move-exception
            r0.printStackTrace()
        L5b:
            boolean r0 = com.bytedance.sdk.openadsdk.utils.e.f13566f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.e.a():boolean");
    }

    public static int b() {
        return com.bytedance.sdk.openadsdk.core.c.a(com.bytedance.sdk.openadsdk.core.m.a()).b("limit_ad_track", -1);
    }

    private static void b(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        if (com.bytedance.sdk.openadsdk.core.m.h().p("gaid")) {
            jSONObject.put("gaid", s3.a.a().c());
        }
    }

    public static boolean b(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (Build.VERSION.SDK_INT >= 21) {
            String languageTag = Locale.getDefault().toLanguageTag();
            return !TextUtils.isEmpty(languageTag) ? languageTag : "";
        }
        return Locale.getDefault().getLanguage();
    }

    public static boolean c(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float d() {
        int i10 = -1;
        try {
            Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
            if (a10 != null) {
                i10 = Settings.System.getInt(a10.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.e("DeviceUtils", th.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static int d(Context context) {
        if (c(context)) {
            return 3;
        }
        return b(context) ? 2 : 1;
    }

    public static int e() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.m.a().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static JSONObject e(Context context) {
        return a(context, false);
    }

    @Keep
    @JProtect
    public static void f() {
        new f().run();
        Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
        if (a10 != null) {
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("cpu_count", u.h());
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("cpu_max_frequency", u.c(u.h()));
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("cpu_min_frequency", u.d(u.h()));
            String e10 = u.e(a10, "MemTotal");
            if (e10 != null) {
                com.bytedance.sdk.openadsdk.core.c.a(a10).a("total_memory", e10);
            }
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("total_internal_storage", u.i());
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("free_internal_storage", com.bytedance.sdk.component.utils.m.a());
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("total_sdcard_storage", u.j());
            com.bytedance.sdk.openadsdk.core.c.a(a10).a("is_root", u.k() ? 1 : 0);
            if (TextUtils.isEmpty(i(a10))) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    f13561a = "unity";
                } catch (ClassNotFoundException unused) {
                    f13561a = "native";
                }
                com.bytedance.sdk.openadsdk.core.c.a(a10).a("framework_name", f13561a);
            }
            g();
            t(a10);
            f13572l = v(a10);
        }
    }

    public static void f(Context context) {
        if (f13563c) {
            return;
        }
        try {
            b bVar = new b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(bVar, intentFilter);
            f13563c = true;
        } catch (Throwable unused) {
        }
    }

    public static int g(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(Build.VERSION.SDK_INT >= 17 ? context.getContentResolver() : context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.e("DeviceUtils", th.getMessage());
            return -1;
        }
    }

    public static void g() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.m.a().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f13568h = 1;
            } else if (ringerMode == 1) {
                f13568h = 2;
            } else {
                f13568h = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static int h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String i(Context context) {
        if (TextUtils.isEmpty(f13561a)) {
            f13561a = com.bytedance.sdk.openadsdk.core.c.a(context).b("framework_name", "");
        }
        return f13561a;
    }

    public static void j(Context context) {
        if (context != null) {
            a.b(context.getApplicationContext());
        }
    }

    public static void k(Context context) {
        Context applicationContext;
        if (f13565e || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                x(applicationContext);
            } else {
                d.b(applicationContext);
            }
            f13565e = true;
        } catch (Throwable unused) {
        }
    }

    private static int n(Context context) {
        int i10;
        try {
            i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } catch (Throwable unused) {
        }
        if (i10 == 32) {
            return 1;
        }
        return i10 == 16 ? 0 : -1;
    }

    private static int o(Context context) {
        return f13571k;
    }

    private static int p(Context context) {
        return f13568h;
    }

    private static float q(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static int r(Context context) {
        return f13570j;
    }

    private static int s(Context context) {
        return f13572l;
    }

    private static void t(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f13569i = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f13570j = streamVolume;
            f13570j = (int) ((streamVolume / f13569i) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.e.1
            @Override // java.lang.Runnable
            public void run() {
                int unused = e.f13572l = e.v(applicationContext);
            }
        }, 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
            }
            return w(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int w(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "XIAOMI"
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            if (r4 != r2) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            r3 = r2
            goto L32
        L1c:
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L32
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch: java.lang.Throwable -> L33
            r0 = 4
            if (r4 != r0) goto L19
            goto L1a
        L32:
            return r3
        L33:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.e.w(android.content.Context):int");
    }

    private static void x(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.e.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                e.u(applicationContext);
            }
        });
    }
}
