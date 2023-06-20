package com.google.ads.mediation.chartboost;

import com.chartboost.sdk.Banner.BannerSize;
import com.chartboost.sdk.CBLocation;
import com.chartboost.sdk.Chartboost;

/* compiled from: ChartboostParams.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f20487a;

    /* renamed from: b  reason: collision with root package name */
    private String f20488b;

    /* renamed from: c  reason: collision with root package name */
    private String f20489c = CBLocation.LOCATION_DEFAULT;

    /* renamed from: d  reason: collision with root package name */
    private Chartboost.CBFramework f20490d;

    /* renamed from: e  reason: collision with root package name */
    private String f20491e;

    /* renamed from: f  reason: collision with root package name */
    private BannerSize f20492f;

    public String a() {
        return this.f20487a;
    }

    public String b() {
        return this.f20488b;
    }

    public BannerSize c() {
        return this.f20492f;
    }

    public Chartboost.CBFramework d() {
        return this.f20490d;
    }

    public String e() {
        return this.f20491e;
    }

    public String f() {
        return this.f20489c;
    }

    public void g(String str) {
        this.f20487a = str;
    }

    public void h(String str) {
        this.f20488b = str;
    }

    public void i(BannerSize bannerSize) {
        this.f20492f = bannerSize;
    }

    public void j(Chartboost.CBFramework cBFramework) {
        this.f20490d = cBFramework;
    }

    public void k(String str) {
        this.f20491e = str;
    }

    public void l(String str) {
        this.f20489c = str;
    }
}
