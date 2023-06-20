package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.impl.m0;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l2 {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f14148a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f14149b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReference<com.chartboost.sdk.Model.e> f14150c;

    /* renamed from: d  reason: collision with root package name */
    public final u2 f14151d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14152e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14153f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14154g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14155h;

    /* renamed from: i  reason: collision with root package name */
    public String f14156i;

    /* renamed from: j  reason: collision with root package name */
    public String f14157j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14158k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14159l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14160m;

    /* renamed from: n  reason: collision with root package name */
    public final String f14161n;

    /* renamed from: o  reason: collision with root package name */
    public final JSONObject f14162o;

    /* renamed from: p  reason: collision with root package name */
    public final String f14163p;

    /* renamed from: q  reason: collision with root package name */
    public final String f14164q;

    /* renamed from: r  reason: collision with root package name */
    public final h2 f14165r;

    /* renamed from: s  reason: collision with root package name */
    private final p2 f14166s;

    /* renamed from: t  reason: collision with root package name */
    private final Context f14167t;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14168a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f14169b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f14170c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f14171d = 0;

        /* renamed from: e  reason: collision with root package name */
        public float f14172e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public String f14173f = "";
    }

    public l2(Context context, String str, m0 m0Var, r0 r0Var, AtomicReference<com.chartboost.sdk.Model.e> atomicReference, SharedPreferences sharedPreferences, u2 u2Var, c1 c1Var, p2 p2Var, h2 h2Var) {
        String str2;
        this.f14167t = context;
        this.f14148a = m0Var;
        this.f14149b = r0Var;
        this.f14150c = atomicReference;
        this.f14151d = u2Var;
        this.f14166s = p2Var;
        this.f14165r = h2Var;
        this.f14159l = str;
        String str3 = Build.PRODUCT;
        if (!"sdk".equals(str3) && !"google_sdk".equals(str3) && ((str2 = Build.MANUFACTURER) == null || !str2.contains("Genymotion"))) {
            this.f14152e = Build.MODEL;
        } else {
            this.f14152e = "Android Simulator";
        }
        this.f14160m = Build.MANUFACTURER + " " + Build.MODEL;
        this.f14161n = i1.d(context);
        this.f14153f = "Android " + Build.VERSION.RELEASE;
        this.f14154g = Locale.getDefault().getCountry();
        this.f14155h = Locale.getDefault().getLanguage();
        this.f14158k = "8.4.3";
        try {
            String packageName = context.getPackageName();
            this.f14156i = context.getPackageManager().getPackageInfo(packageName, 128).versionName;
            this.f14157j = packageName;
        } catch (Exception e10) {
            CBLogging.a("RequestBody", "Exception raised getting package mager object", e10);
        }
        b1 a10 = a(context, c1Var);
        this.f14163p = a(a10);
        this.f14162o = a(a10, c1Var);
        this.f14164q = CBUtility.a();
        r0Var.a(context);
    }

    public int a() {
        return this.f14149b.a(this.f14167t);
    }

    public int b() {
        return this.f14149b.b();
    }

    public String c() {
        return this.f14149b.a();
    }

    public a d() {
        a aVar = new a();
        Context context = this.f14167t;
        if (context == null) {
            return aVar;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        aVar.f14168a = displayMetrics.widthPixels;
        aVar.f14169b = displayMetrics.heightPixels;
        DisplayMetrics displayMetrics2 = (DisplayMetrics) o1.a().a(new DisplayMetrics());
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) this.f14167t.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        }
        aVar.f14170c = displayMetrics2.widthPixels;
        aVar.f14171d = displayMetrics2.heightPixels;
        aVar.f14172e = displayMetrics2.density;
        aVar.f14173f = "" + displayMetrics2.densityDpi;
        return aVar;
    }

    public m0.a e() {
        return this.f14148a.c(this.f14167t);
    }

    public int f() {
        return this.f14165r.a();
    }

    public Integer g() {
        COPPA coppa = (COPPA) this.f14165r.a(COPPA.COPPA_STANDARD);
        if (coppa != null) {
            return Integer.valueOf(coppa.getConsentBooleanAsInt());
        }
        return null;
    }

    public int h() {
        return this.f14165r.b();
    }

    public JSONObject i() {
        return this.f14165r.c();
    }

    public p2 j() {
        return this.f14166s;
    }

    public int k() {
        p2 p2Var = this.f14166s;
        if (p2Var != null) {
            return p2Var.c();
        }
        return -1;
    }

    public List<DataUseConsent> l() {
        return this.f14165r.d();
    }

    public boolean m() {
        return CBUtility.b(CBUtility.a(this.f14167t));
    }

    private String a(b1 b1Var) {
        return b1Var != null ? b1Var.d() : "";
    }

    private JSONObject a(b1 b1Var, c1 c1Var) {
        if (b1Var != null && c1Var != null) {
            return a(b1Var, new d1());
        }
        return new JSONObject();
    }

    private b1 a(Context context, c1 c1Var) {
        if (c1Var != null) {
            return c1Var.a(context);
        }
        return null;
    }

    public JSONObject a(b1 b1Var, d1 d1Var) {
        if (d1Var != null) {
            return d1Var.a(b1Var);
        }
        return new JSONObject();
    }
}
