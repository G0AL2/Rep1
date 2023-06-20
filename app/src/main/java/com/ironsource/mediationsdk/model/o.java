package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Placement> f27280a;

    /* renamed from: b  reason: collision with root package name */
    public com.ironsource.sdk.g.d f27281b;

    /* renamed from: c  reason: collision with root package name */
    public int f27282c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27283d;

    /* renamed from: e  reason: collision with root package name */
    public int f27284e;

    /* renamed from: f  reason: collision with root package name */
    public String f27285f;

    /* renamed from: g  reason: collision with root package name */
    public String f27286g;

    /* renamed from: h  reason: collision with root package name */
    public int f27287h;

    /* renamed from: i  reason: collision with root package name */
    public int f27288i;

    /* renamed from: j  reason: collision with root package name */
    public int f27289j;

    /* renamed from: k  reason: collision with root package name */
    public Placement f27290k;

    /* renamed from: l  reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.c f27291l;

    public o() {
        this.f27280a = new ArrayList<>();
        this.f27281b = new com.ironsource.sdk.g.d();
    }

    public o(int i10, boolean z10, int i11, int i12, int i13, com.ironsource.sdk.g.d dVar, com.ironsource.mediationsdk.utils.c cVar, int i14) {
        this.f27280a = new ArrayList<>();
        this.f27282c = i10;
        this.f27283d = z10;
        this.f27284e = i11;
        this.f27287h = i12;
        this.f27281b = dVar;
        this.f27288i = i13;
        this.f27291l = cVar;
        this.f27289j = i14;
    }

    public final Placement a() {
        Iterator<Placement> it = this.f27280a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.f27290k;
    }
}
