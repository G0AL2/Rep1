package com.chartboost.sdk.Tracking;

import com.chartboost.sdk.impl.w2;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private String f13767a;

    /* renamed from: b  reason: collision with root package name */
    private String f13768b;

    /* renamed from: c  reason: collision with root package name */
    private long f13769c;

    /* renamed from: d  reason: collision with root package name */
    private float f13770d;

    /* renamed from: e  reason: collision with root package name */
    private a f13771e;

    /* renamed from: f  reason: collision with root package name */
    private w2 f13772f;

    /* renamed from: g  reason: collision with root package name */
    private String f13773g;

    /* renamed from: h  reason: collision with root package name */
    private String f13774h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13775i;

    /* loaded from: classes.dex */
    public enum a {
        INFO,
        CRITICAL,
        ERROR
    }

    public d(String str, String str2, String str3, String str4) {
        a(str, str2, str3, str4);
    }

    private void a(String str, String str2, String str3, String str4) {
        d(str);
        c(str2);
        a(0.0f);
        a(str3);
        b(str4);
        this.f13769c = System.currentTimeMillis();
        this.f13775i = false;
        a(new w2("", "", "", "", ""));
    }

    public void b(String str) {
        this.f13774h = str;
    }

    public void c(String str) {
        this.f13768b = str;
    }

    public void d(String str) {
        this.f13767a = str;
    }

    public String e() {
        return this.f13768b;
    }

    public String f() {
        return this.f13767a;
    }

    public long g() {
        return this.f13769c;
    }

    public long h() {
        return this.f13769c / 1000;
    }

    public w2 i() {
        return this.f13772f;
    }

    public a j() {
        return this.f13771e;
    }

    public String toString() {
        return "TrackingEvent{mName='" + this.f13767a + "', mMessage='" + this.f13768b + "', mTimestamp=" + this.f13769c + ", mLatency=" + this.f13770d + ", mType=" + this.f13771e + ", trackAd=" + this.f13772f + ", impressionAdType=" + this.f13773g + ", location=" + this.f13774h + '}';
    }

    public boolean b() {
        return this.f13775i;
    }

    public float c() {
        return this.f13770d;
    }

    public String d() {
        return this.f13774h;
    }

    public void a(float f10) {
        this.f13770d = f10;
    }

    public void a(a aVar) {
        this.f13771e = aVar;
    }

    public void a(w2 w2Var) {
        this.f13772f = w2Var;
    }

    public String a() {
        return this.f13773g;
    }

    public void a(String str) {
        this.f13773g = str;
    }

    public void a(boolean z10) {
        this.f13775i = z10;
    }
}
