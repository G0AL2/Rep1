package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<InterstitialPlacement> f27238a;

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.sdk.g.d f27239b;

    /* renamed from: c  reason: collision with root package name */
    public int f27240c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27241d;

    /* renamed from: e  reason: collision with root package name */
    public int f27242e;

    /* renamed from: f  reason: collision with root package name */
    public int f27243f;

    /* renamed from: g  reason: collision with root package name */
    public String f27244g;

    /* renamed from: h  reason: collision with root package name */
    public String f27245h;

    /* renamed from: i  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f27246i;

    /* renamed from: j  reason: collision with root package name */
    public InterstitialPlacement f27247j;

    public h() {
        this.f27238a = new ArrayList<>();
        this.f27239b = new com.ironsource.sdk.g.d();
    }

    public h(int i10, boolean z10, int i11, com.ironsource.sdk.g.d dVar, com.ironsource.mediationsdk.utils.c cVar, int i12) {
        this.f27238a = new ArrayList<>();
        this.f27240c = i10;
        this.f27241d = z10;
        this.f27242e = i11;
        this.f27239b = dVar;
        this.f27246i = cVar;
        this.f27243f = i12;
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.f27238a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f27247j;
    }
}
