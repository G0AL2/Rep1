package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class n1 {

    /* renamed from: a  reason: collision with root package name */
    private String f14221a;

    /* renamed from: b  reason: collision with root package name */
    private String f14222b;

    /* renamed from: c  reason: collision with root package name */
    private String f14223c;

    /* renamed from: d  reason: collision with root package name */
    private String f14224d;

    /* renamed from: e  reason: collision with root package name */
    private String f14225e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f14226f;

    public n1() {
        this.f14221a = "";
        this.f14222b = "";
        this.f14223c = "";
        this.f14224d = "";
        this.f14226f = new ArrayList();
    }

    public String a() {
        return this.f14222b;
    }

    public String b() {
        return this.f14223c;
    }

    public String c() {
        return this.f14221a;
    }

    public List<String> d() {
        return this.f14226f;
    }

    public String e() {
        return this.f14224d;
    }

    public String f() {
        return this.f14225e;
    }

    public String toString() {
        return "crtype: " + this.f14221a + "\ncgn: " + this.f14223c + "\ntemplate: " + this.f14224d + "\nimptrackers: " + this.f14226f.size() + "\nadId: " + this.f14222b + "\nvideoUrl: " + this.f14225e;
    }

    public n1(String str, String str2, String str3, String str4, List<String> list, String str5) {
        this.f14221a = str;
        this.f14222b = str2;
        this.f14223c = str3;
        this.f14224d = str4;
        this.f14226f = list;
        this.f14225e = str5;
    }
}
