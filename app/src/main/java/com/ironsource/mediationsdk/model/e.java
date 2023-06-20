package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public com.ironsource.sdk.g.d f27225a;

    /* renamed from: b  reason: collision with root package name */
    public long f27226b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<f> f27227c;

    /* renamed from: d  reason: collision with root package name */
    public f f27228d;

    /* renamed from: e  reason: collision with root package name */
    public int f27229e;

    /* renamed from: f  reason: collision with root package name */
    public int f27230f;

    /* renamed from: g  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f27231g;

    /* renamed from: h  reason: collision with root package name */
    private int f27232h;

    public e() {
        this.f27225a = new com.ironsource.sdk.g.d();
        this.f27227c = new ArrayList<>();
    }

    public e(int i10, long j10, com.ironsource.sdk.g.d dVar, int i11, com.ironsource.mediationsdk.utils.c cVar, int i12) {
        this.f27227c = new ArrayList<>();
        this.f27232h = i10;
        this.f27226b = j10;
        this.f27225a = dVar;
        this.f27229e = i11;
        this.f27230f = i12;
        this.f27231g = cVar;
    }

    public final f a() {
        Iterator<f> it = this.f27227c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f27228d;
    }

    public final f a(String str) {
        Iterator<f> it = this.f27227c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
