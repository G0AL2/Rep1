package com.fyber.inneractive.sdk.response;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public long f20160a;

    /* renamed from: b  reason: collision with root package name */
    public long f20161b;

    /* renamed from: c  reason: collision with root package name */
    public long f20162c;

    /* renamed from: d  reason: collision with root package name */
    public String f20163d;

    /* renamed from: e  reason: collision with root package name */
    public int f20164e;

    /* renamed from: f  reason: collision with root package name */
    public int f20165f;

    /* renamed from: g  reason: collision with root package name */
    public int f20166g;

    /* renamed from: h  reason: collision with root package name */
    public String f20167h;

    /* renamed from: i  reason: collision with root package name */
    public String f20168i;

    /* renamed from: j  reason: collision with root package name */
    public String f20169j;

    /* renamed from: k  reason: collision with root package name */
    public String f20170k;

    /* renamed from: l  reason: collision with root package name */
    public String f20171l;

    /* renamed from: m  reason: collision with root package name */
    public String f20172m;

    /* renamed from: n  reason: collision with root package name */
    public UnitDisplayType f20173n;

    /* renamed from: o  reason: collision with root package name */
    public String f20174o;

    /* renamed from: p  reason: collision with root package name */
    public Map<String, String> f20175p;

    /* renamed from: q  reason: collision with root package name */
    public String f20176q;

    /* renamed from: r  reason: collision with root package name */
    public ImpressionData f20177r;

    /* renamed from: s  reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.g f20178s;

    /* renamed from: v  reason: collision with root package name */
    public String f20181v;

    /* renamed from: x  reason: collision with root package name */
    public Exception f20183x;

    /* renamed from: y  reason: collision with root package name */
    public String f20184y;

    /* renamed from: z  reason: collision with root package name */
    public String f20185z;

    /* renamed from: t  reason: collision with root package name */
    public int f20179t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f20180u = -1.0f;

    /* renamed from: w  reason: collision with root package name */
    public int f20182w = -1;
    public boolean A = false;

    public int a() {
        return this.f20165f;
    }

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest);

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, s sVar);

    public UnitDisplayType b() {
        return this.f20173n;
    }

    public int c() {
        return this.f20164e;
    }

    public boolean d() {
        return this.f20160a < System.currentTimeMillis();
    }
}
