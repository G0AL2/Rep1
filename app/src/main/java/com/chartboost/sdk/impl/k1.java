package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.impl.m0;
import java.util.Locale;

/* loaded from: classes.dex */
public class k1 {
    private boolean A;
    private int B;
    private long C;
    private long D;
    private int E;
    private int F;
    private int G;
    private long H;

    /* renamed from: a  reason: collision with root package name */
    private String f14112a;

    /* renamed from: b  reason: collision with root package name */
    private int f14113b;

    /* renamed from: c  reason: collision with root package name */
    private String f14114c;

    /* renamed from: d  reason: collision with root package name */
    private String f14115d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14116e;

    /* renamed from: f  reason: collision with root package name */
    private String f14117f;

    /* renamed from: g  reason: collision with root package name */
    private String f14118g;

    /* renamed from: h  reason: collision with root package name */
    private String f14119h;

    /* renamed from: i  reason: collision with root package name */
    private String f14120i;

    /* renamed from: j  reason: collision with root package name */
    private String f14121j;

    /* renamed from: k  reason: collision with root package name */
    private String f14122k;

    /* renamed from: l  reason: collision with root package name */
    private String f14123l;

    /* renamed from: m  reason: collision with root package name */
    private String f14124m;

    /* renamed from: n  reason: collision with root package name */
    private String f14125n;

    /* renamed from: o  reason: collision with root package name */
    private String f14126o;

    /* renamed from: p  reason: collision with root package name */
    private String f14127p;

    /* renamed from: q  reason: collision with root package name */
    private String f14128q;

    /* renamed from: r  reason: collision with root package name */
    private String f14129r;

    /* renamed from: s  reason: collision with root package name */
    private String f14130s;

    /* renamed from: t  reason: collision with root package name */
    private String f14131t;

    /* renamed from: u  reason: collision with root package name */
    private String f14132u;

    /* renamed from: v  reason: collision with root package name */
    private String f14133v;

    /* renamed from: w  reason: collision with root package name */
    private String f14134w;

    /* renamed from: x  reason: collision with root package name */
    private int f14135x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f14136y;

    /* renamed from: z  reason: collision with root package name */
    private int f14137z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14138a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f14139b;

        protected a() {
        }
    }

    private static String E() {
        return "Amazon".equalsIgnoreCase(Build.MANUFACTURER) ? "Amazon" : "Android";
    }

    private static String L() {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleList.getDefault().get(0).getLanguage();
        }
        return Locale.getDefault().getLanguage();
    }

    public String A() {
        return this.f14129r;
    }

    public String B() {
        return this.f14125n;
    }

    public String C() {
        return this.f14127p;
    }

    public String D() {
        return this.f14126o;
    }

    public int F() {
        return this.f14113b;
    }

    public long G() {
        return this.H;
    }

    public String H() {
        return this.f14112a;
    }

    public int I() {
        return this.G;
    }

    public int J() {
        return this.E;
    }

    public int K() {
        return this.F;
    }

    public String a() {
        return this.f14114c;
    }

    public void b(String str) {
        this.f14118g = str;
    }

    public boolean c() {
        return this.f14116e;
    }

    public void d(int i10) {
        this.f14113b = i10;
    }

    public void e(String str) {
        this.f14115d = str;
    }

    public String f() {
        return this.f14117f;
    }

    public String g() {
        return this.f14115d;
    }

    public void h(String str) {
        this.f14120i = str;
    }

    public void i(String str) {
        this.f14131t = str;
    }

    public void j(String str) {
        this.f14121j = str;
    }

    public String k() {
        return this.f14133v;
    }

    public void l(String str) {
        this.f14122k = str;
    }

    public String m() {
        return this.f14120i;
    }

    public String n() {
        return this.f14131t;
    }

    public long o() {
        return this.D;
    }

    public String p() {
        return this.f14121j;
    }

    public boolean q() {
        return this.A;
    }

    public String r() {
        return this.f14134w;
    }

    public String s() {
        return this.f14122k;
    }

    public String t() {
        return this.f14123l;
    }

    public String toString() {
        return "Environment{session_id=" + this.f14112a + ", session_count=" + this.f14113b + "', app_id='" + this.f14114c + "', chartboost_sdk_version='" + this.f14115d + "', chartboost_sdk_autocache_enabled=" + this.f14116e + ", chartboost_sdk_gdpr='" + this.f14117f + "', chartboost_sdk_ccpa='" + this.f14118g + "', device_id='" + this.f14120i + "', device_model='" + this.f14121j + "', device_os_version='" + this.f14122k + "', device_platform='" + this.f14123l + "', device_country='" + this.f14124m + "', device_language='" + this.f14131t + "', device_timezone='" + this.f14132u + "', device_connection_type='" + this.f14133v + "', device_orientation='" + this.f14134w + "', device_battery_level='" + this.f14135x + "', device_charging_status='" + this.f14136y + "', device_volume='" + this.f14137z + "', device_mute='" + this.A + "', device_audio_output=" + this.B + ", device_storage='" + this.C + "', device_low_memory_warning='" + this.D + "', device_up_time='" + w() + "', session_impression_interstitial_count='" + this.E + "', session_impression_rewarded_count='" + this.F + "', session_impression_banner_count='" + this.G + "', session_duration='" + this.H + "'}";
    }

    public void u(String str) {
        this.f14112a = str;
    }

    public String v() {
        return this.f14132u;
    }

    public long w() {
        return SystemClock.uptimeMillis();
    }

    public int x() {
        return this.f14137z;
    }

    public String y() {
        return this.f14128q;
    }

    public String z() {
        return this.f14130s;
    }

    public void a(String str) {
        this.f14114c = str;
    }

    public void b(int i10) {
        this.f14135x = i10;
    }

    public void c(String str) {
        this.f14119h = str;
    }

    public void d(String str) {
        this.f14117f = str;
    }

    public String e() {
        return this.f14119h;
    }

    public void f(String str) {
        this.f14133v = str;
    }

    public void g(String str) {
        this.f14124m = str;
    }

    public int h() {
        return this.B;
    }

    public int i() {
        return this.f14135x;
    }

    public boolean j() {
        return this.f14136y;
    }

    public void k(String str) {
        this.f14134w = str;
    }

    public String l() {
        return this.f14124m;
    }

    public void m(String str) {
        this.f14123l = str;
    }

    public void n(String str) {
        this.f14132u = str;
    }

    public void o(String str) {
        this.f14128q = str;
    }

    public void p(String str) {
        this.f14130s = str;
    }

    public void q(String str) {
        this.f14129r = str;
    }

    public void r(String str) {
        this.f14125n = str;
    }

    public void s(String str) {
        this.f14127p = str;
    }

    public void t(String str) {
        this.f14126o = str;
    }

    public long u() {
        return this.C;
    }

    public void a(boolean z10) {
        this.f14116e = z10;
    }

    public void b(boolean z10) {
        this.f14136y = z10;
    }

    public void c(int i10) {
        this.f14137z = i10;
    }

    public String d() {
        return this.f14118g;
    }

    public void e(int i10) {
        this.G = i10;
    }

    public void f(int i10) {
        this.E = i10;
    }

    public void g(int i10) {
        this.F = i10;
    }

    private static a d(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            try {
                BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
                if (batteryManager != null) {
                    int intProperty = batteryManager.getIntProperty(4);
                    boolean isCharging = i10 >= 23 ? batteryManager.isCharging() : false;
                    a aVar = new a();
                    aVar.f14138a = intProperty;
                    aVar.f14139b = isCharging;
                    return aVar;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private static long e(Context context) {
        try {
            String file = context.getCacheDir().toString();
            return new StatFs(file + "/.chartboost").getAvailableBytes();
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static boolean f(Context context) {
        AudioManager a10 = a(context);
        return (a10 == null || a10.getRingerMode() == 2) ? false : true;
    }

    public void a(int i10) {
        this.B = i10;
    }

    public void b(long j10) {
        this.C = j10;
    }

    public void c(boolean z10) {
        this.A = z10;
    }

    private static int b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 23) {
                return audioManager.isSpeakerphoneOn() ? 0 : 3;
            }
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            if (devices.length > 0) {
                AudioDeviceInfo audioDeviceInfo = devices[0];
                if (audioDeviceInfo.getType() == 2) {
                    return 0;
                }
                if (audioDeviceInfo.getType() == 4) {
                    return 1;
                }
                return audioDeviceInfo.getType() == 8 ? 2 : 3;
            }
        }
        return 0;
    }

    public void a(long j10) {
        this.D = j10;
    }

    public void c(long j10) {
        this.H = j10;
    }

    public static k1 a(Context context, m0.a aVar, p2 p2Var, String str) {
        String str2;
        int i10;
        int i11;
        k1 k1Var = new k1();
        if (context == null) {
            return k1Var;
        }
        int i12 = -1;
        long j10 = -1;
        int i13 = 0;
        if (p2Var != null) {
            try {
                String e10 = p2Var.e();
                int c10 = p2Var.c();
                i13 = p2Var.b(0);
                int b10 = p2Var.b(1);
                int b11 = p2Var.b(2);
                long d10 = p2Var.d();
                str2 = e10;
                i12 = c10;
                i10 = b10;
                j10 = d10;
                i11 = b11;
            } catch (Exception unused) {
            }
        } else {
            str2 = "";
            i10 = 0;
            i11 = 0;
        }
        k1Var.u(str2);
        k1Var.d(i12);
        k1Var.a(com.chartboost.sdk.g.f13885j);
        k1Var.e("8.4.3");
        k1Var.a(com.chartboost.sdk.g.f13889n);
        DataUseConsent a10 = com.chartboost.sdk.f.a(context).a(CCPA.CCPA_STANDARD);
        if (a10 != null) {
            k1Var.b((String) a10.getConsent());
        }
        DataUseConsent a11 = com.chartboost.sdk.f.a(context).a("gdpr");
        if (a11 != null) {
            k1Var.d((String) a11.getConsent());
        } else {
            k1Var.d("-1");
        }
        DataUseConsent a12 = com.chartboost.sdk.f.a(context).a(COPPA.COPPA_STANDARD);
        if (a12 != null) {
            k1Var.c(a12.getConsent().toString());
        } else {
            k1Var.c("");
        }
        a d11 = d(context);
        if (d11 != null) {
            k1Var.b(d11.f14138a);
            k1Var.b(d11.f14139b);
        }
        k1Var.h(a(aVar));
        k1Var.g(Locale.getDefault().getCountry());
        k1Var.f(str);
        k1Var.i(L());
        k1Var.j(Build.MODEL);
        k1Var.l("Android " + Build.VERSION.RELEASE);
        k1Var.m(E());
        k1Var.k(CBUtility.b(context));
        k1Var.n(CBUtility.a());
        k1Var.b(e(context));
        k1Var.a(b());
        k1Var.c(c(context));
        k1Var.c(f(context));
        k1Var.a(b(context));
        Chartboost.CBFramework cBFramework = com.chartboost.sdk.g.f13880e;
        if (cBFramework != null) {
            k1Var.o(cBFramework.name());
            k1Var.p(com.chartboost.sdk.g.f13882g);
            k1Var.q(com.chartboost.sdk.g.f13881f);
        }
        MediationModel mediationModel = com.chartboost.sdk.g.f13884i;
        if (mediationModel != null) {
            k1Var.r(mediationModel.getMediation());
            k1Var.t(mediationModel.getMediationVersion());
            k1Var.s(mediationModel.getAdapterVersion());
        }
        k1Var.f(i13);
        k1Var.g(i10);
        k1Var.e(i11);
        k1Var.c(j10);
        return k1Var;
    }

    private static int c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            return (int) ((audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) * 100.0f);
        }
        return -1;
    }

    private static long b() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / 1048576;
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static String a(m0.a aVar) {
        if (aVar != null) {
            String str = aVar.f14190d;
            return str == null ? aVar.f14189c : str;
        }
        return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    }

    private static AudioManager a(Context context) {
        try {
            return (AudioManager) context.getSystemService("audio");
        } catch (Exception unused) {
            return null;
        }
    }
}
