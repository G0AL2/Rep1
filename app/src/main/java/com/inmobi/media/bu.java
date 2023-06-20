package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;

/* compiled from: NativeAssetStyle.java */
/* loaded from: classes3.dex */
public class bu {

    /* renamed from: a  reason: collision with root package name */
    public Point f24834a;

    /* renamed from: b  reason: collision with root package name */
    public Point f24835b;

    /* renamed from: c  reason: collision with root package name */
    public Point f24836c;

    /* renamed from: d  reason: collision with root package name */
    public Point f24837d;

    /* renamed from: e  reason: collision with root package name */
    protected String f24838e;

    /* renamed from: f  reason: collision with root package name */
    protected String f24839f;

    /* renamed from: g  reason: collision with root package name */
    protected String f24840g;

    /* renamed from: h  reason: collision with root package name */
    protected float f24841h;

    /* renamed from: i  reason: collision with root package name */
    protected String f24842i;

    /* renamed from: j  reason: collision with root package name */
    protected String f24843j;

    /* renamed from: k  reason: collision with root package name */
    protected cc f24844k;

    public bu() {
        this.f24834a = new Point(0, 0);
        this.f24836c = new Point(0, 0);
        this.f24835b = new Point(0, 0);
        this.f24837d = new Point(0, 0);
        this.f24838e = "none";
        this.f24839f = "straight";
        this.f24841h = 10.0f;
        this.f24842i = "#ff000000";
        this.f24843j = "#00000000";
        this.f24840g = "fill";
        this.f24844k = null;
    }

    public final String a() {
        return this.f24838e;
    }

    public final String b() {
        return this.f24839f;
    }

    public final float c() {
        return this.f24841h;
    }

    public final String d() {
        return this.f24842i.toLowerCase(Locale.US);
    }

    public String e() {
        return this.f24843j.toLowerCase(Locale.US);
    }

    public final String f() {
        return this.f24840g;
    }

    public final cc g() {
        return this.f24844k;
    }

    public bu(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, cc ccVar) {
        this(i10, i11, i12, i13, i14, i15, i16, i17, "fill", str, str2, str3, str4, ccVar);
    }

    public bu(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, String str2, String str3, String str4, String str5, cc ccVar) {
        this.f24834a = new Point(i12, i13);
        this.f24835b = new Point(i16, i17);
        this.f24836c = new Point(i10, i11);
        this.f24837d = new Point(i14, i15);
        this.f24838e = str2;
        this.f24839f = str3;
        this.f24841h = 10.0f;
        this.f24840g = str;
        this.f24842i = str4.length() == 0 ? "#ff000000" : str4;
        this.f24843j = str5.length() == 0 ? "#00000000" : str5;
        this.f24844k = ccVar;
    }
}
