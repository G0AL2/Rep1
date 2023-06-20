package com.google.android.ads.mediationtestsuite.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.ads.mediationtestsuite.dataobjects.AdManagerProductTheme;
import com.google.android.ads.mediationtestsuite.dataobjects.AdMobProductTheme;
import com.google.android.ads.mediationtestsuite.dataobjects.ProductTheme;
import com.google.android.gms.ads.AdRequest;
import java.util.UUID;

/* compiled from: TestSuiteState.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: g  reason: collision with root package name */
    private static final String f20936g = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    private static k f20937h;

    /* renamed from: a  reason: collision with root package name */
    private String f20938a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20939b;

    /* renamed from: c  reason: collision with root package name */
    private String f20940c;

    /* renamed from: d  reason: collision with root package name */
    private String f20941d;

    /* renamed from: e  reason: collision with root package name */
    private ProductTheme f20942e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20943f;

    private k() {
    }

    public static ProductTheme d() {
        return s().e();
    }

    private ProductTheme e() {
        if (this.f20942e == null) {
            if (this.f20939b) {
                this.f20942e = new AdManagerProductTheme();
            } else {
                this.f20942e = new AdMobProductTheme();
            }
        }
        return this.f20942e;
    }

    public static boolean i() {
        return s().f20939b;
    }

    private boolean j(Context context) {
        return new AdRequest.Builder().build().isTestDevice(context);
    }

    public static boolean k(Context context) {
        return context.getSharedPreferences("com.google.android.gms.ads.SHARED_PREFS", 0).getBoolean("com.google.android.gms.ads.TEST_DEVICE", false);
    }

    public static boolean l(Context context) {
        return k(context) || s().j(context);
    }

    public static void p(Context context, String str, boolean z10) {
        String h10 = c.h(context);
        if (h10 == null || !h10.equals(str)) {
            return;
        }
        SharedPreferences.Editor edit = e.k().getSharedPreferences("com.google.android.gms.ads.SHARED_PREFS", 0).edit();
        edit.putBoolean("com.google.android.gms.ads.TEST_DEVICE", z10);
        edit.apply();
    }

    public static k s() {
        if (f20937h == null) {
            f20937h = new k();
        }
        return f20937h;
    }

    public static boolean t(Context context) {
        return (s().f20943f || k(context)) ? false : true;
    }

    public static void u() {
        s().f20943f = true;
    }

    public String a(Context context) {
        return context.getPackageName();
    }

    public String b() {
        return this.f20940c;
    }

    public String c() {
        return this.f20938a;
    }

    public String f() {
        return f20936g;
    }

    public String g() {
        return "3.0.0";
    }

    public String h() {
        if (this.f20941d == null) {
            return "mediationtestsuite_android";
        }
        return "mediationtestsuite_android_" + this.f20941d;
    }

    public boolean m() {
        String str = this.f20941d;
        return str != null && str.contains("unity");
    }

    public void n() {
        e.w();
        f20937h = null;
    }

    public void o(boolean z10) {
        if (z10 != this.f20939b) {
            this.f20939b = z10;
            this.f20942e = null;
        }
    }

    public void q(String str) {
        this.f20938a = str;
    }

    public void r(String str) {
        this.f20941d = str;
    }
}
