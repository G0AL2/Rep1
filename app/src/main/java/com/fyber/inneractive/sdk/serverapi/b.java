package com.fyber.inneractive.sdk.serverapi;

import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.k;
import com.fyber.inneractive.sdk.util.l;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.z;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final List<Integer> f20191d = Arrays.asList(5);

    /* renamed from: e  reason: collision with root package name */
    public static final List<Integer> f20192e = Arrays.asList(2, 5);

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f20193f = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "application/x-mpegURL");

    /* renamed from: a  reason: collision with root package name */
    public s f20194a;

    /* renamed from: c  reason: collision with root package name */
    public String f20196c = k.j();

    /* renamed from: b  reason: collision with root package name */
    public Location f20195b = z.a.f20363a.a();

    public b(s sVar) {
        this.f20194a = sVar;
    }

    public String a() {
        try {
            return ((TelephonyManager) l.f20301a.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public String b() {
        int i10 = k.f20293c;
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public String c() {
        if (!n() || this.f20195b.getAccuracy() == 0.0d) {
            return null;
        }
        return String.valueOf(this.f20195b.getAccuracy());
    }

    public String d() {
        if (n()) {
            return String.valueOf(this.f20195b.getLatitude());
        }
        return null;
    }

    public String e() {
        if (n()) {
            return String.valueOf(this.f20195b.getLongitude());
        }
        return null;
    }

    public String f() {
        double d10;
        double d11;
        double d12;
        if (n()) {
            Location location = this.f20195b;
            if (Build.VERSION.SDK_INT < 17) {
                long currentTimeMillis = System.currentTimeMillis();
                long time = location.getTime();
                if (time > 0 && currentTimeMillis > 0) {
                    d10 = currentTimeMillis - time;
                    d11 = 1000.0d;
                    d12 = d10 / d11;
                }
                d12 = 0.0d;
            } else {
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
                if (elapsedRealtimeNanos > 0 && elapsedRealtimeNanos2 > 0) {
                    d10 = elapsedRealtimeNanos - elapsedRealtimeNanos2;
                    d11 = 1.0E9d;
                    d12 = d10 / d11;
                }
                d12 = 0.0d;
            }
            if (d12 >= 0.0d) {
                return String.format(Locale.ENGLISH, "%.2f", Double.valueOf(d12));
            }
            return null;
        }
        return null;
    }

    public String g() {
        if (n()) {
            float verticalAccuracyMeters = Build.VERSION.SDK_INT >= 26 ? this.f20195b.getVerticalAccuracyMeters() : 0.0f;
            if (verticalAccuracyMeters != 0.0d) {
                return String.valueOf(verticalAccuracyMeters);
            }
        }
        return null;
    }

    public String h() {
        String str = this.f20196c;
        return str == null ? "" : str.substring(0, Math.min(3, str.length()));
    }

    public String i() {
        String str = this.f20196c;
        return str == null ? "" : str.substring(Math.min(3, str.length()));
    }

    public String j() {
        return l.f20301a.getPackageName();
    }

    public String k() {
        try {
            return l.f20301a.getPackageManager().getPackageInfo(l.f20301a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public int l() {
        return l.c(l.d());
    }

    public int m() {
        return l.c(l.e());
    }

    public boolean n() {
        return this.f20195b != null;
    }

    public boolean o() {
        return (r.a() ^ true) || IAConfigManager.J.f16882r;
    }

    public String a(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('-');
        sb2.append("Android");
        sb2.append('-');
        sb2.append("8.1.5");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        return sb2.toString();
    }

    public void a(Map<String, String> map, String str) {
        String str2;
        HashMap<String, Integer> hashMap = a.f20189a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str2 = "unity3d";
        } catch (Throwable unused) {
            str2 = "native";
        }
        map.put("frmn", str2);
        map.put("dsk_t", com.fyber.inneractive.sdk.util.s.a(a.f()));
        map.put("dsk_a", com.fyber.inneractive.sdk.util.s.a(a.d()));
        map.put("headset", a(a.m()));
        map.put("is_muted", a(a.k()));
        map.put("btry_c", a(a.j()));
        map.put("btry_l", a.a());
        map.put("bt_con", a(a.h()));
        map.put("tod", com.fyber.inneractive.sdk.util.s.a(a.e()));
        map.put("apnm", a(a.g()));
        map.put("dnd", a(a.l()));
        IAConfigManager iAConfigManager = IAConfigManager.J;
        map.put("lng", iAConfigManager.f16880p);
        String a10 = iAConfigManager.f16888x.a(a.a(str), "LAST_DOMAIN_SHOWED");
        if (!TextUtils.isEmpty(a10) && a10.contains(",")) {
            a10 = a10.split(",")[0];
        }
        map.put("ldomain", a10);
        map.put("lbundle", iAConfigManager.f16888x.a(a.a(str), "LAST_APP_BUNDLE_ID"));
        String a11 = iAConfigManager.f16888x.a(a.a(str), "LAST_CLICKED");
        if (TextUtils.equals(a11, "0")) {
            a11 = "";
        }
        map.put("lclick", a11);
        String a12 = iAConfigManager.f16888x.a(a.a(str), "LAST_VAST_SKIPED");
        if (TextUtils.equals(a12, "0")) {
            a12 = "";
        }
        map.put("v_lskip", a12);
        UnitDisplayType a13 = a.a(str);
        map.put("v_lclicktype", a13.isFullscreenUnit() ? iAConfigManager.f16888x.a(a13, "LAST_VAST_CLICKED_TYPE") : "");
        map.put("sdur", com.fyber.inneractive.sdk.util.s.a(a.b()));
        map.put("userid", IAConfigManager.e());
        map.put("low_power_mode", a(a.n()));
        map.put("dark_mode", a(a.i()));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    public static String a(Boolean bool) {
        return bool == null ? "" : bool.booleanValue() ? "1" : "0";
    }

    public String a(Intent intent) {
        return a.a((intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1));
    }
}
