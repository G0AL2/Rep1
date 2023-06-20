package com.ironsource.sdk.a;

import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static a f27583a = new a(2001, a("initsdk"));

    /* renamed from: b  reason: collision with root package name */
    public static a f27584b = new a(2002, a("createcontrollerweb"));

    /* renamed from: c  reason: collision with root package name */
    public static a f27585c = new a(2003, a("createcontrollernative"));

    /* renamed from: d  reason: collision with root package name */
    public static a f27586d = new a(2004, a("controllerstageready"));

    /* renamed from: e  reason: collision with root package name */
    public static a f27587e = new a(IronSourceConstants.IS_INSTANCE_OPENED, a("loadad"));

    /* renamed from: f  reason: collision with root package name */
    public static a f27588f = new a(2006, a("loadadfailed"));

    /* renamed from: g  reason: collision with root package name */
    public static a f27589g = new a(2007, a("initproduct"));

    /* renamed from: h  reason: collision with root package name */
    public static a f27590h = new a(AdError.REMOTE_ADS_SERVICE_ERROR, a("initproductfailed"));

    /* renamed from: i  reason: collision with root package name */
    public static a f27591i = new a(AdError.INTERSTITIAL_AD_TIMEOUT, a("loadproduct"));

    /* renamed from: j  reason: collision with root package name */
    public static a f27592j = new a(2010, a("parseadmfailed"));

    /* renamed from: k  reason: collision with root package name */
    public static a f27593k = new a(2011, a("loadadsuccess"));

    /* renamed from: l  reason: collision with root package name */
    public static a f27594l = new a(2013, a("controllerfailed"));

    /* renamed from: m  reason: collision with root package name */
    public static a f27595m;

    /* renamed from: n  reason: collision with root package name */
    public static a f27596n;

    /* renamed from: o  reason: collision with root package name */
    public static a f27597o;

    /* renamed from: p  reason: collision with root package name */
    public static a f27598p;

    /* renamed from: q  reason: collision with root package name */
    public static a f27599q;

    /* renamed from: r  reason: collision with root package name */
    public static a f27600r;

    /* renamed from: s  reason: collision with root package name */
    public static a f27601s;

    /* renamed from: t  reason: collision with root package name */
    public static a f27602t;

    /* renamed from: u  reason: collision with root package name */
    public static a f27603u;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f27604a;

        /* renamed from: b  reason: collision with root package name */
        int f27605b;

        a(int i10, String str) {
            this.f27605b = i10;
            this.f27604a = str;
        }
    }

    static {
        new a(2014, a("extractinstalledpackagesfailed"));
        f27595m = new a(2015, a("appendnativefeaturesdatafailed"));
        f27596n = new a(2016, a("adunitcouldnotloadtowebview"));
        f27597o = new a(2017, a("webviewcleanupfailed"));
        f27598p = new a(2018, a("removewebviewfailed"));
        new a(2019, a("adunitcouldnotloadtowebviewbanners"));
        new a(2020, a("banneralreadydestroyed"));
        f27599q = new a(2021, a("fialedregactlifecycle"));
        f27600r = new a(2022, a("loadcontrollerhtml"));
        f27601s = new a(2023, a("controllerhtmlsuccess"));
        f27602t = new a(2024, a("controllerhtmlfailed"));
        f27603u = new a(2025, a("webviewcrashrpg"));
    }

    private static String a(String str) {
        return "n_" + str;
    }
}
