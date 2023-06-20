package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import androidx.recyclerview.widget.RecyclerView;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PublisherProvidedUserInfoDao.java */
/* loaded from: classes3.dex */
public final class ig {

    /* renamed from: a  reason: collision with root package name */
    private static int f25754a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f25755b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f25756c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f25757d = null;

    /* renamed from: e  reason: collision with root package name */
    private static String f25758e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f25759f = null;

    /* renamed from: g  reason: collision with root package name */
    private static String f25760g = null;

    /* renamed from: h  reason: collision with root package name */
    private static String f25761h = null;

    /* renamed from: i  reason: collision with root package name */
    private static int f25762i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private static String f25763j;

    /* renamed from: k  reason: collision with root package name */
    private static String f25764k;

    /* renamed from: l  reason: collision with root package name */
    private static String f25765l;

    /* renamed from: m  reason: collision with root package name */
    private static String f25766m;

    /* renamed from: n  reason: collision with root package name */
    private static Location f25767n;

    public static void a() {
        a(f25754a);
        a(f25756c);
        b(f25757d);
        c(f25758e);
        d(f25759f);
        e(f25760g);
        f(f25761h);
        b(f25762i);
        g(f25763j);
        h(f25764k);
        i(f25765l);
        j(f25766m);
        a(f25767n);
        e();
        b();
        f();
        g();
        h();
        i();
        j();
        k();
        l();
        m();
        n();
        o();
        p();
        c();
    }

    public static boolean b() {
        Context c10 = ho.c();
        if (c10 != null) {
            f25755b = hf.a(c10, "user_info_store").b("user_age_restricted", false);
        }
        return f25755b;
    }

    public static void c(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25758e = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_post_code", str);
            }
        }
    }

    public static void d(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25759f = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_city_code", str);
            }
        }
    }

    private static int e() {
        int i10 = f25754a;
        int i11 = RecyclerView.UNDEFINED_DURATION;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        Context c10 = ho.c();
        if (c10 != null) {
            i11 = hf.a(c10, "user_info_store").c("user_age");
        }
        f25754a = i11;
        return i11;
    }

    private static String f() {
        String str = f25756c;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_age_group");
        f25756c = b10;
        return b10;
    }

    private static String g() {
        String str = f25757d;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_area_code");
        f25757d = b10;
        return b10;
    }

    private static String h() {
        String str = f25758e;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_post_code");
        f25758e = b10;
        return b10;
    }

    private static String i() {
        String str = f25759f;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_city_code");
        f25759f = b10;
        return b10;
    }

    private static String j() {
        String str = f25760g;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_state_code");
        f25760g = b10;
        return b10;
    }

    private static String k() {
        String str = f25761h;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_country_code");
        f25761h = b10;
        return b10;
    }

    private static int l() {
        int i10 = f25762i;
        int i11 = RecyclerView.UNDEFINED_DURATION;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        Context c10 = ho.c();
        if (c10 != null) {
            i11 = hf.a(c10, "user_info_store").c("user_yob");
        }
        f25762i = i11;
        return i11;
    }

    private static String m() {
        String str = f25763j;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_gender");
        f25763j = b10;
        return b10;
    }

    private static String n() {
        String str = f25764k;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_education");
        f25764k = b10;
        return b10;
    }

    private static String o() {
        String str = f25765l;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_language");
        f25765l = b10;
        return b10;
    }

    private static String p() {
        String str = f25766m;
        if (str != null) {
            return str;
        }
        Context c10 = ho.c();
        String b10 = c10 == null ? null : hf.a(c10, "user_info_store").b("user_interest");
        f25766m = b10;
        return b10;
    }

    public static Location c() {
        String b10;
        Location location = f25767n;
        if (location != null) {
            return location;
        }
        Context c10 = ho.c();
        Location location2 = null;
        if (c10 == null || (b10 = hf.a(c10, "user_info_store").b("user_location")) == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] split = b10.split(",");
            location3.setLatitude(Double.parseDouble(split[0]));
            location3.setLongitude(Double.parseDouble(split[1]));
            location3.setAccuracy(Float.parseFloat(split[2]));
            location3.setTime(Long.parseLong(split[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f25767n = location2;
        return location2;
    }

    public static HashMap<String, String> d() {
        HashMap<String, String> hashMap = new HashMap<>();
        int e10 = e();
        if (e10 > 0) {
            hashMap.put("u-age", String.valueOf(e10));
        }
        int l10 = l();
        if (l10 > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(l10));
        }
        String i10 = i();
        String j10 = j();
        String k10 = k();
        String trim = (i10 == null || i10.trim().length() == 0) ? "" : i10.trim();
        if (j10 != null && j10.trim().length() != 0) {
            trim = trim + Constants.FILENAME_SEQUENCE_SEPARATOR + j10.trim();
        }
        if (k10 != null && k10.trim().length() != 0) {
            trim = trim + Constants.FILENAME_SEQUENCE_SEPARATOR + k10.trim();
        }
        if (trim != null && trim.trim().length() != 0) {
            hashMap.put("u-location", trim);
        }
        String f10 = f();
        if (f10 != null) {
            hashMap.put("u-agegroup", f10.toLowerCase(Locale.ENGLISH));
        }
        String g10 = g();
        if (g10 != null) {
            hashMap.put("u-areacode", g10);
        }
        String h10 = h();
        if (h10 != null) {
            hashMap.put("u-postalcode", h10);
        }
        String m10 = m();
        if (m10 != null) {
            hashMap.put("u-gender", m10);
        }
        String n10 = n();
        if (n10 != null) {
            hashMap.put("u-education", n10);
        }
        String o10 = o();
        if (o10 != null) {
            hashMap.put("u-language", o10);
        }
        String p10 = p();
        if (p10 != null) {
            hashMap.put("u-interests", p10);
        }
        hashMap.put("u-age-restricted", String.valueOf(b() ? 1 : 0));
        return hashMap;
    }

    public static void b(String str) {
        Context c10 = ho.c();
        f25757d = str;
        if (c10 == null || str == null) {
            return;
        }
        hf.a(c10, "user_info_store").a("user_area_code", str);
    }

    public static void e(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25760g = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_state_code", str);
            }
        }
    }

    public static void f(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25761h = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_country_code", str);
            }
        }
    }

    public static void g(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25763j = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_gender", str);
            }
        }
    }

    public static void h(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25764k = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_education", str);
            }
        }
    }

    public static void i(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25765l = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_language", str);
            }
        }
    }

    public static void j(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25766m = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_interest", str);
            }
        }
    }

    public static void b(int i10) {
        Context c10 = ho.c();
        if (i10 != Integer.MIN_VALUE) {
            f25762i = i10;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_yob", i10);
            }
        }
    }

    private static String b(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }

    public static void a(int i10) {
        Context c10 = ho.c();
        if (i10 != Integer.MIN_VALUE) {
            f25754a = i10;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_age", i10);
            }
        }
    }

    public static void a(boolean z10) {
        Context c10 = ho.c();
        f25755b = z10;
        if (c10 != null) {
            hf.a(c10, "user_info_store").a("user_age_restricted", z10);
        }
    }

    public static void a(String str) {
        Context c10 = ho.c();
        if (str != null) {
            f25756c = str;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_age_group", str);
            }
        }
    }

    public static void a(Location location) {
        Context c10 = ho.c();
        if (location != null) {
            f25767n = location;
            if (c10 != null) {
                hf.a(c10, "user_info_store").a("user_location", b(location));
            }
        }
    }
}
