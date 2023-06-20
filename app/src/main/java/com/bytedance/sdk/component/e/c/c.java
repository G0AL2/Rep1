package com.bytedance.sdk.component.e.c;

import java.util.Map;

/* compiled from: TNCConfig.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10344a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10345b = true;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Integer> f10346c = null;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f10347d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f10348e = 10;

    /* renamed from: f  reason: collision with root package name */
    public int f10349f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f10350g = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f10351h = 10;

    /* renamed from: i  reason: collision with root package name */
    public int f10352i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f10353j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f10354k = 900;

    /* renamed from: l  reason: collision with root package name */
    public int f10355l = 120;

    /* renamed from: m  reason: collision with root package name */
    public String f10356m = null;

    /* renamed from: n  reason: collision with root package name */
    public int f10357n = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f10358o = 0;

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" localEnable: ");
        sb2.append(this.f10344a);
        sb2.append(" probeEnable: ");
        sb2.append(this.f10345b);
        sb2.append(" hostFilter: ");
        Map<String, Integer> map = this.f10346c;
        sb2.append(map != null ? map.size() : 0);
        sb2.append(" hostMap: ");
        Map<String, String> map2 = this.f10347d;
        sb2.append(map2 != null ? map2.size() : 0);
        sb2.append(" reqTo: ");
        sb2.append(this.f10348e);
        sb2.append("#");
        sb2.append(this.f10349f);
        sb2.append("#");
        sb2.append(this.f10350g);
        sb2.append(" reqErr: ");
        sb2.append(this.f10351h);
        sb2.append("#");
        sb2.append(this.f10352i);
        sb2.append("#");
        sb2.append(this.f10353j);
        sb2.append(" updateInterval: ");
        sb2.append(this.f10354k);
        sb2.append(" updateRandom: ");
        sb2.append(this.f10355l);
        sb2.append(" httpBlack: ");
        sb2.append(this.f10356m);
        return sb2.toString();
    }
}
