package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.J;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class h implements Runnable {
    private Context E;

    /* renamed from: a  reason: collision with root package name */
    private final String f27440a = h.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final String f27441b = "bundleId";

    /* renamed from: c  reason: collision with root package name */
    private final String f27442c = "advertisingId";

    /* renamed from: d  reason: collision with root package name */
    private final String f27443d = "isLimitAdTrackingEnabled";

    /* renamed from: e  reason: collision with root package name */
    private final String f27444e = "appKey";

    /* renamed from: f  reason: collision with root package name */
    private final String f27445f = "deviceOS";

    /* renamed from: g  reason: collision with root package name */
    private final String f27446g = "osVersion";

    /* renamed from: h  reason: collision with root package name */
    private final String f27447h = "connectionType";

    /* renamed from: i  reason: collision with root package name */
    private final String f27448i = "language";

    /* renamed from: j  reason: collision with root package name */
    private final String f27449j = "deviceOEM";

    /* renamed from: k  reason: collision with root package name */
    private final String f27450k = "deviceModel";

    /* renamed from: l  reason: collision with root package name */
    private final String f27451l = "mobileCarrier";

    /* renamed from: m  reason: collision with root package name */
    private final String f27452m = "externalFreeMemory";

    /* renamed from: n  reason: collision with root package name */
    private final String f27453n = "internalFreeMemory";

    /* renamed from: o  reason: collision with root package name */
    private final String f27454o = "battery";

    /* renamed from: p  reason: collision with root package name */
    private final String f27455p = "gmtMinutesOffset";

    /* renamed from: q  reason: collision with root package name */
    private final String f27456q = "appVersion";

    /* renamed from: r  reason: collision with root package name */
    private final String f27457r = "sessionId";

    /* renamed from: s  reason: collision with root package name */
    private final String f27458s = "pluginType";

    /* renamed from: t  reason: collision with root package name */
    private final String f27459t = "pluginVersion";

    /* renamed from: u  reason: collision with root package name */
    private final String f27460u = "plugin_fw_v";

    /* renamed from: v  reason: collision with root package name */
    private final String f27461v = "jb";

    /* renamed from: w  reason: collision with root package name */
    private final String f27462w = "advertisingIdType";

    /* renamed from: x  reason: collision with root package name */
    private final String f27463x = "mt";

    /* renamed from: y  reason: collision with root package name */
    private final String f27464y = "firstSession";

    /* renamed from: z  reason: collision with root package name */
    private final String f27465z = "mcc";
    private final String A = "mnc";
    private final String B = "icc";
    private final String C = "tz";
    private final String D = "auid";

    private h() {
    }

    public h(Context context) {
        this.E = context.getApplicationContext();
    }

    private static String a() {
        try {
            return ConfigFile.getConfigFile().getPluginType();
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginType()", e10);
            return "";
        }
    }

    private static String b() {
        try {
            return ConfigFile.getConfigFile().getPluginVersion();
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginVersion()", e10);
            return "";
        }
    }

    private static String c() {
        try {
            return ConfigFile.getConfigFile().getPluginFrameworkVersion();
        } catch (Exception e10) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getPluginFrameworkVersion()", e10);
            return "";
        }
    }

    private String d() {
        try {
            return this.E.getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String e() {
        try {
            String str = Build.VERSION.RELEASE;
            int i10 = Build.VERSION.SDK_INT;
            return i10 + "(" + str + ")";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String f() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g() {
        try {
            return Build.MANUFACTURER;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String h() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private String i() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.E.getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                return !networkOperatorName.equals("") ? networkOperatorName : "";
            }
            return "";
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f27440a + ":getMobileCarrier()", e10);
            return "";
        }
    }

    private static boolean j() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Exception unused) {
            return false;
        }
    }

    private static long k() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private int l() {
        try {
            Intent registerReceiver = this.E.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : 0;
            int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : 0;
            if (intExtra == -1 || intExtra2 == -1) {
                return -1;
            }
            return (int) ((intExtra / intExtra2) * 100.0f);
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f27440a + ":getBatteryLevel()", e10);
            return -1;
        }
    }

    private int m() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            return Math.round(((timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()) / 1000) / 60) / 15) * 15;
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, this.f27440a + ":getGmtMinutesOffset()", e10);
            return 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z10;
        long j10;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sessionId", IronSourceUtils.getSessionId());
            String d10 = d();
            if (!TextUtils.isEmpty(d10)) {
                hashMap.put("bundleId", d10);
                String c10 = com.ironsource.environment.c.c(this.E, d10);
                if (!TextUtils.isEmpty(c10)) {
                    hashMap.put("appVersion", c10);
                }
            }
            hashMap.put("appKey", J.a().f26338j);
            String[] C = com.ironsource.environment.h.C(this.E);
            boolean z11 = true;
            String str2 = "";
            if (C == null || C.length != 2) {
                str = "";
                z10 = false;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : "";
                z10 = Boolean.valueOf(C[1]).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                str = com.ironsource.environment.h.x(this.E);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            } else {
                str2 = IronSourceConstants.TYPE_GAID;
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("advertisingId", str);
                hashMap.put("advertisingIdType", str2);
                hashMap.put("isLimitAdTrackingEnabled", Boolean.valueOf(z10));
            }
            hashMap.put("deviceOS", "Android");
            if (!TextUtils.isEmpty(e())) {
                hashMap.put("osVersion", e());
            }
            String connectionType = IronSourceUtils.getConnectionType(this.E);
            if (!TextUtils.isEmpty(connectionType)) {
                hashMap.put("connectionType", connectionType);
            }
            hashMap.put("sdkVersion", IronSourceUtils.getSDKVersion());
            String f10 = f();
            if (!TextUtils.isEmpty(f10)) {
                hashMap.put("language", f10);
            }
            String g10 = g();
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("deviceOEM", g10);
            }
            String h10 = h();
            if (!TextUtils.isEmpty(h10)) {
                hashMap.put("deviceModel", h10);
            }
            String i10 = i();
            if (!TextUtils.isEmpty(i10)) {
                hashMap.put("mobileCarrier", i10);
            }
            hashMap.put("internalFreeMemory", Long.valueOf(k()));
            if (j()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j10 = (statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576;
            } else {
                j10 = -1;
            }
            hashMap.put("externalFreeMemory", Long.valueOf(j10));
            hashMap.put("battery", Integer.valueOf(l()));
            int m10 = m();
            if (m10 > 840 || m10 < -720 || m10 % 15 != 0) {
                z11 = false;
            }
            if (z11) {
                hashMap.put("gmtMinutesOffset", Integer.valueOf(m10));
            }
            String a10 = a();
            if (!TextUtils.isEmpty(a10)) {
                hashMap.put("pluginType", a10);
            }
            String b10 = b();
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put("pluginVersion", b10);
            }
            String c11 = c();
            if (!TextUtils.isEmpty(c11)) {
                hashMap.put("plugin_fw_v", c11);
            }
            String valueOf = String.valueOf(com.ironsource.environment.h.j());
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put("jb", valueOf);
            }
            String str3 = J.a().f26343o;
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put("mt", str3);
            }
            String valueOf2 = String.valueOf(IronSourceUtils.getFirstSession(this.E));
            if (!TextUtils.isEmpty(valueOf2)) {
                hashMap.put("firstSession", valueOf2);
            }
            String y10 = com.ironsource.environment.h.y(this.E);
            if (!TextUtils.isEmpty(y10)) {
                hashMap.put("auid", y10);
            }
            hashMap.put("mcc", Integer.valueOf(a.AnonymousClass1.c(this.E)));
            hashMap.put("mnc", Integer.valueOf(a.AnonymousClass1.d(this.E)));
            String j11 = com.ironsource.environment.h.j(this.E);
            if (!TextUtils.isEmpty(j11)) {
                hashMap.put("icc", j11);
            }
            String c12 = com.ironsource.environment.h.c();
            if (!TextUtils.isEmpty(c12)) {
                hashMap.put("tz", c12);
            }
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("collecting data for events: " + hashMap);
            com.ironsource.mediationsdk.sdk.f.a().a(hashMap);
            IronSourceUtils.saveGeneralProperties(this.E, com.ironsource.mediationsdk.sdk.f.a().b());
        } catch (Exception e10) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "Thread name = " + h.class.getSimpleName(), e10);
        }
    }
}
