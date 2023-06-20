package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class n implements Comparable<n> {

    /* renamed from: a  reason: collision with root package name */
    final int f14205a;

    /* renamed from: b  reason: collision with root package name */
    final String f14206b;

    /* renamed from: c  reason: collision with root package name */
    int f14207c;

    /* renamed from: j  reason: collision with root package name */
    Integer f14214j;

    /* renamed from: k  reason: collision with root package name */
    Integer f14215k;

    /* renamed from: l  reason: collision with root package name */
    Integer f14216l;

    /* renamed from: e  reason: collision with root package name */
    boolean f14209e = false;

    /* renamed from: d  reason: collision with root package name */
    com.chartboost.sdk.Model.a f14208d = null;

    /* renamed from: f  reason: collision with root package name */
    int f14210f = 3;

    /* renamed from: g  reason: collision with root package name */
    Long f14211g = null;

    /* renamed from: h  reason: collision with root package name */
    Long f14212h = null;

    /* renamed from: i  reason: collision with root package name */
    Integer f14213i = null;

    /* renamed from: m  reason: collision with root package name */
    boolean f14217m = false;

    /* renamed from: n  reason: collision with root package name */
    boolean f14218n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(int i10, String str, int i11) {
        this.f14205a = i10;
        this.f14206b = str;
        this.f14207c = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(n nVar) {
        return this.f14205a - nVar.f14205a;
    }
}
